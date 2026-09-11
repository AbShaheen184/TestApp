package androidx.compose.animation;

import androidx.compose.animation.core.e2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ e2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlin.jvm.functions.l lVar, e2 e2Var) {
        super(3);
        this.y = lVar;
        this.z = e2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) obj;
        androidx.compose.ui.layout.c1 c1VarF = ((androidx.compose.ui.layout.p0) obj2).F(((androidx.compose.ui.unit.a) obj3).a);
        if (s0Var.U()) {
            if (((Boolean) this.y.invoke(this.z.d.getValue())).booleanValue()) {
                j = (((long) c1VarF.e) << 32) | (((long) c1VarF.y) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) c1VarF.e) << 32) | (((long) c1VarF.y) & 4294967295L);
        }
        return s0Var.q((int) (j >> 32), (int) (4294967295L & j), kotlin.collections.v.e, new e0(c1VarF, 0));
    }
}
