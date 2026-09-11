package dagger.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public d a;

    @Override // javax.inject.a
    public final Object get() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.get();
        }
        org.mozilla.javascript.c.a();
        return null;
    }
}
