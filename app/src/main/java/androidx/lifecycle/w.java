package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public o a;
    public t b;

    public final void a(v vVar, n nVar) {
        o oVarA = nVar.a();
        o oVar = this.a;
        oVar.getClass();
        if (oVarA.compareTo(oVar) < 0) {
            oVar = oVarA;
        }
        this.a = oVar;
        this.b.g(vVar, nVar);
        this.a = oVarA;
    }
}
