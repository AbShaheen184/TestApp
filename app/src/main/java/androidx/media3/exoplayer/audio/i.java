package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Exception {
    public final int e;
    public final boolean y;

    public i(int i, boolean z) {
        super(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "AudioOutput write failed: "));
        this.y = z;
        this.e = i;
    }
}
