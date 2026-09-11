package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements c2, com.google.android.gms.common.api.internal.h, com.google.common.base.t, com.google.android.gms.tasks.b, n1 {
    public final /* synthetic */ int e;
    public static final f1 y = new f1(0);
    public static final f1 z = new f1(2);
    public static final f1 A = new f1(3);
    public static final /* synthetic */ f1 B = new f1(10);
    public static final /* synthetic */ f1 C = new f1(12);
    public static final /* synthetic */ f1 D = new f1(16);

    public /* synthetic */ f1(int i) {
        this.e = i;
    }

    public static final r1 c(long j, Object obj) {
        r1 r1Var = (r1) x2.i(j, obj);
        if (((n0) r1Var).e) {
            return r1Var;
        }
        int size = r1Var.size();
        r1 r1VarL = r1Var.L(size == 0 ? 10 : size + size);
        x2.j(j, obj, r1VarL);
        return r1VarL;
    }

    public static jf e(String str) {
        boolean z2;
        qf qfVarM;
        mf mfVar = lf.e;
        pf pfVarC = bf.c();
        qf qfVar = pfVarC.b;
        if (qfVar == hf.D) {
            qfVar = null;
            bf.b(pfVarC, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (qfVar == null) {
            UUID uuidB = cf.c.b();
            String strA = we.a(uuidB);
            androidx.compose.runtime.snapshots.g gVar = ff.D;
            com.google.common.collect.k0 k0Var = (com.google.common.collect.k0) bf.a.get();
            if (!k0Var.isEmpty()) {
                k0Var.forEach(new ef(1));
            }
            qfVarM = new gf(uuidB, strA, str, mfVar, gVar, pfVarC);
        } else {
            qfVarM = qfVar instanceof ye ? ((ye) qfVar).M(str, mfVar, false, pfVarC) : qfVar.T(str, mfVar, pfVarC);
        }
        bf.b(pfVarC, qfVarM);
        return new jf(qfVarM, z2);
    }

    public static final z1 f(Object obj, Object obj2) {
        z1 z1VarA = (z1) obj;
        z1 z1Var = (z1) obj2;
        if (!z1Var.isEmpty()) {
            if (!z1VarA.e) {
                z1VarA = z1VarA.a();
            }
            z1VarA.c();
            if (!z1Var.isEmpty()) {
                z1VarA.putAll(z1Var);
            }
        }
        return z1VarA;
    }

    public static /* bridge */ s2 g(Object obj) {
        i1 i1Var = (i1) obj;
        s2 s2Var = i1Var.zzc;
        if (s2Var != s2.f) {
            return s2Var;
        }
        s2 s2VarA = s2.a();
        i1Var.zzc = s2VarA;
        return s2VarA;
    }

    public static boolean h(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws t1 {
        w0 w0Var = (w0) wVar.e;
        int i2 = wVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            wVar.o0(0);
            ((s2) obj).d(i3 << 3, Long.valueOf(w0Var.r()));
            return true;
        }
        if (i4 == 1) {
            wVar.o0(1);
            ((s2) obj).d((i3 << 3) | 1, Long.valueOf(w0Var.t()));
            return true;
        }
        if (i4 == 2) {
            ((s2) obj).d((i3 << 3) | 2, wVar.w0());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                androidx.transition.k.q("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                androidx.transition.k.p();
                return false;
            }
            wVar.o0(5);
            ((s2) obj).d(5 | (i3 << 3), Integer.valueOf(w0Var.u()));
            return true;
        }
        s2 s2VarA = s2.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            androidx.transition.k.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (wVar.v0() != Integer.MAX_VALUE && h(i6, wVar, s2VarA)) {
        }
        if ((i5 | 4) != wVar.b) {
            androidx.transition.k.q("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (s2VarA.e) {
            s2VarA.e = false;
        }
        ((s2) obj).d(i5 | 3, s2VarA);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public boolean a(Class cls) {
        switch (this.e) {
            case 0:
                return i1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = z9.j;
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public l2 b(Class cls) {
        switch (this.e) {
            case 0:
                if (i1.class.isAssignableFrom(cls)) {
                    try {
                        return (l2) i1.o(cls.asSubclass(i1.class)).t(3);
                    } catch (Exception e) {
                        androidx.media3.exoplayer.hls.playlist.a.j("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    net.luminis.tls.engine.impl.c.o("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        i1 i1VarD;
        q9 q9Var = (q9) iVar.f();
        ya yaVarA = za.A();
        String str = q9Var.e;
        yaVarA.b();
        ((za) yaVarA.y).B(str);
        String str2 = q9Var.z;
        yaVarA.b();
        ((za) yaVarA.y).D(str2);
        boolean z2 = q9Var.C;
        yaVarA.b();
        ((za) yaVarA.y).G(z2);
        long j = q9Var.D;
        yaVarA.b();
        ((za) yaVarA.y).H(j);
        byte[] bArr = q9Var.y;
        if (bArr != null) {
            s0 s0VarJ = t0.j(bArr, 0, bArr.length);
            yaVarA.b();
            ((za) yaVarA.y).C(s0VarJ);
        }
        for (p9 p9Var : q9Var.A) {
            for (t9 t9Var : p9Var.y) {
                int i = t9Var.D;
                String str3 = t9Var.e;
                if (i == 1) {
                    ab abVarA = bb.A();
                    abVarA.g(str3);
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.o("Not a long type");
                        return null;
                    }
                    long j2 = t9Var.y;
                    abVarA.b();
                    ((bb) abVarA.y).D(j2);
                    i1VarD = abVarA.d();
                } else if (i == 2) {
                    ab abVarA2 = bb.A();
                    abVarA2.g(str3);
                    if (i != 2) {
                        net.luminis.tls.engine.impl.c.o("Not a boolean type");
                        return null;
                    }
                    boolean z3 = t9Var.z;
                    abVarA2.b();
                    ((bb) abVarA2.y).E(z3);
                    i1VarD = abVarA2.d();
                } else if (i == 3) {
                    ab abVarA3 = bb.A();
                    abVarA3.g(str3);
                    if (i != 3) {
                        net.luminis.tls.engine.impl.c.o("Not a double type");
                        return null;
                    }
                    double d = t9Var.A;
                    abVarA3.b();
                    ((bb) abVarA3.y).F(d);
                    i1VarD = abVarA3.d();
                } else if (i == 4) {
                    ab abVarA4 = bb.A();
                    abVarA4.g(str3);
                    if (i != 4) {
                        net.luminis.tls.engine.impl.c.o("Not a String type");
                        return null;
                    }
                    String str4 = t9Var.B;
                    com.google.android.gms.common.internal.x.g(str4);
                    abVarA4.b();
                    ((bb) abVarA4.y).G(str4);
                    i1VarD = abVarA4.d();
                } else {
                    if (i != 5) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    ab abVarA5 = bb.A();
                    abVarA5.g(str3);
                    if (i != 5) {
                        net.luminis.tls.engine.impl.c.o("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = t9Var.C;
                    com.google.android.gms.common.internal.x.g(bArr2);
                    s0 s0VarJ2 = t0.j(bArr2, 0, bArr2.length);
                    abVarA5.b();
                    ((bb) abVarA5.y).H(s0VarJ2);
                    i1VarD = abVarA5.d();
                }
                yaVarA.b();
                ((za) yaVarA.y).E((bb) i1VarD);
            }
            String[] strArr = p9Var.z;
            if (strArr != null) {
                for (String str5 : strArr) {
                    yaVarA.b();
                    ((za) yaVarA.y).F(str5);
                }
            }
        }
        return (za) yaVarA.d();
    }

    @Override // com.google.common.base.t
    public Object get() {
        switch (this.e) {
            case 12:
                Object obj = na.j;
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(pa.a);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof com.google.common.util.concurrent.w0 ? (com.google.common.util.concurrent.w0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new com.google.common.util.concurrent.w0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z2 = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z2 = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return new Boolean(z2);
        }
    }
}
