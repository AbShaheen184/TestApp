package net.luminis.tls.extension;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {
    public ArrayList a;
    public ArrayList b;
    public int c;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        Iterator it = this.a.iterator();
        int length = 0;
        int length2 = 0;
        while (it.hasNext()) {
            length2 += ((d) it.next()).a.length + 6;
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            length += ((c) it2.next()).a.length + 1;
        }
        int i = length2 + 4 + length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(net.luminis.tls.d.pre_shared_key.e);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) length2);
        for (d dVar : this.a) {
            byteBufferAllocate.putShort((short) dVar.a.length);
            byteBufferAllocate.put(dVar.a);
            byteBufferAllocate.putInt((int) dVar.b);
        }
        this.c = byteBufferAllocate.position();
        byteBufferAllocate.putShort((short) length);
        for (c cVar : this.b) {
            byteBufferAllocate.put((byte) cVar.a.length);
            byteBufferAllocate.put(cVar.a);
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        byteBufferAllocate.get(bArr);
        return bArr;
    }
}
