package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c {
    public final int B;
    public final byte[] C;
    public final DatagramPacket D;
    public Uri E;
    public DatagramSocket F;
    public MulticastSocket G;
    public InetAddress H;
    public boolean I;
    public int J;

    public b0() {
        super(true);
        this.B = 8000;
        byte[] bArr = new byte[2000];
        this.C = bArr;
        this.D = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        this.E = null;
        MulticastSocket multicastSocket = this.G;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.H;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.G = null;
        }
        DatagramSocket datagramSocket = this.F;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.F = null;
        }
        this.H = null;
        this.J = 0;
        if (this.I) {
            this.I = false;
            g();
        }
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws a0 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.J;
        DatagramPacket datagramPacket = this.D;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.F;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.J = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new a0(e, 2002);
            } catch (IOException e2) {
                throw new a0(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.J;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.C, length2 - i4, bArr, i, iMin);
        this.J -= iMin;
        return iMin;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws a0 {
        Uri uri = lVar.a;
        this.E = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.E.getPort();
        l();
        try {
            this.H = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.H, port);
            if (this.H.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.G = multicastSocket;
                multicastSocket.joinGroup(this.H);
                this.F = this.G;
            } else {
                this.F = new DatagramSocket(inetSocketAddress);
            }
            this.F.setSoTimeout(this.B);
            this.I = true;
            m(lVar);
            return -1L;
        } catch (IOException e) {
            throw new a0(e, 2001);
        } catch (SecurityException e2) {
            throw new a0(e2, 2006);
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.E;
    }
}
