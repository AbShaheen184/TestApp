package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final c0 A;
    public static final c0 B;
    public static final c0 C;
    public static final c0 D;
    public static final c0 E;
    public static final c0 z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new c0(i, 0);
        A = new c0(i, 1);
        B = new c0(i, 2);
        C = new c0(i, 3);
        D = new c0(i, 4);
        E = new c0(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                long jA = androidx.compose.ui.graphics.t.a(((androidx.compose.ui.graphics.t) obj).a, androidx.compose.ui.graphics.colorspace.d.x);
                return new androidx.compose.animation.core.r(androidx.compose.ui.graphics.t.d(jA), androidx.compose.ui.graphics.t.h(jA), androidx.compose.ui.graphics.t.g(jA), androidx.compose.ui.graphics.t.e(jA));
            case 2:
                long j = ((androidx.compose.ui.graphics.q0) obj).a;
                return new androidx.compose.animation.core.p(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 3:
                androidx.compose.animation.core.p pVar = (androidx.compose.animation.core.p) obj;
                return new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.a0.h(pVar.a, pVar.b));
            case 4:
                return androidx.compose.animation.core.e.m(0.0f, 0.0f, null, 7);
            case 5:
                return s0.c;
            case 6:
                return new androidx.compose.ui.unit.l((((long) 0) << 32) | (4294967295L & ((long) ((int) (((androidx.compose.ui.unit.l) obj).a & 4294967295L)))));
            default:
                return new androidx.compose.ui.unit.l((((long) 0) << 32) | (4294967295L & ((long) ((int) (((androidx.compose.ui.unit.l) obj).a & 4294967295L)))));
        }
    }
}
