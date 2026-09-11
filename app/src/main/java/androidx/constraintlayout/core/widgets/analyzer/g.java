package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
