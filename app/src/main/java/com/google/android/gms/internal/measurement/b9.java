package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends i1 {
    private static final b9 zzaw;
    private static volatile h2 zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private r1 zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private c9 zzR;
    private m1 zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private x8 zzab;
    private String zzac;
    private r1 zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private j8 zzam;
    private int zzan;
    private g8 zzao;
    private String zzap;
    private i9 zzaq;
    private long zzar;
    private String zzas;
    private p8 zzat;
    private String zzau;
    private r1 zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private r1 zzg;
    private r1 zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        b9 b9Var = new b9();
        zzaw = b9Var;
        i1.p(b9.class, b9Var);
    }

    public b9() {
        k2 k2Var = k2.B;
        this.zzg = k2Var;
        this.zzh = k2Var;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = k2Var;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = j1.B;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = k2Var;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = k2Var;
    }

    public static a9 Z() {
        return (a9) zzaw.k();
    }

    public static a9 a0(b9 b9Var) {
        g1 g1VarK = zzaw.k();
        g1VarK.e(b9Var);
        return (a9) g1VarK;
    }

    public final String A() {
        return this.zzx;
    }

    public final boolean A0() {
        return (this.zze & 8192) != 0;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    public final boolean B() {
        return (this.zzb & 131072) != 0;
    }

    public final String B0() {
        return this.zzac;
    }

    public final /* synthetic */ void B1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final boolean C() {
        return this.zzy;
    }

    public final boolean C0() {
        return (this.zze & 32768) != 0;
    }

    public final /* synthetic */ void C1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    public final String D() {
        return this.zzz;
    }

    public final long D0() {
        return this.zzaf;
    }

    public final /* synthetic */ void D1(String str) {
        str.getClass();
        this.zzb |= Parser.ARGC_LIMIT;
        this.zzx = str;
    }

    public final boolean E() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean E0() {
        return this.zzag;
    }

    public final /* synthetic */ void E1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long F() {
        return this.zzA;
    }

    public final boolean F0() {
        return (this.zze & 131072) != 0;
    }

    public final /* synthetic */ void F1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final boolean G() {
        return (this.zzb & 1048576) != 0;
    }

    public final String G0() {
        return this.zzah;
    }

    public final /* synthetic */ void G1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int H() {
        return this.zzB;
    }

    public final boolean H0() {
        return (this.zze & 262144) != 0;
    }

    public final /* synthetic */ void H1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String I() {
        return this.zzC;
    }

    public final boolean I0() {
        return this.zzai;
    }

    public final /* synthetic */ void I1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String J() {
        return this.zzD;
    }

    public final boolean J0() {
        return (this.zze & 524288) != 0;
    }

    public final /* synthetic */ void J1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean K() {
        return (this.zzb & 8388608) != 0;
    }

    public final String K0() {
        return this.zzaj;
    }

    public final /* synthetic */ void K1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    public final boolean L() {
        return this.zzE;
    }

    public final int L0() {
        return this.zzak;
    }

    public final /* synthetic */ void L1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final r1 M() {
        return this.zzF;
    }

    public final boolean M0() {
        return (this.zze & 4194304) != 0;
    }

    public final /* synthetic */ void M1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String N() {
        return this.zzG;
    }

    public final j8 N0() {
        j8 j8Var = this.zzam;
        return j8Var == null ? j8.C() : j8Var;
    }

    public final /* synthetic */ void N1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean O() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean O0() {
        return (this.zze & 8388608) != 0;
    }

    public final /* synthetic */ void O1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int P() {
        return this.zzH;
    }

    public final int P0() {
        return this.zzan;
    }

    public final void P1(ArrayList arrayList) {
        r1 r1Var = this.zzF;
        if (!((n0) r1Var).e) {
            this.zzF = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(arrayList, this.zzF);
    }

    public final boolean Q() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean Q0() {
        return (this.zze & 16777216) != 0;
    }

    public final void Q1() {
        this.zzF = k2.B;
    }

    public final long R() {
        return this.zzL;
    }

    public final g8 R0() {
        g8 g8Var = this.zzao;
        return g8Var == null ? g8.a0() : g8Var;
    }

    public final /* synthetic */ void R1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean S() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean S0() {
        return (this.zze & 67108864) != 0;
    }

    public final /* synthetic */ void S1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final String T() {
        return this.zzN;
    }

    public final i9 T0() {
        i9 i9Var = this.zzaq;
        return i9Var == null ? i9.w() : i9Var;
    }

    public final /* synthetic */ void T1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean U() {
        return (this.zzb & 1) != 0;
    }

    public final int U0() {
        return this.zzf;
    }

    public final List U1() {
        return this.zzg;
    }

    public final boolean V() {
        return (this.zze & 134217728) != 0;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void V1() {
        r1 r1Var = this.zzg;
        if (((n0) r1Var).e) {
            return;
        }
        this.zzg = com.google.android.datatransport.runtime.backends.c.q(r1Var);
    }

    public final long W() {
        return this.zzar;
    }

    public final /* synthetic */ void W0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void W1() {
        r1 r1Var = this.zzh;
        if (((n0) r1Var).e) {
            return;
        }
        this.zzh = com.google.android.datatransport.runtime.backends.c.q(r1Var);
    }

    public final boolean X() {
        return (this.zze & 536870912) != 0;
    }

    public final /* synthetic */ void X0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void X1(List list) {
        r1 r1Var = this.zzav;
        if (!((n0) r1Var).e) {
            this.zzav = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(list, this.zzav);
    }

    public final p8 Y() {
        p8 p8Var = this.zzat;
        return p8Var == null ? p8.w() : p8Var;
    }

    public final /* synthetic */ void Y0(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int Y1() {
        return this.zzg.size();
    }

    public final void Z0(List list) {
        RandomAccess randomAccess = this.zzS;
        if (!((n0) randomAccess).e) {
            j1 j1Var = (j1) randomAccess;
            int i = j1Var.z;
            this.zzS = j1Var.L(i + i);
        }
        m0.d(list, this.zzS);
    }

    public final t8 Z1(int i) {
        return (t8) this.zzg.get(i);
    }

    public final /* synthetic */ void a1(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final r1 a2() {
        return this.zzh;
    }

    public final /* synthetic */ void b0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void b1(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int b2() {
        return this.zzh.size();
    }

    public final /* synthetic */ void c0(int i, t8 t8Var) {
        V1();
        this.zzg.set(i, t8Var);
    }

    public final /* synthetic */ void c1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    public final k9 c2(int i) {
        return (k9) this.zzh.get(i);
    }

    public final /* synthetic */ void d0(t8 t8Var) {
        V1();
        this.zzg.add(t8Var);
    }

    public final /* synthetic */ void d1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean d2() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void e0(Iterable iterable) {
        V1();
        m0.d(iterable, this.zzg);
    }

    public final /* synthetic */ void e1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long e2() {
        return this.zzi;
    }

    public final void f0() {
        this.zzg = k2.B;
    }

    public final void f1(Set set) {
        r1 r1Var = this.zzad;
        if (!((n0) r1Var).e) {
            this.zzad = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(set, this.zzad);
    }

    public final boolean f2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void g0(int i) {
        V1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long g2() {
        return this.zzj;
    }

    public final /* synthetic */ void h0(int i, k9 k9Var) {
        W1();
        this.zzh.set(i, k9Var);
    }

    public final /* synthetic */ void h1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    public final boolean h2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void i0(k9 k9Var) {
        W1();
        this.zzh.add(k9Var);
    }

    public final /* synthetic */ void i1(boolean z) {
        this.zze |= Parser.ARGC_LIMIT;
        this.zzag = z;
    }

    public final long i2() {
        return this.zzk;
    }

    public final /* synthetic */ void j0(int i) {
        W1();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void j1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean j2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void k1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long k2() {
        return this.zzl;
    }

    public final /* synthetic */ void l0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void l1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean l2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void m1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    public final long m2() {
        return this.zzm;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void n1(j8 j8Var) {
        this.zzam = j8Var;
        this.zze |= 4194304;
    }

    public final String n2() {
        return this.zzn;
    }

    public final /* synthetic */ void o0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void o1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String o2() {
        return this.zzo;
    }

    public final /* synthetic */ void p0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void p1(g8 g8Var) {
        this.zzao = g8Var;
        this.zze |= 16777216;
    }

    public final String p2() {
        return this.zzp;
    }

    public final /* synthetic */ void q0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void q1(i9 i9Var) {
        this.zzaq = i9Var;
        this.zze |= 67108864;
    }

    public final String q2() {
        return this.zzq;
    }

    public final /* synthetic */ void r0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void r1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean r2() {
        return (this.zzb & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
    }

    public final /* synthetic */ void s0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    public final /* synthetic */ void s1(p8 p8Var) {
        this.zzat = p8Var;
        this.zze |= 536870912;
    }

    public final int s2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", t8.class, "zzh", k9.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", l8.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", j0.h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", d7.class});
        }
        if (i2 == 3) {
            return new b9();
        }
        if (i2 == 4) {
            return new a9(zzaw);
        }
        if (i2 == 5) {
            return zzaw;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzax;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (b9.class) {
            try {
                h1Var = zzax;
                if (h1Var == null) {
                    h1Var = new h1(zzaw);
                    zzax = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final /* synthetic */ void t0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String t2() {
        return this.zzs;
    }

    public final String u() {
        return this.zzt;
    }

    public final boolean u0() {
        return (this.zze & 2) != 0;
    }

    public final /* synthetic */ void u1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= LibretroCore.SCREEN_WIDTH;
        this.zzp = str;
    }

    public final String v() {
        return this.zzu;
    }

    public final int v0() {
        return this.zzP;
    }

    public final /* synthetic */ void v1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean w() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean w0() {
        return (this.zze & 16) != 0;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final long x() {
        return this.zzv;
    }

    public final long x0() {
        return this.zzT;
    }

    public final /* synthetic */ void x1(int i) {
        this.zzb |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.zzr = i;
    }

    public final boolean y() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean y0() {
        return (this.zze & 128) != 0;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    public final long z() {
        return this.zzw;
    }

    public final String z0() {
        return this.zzW;
    }

    public final /* synthetic */ void z1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }
}
