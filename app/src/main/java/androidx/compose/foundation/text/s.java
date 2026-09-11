package androidx.compose.foundation.text;

import androidx.compose.runtime.q1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ r0 y;

    public /* synthetic */ s(r0 r0Var, int i) {
        this.e = i;
        this.y = r0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) obj;
                k1 k1VarD = this.y.d();
                if (k1VarD != null) {
                    k1VarD.c = xVar;
                }
                return kotlin.y.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.y.q.setValue(bool);
                return kotlin.y.a;
            case 2:
                r0 r0Var = this.y;
                androidx.compose.runtime.h1 h1Var = r0Var.t;
                androidx.compose.ui.text.input.x xVar2 = (androidx.compose.ui.text.input.x) obj;
                String str = xVar2.a.y;
                androidx.compose.ui.text.g gVar = r0Var.j;
                if (!kotlin.jvm.internal.l.a(str, gVar != null ? gVar.y : null)) {
                    r0Var.k.setValue(g0.e);
                    if (((Boolean) h1Var.getValue()).booleanValue()) {
                        h1Var.setValue(Boolean.FALSE);
                    } else {
                        r0Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = androidx.compose.ui.text.l0.b;
                r0Var.f(j);
                r0Var.e(j);
                r0Var.u.invoke(xVar2);
                q1 q1Var = r0Var.b;
                androidx.compose.runtime.y yVar = q1Var.a;
                if (yVar != null) {
                    yVar.s(q1Var, null);
                }
                return kotlin.y.a;
            case 3:
                this.y.r.b(((androidx.compose.ui.text.input.j) obj).a);
                return kotlin.y.a;
            default:
                return Boolean.valueOf(this.y.r.b(((androidx.compose.ui.text.input.j) obj).a));
        }
    }
}
