package net.luminis.tls.extension;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    public List a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        List list = this.a;
        int size = list.size() * 2;
        int i = size + 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(net.luminis.tls.d.signature_algorithms.e);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) (list.size() * 2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((net.luminis.tls.h) it.next()).e);
        }
        return byteBufferAllocate.array();
    }
}
