package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public final androidx.compose.foundation.text.input.internal.o a;
    public m0 b;
    public final k1 c = new k1(this, 2);
    public final k1 d = new k1(this, 0);
    public final k1 e = new k1(this, 1);

    public l1(androidx.compose.foundation.text.input.internal.o oVar) {
        this.a = oVar;
    }

    public final m0 a() {
        m0 m0Var = this.b;
        if (m0Var != null) {
            return m0Var;
        }
        net.luminis.tls.engine.impl.c.o("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
