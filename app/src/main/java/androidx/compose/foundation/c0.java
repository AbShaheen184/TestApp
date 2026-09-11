package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ d1 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.semantics.h z;

    public c0(d1 d1Var, boolean z, androidx.compose.ui.semantics.h hVar, kotlin.jvm.functions.a aVar) {
        this.e = d1Var;
        this.y = z;
        this.z = hVar;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
        ((Number) obj3).intValue();
        rVar.b0(-1525724089);
        Object objQ = rVar.Q();
        if (objQ == androidx.compose.runtime.m.a) {
            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
        }
        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
        androidx.compose.ui.r rVarD = a1.a(androidx.compose.ui.o.b, kVar, this.e).d(new b0(kVar, null, false, this.y, null, this.z, this.A));
        rVar.p(false);
        return rVarD;
    }
}
