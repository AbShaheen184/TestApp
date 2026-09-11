package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.k1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements u, t {
    public final com.google.android.material.shape.g A;
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public t D;
    public i1 E;
    public u[] F;
    public j G;
    public final u[] e;
    public final boolean[] y;
    public final IdentityHashMap z;

    public e0(com.google.android.material.shape.g gVar, long[] jArr, u... uVarArr) {
        this.A = gVar;
        this.e = uVarArr;
        gVar.getClass();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        this.G = new j(a1Var, a1Var);
        this.z = new IdentityHashMap();
        this.F = new u[0];
        this.y = new boolean[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.y[i] = true;
                this.e[i] = new g1(uVarArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            return this.G.d(n0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u) arrayList.get(i)).d(n0Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return this.G.f();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
        for (u uVar : this.e) {
            uVar.h();
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        u[] uVarArr = this.F;
        return (uVarArr.length > 0 ? uVarArr[0] : this.e[0]).i(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        long j2 = this.F[0].j(j);
        int i = 1;
        while (true) {
            u[] uVarArr = this.F;
            if (i >= uVarArr.length) {
                return j2;
            }
            if (uVarArr[i].j(j2) != j2) {
                net.luminis.tls.engine.impl.c.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) {
        for (u uVar : this.F) {
            uVar.k(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.z;
            if (i2 >= length) {
                break;
            }
            w0 w0Var = w0VarArr[i2];
            Integer num = w0Var == null ? null : (Integer) identityHashMap.get(w0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i2];
            if (qVar != null) {
                String str = qVar.c().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        w0[] w0VarArr2 = new w0[length2];
        w0[] w0VarArr3 = new w0[qVarArr.length];
        androidx.media3.exoplayer.trackselection.q[] qVarArr2 = new androidx.media3.exoplayer.trackselection.q[qVarArr.length];
        u[] uVarArr = this.e;
        ArrayList arrayList = new ArrayList(uVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < uVarArr.length) {
            int i4 = i;
            while (i4 < qVarArr.length) {
                w0VarArr3[i4] = iArr[i4] == i3 ? w0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    androidx.media3.exoplayer.trackselection.q qVar2 = qVarArr[i4];
                    qVar2.getClass();
                    androidx.media3.common.w0 w0Var2 = (androidx.media3.common.w0) this.C.get(qVar2.c());
                    w0Var2.getClass();
                    qVarArr2[i4] = new d0(qVar2, w0Var2);
                } else {
                    qVarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            u[] uVarArr2 = uVarArr;
            int i5 = i3;
            long jL = uVarArr2[i3].l(qVarArr2, zArr, w0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jL;
            } else if (jL != j2) {
                net.luminis.tls.engine.impl.c.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < qVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    w0 w0Var3 = w0VarArr3[i6];
                    w0Var3.getClass();
                    w0VarArr2[i6] = w0VarArr3[i6];
                    identityHashMap.put(w0Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    com.google.android.material.motion.a.q(w0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(uVarArr2[i5]);
            }
            i3 = i5 + 1;
            uVarArr = uVarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(w0VarArr2, i7, w0VarArr, i7, length2);
        this.F = (u[]) arrayList.toArray(new u[i7]);
        AbstractList abstractListW = com.google.common.collect.q.w(arrayList, new androidx.media3.common.p(6));
        this.A.getClass();
        this.G = new j(arrayList, abstractListW);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void m(u uVar) {
        ArrayList arrayList = this.B;
        arrayList.remove(uVar);
        if (arrayList.isEmpty()) {
            u[] uVarArr = this.e;
            int i = 0;
            for (u uVar2 : uVarArr) {
                i += uVar2.r().a;
            }
            androidx.media3.common.w0[] w0VarArr = new androidx.media3.common.w0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < uVarArr.length; i3++) {
                i1 i1VarR = uVarArr[i3].r();
                int i4 = i1VarR.a;
                int i5 = 0;
                while (i5 < i4) {
                    androidx.media3.common.w0 w0VarA = i1VarR.a(i5);
                    int i6 = w0VarA.a;
                    androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        androidx.media3.common.r rVar = w0VarA.d[i7];
                        androidx.media3.common.q qVarA = rVar.a();
                        String str = rVar.m;
                        u[] uVarArr2 = uVarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = rVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        qVarA.a = sb.toString();
                        if (str != null) {
                            qVarA.l = i3 + ":" + str;
                        }
                        rVarArr[i7] = new androidx.media3.common.r(qVarA);
                        i7++;
                        uVarArr = uVarArr2;
                    }
                    u[] uVarArr3 = uVarArr;
                    androidx.media3.common.w0 w0Var = new androidx.media3.common.w0(i3 + ":" + w0VarA.b, rVarArr);
                    this.C.put(w0Var, w0VarA);
                    w0VarArr[i2] = w0Var;
                    i5++;
                    i2++;
                    uVarArr = uVarArr3;
                }
            }
            this.E = new i1(w0VarArr);
            t tVar = this.D;
            tVar.getClass();
            tVar.m(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.G.n();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(y0 y0Var) {
        t tVar = this.D;
        tVar.getClass();
        tVar.o(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        long j = -9223372036854775807L;
        for (u uVar : this.F) {
            long jP = uVar.p();
            if (jP == -9223372036854775807L) {
                if (j != -9223372036854775807L && uVar.j(j) != j) {
                    net.luminis.tls.engine.impl.c.r("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j == -9223372036854775807L) {
                for (u uVar2 : this.F) {
                    if (uVar2 == uVar) {
                        break;
                    }
                    if (uVar2.j(jP) != jP) {
                        net.luminis.tls.engine.impl.c.r("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j = jP;
            } else if (jP != j) {
                net.luminis.tls.engine.impl.c.r("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.D = tVar;
        ArrayList arrayList = this.B;
        u[] uVarArr = this.e;
        Collections.addAll(arrayList, uVarArr);
        for (u uVar : uVarArr) {
            uVar.q(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        i1 i1Var = this.E;
        i1Var.getClass();
        return i1Var;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        return this.G.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        this.G.v(j);
    }
}
