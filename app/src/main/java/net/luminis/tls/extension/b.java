package net.luminis.tls.extension;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final ArrayList a = new ArrayList();

    public b(ByteBuffer byteBuffer) throws net.luminis.tls.alert.a {
        int iB = b(byteBuffer, net.luminis.tls.d.certificate_authorities.e, 2);
        int i = byteBuffer.getShort();
        if (iB != i + 2) {
            net.luminis.tls.engine.impl.c.g("inconsistent length fields");
            throw null;
        }
        while (i > 0) {
            if (i < 2) {
                net.luminis.tls.engine.impl.c.g("inconsistent length fields");
                throw null;
            }
            int i2 = i - 2;
            int i3 = byteBuffer.getShort() & 65535;
            if (i3 > i2) {
                net.luminis.tls.engine.impl.c.g("inconsistent length fields");
                throw null;
            }
            if (i3 > byteBuffer.remaining()) {
                net.luminis.tls.engine.impl.c.g("inconsistent length fields");
                throw null;
            }
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            i = i2 - i3;
            try {
                this.a.add(new X500Principal(bArr));
            } catch (IllegalArgumentException unused) {
                net.luminis.tls.engine.impl.c.g("authority not in DER format");
                throw null;
            }
        }
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        ArrayList<X500Principal> arrayList = this.a;
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((X500Principal) it.next()).getEncoded().length;
        }
        int size = (arrayList.size() * 2) + length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(net.luminis.tls.d.certificate_authorities.e);
        byteBufferAllocate.putShort((short) (size + 2));
        byteBufferAllocate.putShort((short) size);
        for (X500Principal x500Principal : arrayList) {
            byteBufferAllocate.putShort((short) x500Principal.getEncoded().length);
            byteBufferAllocate.put(x500Principal.getEncoded());
        }
        return byteBufferAllocate.array();
    }
}
