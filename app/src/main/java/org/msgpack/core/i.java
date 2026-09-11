package org.msgpack.core;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Closeable {
    public static final MessageBuffer L = MessageBuffer.wrap(new byte[0]);
    public final CodingErrorAction A;
    public final int B;
    public final int C;
    public final org.msgpack.core.buffer.a D;
    public int F;
    public int H;
    public StringBuilder I;
    public CharsetDecoder J;
    public CharBuffer K;
    public final boolean e;
    public final boolean y;
    public final CodingErrorAction z;
    public MessageBuffer E = L;
    public final MessageBuffer G = MessageBuffer.allocate(8);

    public i(org.msgpack.core.buffer.a aVar, g gVar) {
        this.D = aVar;
        gVar.getClass();
        this.e = true;
        this.y = true;
        this.z = gVar.e;
        this.A = gVar.y;
        this.B = gVar.z;
        this.C = gVar.B;
    }

    public static c L(String str, byte b) {
        String str2;
        b bVar = b.i0[b & 255];
        b bVar2 = b.NEVER_USED;
        if (bVar == bVar2) {
            return new e(androidx.privacysandbox.ads.adservices.java.internal.a.q("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"), 0);
        }
        if (bVar == bVar2) {
            bVar.getClass();
            throw new c("Cannot convert NEVER_USED to ValueType", 0);
        }
        switch (bVar.e) {
            case 1:
                str2 = "NIL";
                break;
            case 2:
                str2 = "BOOLEAN";
                break;
            case 3:
                str2 = "INTEGER";
                break;
            case 4:
                str2 = "FLOAT";
                break;
            case 5:
                str2 = "STRING";
                break;
            case 6:
                str2 = "BINARY";
                break;
            case 7:
                str2 = "ARRAY";
                break;
            case 8:
                str2 = "MAP";
                break;
            case 9:
                str2 = "EXTENSION";
                break;
            default:
                throw null;
        }
        return new c(String.format("Expected %s, but got %s (%02x)", str, str2.substring(0, 1) + str2.substring(1).toLowerCase(), Byte.valueOf(b)), 4);
    }

    public final int N() {
        byte b = readByte();
        if ((b & (-16)) == -112) {
            return b & 15;
        }
        if (b == -36) {
            return w(2).getShort(this.H) & 65535;
        }
        if (b != -35) {
            throw L("Array", b);
        }
        int i = w(4).getInt(this.H);
        if (i >= 0) {
            return i;
        }
        throw new c(2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[RETURN] */
    public final int X() {
        int i;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int i2 = -1;
        switch (b) {
            case -60:
                i = readByte() & 255;
                break;
            case -59:
                i = w(2).getShort(this.H) & 65535;
                break;
            case -58:
                i = w(4).getInt(this.H);
                if (i < 0) {
                    throw new c(2);
                }
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            return i;
        }
        if (this.e) {
            switch (b) {
                case -39:
                    i2 = readByte() & 255;
                    if (i2 >= 0) {
                        return i2;
                    }
                    break;
                case -38:
                    i2 = w(2).getShort(this.H) & 65535;
                    if (i2 >= 0) {
                        return i2;
                    }
                    break;
                case -37:
                    i2 = w(4).getInt(this.H);
                    if (i2 < 0) {
                        throw new c(2);
                    }
                    if (i2 >= 0) {
                        return i2;
                    }
                    break;
                default:
                    if (i2 >= 0) {
                        return i2;
                    }
                    break;
            }
        }
        throw L("Binary", b);
    }

    public final byte Y() {
        long j;
        byte b = readByte();
        int i = b & 255;
        if (i <= 127 || i >= 224) {
            return b;
        }
        switch (b) {
            case -52:
                byte b2 = readByte();
                if (b2 >= 0) {
                    return b2;
                }
                throw new d(BigInteger.valueOf(b2 & 255));
            case -51:
                short s = w(2).getShort(this.H);
                if (s < 0 || s > 127) {
                    throw new d(BigInteger.valueOf(s & 65535));
                }
                return (byte) s;
            case -50:
                int i2 = w(4).getInt(this.H);
                if (i2 < 0 || i2 > 127) {
                    throw new d(BigInteger.valueOf(((long) (i2 & Integer.MAX_VALUE)) + 2147483648L));
                }
                return (byte) i2;
            case -49:
                j = w(8).getLong(this.H);
                if (j < 0 || j > 127) {
                    throw new d(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s2 = w(2).getShort(this.H);
                if (s2 < -128 || s2 > 127) {
                    throw new d(BigInteger.valueOf(s2));
                }
                return (byte) s2;
            case -46:
                int i3 = w(4).getInt(this.H);
                if (i3 < -128 || i3 > 127) {
                    throw new d(BigInteger.valueOf(i3));
                }
                return (byte) i3;
            case -45:
                j = w(8).getLong(this.H);
                if (j < -128 || j > 127) {
                    throw new d(BigInteger.valueOf(j));
                }
                break;
            default:
                throw L("Integer", b);
        }
        return (byte) j;
    }

    public final int Z() {
        byte b = readByte();
        if ((b & (-16)) == -128) {
            return b & 15;
        }
        if (b == -34) {
            return w(2).getShort(this.H) & 65535;
        }
        if (b != -33) {
            throw L("Map", b);
        }
        int i = w(4).getInt(this.H);
        if (i >= 0) {
            return i;
        }
        throw new c(2);
    }

    public final String a(int i) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.z == codingErrorAction && this.A == codingErrorAction && this.E.hasArray()) {
            String str = new String(this.E.array(), this.E.arrayOffset() + this.F, i, h.a);
            this.F += i;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.J.decode(this.E.sliceAsByteBuffer(this.F, i));
            this.F += i;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e) {
            throw new c(e);
        }
    }

    public final String a0() {
        int i;
        int i2;
        int iLimit;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            iLimit = b & 31;
        } else {
            switch (b) {
                case -39:
                    i = readByte() & 255;
                    break;
                case -38:
                    i = w(2).getShort(this.H) & 65535;
                    break;
                case -37:
                    i = w(4).getInt(this.H);
                    if (i < 0) {
                        throw new c(2);
                    }
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i < 0) {
                if (this.y) {
                    switch (b) {
                        case -60:
                            i2 = readByte() & 255;
                            break;
                        case -59:
                            i2 = 65535 & w(2).getShort(this.H);
                            break;
                        case -58:
                            i2 = w(4).getInt(this.H);
                            if (i2 < 0) {
                                throw new c(2);
                            }
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    if (i2 >= 0) {
                        iLimit = i2;
                    }
                }
                throw L("String", b);
            }
            iLimit = i;
        }
        if (iLimit == 0) {
            return "";
        }
        int i3 = this.B;
        if (iLimit > i3) {
            throw new c(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(i3), Integer.valueOf(iLimit)), 2);
        }
        CharsetDecoder charsetDecoder = this.J;
        if (charsetDecoder == null) {
            this.K = CharBuffer.allocate(this.C);
            this.J = h.a.newDecoder().onMalformedInput(this.z).onUnmappableCharacter(this.A);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.I;
        if (sb == null) {
            this.I = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        if (this.E.size() - this.F >= iLimit) {
            return a(iLimit);
        }
        while (iLimit > 0) {
            try {
                int size = this.E.size();
                int i4 = this.F;
                int i5 = size - i4;
                if (i5 >= iLimit) {
                    this.I.append(a(iLimit));
                    return this.I.toString();
                }
                if (i5 == 0) {
                    m();
                } else {
                    ByteBuffer byteBufferSliceAsByteBuffer = this.E.sliceAsByteBuffer(i4, i5);
                    int iPosition = byteBufferSliceAsByteBuffer.position();
                    this.K.clear();
                    CoderResult coderResultDecode = this.J.decode(byteBufferSliceAsByteBuffer, this.K, false);
                    int iPosition2 = byteBufferSliceAsByteBuffer.position() - iPosition;
                    this.F += iPosition2;
                    iLimit -= iPosition2;
                    this.I.append(this.K.flip());
                    if (coderResultDecode.isError()) {
                        g(coderResultDecode);
                    }
                    if (coderResultDecode.isUnderflow() && iPosition2 < i5) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Integer.numberOfLeadingZeros((~(this.E.getByte(this.F) & 255)) << 24));
                        MessageBuffer messageBuffer = this.E;
                        messageBuffer.getBytes(this.F, messageBuffer.size() - this.F, byteBufferAllocate);
                        while (true) {
                            m();
                            int iRemaining = byteBufferAllocate.remaining();
                            int size2 = this.E.size();
                            MessageBuffer messageBuffer2 = this.E;
                            if (size2 >= iRemaining) {
                                messageBuffer2.getBytes(0, iRemaining, byteBufferAllocate);
                                this.F = iRemaining;
                                byteBufferAllocate.position(0);
                                this.K.clear();
                                CoderResult coderResultDecode2 = this.J.decode(byteBufferAllocate, this.K, false);
                                if (coderResultDecode2.isError()) {
                                    g(coderResultDecode2);
                                }
                                if (coderResultDecode2.isOverflow() || (coderResultDecode2.isUnderflow() && byteBufferAllocate.position() < byteBufferAllocate.limit())) {
                                    try {
                                        coderResultDecode2.throwException();
                                        throw new c("Unexpected UTF-8 multibyte sequence", 0);
                                    } catch (Exception e) {
                                        throw new c("Unexpected UTF-8 multibyte sequence", e);
                                    }
                                }
                                iLimit -= byteBufferAllocate.limit();
                                this.I.append(this.K.flip());
                            } else {
                                messageBuffer2.getBytes(0, messageBuffer2.size(), byteBufferAllocate);
                                this.F = this.E.size();
                            }
                        }
                    }
                }
            } catch (CharacterCodingException e2) {
                throw new c(e2);
            }
        }
        return this.I.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E = L;
        this.F = 0;
        this.D.close();
    }

    public final void g(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.z == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.A == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final void m() {
        MessageBuffer messageBuffer;
        org.msgpack.core.buffer.a aVar = this.D;
        if (aVar.y) {
            messageBuffer = null;
        } else {
            aVar.y = true;
            messageBuffer = aVar.e;
        }
        if (messageBuffer == null) {
            throw new c(1);
        }
        this.E.size();
        this.E = messageBuffer;
        this.F = 0;
    }

    public final byte readByte() {
        int size = this.E.size();
        int i = this.F;
        if (size > i) {
            byte b = this.E.getByte(i);
            this.F++;
            return b;
        }
        m();
        if (this.E.size() <= 0) {
            return readByte();
        }
        byte b2 = this.E.getByte(0);
        this.F = 1;
        return b2;
    }

    public final MessageBuffer w(int i) {
        int size = this.E.size();
        int i2 = this.F;
        int i3 = size - i2;
        if (i3 >= i) {
            this.H = i2;
            this.F = i2 + i;
            return this.E;
        }
        MessageBuffer messageBuffer = this.G;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.E, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            m();
            int size2 = this.E.size();
            MessageBuffer messageBuffer2 = this.E;
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, messageBuffer2, 0, i);
                this.F = i;
                this.H = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, messageBuffer2, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final byte[] z(int i) {
        MessageBuffer messageBuffer;
        int i2 = 0;
        if (i > 67108864) {
            ArrayList<byte[]> arrayList = new ArrayList();
            int i3 = i;
            int i4 = 0;
            while (i3 > 0) {
                int size = this.E.size() - this.F;
                if (size == 0) {
                    org.msgpack.core.buffer.a aVar = this.D;
                    if (aVar.y) {
                        messageBuffer = null;
                    } else {
                        aVar.y = true;
                        messageBuffer = aVar.e;
                    }
                    if (messageBuffer == null) {
                        throw new c(String.format("Payload declared %,d bytes but input ended after %,d bytes", Integer.valueOf(i), Integer.valueOf(i4)), 2);
                    }
                    this.E.size();
                    this.E = messageBuffer;
                    this.F = 0;
                    size = messageBuffer.size();
                }
                int iMin = Math.min(i3, size);
                byte[] bArr = new byte[iMin];
                this.E.getBytes(this.F, bArr, 0, iMin);
                arrayList.add(bArr);
                i4 += iMin;
                this.F += iMin;
                i3 -= iMin;
            }
            if (arrayList.size() == 1) {
                return (byte[]) arrayList.get(0);
            }
            byte[] bArr2 = new byte[i];
            int length = 0;
            for (byte[] bArr3 : arrayList) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            return bArr2;
        }
        byte[] bArr4 = new byte[i];
        while (true) {
            int size2 = this.E.size();
            int i5 = this.F;
            int i6 = size2 - i5;
            MessageBuffer messageBuffer2 = this.E;
            if (i6 >= i) {
                messageBuffer2.getBytes(i5, bArr4, i2, i);
                this.F += i;
                return bArr4;
            }
            messageBuffer2.getBytes(i5, bArr4, i2, i6);
            i2 += i6;
            i -= i6;
            this.F += i6;
            m();
        }
    }
}
