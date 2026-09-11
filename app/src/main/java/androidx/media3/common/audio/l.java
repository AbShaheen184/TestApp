package androidx.media3.common.audio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Exception {
    public l(String str, j jVar) {
        super(str + " " + jVar);
    }

    public l(j jVar) {
        this("Unhandled input format:", jVar);
    }
}
