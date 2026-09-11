package retrofit2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {
    public final /* synthetic */ int e;
    public final j y;

    public /* synthetic */ h(j jVar, int i) {
        this.e = i;
        this.y = jVar;
    }

    @Override // retrofit2.g
    public final void b(d dVar, Throwable th) {
        switch (this.e) {
            case 0:
                this.y.completeExceptionally(th);
                break;
            default:
                this.y.completeExceptionally(th);
                break;
        }
    }

    @Override // retrofit2.g
    public final void g(d dVar, r0 r0Var) {
        switch (this.e) {
            case 0:
                boolean z = r0Var.a.N;
                j jVar = this.y;
                if (!z) {
                    jVar.completeExceptionally(new q(r0Var));
                } else {
                    jVar.complete(r0Var.b);
                }
                break;
            default:
                this.y.complete(r0Var);
                break;
        }
    }
}
