package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.g2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements g2 {
    public final /* synthetic */ g2 a;
    public final androidx.compose.runtime.e0 b;
    public final androidx.compose.runtime.e0 c;

    public h1(g2 g2Var, final i1 i1Var) {
        this.a = g2Var;
        final int i = 0;
        this.b = androidx.compose.runtime.s.k(new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.g1
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        return Boolean.valueOf(i1Var2.a.g() < i1Var2.b.g());
                    default:
                        return Boolean.valueOf(i1Var.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = androidx.compose.runtime.s.k(new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.g1
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        return Boolean.valueOf(i1Var2.a.g() < i1Var2.b.g());
                    default:
                        return Boolean.valueOf(i1Var.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean a() {
        return this.a.a();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final Object c(androidx.compose.foundation.i1 i1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        return this.a.c(i1Var, pVar, cVar);
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final float e(float f) {
        return this.a.e(f);
    }
}
