package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        net.luminis.tls.engine.impl.c.t(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        return 0;
    }
}
