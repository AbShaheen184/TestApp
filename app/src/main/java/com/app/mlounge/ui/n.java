package com.app.mlounge.ui;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.r y;

    public /* synthetic */ n(androidx.compose.ui.r rVar, int i, int i2) {
        this.e = i2;
        this.y = rVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h0.a(this.y, rVar, androidx.compose.runtime.s.A(7));
                break;
            default:
                com.app.mlounge.ui.components.b0.n(this.y, rVar, androidx.compose.runtime.s.A(1));
                break;
        }
        return kotlin.y.a;
    }
}
