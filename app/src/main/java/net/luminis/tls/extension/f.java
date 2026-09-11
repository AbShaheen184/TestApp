package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public Long a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        Long l = this.a;
        int i = l == null ? 0 : 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(net.luminis.tls.d.early_data.e);
        byteBufferAllocate.putShort((short) i);
        if (l != null) {
            byteBufferAllocate.putInt((int) l.longValue());
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        String str;
        Long l = this.a;
        if (l == null) {
            str = "(empty)";
        } else {
            str = "[" + l + "]";
        }
        return "EarlyDataExtension ".concat(str);
    }
}
