package androidx.compose.animation.core;

import androidx.compose.material3.t3;
import androidx.compose.material3.z2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g2(androidx.compose.runtime.internal.f fVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = 2;
        this.z = fVar;
        this.B = obj;
        this.C = obj2;
        this.A = obj3;
        this.D = obj4;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                i2.a((e2) this.z, (a2) this.A, this.B, this.C, (b0) this.D, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.j1.a((androidx.compose.material3.n0) this.z, (androidx.compose.material3.t1) this.A, (z2) this.B, (t3) this.C, (androidx.compose.runtime.internal.f) this.D, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.z).i(this.B, this.C, this.A, this.D, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y) | 1);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
        this.y = i;
    }
}
