package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m(boolean z, kotlin.jvm.functions.p pVar, int i) {
        this.e = 2;
        this.A = z;
        this.z = pVar;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.s.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.z, 48, this.A, (androidx.compose.runtime.r) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.s.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.z, 48, this.A, (androidx.compose.runtime.r) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = androidx.compose.runtime.s.A(this.y | 1);
                androidx.room.r.b(this.A, (kotlin.jvm.functions.p) this.z, (androidx.compose.runtime.r) obj, iA3);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ m(int i, int i2, int i3, androidx.compose.ui.r rVar, boolean z) {
        this.e = i3;
        this.y = i;
        this.z = rVar;
        this.A = z;
    }
}
