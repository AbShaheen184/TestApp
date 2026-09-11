package net.luminis.quic.crypto;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Exception {
    public final int e;

    public g(int i, boolean z) {
        StringBuilder sb = new StringBuilder("Missing keys for encryption level ");
        sb.append(com.google.android.datatransport.runtime.backends.c.y(i));
        sb.append(z ? " (keys discarded)" : " (keys not installed)");
        super(sb.toString());
        this.e = z ? 2 : 1;
    }
}
