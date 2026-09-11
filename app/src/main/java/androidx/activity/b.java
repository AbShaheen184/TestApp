package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ b(p pVar, int i) {
        this.e = i;
        this.y = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.invalidateMenu();
                break;
            default:
                p.f(this.y);
                break;
        }
    }
}
