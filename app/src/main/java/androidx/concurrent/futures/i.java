package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public Object a;
    public k b;
    public l c;
    public boolean d;

    public final void finalize() {
        l lVar;
        k kVar = this.b;
        if (kVar != null) {
            j jVar = kVar.y;
            if (!jVar.isDone()) {
                jVar.m(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (lVar = this.c) == null) {
            return;
        }
        lVar.l(null);
    }
}
