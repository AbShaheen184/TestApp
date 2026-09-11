package org.msgpack.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable, Flushable {
    public static final boolean E;
    public final org.msgpack.core.buffer.b A;
    public MessageBuffer B;
    public int C;
    public CharsetEncoder D;
    public final int e;
    public final int y;
    public final boolean z;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        E = z;
    }

    public a(f fVar) {
        fVar.getClass();
        this.A = new org.msgpack.core.buffer.b();
        this.e = 512;
        this.y = 8192;
        this.z = true;
        this.C = 0;
    }

    public final void L() {
        b0((byte) -61);
    }

    public final void N(int i) {
        if (i < -32) {
            if (i < -32768) {
                d0(i, (byte) -46);
                return;
            } else if (i < -128) {
                e0((byte) -47, (short) i);
                return;
            } else {
                c0((byte) -48, (byte) i);
                return;
            }
        }
        if (i < 128) {
            b0((byte) i);
            return;
        }
        if (i < 256) {
            c0((byte) -52, (byte) i);
        } else if (i < 65536) {
            e0((byte) -51, (short) i);
        } else {
            d0(i, (byte) -50);
        }
    }

    public final void X(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("map size must be >= 0");
            return;
        }
        if (i < 16) {
            b0((byte) (i | (-128)));
        } else if (i < 65536) {
            e0((byte) -34, (short) i);
        } else {
            d0(i, (byte) -33);
        }
    }

    public final void Y(int i) {
        if (i < 32) {
            b0((byte) (i | (-96)));
            return;
        }
        if (this.z && i < 256) {
            c0((byte) -39, (byte) i);
        } else if (i < 65536) {
            e0((byte) -38, (short) i);
        } else {
            d0(i, (byte) -37);
        }
    }

    public final void Z(String str) {
        if (str.length() <= 0) {
            Y(0);
            return;
        }
        if (E || str.length() < this.e) {
            byte[] bytes = str.getBytes(h.a);
            Y(bytes.length);
            a(bytes);
            return;
        }
        if (str.length() < 256) {
            m((str.length() * 6) + 3);
            int iG = g(this.C + 2, str);
            if (iG >= 0) {
                if (this.z && iG < 256) {
                    MessageBuffer messageBuffer = this.B;
                    int i = this.C;
                    this.C = i + 1;
                    messageBuffer.putByte(i, (byte) -39);
                    MessageBuffer messageBuffer2 = this.B;
                    int i2 = this.C;
                    this.C = i2 + 1;
                    messageBuffer2.putByte(i2, (byte) iG);
                    this.C += iG;
                    return;
                }
                if (iG >= 65536) {
                    net.luminis.tls.engine.impl.c.o("Unexpected UTF-8 encoder state");
                    return;
                }
                MessageBuffer messageBuffer3 = this.B;
                int i3 = this.C;
                messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, iG);
                MessageBuffer messageBuffer4 = this.B;
                int i4 = this.C;
                this.C = i4 + 1;
                messageBuffer4.putByte(i4, (byte) -38);
                this.B.putShort(this.C, (short) iG);
                this.C = this.C + 2 + iG;
                return;
            }
        } else if (str.length() < 65536) {
            m((str.length() * 6) + 5);
            int iG2 = g(this.C + 3, str);
            if (iG2 >= 0) {
                MessageBuffer messageBuffer5 = this.B;
                int i5 = this.C;
                if (iG2 < 65536) {
                    this.C = i5 + 1;
                    messageBuffer5.putByte(i5, (byte) -38);
                    this.B.putShort(this.C, (short) iG2);
                    this.C = this.C + 2 + iG2;
                    return;
                }
                messageBuffer5.putMessageBuffer(i5 + 5, messageBuffer5, i5 + 3, iG2);
                MessageBuffer messageBuffer6 = this.B;
                int i6 = this.C;
                this.C = i6 + 1;
                messageBuffer6.putByte(i6, (byte) -37);
                this.B.putInt(this.C, iG2);
                this.C = this.C + 4 + iG2;
                return;
            }
        }
        byte[] bytes2 = str.getBytes(h.a);
        Y(bytes2.length);
        a(bytes2);
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        MessageBuffer messageBuffer = this.B;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.C;
            if (size - i >= length && length <= this.y) {
                this.B.putBytes(i, bArr, 0, length);
                this.C += length;
                return;
            }
        }
        flush();
        org.msgpack.core.buffer.b bVar = this.A;
        bVar.getClass();
        bVar.e.add(MessageBuffer.wrap(bArr, 0, length));
    }

    public final byte[] a0() {
        try {
            flush();
            ArrayList<MessageBuffer> arrayList = this.A.e;
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((MessageBuffer) it.next()).size();
            }
            byte[] bArr = new byte[size];
            int size2 = 0;
            for (MessageBuffer messageBuffer : arrayList) {
                messageBuffer.getBytes(0, bArr, size2, messageBuffer.size());
                size2 += messageBuffer.size();
            }
            return bArr;
        } catch (IOException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    public final void b0(byte b) {
        m(1);
        MessageBuffer messageBuffer = this.B;
        int i = this.C;
        this.C = i + 1;
        messageBuffer.putByte(i, b);
    }

    public final void c0(byte b, byte b2) {
        m(2);
        MessageBuffer messageBuffer = this.B;
        int i = this.C;
        this.C = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.B;
        int i2 = this.C;
        this.C = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        org.msgpack.core.buffer.b bVar = this.A;
        try {
            flush();
        } finally {
            bVar.getClass();
        }
    }

    public final void d0(int i, byte b) {
        m(5);
        MessageBuffer messageBuffer = this.B;
        int i2 = this.C;
        this.C = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.B.putInt(this.C, i);
        this.C += 4;
    }

    public final void e0(byte b, short s) {
        m(3);
        MessageBuffer messageBuffer = this.B;
        int i = this.C;
        this.C = i + 1;
        messageBuffer.putByte(i, b);
        this.B.putShort(this.C, s);
        this.C += 2;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.C > 0) {
            w();
        }
        this.A.getClass();
    }

    public final int g(int i, String str) {
        if (this.D == null) {
            CharsetEncoder charsetEncoderNewEncoder = h.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.D = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.D.reset();
        MessageBuffer messageBuffer = this.B;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.D.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new c(e);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.D.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    public final void m(int i) {
        MessageBuffer messageBufferAllocate;
        MessageBuffer messageBufferAllocate2;
        MessageBuffer messageBuffer = this.B;
        org.msgpack.core.buffer.b bVar = this.A;
        if (messageBuffer == null) {
            MessageBuffer messageBuffer2 = bVar.y;
            if (messageBuffer2 == null || messageBuffer2.size() <= i) {
                messageBufferAllocate2 = MessageBuffer.allocate(Math.max(8192, i));
                bVar.y = messageBufferAllocate2;
            } else {
                messageBufferAllocate2 = bVar.y;
            }
            this.B = messageBufferAllocate2;
            return;
        }
        if (this.C + i >= messageBuffer.size()) {
            w();
            MessageBuffer messageBuffer3 = bVar.y;
            if (messageBuffer3 == null || messageBuffer3.size() <= i) {
                messageBufferAllocate = MessageBuffer.allocate(Math.max(8192, i));
                bVar.y = messageBufferAllocate;
            } else {
                messageBufferAllocate = bVar.y;
            }
            this.B = messageBufferAllocate;
        }
    }

    public final void w() {
        int i = this.C;
        org.msgpack.core.buffer.b bVar = this.A;
        bVar.e.add(bVar.y.slice(0, i));
        if (bVar.y.size() - i > 2048) {
            MessageBuffer messageBuffer = bVar.y;
            bVar.y = messageBuffer.slice(i, messageBuffer.size() - i);
        } else {
            bVar.y = null;
        }
        this.B = null;
        this.C = 0;
    }

    public final void z(int i) {
        if (i < 256) {
            c0((byte) -60, (byte) i);
        } else if (i < 65536) {
            e0((byte) -59, (short) i);
        } else {
            d0(i, (byte) -58);
        }
    }
}
