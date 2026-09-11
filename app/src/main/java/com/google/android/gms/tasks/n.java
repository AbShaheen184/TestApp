package com.google.android.gms.tasks;

import androidx.appcompat.widget.z0;
import com.google.common.util.concurrent.l0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o, f, e, c {
    public final Object A;
    public final /* synthetic */ int e;
    public final Executor y;
    public final Object z;

    public n(Executor executor, c cVar) {
        this.e = 0;
        this.z = new Object();
        this.y = executor;
        this.A = cVar;
    }

    @Override // com.google.android.gms.tasks.o
    public final void a(i iVar) {
        switch (this.e) {
            case 0:
                if (((q) iVar).d) {
                    synchronized (this.z) {
                        try {
                            if (((c) this.A) != null) {
                                this.y.execute(new z0(this, 26));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.z) {
                    break;
                }
                this.y.execute(new l0(25, this, iVar, false));
                return;
            case 2:
                if (iVar.h() || ((q) iVar).d) {
                    return;
                }
                synchronized (this.z) {
                    try {
                        if (((e) this.A) != null) {
                            this.y.execute(new l0(26, this, iVar, false));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                if (iVar.h()) {
                    synchronized (this.z) {
                        try {
                            if (((f) this.A) != null) {
                                this.y.execute(new l0(27, this, iVar, false));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                this.y.execute(new l0(28, this, iVar, false));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((q) this.A).k(obj);
    }

    @Override // com.google.android.gms.tasks.c
    public void l() {
        ((q) this.A).n();
    }

    @Override // com.google.android.gms.tasks.e
    public void z(Exception exc) {
        ((q) this.A).m(exc);
    }

    public n(Executor executor, d dVar) {
        this.e = 1;
        this.z = new Object();
        this.y = executor;
        this.A = dVar;
    }

    public n(Executor executor, e eVar) {
        this.e = 2;
        this.z = new Object();
        this.y = executor;
        this.A = eVar;
    }

    public n(Executor executor, f fVar) {
        this.e = 3;
        this.z = new Object();
        this.y = executor;
        this.A = fVar;
    }

    public n(Executor executor, h hVar, q qVar) {
        this.e = 4;
        this.y = executor;
        this.z = hVar;
        this.A = qVar;
    }
}
