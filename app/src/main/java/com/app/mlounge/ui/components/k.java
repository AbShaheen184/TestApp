package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ k(int i, int i2, int i3, androidx.compose.ui.r rVar, boolean z) {
        this.y = i;
        this.B = rVar;
        this.z = i2;
        this.A = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.s.A(this.y | 1);
                b0.b(this.A, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.r) obj, iA, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.s.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.B, this.z, this.A, (androidx.compose.runtime.r) obj, iA2);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ k(boolean z, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.A = z;
        this.B = aVar;
        this.y = i;
        this.z = i2;
    }
}
