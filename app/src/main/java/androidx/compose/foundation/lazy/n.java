package androidx.compose.foundation.lazy;

import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;

    public /* synthetic */ n(y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new k((kotlin.jvm.functions.l) this.y.getValue());
            case 1:
                return new androidx.compose.foundation.lazy.grid.h((kotlin.jvm.functions.l) this.y.getValue());
            case 2:
                return (androidx.compose.foundation.lazy.layout.y) ((kotlin.jvm.functions.a) this.y.getValue()).invoke();
            case 3:
                Boolean bool = (Boolean) this.y.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar != null) {
                    return xVar;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.gson.b.b();
                return null;
            case 5:
                androidx.compose.ui.layout.x xVar2 = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar2 != null) {
                    return xVar2;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.gson.b.b();
                return null;
            case 6:
                androidx.compose.ui.layout.x xVar3 = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar3 != null) {
                    return xVar3;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.gson.b.b();
                return null;
            case 7:
                y0 y0Var = this.y;
                y0Var.setValue(Boolean.valueOf(!((Boolean) y0Var.getValue()).booleanValue()));
                return kotlin.y.a;
            case 8:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 9:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 10:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 11:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 12:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 13:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 14:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 15:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 16:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 17:
                this.y.setValue(null);
                return kotlin.y.a;
            case 18:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 19:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 20:
                y0 y0Var2 = this.y;
                y0Var2.setValue(Boolean.valueOf(!((Boolean) y0Var2.getValue()).booleanValue()));
                return kotlin.y.a;
            case 21:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 22:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 23:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 24:
                this.y.setValue(null);
                return kotlin.y.a;
            case 25:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 26:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 27:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 28:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            default:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
        }
    }
}
