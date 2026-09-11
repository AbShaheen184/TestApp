package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements androidx.compose.ui.graphics.n0 {
    public static final x0 b = new x0(0);
    public static final x0 c = new x0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.graphics.n0
    public final androidx.compose.ui.graphics.a0 a(long j, androidx.compose.ui.unit.m mVar, androidx.compose.ui.unit.c cVar) {
        switch (this.a) {
            case 0:
                float fG0 = cVar.g0(f0.a);
                return new androidx.compose.ui.graphics.h0(new androidx.compose.ui.geometry.c(0.0f, -fG0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fG0));
            default:
                float fG1 = cVar.g0(f0.a);
                return new androidx.compose.ui.graphics.h0(new androidx.compose.ui.geometry.c(-fG1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fG1, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
