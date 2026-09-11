package net.luminis.quic.ack;

import java.net.DatagramPacket;
import java.net.URL;
import java.util.function.Predicate;
import net.luminis.quic.impl.i;
import org.jsoup.nodes.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Long) obj).longValue() <= ((Long) this.b).longValue();
            case 1:
                i iVar = (i) this.b;
                DatagramPacket datagramPacket = (DatagramPacket) obj;
                return datagramPacket.getAddress().equals(iVar.S) && datagramPacket.getPort() == iVar.P;
            case 2:
                return ((Class) this.b).isInstance((o) obj);
            default:
                return ((URL) this.b).getHost().startsWith((String) obj);
        }
    }
}
