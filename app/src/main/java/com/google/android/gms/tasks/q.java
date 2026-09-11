package com.google.android.gms.tasks;

import androidx.compose.foundation.text.selection.q0;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends i {
    public final Object a = new Object();
    public final q0 b = new q0();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.i
    public final q a(Executor executor, d dVar) {
        this.b.h(new n(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.i
    public final q b(Executor executor, e eVar) {
        this.b.h(new n(executor, eVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.i
    public final q c(Executor executor, f fVar) {
        this.b.h(new n(executor, fVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.i
    public final q d(Executor executor, b bVar) {
        q qVar = new q();
        this.b.h(new m(executor, bVar, qVar, 1));
        p();
        return qVar;
    }

    @Override // com.google.android.gms.tasks.i
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.i
    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                x.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new g(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.i
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.i
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.i
    public final q i(Executor executor, h hVar) {
        q qVar = new q();
        this.b.h(new n(executor, hVar, qVar));
        p();
        return qVar;
    }

    public final q j(Executor executor, b bVar) {
        q qVar = new q();
        this.b.h(new m(executor, bVar, qVar, 0));
        p();
        return qVar;
    }

    public final void k(Object obj) {
        synchronized (this.a) {
            o();
            this.c = true;
            this.e = obj;
        }
        this.b.i(this);
    }

    public final boolean l(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.i(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(Exception exc) {
        x.h(exc, "Exception must not be null");
        synchronized (this.a) {
            o();
            this.c = true;
            this.f = exc;
        }
        this.b.i(this);
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.i(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        String strConcat;
        if (this.c) {
            if (!g()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excE = e();
            if (excE != null) {
                strConcat = "failure";
            } else if (h()) {
                strConcat = "result ".concat(String.valueOf(f()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
