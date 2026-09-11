package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.appcompat.widget.c2;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final Object a;
    public final Object b;
    public final androidx.media3.exoplayer.source.w0[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public q0 g;
    public boolean h;
    public final boolean[] i;
    public final a[] j;
    public final androidx.media3.exoplayer.trackselection.o k;
    public final b1 l;
    public p0 m;
    public androidx.media3.exoplayer.source.i1 n;
    public androidx.media3.exoplayer.trackselection.t o;
    public long p;

    public p0(a[] aVarArr, long j, androidx.media3.exoplayer.trackselection.o oVar, c2 c2Var, b1 b1Var, q0 q0Var, androidx.media3.exoplayer.trackselection.t tVar) {
        this.j = aVarArr;
        this.p = j;
        this.k = oVar;
        this.l = b1Var;
        androidx.media3.exoplayer.source.v vVar = q0Var.a;
        this.b = vVar.a;
        this.g = q0Var;
        this.n = androidx.media3.exoplayer.source.i1.d;
        this.o = tVar;
        this.c = new androidx.media3.exoplayer.source.w0[aVarArr.length];
        this.i = new boolean[aVarArr.length];
        long j2 = q0Var.b;
        long j3 = q0Var.e;
        boolean z = q0Var.g;
        b1Var.getClass();
        Object obj = vVar.a;
        int i = g1.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        androidx.media3.exoplayer.source.v vVarA = vVar.a(pair.second);
        a1 a1Var = (a1) ((HashMap) b1Var.e).get(obj2);
        a1Var.getClass();
        ((HashSet) b1Var.h).add(a1Var);
        z0 z0Var = (z0) ((HashMap) b1Var.f).get(a1Var);
        if (z0Var != null) {
            z0Var.a.e(z0Var.b);
        }
        a1Var.c.add(vVarA);
        androidx.media3.exoplayer.source.o oVarB = a1Var.a.b(vVarA, c2Var, j2);
        ((IdentityHashMap) b1Var.d).put(oVarB, a1Var);
        b1Var.d();
        this.a = j3 != -9223372036854775807L ? new androidx.media3.exoplayer.source.d(oVarB, !z, j3) : oVarB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final long a(androidx.media3.exoplayer.trackselection.t tVar, long j, boolean z, boolean[] zArr) {
        a[] aVarArr;
        androidx.media3.exoplayer.source.w0[] w0VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= tVar.a) {
                break;
            }
            if (z || !tVar.a(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            aVarArr = this.j;
            int length = aVarArr.length;
            w0VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (aVarArr[i2].y == -2) {
                w0VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = tVar;
        c();
        long jL = this.a.l(tVar.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            if (aVarArr[i3].y == -2 && this.o.b(i3)) {
                w0VarArr[i3] = new androidx.media3.exoplayer.source.k();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < w0VarArr.length; i4++) {
            if (w0VarArr[i4] != null) {
                com.google.android.material.motion.a.q(tVar.b(i4));
                if (aVarArr[i4].y != -2) {
                    this.f = true;
                }
            } else {
                com.google.android.material.motion.a.q(tVar.c[i4] == null);
            }
        }
        return jL;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.t tVar = this.o;
            if (i >= tVar.a) {
                return;
            }
            boolean zB = tVar.b(i);
            androidx.media3.exoplayer.trackselection.q qVar = this.o.c[i];
            if (zB && qVar != null) {
                qVar.k();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.t tVar = this.o;
            if (i >= tVar.a) {
                return;
            }
            boolean zB = tVar.b(i);
            androidx.media3.exoplayer.trackselection.q qVar = this.o.c[i];
            if (zB && qVar != null) {
                qVar.h();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jT = this.f ? this.a.t() : Long.MIN_VALUE;
        return jT == Long.MIN_VALUE ? this.g.f : jT;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final void f(float f, androidx.media3.common.v0 v0Var, boolean z) {
        this.e = true;
        this.n = this.a.r();
        androidx.media3.exoplayer.trackselection.t tVarJ = j(f, v0Var, z);
        q0 q0Var = this.g;
        long jMax = q0Var.b;
        long j = q0Var.f;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(tVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        q0 q0Var2 = this.g;
        this.p = (q0Var2.b - jA) + j2;
        this.g = q0Var2.b(jA, q0Var2.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.t() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof androidx.media3.exoplayer.source.d;
            b1 b1Var = this.l;
            if (z) {
                b1Var.h(((androidx.media3.exoplayer.source.d) r0).e);
            } else {
                b1Var.h(r0);
            }
        } catch (RuntimeException e) {
            androidx.media3.common.util.c.g("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02e1  */
    public final androidx.media3.exoplayer.trackselection.t j(float f, androidx.media3.common.v0 v0Var, boolean z) {
        final androidx.media3.exoplayer.trackselection.j jVar;
        final String str;
        androidx.media3.exoplayer.upstream.f fVar;
        com.google.common.collect.a1 a1VarG;
        com.google.common.collect.a1 a1VarS;
        androidx.media3.exoplayer.trackselection.q bVar;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairM;
        boolean z2;
        Context context;
        int[] iArr3;
        androidx.media3.exoplayer.trackselection.o oVar = this.k;
        a[] aVarArr = this.j;
        androidx.media3.exoplayer.source.i1 i1Var = this.n;
        oVar.getClass();
        int i4 = 1;
        int[] iArr4 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        androidx.media3.common.w0[][] w0VarArr = new androidx.media3.common.w0[length][];
        int[][][] iArr5 = new int[aVarArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i1Var.a;
            w0VarArr[i5] = new androidx.media3.common.w0[i6];
            iArr5[i5] = new int[i6][];
        }
        int length2 = aVarArr.length;
        final int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = aVarArr[i7].E();
        }
        int i8 = 0;
        while (i8 < i1Var.a) {
            androidx.media3.common.w0 w0VarA = i1Var.a(i8);
            int i9 = w0VarA.c == 5 ? i4 : 0;
            int length3 = aVarArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < aVarArr.length) {
                a aVar = aVarArr[i11];
                androidx.media3.exoplayer.source.i1 i1Var2 = i1Var;
                int[] iArr7 = iArr4;
                int i13 = i4;
                int iMax = 0;
                for (int i14 = 0; i14 < w0VarA.a; i14++) {
                    iMax = Math.max(iMax, aVar.D(w0VarA.d[i14]) & 7);
                }
                int i15 = iArr7[i11] == 0 ? i13 : 0;
                if (iMax > i12 || (iMax == i12 && i9 != 0 && i10 == 0 && i15 != 0)) {
                    i12 = iMax;
                    i10 = i15;
                    length3 = i11;
                }
                i11++;
                i4 = i13;
                i1Var = i1Var2;
                iArr4 = iArr7;
            }
            androidx.media3.exoplayer.source.i1 i1Var3 = i1Var;
            int[] iArr8 = iArr4;
            int i16 = i4;
            if (length3 == aVarArr.length) {
                iArr3 = new int[w0VarA.a];
            } else {
                a aVar2 = aVarArr[length3];
                int[] iArr9 = new int[w0VarA.a];
                for (int i17 = 0; i17 < w0VarA.a; i17++) {
                    iArr9[i17] = aVar2.D(w0VarA.d[i17]);
                }
                iArr3 = iArr9;
            }
            int i18 = iArr8[length3];
            w0VarArr[length3][i18] = w0VarA;
            iArr5[length3][i18] = iArr3;
            iArr8[length3] = i18 + 1;
            i8++;
            i4 = i16;
            i1Var = i1Var3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i19 = i4;
        androidx.media3.exoplayer.source.i1[] i1VarArr = new androidx.media3.exoplayer.source.i1[aVarArr.length];
        String[] strArr = new String[aVarArr.length];
        int[] iArr11 = new int[aVarArr.length];
        for (int i20 = 0; i20 < aVarArr.length; i20++) {
            int i21 = iArr10[i20];
            i1VarArr[i20] = new androidx.media3.exoplayer.source.i1((androidx.media3.common.w0[]) androidx.media3.common.util.j0.S(i21, w0VarArr[i20]));
            iArr5[i20] = (int[][]) androidx.media3.common.util.j0.S(i21, iArr5[i20]);
            strArr[i20] = aVarArr[i20].k();
            iArr11[i20] = aVarArr[i20].y;
        }
        androidx.media3.exoplayer.trackselection.s sVar = new androidx.media3.exoplayer.trackselection.s(iArr11, i1VarArr, iArr6, iArr5, new androidx.media3.exoplayer.source.i1((androidx.media3.common.w0[]) androidx.media3.common.util.j0.S(iArr10[aVarArr.length], w0VarArr[aVarArr.length])));
        synchronized (oVar.c) {
            oVar.g = Thread.currentThread();
            jVar = oVar.f;
        }
        if (oVar.j == null && (context = oVar.d) != null) {
            oVar.j = Boolean.valueOf(androidx.media3.common.util.j0.P(context));
        }
        if (jVar.B && Build.VERSION.SDK_INT >= 32 && oVar.h == null) {
            oVar.h = new androidx.media3.exoplayer.util.d(oVar.d, new androidx.activity.l(oVar, 22), oVar.j);
        }
        int i22 = sVar.a;
        androidx.media3.exoplayer.trackselection.p[] pVarArr = new androidx.media3.exoplayer.trackselection.p[i22];
        androidx.media3.exoplayer.trackselection.o.d(sVar, jVar, pVarArr);
        androidx.media3.exoplayer.trackselection.o.b(sVar, jVar, pVarArr);
        androidx.media3.exoplayer.trackselection.o.c(sVar, jVar, pVarArr);
        Context context2 = oVar.d;
        int i23 = sVar.a;
        Pair pairF = androidx.media3.exoplayer.trackselection.o.f(pVarArr, i19);
        if (pairF == null) {
            int i24 = 0;
            while (true) {
                if (i24 >= i23) {
                    z2 = false;
                    break;
                }
                if (2 == iArr11[i24] && i1VarArr[i24].a > 0) {
                    z2 = true;
                    break;
                }
                i24++;
            }
            pairF = androidx.media3.exoplayer.trackselection.o.m(1, sVar, iArr5, new androidx.media3.exoplayer.trackselection.e(oVar, jVar, z2, iArr6), new androidx.compose.foundation.lazy.layout.a(13));
            if (pairF != null) {
                pVarArr[((Integer) pairF.second).intValue()] = (androidx.media3.exoplayer.trackselection.p) pairF.first;
            }
        }
        if (pairF == null) {
            str = null;
        } else {
            androidx.media3.exoplayer.trackselection.p pVar = (androidx.media3.exoplayer.trackselection.p) pairF.first;
            str = pVar.a.d[pVar.b[0]].d;
        }
        Pair pairF2 = androidx.media3.exoplayer.trackselection.o.f(pVarArr, 2);
        Pair pairF3 = androidx.media3.exoplayer.trackselection.o.f(pVarArr, 4);
        if (pairF2 == null && pairF3 == null) {
            jVar.q.getClass();
            final Point pointY = (!jVar.g || context2 == null) ? null : androidx.media3.common.util.j0.y(context2);
            Pair pairM2 = androidx.media3.exoplayer.trackselection.o.m(2, sVar, iArr5, new androidx.media3.exoplayer.trackselection.l() { // from class: androidx.media3.exoplayer.trackselection.d
                /* JADX WARN: Code duplicated, block: B:28:0x0048  */
                @Override // androidx.media3.exoplayer.trackselection.l
                public final a1 a(int i25, w0 w0Var, int[] iArr12) {
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    w0 w0Var2 = w0Var;
                    int i30 = iArr6[i25];
                    j jVar2 = jVar;
                    Point point = pointY;
                    int i31 = point != null ? point.x : jVar2.e;
                    int i32 = point != null ? point.y : jVar2.f;
                    boolean z3 = jVar2.h;
                    if (i31 == Integer.MAX_VALUE || i32 == Integer.MAX_VALUE) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        int i33 = Integer.MAX_VALUE;
                        for (int i34 = 0; i34 < w0Var2.a; i34++) {
                            androidx.media3.common.r rVar = w0Var2.d[i34];
                            int i35 = rVar.v;
                            int i36 = rVar.w;
                            if (i35 > 0 && i36 > 0) {
                                if (!z3) {
                                    i28 = i32;
                                    i29 = i31;
                                } else if ((i35 > i36) != (i31 > i32)) {
                                    i29 = i32;
                                    i28 = i31;
                                } else {
                                    i28 = i32;
                                    i29 = i31;
                                }
                                int i37 = i35 * i28;
                                int i38 = i36 * i29;
                                Point point2 = i37 >= i38 ? new Point(i29, j0.g(i38, i35)) : new Point(j0.g(i37, i36), i28);
                                int i39 = rVar.v;
                                int i40 = i39 * i36;
                                if (i39 >= ((int) (point2.x * 0.98f)) && i36 >= ((int) (point2.y * 0.98f)) && i40 < i33) {
                                    i33 = i40;
                                }
                            }
                        }
                        i26 = i33;
                    }
                    d0 d0VarK = h0.k();
                    int i41 = 0;
                    while (i41 < w0Var2.a) {
                        androidx.media3.common.r rVar2 = w0Var2.d[i41];
                        int i42 = rVar2.v;
                        int i43 = (i42 == -1 || (i27 = rVar2.w) == -1) ? -1 : i42 * i27;
                        d0VarK.b(new n(i25, w0Var2, i41, jVar2, iArr12[i41], str, i30, i26 == Integer.MAX_VALUE || (i43 != -1 && i43 <= i26)));
                        i41++;
                        w0Var2 = w0Var;
                    }
                    return d0VarK.g();
                }
            }, new androidx.compose.foundation.lazy.layout.a(12));
            if (pairM2 == null) {
                jVar.q.getClass();
                pairM = androidx.media3.exoplayer.trackselection.o.m(4, sVar, iArr5, new androidx.activity.y(jVar, 18), new androidx.compose.foundation.lazy.layout.a(11));
            } else {
                pairM = null;
            }
            if (pairM != null) {
                pVarArr[((Integer) pairM.second).intValue()] = (androidx.media3.exoplayer.trackselection.p) pairM.first;
            } else if (pairM2 != null) {
                pVarArr[((Integer) pairM2.second).intValue()] = (androidx.media3.exoplayer.trackselection.p) pairM2.first;
            }
        }
        if (androidx.media3.exoplayer.trackselection.o.f(pVarArr, 3) == null) {
            jVar.q.getClass();
            if (!jVar.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = androidx.media3.common.util.j0.a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairM3 = androidx.media3.exoplayer.trackselection.o.m(3, sVar, iArr5, new androidx.media3.exoplayer.source.a0(1, jVar, str, languageTag), new androidx.compose.foundation.lazy.layout.a(14));
            if (pairM3 != null) {
                pVarArr[((Integer) pairM3.second).intValue()] = (androidx.media3.exoplayer.trackselection.p) pairM3.first;
            }
        }
        jVar.q.getClass();
        int i25 = com.google.common.collect.k0.z;
        com.google.common.collect.j0 j0Var = new com.google.common.collect.j0(4);
        int iF = a.f(0, 0, 0, 0);
        int i26 = 0;
        while (i26 < i22) {
            androidx.media3.exoplayer.trackselection.p pVar2 = pVarArr[i26];
            if (pVar2 != null) {
                androidx.media3.common.w0 w0Var = pVar2.a;
                if (jVar.F.get(i26)) {
                    i3 = i26;
                } else {
                    i3 = i26;
                    if (!jVar.w.contains(Integer.valueOf(w0Var.c))) {
                        j0Var.a(w0Var.b);
                        int i27 = 0;
                        while (true) {
                            int[] iArr12 = pVar2.b;
                            iArr2 = iArr11;
                            if (i27 < iArr12.length) {
                                String str3 = w0Var.d[iArr12[i27]].m;
                                if (str3 != null) {
                                    j0Var.b(str3);
                                }
                                i27++;
                                iArr11 = iArr2;
                            }
                        }
                    }
                }
                iArr2 = iArr11;
            } else {
                i3 = i26;
                iArr2 = iArr11;
            }
            i26 = i3 + 1;
            iArr11 = iArr2;
        }
        int[] iArr13 = iArr11;
        com.google.common.collect.k0 k0VarG = j0Var.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i28 = 0;
        while (i28 < i23) {
            if (iArr13[i28] != 5) {
                i2 = i28;
            } else {
                androidx.media3.exoplayer.source.i1 i1Var4 = i1VarArr[i28];
                i2 = i28;
                int i29 = 0;
                while (i29 < i1Var4.a) {
                    androidx.media3.common.w0 w0VarA2 = i1Var4.a(i29);
                    arrayList.add(w0VarA2);
                    androidx.media3.exoplayer.source.i1[] i1VarArr2 = i1VarArr;
                    int[] iArr14 = (int[]) iArr5[i2][i29].clone();
                    int[][][] iArr15 = iArr5;
                    androidx.media3.exoplayer.source.i1 i1Var5 = i1Var4;
                    for (int i30 = 0; i30 < iArr14.length; i30++) {
                        String str4 = w0VarA2.d[i30].m;
                        if (str4 != null && !k0VarG.contains(str4)) {
                            iArr14[i30] = iF;
                        }
                    }
                    arrayList2.add(iArr14);
                    i29++;
                    iArr5 = iArr15;
                    i1VarArr = i1VarArr2;
                    i1Var4 = i1Var5;
                }
            }
            i28 = i2 + 1;
            iArr5 = iArr5;
            i1VarArr = i1VarArr;
        }
        androidx.media3.exoplayer.source.i1[] i1VarArr3 = i1VarArr;
        int[][][] iArr16 = iArr5;
        int size = arrayList.size();
        androidx.media3.common.w0[] w0VarArr2 = new androidx.media3.common.w0[size];
        com.google.android.material.motion.a.q(arrayList.size() == size);
        arrayList.toArray(w0VarArr2);
        androidx.media3.exoplayer.source.i1 i1Var6 = new androidx.media3.exoplayer.source.i1(w0VarArr2);
        int size2 = arrayList2.size();
        int[][] iArr17 = new int[size2][];
        com.google.android.material.motion.a.q(arrayList2.size() == size2);
        arrayList2.toArray(iArr17);
        for (int i31 = 0; i31 < i23; i31++) {
            if (iArr13[i31] == 5) {
                androidx.media3.exoplayer.trackselection.p pVarL = androidx.media3.exoplayer.trackselection.o.l(i1Var6, iArr17, jVar);
                pVarArr[i31] = pVarL;
                if (pVarL == null) {
                    break;
                }
                Arrays.fill(iArr17[i1Var6.b(pVarL.a)], iF);
            }
        }
        for (int i32 = 0; i32 < i23; i32++) {
            int i33 = iArr13[i32];
            if (i33 != 2 && i33 != 1) {
                if (i33 != 3 && i33 != 4) {
                    if (i33 != 5 && pVarArr[i32] == null) {
                        pVarArr[i32] = androidx.media3.exoplayer.trackselection.o.l(i1VarArr3[i32], iArr16[i32], jVar);
                    }
                }
            }
        }
        androidx.media3.exoplayer.trackselection.o.d(sVar, jVar, pVarArr);
        androidx.media3.exoplayer.trackselection.o.b(sVar, jVar, pVarArr);
        androidx.media3.exoplayer.trackselection.o.c(sVar, jVar, pVarArr);
        com.google.android.material.shape.g gVar = oVar.e;
        androidx.media3.exoplayer.upstream.f fVar2 = oVar.b;
        fVar2.getClass();
        gVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (androidx.media3.exoplayer.trackselection.p pVar3 : pVarArr) {
            if (pVar3 == null || pVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
                d0VarK.b(new androidx.media3.exoplayer.trackselection.a(0L, 0L));
                arrayList3.add(d0VarK);
            }
        }
        int length4 = pVarArr.length;
        long[][] jArr = new long[length4][];
        for (int i34 = 0; i34 < pVarArr.length; i34++) {
            androidx.media3.exoplayer.trackselection.p pVar4 = pVarArr[i34];
            if (pVar4 == null) {
                jArr[i34] = new long[0];
            } else {
                int[] iArr18 = pVar4.b;
                jArr[i34] = new long[iArr18.length];
                for (int i35 = 0; i35 < iArr18.length; i35++) {
                    long j = pVar4.a.d[iArr18[i35]].j;
                    long[] jArr2 = jArr[i34];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i35] = j;
                }
                Arrays.sort(jArr[i34]);
            }
        }
        int[] iArr19 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i36 = 0; i36 < length4; i36++) {
            long[] jArr4 = jArr[i36];
            jArr3[i36] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        androidx.media3.exoplayer.trackselection.b.v(arrayList3, jArr3);
        com.google.common.collect.q.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(com.google.common.collect.y0.y);
        com.google.common.collect.w0 w0Var2 = new com.google.common.collect.w0();
        com.google.common.collect.x0 x0Var = new com.google.common.collect.x0(treeMap);
        x0Var.C = w0Var2;
        int i37 = 0;
        loop19: while (true) {
            if (i37 >= length4) {
                fVar = fVar2;
                int[] iArr20 = iArr19;
                Collection nVar = x0Var.y;
                if (nVar == null) {
                    nVar = new com.google.common.collect.n(0, x0Var);
                    x0Var.y = nVar;
                }
                com.google.common.collect.h0 h0VarO = com.google.common.collect.h0.o(nVar);
                for (int i38 = 0; i38 < h0VarO.size(); i38++) {
                    int iIntValue = ((Integer) h0VarO.get(i38)).intValue();
                    int i39 = iArr20[iIntValue] + 1;
                    iArr20[iIntValue] = i39;
                    jArr3[iIntValue] = jArr[iIntValue][i39];
                    androidx.media3.exoplayer.trackselection.b.v(arrayList3, jArr3);
                }
                for (int i40 = 0; i40 < pVarArr.length; i40++) {
                    if (arrayList3.get(i40) != null) {
                        jArr3[i40] = jArr3[i40] * 2;
                    }
                }
                androidx.media3.exoplayer.trackselection.b.v(arrayList3, jArr3);
                com.google.common.collect.d0 d0VarK2 = com.google.common.collect.h0.k();
                for (int i41 = 0; i41 < arrayList3.size(); i41++) {
                    com.google.common.collect.d0 d0Var = (com.google.common.collect.d0) arrayList3.get(i41);
                    d0VarK2.b(d0Var == null ? com.google.common.collect.a1.B : d0Var.g());
                }
                a1VarG = d0VarK2.g();
                break;
            }
            long[] jArr5 = jArr[i37];
            if (jArr5.length <= 1) {
                fVar = fVar2;
                i = length4;
                iArr = iArr19;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                fVar = fVar2;
                int i42 = 0;
                while (true) {
                    long[] jArr6 = jArr[i37];
                    i = length4;
                    double dLog = 0.0d;
                    if (i42 >= jArr6.length) {
                        break;
                    }
                    int[] iArr21 = iArr19;
                    long j2 = jArr6[i42];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i42] = dLog;
                    i42++;
                    length4 = i;
                    iArr19 = iArr21;
                }
                iArr = iArr19;
                int i43 = length5 - 1;
                double d = dArr[i43] - dArr[0];
                int i44 = 0;
                while (i44 < i43) {
                    double d2 = dArr[i44];
                    int i45 = i44 + 1;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i45]) * 0.5d) - dArr[0]) / d);
                    Integer numValueOf = Integer.valueOf(i37);
                    double d3 = d;
                    Map map = x0Var.A;
                    Collection collection = (Collection) map.get(dValueOf);
                    if (collection == null) {
                        Collection collectionE = x0Var.e();
                        if (!collectionE.add(numValueOf)) {
                            net.luminis.tls.engine.impl.c.m("New Collection violated the Collection spec");
                            a1VarG = null;
                            break loop19;
                        }
                        x0Var.B++;
                        map.put(dValueOf, collectionE);
                    } else if (collection.add(numValueOf)) {
                        x0Var.B++;
                    }
                    i44 = i45;
                    d = d3;
                }
            }
            i37++;
            fVar2 = fVar;
            length4 = i;
            iArr19 = iArr;
        }
        androidx.media3.exoplayer.trackselection.q[] qVarArr = new androidx.media3.exoplayer.trackselection.q[pVarArr.length];
        for (int i46 = 0; i46 < pVarArr.length; i46++) {
            androidx.media3.exoplayer.trackselection.p pVar5 = pVarArr[i46];
            if (pVar5 != null) {
                int[] iArr22 = pVar5.b;
                if (iArr22.length != 0) {
                    int length6 = iArr22.length;
                    androidx.media3.common.w0 w0Var3 = pVar5.a;
                    if (length6 == 1) {
                        bVar = new androidx.media3.exoplayer.trackselection.r(w0Var3, new int[]{iArr22[0]});
                    } else {
                        long j3 = 25000;
                        bVar = new androidx.media3.exoplayer.trackselection.b(w0Var3, iArr22, fVar, 10000, j3, j3, (com.google.common.collect.h0) a1VarG.get(i46));
                    }
                    qVarArr[i46] = bVar;
                }
            }
        }
        h1[] h1VarArr = new h1[i22];
        for (int i47 = 0; i47 < i22; i47++) {
            h1VarArr[i47] = (jVar.F.get(i47) || jVar.w.contains(Integer.valueOf(sVar.b[i47])) || (sVar.b[i47] != -2 && qVarArr[i47] == null)) ? null : h1.c;
        }
        jVar.q.getClass();
        Pair pairCreate = Pair.create(h1VarArr, qVarArr);
        androidx.media3.exoplayer.trackselection.q[] qVarArr2 = (androidx.media3.exoplayer.trackselection.q[]) pairCreate.second;
        int length7 = qVarArr2.length;
        List[] listArr = new List[length7];
        for (int i48 = 0; i48 < qVarArr2.length; i48++) {
            androidx.media3.exoplayer.trackselection.q qVar = qVarArr2[i48];
            if (qVar != null) {
                a1VarS = com.google.common.collect.h0.s(qVar);
            } else {
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                a1VarS = com.google.common.collect.a1.B;
            }
            listArr[i48] = a1VarS;
        }
        com.google.common.collect.d0 d0Var2 = new com.google.common.collect.d0(4);
        int i49 = 0;
        while (true) {
            int i50 = sVar.a;
            androidx.media3.exoplayer.source.i1[] i1VarArr4 = sVar.c;
            if (i49 >= i50) {
                break;
            }
            androidx.media3.exoplayer.source.i1 i1Var7 = i1VarArr4[i49];
            int i51 = 0;
            while (i51 < i1Var7.a) {
                androidx.media3.common.w0 w0VarA3 = i1Var7.a(i51);
                int i52 = i1VarArr4[i49].a(i51).a;
                int[] iArr23 = new int[i52];
                int i53 = 0;
                int i54 = 0;
                while (i53 < i52) {
                    List[] listArr2 = listArr;
                    if ((sVar.e[i49][i51][i53] & 7) == 4) {
                        iArr23[i54] = i53;
                        i54++;
                    }
                    i53++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr23, i54);
                androidx.media3.exoplayer.source.i1 i1Var8 = i1Var7;
                int iMin = 16;
                String str5 = null;
                int i55 = 0;
                boolean z3 = false;
                int i56 = 0;
                while (i55 < iArrCopyOf.length) {
                    int[] iArr24 = iArrCopyOf;
                    String str6 = i1VarArr4[i49].a(i51).d[iArrCopyOf[i55]].o;
                    int i57 = i56 + 1;
                    if (i56 == 0) {
                        str5 = str6;
                    } else {
                        z3 = (!Objects.equals(str5, str6)) | z3;
                    }
                    iMin = Math.min(iMin, sVar.e[i49][i51][i55] & 24);
                    i55++;
                    i56 = i57;
                    iArrCopyOf = iArr24;
                }
                if (z3) {
                    iMin = Math.min(iMin, sVar.d[i49]);
                }
                boolean z4 = iMin != 0;
                int i58 = w0VarA3.a;
                int[] iArr25 = new int[i58];
                boolean[] zArr = new boolean[i58];
                for (int i59 = 0; i59 < w0VarA3.a; i59++) {
                    iArr25[i59] = sVar.e[i49][i51][i59] & 7;
                    boolean z5 = false;
                    int i60 = 0;
                    while (i60 < length7) {
                        List list = listArr3[i60];
                        int i61 = length7;
                        androidx.media3.exoplayer.source.i1[] i1VarArr5 = i1VarArr4;
                        int i62 = 0;
                        while (i62 < list.size()) {
                            androidx.media3.exoplayer.trackselection.q qVar2 = (androidx.media3.exoplayer.trackselection.q) list.get(i62);
                            int i63 = i62;
                            if (qVar2.c().equals(w0VarA3) && qVar2.u(i59) != -1) {
                                z5 = true;
                                break;
                            }
                            i62 = i63 + 1;
                        }
                        i60++;
                        length7 = i61;
                        i1VarArr4 = i1VarArr5;
                    }
                    zArr[i59] = z5;
                }
                d0Var2.b(new androidx.media3.common.b1(w0VarA3, z4, iArr25, zArr));
                i51++;
                listArr = listArr3;
                i1Var7 = i1Var8;
                length7 = length7;
            }
            i49++;
        }
        androidx.media3.exoplayer.source.i1 i1Var9 = sVar.f;
        for (int i64 = 0; i64 < i1Var9.a; i64++) {
            androidx.media3.common.w0 w0VarA4 = i1Var9.a(i64);
            int[] iArr26 = new int[w0VarA4.a];
            Arrays.fill(iArr26, 0);
            d0Var2.b(new androidx.media3.common.b1(w0VarA4, false, iArr26, new boolean[w0VarA4.a]));
        }
        androidx.media3.exoplayer.trackselection.t tVar = new androidx.media3.exoplayer.trackselection.t((h1[]) pairCreate.first, (androidx.media3.exoplayer.trackselection.q[]) pairCreate.second, new androidx.media3.common.c1(d0Var2.g()), sVar);
        for (int i65 = 0; i65 < tVar.a; i65++) {
            boolean zB = tVar.b(i65);
            androidx.media3.exoplayer.trackselection.q[] qVarArr3 = tVar.c;
            if (zB) {
                com.google.android.material.motion.a.q(qVarArr3[i65] != null || this.j[i65].y == -2);
            } else {
                com.google.android.material.motion.a.q(qVarArr3[i65] == null);
            }
        }
        for (androidx.media3.exoplayer.trackselection.q qVar3 : tVar.c) {
            if (qVar3 != null) {
                qVar3.q(f);
                qVar3.f(z);
            }
        }
        return tVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof androidx.media3.exoplayer.source.d) {
            long j = this.g.e;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.d) obj).C = j;
        }
    }
}
