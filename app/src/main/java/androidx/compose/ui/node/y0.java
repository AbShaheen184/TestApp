package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public androidx.compose.ui.q a;
    public int b;
    public androidx.compose.runtime.collection.b c;
    public androidx.compose.runtime.collection.b d;
    public boolean e;
    public final /* synthetic */ a1 f;

    public y0(a1 a1Var, androidx.compose.ui.q qVar, int i, androidx.compose.runtime.collection.b bVar, androidx.compose.runtime.collection.b bVar2, boolean z) {
        this.f = a1Var;
        this.a = qVar;
        this.b = i;
        this.c = bVar;
        this.d = bVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        androidx.compose.runtime.collection.b bVar = this.c;
        int i3 = this.b;
        androidx.compose.ui.p pVar = (androidx.compose.ui.p) bVar.e[i + i3];
        androidx.compose.ui.p pVar2 = (androidx.compose.ui.p) this.d.e[i3 + i2];
        return kotlin.jvm.internal.l.a(pVar, pVar2) || pVar.getClass() == pVar2.getClass();
    }
}
