package androidx.compose.material3.internal;

import androidx.compose.ui.text.m0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ m0 z;

    public /* synthetic */ n(long j, m0 m0Var, kotlin.jvm.functions.p pVar, int i, int i2) {
        this.e = i2;
        this.y = j;
        this.z = m0Var;
        this.A = pVar;
        this.B = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                g.a(this.y, this.z, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                z.b(this.y, this.z, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.B | 1));
                break;
        }
        return kotlin.y.a;
    }
}
