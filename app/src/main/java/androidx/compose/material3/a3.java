package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {
    public static final androidx.compose.runtime.u2 a = new androidx.compose.runtime.u2(new androidx.activity.compose.b(24));

    public static final androidx.compose.ui.graphics.n0 a(androidx.compose.material3.tokens.u uVar, androidx.compose.runtime.r rVar) {
        z2 z2Var = (z2) rVar.j(a);
        switch (uVar.ordinal()) {
            case 0:
                return z2Var.h;
            case 1:
                return z2Var.e;
            case 2:
                return z2Var.g;
            case 3:
                return b(z2Var.e);
            case 4:
                return z2Var.a;
            case 5:
                return b(z2Var.a);
            case 6:
                return androidx.compose.foundation.shape.e.a;
            case 7:
                return z2Var.d;
            case 8:
                androidx.compose.foundation.shape.d dVar = z2Var.d;
                androidx.compose.foundation.shape.b bVar = y2.i;
                return androidx.compose.foundation.shape.d.b(dVar, bVar, null, null, bVar, 6);
            case 9:
                return z2Var.f;
            case 10:
                androidx.compose.foundation.shape.d dVar2 = z2Var.d;
                androidx.compose.foundation.shape.b bVar2 = y2.i;
                return androidx.compose.foundation.shape.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case 11:
                return b(z2Var.d);
            case 12:
                return z2Var.c;
            case 13:
                return androidx.compose.ui.graphics.a0.b;
            case 14:
                return z2Var.b;
            default:
                coil3.g.a();
                return null;
        }
    }

    public static androidx.compose.foundation.shape.d b(androidx.compose.foundation.shape.d dVar) {
        androidx.compose.foundation.shape.b bVar = y2.i;
        return androidx.compose.foundation.shape.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
