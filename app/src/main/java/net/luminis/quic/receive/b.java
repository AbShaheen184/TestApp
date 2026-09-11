package net.luminis.quic.receive;

import com.appsalt.internal.x0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.k;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public volatile DatagramSocket a;
    public final net.luminis.quic.log.a b;
    public final x0 c;
    public final net.luminis.quic.ack.a d;
    public final Thread e;
    public final LinkedBlockingQueue f;
    public volatile boolean g = false;

    public b(DatagramSocket datagramSocket, net.luminis.quic.log.a aVar, x0 x0Var, net.luminis.quic.ack.a aVar2) {
        this.a = datagramSocket;
        Objects.requireNonNull(aVar);
        this.b = aVar;
        this.c = x0Var;
        this.d = aVar2;
        Thread thread = new Thread(new k(this, 12), "receiver");
        this.e = thread;
        thread.setDaemon(true);
        this.f = new LinkedBlockingQueue();
        try {
            datagramSocket.getReceiveBufferSize();
        } catch (SocketException unused) {
        }
    }
}
