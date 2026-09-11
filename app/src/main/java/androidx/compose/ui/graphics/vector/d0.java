package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public kotlin.jvm.functions.l a;

    public abstract void a(androidx.compose.ui.graphics.drawscope.d dVar);

    public kotlin.jvm.functions.l b() {
        return this.a;
    }

    public final void c() {
        kotlin.jvm.functions.l lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(androidx.compose.animation.e eVar) {
        this.a = eVar;
    }
}
