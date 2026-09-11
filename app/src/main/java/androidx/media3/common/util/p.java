package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final Thread a;
    public final g0 b;
    public final n c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, e0 e0Var, n nVar, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = nVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || e0Var == null || nVar == null) {
            this.b = null;
        } else {
            this.b = e0Var.a(looper, new l(this, 0));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new o(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.i) {
            com.google.android.material.motion.a.q(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            g0 g0Var = this.b;
            g0Var.getClass();
            Handler handler = g0Var.a;
            if (!handler.hasMessages(1)) {
                f0 f0VarA = g0Var.a(1);
                Message message = f0VarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                f0VarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, m mVar) {
        if (this.i) {
            com.google.android.material.motion.a.q(Thread.currentThread() == this.a);
        }
        this.f.add(new androidx.activity.n(new CopyOnWriteArraySet(this.d), i, mVar, 2));
    }

    public final void d() {
        if (this.i) {
            com.google.android.material.motion.a.q(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        for (o oVar : this.d) {
            n nVar = this.c;
            oVar.d = true;
            if (nVar != null && oVar.c) {
                oVar.c = false;
                nVar.c(oVar.a, oVar.b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i, m mVar) {
        c(i, mVar);
        b();
    }

    public p(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
