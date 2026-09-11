package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ kotlin.d E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ int z;

    public /* synthetic */ c0(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, a0 a0Var, b0 b0Var, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.y = rVar;
        this.B = n0Var;
        this.C = a0Var;
        this.D = b0Var;
        this.E = fVar;
        this.z = i;
        this.A = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                t2.c(this.y, (androidx.compose.ui.graphics.n0) this.B, (a0) this.C, (b0) this.D, (androidx.compose.runtime.internal.f) this.E, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1), this.A);
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.o((String) this.B, (String) this.C, (androidx.compose.ui.graphics.vector.f) this.D, this.y, (kotlin.jvm.functions.a) this.E, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1), this.A);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ c0(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.B = str;
        this.C = str2;
        this.D = fVar;
        this.y = rVar;
        this.E = aVar;
        this.z = i;
        this.A = i2;
    }
}
