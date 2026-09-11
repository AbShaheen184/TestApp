package j$.sun.nio.cs;

import com.app.mlounge.emulator.LibretroCore;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends CharsetDecoder {
    public static boolean a(int i, int i2, int i3) {
        return ((i != -32 || (i2 & LibretroCore.SCREEN_HEIGHT) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    public static boolean b(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    public static boolean c(int i) {
        return (i & 192) != 128;
    }

    public f(h hVar) {
        super(hVar, 1.0f, 1.0f);
    }

    public static CoderResult e(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1 || i == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i == 3) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            if ((b != -32 || (b2 & 224) != 128) && !c(b2)) {
                i2 = 2;
            }
            return CoderResult.malformedForLength(i2);
        }
        if (i != 4) {
            return null;
        }
        int i3 = byteBuffer.get() & 255;
        byte b3 = byteBuffer.get();
        int i4 = b3 & 255;
        if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (b3 & 240) != 128) || c(i4)))) {
            return CoderResult.malformedForLength(1);
        }
        if (c(byteBuffer.get())) {
            return CoderResult.malformedForLength(2);
        }
        return CoderResult.malformedForLength(3);
    }

    public static CoderResult d(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        CoderResult coderResultE = e(byteBuffer, i3);
        h.u(byteBuffer, i, charBuffer, i2);
        return coderResultE;
    }

    public static CoderResult g(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
        h.u(buffer, i, buffer2, i3);
        return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    public static CoderResult f(Buffer buffer, int i, int i2) {
        buffer.position(i);
        return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr;
        int i;
        byte b = -32;
        int i2 = 2;
        if (!byteBuffer.hasArray() || !charBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            while (iPosition < iLimit) {
                byte b2 = byteBuffer.get();
                if (b2 >= 0) {
                    if (charBuffer.remaining() < 1) {
                        return f(byteBuffer, iPosition, 1);
                    }
                    charBuffer.put((char) b2);
                    iPosition++;
                } else {
                    if ((b2 >> 5) == -2 && (b2 & 30) != 0) {
                        int i3 = 2;
                        if (iLimit - iPosition >= 2) {
                            if (charBuffer.remaining() < 1) {
                                i3 = 2;
                            } else {
                                byte b3 = byteBuffer.get();
                                if (c(b3)) {
                                    return CoderResult.malformedForLength(1);
                                }
                                charBuffer.put((char) (((b2 << 6) ^ b3) ^ 3968));
                                iPosition += 2;
                            }
                        }
                        return f(byteBuffer, iPosition, i3);
                    }
                    if ((b2 >> 4) == -2) {
                        int i4 = iLimit - iPosition;
                        if (i4 < 3 || charBuffer.remaining() < 1) {
                            if (i4 > 1) {
                                byte b4 = byteBuffer.get();
                                if ((b2 == -32 && (b4 & 224) == 128) || (b4 & 192) != 128) {
                                    return CoderResult.malformedForLength(1);
                                }
                            }
                            return f(byteBuffer, iPosition, 3);
                        }
                        byte b5 = byteBuffer.get();
                        byte b6 = byteBuffer.get();
                        if (a(b2, b5, b6)) {
                            CoderResult coderResultE = e(byteBuffer, 3);
                            return coderResultE;
                        }
                        char c = (char) (((b2 << 12) ^ (b5 << 6)) ^ (b6 ^ (-123008)));
                        if (Character.isSurrogate(c)) {
                            return CoderResult.malformedForLength(3);
                        }
                        charBuffer.put(c);
                        iPosition += 3;
                    } else {
                        if ((b2 >> 3) != -2) {
                            CoderResult coderResultE2 = e(byteBuffer, 1);
                            return coderResultE2;
                        }
                        int i5 = iLimit - iPosition;
                        if (i5 < 4 || charBuffer.remaining() < 2) {
                            int i6 = b2 & 255;
                            if (i6 > 244 || (i5 > 1 && b(i6, byteBuffer.get() & 255))) {
                                return CoderResult.malformedForLength(1);
                            }
                            if (i5 <= 2 || (byteBuffer.get() & 192) == 128) {
                                return f(byteBuffer, iPosition, 4);
                            }
                            return CoderResult.malformedForLength(2);
                        }
                        byte b7 = byteBuffer.get();
                        byte b8 = byteBuffer.get();
                        byte b9 = byteBuffer.get();
                        int i7 = (((b2 << 18) ^ (b7 << 12)) ^ (b8 << 6)) ^ (b9 ^ 3678080);
                        if ((b7 & 192) != 128 || (b8 & 192) != 128 || (b9 & 192) != 128 || !Character.isSupplementaryCodePoint(i7)) {
                            CoderResult coderResultE3 = e(byteBuffer, 4);
                            return coderResultE3;
                        }
                        charBuffer.put(Character.highSurrogate(i7));
                        charBuffer.put(Character.lowSurrogate(i7));
                        iPosition += 4;
                    }
                }
            }
            return f(byteBuffer, iPosition, 0);
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition2 = byteBuffer.position() + byteBuffer.arrayOffset();
        int iLimit2 = byteBuffer.limit() + byteBuffer.arrayOffset();
        char[] cArrArray = charBuffer.array();
        int iPosition3 = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit3 = charBuffer.limit() + charBuffer.arrayOffset();
        int iMin = Math.min(iLimit2 - iPosition2, iLimit3 - iPosition3) + iPosition3;
        while (iPosition3 < iMin) {
            byte b10 = bArrArray[iPosition2];
            if (b10 < 0) {
                break;
            }
            iPosition2++;
            cArrArray[iPosition3] = (char) b10;
            iPosition3++;
        }
        int i8 = iPosition3;
        while (iPosition2 < iLimit2) {
            byte b11 = bArrArray[iPosition2];
            if (b11 < 0) {
                int i9 = iPosition2;
                byte b12 = b;
                int i10 = i8;
                bArr = bArrArray;
                if ((b11 >> 5) != -2 || (b11 & 30) == 0) {
                    if ((b11 >> 4) == -2) {
                        int i11 = iLimit2 - i9;
                        if (i11 < 3 || i10 >= iLimit3) {
                            if (i11 > 1) {
                                byte b13 = bArr[i9 + 1];
                                if ((b11 == b12 && (b13 & 224) == 128) || (b13 & 192) != 128) {
                                    h.u(byteBuffer, i9, charBuffer, i10);
                                    return CoderResult.malformedForLength(1);
                                }
                            }
                            return g(byteBuffer, i9, iLimit2, charBuffer, i10, 3);
                        }
                        byte b14 = bArr[i9 + 1];
                        byte b15 = bArr[i9 + 2];
                        if (a(b11, b14, b15)) {
                            return d(byteBuffer, i9, charBuffer, i10, 3);
                        }
                        char c2 = (char) (((b11 << 12) ^ (b14 << 6)) ^ (b15 ^ (-123008)));
                        if (Character.isSurrogate(c2)) {
                            h.u(byteBuffer, i9, charBuffer, i10);
                            return CoderResult.malformedForLength(3);
                        }
                        i = i10 + 1;
                        cArrArray[i10] = c2;
                        iPosition2 = i9 + 3;
                    } else {
                        if ((b11 >> 3) != -2) {
                            return d(byteBuffer, i9, charBuffer, i10, 1);
                        }
                        int i12 = iLimit2 - i9;
                        if (i12 < 4 || iLimit3 - i10 < 2) {
                            int i13 = b11 & 255;
                            if (i13 > 244 || (i12 > 1 && b(i13, bArr[i9 + 1] & 255))) {
                                h.u(byteBuffer, i9, charBuffer, i10);
                                return CoderResult.malformedForLength(1);
                            }
                            if (i12 <= 2 || (bArr[i9 + 2] & 192) == 128) {
                                return g(byteBuffer, i9, iLimit2, charBuffer, i10, 4);
                            }
                            h.u(byteBuffer, i9, charBuffer, i10);
                            return CoderResult.malformedForLength(2);
                        }
                        byte b16 = bArr[i9 + 1];
                        byte b17 = bArr[i9 + 2];
                        byte b18 = bArr[i9 + 3];
                        int i14 = (((b11 << 18) ^ (b16 << 12)) ^ (b17 << 6)) ^ (b18 ^ 3678080);
                        if ((b16 & 192) != 128 || (b17 & 192) != 128 || (b18 & 192) != 128 || !Character.isSupplementaryCodePoint(i14)) {
                            return d(byteBuffer, i9, charBuffer, i10, 4);
                        }
                        cArrArray[i10] = Character.highSurrogate(i14);
                        cArrArray[i10 + 1] = Character.lowSurrogate(i14);
                        iPosition2 = i9 + 4;
                        i = i10 + 2;
                    }
                } else {
                    if (iLimit2 - i9 < i2 || i10 >= iLimit3) {
                        return g(byteBuffer, i9, iLimit2, charBuffer, i10, 2);
                    }
                    byte b19 = bArr[i9 + 1];
                    if (c(b19)) {
                        h.u(byteBuffer, i9, charBuffer, i10);
                        return CoderResult.malformedForLength(1);
                    }
                    cArrArray[i10] = (char) (((b11 << 6) ^ b19) ^ 3968);
                    iPosition2 = i9 + 2;
                    i = i10 + 1;
                }
            } else {
                if (i8 >= iLimit3) {
                    return g(byteBuffer, iPosition2, iLimit2, charBuffer, i8, 1);
                }
                int i15 = i8;
                bArr = bArrArray;
                cArrArray[i15] = (char) b11;
                iPosition2++;
                i = i15 + 1;
            }
            bArrArray = bArr;
            i8 = i;
            b = -32;
            i2 = 2;
        }
        return g(byteBuffer, iPosition2, iLimit2, charBuffer, i8, 0);
    }
}
