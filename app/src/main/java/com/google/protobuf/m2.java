package com.google.protobuf;

import com.app.mlounge.emulator.LibretroCore;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends com.google.android.material.resources.b {
    public final /* synthetic */ int a;

    public /* synthetic */ m2(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // com.google.android.material.resources.b
    public final String g(byte[] bArr, int i, int i2) throws x0 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw x0.b();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || com.google.android.material.motion.a.y(b6)) {
                                    throw x0.b();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw x0.b();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!com.google.android.material.motion.a.y(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !com.google.android.material.motion.a.y(b7) && !com.google.android.material.motion.a.y(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw x0.b();
                                }
                                if (i3 < i5 - 1) {
                                    throw x0.b();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!com.google.android.material.motion.a.y(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || com.google.android.material.motion.a.y(b9)))) {
                                    throw x0.b();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw x0.b();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw x0.b();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw x0.b();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (com.google.android.material.motion.a.y(b3)) {
                            }
                            throw x0.b();
                        }
                        if (i3 < i5 - 2) {
                            throw x0.b();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!com.google.android.material.motion.a.y(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw x0.b();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = StandardCharsets.UTF_8;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw x0.b();
                }
                return str;
        }
    }

    @Override // com.google.android.material.resources.b
    public final int h(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i5 = i + i2;
                int i6 = 0;
                while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i6++;
                }
                if (i6 == length) {
                    return i + length;
                }
                int i7 = i + i6;
                while (i6 < length) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 128 && i7 < i5) {
                        bArr[i7] = (byte) cCharAt2;
                        i7++;
                    } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                        i7 += 2;
                        bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                            if (i7 > i5 - 4) {
                                if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                return com.google.android.material.resources.b.i(str, bArr, i, i2);
                            }
                            i6++;
                            if (i6 != str.length()) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i9 = i7 + 3;
                                    bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i7 += 4;
                                    bArr[i9] = (byte) ((codePoint & 63) | 128);
                                }
                            }
                            return com.google.android.material.resources.b.i(str, bArr, i, i2);
                        }
                        bArr[i7] = (byte) ((cCharAt2 >>> '\f') | LibretroCore.PSP_SCREEN_WIDTH);
                        int i10 = i7 + 2;
                        bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i7 += 3;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i6++;
                }
                return i7;
            default:
                return com.google.android.material.resources.b.i(str, bArr, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    @Override // com.google.android.material.resources.b
    public final boolean m(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        long j;
        long j2;
        byte bG;
        long j3;
        long j4;
        byte bG2;
        long j5;
        int i5 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j6 = i5;
                int i6 = i2 - i5;
                long j7 = 1;
                if (i6 < 16) {
                    i3 = 0;
                } else {
                    int i7 = 8 - (((int) j6) & 7);
                    long j8 = j6;
                    i3 = 0;
                    while (true) {
                        if (i3 < i7) {
                            long j9 = j8 + 1;
                            if (l2.g(j8, bArr) >= 0) {
                                i3++;
                                j8 = j9;
                            }
                        } else {
                            while (true) {
                                int i8 = i3 + 8;
                                if (i8 <= i6) {
                                    if ((l2.c.j(l2.f + j8, bArr) & (-9187201950435737472L)) == 0) {
                                        j8 += 8;
                                        i3 = i8;
                                    }
                                }
                            }
                            while (true) {
                                if (i3 < i6) {
                                    long j10 = j8 + 1;
                                    if (l2.g(j8, bArr) >= 0) {
                                        i3++;
                                        j8 = j10;
                                    }
                                } else {
                                    i3 = i6;
                                }
                            }
                        }
                    }
                }
                int i9 = i6 - i3;
                long j11 = j6 + ((long) i3);
                while (true) {
                    byte bG3 = 0;
                    while (i9 > 0) {
                        long j12 = j11 + j7;
                        bG3 = l2.g(j11, bArr);
                        if (bG3 >= 0) {
                            i9--;
                            j11 = j12;
                        } else {
                            j11 = j12;
                            if (i9 == 0) {
                                return true;
                            }
                            i4 = i9 - 1;
                            if (bG3 < -32) {
                                if (i4 == 0) {
                                    return false;
                                }
                                i9 -= 2;
                                if (bG3 >= -62) {
                                    return false;
                                }
                                j5 = j11 + j7;
                                if (l2.g(j11, bArr) > -65) {
                                    return false;
                                }
                                j = j7;
                                j11 = j5;
                            } else if (bG3 < -16) {
                                j = j7;
                                if (i4 < 3) {
                                    return false;
                                }
                                i9 -= 4;
                                j2 = j11 + j;
                                bG = l2.g(j11, bArr);
                                if (bG <= -65) {
                                    return false;
                                }
                                if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                    return false;
                                }
                                j3 = 2 + j11;
                                if (l2.g(j2, bArr) <= -65) {
                                    return false;
                                }
                                j11 += 3;
                                if (l2.g(j3, bArr) > -65) {
                                    return false;
                                }
                            } else {
                                if (i4 < 2) {
                                    return false;
                                }
                                i9 -= 3;
                                j = j7;
                                j4 = j11 + j;
                                bG2 = l2.g(j11, bArr);
                                if (bG2 <= -65) {
                                    return false;
                                }
                                if (bG3 != -32 && bG2 < -96) {
                                    return false;
                                }
                                if (bG3 != -19 && bG2 >= -96) {
                                    return false;
                                }
                                j11 += 2;
                                if (l2.g(j4, bArr) > -65) {
                                    return false;
                                }
                            }
                            j7 = j;
                        }
                    }
                    if (i9 == 0) {
                        return true;
                    }
                    i4 = i9 - 1;
                    if (bG3 < -32) {
                        if (i4 == 0) {
                            return false;
                        }
                        i9 -= 2;
                        if (bG3 >= -62) {
                            return false;
                        }
                        j5 = j11 + j7;
                        if (l2.g(j11, bArr) > -65) {
                            return false;
                        }
                        j = j7;
                        j11 = j5;
                    } else if (bG3 < -16) {
                        j = j7;
                        if (i4 < 3) {
                            return false;
                        }
                        i9 -= 4;
                        j2 = j11 + j;
                        bG = l2.g(j11, bArr);
                        if (bG <= -65) {
                            return false;
                        }
                        if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                            return false;
                        }
                        j3 = 2 + j11;
                        if (l2.g(j2, bArr) <= -65) {
                            return false;
                        }
                        j11 += 3;
                        if (l2.g(j3, bArr) > -65) {
                            return false;
                        }
                    } else {
                        if (i4 < 2) {
                            return false;
                        }
                        i9 -= 3;
                        j = j7;
                        j4 = j11 + j;
                        bG2 = l2.g(j11, bArr);
                        if (bG2 <= -65) {
                            return false;
                        }
                        if (bG3 != -32) {
                        }
                        if (bG3 != -19) {
                        }
                        j11 += 2;
                        if (l2.g(j4, bArr) > -65) {
                            return false;
                        }
                    }
                    j7 = j;
                }
                break;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i2) {
            return true;
        }
        while (i5 < i2) {
            int i10 = i5 + 1;
            byte b = bArr[i5];
            if (b < 0) {
                if (b < -32) {
                    if (i10 < i2 && b >= -62) {
                        i5 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return false;
                }
                if (b < -16) {
                    if (i10 < i2 - 1) {
                        int i11 = i5 + 2;
                        byte b2 = bArr[i10];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i5 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i10 < i2 - 2) {
                    int i12 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i13 = i5 + 3;
                            if (bArr[i12] <= -65) {
                                i5 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
            i5 = i10;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0104 A[SYNTHETIC] */
    @Override // com.google.android.material.resources.b
    public boolean o(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int i4;
        long j;
        long j2;
        k2 k2Var;
        byte bD;
        long j3;
        long j4;
        k2 k2Var2;
        byte bD2;
        long j5;
        switch (this.a) {
            case 1:
                if (!byteBuffer.isDirect()) {
                    net.luminis.tls.engine.impl.c.o("ByteBuffer must be direct");
                    return false;
                }
                if ((i | i2 | (byteBuffer.limit() - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long j6 = l2.c.j(l2.g, byteBuffer) + ((long) i);
                int i5 = i2 - i;
                long j7 = 1;
                if (i5 < 16) {
                    i3 = 0;
                } else {
                    int i6 = (int) ((-j6) & 7);
                    long j8 = j6;
                    int i7 = i6;
                    while (true) {
                        if (i7 > 0) {
                            long j9 = j8 + 1;
                            if (l2.c.d(j8) < 0) {
                                i3 = i6 - i7;
                            } else {
                                i7--;
                                j8 = j9;
                            }
                        } else {
                            int i8 = i5 - i6;
                            while (i8 >= 8 && (l2.c.i(j8) & (-9187201950435737472L)) == 0) {
                                j8 += 8;
                                i8 -= 8;
                            }
                            i3 = i5 - i8;
                        }
                    }
                }
                long j10 = j6 + ((long) i3);
                int i9 = i5 - i3;
                while (true) {
                    byte bD3 = 0;
                    while (i9 > 0) {
                        long j11 = j10 + j7;
                        bD3 = l2.c.d(j10);
                        if (bD3 >= 0) {
                            i9--;
                            j10 = j11;
                        } else {
                            j10 = j11;
                            if (i9 == 0) {
                                return true;
                            }
                            i4 = i9 - 1;
                            if (bD3 < -32) {
                                if (i4 == 0) {
                                    return false;
                                }
                                i9 -= 2;
                                if (bD3 >= -62) {
                                    return false;
                                }
                                j5 = j10 + j7;
                                if (l2.c.d(j10) > -65) {
                                    return false;
                                }
                                j = j7;
                                j10 = j5;
                            } else if (bD3 < -16) {
                                j = j7;
                                if (i4 < 3) {
                                    return false;
                                }
                                i9 -= 4;
                                j2 = j10 + j;
                                k2Var = l2.c;
                                bD = k2Var.d(j10);
                                if (bD <= -65) {
                                    return false;
                                }
                                if ((((bD + 112) + (bD3 << 28)) >> 30) == 0) {
                                    return false;
                                }
                                j3 = 2 + j10;
                                if (k2Var.d(j2) <= -65) {
                                    return false;
                                }
                                j10 += 3;
                                if (k2Var.d(j3) > -65) {
                                    return false;
                                }
                            } else {
                                if (i4 < 2) {
                                    return false;
                                }
                                i9 -= 3;
                                j4 = j10 + j7;
                                k2Var2 = l2.c;
                                bD2 = k2Var2.d(j10);
                                if (bD2 <= -65) {
                                    return false;
                                }
                                j = j7;
                                if (bD3 != -32 && bD2 < -96) {
                                    return false;
                                }
                                if (bD3 != -19 && bD2 >= -96) {
                                    return false;
                                }
                                j10 += 2;
                                if (k2Var2.d(j4) > -65) {
                                    return false;
                                }
                            }
                            j7 = j;
                        }
                    }
                    if (i9 == 0) {
                        return true;
                    }
                    i4 = i9 - 1;
                    if (bD3 < -32) {
                        if (i4 == 0) {
                            return false;
                        }
                        i9 -= 2;
                        if (bD3 >= -62) {
                            return false;
                        }
                        j5 = j10 + j7;
                        if (l2.c.d(j10) > -65) {
                            return false;
                        }
                        j = j7;
                        j10 = j5;
                    } else if (bD3 < -16) {
                        j = j7;
                        if (i4 < 3) {
                            return false;
                        }
                        i9 -= 4;
                        j2 = j10 + j;
                        k2Var = l2.c;
                        bD = k2Var.d(j10);
                        if (bD <= -65) {
                            return false;
                        }
                        if ((((bD + 112) + (bD3 << 28)) >> 30) == 0) {
                            return false;
                        }
                        j3 = 2 + j10;
                        if (k2Var.d(j2) <= -65) {
                            return false;
                        }
                        j10 += 3;
                        if (k2Var.d(j3) > -65) {
                            return false;
                        }
                    } else {
                        if (i4 < 2) {
                            return false;
                        }
                        i9 -= 3;
                        j4 = j10 + j7;
                        k2Var2 = l2.c;
                        bD2 = k2Var2.d(j10);
                        if (bD2 <= -65) {
                            return false;
                        }
                        j = j7;
                        if (bD3 != -32) {
                        }
                        if (bD3 != -19) {
                        }
                        j10 += 2;
                        if (k2Var2.d(j4) > -65) {
                            return false;
                        }
                    }
                    j7 = j;
                }
                break;
            default:
                return super.o(byteBuffer, i, i2);
        }
    }
}
