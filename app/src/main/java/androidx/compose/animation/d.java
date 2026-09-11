package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements kotlin.jvm.functions.q {
    public final /* synthetic */ l0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 l0Var) {
        super(3);
        this.y = l0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.layout.c1 c1VarF = ((androidx.compose.ui.layout.p0) obj2).F(((androidx.compose.ui.unit.a) obj3).a);
        return ((androidx.compose.ui.layout.s0) obj).q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new c(0, c1VarF, this.y));
    }
}
