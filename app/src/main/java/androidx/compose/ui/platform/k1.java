package androidx.compose.ui.platform;

import com.app.mlounge.MainActivity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a {
    public final androidx.compose.runtime.h1 F;
    public boolean G;

    public k1(MainActivity mainActivity) {
        super(mainActivity);
        this.F = androidx.compose.runtime.s.r(null);
    }

    @Override // androidx.compose.ui.platform.a
    public final void a(int i, androidx.compose.runtime.r rVar) {
        rVar.c0(420213850);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.F.getValue();
            if (pVar == null) {
                rVar.b0(-1238823553);
            } else {
                rVar.b0(98585282);
                pVar.invoke(rVar, 0);
            }
            rVar.p(false);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.f(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return k1.class.getName();
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public final void setContent(kotlin.jvm.functions.p pVar) {
        this.G = true;
        this.F.setValue(pVar);
        if (isAttachedToWindow()) {
            if (this.A != null || isAttachedToWindow()) {
                d();
            } else {
                net.luminis.tls.engine.impl.c.r("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
