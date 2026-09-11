package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final /* synthetic */ k E;

    public j(k kVar) {
        this.E = kVar;
    }

    @Override // androidx.concurrent.futures.h
    public final String j() {
        i iVar = (i) this.E.e.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.a + "]";
    }
}
