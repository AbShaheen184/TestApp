package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends IllegalStateException {
    public final String e;

    public l(String str) {
        this.e = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}
