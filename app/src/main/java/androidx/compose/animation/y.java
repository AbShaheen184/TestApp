package androidx.compose.animation;

import androidx.compose.animation.core.e2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.r A;
    public final /* synthetic */ x0 B;
    public final /* synthetic */ y0 C;
    public final /* synthetic */ kotlin.jvm.functions.p D;
    public final /* synthetic */ androidx.compose.runtime.internal.f E;
    public final /* synthetic */ int F;
    public final /* synthetic */ e2 y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e2 e2Var, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.internal.f fVar, int i) {
        super(2);
        this.y = e2Var;
        this.z = lVar;
        this.A = rVar;
        this.B = x0Var;
        this.C = y0Var;
        this.D = pVar;
        this.E = fVar;
        this.F = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g0.a(this.y, this.z, this.A, this.B, this.C, this.D, this.E, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.F | 1));
        return kotlin.y.a;
    }
}
