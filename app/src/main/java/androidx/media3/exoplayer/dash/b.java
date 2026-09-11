package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.x;
import androidx.compose.animation.core.t2;
import androidx.compose.foundation.gestures.z1;
import androidx.media3.common.i0;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import androidx.media3.exoplayer.k1;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.source.i1;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.source.u;
import androidx.media3.exoplayer.source.v0;
import androidx.media3.exoplayer.source.x0;
import androidx.media3.exoplayer.source.y0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u, x0 {
    public static final Pattern Y = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern Z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final androidx.media3.exoplayer.drm.f A;
    public final t2 B;
    public final com.google.firebase.messaging.o C;
    public final long D;
    public final androidx.media3.exoplayer.upstream.o E;
    public final c2 F;
    public final i1 G;
    public final a[] H;
    public final com.google.android.material.shape.g I;
    public final q J;
    public final androidx.media3.exoplayer.drm.d L;
    public final androidx.media3.exoplayer.drm.d M;
    public t N;
    public androidx.media3.exoplayer.source.j Q;
    public androidx.media3.exoplayer.dash.manifest.c R;
    public int S;
    public List T;
    public long V;
    public final long W;
    public boolean X;
    public final int e;
    public final x y;
    public final androidx.media3.exoplayer.upstream.f z;
    public boolean U = true;
    public androidx.media3.exoplayer.source.chunk.h[] O = new androidx.media3.exoplayer.source.chunk.h[0];
    public n[] P = new n[0];
    public final IdentityHashMap K = new IdentityHashMap();

    public b(int i, androidx.media3.exoplayer.dash.manifest.c cVar, com.google.firebase.messaging.o oVar, int i2, x xVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.exoplayer.drm.f fVar2, androidx.media3.exoplayer.drm.d dVar, t2 t2Var, androidx.media3.exoplayer.drm.d dVar2, long j, androidx.media3.exoplayer.upstream.o oVar2, c2 c2Var, com.google.android.material.shape.g gVar, f fVar3, androidx.media3.exoplayer.analytics.k kVar) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        r[][] rVarArr;
        r[] rVarArrG;
        androidx.media3.exoplayer.dash.manifest.f fVarB;
        Integer num;
        this.e = i;
        this.R = cVar;
        this.C = oVar;
        this.S = i2;
        this.y = xVar;
        this.z = fVar;
        this.A = fVar2;
        this.M = dVar;
        this.B = t2Var;
        this.L = dVar2;
        this.D = j;
        this.E = oVar2;
        this.F = c2Var;
        this.I = gVar;
        boolean z = true;
        this.J = new q(cVar, fVar3, c2Var);
        int i5 = 0;
        gVar.getClass();
        e0 e0Var = h0.y;
        a1 a1Var = a1.B;
        this.Q = new androidx.media3.exoplayer.source.j(a1Var, a1Var);
        androidx.media3.exoplayer.dash.manifest.h hVarB = cVar.b(i2);
        List list = hVarB.d;
        this.T = list;
        List list2 = hVarB.c;
        int size = list2.size();
        HashMap map = new HashMap(com.google.common.collect.q.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            map.put(Long.valueOf(((androidx.media3.exoplayer.dash.manifest.a) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            androidx.media3.exoplayer.dash.manifest.a aVar = (androidx.media3.exoplayer.dash.manifest.a) list2.get(i7);
            List list3 = aVar.e;
            List list4 = aVar.f;
            boolean z2 = z;
            androidx.media3.exoplayer.dash.manifest.f fVarB2 = b("http://dashif.org/guidelines/trickmode", list3);
            fVarB2 = fVarB2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : fVarB2;
            int iIntValue = (fVarB2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarB2.b)))) == null || !a(aVar, (androidx.media3.exoplayer.dash.manifest.a) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (iIntValue == i7 && (fVarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarB.b;
                String str2 = j0.a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i8])));
                    if (num2 != null && a(aVar, (androidx.media3.exoplayer.dash.manifest.a) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] iArrF = a0.F((Collection) arrayList.get(i9));
            iArr2[i9] = iArrF;
            Arrays.sort(iArrF);
        }
        boolean[] zArr2 = new boolean[size2];
        r[][] rVarArr2 = new r[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((androidx.media3.exoplayer.dash.manifest.a) list2.get(iArr3[i12])).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!((androidx.media3.exoplayer.dash.manifest.m) list7.get(i13)).A.isEmpty()) {
                        zArr2[i10] = z3;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    rVarArr = rVarArr2;
                    rVarArrG = new r[0];
                    break;
                }
                int i15 = iArr4[i14];
                androidx.media3.exoplayer.dash.manifest.a aVar2 = (androidx.media3.exoplayer.dash.manifest.a) list2.get(i15);
                List list8 = ((androidx.media3.exoplayer.dash.manifest.a) list2.get(i15)).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    androidx.media3.exoplayer.dash.manifest.f fVar4 = (androidx.media3.exoplayer.dash.manifest.f) list8.get(i16);
                    zArr = zArr2;
                    rVarArr = rVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar4.a)) {
                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                        qVar.n = i0.p("application/cea-608");
                        qVar.a = androidx.privacysandbox.ads.adservices.java.internal.a.n(aVar2.a, ":cea608", new StringBuilder());
                        rVarArrG = g(fVar4, Y, new r(qVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar4.a)) {
                        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                        qVar2.n = i0.p("application/cea-708");
                        qVar2.a = androidx.privacysandbox.ads.adservices.java.internal.a.n(aVar2.a, ":cea708", new StringBuilder());
                        rVarArrG = g(fVar4, Z, new r(qVar2));
                        break;
                    }
                    i16++;
                    rVarArr2 = rVarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            rVarArr[i10] = rVarArrG;
            if (rVarArrG.length != 0) {
                i11++;
            }
            i10++;
            rVarArr2 = rVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        r[][] rVarArr3 = rVarArr2;
        int size3 = list.size() + i11 + size2;
        w0[] w0VarArr = new w0[size3];
        a[] aVarArr = new a[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(((androidx.media3.exoplayer.dash.manifest.a) list2.get(i19)).c);
            }
            int size4 = arrayList3.size();
            r[] rVarArr4 = new r[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                r rVar = ((androidx.media3.exoplayer.dash.manifest.m) arrayList3.get(i20)).e;
                int i22 = i18;
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.O = fVar2.a(rVar);
                rVarArr4[i20] = new r(qVarA);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            androidx.media3.exoplayer.dash.manifest.a aVar3 = (androidx.media3.exoplayer.dash.manifest.a) list2.get(iArr7[0]);
            long j2 = aVar3.a;
            String string = j2 != -1 ? Long.toString(j2) : androidx.privacysandbox.ads.adservices.java.internal.a.l(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (rVarArr3[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            e(xVar, rVarArr4);
            List list9 = list2;
            w0VarArr[i24] = new w0(string, rVarArr4);
            int i26 = aVar3.b;
            e0 e0Var2 = h0.y;
            a1 a1Var2 = a1.B;
            a aVar4 = new a(i26, 0, iArr7, i24, i25, i3, -1, a1Var2);
            int i27 = i24;
            aVarArr[i27] = aVar4;
            int i28 = -1;
            if (i25 != -1) {
                String strC = androidx.constraintlayout.core.g.c(string, ":emsg");
                androidx.media3.common.q qVar3 = new androidx.media3.common.q();
                qVar3.a = strC;
                qVar3.n = i0.p("application/x-emsg");
                qVar3.l = string;
                w0VarArr[i25] = new w0(strC, new r(qVar3));
                aVarArr[i25] = new a(5, 1, iArr7, i27, -1, -1, -1, a1Var2);
                i28 = -1;
            }
            if (i3 != i28) {
                i27 = i27;
                String strC2 = androidx.constraintlayout.core.g.c(string, ":cc");
                aVarArr[i3] = new a(3, 1, iArr7, i27, -1, -1, -1, h0.p(rVarArr3[i17]));
                e(xVar, rVarArr3[i17]);
                int i29 = 0;
                while (true) {
                    r[] rVarArr5 = rVarArr3[i17];
                    if (i29 >= rVarArr5.length) {
                        break;
                    }
                    androidx.media3.common.q qVarA2 = rVarArr5[i29].a();
                    qVarA2.l = string;
                    rVarArr5[i29] = new r(qVarA2);
                    i29++;
                }
                w0VarArr[i3] = new w0(strC2, rVarArr3[i17]);
            } else {
                i27 = i27;
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            androidx.media3.exoplayer.dash.manifest.g gVar2 = (androidx.media3.exoplayer.dash.manifest.g) list.get(i30);
            androidx.media3.common.q qVar4 = new androidx.media3.common.q();
            qVar4.a = gVar2.a();
            qVar4.n = i0.p("application/x-emsg");
            w0VarArr[i18] = new w0(gVar2.a() + ":" + i30, new r(qVar4));
            e0 e0Var3 = h0.y;
            aVarArr[i18] = new a(5, 2, new int[0], -1, -1, -1, i30, a1.B);
            i30++;
            i18++;
        }
        Pair pairCreate = Pair.create(new i1(w0VarArr), aVarArr);
        this.G = (i1) pairCreate.first;
        this.H = (a[]) pairCreate.second;
        this.W = Long.MIN_VALUE;
    }

    public static boolean a(androidx.media3.exoplayer.dash.manifest.a aVar, androidx.media3.exoplayer.dash.manifest.a aVar2) {
        int i = aVar.b;
        List list = aVar.c;
        int i2 = aVar2.b;
        List list2 = aVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            r rVar = ((androidx.media3.exoplayer.dash.manifest.m) list.get(0)).e;
            r rVar2 = ((androidx.media3.exoplayer.dash.manifest.m) list2.get(0)).e;
            int i3 = rVar.f & (-16385);
            int i4 = rVar2.f & (-16385);
            if (Objects.equals(rVar.d, rVar2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.exoplayer.dash.manifest.f b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.f fVar = (androidx.media3.exoplayer.dash.manifest.f) list.get(i);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void e(x xVar, r[] rVarArr) {
        for (int i = 0; i < rVarArr.length; i++) {
            r rVar = rVarArr[i];
            z1 z1Var = (z1) xVar.A;
            com.google.android.gms.common.internal.k kVar = (com.google.android.gms.common.internal.k) z1Var.y;
            if (z1Var.e && kVar.r(rVar)) {
                androidx.media3.common.q qVarA = rVar.a();
                String str = rVar.k;
                qVarA.n = i0.p("application/x-media3-cues");
                qVarA.L = kVar.e(rVar);
                StringBuilder sb = new StringBuilder();
                sb.append(rVar.o);
                sb.append(str != null ? " ".concat(str) : "");
                qVarA.j = sb.toString();
                qVarA.s = Long.MAX_VALUE;
                rVar = new r(qVarA);
            }
            rVarArr[i] = rVar;
        }
    }

    public static r[] g(androidx.media3.exoplayer.dash.manifest.f fVar, Pattern pattern, r rVar) {
        String str = fVar.b;
        if (str == null) {
            return new r[]{rVar};
        }
        String str2 = j0.a;
        String[] strArrSplit = str.split(";", -1);
        r[] rVarArr = new r[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new r[]{rVar};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.a = rVar.a + ":" + i2;
            qVarA.K = i2;
            qVarA.d = matcher.group(2);
            rVarArr[i] = new r(qVarA);
        }
        return rVarArr;
    }

    public final int c(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            a[] aVarArr = this.H;
            int i3 = aVarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && aVarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(n0 n0Var) {
        return this.Q.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return this.Q.f();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
        this.E.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        long jE;
        int i = 0;
        for (androidx.media3.exoplayer.source.chunk.h hVar : this.O) {
            if (hVar.e == 2) {
                k[] kVarArr = hVar.B.i;
                int length = kVarArr.length;
                while (i < length) {
                    k kVar = kVarArr[i];
                    j jVar = kVar.d;
                    long j2 = kVar.f;
                    j jVar2 = kVar.d;
                    if (jVar != null) {
                        long jC = kVar.c();
                        if (jC != 0) {
                            jVar2.getClass();
                            long jS = jVar2.s(j, kVar.e) + j2;
                            long jE2 = kVar.e(jS);
                            if (jE2 >= j) {
                                jE = jE2;
                            } else {
                                if (jC != -1) {
                                    jVar2.getClass();
                                    if (jS >= ((jVar2.y() + j2) + jC) - 1) {
                                        jE = jE2;
                                    }
                                }
                                jE = kVar.e(jS + 1);
                            }
                            return k1Var.a(j, jE2, jE);
                        }
                    }
                    i++;
                    j = j;
                }
                break;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) throws Throwable {
        int i;
        androidx.media3.exoplayer.source.chunk.a aVar;
        boolean zH;
        int i2;
        boolean z;
        androidx.media3.exoplayer.source.chunk.a aVar2;
        androidx.media3.exoplayer.source.chunk.h[] hVarArr = this.O;
        int length = hVarArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            androidx.media3.exoplayer.source.chunk.h hVar = hVarArr[i3];
            v0[] v0VarArr = hVar.K;
            v0 v0Var = hVar.J;
            androidx.media3.exoplayer.upstream.n nVar = hVar.F;
            ?? r14 = hVar.H;
            hVar.Q = j;
            hVar.T = z2;
            hVar.U = z2;
            if (hVar.z()) {
                hVar.P = j;
                z = z2;
                i = i3;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (androidx.media3.exoplayer.source.chunk.a) r14.get(r15);
                        long j2 = aVar.D;
                        i = i3;
                        if (j2 == j && aVar.H == -9223372036854775807L) {
                            break;
                        }
                        if (j2 <= j) {
                            i3 = i;
                            r15++;
                        }
                    } else {
                        i = i3;
                    }
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    zH = v0Var.G(aVar.d(0));
                } else {
                    long jF = hVar.f();
                    zH = v0Var.H(j, jF == Long.MIN_VALUE || j < jF);
                }
                if (!zH || (aVar2 = hVar.S) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if (aVar2.d(0) <= v0Var.u()) {
                        zH = false;
                    }
                }
                if (zH) {
                    hVar.R = hVar.C(v0Var.u(), i2);
                    for (v0 v0Var2 : v0VarArr) {
                        v0Var2.H(j, true);
                    }
                } else {
                    hVar.P = j;
                    hVar.W = false;
                    r14.clear();
                    hVar.R = 0;
                    if (nVar.d()) {
                        v0Var.k();
                        for (v0 v0Var3 : v0VarArr) {
                            v0Var3.k();
                        }
                        nVar.a();
                    } else {
                        nVar.c = null;
                        z = false;
                        v0Var.F(false);
                        for (v0 v0Var4 : hVar.K) {
                            v0Var4.F(false);
                        }
                    }
                }
                z = false;
            }
            i3 = i + 1;
            z2 = z;
        }
        n[] nVarArr = this.P;
        int length2 = nVarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            n nVar2 = nVarArr[r5];
            int iB = j0.b(nVar2.z, j, true);
            nVar2.D = iB;
            nVar2.E = (nVar2.A && iB == nVar2.z.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) throws Throwable {
        long j2;
        for (androidx.media3.exoplayer.source.chunk.h hVar : this.O) {
            if (!hVar.z()) {
                v0 v0Var = hVar.J;
                int i = v0Var.q;
                v0Var.j(j, true);
                v0 v0Var2 = hVar.J;
                int i2 = v0Var2.q;
                if (i2 > i) {
                    synchronized (v0Var2) {
                        j2 = v0Var2.p == 0 ? Long.MIN_VALUE : v0Var2.n[v0Var2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        v0[] v0VarArr = hVar.K;
                        if (i3 >= v0VarArr.length) {
                            break;
                        }
                        v0VarArr[i3].j(j2, hVar.A[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(hVar.C(i2, 0), hVar.R);
                if (iMin > 0) {
                    j0.V(hVar.H, 0, iMin);
                    hVar.R -= iMin;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:105:0x022c A[LOOP:7: B:104:0x022a->B:105:0x022c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, androidx.media3.exoplayer.source.w0[] w0VarArr, boolean[] zArr2, long j) throws Throwable {
        int i;
        boolean z;
        boolean z2;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        ?? r13;
        w0 w0VarA;
        h0 h0Var;
        ?? r12;
        p pVar;
        int[] iArr3;
        boolean z3;
        androidx.media3.exoplayer.upstream.f fVar;
        androidx.media3.datasource.h hVarF;
        androidx.media3.exoplayer.source.chunk.h hVar;
        p pVar2;
        long j2;
        int i4;
        boolean z4;
        androidx.media3.exoplayer.trackselection.q[] qVarArr2 = qVarArr;
        int[] iArr4 = new int[qVarArr2.length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = -1;
            if (i6 >= qVarArr2.length) {
                break;
            }
            androidx.media3.exoplayer.trackselection.q qVar = qVarArr2[i6];
            if (qVar != null) {
                iArr4[i6] = this.G.b(qVar.c());
            } else {
                iArr4[i6] = -1;
            }
            i6++;
        }
        for (int i7 = 0; i7 < qVarArr2.length; i7++) {
            if (qVarArr2[i7] == null || !zArr[i7]) {
                ?? r4 = w0VarArr[i7];
                if (r4 instanceof androidx.media3.exoplayer.source.chunk.h) {
                    ((androidx.media3.exoplayer.source.chunk.h) r4).D(this);
                } else if (r4 instanceof androidx.media3.exoplayer.source.chunk.g) {
                    androidx.media3.exoplayer.source.chunk.g gVar = (androidx.media3.exoplayer.source.chunk.g) r4;
                    boolean[] zArr3 = gVar.B.A;
                    int i8 = gVar.z;
                    com.google.android.material.motion.a.q(zArr3[i8]);
                    zArr3[i8] = false;
                }
                w0VarArr[i7] = null;
            }
        }
        int i9 = 0;
        while (true) {
            z = true;
            if (i9 >= qVarArr2.length) {
                break;
            }
            ?? r5 = w0VarArr[i9];
            if ((r5 instanceof androidx.media3.exoplayer.source.k) || (r5 instanceof androidx.media3.exoplayer.source.chunk.g)) {
                int iC = c(i9, iArr4);
                if (iC == -1) {
                    z4 = w0VarArr[i9] instanceof androidx.media3.exoplayer.source.k;
                } else {
                    ?? r10 = w0VarArr[i9];
                    z4 = (r10 instanceof androidx.media3.exoplayer.source.chunk.g) && ((androidx.media3.exoplayer.source.chunk.g) r10).e == w0VarArr[iC];
                }
                if (!z4) {
                    ?? r6 = w0VarArr[i9];
                    if (r6 instanceof androidx.media3.exoplayer.source.chunk.g) {
                        androidx.media3.exoplayer.source.chunk.g gVar2 = (androidx.media3.exoplayer.source.chunk.g) r6;
                        boolean[] zArr4 = gVar2.B.A;
                        int i10 = gVar2.z;
                        com.google.android.material.motion.a.q(zArr4[i10]);
                        zArr4[i10] = false;
                    }
                    w0VarArr[i9] = null;
                }
            }
            i9++;
        }
        int i11 = 0;
        while (i11 < qVarArr2.length) {
            androidx.media3.exoplayer.trackselection.q qVar2 = qVarArr2[i11];
            if (qVar2 == null) {
                iArr2 = iArr4;
                i2 = i11;
                i3 = i5;
            } else {
                ?? r11 = w0VarArr[i11];
                if (r11 == null) {
                    zArr2[i11] = z;
                    a aVar = this.H[iArr4[i11]];
                    int i12 = aVar.c;
                    if (i12 == 0) {
                        int i13 = aVar.f;
                        ?? r30 = i13 != i ? z : i5;
                        if (r30 != 0) {
                            w0VarA = this.G.a(i13);
                            r13 = z;
                        } else {
                            r13 = i5;
                            w0VarA = null;
                        }
                        int i14 = aVar.g;
                        if (i14 != i) {
                            h0Var = this.H[i14].h;
                        } else {
                            e0 e0Var = h0.y;
                            h0Var = a1.B;
                        }
                        int size = h0Var.size() + r13;
                        int i15 = i11;
                        r[] rVarArr = new r[size];
                        int[] iArr5 = new int[size];
                        if (r30 != 0) {
                            rVarArr[i5] = w0VarA.d[i5];
                            iArr5[i5] = 5;
                            r12 = z;
                        } else {
                            r12 = i5;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z5 = z;
                        int i16 = i5;
                        ?? r14 = r12;
                        while (i16 < h0Var.size()) {
                            r rVar = (r) h0Var.get(i16);
                            rVarArr[r14] = rVar;
                            iArr5[r14] = 3;
                            arrayList.add(rVar);
                            i16++;
                            r14++;
                        }
                        if (!this.R.d || r30 == 0) {
                            pVar = null;
                        } else {
                            q qVar3 = this.J;
                            pVar = new p(qVar3, qVar3.e);
                        }
                        androidx.media3.exoplayer.dash.manifest.c cVar = this.R;
                        int i17 = this.S;
                        j jVarC = ((androidx.media3.exoplayer.dash.manifest.m) ((androidx.media3.exoplayer.dash.manifest.a) cVar.b(i17).c.get(aVar.a[i5])).c.get(i5)).c();
                        long jA = jVarC == null ? -9223372036854775807L : jVarC.a(jVarC.s(j, cVar.d(i17)));
                        if (this.U) {
                            androidx.media3.exoplayer.dash.manifest.c cVar2 = this.R;
                            int i18 = this.S;
                            int[] iArr6 = aVar.a;
                            List list = cVar2.b(i18).c;
                            d0 d0VarK = h0.k();
                            iArr3 = iArr4;
                            int i19 = 0;
                            for (int length = iArr6.length; i19 < length; length = length) {
                                d0VarK.c(((androidx.media3.exoplayer.dash.manifest.a) list.get(iArr6[i19])).c);
                                i19++;
                            }
                            a1 a1VarG = d0VarK.g();
                            int i20 = 0;
                            while (true) {
                                if (i20 < qVar2.length()) {
                                    r rVar2 = ((androidx.media3.exoplayer.dash.manifest.m) a1VarG.get(qVar2.i(i20))).e;
                                    if (!i0.a(rVar2.o, rVar2.k)) {
                                        z3 = z5;
                                        break;
                                    }
                                    i20++;
                                }
                            }
                            x xVar = this.y;
                            androidx.media3.exoplayer.upstream.o oVar = this.E;
                            androidx.media3.exoplayer.dash.manifest.c cVar3 = this.R;
                            com.google.firebase.messaging.o oVar2 = this.C;
                            int i21 = this.S;
                            int[] iArr7 = aVar.a;
                            int i22 = aVar.b;
                            i2 = i15;
                            long j3 = this.D;
                            fVar = this.z;
                            hVarF = ((androidx.media3.datasource.g) xVar.z).f();
                            if (fVar != null) {
                                hVarF.c(fVar);
                            }
                            pVar2 = pVar;
                            iArr2 = iArr3;
                            hVar = new androidx.media3.exoplayer.source.chunk.h(aVar.b, iArr5, rVarArr, new m((z1) xVar.A, oVar, cVar3, oVar2, i21, iArr7, qVar2, i22, hVarF, j3, xVar.y, r30, arrayList, pVar), this, this.F, j, this.A, this.M, this.B, this.L, z3, jA, null);
                            j2 = this.W;
                            hVar.J.I(j2);
                            for (v0 v0Var : hVar.K) {
                                v0Var.I(j2);
                            }
                            synchronized (this) {
                                this.K.put(hVar, pVar2);
                            }
                            w0VarArr[i2] = hVar;
                        } else {
                            iArr3 = iArr4;
                        }
                        z3 = false;
                        x xVar2 = this.y;
                        androidx.media3.exoplayer.upstream.o oVar3 = this.E;
                        androidx.media3.exoplayer.dash.manifest.c cVar4 = this.R;
                        com.google.firebase.messaging.o oVar4 = this.C;
                        int i23 = this.S;
                        int[] iArr8 = aVar.a;
                        int i24 = aVar.b;
                        i2 = i15;
                        long j4 = this.D;
                        fVar = this.z;
                        hVarF = ((androidx.media3.datasource.g) xVar2.z).f();
                        if (fVar != null) {
                            hVarF.c(fVar);
                        }
                        pVar2 = pVar;
                        iArr2 = iArr3;
                        hVar = new androidx.media3.exoplayer.source.chunk.h(aVar.b, iArr5, rVarArr, new m((z1) xVar2.A, oVar3, cVar4, oVar4, i23, iArr8, qVar2, i24, hVarF, j4, xVar2.y, r30, arrayList, pVar), this, this.F, j, this.A, this.M, this.B, this.L, z3, jA, null);
                        j2 = this.W;
                        hVar.J.I(j2);
                        while (i4 < r4) {
                            v0Var.I(j2);
                        }
                        synchronized (this) {
                            this.K.put(hVar, pVar2);
                            w0VarArr[i2] = hVar;
                        }
                    } else {
                        iArr2 = iArr4;
                        i2 = i11;
                        if (i12 == 2) {
                            i3 = 0;
                            w0VarArr[i2] = new n((androidx.media3.exoplayer.dash.manifest.g) this.T.get(aVar.d), qVar2.c().d[0], this.R.d);
                        }
                    }
                    i3 = 0;
                } else {
                    iArr2 = iArr4;
                    i2 = i11;
                    i3 = i5;
                    if (r11 instanceof androidx.media3.exoplayer.source.chunk.h) {
                        ((androidx.media3.exoplayer.source.chunk.h) r11).B.j = qVar2;
                    }
                }
            }
            i5 = i3;
            iArr4 = iArr2;
            i = -1;
            z = true;
            i11 = i2 + 1;
            qVarArr2 = qVarArr;
        }
        int[] iArr9 = iArr4;
        ?? r3 = i5;
        while (i5 < qVarArr.length) {
            if (w0VarArr[i5] != null || qVarArr[i5] == null) {
                iArr = iArr9;
            } else {
                iArr = iArr9;
                a aVar2 = this.H[iArr[i5]];
                if (aVar2.c == 1) {
                    int iC2 = c(i5, iArr);
                    if (iC2 == -1) {
                        w0VarArr[i5] = new androidx.media3.exoplayer.source.k();
                    } else {
                        androidx.media3.exoplayer.source.chunk.h hVar2 = (androidx.media3.exoplayer.source.chunk.h) w0VarArr[iC2];
                        int i25 = aVar2.b;
                        boolean[] zArr5 = hVar2.A;
                        v0[] v0VarArr = hVar2.K;
                        int i26 = r3 == true ? 1 : 0;
                        while (true) {
                            if (i26 >= v0VarArr.length) {
                                org.mozilla.javascript.c.a();
                                return 0L;
                            }
                            if (hVar2.y[i26] == i25) {
                                com.google.android.material.motion.a.q(!zArr5[i26]);
                                zArr5[i26] = true;
                                v0VarArr[i26].H(j, true);
                                w0VarArr[i5] = new androidx.media3.exoplayer.source.chunk.g(hVar2, hVar2, v0VarArr[i26], i26);
                                break;
                            }
                            i26++;
                        }
                    }
                }
                i5++;
                iArr9 = iArr;
            }
            i5++;
            iArr9 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = w0VarArr.length;
        for (int i27 = r3 == true ? 1 : 0; i27 < length2; i27++) {
            ?? r9 = w0VarArr[i27];
            if (r9 instanceof androidx.media3.exoplayer.source.chunk.h) {
                arrayList2.add((androidx.media3.exoplayer.source.chunk.h) r9);
            } else if (r9 instanceof n) {
                arrayList3.add((n) r9);
            }
        }
        androidx.media3.exoplayer.source.chunk.h[] hVarArr = new androidx.media3.exoplayer.source.chunk.h[arrayList2.size()];
        this.O = hVarArr;
        arrayList2.toArray(hVarArr);
        n[] nVarArr = new n[arrayList3.size()];
        this.P = nVarArr;
        arrayList3.toArray(nVarArr);
        com.google.android.material.shape.g gVar3 = this.I;
        AbstractList abstractListW = com.google.common.collect.q.w(arrayList2, new androidx.media3.common.p(3));
        gVar3.getClass();
        this.Q = new androidx.media3.exoplayer.source.j(arrayList2, abstractListW);
        if (this.U) {
            this.U = r3;
            this.V = j;
            androidx.media3.exoplayer.source.chunk.h[] hVarArr2 = this.O;
            int length3 = hVarArr2.length;
            int i28 = r3 == true ? 1 : 0;
            while (true) {
                if (i28 >= length3) {
                    z2 = r3 == true ? 1 : 0;
                    break;
                }
                if (hVarArr2[i28].A()) {
                    z2 = true;
                    break;
                }
                i28++;
            }
            if (z2) {
                this.X = true;
                androidx.media3.exoplayer.source.chunk.h[] hVarArr3 = this.O;
                int length4 = hVarArr3.length;
                for (int i29 = r3 == true ? 1 : 0; i29 < length4; i29++) {
                    hVarArr3[i29].V = true;
                }
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.Q.n();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(y0 y0Var) {
        this.N.o(this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        if (!this.X) {
            return -9223372036854775807L;
        }
        boolean z = false;
        for (androidx.media3.exoplayer.source.chunk.h hVar : this.O) {
            hVar.getClass();
            try {
                boolean z2 = hVar.U;
                hVar.U = false;
                z |= z2;
            } catch (Throwable th) {
                hVar.U = false;
                throw th;
            }
        }
        for (androidx.media3.exoplayer.source.chunk.h hVar2 : this.O) {
            if (hVar2.A()) {
                if (z) {
                    return this.V;
                }
                return -9223372036854775807L;
            }
        }
        this.X = false;
        for (androidx.media3.exoplayer.source.chunk.h hVar3 : this.O) {
            hVar3.V = false;
        }
        if (z) {
            return this.V;
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.N = tVar;
        tVar.m(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        return this.G;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        return this.Q.t();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        int i;
        androidx.media3.exoplayer.source.chunk.h[] hVarArr = this.O;
        int length = hVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            androidx.media3.exoplayer.source.chunk.h hVar = hVarArr[i2];
            if (hVar.F.d()) {
                i = i2;
            } else {
                long jD = this.R.d(this.S);
                v0 v0Var = hVar.J;
                com.google.android.material.motion.a.q(!hVar.F.d());
                if (hVar.z() || jD == -9223372036854775807L || hVar.H.isEmpty()) {
                    i = i2;
                } else {
                    androidx.media3.exoplayer.source.chunk.a aVarX = hVar.x();
                    long j2 = aVarX.I;
                    if (j2 == -9223372036854775807L) {
                        j2 = aVarX.E;
                    }
                    if (j2 <= jD) {
                        i = i2;
                    } else {
                        long jR = v0Var.r();
                        if (jR <= jD) {
                            i = i2;
                        } else {
                            v0Var.l(Math.max(jD, v0Var.s() + 1));
                            v0[] v0VarArr = hVar.K;
                            int length2 = v0VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                v0 v0Var2 = v0VarArr[i3];
                                v0Var2.l(Math.max(jD, v0Var2.s() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            hVar.D.h(jD, jR, hVar.e);
                        }
                    }
                }
            }
            i2 = i + 1;
        }
        this.Q.v(j);
    }
}
