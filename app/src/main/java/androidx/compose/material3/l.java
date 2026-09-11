package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.r A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ l(String str, boolean z, androidx.compose.foundation.contextmenu.d dVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.a aVar, int i) {
        this.e = 2;
        this.y = str;
        this.B = z;
        this.C = dVar;
        this.A = rVar;
        this.D = qVar;
        this.z = aVar;
        this.E = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                p.b((androidx.compose.runtime.internal.f) this.y, this.z, this.A, this.B, (l1) this.C, (androidx.compose.foundation.layout.m0) this.D, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.E | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                q1.b((androidx.compose.runtime.internal.f) this.y, this.z, this.A, this.B, (l1) this.C, (androidx.compose.foundation.layout.m0) this.D, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.E | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.contextmenu.l.c((String) this.y, this.B, (androidx.compose.foundation.contextmenu.d) this.C, this.A, (kotlin.jvm.functions.q) this.D, this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.E | 1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ l(androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, l1 l1Var, androidx.compose.foundation.layout.m0 m0Var, int i, int i2) {
        this.e = i2;
        this.y = fVar;
        this.z = aVar;
        this.A = rVar;
        this.B = z;
        this.C = l1Var;
        this.D = m0Var;
        this.E = i;
    }
}
