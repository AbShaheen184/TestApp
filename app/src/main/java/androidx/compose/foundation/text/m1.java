package androidx.compose.foundation.text;

import androidx.compose.animation.core.u2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {
    public static final u2 a = new u2(androidx.compose.ui.text.input.p.a, 0, 0);

    public static final androidx.compose.ui.text.input.e0 a(androidx.compose.ui.text.input.g0 g0Var, androidx.compose.ui.text.g gVar) {
        androidx.compose.ui.text.input.e0 e0VarB = g0Var.b(gVar);
        int length = gVar.y.length();
        androidx.compose.ui.text.g gVar2 = e0VarB.a;
        androidx.compose.ui.text.input.q qVar = e0VarB.b;
        int length2 = gVar2.y.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(qVar.v(i), length2, i);
        }
        b(qVar.v(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(qVar.j(i2), length, i2);
        }
        c(qVar.j(length2), length, length2);
        return new androidx.compose.ui.text.input.e0(gVar2, new u2(qVar, gVar.y.length(), gVar2.y.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", i3, " is not in range of transformed text [0, ", i);
        sbW.append(i2);
        sbW.append(']');
        androidx.compose.foundation.internal.b.c(sbW.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", i3, " is not in range of original text [0, ", i);
        sbW.append(i2);
        sbW.append(']');
        androidx.compose.foundation.internal.b.c(sbW.toString());
    }
}
