package androidx.compose.animation;

import androidx.compose.animation.core.y1;
import androidx.compose.runtime.t2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ int y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, long j, int i) {
        super(1);
        this.y = i;
        this.z = uVar;
        this.A = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        androidx.compose.animation.core.b0 b0Var;
        long j2;
        switch (this.y) {
            case 0:
                y1 y1Var = (y1) obj;
                Object objB = y1Var.b();
                u uVar = this.z;
                if (kotlin.jvm.internal.l.a(objB, uVar.N.b())) {
                    j = androidx.compose.ui.unit.l.a(uVar.O, m.a) ? this.A : uVar.O;
                } else {
                    t2 t2Var = (t2) uVar.N.d.g(y1Var.b());
                    j = t2Var != null ? ((androidx.compose.ui.unit.l) t2Var.getValue()).a : 0L;
                }
                t2 t2Var2 = (t2) uVar.N.d.g(y1Var.c());
                long j3 = t2Var2 != null ? ((androidx.compose.ui.unit.l) t2Var2.getValue()).a : 0L;
                f1 f1Var = (f1) uVar.M.getValue();
                return (f1Var == null || (b0Var = (androidx.compose.animation.core.b0) f1Var.a.invoke(new androidx.compose.ui.unit.l(j), new androidx.compose.ui.unit.l(j3))) == null) ? androidx.compose.animation.core.e.m(0.0f, 400.0f, null, 5) : b0Var;
            default:
                u uVar2 = this.z;
                if (kotlin.jvm.internal.l.a(obj, uVar2.N.b())) {
                    j2 = androidx.compose.ui.unit.l.a(uVar2.O, m.a) ? this.A : uVar2.O;
                } else {
                    t2 t2Var3 = (t2) uVar2.N.d.g(obj);
                    j2 = t2Var3 != null ? ((androidx.compose.ui.unit.l) t2Var3.getValue()).a : 0L;
                }
                return new androidx.compose.ui.unit.l(j2);
        }
    }
}
