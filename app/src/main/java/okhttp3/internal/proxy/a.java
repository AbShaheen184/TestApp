package okhttp3.internal.proxy;

import com.google.common.base.c;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ProxySelector {
    public static final a a = new a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return c.p(Proxy.NO_PROXY);
        }
        net.luminis.tls.engine.impl.c.o("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
