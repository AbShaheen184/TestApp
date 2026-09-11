package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends IOException {
    public final b e;

    public b0(b bVar) {
        super("stream was reset: " + bVar);
        this.e = bVar;
    }
}
