package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MessageBufferBE extends MessageBuffer {
    public MessageBufferBE(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i) {
        return MessageBuffer.unsafe.getDouble(this.base, this.address + ((long) i));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i) {
        return MessageBuffer.unsafe.getFloat(this.base, this.address + ((long) i));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i) {
        return MessageBuffer.unsafe.getInt(this.base, this.address + ((long) i));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i) {
        return MessageBuffer.unsafe.getLong(this.base, this.address + ((long) i));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i) {
        return MessageBuffer.unsafe.getShort(this.base, this.address + ((long) i));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i, double d) {
        MessageBuffer.unsafe.putDouble(this.base, this.address + ((long) i), d);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i, int i2) {
        MessageBuffer.unsafe.putInt(this.base, this.address + ((long) i), i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i, long j) {
        MessageBuffer.unsafe.putLong(this.base, this.address + ((long) i), j);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i, short s) {
        MessageBuffer.unsafe.putShort(this.base, this.address + ((long) i), s);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferBE slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i + i2 <= size()) {
            return new MessageBufferBE(this.base, this.address + ((long) i), i2);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    public MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private MessageBufferBE(Object obj, long j, int i) {
        super(obj, j, i);
    }
}
