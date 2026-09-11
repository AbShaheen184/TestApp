package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final s0 a = new s0();

    public final void a(com.google.firebase.messaging.o oVar, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2;
        rVar.c0(1565826668);
        int i2 = (rVar.f(oVar) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            rVar2 = rVar;
            com.google.firebase.crashlytics.internal.model.t1.a((kotlin.jvm.functions.a) oVar.y, (androidx.compose.ui.window.w) oVar.A, androidx.compose.runtime.internal.k.c(1163527043, new e(oVar, 2), rVar), rVar2, 384, 0);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(this, oVar, i, 10);
        }
    }
}
