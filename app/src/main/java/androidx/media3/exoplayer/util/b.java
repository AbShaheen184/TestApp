package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b2 = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], Token.EXPORT);
                bArr2[b2] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b2);
                    bArr = bArr2;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    long j2 = jCurrentTimeMillis - (j * 1000);
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b3 = bArr3[b2];
                    byte b4 = (byte) ((b3 >> 6) & 3);
                    byte b5 = (byte) (b3 & 7);
                    int i3 = bArr3[1] & 255;
                    long jC = c(bArr3, 24);
                    long jC2 = c(bArr3, 32);
                    long jC3 = c(bArr3, 40);
                    if (b4 == 3) {
                        net.luminis.tls.engine.impl.c.t("SNTP: Unsynchronized server");
                    } else if (b5 != 4 && b5 != 5) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(b5, "SNTP: Untrusted mode: "));
                    } else if (i3 == 0 || i3 > 15) {
                        net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "SNTP: Untrusted stratum: "));
                    } else if (jC3 == 0) {
                        net.luminis.tls.engine.impl.c.t("SNTP: Zero transmitTime");
                    }
                    long j6 = (j5 + (((jC3 - j5) + (jC2 - jC)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i++;
                    i2 = i4;
                    b2 = b2;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static long b(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long c(byte[] bArr, int i) {
        long jB = b(bArr, i);
        long jB2 = b(bArr, i + 4);
        if (jB == 0 && jB2 == 0) {
            return 0L;
        }
        return ((jB2 * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }
}
