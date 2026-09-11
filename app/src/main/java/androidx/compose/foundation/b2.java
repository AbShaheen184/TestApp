package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements androidx.compose.foundation.gestures.g2 {
    public static final androidx.compose.foundation.text.input.internal.o j = new androidx.compose.foundation.text.input.internal.o(13, new a2(0), new androidx.compose.animation.core.n1(27));
    public final androidx.compose.runtime.e1 a;
    public float f;
    public final androidx.compose.runtime.e0 h;
    public final androidx.compose.runtime.e0 i;
    public final androidx.compose.runtime.e1 b = new androidx.compose.runtime.e1(0);
    public final androidx.compose.runtime.e1 c = new androidx.compose.runtime.e1(0);
    public final androidx.compose.foundation.interaction.k d = new androidx.compose.foundation.interaction.k();
    public final androidx.compose.runtime.e1 e = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
    public final androidx.compose.foundation.gestures.n g = new androidx.compose.foundation.gestures.n(new androidx.activity.compose.g(this, 4));

    public b2(int i) {
        this.a = new androidx.compose.runtime.e1(i);
        final int i2 = 0;
        this.h = androidx.compose.runtime.s.k(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.z1
            public final /* synthetic */ b2 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        b2 b2Var = this.y;
                        return Boolean.valueOf(b2Var.a.g() < b2Var.e.g());
                    default:
                        return Boolean.valueOf(this.y.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = androidx.compose.runtime.s.k(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.z1
            public final /* synthetic */ b2 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        b2 b2Var = this.y;
                        return Boolean.valueOf(b2Var.a.g() < b2Var.e.g());
                    default:
                        return Boolean.valueOf(this.y.a.g() > 0);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean a() {
        return this.g.a();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final Object c(i1 i1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objC = this.g.c(i1Var, pVar, cVar);
        return objC == kotlin.coroutines.intrinsics.a.e ? objC : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final float e(float f) {
        return this.g.e(f);
    }
}
