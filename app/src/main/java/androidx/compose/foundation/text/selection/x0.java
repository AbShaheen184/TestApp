package androidx.compose.foundation.text.selection;

import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, boolean z, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.z = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new x0((c1) this.A, this.z, dVar, 0);
            default:
                return new x0((com.app.mlounge.ui.viewmodel.k) this.A, this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.text.g gVarR;
        androidx.compose.ui.platform.g1 g1Var;
        switch (this.e) {
            case 0:
                c1 c1Var = (c1) this.A;
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                if (androidx.compose.ui.text.l0.c(c1Var.n().b) || (c1Var.f instanceof androidx.compose.ui.text.input.r)) {
                    gVarR = null;
                } else {
                    gVarR = com.google.firebase.b.r(c1Var.n());
                    if (this.z) {
                        int iE = androidx.compose.ui.text.l0.e(c1Var.n().b);
                        c1Var.c.invoke(c1.e(c1Var.n().a, androidx.compose.ui.text.d0.b(iE, iE)));
                        c1Var.q(androidx.compose.foundation.text.g0.e);
                    }
                }
                if (gVarR == null || (g1Var = c1Var.h) == null) {
                    return yVar;
                }
                androidx.compose.ui.platform.f1 f1VarA = androidx.compose.foundation.internal.d.a(gVarR);
                this.y = 1;
                ((androidx.compose.ui.platform.g) g1Var).a(f1VarA);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return yVar == aVar ? aVar : yVar;
            default:
                int i2 = this.y;
                kotlin.y yVar2 = kotlin.y.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return yVar2;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                y1 y1Var = ((com.app.mlounge.ui.viewmodel.k) this.A).b;
                this.y = 1;
                Object objS = android.support.v4.media.session.b.s(z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.c(this.z, null, 4), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objS != aVar2) {
                    objS = yVar2;
                }
                return objS == aVar2 ? aVar2 : yVar2;
        }
    }
}
