package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ p[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p[] pVarArr, int i) {
        super(2);
        this.y = i;
        this.z = pVarArr;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                return Float.valueOf(a0.c((b1) obj, true, this.z, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(a0.c((b1) obj, false, this.z, ((Number) obj2).floatValue()));
        }
    }
}
