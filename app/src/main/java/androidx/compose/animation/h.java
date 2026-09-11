package androidx.compose.animation;

import android.graphics.Canvas;
import androidx.compose.runtime.t2;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(androidx.compose.ui.focus.e0 e0Var, androidx.compose.ui.focus.p pVar, kotlin.jvm.functions.l lVar) {
        super(1);
        this.y = 4;
        this.z = e0Var;
        this.A = pVar;
        this.B = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.y) {
            case 0:
                return new g(0, (androidx.compose.runtime.snapshots.q) this.z, this.A, (v) this.B);
            case 1:
                androidx.compose.ui.graphics.k0 k0Var = (androidx.compose.ui.graphics.k0) obj;
                t2 t2Var = (t2) this.A;
                t2 t2Var2 = (t2) this.z;
                k0Var.c(t2Var2 != null ? ((Number) t2Var2.getValue()).floatValue() : 1.0f);
                k0Var.i(t2Var != null ? ((Number) t2Var.getValue()).floatValue() : 1.0f);
                k0Var.k(t2Var != null ? ((Number) t2Var.getValue()).floatValue() : 1.0f);
                t2 t2Var3 = (t2) this.B;
                k0Var.s(t2Var3 != null ? ((androidx.compose.ui.graphics.q0) t2Var3.getValue()).a : androidx.compose.ui.graphics.q0.b);
                return kotlin.y.a;
            case 2:
                y0 y0Var = (y0) this.B;
                int iOrdinal = ((m0) obj).ordinal();
                androidx.compose.ui.graphics.q0 q0Var = null;
                if (iOrdinal == 0) {
                    h1 h1Var = y0Var.a;
                } else if (iOrdinal == 1) {
                    q0Var = (androidx.compose.ui.graphics.q0) this.z;
                } else {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    h1 h1Var2 = y0Var.a;
                }
                return new androidx.compose.ui.graphics.q0(q0Var != null ? q0Var.a : androidx.compose.ui.graphics.q0.b);
            case 3:
                z1 z1Var = (z1) obj;
                androidx.compose.ui.draganddrop.g gVar = (androidx.compose.ui.draganddrop.g) z1Var;
                if (!((androidx.compose.ui.draganddrop.b) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u((androidx.compose.ui.draganddrop.g) this.A)).m8getDragAndDropManager()).b.contains(gVar) || !android.support.v4.media.session.b.d(gVar, androidx.room.r.o((com.app.mlounge.data.music.e) this.B))) {
                    return y1.e;
                }
                ((kotlin.jvm.internal.z) this.z).e = z1Var;
                return y1.z;
            case 4:
                androidx.compose.ui.focus.e0 e0Var = (androidx.compose.ui.focus.e0) obj;
                if (kotlin.jvm.internal.l.a(e0Var, (androidx.compose.ui.focus.e0) this.z)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.l.a(e0Var, ((androidx.compose.ui.focus.p) this.A).c)) {
                        net.luminis.tls.engine.impl.c.r("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.m) this.B).invoke(e0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                androidx.compose.ui.viewinterop.v vVar = (androidx.compose.ui.viewinterop.v) this.z;
                androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.A;
                androidx.compose.ui.viewinterop.v vVar2 = (androidx.compose.ui.viewinterop.v) this.B;
                androidx.compose.ui.graphics.r rVarW = ((androidx.compose.ui.graphics.drawscope.d) obj).b0().w();
                if (vVar.getView().getVisibility() != 8) {
                    vVar.V = true;
                    m1 m1Var = f0Var.L;
                    androidx.compose.ui.platform.u uVar = m1Var instanceof androidx.compose.ui.platform.u ? (androidx.compose.ui.platform.u) m1Var : null;
                    if (uVar != null) {
                        Canvas canvasA = androidx.compose.ui.graphics.d.a(rVarW);
                        uVar.getAndroidViewsHandler$ui().getClass();
                        vVar2.draw(canvasA);
                    }
                    vVar.V = false;
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.y = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
