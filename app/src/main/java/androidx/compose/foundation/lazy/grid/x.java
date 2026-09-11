package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.g2;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.lazy.layout.j0;
import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.foundation.lazy.layout.o0;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.node.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g2 {
    public static final androidx.compose.foundation.text.input.internal.o w = androidx.compose.runtime.saveable.n.b(new a2(4), new androidx.compose.foundation.lazy.i(3));
    public final androidx.compose.foundation.lazy.a a;
    public boolean b;
    public n c;
    public final androidx.compose.foundation.lazy.v d;
    public final h1 e;
    public final androidx.compose.foundation.interaction.k f;
    public float g;
    public final androidx.compose.foundation.gestures.n h;
    public final boolean i;
    public f0 j;
    public final androidx.compose.foundation.lazy.x k;
    public final androidx.compose.foundation.lazy.layout.f l;
    public final androidx.compose.foundation.lazy.layout.v m;
    public final com.google.firebase.platforminfo.c n;
    public final m0 o;
    public final com.app.mlounge.data.music.e p;
    public final j0 q;
    public final y0 r;
    public final y0 s;
    public final h1 t;
    public final h1 u;
    public final o0 v;

    public x(int i, int i2) {
        androidx.compose.foundation.lazy.a aVar = new androidx.compose.foundation.lazy.a();
        aVar.a = -1;
        aVar.e = new androidx.compose.runtime.collection.b(new l0[16]);
        aVar.c = -1;
        this.a = aVar;
        this.d = new androidx.compose.foundation.lazy.v(i, i2, 1);
        this.e = new h1(z.a, androidx.compose.runtime.f.A);
        this.f = new androidx.compose.foundation.interaction.k();
        this.h = new androidx.compose.foundation.gestures.n(new androidx.activity.compose.g(this, 11));
        this.i = true;
        this.k = new androidx.compose.foundation.lazy.x(this, 1);
        this.l = new androidx.compose.foundation.lazy.layout.f();
        this.m = new androidx.compose.foundation.lazy.layout.v();
        this.n = new com.google.firebase.platforminfo.c(9);
        this.o = new m0(new v(this, i));
        this.p = new com.app.mlounge.data.music.e(this, 11);
        this.q = new j0();
        this.r = androidx.compose.foundation.lazy.layout.m.h();
        this.s = androidx.compose.foundation.lazy.layout.m.h();
        Boolean bool = Boolean.FALSE;
        this.t = androidx.compose.runtime.s.r(bool);
        this.u = androidx.compose.runtime.s.r(bool);
        this.v = new o0();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean a() {
        return this.h.a();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.h.c(r6, r7, r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // androidx.compose.foundation.gestures.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.compose.foundation.i1 r6, kotlin.jvm.functions.p r7, kotlin.coroutines.jvm.internal.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.w
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.w r0 = (androidx.compose.foundation.lazy.grid.w) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.w r0 = new androidx.compose.foundation.lazy.grid.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r8)
            goto L6b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L31:
            kotlin.coroutines.jvm.internal.i r6 = r0.y
            r7 = r6
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.p) r7
            androidx.compose.foundation.i1 r6 = r0.e
            kotlin.a.e(r8)
            goto L5b
        L3c:
            kotlin.a.e(r8)
            androidx.compose.runtime.h1 r8 = r5.e
            java.lang.Object r8 = r8.getValue()
            androidx.compose.foundation.lazy.grid.n r1 = androidx.compose.foundation.lazy.grid.z.a
            if (r8 != r1) goto L5b
            r0.e = r6
            r8 = r7
            kotlin.coroutines.jvm.internal.i r8 = (kotlin.coroutines.jvm.internal.i) r8
            r0.y = r8
            r0.B = r3
            androidx.compose.foundation.lazy.layout.f r8 = r5.l
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r4) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.e = r8
            r0.y = r8
            r0.B = r2
            androidx.compose.foundation.gestures.n r8 = r5.h
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r4) goto L6b
        L6a:
            return r4
        L6b:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.x.c(androidx.compose.foundation.i1, kotlin.jvm.functions.p, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final float e(float f) {
        return this.h.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(n nVar, boolean z, boolean z2) {
        Object obj;
        int i;
        ?? r0 = nVar.m;
        int i2 = nVar.p;
        int i3 = nVar.b;
        p pVar = nVar.a;
        this.o.e = r0.size();
        if (!z && this.b) {
            this.c = nVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.g -= nVar.d;
        this.e.setValue(nVar);
        this.u.setValue(Boolean.valueOf(((pVar != null ? pVar.a : 0) == 0 && i3 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(nVar.c));
        androidx.compose.foundation.lazy.v vVar = this.d;
        if (z2) {
            vVar.getClass();
            if (!(((float) i3) >= 0.0f)) {
                androidx.compose.foundation.internal.b.c("scrollOffset should be non-negative");
            }
            vVar.c.h(i3);
        } else {
            vVar.getClass();
            if (pVar != null) {
                o[] oVarArr = pVar.b;
                o oVar = oVarArr.length == 0 ? null : oVarArr[0];
                if (oVar != null) {
                    obj = oVar.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            vVar.e = obj;
            if (vVar.d || i2 > 0) {
                vVar.d = true;
                if (!(((float) i3) >= 0.0f)) {
                    androidx.compose.foundation.internal.b.c("scrollOffset should be non-negative (" + i3 + ')');
                }
                if (pVar != null) {
                    o[] oVarArr2 = pVar.b;
                    o oVar2 = oVarArr2.length != 0 ? oVarArr2[0] : null;
                    if (oVar2 != null) {
                        i = oVar2.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                vVar.a(i, i3);
            }
            if (this.i) {
                androidx.compose.foundation.lazy.a aVar = this.a;
                androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) aVar.e;
                int i4 = aVar.a;
                boolean z3 = aVar.b;
                if (i4 != -1 && !r0.isEmpty() && i4 != androidx.compose.foundation.lazy.a.b(nVar, z3)) {
                    aVar.a = -1;
                    Object[] objArr = bVar.e;
                    int i5 = bVar.z;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((l0) objArr[i6]).cancel();
                    }
                    bVar.g();
                }
                int i7 = aVar.c;
                if (i7 != -1 && aVar.d != 0.0f && i7 != i2 && !r0.isEmpty()) {
                    int iB = androidx.compose.foundation.lazy.a.b(nVar, aVar.d < 0.0f);
                    int i8 = aVar.d < 0.0f ? ((o) kotlin.collections.o.S(r0)).a + 1 : ((o) kotlin.collections.o.K(r0)).a - 1;
                    if (i8 >= 0 && i8 < i2 && iB != aVar.a && iB >= 0) {
                        aVar.a = iB;
                        bVar.g();
                        bVar.d(bVar.z, this.p.B(iB));
                    }
                }
                aVar.c = i2;
            }
        }
        if (z) {
            this.v.a(nVar.f, nVar.i, nVar.h);
        }
    }

    public final int g() {
        return this.d.b.g();
    }

    public final n h() {
        return (n) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void i(float f, n nVar) {
        if (this.i) {
            androidx.compose.foundation.lazy.a aVar = this.a;
            androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) aVar.e;
            ?? r2 = nVar.m;
            ?? r3 = nVar.m;
            k1 k1Var = nVar.q;
            if (!r2.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = androidx.compose.foundation.lazy.a.b(nVar, z);
                int i2 = z ? ((o) kotlin.collections.o.S(r3)).a + 1 : ((o) kotlin.collections.o.K(r3)).a - 1;
                if (i2 >= 0 && i2 < nVar.p) {
                    if (iB != aVar.a && iB >= 0) {
                        if (aVar.b != z) {
                            Object[] objArr = bVar.e;
                            int i3 = bVar.z;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((l0) objArr[i4]).cancel();
                            }
                        }
                        aVar.b = z;
                        aVar.a = iB;
                        bVar.g();
                        bVar.d(bVar.z, this.p.B(iB));
                    }
                    if (z) {
                        o oVar = (o) kotlin.collections.o.S(r3);
                        if (((_COROUTINE.b.A(oVar, k1Var) + ((int) (k1Var == k1.e ? oVar.n & 4294967295L : oVar.n >> 32))) + nVar.s) - nVar.o < (-f)) {
                            Object[] objArr2 = bVar.e;
                            int i5 = bVar.z;
                            while (i < i5) {
                                ((l0) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (nVar.n - _COROUTINE.b.A((o) kotlin.collections.o.K(r3), k1Var) < f) {
                        Object[] objArr3 = bVar.e;
                        int i6 = bVar.z;
                        while (i < i6) {
                            ((l0) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            aVar.d = f;
        }
    }
}
