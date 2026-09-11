package net.luminis.tls.handshake;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public byte[] a;
    public X509Certificate b;
    public ArrayList c;
    public byte[] d;

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        return this.d;
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.certificate;
    }

    public final void e(ByteBuffer byteBuffer) {
        int i = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        int i2 = 0;
        while (i > 0) {
            int i3 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            if (i3 > 0) {
                try {
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
                    if (i2 == 0) {
                        this.b = x509Certificate;
                    }
                    this.c.add(x509Certificate);
                } catch (CertificateException unused) {
                    throw new net.luminis.tls.alert.a("could not parse certificate", 0);
                }
            }
            int i4 = i - (i3 + 3);
            i2++;
            int i5 = byteBuffer.getShort() & 65535;
            byteBuffer.get(new byte[i5]);
            i = i4 - (i5 + 2);
        }
    }
}
