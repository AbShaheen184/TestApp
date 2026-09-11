package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public Object y;

    public /* synthetic */ z0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                float[] fArr = ((androidx.compose.ui.graphics.f0) obj).a;
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y;
                if (xVar.l()) {
                    androidx.compose.ui.layout.a0.g(xVar).J(xVar, fArr);
                }
                return kotlin.y.a;
            case 1:
                ((androidx.compose.runtime.g) this.y).cancel();
                return kotlin.y.a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.ui.input.pointer.a0 a0Var = (androidx.compose.ui.input.pointer.a0) this.y;
                if (a0Var != null) {
                    a0Var.d = zBooleanValue;
                }
                return kotlin.y.a;
            case 3:
                ((okhttp3.internal.connection.m) this.y).cancel();
                return kotlin.y.a;
            default:
                this.y.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ z0() {
        this.e = 2;
    }
}
