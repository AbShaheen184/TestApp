package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.android.material.resources.b {
    @Override // com.google.android.material.resources.b
    public final boolean c(r rVar, f fVar, f fVar2) {
        synchronized (rVar) {
            try {
                if (rVar.y != fVar) {
                    return false;
                }
                rVar.y = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.material.resources.b
    public final boolean d(r rVar, Object obj, Object obj2) {
        synchronized (rVar) {
            try {
                if (rVar.e != obj) {
                    return false;
                }
                rVar.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.material.resources.b
    public final boolean e(r rVar, q qVar, q qVar2) {
        synchronized (rVar) {
            try {
                if (rVar.z != qVar) {
                    return false;
                }
                rVar.z = qVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.material.resources.b
    public final f j(r rVar) {
        f fVar;
        f fVar2 = f.d;
        synchronized (rVar) {
            try {
                fVar = rVar.y;
                if (fVar != fVar2) {
                    rVar.y = fVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // com.google.android.material.resources.b
    public final q k(r rVar) {
        q qVar;
        q qVar2 = q.c;
        synchronized (rVar) {
            try {
                qVar = rVar.z;
                if (qVar != qVar2) {
                    rVar.z = qVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // com.google.android.material.resources.b
    public final void r(q qVar, q qVar2) {
        qVar.b = qVar2;
    }

    @Override // com.google.android.material.resources.b
    public final void s(q qVar, Thread thread) {
        qVar.a = thread;
    }
}
