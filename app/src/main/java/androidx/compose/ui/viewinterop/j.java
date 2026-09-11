package androidx.compose.ui.viewinterop;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.r A;
    public final /* synthetic */ kotlin.jvm.functions.l B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int y = 1;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, int i) {
        super(2);
        this.z = lVar;
        this.A = rVar;
        this.B = lVar2;
        this.C = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                ((Number) obj2).intValue();
                int iA = androidx.compose.runtime.s.A(49);
                int i = this.C;
                i.b(this.z, this.A, this.B, (androidx.compose.runtime.r) obj, iA, i);
                break;
            default:
                ((Number) obj2).intValue();
                int iA2 = androidx.compose.runtime.s.A(this.C | 1);
                i.a(this.z, this.A, this.B, (androidx.compose.runtime.r) obj, iA2);
                break;
        }
        return y.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, int i, int i2) {
        super(2);
        this.z = lVar;
        this.A = rVar;
        this.B = lVar2;
        this.C = i2;
    }
}
