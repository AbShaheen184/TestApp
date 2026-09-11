package androidx.compose.foundation.text.contextmenu.internal;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public /* synthetic */ j(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.e = i2;
        this.y = rVar;
        this.z = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.c(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
            case 1:
                k.d(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
            case 2:
                n.d(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
            case 3:
                k.b(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
            default:
                k.a(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
        }
        return y.a;
    }
}
