package androidx.compose.animation.core;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final k1 a = e.m(0.0f, 0.0f, null, 7);

    static {
        Object obj = v2.a;
        e.m(0.0f, 0.0f, new androidx.compose.ui.unit.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final androidx.compose.runtime.t2 a(float f, k1 k1Var, androidx.compose.runtime.r rVar) {
        return b(new androidx.compose.ui.unit.f(f), e.l, k1Var, null, "DpAnimation", rVar, 0, 8);
    }

    public static final androidx.compose.runtime.t2 b(Object obj, l2 l2Var, m mVar, Float f, String str, androidx.compose.runtime.r rVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objQ = rVar.Q();
        Object obj2 = androidx.compose.runtime.m.a;
        if (objQ == obj2) {
            objQ = androidx.compose.runtime.s.r(null);
            rVar.l0(objQ);
        }
        androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ;
        Object objQ2 = rVar.Q();
        if (objQ2 == obj2) {
            objQ2 = new d(obj, l2Var, f);
            rVar.l0(objQ2);
        }
        d dVar = (d) objQ2;
        Object objV = androidx.compose.runtime.s.v(null, rVar);
        if (f != null && (mVar instanceof k1)) {
            k1 k1Var = (k1) mVar;
            if (!kotlin.jvm.internal.l.a(k1Var.c, f)) {
                mVar = new k1(k1Var.a, k1Var.b, f);
            }
        }
        Object objV2 = androidx.compose.runtime.s.v(mVar, rVar);
        Object objQ3 = rVar.Q();
        if (objQ3 == obj2) {
            objQ3 = ChannelKt.Channel$default(-1, null, null, 6, null);
            rVar.l0(objQ3);
        }
        Object obj3 = (Channel) objQ3;
        boolean zH = rVar.h(obj3) | rVar.h(obj);
        Object objQ4 = rVar.Q();
        if (zH || objQ4 == obj2) {
            objQ4 = new androidx.activity.compose.f(2, obj3, obj);
            rVar.l0(objQ4);
        }
        androidx.compose.runtime.j0.e((kotlin.jvm.functions.a) objQ4, rVar);
        boolean zH2 = rVar.h(obj3) | rVar.h(dVar) | rVar.f(objV2) | rVar.f(objV);
        Object objQ5 = rVar.Q();
        if (zH2 || objQ5 == obj2) {
            Object gVar = new g(obj3, dVar, objV2, objV, (kotlin.coroutines.d) null, 0);
            rVar.l0(gVar);
            objQ5 = gVar;
        }
        androidx.compose.runtime.j0.c(rVar, obj3, (kotlin.jvm.functions.p) objQ5);
        androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) y0Var.getValue();
        return t2Var == null ? dVar.c : t2Var;
    }
}
