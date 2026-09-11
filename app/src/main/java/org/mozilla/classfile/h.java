package org.mozilla.classfile;

import com.app.mlounge.emulator.LibretroCore;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final ClassFileWriter a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public int i = 1;
    public byte[] l = new byte[LibretroCore.SCREEN_WIDTH];
    public int h = 0;

    public h(ClassFileWriter classFileWriter) {
        this.a = classFileWriter;
    }

    public static int l(int i, int i2, String str) {
        int i3 = 65535;
        if ((i2 - i) * 3 > 65535) {
            while (i != i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == 0 || cCharAt > 127) {
                    i3 = cCharAt < 2047 ? i3 - 2 : i3 - 3;
                } else {
                    i3--;
                }
                if (i3 < 0) {
                    return i;
                }
                i++;
            }
        }
        return i2;
    }

    public final short a(String str) {
        String str2;
        HashMap map = this.f;
        int iIntValue = ((Integer) map.getOrDefault(str, -1)).intValue();
        if (iIntValue == -1) {
            if (str.indexOf(46) > 0) {
                int i = ClassFileWriter.E;
                String strReplace = str.replace('.', '/');
                Integer num = (Integer) map.getOrDefault(strReplace, -1);
                int iIntValue2 = num.intValue();
                if (iIntValue2 != -1) {
                    map.put(str, num);
                }
                str2 = strReplace;
                iIntValue = iIntValue2;
            } else {
                str2 = str;
            }
            if (iIntValue == -1) {
                short sI = i(str2);
                j(3);
                byte[] bArr = this.l;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = 7;
                this.h = ClassFileWriter.I(bArr, sI, i3);
                iIntValue = this.i;
                this.i = iIntValue + 1;
                map.put(str2, Integer.valueOf(iIntValue));
                if (!str.equals(str2)) {
                    map.put(str, Integer.valueOf(iIntValue));
                }
            }
        }
        m(iIntValue, str);
        this.k.put(Integer.valueOf(iIntValue), (byte) 7);
        return (short) iIntValue;
    }

    public final int b(double d) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 6;
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr2 = this.l;
        int i2 = (int) (jDoubleToLongBits >>> 32);
        this.h = ClassFileWriter.J(bArr2, (int) jDoubleToLongBits, ClassFileWriter.J(bArr2, i2, this.h));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 6);
        return i3;
    }

    public final int c(int i) {
        j(5);
        byte[] bArr = this.l;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = 3;
        this.h = ClassFileWriter.J(bArr, i, i3);
        this.k.put(Integer.valueOf(this.i), (byte) 3);
        int i4 = this.i;
        this.i = i4 + 1;
        return (short) i4;
    }

    public final int d(long j) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = 5;
        this.h = ClassFileWriter.J(bArr, (int) j, ClassFileWriter.J(bArr, (int) (j >>> 32), i2));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 5);
        return i3;
    }

    public final int e(String str) {
        int i = i(str) & 65535;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        int iIntValue = ((Integer) map.getOrDefault(numValueOf, -1)).intValue();
        if (iIntValue == -1) {
            iIntValue = this.i;
            this.i = iIntValue + 1;
            j(3);
            byte[] bArr = this.l;
            int i2 = this.h;
            int i3 = i2 + 1;
            this.h = i3;
            bArr[i2] = 8;
            this.h = ClassFileWriter.I(bArr, i, i3);
            map.put(Integer.valueOf(i), Integer.valueOf(iIntValue));
        }
        this.k.put(Integer.valueOf(iIntValue), (byte) 8);
        return iIntValue;
    }

    public final short f(e eVar) {
        HashMap map = this.g;
        int iIntValue = ((Integer) map.getOrDefault(eVar, -1)).intValue();
        if (iIntValue == -1) {
            eVar.getClass();
            short sG = g("org.mozilla.javascript.optimizer.Bootstrapper", "bootstrap", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;");
            j(4);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 15;
            int i3 = i + 2;
            this.h = i3;
            bArr[i2] = 6;
            this.h = ClassFileWriter.I(bArr, sG, i3);
            iIntValue = this.i;
            this.i = iIntValue + 1;
            map.put(eVar, Integer.valueOf(iIntValue));
            this.k.put(Integer.valueOf(iIntValue), (byte) 15);
        }
        return (short) iIntValue;
    }

    public final short g(String str, String str2, String str3) {
        j jVar = new j(str, str2, str3);
        HashMap map = this.e;
        int iIntValue = ((Integer) map.getOrDefault(jVar, -1)).intValue();
        if (iIntValue == -1) {
            short sH = h(str2, str3);
            short sA = a(str);
            j(5);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 10;
            int I = ClassFileWriter.I(bArr, sA, i2);
            this.h = I;
            this.h = ClassFileWriter.I(this.l, sH, I);
            iIntValue = this.i;
            this.i = iIntValue + 1;
            map.put(jVar, Integer.valueOf(iIntValue));
        }
        m(iIntValue, jVar);
        this.k.put(Integer.valueOf(iIntValue), (byte) 10);
        return (short) iIntValue;
    }

    public final short h(String str, String str2) {
        short sI = i(str);
        short sI2 = i(str2);
        j(5);
        byte[] bArr = this.l;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = 12;
        int I = ClassFileWriter.I(bArr, sI, i2);
        this.h = I;
        this.h = ClassFileWriter.I(this.l, sI2, I);
        this.k.put(Integer.valueOf(this.i), (byte) 12);
        int i3 = this.i;
        this.i = i3 + 1;
        return (short) i3;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public final short i(String str) {
        boolean z;
        HashMap map = this.c;
        int iIntValue = ((Integer) map.getOrDefault(str, -1)).intValue();
        if (iIntValue == -1) {
            int length = str.length();
            if (length > 65535) {
                z = true;
            } else {
                j((length * 3) + 3);
                int i = this.h;
                this.l[i] = 1;
                int i2 = i + 3;
                ClassFileWriter classFileWriter = this.a;
                char[] cArr = classFileWriter.D;
                if (length > cArr.length) {
                    int length2 = cArr.length * 2;
                    if (length > length2) {
                        length2 = length;
                    }
                    classFileWriter.D = new char[length2];
                }
                char[] cArr2 = classFileWriter.D;
                z = false;
                str.getChars(0, length, cArr2, 0);
                for (int i3 = 0; i3 != length; i3++) {
                    char c = cArr2[i3];
                    if (c == 0 || c > 127) {
                        byte[] bArr = this.l;
                        if (c > 2047) {
                            bArr[i2] = (byte) ((c >> '\f') | LibretroCore.SCREEN_HEIGHT);
                            int i4 = i2 + 2;
                            bArr[i2 + 1] = (byte) (((c >> 6) & 63) | 128);
                            i2 += 3;
                            bArr[i4] = (byte) ((c & '?') | 128);
                        } else {
                            int i5 = i2 + 1;
                            bArr[i2] = (byte) ((c >> 6) | 192);
                            i2 += 2;
                            bArr[i5] = (byte) ((c & '?') | 128);
                        }
                    } else {
                        this.l[i2] = (byte) c;
                        i2++;
                    }
                }
                int i6 = this.h;
                int i7 = i2 - (i6 + 3);
                if (i7 > 65535) {
                    z = true;
                } else {
                    byte[] bArr2 = this.l;
                    bArr2[i6 + 1] = (byte) (i7 >>> 8);
                    bArr2[i6 + 2] = (byte) i7;
                    this.h = i2;
                    iIntValue = this.i;
                    this.i = iIntValue + 1;
                    map.put(str, Integer.valueOf(iIntValue));
                }
            }
            if (z) {
                net.luminis.tls.engine.impl.c.o("Too big string");
                return (short) 0;
            }
        }
        m(iIntValue, str);
        this.k.put(Integer.valueOf(iIntValue), (byte) 1);
        return (short) iIntValue;
    }

    public final void j(int i) {
        int i2 = this.h;
        int i3 = i2 + i;
        byte[] bArr = this.l;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            if (i2 + i > length) {
                length = i2 + i;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.l = bArr2;
        }
    }

    public final Object k(int i) {
        return this.j.get(Integer.valueOf(i));
    }

    public final void m(int i, Object obj) {
        this.j.put(Integer.valueOf(i), obj);
    }
}
