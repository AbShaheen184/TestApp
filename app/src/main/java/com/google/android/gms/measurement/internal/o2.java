package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ AtomicReference y;
    public final /* synthetic */ v2 z;

    public o2(v2 v2Var, AtomicReference atomicReference, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = atomicReference;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
            case 2:
                this.y = atomicReference;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
            case 3:
                this.y = atomicReference;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
            case 4:
                this.y = atomicReference;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
            default:
                this.y = atomicReference;
                Objects.requireNonNull(v2Var);
                this.z = v2Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.y;
        synchronized (atomicReference) {
            try {
                try {
                    s1 s1Var = (s1) this.z.e;
                    atomicReference.set(Double.valueOf(s1Var.A.F(s1Var.r().B(), h0.e0)));
                    this.y.notify();
                } catch (Throwable th) {
                    this.y.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                AtomicReference atomicReference = this.y;
                synchronized (atomicReference) {
                    try {
                        try {
                            s1 s1Var = (s1) this.z.e;
                            atomicReference.set(Boolean.valueOf(s1Var.A.G(s1Var.r().B(), h0.a0)));
                            this.y.notify();
                        } catch (Throwable th) {
                            this.y.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            s1 s1Var2 = (s1) this.z.e;
                            atomicReference2.set(s1Var2.A.C(s1Var2.r().B(), h0.b0));
                            this.y.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.y.notify();
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.y;
                synchronized (atomicReference3) {
                    try {
                        try {
                            s1 s1Var3 = (s1) this.z.e;
                            atomicReference3.set(Long.valueOf(s1Var3.A.D(s1Var3.r().B(), h0.c0)));
                            this.y.notify();
                        } catch (Throwable th5) {
                            this.y.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.y;
                synchronized (atomicReference4) {
                    try {
                        try {
                            s1 s1Var4 = (s1) this.z.e;
                            atomicReference4.set(Integer.valueOf(s1Var4.A.E(s1Var4.r().B(), h0.d0)));
                            this.y.notify();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        this.y.notify();
                        throw th8;
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                v2 v2Var = this.z;
                g1 g1Var = ((s1) v2Var.e).B;
                s1.k(g1Var);
                Bundle bundleH = g1Var.K.H();
                o3 o3VarP = ((s1) v2Var.e).p();
                AtomicReference atomicReference5 = this.y;
                o3VarP.v();
                o3VarP.w();
                o3VarP.J(new androidx.appcompat.view.menu.e(o3VarP, atomicReference5, o3VarP.L(false), bundleH, 8, false));
                return;
            default:
                o3 o3VarP2 = ((s1) this.z.e).p();
                e4 e4VarD = e4.d(b3.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.y;
                o3VarP2.v();
                o3VarP2.w();
                o3VarP2.J(new androidx.appcompat.view.menu.e(o3VarP2, atomicReference6, o3VarP2.L(false), e4VarD, 9, false));
                return;
        }
    }

    public /* synthetic */ o2(v2 v2Var, AtomicReference atomicReference, int i, boolean z) {
        this.e = i;
        this.z = v2Var;
        this.y = atomicReference;
    }
}
