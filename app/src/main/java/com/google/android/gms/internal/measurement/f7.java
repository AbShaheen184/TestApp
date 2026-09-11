package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 extends i1 {
    private static final f7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private int zze;
    private r1 zzf;
    private r1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        f7 f7Var = new f7();
        zzj = f7Var;
        i1.p(f7.class, f7Var);
    }

    public f7() {
        k2 k2Var = k2.B;
        this.zzf = k2Var;
        this.zzg = k2Var;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final h7 B(int i) {
        return (h7) this.zzg.get(i);
    }

    public final void C(int i, n7 n7Var) {
        r1 r1Var = this.zzf;
        if (!((n0) r1Var).e) {
            this.zzf = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzf.set(i, n7Var);
    }

    public final void D(int i, h7 h7Var) {
        r1 r1Var = this.zzg;
        if (!((n0) r1Var).e) {
            this.zzg = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzg.set(i, h7Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", n7.class, "zzg", h7.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new f7();
        }
        if (i2 == 4) {
            return new e7(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (f7.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final List w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzf.size();
    }

    public final n7 y(int i) {
        return (n7) this.zzf.get(i);
    }

    public final r1 z() {
        return this.zzg;
    }
}
