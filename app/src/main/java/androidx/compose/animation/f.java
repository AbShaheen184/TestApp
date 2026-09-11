package androidx.compose.animation;

import androidx.compose.ui.platform.k1;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(androidx.compose.ui.platform.a aVar, int i, int i2) {
        super(2);
        this.y = i2;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                m0 m0Var = (m0) obj;
                m0 m0Var2 = (m0) obj2;
                m0 m0Var3 = m0.z;
                return Boolean.valueOf(m0Var == m0Var3 && m0Var2 == m0Var3 && !((y0) this.z).a.c);
            case 1:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
                androidx.compose.ui.r rVarB = (androidx.compose.ui.p) obj2;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) this.z;
                if (rVarB instanceof androidx.compose.ui.m) {
                    kotlin.jvm.functions.q qVar = ((androidx.compose.ui.m) rVarB).b;
                    kotlin.jvm.internal.c0.c(3, qVar);
                    rVarB = androidx.compose.ui.a.b(rVar2, (androidx.compose.ui.r) qVar.invoke(androidx.compose.ui.o.b, rVar2, 0));
                }
                return rVar.d(rVarB);
            case 2:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((androidx.compose.ui.platform.a) this.z).a(0, rVar3);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
            case 3:
                ((Number) obj2).intValue();
                ((k1) this.z).a(androidx.compose.runtime.s.A(1), (androidx.compose.runtime.r) obj);
                return kotlin.y.a;
            case 4:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ = rVar4.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.compose.ui.window.d.z;
                        rVar4.l0(objQ);
                    }
                    t1.d(androidx.compose.ui.semantics.n.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ), (kotlin.jvm.functions.p) ((androidx.compose.runtime.y0) this.z).getValue(), rVar4, 0);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
            case 5:
                ((Number) obj2).intValue();
                ((androidx.compose.ui.window.v) this.z).a(androidx.compose.runtime.s.A(1), (androidx.compose.runtime.r) obj);
                return kotlin.y.a;
            default:
                ((Number) obj2).intValue();
                ((androidx.compose.ui.window.z) this.z).a(androidx.compose.runtime.s.A(1), (androidx.compose.runtime.r) obj);
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i) {
        super(2);
        this.y = i;
        this.z = obj;
    }
}
