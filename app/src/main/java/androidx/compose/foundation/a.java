package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ j y;

    public /* synthetic */ a(j jVar, int i) {
        this.e = i;
        this.y = jVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.compose.ui.node.i iVar;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.b0 b0Var = a1.a;
                j jVar = this.y;
                d1 d1Var = (d1) androidx.compose.ui.node.k.h(jVar, b0Var);
                if (d1Var == null) {
                    androidx.compose.foundation.internal.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + d1Var);
                }
                d1 d1Var2 = jVar.V;
                jVar.V = d1Var;
                if (d1Var2 != null && !kotlin.jvm.internal.l.a(d1Var, d1Var2) && ((iVar = jVar.X) != null || !jVar.e0)) {
                    if (iVar != null) {
                        jVar.M0(iVar);
                    }
                    jVar.X = null;
                    jVar.V0();
                }
                return kotlin.y.a;
            default:
                this.y.T.invoke();
                return Boolean.TRUE;
        }
    }
}
