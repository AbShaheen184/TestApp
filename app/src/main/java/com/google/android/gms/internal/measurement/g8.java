package com.google.android.gms.internal.measurement;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g8 extends i1 {
    private static final g8 zzp;
    private static volatile h2 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private z1 zzm;
    private z1 zzn;
    private String zzo;

    static {
        g8 g8Var = new g8();
        zzp = g8Var;
        i1.p(g8.class, g8Var);
    }

    public g8() {
        z1 z1Var = z1.y;
        this.zzm = z1Var;
        this.zzn = z1Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static d8 Z() {
        return (d8) zzp.k();
    }

    public static g8 a0() {
        return zzp;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void B() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final z1 D() {
        z1 z1Var = this.zzm;
        if (!z1Var.e) {
            this.zzm = z1Var.a();
        }
        return this.zzm;
    }

    public final z1 E() {
        z1 z1Var = this.zzn;
        if (!z1Var.e) {
            this.zzn = z1Var.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= LibretroCore.SCREEN_WIDTH;
        this.zzo = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 4) != 0;
    }

    public final String M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final long O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zzb & 16) != 0;
    }

    public final String Q() {
        return this.zzi;
    }

    public final boolean R() {
        return (this.zzb & 32) != 0;
    }

    public final String S() {
        return this.zzj;
    }

    public final boolean T() {
        return (this.zzb & 64) != 0;
    }

    public final String U() {
        return this.zzk;
    }

    public final boolean V() {
        return (this.zzb & 128) != 0;
    }

    public final long W() {
        return this.zzl;
    }

    public final boolean X() {
        return (this.zzb & LibretroCore.SCREEN_WIDTH) != 0;
    }

    public final String Y() {
        return this.zzo;
    }

    public final /* synthetic */ void b0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void c0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void d0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void e0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void f0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", e8.a, "zzn", f8.a, "zzo"});
        }
        if (i2 == 3) {
            return new g8();
        }
        if (i2 == 4) {
            return new d8(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzq;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (g8.class) {
            try {
                h1Var = zzq;
                if (h1Var == null) {
                    h1Var = new h1(zzp);
                    zzq = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void x() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void z() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }
}
