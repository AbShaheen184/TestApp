package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ l1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(l1 l1Var, int i) {
        super(2);
        this.y = i;
        this.z = l1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                this.z.a().y = (androidx.compose.runtime.v) obj2;
                break;
            case 1:
                m0 m0VarA = this.z.a();
                ((androidx.compose.ui.node.f0) obj).c0(new j0(m0VarA, (kotlin.jvm.functions.p) obj2, m0VarA.M));
                break;
            default:
                androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) obj;
                l1 l1Var = this.z;
                androidx.compose.foundation.text.input.internal.o oVar = l1Var.a;
                m0 m0Var = f0Var.f0;
                if (m0Var == null) {
                    m0Var = new m0(f0Var, oVar);
                    f0Var.f0 = m0Var;
                }
                l1Var.b = m0Var;
                l1Var.a().g();
                m0 m0VarA2 = l1Var.a();
                if (m0VarA2.z != oVar) {
                    m0VarA2.z = oVar;
                    m0VarA2.h(false);
                    androidx.compose.ui.node.f0.V(m0VarA2.e, false, 7);
                }
                break;
        }
        return kotlin.y.a;
    }
}
