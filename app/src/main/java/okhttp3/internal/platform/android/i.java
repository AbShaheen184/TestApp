package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    @Override // okhttp3.internal.platform.android.l
    public final boolean b(SSLSocket sSLSocket) {
        return k.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.l
    public final n h(SSLSocket sSLSocket) {
        return new k();
    }
}
