package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.y = i;
        this.z = qVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.z;
                return Double.valueOf(qVar.n.a(com.google.android.material.resources.c.a(dDoubleValue, qVar.e, qVar.f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.z;
                return Double.valueOf(com.google.android.material.resources.c.a(qVar2.k.a(dDoubleValue2), qVar2.e, qVar2.f));
        }
    }
}
