package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public /* synthetic */ h(kotlin.jvm.functions.p pVar, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = i;
        this.y = pVar;
        this.z = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.internal.f fVar = this.z;
        kotlin.jvm.functions.p pVar = this.y;
        int i2 = 0;
        switch (i) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                } else {
                    if (pVar == null) {
                        rVar.b0(-1102039173);
                    } else {
                        rVar.b0(795734342);
                        pVar.invoke(rVar, 0);
                    }
                    rVar.p(false);
                    fVar.invoke(rVar, 0);
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                } else {
                    float f = j.a;
                    j.b(androidx.compose.runtime.internal.k.c(-459506658, new h(pVar, fVar, i2), rVar2), rVar2, 438);
                }
                break;
        }
        return yVar;
    }
}
