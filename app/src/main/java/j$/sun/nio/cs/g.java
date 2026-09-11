package j$.sun.nio.cs;

import com.app.mlounge.emulator.LibretroCore;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends CharsetEncoder {
    public e a;

    public g(h hVar) {
        super(hVar, 1.1f, 3.0f);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return !Character.isSurrogate(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        int i = 2;
        int i2 = 4;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                char c = charBuffer.get();
                if (c >= 128) {
                    if (c < 2048) {
                        if (byteBuffer.remaining() < 2) {
                            return CoderResult.OVERFLOW;
                        }
                        byteBuffer.put((byte) ((c >> 6) | 192));
                        byteBuffer.put((byte) ((c & '?') | 128));
                    } else if (Character.isSurrogate(c)) {
                        if (this.a == null) {
                            this.a = new e();
                        }
                        int iA = this.a.a(c, charBuffer);
                        if (iA < 0) {
                            return this.a.a;
                        }
                        if (byteBuffer.remaining() < 4) {
                            return CoderResult.OVERFLOW;
                        }
                        byteBuffer.put((byte) ((iA >> 18) | 240));
                        byteBuffer.put((byte) (((iA >> 12) & 63) | 128));
                        byteBuffer.put((byte) (((iA >> 6) & 63) | 128));
                        byteBuffer.put((byte) ((iA & 63) | 128));
                        iPosition++;
                    } else {
                        if (byteBuffer.remaining() < 3) {
                            return CoderResult.OVERFLOW;
                        }
                        byteBuffer.put((byte) ((c >> '\f') | LibretroCore.SCREEN_HEIGHT));
                        byteBuffer.put((byte) (((c >> 6) & 63) | 128));
                        byteBuffer.put((byte) ((c & '?') | 128));
                    }
                    iPosition++;
                } else {
                    if (!byteBuffer.hasRemaining()) {
                        return CoderResult.OVERFLOW;
                    }
                    byteBuffer.put((byte) c);
                }
                iPosition++;
            }
            return CoderResult.UNDERFLOW;
        }
        char[] cArrArray = charBuffer.array();
        int iPosition2 = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        byte[] bArrArray = byteBuffer.array();
        int iPosition3 = byteBuffer.position() + byteBuffer.arrayOffset();
        int iLimit2 = byteBuffer.limit() + byteBuffer.arrayOffset();
        int iMin = Math.min(iLimit - iPosition2, iLimit2 - iPosition3) + iPosition3;
        while (iPosition3 < iMin) {
            char c2 = cArrArray[iPosition2];
            if (c2 >= 128) {
                break;
            }
            iPosition2++;
            bArrArray[iPosition3] = (byte) c2;
            iPosition3++;
        }
        while (iPosition2 < iLimit) {
            char c3 = cArrArray[iPosition2];
            if (c3 < 128) {
                if (iPosition3 >= iLimit2) {
                    h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) c3;
                iPosition3++;
            } else if (c3 < 2048) {
                if (iLimit2 - iPosition3 < i) {
                    h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                int i3 = iPosition3 + 1;
                bArrArray[iPosition3] = (byte) ((c3 >> 6) | 192);
                iPosition3 += 2;
                bArrArray[i3] = (byte) ((c3 & '?') | 128);
            } else if (Character.isSurrogate(c3)) {
                if (this.a == null) {
                    this.a = new e();
                }
                int iB = this.a.b(c3, cArrArray, iPosition2, iLimit);
                if (iB < 0) {
                    h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return this.a.a;
                }
                if (iLimit2 - iPosition3 < i2) {
                    h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) ((iB >> 18) | 240);
                bArrArray[iPosition3 + 1] = (byte) (((iB >> 12) & 63) | 128);
                int i4 = iPosition3 + 3;
                bArrArray[iPosition3 + 2] = (byte) (((iB >> 6) & 63) | 128);
                iPosition3 += 4;
                bArrArray[i4] = (byte) ((iB & 63) | 128);
                iPosition2++;
            } else {
                if (iLimit2 - iPosition3 < 3) {
                    h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
                    return CoderResult.OVERFLOW;
                }
                bArrArray[iPosition3] = (byte) ((c3 >> '\f') | LibretroCore.SCREEN_HEIGHT);
                int i5 = iPosition3 + 2;
                bArrArray[iPosition3 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                iPosition3 += 3;
                bArrArray[i5] = (byte) ((c3 & '?') | 128);
            }
            iPosition2++;
            i = 2;
            i2 = 4;
        }
        h.u(charBuffer, iPosition2, byteBuffer, iPosition3);
        return CoderResult.UNDERFLOW;
    }
}
