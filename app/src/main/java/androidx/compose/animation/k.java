package androidx.compose.animation;

import androidx.compose.animation.core.e2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ androidx.compose.ui.r B;
    public final /* synthetic */ androidx.compose.runtime.internal.f C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int y = 0;
    public final /* synthetic */ e2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e2 e2Var, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.ui.e eVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar, int i) {
        super(2);
        this.z = e2Var;
        this.B = rVar;
        this.A = lVar;
        this.F = eVar;
        this.E = lVar2;
        this.C = fVar;
        this.D = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                ((Number) obj2).intValue();
                androidx.compose.ui.e eVar = (androidx.compose.ui.e) this.F;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.E;
                m.a(this.z, this.B, this.A, eVar, lVar, this.C, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.D | 1));
                break;
            default:
                ((Number) obj2).intValue();
                x0 x0Var = (x0) this.E;
                y0 y0Var = (y0) this.F;
                g0.c(this.z, this.A, this.B, x0Var, y0Var, this.C, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.D | 1));
                break;
        }
        return kotlin.y.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e2 e2Var, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, androidx.compose.runtime.internal.f fVar, int i) {
        super(2);
        this.z = e2Var;
        this.A = lVar;
        this.B = rVar;
        this.E = x0Var;
        this.F = y0Var;
        this.C = fVar;
        this.D = i;
    }
}
