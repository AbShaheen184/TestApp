package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.layout.j1;
import androidx.compose.ui.layout.l1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements l0 {
    public final int a;
    public final c2 b;
    public final kotlin.jvm.functions.l c;
    public androidx.compose.ui.unit.a d;
    public j1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Object i;
    public boolean j;
    public z0 k;
    public boolean l;
    public long m;
    public long n;
    public long o = kotlin.time.e.b();
    public final /* synthetic */ b1 p;

    public a1(b1 b1Var, int i, c2 c2Var, kotlin.jvm.functions.l lVar) {
        this.p = b1Var;
        this.a = i;
        this.b = c2Var;
        this.c = lVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public final void a() {
        this.l = true;
    }

    public final void b() {
        j1 j1Var = this.e;
        if (j1Var != null) {
            j1Var.dispose();
        }
        this.e = null;
        this.k = null;
    }

    public final boolean c(b bVar) {
        boolean zD;
        if (!this.p.e) {
            return false;
        }
        if (this.l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(bVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(bVar);
        }
        androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public final void cancel() {
        if (this.g) {
            return;
        }
        this.g = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0222 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x022e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0243 A[Catch: all -> 0x0211, LOOP:2: B:101:0x021a->B:114:0x0243, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:131:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0288  */
    /* JADX WARN: Code duplicated, block: B:137:0x0293 A[Catch: all -> 0x02d5, TryCatch #1 {all -> 0x02d5, blocks: (B:135:0x028d, B:137:0x0293, B:138:0x0298, B:140:0x029c, B:141:0x02a1, B:143:0x02a8, B:145:0x02af, B:146:0x02b5), top: B:182:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:140:0x029c A[Catch: all -> 0x02d5, TryCatch #1 {all -> 0x02d5, blocks: (B:135:0x028d, B:137:0x0293, B:138:0x0298, B:140:0x029c, B:141:0x02a1, B:143:0x02a8, B:145:0x02af, B:146:0x02b5), top: B:182:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a8 A[Catch: all -> 0x02d5, TryCatch #1 {all -> 0x02d5, blocks: (B:135:0x028d, B:137:0x0293, B:138:0x0298, B:140:0x029c, B:141:0x02a1, B:143:0x02a8, B:145:0x02af, B:146:0x02b5), top: B:182:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02af A[Catch: all -> 0x02d5, LOOP:3: B:144:0x02ad->B:145:0x02af, LOOP_END, TryCatch #1 {all -> 0x02d5, blocks: (B:135:0x028d, B:137:0x0293, B:138:0x0298, B:140:0x029c, B:141:0x02a1, B:143:0x02a8, B:145:0x02af, B:146:0x02b5), top: B:182:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5 A[Catch: all -> 0x02d5, TRY_LEAVE, TryCatch #1 {all -> 0x02d5, blocks: (B:135:0x028d, B:137:0x0293, B:138:0x0298, B:140:0x029c, B:141:0x02a1, B:143:0x02a8, B:145:0x02af, B:146:0x02b5), top: B:182:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:176:0x0335 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:191:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x015b A[Catch: all -> 0x0188, TryCatch #3 {all -> 0x0188, blocks: (B:56:0x0157, B:58:0x015b, B:60:0x016f, B:63:0x0180, B:62:0x0177), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f A[Catch: all -> 0x0188, TryCatch #3 {all -> 0x0188, blocks: (B:56:0x0157, B:58:0x015b, B:60:0x016f, B:63:0x0180, B:62:0x0177), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0177 A[Catch: all -> 0x0188, TryCatch #3 {all -> 0x0188, blocks: (B:56:0x0157, B:58:0x015b, B:60:0x016f, B:63:0x0180, B:62:0x0177), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #2 {all -> 0x01c7, blocks: (B:77:0x01b3, B:79:0x01ba), top: B:183:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01da A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0 A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec A[Catch: all -> 0x0211, TRY_ENTER, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f8 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01fb A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:84:0x01d2, B:86:0x01da, B:88:0x01e0, B:93:0x01ec, B:95:0x01f8, B:97:0x020e, B:96:0x01fb, B:100:0x0213, B:101:0x021a, B:103:0x0222, B:109:0x0233, B:110:0x0235, B:114:0x0243, B:115:0x0249), top: B:180:0x01d2 }] */
    public final boolean d(b bVar) {
        z0 z0Var;
        z0 z0Var2;
        androidx.compose.ui.unit.a aVar;
        long j;
        j1 j1Var;
        kotlin.jvm.functions.l lVar;
        int iA;
        int i;
        z0 z0Var3;
        int i2;
        boolean z;
        List[] listArr;
        int i3;
        List list;
        int size;
        int i4;
        List list2;
        a1 a1Var;
        a1 a1Var2;
        m0 m0Var;
        kotlin.jvm.functions.l lVar2;
        List list3;
        j1 j1Var2;
        int i5 = this.a;
        long j2 = i5;
        androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
        b1 b1Var = this.p;
        y yVar = (y) ((x) b1Var.y).b.invoke();
        if (!this.g) {
            int iA2 = yVar.a();
            if (i5 >= 0 && i5 < iA2) {
                Object objB = yVar.b(i5);
                Object obj = this.i;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = yVar.c(i5);
                c2 c2Var = this.b;
                d dVar = (d) c2Var.A;
                if (c2Var.z != objC || dVar == null) {
                    androidx.collection.o0 o0Var = (androidx.collection.o0) c2Var.y;
                    Object objG = o0Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        d dVar2 = new d();
                        dVar2.d = -1;
                        o0Var.m(objC, dVar2);
                        obj2 = dVar2;
                    }
                    dVar = (d) obj2;
                    c2Var.z = objC;
                    c2Var.A = dVar;
                }
                e();
                long jA = bVar.a();
                this.m = jA;
                this.o = kotlin.time.e.b();
                this.n = 0L;
                androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (f(this.m, dVar.a)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.e != null) {
                                androidx.compose.foundation.internal.b.a("Request was already composed!");
                            }
                            kotlin.jvm.functions.p pVarA = ((x) b1Var.y).a(i5, objB, objC);
                            this.i = objB;
                            androidx.compose.ui.layout.m0 m0VarA = ((l1) b1Var.z).a();
                            androidx.compose.ui.node.f0 f0Var = m0VarA.e;
                            if (f0Var.H()) {
                                m0VarA.g();
                                if (!m0VarA.D.c(objB)) {
                                    m0VarA.I.k(objB);
                                    androidx.collection.o0 o0Var2 = m0VarA.G;
                                    Object objG2 = o0Var2.g(objB);
                                    if (objG2 == null) {
                                        objG2 = m0VarA.l(objB);
                                        if (objG2 != null) {
                                            m0VarA.i(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(objG2), ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z);
                                            m0VarA.L++;
                                        } else {
                                            int i6 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z;
                                            androidx.compose.ui.node.f0 f0Var2 = new androidx.compose.ui.node.f0(2);
                                            f0Var.O = true;
                                            f0Var.B(i6, f0Var2);
                                            f0Var.O = false;
                                            m0VarA.L++;
                                            objG2 = f0Var2;
                                        }
                                        o0Var2.m(objB, objG2);
                                    }
                                    m0VarA.k((androidx.compose.ui.node.f0) objG2, objB, false, pVarA);
                                }
                            }
                            this.e = m0VarA.e(objB);
                            this.h = true;
                            Trace.endSection();
                            g();
                            dVar.a = d.a(this.n, dVar.a);
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (e()) {
                        if (this.j) {
                            z0Var = this.k;
                            if (z0Var != null) {
                                i2 = dVar.d;
                                z = this.l;
                                listArr = z0Var.b;
                                i3 = z0Var.c;
                                list = z0Var.a;
                                if (i3 < list.size()) {
                                    if (z0Var.f.g) {
                                        androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    for (i4 = 0; i4 < size; i4++) {
                                        ((m0) list.get(i4)).d = i2;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (z0Var.c < list.size()) {
                                        if (listArr[z0Var.c] == null) {
                                            if (bVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i7 = z0Var.c;
                                            m0Var = (m0) list.get(i7);
                                            lVar2 = m0Var.a;
                                            if (lVar2 == null) {
                                                list3 = kotlin.collections.u.e;
                                            } else {
                                                k0 k0Var = new k0(m0Var, m0Var.d);
                                                lVar2.invoke(k0Var);
                                                ArrayList arrayList = k0Var.b;
                                                m0Var.f = arrayList.size();
                                                list3 = arrayList;
                                            }
                                            listArr[i7] = list3;
                                        }
                                        list2 = listArr[z0Var.c];
                                        list2.getClass();
                                        while (z0Var.d < list2.size()) {
                                            a1Var = (a1) list2.get(z0Var.d);
                                            if (z) {
                                                if (a1Var != null) {
                                                    a1Var2 = a1Var;
                                                } else {
                                                    a1Var2 = null;
                                                }
                                                if (a1Var2 != null) {
                                                    a1Var2.l = true;
                                                }
                                            }
                                            z0Var.e = true;
                                            if (a1Var.c(bVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            z0Var.d++;
                                        }
                                        z0Var.d = 0;
                                        z0Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            z0Var2 = this.k;
                            if (z0Var2 != null) {
                                g();
                                androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                                z0Var3 = this.k;
                                if (z0Var3 != null) {
                                    z0Var3.e = false;
                                }
                            }
                            aVar = this.d;
                            if (!this.f) {
                                if (f(this.m, dVar.c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = aVar.a;
                                    if (this.g) {
                                        androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.f) {
                                        androidx.compose.foundation.internal.b.a("Request was already measured!");
                                    }
                                    this.f = true;
                                    j1Var = this.e;
                                    if (j1Var != null) {
                                        iA = j1Var.a();
                                        for (i = 0; i < iA; i++) {
                                            j1Var.c(i, j);
                                        }
                                    } else {
                                        androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                        com.google.gson.b.b();
                                    }
                                    Trace.endSection();
                                    g();
                                    dVar.c = d.a(this.n, dVar.c);
                                    lVar = this.c;
                                    if (lVar != null) {
                                        lVar.invoke(this);
                                    }
                                }
                            }
                            z0 z0Var4 = this.k;
                            if (this.f) {
                                return false;
                            }
                            return false;
                        }
                        if (this.m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            j1Var2 = this.e;
                            if (j1Var2 != null) {
                                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                                j1Var2.d(new y0(0, zVar));
                                List list4 = (List) zVar.e;
                                if (list4 != null) {
                                }
                                this.k = z0Var;
                                this.j = true;
                                Trace.endSection();
                                z0Var = this.k;
                                if (z0Var != null) {
                                    i2 = dVar.d;
                                    z = this.l;
                                    listArr = z0Var.b;
                                    i3 = z0Var.c;
                                    list = z0Var.a;
                                    if (i3 < list.size()) {
                                        if (z0Var.f.g) {
                                            androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i4 < size) {
                                            ((m0) list.get(i4)).d = i2;
                                        }
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (z0Var.c < list.size()) {
                                            if (listArr[z0Var.c] == null) {
                                                if (bVar.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i8 = z0Var.c;
                                                m0Var = (m0) list.get(i8);
                                                lVar2 = m0Var.a;
                                                if (lVar2 == null) {
                                                    list3 = kotlin.collections.u.e;
                                                } else {
                                                    k0 k0Var2 = new k0(m0Var, m0Var.d);
                                                    lVar2.invoke(k0Var2);
                                                    ArrayList arrayList2 = k0Var2.b;
                                                    m0Var.f = arrayList2.size();
                                                    list3 = arrayList2;
                                                }
                                                listArr[i8] = list3;
                                            }
                                            list2 = listArr[z0Var.c];
                                            list2.getClass();
                                            while (z0Var.d < list2.size()) {
                                                a1Var = (a1) list2.get(z0Var.d);
                                                if (z) {
                                                    if (a1Var != null) {
                                                        a1Var2 = a1Var;
                                                    } else {
                                                        a1Var2 = null;
                                                    }
                                                    if (a1Var2 != null) {
                                                        a1Var2.l = true;
                                                    }
                                                }
                                                z0Var.e = true;
                                                if (a1Var.c(bVar)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                z0Var.d++;
                                            }
                                            z0Var.d = 0;
                                            z0Var.c++;
                                        }
                                        Trace.endSection();
                                    }
                                }
                                z0Var2 = this.k;
                                if (z0Var2 != null) {
                                    g();
                                    androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                                    z0Var3 = this.k;
                                    if (z0Var3 != null) {
                                        z0Var3.e = false;
                                    }
                                }
                                aVar = this.d;
                                if (!this.f) {
                                    if (f(this.m, dVar.c)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = aVar.a;
                                        if (this.g) {
                                            androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            androidx.compose.foundation.internal.b.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        j1Var = this.e;
                                        if (j1Var != null) {
                                            iA = j1Var.a();
                                            while (i < iA) {
                                                j1Var.c(i, j);
                                            }
                                        } else {
                                            androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                            com.google.gson.b.b();
                                        }
                                        Trace.endSection();
                                        g();
                                        dVar.c = d.a(this.n, dVar.c);
                                        lVar = this.c;
                                        if (lVar != null) {
                                            lVar.invoke(this);
                                        }
                                    }
                                }
                                z0 z0Var5 = this.k;
                                if (this.f) {
                                    return false;
                                }
                                return false;
                            }
                            androidx.compose.foundation.internal.b.b("Should precompose before resolving nested prefetch states");
                            com.google.gson.b.b();
                            this.k = z0Var;
                            this.j = true;
                            Trace.endSection();
                            z0Var = this.k;
                            if (z0Var != null) {
                                i2 = dVar.d;
                                z = this.l;
                                listArr = z0Var.b;
                                i3 = z0Var.c;
                                list = z0Var.a;
                                if (i3 < list.size()) {
                                    if (z0Var.f.g) {
                                        androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i4 < size) {
                                        ((m0) list.get(i4)).d = i2;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (z0Var.c < list.size()) {
                                        if (listArr[z0Var.c] == null) {
                                            if (bVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i9 = z0Var.c;
                                            m0Var = (m0) list.get(i9);
                                            lVar2 = m0Var.a;
                                            if (lVar2 == null) {
                                                list3 = kotlin.collections.u.e;
                                            } else {
                                                k0 k0Var3 = new k0(m0Var, m0Var.d);
                                                lVar2.invoke(k0Var3);
                                                ArrayList arrayList3 = k0Var3.b;
                                                m0Var.f = arrayList3.size();
                                                list3 = arrayList3;
                                            }
                                            listArr[i9] = list3;
                                        }
                                        list2 = listArr[z0Var.c];
                                        list2.getClass();
                                        while (z0Var.d < list2.size()) {
                                            a1Var = (a1) list2.get(z0Var.d);
                                            if (z) {
                                                if (a1Var != null) {
                                                    a1Var2 = a1Var;
                                                } else {
                                                    a1Var2 = null;
                                                }
                                                if (a1Var2 != null) {
                                                    a1Var2.l = true;
                                                }
                                            }
                                            z0Var.e = true;
                                            if (a1Var.c(bVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            z0Var.d++;
                                        }
                                        z0Var.d = 0;
                                        z0Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            z0Var2 = this.k;
                            if (z0Var2 != null) {
                                g();
                                androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                                z0Var3 = this.k;
                                if (z0Var3 != null) {
                                    z0Var3.e = false;
                                }
                            }
                            aVar = this.d;
                            if (!this.f) {
                                if (f(this.m, dVar.c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = aVar.a;
                                    if (this.g) {
                                        androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.f) {
                                        androidx.compose.foundation.internal.b.a("Request was already measured!");
                                    }
                                    this.f = true;
                                    j1Var = this.e;
                                    if (j1Var != null) {
                                        iA = j1Var.a();
                                        while (i < iA) {
                                            j1Var.c(i, j);
                                        }
                                    } else {
                                        androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                        com.google.gson.b.b();
                                    }
                                    Trace.endSection();
                                    g();
                                    dVar.c = d.a(this.n, dVar.c);
                                    lVar = this.c;
                                    if (lVar != null) {
                                        lVar.invoke(this);
                                    }
                                }
                            }
                            z0 z0Var6 = this.k;
                            if (this.f) {
                                return false;
                            }
                            return false;
                        }
                    }
                } else {
                    if (this.j) {
                        z0Var = this.k;
                        if (z0Var != null) {
                            i2 = dVar.d;
                            z = this.l;
                            listArr = z0Var.b;
                            i3 = z0Var.c;
                            list = z0Var.a;
                            if (i3 < list.size()) {
                                if (z0Var.f.g) {
                                    androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                }
                                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                try {
                                    size = list.size();
                                    while (i4 < size) {
                                        ((m0) list.get(i4)).d = i2;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (z0Var.c < list.size()) {
                                        try {
                                            if (listArr[z0Var.c] == null) {
                                                if (bVar.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i10 = z0Var.c;
                                                m0Var = (m0) list.get(i10);
                                                lVar2 = m0Var.a;
                                                if (lVar2 == null) {
                                                    list3 = kotlin.collections.u.e;
                                                } else {
                                                    k0 k0Var4 = new k0(m0Var, m0Var.d);
                                                    lVar2.invoke(k0Var4);
                                                    ArrayList arrayList4 = k0Var4.b;
                                                    m0Var.f = arrayList4.size();
                                                    list3 = arrayList4;
                                                }
                                                listArr[i10] = list3;
                                            }
                                            list2 = listArr[z0Var.c];
                                            list2.getClass();
                                            while (z0Var.d < list2.size()) {
                                                a1Var = (a1) list2.get(z0Var.d);
                                                if (z) {
                                                    if (a1Var != null) {
                                                        a1Var2 = a1Var;
                                                    } else {
                                                        a1Var2 = null;
                                                    }
                                                    if (a1Var2 != null) {
                                                        a1Var2.l = true;
                                                    }
                                                }
                                                z0Var.e = true;
                                                if (a1Var.c(bVar)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                z0Var.d++;
                                            }
                                            z0Var.d = 0;
                                            z0Var.c++;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        z0Var2 = this.k;
                        if (z0Var2 != null && z0Var2.e) {
                            g();
                            androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                            z0Var3 = this.k;
                            if (z0Var3 != null) {
                                z0Var3.e = false;
                            }
                        }
                        aVar = this.d;
                        if (!this.f && aVar != null) {
                            if (f(this.m, dVar.c)) {
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    j = aVar.a;
                                    if (this.g) {
                                        androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.f) {
                                        androidx.compose.foundation.internal.b.a("Request was already measured!");
                                    }
                                    this.f = true;
                                    j1Var = this.e;
                                    if (j1Var != null) {
                                        iA = j1Var.a();
                                        while (i < iA) {
                                            j1Var.c(i, j);
                                        }
                                    } else {
                                        androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                        com.google.gson.b.b();
                                    }
                                    Trace.endSection();
                                    g();
                                    dVar.c = d.a(this.n, dVar.c);
                                    lVar = this.c;
                                    if (lVar != null) {
                                        lVar.invoke(this);
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        z0 z0Var7 = this.k;
                        if (this.f || !this.j || z0Var7 == null) {
                            return false;
                        }
                        List list5 = z0Var7.a;
                        int size2 = list5.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i11 = 0; i11 < size2; i11++) {
                            iMin = Math.min(iMin, ((m0) list5.get(i11)).e);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i12 = dVar.d;
                        dVar.d = i12 == -1 ? iMin : ((i12 * 3) + iMin) / 4;
                        int size3 = list5.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i13 = 0; i13 < size3; i13++) {
                            iMin2 = Math.min(iMin2, ((m0) list5.get(i13)).f);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 >= iMin) {
                            return false;
                        }
                        dVar.c = 0L;
                        return false;
                    }
                    if (this.m > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            j1Var2 = this.e;
                            if (j1Var2 != null) {
                                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                                j1Var2.d(new y0(0, zVar2));
                                List list6 = (List) zVar2.e;
                                z0 z0Var8 = list6 != null ? new z0(this, list6) : null;
                                this.k = z0Var8;
                                this.j = true;
                                Trace.endSection();
                                z0Var = this.k;
                                if (z0Var != null) {
                                    i2 = dVar.d;
                                    z = this.l;
                                    listArr = z0Var.b;
                                    i3 = z0Var.c;
                                    list = z0Var.a;
                                    if (i3 < list.size()) {
                                        if (z0Var.f.g) {
                                            androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i4 < size) {
                                            ((m0) list.get(i4)).d = i2;
                                        }
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (z0Var.c < list.size()) {
                                            if (listArr[z0Var.c] == null) {
                                                if (bVar.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i14 = z0Var.c;
                                                m0Var = (m0) list.get(i14);
                                                lVar2 = m0Var.a;
                                                if (lVar2 == null) {
                                                    list3 = kotlin.collections.u.e;
                                                } else {
                                                    k0 k0Var5 = new k0(m0Var, m0Var.d);
                                                    lVar2.invoke(k0Var5);
                                                    ArrayList arrayList5 = k0Var5.b;
                                                    m0Var.f = arrayList5.size();
                                                    list3 = arrayList5;
                                                }
                                                listArr[i14] = list3;
                                            }
                                            list2 = listArr[z0Var.c];
                                            list2.getClass();
                                            while (z0Var.d < list2.size()) {
                                                a1Var = (a1) list2.get(z0Var.d);
                                                if (z) {
                                                    if (a1Var != null) {
                                                        a1Var2 = a1Var;
                                                    } else {
                                                        a1Var2 = null;
                                                    }
                                                    if (a1Var2 != null) {
                                                        a1Var2.l = true;
                                                    }
                                                }
                                                z0Var.e = true;
                                                if (a1Var.c(bVar)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                z0Var.d++;
                                            }
                                            z0Var.d = 0;
                                            z0Var.c++;
                                        }
                                        Trace.endSection();
                                    }
                                }
                                z0Var2 = this.k;
                                if (z0Var2 != null) {
                                    g();
                                    androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                                    z0Var3 = this.k;
                                    if (z0Var3 != null) {
                                        z0Var3.e = false;
                                    }
                                }
                                aVar = this.d;
                                if (!this.f) {
                                    if (f(this.m, dVar.c)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = aVar.a;
                                        if (this.g) {
                                            androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            androidx.compose.foundation.internal.b.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        j1Var = this.e;
                                        if (j1Var != null) {
                                            iA = j1Var.a();
                                            while (i < iA) {
                                                j1Var.c(i, j);
                                            }
                                        } else {
                                            androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                            com.google.gson.b.b();
                                        }
                                        Trace.endSection();
                                        g();
                                        dVar.c = d.a(this.n, dVar.c);
                                        lVar = this.c;
                                        if (lVar != null) {
                                            lVar.invoke(this);
                                        }
                                    }
                                }
                                z0 z0Var9 = this.k;
                                if (this.f) {
                                    return false;
                                }
                                return false;
                            }
                            androidx.compose.foundation.internal.b.b("Should precompose before resolving nested prefetch states");
                            com.google.gson.b.b();
                            this.k = z0Var8;
                            this.j = true;
                            Trace.endSection();
                            z0Var = this.k;
                            if (z0Var != null) {
                                i2 = dVar.d;
                                z = this.l;
                                listArr = z0Var.b;
                                i3 = z0Var.c;
                                list = z0Var.a;
                                if (i3 < list.size()) {
                                    if (z0Var.f.g) {
                                        androidx.compose.foundation.internal.b.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i4 < size) {
                                        ((m0) list.get(i4)).d = i2;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (z0Var.c < list.size()) {
                                        if (listArr[z0Var.c] == null) {
                                            if (bVar.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i15 = z0Var.c;
                                            m0Var = (m0) list.get(i15);
                                            lVar2 = m0Var.a;
                                            if (lVar2 == null) {
                                                list3 = kotlin.collections.u.e;
                                            } else {
                                                k0 k0Var6 = new k0(m0Var, m0Var.d);
                                                lVar2.invoke(k0Var6);
                                                ArrayList arrayList6 = k0Var6.b;
                                                m0Var.f = arrayList6.size();
                                                list3 = arrayList6;
                                            }
                                            listArr[i15] = list3;
                                        }
                                        list2 = listArr[z0Var.c];
                                        list2.getClass();
                                        while (z0Var.d < list2.size()) {
                                            a1Var = (a1) list2.get(z0Var.d);
                                            if (z) {
                                                if (a1Var != null) {
                                                    a1Var2 = a1Var;
                                                } else {
                                                    a1Var2 = null;
                                                }
                                                if (a1Var2 != null) {
                                                    a1Var2.l = true;
                                                }
                                            }
                                            z0Var.e = true;
                                            if (a1Var.c(bVar)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            z0Var.d++;
                                        }
                                        z0Var.d = 0;
                                        z0Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            z0Var2 = this.k;
                            if (z0Var2 != null) {
                                g();
                                androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:execute:item", j2);
                                z0Var3 = this.k;
                                if (z0Var3 != null) {
                                    z0Var3.e = false;
                                }
                            }
                            aVar = this.d;
                            if (!this.f) {
                                if (f(this.m, dVar.c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = aVar.a;
                                    if (this.g) {
                                        androidx.compose.foundation.internal.b.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.f) {
                                        androidx.compose.foundation.internal.b.a("Request was already measured!");
                                    }
                                    this.f = true;
                                    j1Var = this.e;
                                    if (j1Var != null) {
                                        iA = j1Var.a();
                                        while (i < iA) {
                                            j1Var.c(i, j);
                                        }
                                    } else {
                                        androidx.compose.foundation.internal.b.b("performComposition() must be called before performMeasure()");
                                        com.google.gson.b.b();
                                    }
                                    Trace.endSection();
                                    g();
                                    dVar.c = d.a(this.n, dVar.c);
                                    lVar = this.c;
                                    if (lVar != null) {
                                        lVar.invoke(this);
                                    }
                                }
                            }
                            z0 z0Var10 = this.k;
                            if (this.f) {
                                return false;
                            }
                            return false;
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                return true;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean f(long j, long j2) {
        if (this.l) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void g() {
        long jB = kotlin.time.e.b();
        long jD = kotlin.time.f.d(jB, this.o);
        long j = jD >> 1;
        kotlin.time.g gVar = kotlin.time.a.y;
        if ((((int) jD) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j < -9223372036854L ? Long.MIN_VALUE : j * ((long) 1000000);
            }
        }
        this.n = j;
        long j2 = this.m - j;
        this.m = j2;
        this.o = jB;
        androidx.compose.ui.platform.coreshims.b.C("compose:lazy:prefetch:available_time_nanos", j2);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.f + ", isCanceled = " + this.g + " }";
    }
}
