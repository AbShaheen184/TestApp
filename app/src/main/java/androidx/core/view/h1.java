package androidx.core.view;

import android.view.WindowInsets;
import androidx.compose.foundation.f2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends n1 {
    public final WindowInsets.Builder e;

    public h1(z1 z1Var) {
        super(z1Var);
        WindowInsets windowInsetsC = z1Var.c();
        this.e = windowInsetsC != null ? f2.d(windowInsetsC) : f2.c();
    }

    @Override // androidx.core.view.n1
    public z1 b() {
        a();
        z1 z1VarD = z1.d(null, this.e.build());
        androidx.core.graphics.c[] cVarArr = this.b;
        w1 w1Var = z1VarD.a;
        w1Var.w(cVarArr);
        w1Var.v(null);
        w1Var.B(this.c);
        w1Var.C(this.d);
        return z1VarD;
    }

    @Override // androidx.core.view.n1
    public void e(androidx.core.graphics.c cVar) {
        this.e.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // androidx.core.view.n1
    public void f(androidx.core.graphics.c cVar) {
        this.e.setStableInsets(cVar.d());
    }

    @Override // androidx.core.view.n1
    public void g(androidx.core.graphics.c cVar) {
        this.e.setSystemGestureInsets(cVar.d());
    }

    @Override // androidx.core.view.n1
    public void h(androidx.core.graphics.c cVar) {
        this.e.setSystemWindowInsets(cVar.d());
    }

    @Override // androidx.core.view.n1
    public void i(androidx.core.graphics.c cVar) {
        this.e.setTappableElementInsets(cVar.d());
    }

    public h1() {
        this.e = f2.c();
    }
}
