package okio;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class i implements Serializable, Comparable {
    public static final i A = new i(new byte[0]);
    public final byte[] e;
    public transient int y;
    public transient String z;

    public i(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static int i(i iVar, i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        return iVar.h(iVar2.j(), 0);
    }

    public static int m(i iVar, i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        return iVar.l(iVar2.j());
    }

    public static /* synthetic */ i r(i iVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return iVar.q(i, i2);
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.e;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, kotlin.text.a.a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        iVar.getClass();
        int iF = f();
        int iF2 = iVar.f();
        int iMin = Math.min(iF, iF2);
        for (int i = 0; i < iMin; i++) {
            int iK = k(i) & 255;
            int iK2 = iVar.k(i) & 255;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iF == iF2) {
            return 0;
        }
        return iF < iF2 ? -1 : 1;
    }

    public i e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.e, 0, f());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new i(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int iF = iVar.f();
            byte[] bArr = this.e;
            if (iF == bArr.length && iVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.e.length;
    }

    public String g() {
        byte[] bArr = this.e;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = okio.internal.b.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int h(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.e;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.e);
        this.y = iHashCode;
        return iHashCode;
    }

    public byte[] j() {
        return this.e;
    }

    public byte k(int i) {
        return this.e[i];
    }

    public int l(byte[] bArr) {
        bArr.getClass();
        int iF = f();
        byte[] bArr2 = this.e;
        for (int iMin = Math.min(iF, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (b.a(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean n(int i, i iVar, int i2) {
        iVar.getClass();
        return iVar.o(0, this.e, i, i2);
    }

    public boolean o(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.e;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && b.a(bArr2, i, bArr, i2, i3);
    }

    public String p(Charset charset) {
        charset.getClass();
        return new String(this.e, charset);
    }

    public i q(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = f();
        }
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.s(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new i(kotlin.collections.n.I(bArr, i, i2));
        }
        net.luminis.tls.engine.impl.c.o("endIndex < beginIndex");
        return null;
    }

    public i s() {
        int i = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] t() {
        byte[] bArr = this.e;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.e;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strU = u();
            String strM = kotlin.text.r.M(kotlin.text.r.M(kotlin.text.r.M(strU.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strU.length()) {
                return androidx.privacysandbox.ads.adservices.java.internal.a.k(']', "[text=", strM);
            }
            return "[size=" + bArr.length + " text=" + strM + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + g() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.s(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        sb.append((64 == bArr.length ? this : new i(kotlin.collections.n.I(bArr, 0, 64))).g());
        sb.append("…]");
        return sb.toString();
    }

    public final String u() {
        String str = this.z;
        if (str != null) {
            return str;
        }
        byte[] bArrJ = j();
        bArrJ.getClass();
        String str2 = new String(bArrJ, kotlin.text.a.a);
        this.z = str2;
        return str2;
    }

    public void v(f fVar, int i) {
        fVar.write(this.e, 0, i);
    }
}
