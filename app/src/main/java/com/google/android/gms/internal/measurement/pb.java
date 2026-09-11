package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class pb extends i1 {
    private static final n1 zzl = new f1(14);
    private static final pb zzq;
    private static volatile h2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private r1 zzi;
    private r1 zzj;
    private m1 zzk;
    private rb zzm;
    private boolean zzn;
    private boolean zzo;
    private nb zzp;
    private t0 zze = t0.y;
    private String zzg = "";

    static {
        pb pbVar = new pb();
        zzq = pbVar;
        i1.p(pb.class, pbVar);
    }

    public pb() {
        k2 k2Var = k2.B;
        this.zzi = k2Var;
        this.zzj = k2Var;
        this.zzk = j1.B;
    }

    public static ob H() {
        return (ob) zzq.k();
    }

    public static pb I() {
        return zzq;
    }

    public final r1 A() {
        return this.zzj;
    }

    public final List B() {
        return new o1(this.zzk, zzl);
    }

    public final boolean C() {
        return (this.zzb & 16) != 0;
    }

    public final rb D() {
        rb rbVar = this.zzm;
        return rbVar == null ? rb.w() : rbVar;
    }

    public final boolean E() {
        return this.zzn;
    }

    public final boolean F() {
        return this.zzo;
    }

    public final nb G() {
        nb nbVar = this.zzp;
        return nbVar == null ? nb.v() : nbVar;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", j0.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new pb();
        }
        if (i2 == 4) {
            return new ob(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzr;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (pb.class) {
            try {
                h1Var = zzr;
                if (h1Var == null) {
                    h1Var = new h1(zzq);
                    zzr = h1Var;
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

    public final t0 v() {
        return this.zze;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final long y() {
        return this.zzh;
    }

    public final r1 z() {
        return this.zzi;
    }
}
