package androidx.compose.material3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ d(int i, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, com.app.mlounge.ui.viewmodel.i0 i0Var, int i2) {
        this.e = 5;
        this.z = i;
        this.A = aVar;
        this.B = lVar;
        this.C = lVar2;
        this.y = i0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                j.d((kotlin.jvm.functions.a) this.A, (androidx.compose.ui.r) this.B, (androidx.compose.ui.window.w) this.C, (androidx.compose.runtime.internal.f) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.y).h(this.A, this.B, this.C, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                coil3.network.g.c((Boolean) this.A, this.B, (androidx.lifecycle.v) this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.components.b0.k((String) this.A, (ArrayList) this.B, this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.b((String) this.A, (ArrayList) this.B, (String) this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.z | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.s.A(1);
                com.app.mlounge.ui.screens.person.a.a(this.z, (kotlin.jvm.functions.a) this.A, (kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.l) this.C, (com.app.mlounge.ui.viewmodel.i0) this.y, (androidx.compose.runtime.r) obj, iA);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ d(androidx.compose.runtime.internal.f fVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = 1;
        this.y = fVar;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = i;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, kotlin.d dVar, int i, int i2) {
        this.e = i2;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.y = dVar;
        this.z = i;
    }
}
