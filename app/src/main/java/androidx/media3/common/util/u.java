package androidx.media3.common.util;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static u f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public u(Context context) {
        Executor executorH = c.h();
        this.a = executorH;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorH.execute(new androidx.activity.c(5, this, context));
    }

    public static synchronized u a(Context context) {
        try {
            if (f == null) {
                f = new u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<s> copyOnWriteArrayList = this.b;
        for (s sVar : copyOnWriteArrayList) {
            if (sVar.a.get() == null) {
                copyOnWriteArrayList.remove(sVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (s sVar2 : this.b) {
                    sVar2.b.execute(new androidx.activity.l(sVar2, 12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
