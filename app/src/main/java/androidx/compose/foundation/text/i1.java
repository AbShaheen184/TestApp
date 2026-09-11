package androidx.compose.foundation.text;

import androidx.compose.foundation.a2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final androidx.compose.foundation.text.input.internal.o g = androidx.compose.runtime.saveable.n.b(new a2(6), new androidx.compose.foundation.lazy.i(14));
    public final androidx.compose.runtime.d1 a;
    public final androidx.compose.runtime.d1 b = new androidx.compose.runtime.d1(0.0f);
    public final androidx.compose.runtime.e1 c = new androidx.compose.runtime.e1(0);
    public androidx.compose.ui.geometry.c d = androidx.compose.ui.geometry.c.e;
    public long e = androidx.compose.ui.text.l0.b;
    public final androidx.compose.runtime.h1 f;

    public i1(androidx.compose.foundation.gestures.k1 k1Var, float f) {
        this.a = new androidx.compose.runtime.d1(f);
        this.f = new androidx.compose.runtime.h1(k1Var, androidx.compose.runtime.f.D);
    }

    public final void a(androidx.compose.foundation.gestures.k1 k1Var, androidx.compose.ui.geometry.c cVar, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = cVar.a;
        float f4 = cVar.b;
        androidx.compose.ui.geometry.c cVar2 = this.d;
        float f5 = cVar2.a;
        androidx.compose.runtime.d1 d1Var = this.a;
        if (f3 != f5 || f4 != cVar2.b) {
            boolean z = k1Var == androidx.compose.foundation.gestures.k1.e;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? cVar.d : cVar.c;
            float fG = d1Var.g();
            float f7 = i;
            float f8 = fG + f7;
            if (f6 <= f8 && (f3 >= fG || f6 - f3 <= f7)) {
                f = (f3 >= fG || f6 - f3 > f7) ? 0.0f : f3 - fG;
            } else {
                f = f6 - f8;
            }
            d1Var.h(d1Var.g() + f);
            this.d = cVar;
        }
        d1Var.h(com.google.android.material.resources.c.b(d1Var.g(), 0.0f, f2));
        this.c.h(i);
    }
}
