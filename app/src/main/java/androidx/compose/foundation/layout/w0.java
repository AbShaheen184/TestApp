package androidx.compose.foundation.layout;

import androidx.compose.material3.q1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public static final a0 a = new a0(z.y, 1.0f);
    public static final a0 b;
    public static final a0 c;
    public static final c1 d;
    public static final c1 e;
    public static final c1 f;
    public static final c1 g;

    static {
        z zVar = z.e;
        b = new a0(zVar, 1.0f);
        z zVar2 = z.z;
        c = new a0(zVar2, 1.0f);
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        int i = 2;
        d = new c1(zVar, new androidx.compose.animation.core.g0(iVar, i), iVar);
        androidx.compose.ui.i iVar2 = androidx.compose.ui.c.G;
        e = new c1(zVar, new androidx.compose.animation.core.g0(iVar2, i), iVar2);
        androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
        int i2 = 3;
        f = new c1(zVar2, new androidx.compose.animation.core.g0(jVar, i2), jVar);
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.e;
        g = new c1(zVar2, new androidx.compose.animation.core.g0(jVar2, i2), jVar2);
    }

    public static final androidx.compose.ui.r a(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new y0(f2, f3));
    }

    public static /* synthetic */ androidx.compose.ui.r b(float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(androidx.compose.ui.o.b, f2, f3);
    }

    public static final androidx.compose.ui.r c(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(f2 == 1.0f ? b : new a0(z.e, f2));
    }

    public static final androidx.compose.ui.r d(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(f2 == 1.0f ? a : new a0(z.y, f2));
    }

    public static final androidx.compose.ui.r f(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new v0(0.0f, f2, 0.0f, f2, 5));
    }

    public static final androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new v0(0.0f, f2, 0.0f, f3, 5));
    }

    public static /* synthetic */ androidx.compose.ui.r h(androidx.compose.ui.r rVar, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return g(rVar, f2, f3);
    }

    public static final androidx.compose.ui.r i(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new v0(f2, f2, f2, f2, false));
    }

    public static final androidx.compose.ui.r j(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new v0(f2, f3, f2, f3, false));
    }

    public static androidx.compose.ui.r k(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5, int i) {
        return rVar.d(new v0(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final androidx.compose.ui.r l(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new v0(f2, f2, f2, f2, true));
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar, float f2, float f3) {
        return rVar.d(new v0(f2, f3, f2, f3, true));
    }

    public static final androidx.compose.ui.r n(androidx.compose.ui.r rVar, float f2, float f3, float f4, float f5) {
        return rVar.d(new v0(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ androidx.compose.ui.r o(androidx.compose.ui.r rVar, float f2, float f3, int i) {
        float f4 = q1.b;
        if ((i & 2) != 0) {
            f4 = Float.NaN;
        }
        return n(rVar, f2, f4, f3, Float.NaN);
    }

    public static final androidx.compose.ui.r p(androidx.compose.ui.r rVar, float f2) {
        return rVar.d(new v0(f2, 0.0f, f2, 0.0f, 10));
    }

    public static androidx.compose.ui.r q(androidx.compose.ui.r rVar) {
        c1 c1Var;
        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
        if (kotlin.jvm.internal.l.a(iVar, iVar)) {
            c1Var = d;
        } else if (kotlin.jvm.internal.l.a(iVar, androidx.compose.ui.c.G)) {
            c1Var = e;
        } else {
            c1Var = new c1(z.e, new androidx.compose.animation.core.g0(iVar, 2), iVar);
        }
        return rVar.d(c1Var);
    }

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
    public static androidx.compose.ui.r r(androidx.compose.ui.r rVar) {
        c1 c1Var;
        androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
        if (jVar.equals(jVar)) {
            c1Var = f;
        } else if (jVar.equals(androidx.compose.ui.c.e)) {
            c1Var = g;
        } else {
            c1Var = new c1(z.z, new androidx.compose.animation.core.g0(jVar, 3), jVar);
        }
        return rVar.d(c1Var);
    }
}
