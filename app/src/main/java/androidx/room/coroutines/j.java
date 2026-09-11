package androidx.room.coroutines;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements androidx.sqlite.a, Mutex {
    public Throwable A;
    public final i B;
    public final androidx.sqlite.a e;
    public final Mutex y;
    public kotlin.coroutines.i z;

    public j(androidx.sqlite.a aVar) {
        Mutex mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        aVar.getClass();
        mutexMutex$default.getClass();
        this.e = aVar;
        this.y = mutexMutex$default;
        this.B = new i(this);
    }

    @Override // androidx.sqlite.a
    public final boolean H() {
        return this.e.H();
    }

    @Override // androidx.sqlite.a
    public final androidx.sqlite.c U(String str) {
        str.getClass();
        i iVar = this.B;
        if (iVar == null) {
            return this.e.U(str);
        }
        Object objH = iVar.h(str);
        objH.getClass();
        return new h((androidx.sqlite.c) objH);
    }

    public final void a(StringBuilder sb) {
        int i;
        if (this.z == null && this.A == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            kotlin.coroutines.i iVar = this.z;
            if (iVar != null) {
                sb.append("\t\tCoroutine: " + iVar);
                sb.append('\n');
            }
            Throwable th = this.A;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                Iterator it = kotlin.collections.o.H(kotlin.text.k.g0(string)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.B != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            i iVar2 = this.B;
            synchronized (((com.google.android.material.shape.g) iVar2.g)) {
                i = iVar2.c;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        i iVar = this.B;
        if (iVar != null) {
            iVar.n(-1);
        }
        this.e.close();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final SelectClause2 getOnLock() {
        return this.y.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean holdsLock(Object obj) {
        obj.getClass();
        return this.y.holdsLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return this.y.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object lock(Object obj, kotlin.coroutines.d dVar) {
        return this.y.lock(obj, dVar);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        return this.y.tryLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        this.y.unlock(obj);
    }
}
