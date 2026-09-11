package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    public /* synthetic */ t(long j, kotlin.jvm.functions.p pVar, int i) {
        this.e = i;
        this.y = j;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z.c(this.y, this.z, rVar, 0);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z.c(this.y, this.z, rVar2, 0);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
