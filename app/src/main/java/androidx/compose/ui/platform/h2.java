package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static final androidx.compose.runtime.u2 a = new androidx.compose.runtime.u2(e2.z);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(androidx.compose.foundation.text.input.internal.q qVar, androidx.compose.animation.core.f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        f2 f2Var;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i = f2Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2Var.y = i - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(cVar);
            }
        } else {
            f2Var = new f2(cVar);
        }
        Object obj = f2Var.e;
        int i2 = f2Var.y;
        if (i2 != 0) {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                kotlin.a.e(obj);
                com.google.gson.b.b();
                return;
            }
        }
        kotlin.a.e(obj);
        if (!qVar.e.K) {
            net.luminis.tls.engine.impl.c.o("establishTextInputSession called from an unattached node");
            return;
        }
        androidx.compose.ui.node.m1 m1VarU = androidx.compose.ui.node.k.u(qVar);
        androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) androidx.compose.ui.node.k.t(qVar).Z;
        jVar.getClass();
        if (androidx.compose.runtime.s.s(jVar, a) != null) {
            androidx.transition.k.i();
        } else {
            f2Var.y = 1;
            b(m1VarU, fVar, f2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(androidx.compose.ui.node.m1 m1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        g2 g2Var;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i = g2Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2Var.y = i - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(cVar);
            }
        } else {
            g2Var = new g2(cVar);
        }
        Object obj = g2Var.e;
        int i2 = g2Var.y;
        if (i2 == 0) {
            kotlin.a.e(obj);
            g2Var.y = 1;
            ((u) m1Var).L(pVar, g2Var);
        } else if (i2 == 1) {
            kotlin.a.e(obj);
            com.google.gson.b.b();
        } else if (i2 != 2) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
        } else {
            kotlin.a.e(obj);
            com.google.gson.b.b();
        }
    }
}
