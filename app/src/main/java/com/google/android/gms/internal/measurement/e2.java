package com.google.android.gms.internal.measurement;

import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements m2 {
    public static final int[] k = new int[0];
    public static final Unsafe l = x2.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final m0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final f1 j;

    public e2(int[] iArr, Object[] objArr, int i, int i2, m0 m0Var, int[] iArr2, int i3, int i4, f1 f1Var, f1 f1Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = m0Var instanceof i1;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = f1Var;
        this.e = m0Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "Field ", str, " for ", name);
            androidx.media3.exoplayer.hls.playlist.a.j(androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof i1) {
            return ((i1) obj).g();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) x2.i(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) x2.i(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, a3 a3Var, Class cls, p0 p0Var) throws t1 {
        a3 a3Var2 = a3.z;
        switch (a3Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                p0Var.c = Double.valueOf(Double.longBitsToDouble(ea.l(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                p0Var.c = Float.valueOf(Float.intBitsToFloat(ea.i(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iG = ea.g(bArr, i, p0Var);
                p0Var.c = Long.valueOf(p0Var.b);
                return iG;
            case 4:
            case 12:
            case 13:
                int iA = ea.a(bArr, i, p0Var);
                p0Var.c = Integer.valueOf(p0Var.a);
                return iA;
            case 5:
            case 15:
                int i5 = i + 8;
                p0Var.c = Long.valueOf(ea.l(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                p0Var.c = Integer.valueOf(ea.i(bArr, i));
                return i6;
            case 7:
                int iG2 = ea.g(bArr, i, p0Var);
                p0Var.c = Boolean.valueOf(p0Var.b != 0);
                return iG2;
            case 8:
                return ea.n(bArr, i, p0Var);
            case 9:
            default:
                org.mozilla.javascript.c.b("unsupported field type.");
                return 0;
            case 10:
                m2 m2VarA = j2.c.a(cls);
                i1 i1VarA = m2VarA.a();
                int iT = ea.t(i1VarA, m2VarA, bArr, i, i2, p0Var);
                m2VarA.f(i1VarA);
                p0Var.c = i1VarA;
                return iT;
            case 11:
                return ea.q(bArr, i, p0Var);
            case 16:
                int iA2 = ea.a(bArr, i, p0Var);
                p0Var.c = Integer.valueOf(w0.j(p0Var.a));
                return iA2;
            case 17:
                int iG3 = ea.g(bArr, i, p0Var);
                p0Var.c = Long.valueOf(w0.k(p0Var.b));
                return iG3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x0354  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    public static e2 z(l2 l2Var, f1 f1Var, f1 f1Var2) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldA;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldA2;
        int i28;
        Object obj2;
        Field fieldA3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(l2Var instanceof l2)) {
            l2Var.getClass();
            androidx.transition.k.i();
            return null;
        }
        String str = l2Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = k;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = l;
        Object[] objArr2 = l2Var.c;
        Class<?> cls = l2Var.a.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & 2048;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (l2Var.a() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = A(cls, (String) obj);
                        objArr4[i27] = fieldA2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = A(cls, (String) obj2);
                        objArr4[i28] = fieldA3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldA2 = (Field) obj;
                } else {
                    fieldA2 = A(cls, (String) obj);
                    objArr4[i27] = fieldA2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldA3 = (Field) obj2;
                } else {
                    fieldA3 = A(cls, (String) obj2);
                    objArr4[i28] = fieldA3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldA4 = A(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldA4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (l2Var.a() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldA = (Field) obj3;
                            } else {
                                fieldA = A(cls, (String) obj3);
                                objArr4[i98] = fieldA;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & LibretroCore.SCREEN_WIDTH) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new e2(iArr3, objArr3, i2, i5, l2Var.a, iArr, i7, i62, f1Var, f1Var2);
    }

    public final void B(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            m2 m2VarD = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    i1 i1VarA = m2VarD.a();
                    m2VarD.c(i1VarA, object);
                    unsafe.putObject(obj, j, i1VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                i1 i1VarA2 = m2VarD.a();
                m2VarD.c(i1VarA2, object2);
                unsafe.putObject(obj, j, i1VarA2);
                object2 = i1VarA2;
            }
            m2VarD.c(object2, object);
        }
    }

    public final void C(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            m2 m2VarD = D(i);
            if (!u(i2, i, obj)) {
                if (m(object)) {
                    i1 i1VarA = m2VarD.a();
                    m2VarD.c(i1VarA, object);
                    unsafe.putObject(obj, j, i1VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                i1 i1VarA2 = m2VarD.a();
                m2VarD.c(i1VarA2, object2);
                unsafe.putObject(obj, j, i1VarA2);
                object2 = i1VarA2;
            }
            m2VarD.c(object2, object);
        }
    }

    public final m2 D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        m2 m2Var = (m2) objArr[i3];
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2VarA = j2.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = m2VarA;
        return m2VarA;
    }

    public final Object E(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final j0 F(int i) {
        int i2 = i / 3;
        return (j0) this.b[i2 + i2 + 1];
    }

    public final Object G(int i, Object obj) {
        m2 m2VarD = D(i);
        int iK = k(i) & 1048575;
        if (!s(i, obj)) {
            return m2VarD.a();
        }
        Object object = l.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        i1 i1VarA = m2VarD.a();
        if (object != null) {
            m2VarD.c(i1VarA, object);
        }
        return i1VarA;
    }

    public final void H(int i, Object obj, Object obj2) {
        l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i2, Object obj) {
        m2 m2VarD = D(i2);
        if (!u(i, i2, obj)) {
            return m2VarD.a();
        }
        Object object = l.getObject(obj, k(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        i1 i1VarA = m2VarD.a();
        if (object != null) {
            m2VarD.c(i1VarA, object);
        }
        return i1VarA;
    }

    public final void J(int i, Object obj, Object obj2, int i2) {
        l.putObject(obj, k(i2) & 1048575, obj2);
        v(i, i2, obj);
    }

    public final Object K(Object obj, int i, Object obj2, f1 f1Var, Object obj3) {
        j0 j0VarF;
        int i2 = this.a[i];
        Object objI = x2.i(k(i) & 1048575, obj);
        if (objI == null || (j0VarF = F(i)) == null) {
            return obj2;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = ((y1) E(i)).a;
        Iterator it = ((z1) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!j0VarF.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    f1Var.getClass();
                    obj2 = f1.g(obj3);
                }
                int iB = y1.b(cVar, entry.getKey(), entry.getValue());
                s0 s0Var = t0.y;
                byte[] bArr = new byte[iB];
                boolean z = z0.b;
                x0 x0Var = new x0(bArr, iB);
                try {
                    y1.a(x0Var, cVar, entry.getKey(), entry.getValue());
                    if (x0Var.x() > 0) {
                        net.luminis.tls.engine.impl.c.r("Did not write as much data as expected.");
                        return null;
                    }
                    if (x0Var.x() < 0) {
                        net.luminis.tls.engine.impl.c.r("Wrote more data than expected.");
                        return null;
                    }
                    s0 s0Var2 = new s0(bArr);
                    f1Var.getClass();
                    ((s2) obj2).d((i2 << 3) | 2, s0Var2);
                    it.remove();
                } catch (IOException e) {
                    net.luminis.tls.engine.impl.c.k(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void L(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) {
        w0 w0Var = (w0) wVar.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            wVar.o0(2);
            x2.j(j, obj, w0Var.x());
        } else if (!this.f) {
            x2.j(j, obj, wVar.w0());
        } else {
            wVar.o0(2);
            x2.j(j, obj, w0Var.w());
        }
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final i1 a() {
        return ((i1) this.e).i();
    }

    /* JADX WARN: Code duplicated, block: B:182:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    @Override // com.google.android.gms.internal.measurement.m2
    public final int b(m0 m0Var) {
        int i;
        int iA;
        int iB;
        int iZ;
        int i2;
        int iC;
        int iA2;
        int size;
        int iS;
        int iA3;
        int iA4;
        int iA5;
        int iC2;
        int iA6;
        int iB2;
        Unsafe unsafe = l;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iM = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return ((i1) m0Var).zzc.c() + iM;
            }
            int iK = k(i5);
            int iL = l(iK);
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iL <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(m0Var, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iK & i3;
            if (iL >= d1.y.e) {
                d1.z.getClass();
            }
            long j = i10;
            switch (iL) {
                case 0:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case 1:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case 2:
                    if (r(m0Var, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(m0Var, j);
                        iA = z0.a(i7 << 3);
                        iB = z0.b(j2);
                        iZ = iB + iA;
                        iM += iZ;
                    }
                    break;
                case 3:
                    if (r(m0Var, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(m0Var, j);
                        iA = z0.a(i7 << 3);
                        iB = z0.b(j3);
                        iZ = iB + iA;
                        iM += iZ;
                    }
                    break;
                case 4:
                    if (r(m0Var, i5, i4, i6, i)) {
                        long j4 = unsafe.getInt(m0Var, j);
                        iA = z0.a(i7 << 3);
                        iB = z0.b(j4);
                        iZ = iB + iA;
                        iM += iZ;
                    }
                    break;
                case 5:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case 6:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case 7:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 1, iM);
                    }
                    break;
                case 8:
                    if (r(m0Var, i5, i4, i6, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(m0Var, j);
                        if (object instanceof t0) {
                            int iA7 = z0.a(i11);
                            int iC3 = ((t0) object).c();
                            iM = com.google.android.datatransport.runtime.backends.c.n(iC3, iC3, iA7, iM);
                        } else {
                            int iA8 = z0.a(i11);
                            int iB3 = z2.b((String) object);
                            iM = com.google.android.datatransport.runtime.backends.c.n(iB3, iB3, iA8, iM);
                        }
                    }
                    break;
                case 9:
                    if (r(m0Var, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(m0Var, j);
                        m2 m2VarD = D(i5);
                        f1 f1Var = n2.a;
                        int iA9 = z0.a(i7 << 3);
                        int iC4 = ((m0) object2).c(m2VarD);
                        iM = com.google.android.datatransport.runtime.backends.c.n(iC4, iC4, iA9, iM);
                    }
                    break;
                case 10:
                    if (r(m0Var, i5, i4, i6, i)) {
                        t0 t0Var = (t0) unsafe.getObject(m0Var, j);
                        int iA10 = z0.a(i7 << 3);
                        int iC5 = t0Var.c();
                        iM = com.google.android.datatransport.runtime.backends.c.n(iC5, iC5, iA10, iM);
                    }
                    break;
                case 11:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(unsafe.getInt(m0Var, j), z0.a(i7 << 3), iM);
                    }
                    break;
                case 12:
                    if (r(m0Var, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(m0Var, j);
                        iA = z0.a(i7 << 3);
                        iB = z0.b(j5);
                        iZ = iB + iA;
                        iM += iZ;
                    }
                    break;
                case 13:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case 14:
                    if (r(m0Var, i5, i4, i6, i)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case 15:
                    if (r(m0Var, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(m0Var, j);
                        iM = com.google.android.datatransport.runtime.backends.c.m((i12 >> 31) ^ (i12 + i12), z0.a(i7 << 3), iM);
                    }
                    break;
                case 16:
                    if (r(m0Var, i5, i4, i6, i)) {
                        long j6 = unsafe.getLong(m0Var, j);
                        iA = z0.a(i7 << 3);
                        iB = z0.b((j6 >> 63) ^ (j6 + j6));
                        iZ = iB + iA;
                        iM += iZ;
                    }
                    break;
                case 17:
                    if (r(m0Var, i5, i4, i6, i)) {
                        m0 m0Var2 = (m0) unsafe.getObject(m0Var, j);
                        m2 m2VarD2 = D(i5);
                        f1 f1Var2 = n2.a;
                        int iA11 = z0.a(i7 << 3);
                        i2 = iA11 + iA11;
                        iC = m0Var2.c(m2VarD2);
                        iZ = iC + i2;
                        iM += iZ;
                    }
                    break;
                case 18:
                    iZ = n2.z(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case 19:
                    iZ = n2.y(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var3 = n2.a;
                    if (list.size() == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = (z0.a(i7 << 3) * list.size()) + n2.r(list);
                    }
                    iM += iA2;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var4 = n2.a;
                    size = list2.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.s(list2);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var5 = n2.a;
                    size = list3.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.v(list3);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case 23:
                    iZ = n2.z(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case 24:
                    iZ = n2.y(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var6 = n2.a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = (z0.a(i7 << 3) + 1) * size2;
                    }
                    iM += iA2;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var7 = n2.a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iA4 = 0;
                    } else {
                        iA4 = z0.a(i7 << 3) * size3;
                        for (int i13 = 0; i13 < size3; i13++) {
                            Object obj = list5.get(i13);
                            if (obj instanceof t0) {
                                int iC6 = ((t0) obj).c();
                                iA4 = com.google.android.datatransport.runtime.backends.c.m(iC6, iC6, iA4);
                            } else {
                                int iB4 = z2.b((String) obj);
                                iA4 = com.google.android.datatransport.runtime.backends.c.m(iB4, iB4, iA4);
                            }
                        }
                    }
                    iM += iA4;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(m0Var, j);
                    m2 m2VarD3 = D(i5);
                    f1 f1Var8 = n2.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = z0.a(i7 << 3) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            int iC7 = ((m0) list6.get(i14)).c(m2VarD3);
                            iA5 = com.google.android.datatransport.runtime.backends.c.m(iC7, iC7, iA5);
                        }
                    }
                    iM += iA5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var9 = n2.a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iA4 = 0;
                    } else {
                        iA4 = z0.a(i7 << 3) * size5;
                        for (int i15 = 0; i15 < list7.size(); i15++) {
                            int iC8 = ((t0) list7.get(i15)).c();
                            iA4 = com.google.android.datatransport.runtime.backends.c.m(iC8, iC8, iA4);
                        }
                    }
                    iM += iA4;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var10 = n2.a;
                    size = list8.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.w(list8);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var11 = n2.a;
                    size = list9.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.u(list9);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case 31:
                    iZ = n2.y(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case 32:
                    iZ = n2.z(i7, (List) unsafe.getObject(m0Var, j));
                    iM += iZ;
                    break;
                case Token.GETPROP /* 33 */:
                    List list10 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var12 = n2.a;
                    size = list10.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.x(list10);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    List list11 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var13 = n2.a;
                    size = list11.size();
                    if (size == 0) {
                        iA4 = 0;
                    } else {
                        iS = n2.t(list11);
                        iA3 = z0.a(i7 << 3);
                        iA4 = (iA3 * size) + iS;
                    }
                    iM += iA4;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var14 = n2.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size6, z0.a(i7 << 3), size6, iM);
                    }
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    List list13 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var15 = n2.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size7, z0.a(i7 << 3), size7, iM);
                    }
                    break;
                case Token.SETPROP /* 37 */:
                    int iR = n2.r((List) unsafe.getObject(m0Var, j));
                    if (iR > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iR, z0.a(i7 << 3), iR, iM);
                    }
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    int iS2 = n2.s((List) unsafe.getObject(m0Var, j));
                    if (iS2 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iS2, z0.a(i7 << 3), iS2, iM);
                    }
                    break;
                case Token.GETELEM /* 39 */:
                    int iV = n2.v((List) unsafe.getObject(m0Var, j));
                    if (iV > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iV, z0.a(i7 << 3), iV, iM);
                    }
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    List list14 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var16 = n2.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size8, z0.a(i7 << 3), size8, iM);
                    }
                    break;
                case Token.SETELEM /* 41 */:
                    List list15 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var17 = n2.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size9, z0.a(i7 << 3), size9, iM);
                    }
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    List list16 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var18 = n2.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size10, z0.a(i7 << 3), size10, iM);
                    }
                    break;
                case Token.CALL /* 43 */:
                    int iW = n2.w((List) unsafe.getObject(m0Var, j));
                    if (iW > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iW, z0.a(i7 << 3), iW, iM);
                    }
                    break;
                case Token.NAME /* 44 */:
                    int iU = n2.u((List) unsafe.getObject(m0Var, j));
                    if (iU > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iU, z0.a(i7 << 3), iU, iM);
                    }
                    break;
                case Token.NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var19 = n2.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size11, z0.a(i7 << 3), size11, iM);
                    }
                    break;
                case Token.STRING /* 46 */:
                    List list18 = (List) unsafe.getObject(m0Var, j);
                    f1 f1Var20 = n2.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(size12, z0.a(i7 << 3), size12, iM);
                    }
                    break;
                case Token.NULL /* 47 */:
                    int iX = n2.x((List) unsafe.getObject(m0Var, j));
                    if (iX > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iX, z0.a(i7 << 3), iX, iM);
                    }
                    break;
                case Token.THIS /* 48 */:
                    int iT = n2.t((List) unsafe.getObject(m0Var, j));
                    if (iT > 0) {
                        iM = com.google.android.datatransport.runtime.backends.c.n(iT, z0.a(i7 << 3), iT, iM);
                    }
                    break;
                case Token.FALSE /* 49 */:
                    List list19 = (List) unsafe.getObject(m0Var, j);
                    m2 m2VarD4 = D(i5);
                    f1 f1Var21 = n2.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iC2 = 0;
                    } else {
                        iC2 = 0;
                        for (int i16 = 0; i16 < size13; i16++) {
                            m0 m0Var3 = (m0) list19.get(i16);
                            int iA12 = z0.a(i7 << 3);
                            iC2 += m0Var3.c(m2VarD4) + iA12 + iA12;
                        }
                    }
                    iM += iC2;
                    break;
                case Token.TRUE /* 50 */:
                    z1 z1Var = (z1) unsafe.getObject(m0Var, j);
                    y1 y1Var = (y1) E(i5);
                    if (z1Var.isEmpty()) {
                        iA4 = 0;
                    } else {
                        iA4 = 0;
                        for (Map.Entry entry : z1Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = y1Var.a;
                            int iA13 = z0.a(i7 << 3);
                            int iB5 = y1.b(cVar, key, value);
                            iA4 = com.google.android.datatransport.runtime.backends.c.n(iB5, iB5, iA13, iA4);
                        }
                    }
                    iM += iA4;
                    break;
                case Token.SHEQ /* 51 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (u(i7, i5, m0Var)) {
                        long jP = p(j, m0Var);
                        iA6 = z0.a(i7 << 3);
                        iB2 = z0.b(jP);
                        iM += iB2 + iA6;
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (u(i7, i5, m0Var)) {
                        long jP2 = p(j, m0Var);
                        iA6 = z0.a(i7 << 3);
                        iB2 = z0.b(jP2);
                        iM += iB2 + iA6;
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (u(i7, i5, m0Var)) {
                        long jO = o(j, m0Var);
                        iA6 = z0.a(i7 << 3);
                        iB2 = z0.b(jO);
                        iM += iB2 + iA6;
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case Token.IN /* 57 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 1, iM);
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (u(i7, i5, m0Var)) {
                        int i17 = i7 << 3;
                        Object object3 = unsafe.getObject(m0Var, j);
                        if (object3 instanceof t0) {
                            int iA14 = z0.a(i17);
                            int iC9 = ((t0) object3).c();
                            iM = com.google.android.datatransport.runtime.backends.c.n(iC9, iC9, iA14, iM);
                        } else {
                            int iA15 = z0.a(i17);
                            int iB6 = z2.b((String) object3);
                            iM = com.google.android.datatransport.runtime.backends.c.n(iB6, iB6, iA15, iM);
                        }
                    }
                    break;
                case 60:
                    if (u(i7, i5, m0Var)) {
                        Object object4 = unsafe.getObject(m0Var, j);
                        m2 m2VarD5 = D(i5);
                        f1 f1Var22 = n2.a;
                        int iA16 = z0.a(i7 << 3);
                        int iC10 = ((m0) object4).c(m2VarD5);
                        iM = com.google.android.datatransport.runtime.backends.c.n(iC10, iC10, iA16, iM);
                    }
                    break;
                case 61:
                    if (u(i7, i5, m0Var)) {
                        t0 t0Var2 = (t0) unsafe.getObject(m0Var, j);
                        int iA17 = z0.a(i7 << 3);
                        int iC11 = t0Var2.c();
                        iM = com.google.android.datatransport.runtime.backends.c.n(iC11, iC11, iA17, iM);
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(o(j, m0Var), z0.a(i7 << 3), iM);
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (u(i7, i5, m0Var)) {
                        long jO2 = o(j, m0Var);
                        iA6 = z0.a(i7 << 3);
                        iB2 = z0.b(jO2);
                        iM += iB2 + iA6;
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 4, iM);
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (u(i7, i5, m0Var)) {
                        iM = com.google.android.datatransport.runtime.backends.c.m(i7 << 3, 8, iM);
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (u(i7, i5, m0Var)) {
                        int iO = o(j, m0Var);
                        iM = com.google.android.datatransport.runtime.backends.c.m((iO >> 31) ^ (iO + iO), z0.a(i7 << 3), iM);
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (u(i7, i5, m0Var)) {
                        long jP3 = p(j, m0Var);
                        iA6 = z0.a(i7 << 3);
                        iB2 = z0.b((jP3 >> 63) ^ (jP3 + jP3));
                        iM += iB2 + iA6;
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (u(i7, i5, m0Var)) {
                        m0 m0Var4 = (m0) unsafe.getObject(m0Var, j);
                        m2 m2VarD6 = D(i5);
                        f1 f1Var23 = n2.a;
                        int iA18 = z0.a(i7 << 3);
                        i2 = iA18 + iA18;
                        iC = m0Var4.c(m2VarD6);
                        iZ = iC + i2;
                        iM += iZ;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.measurement.m2
    public final void c(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                n2.b(obj, obj2);
                return;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            int i3 = iArr[i];
            long j = i2;
            switch (iL) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        w2 w2Var = x2.c;
                        obj3 = obj;
                        w2Var.l(obj3, j, w2Var.k(j, obj2));
                        t(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        w2 w2Var2 = x2.c;
                        w2Var2.j(obj, j, w2Var2.h(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        x2.h(obj, j, x2.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        x2.h(obj, j, x2.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        x2.h(obj, j, x2.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        w2 w2Var3 = x2.c;
                        w2Var3.g(obj, j, w2Var3.d(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        x2.j(j, obj, x2.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        x2.j(j, obj, x2.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        x2.h(obj, j, x2.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        x2.f(j, obj, x2.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        x2.h(obj, j, x2.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                case 35:
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                case Token.SETPROP /* 37 */:
                case Token.SETPROP_SUPER /* 38 */:
                case Token.GETELEM /* 39 */:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SETELEM_SUPER /* 42 */:
                case Token.CALL /* 43 */:
                case Token.NAME /* 44 */:
                case Token.NUMBER /* 45 */:
                case Token.STRING /* 46 */:
                case Token.NULL /* 47 */:
                case Token.THIS /* 48 */:
                case Token.FALSE /* 49 */:
                    r1 r1VarL = (r1) x2.i(j, obj);
                    r1 r1Var = (r1) x2.i(j, obj2);
                    int size = r1VarL.size();
                    int size2 = r1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((n0) r1VarL).e) {
                            r1VarL = r1VarL.L(size2 + size);
                        }
                        r1VarL.addAll(r1Var);
                    }
                    if (size > 0) {
                        r1Var = r1VarL;
                    }
                    x2.j(j, obj, r1Var);
                    obj3 = obj;
                    break;
                case Token.TRUE /* 50 */:
                    f1 f1Var = n2.a;
                    x2.j(j, obj, f1.f(x2.i(j, obj), x2.i(j, obj2)));
                    obj3 = obj;
                    break;
                case Token.SHEQ /* 51 */:
                case Token.SHNE /* 52 */:
                case Token.REGEXP /* 53 */:
                case Token.BINDNAME /* 54 */:
                case Token.THROW /* 55 */:
                case Token.RETHROW /* 56 */:
                case Token.IN /* 57 */:
                case Token.INSTANCEOF /* 58 */:
                case Token.LOCAL_LOAD /* 59 */:
                    if (u(i3, i, obj2)) {
                        x2.j(j, obj, x2.i(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    C(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    if (u(i3, i, obj2)) {
                        x2.j(j, obj, x2.i(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case Token.ENUM_ID /* 68 */:
                    C(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x07c6 A[LOOP:3: B:207:0x07c4->B:208:0x07c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x07db  */
    /* JADX WARN: Code duplicated, block: B:212:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:218:0x07f3 A[LOOP:1: B:217:0x07f1->B:218:0x07f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x0804  */
    /* JADX WARN: Code duplicated, block: B:229:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.m2
    public final void d(Object obj, androidx.compose.foundation.text.selection.w wVar, a1 a1Var) throws Throwable {
        Object obj2;
        Object objK;
        Object objK2;
        e2 e2Var;
        f1 f1Var;
        Object obj3;
        e2 e2Var2;
        Object objG;
        Object obj4;
        e2 e2Var3 = this;
        w0 w0Var = (w0) wVar.e;
        int[] iArr = e2Var3.g;
        int i = e2Var3.i;
        int i2 = e2Var3.h;
        a1Var.getClass();
        n(obj);
        f1 f1Var2 = e2Var3.j;
        Object objG2 = null;
        while (true) {
            try {
                int iV0 = wVar.v0();
                int iW = (iV0 < e2Var3.c || iV0 > e2Var3.d) ? -1 : e2Var3.w(iV0, 0);
                if (iW >= 0) {
                    int iK = e2Var3.k(iW);
                    try {
                        try {
                            switch (l(iK)) {
                                case 0:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2 e2Var4 = e2Var3;
                                    int i3 = iK & 1048575;
                                    try {
                                        wVar.o0(1);
                                        e2Var = e2Var4;
                                        x2.c.l(obj, i3, w0Var.o());
                                        e2Var.t(iW, obj);
                                        e2Var3 = e2Var;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                        objK = objG2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (s2) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(5);
                                    x2.c.j(obj, iK & 1048575, w0Var.p());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.h(obj, iK & 1048575, w0Var.r());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.h(obj, iK & 1048575, w0Var.q());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.f(iK & 1048575, obj, w0Var.s());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(1);
                                    x2.h(obj, iK & 1048575, w0Var.t());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(5);
                                    x2.f(iK & 1048575, obj, w0Var.u());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.c.g(obj, iK & 1048575, w0Var.v());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    e2Var2.L(iK, wVar, obj);
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    m0 m0Var = (m0) e2Var2.G(iW, obj);
                                    m2 m2VarD = e2Var2.D(iW);
                                    wVar.o0(2);
                                    wVar.p0(m0Var, m2VarD, a1Var);
                                    e2Var2.H(iW, obj, m0Var);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    x2.j(iK & 1048575, obj, wVar.w0());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.f(iK & 1048575, obj, w0Var.A());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    int iB = w0Var.B();
                                    j0 j0VarF = e2Var2.F(iW);
                                    if (j0VarF != null && !j0VarF.a(iB)) {
                                        f1 f1Var3 = n2.a;
                                        if (obj2 == null) {
                                            f1Var.getClass();
                                            objG = f1.g(obj);
                                        } else {
                                            objG = obj2;
                                        }
                                        f1Var.getClass();
                                        ((s2) objG).d(iV0 << 3, Long.valueOf(iB));
                                        e2Var3 = e2Var2;
                                        objG2 = objG;
                                        f1Var2 = f1Var;
                                    }
                                    x2.f(iK & 1048575, obj, iB);
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(5);
                                    x2.f(iK & 1048575, obj, w0Var.C());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(1);
                                    x2.h(obj, iK & 1048575, w0Var.D());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.f(iK & 1048575, obj, w0Var.E());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    wVar.o0(0);
                                    x2.h(obj, iK & 1048575, w0Var.F());
                                    e2Var2.t(iW, obj);
                                    e2Var = e2Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var2 = e2Var3;
                                    obj3 = obj;
                                    try {
                                        m0 m0Var2 = (m0) e2Var2.G(iW, obj3);
                                        m2 m2VarD2 = e2Var2.D(iW);
                                        wVar.o0(3);
                                        wVar.q0(m0Var2, m2VarD2, a1Var);
                                        e2Var2.H(iW, obj3, m0Var2);
                                        e2Var = e2Var2;
                                        e2Var3 = e2Var;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                    } catch (s1 unused) {
                                        e2Var = e2Var2;
                                        objG2 = obj2;
                                        if (objG2 == null) {
                                            try {
                                                f1Var.getClass();
                                                objG2 = f1.g(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                f1Var2 = f1Var;
                                                objK = objG2;
                                                while (i2 < i) {
                                                    objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                                    i2++;
                                                }
                                                if (objK != null) {
                                                    f1Var2.getClass();
                                                    ((i1) obj).zzc = (s2) objK;
                                                }
                                                throw th;
                                            }
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case 18:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.x0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 19:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.y0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 20:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.Y(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 21:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.z0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 22:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.Z(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 23:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.a0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 24:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.b0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 25:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.c0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 26:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    if ((536870912 & iK) != 0) {
                                        wVar.d0(f1.c(iK & 1048575, obj), true);
                                    } else {
                                        wVar.d0(f1.c(iK & 1048575, obj), false);
                                    }
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 27:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.e0(f1.c(iK & 1048575, obj), e2Var.D(iW), a1Var);
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 28:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    wVar.g0(f1.c(iK & 1048575, obj));
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 29:
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            wVar.h0(f1.c(iK & 1048575, obj3));
                                            e2Var3 = e2Var;
                                            f1Var2 = f1Var;
                                            objG2 = obj2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            f1Var2 = f1Var;
                                            objG2 = obj2;
                                            objK = objG2;
                                            while (i2 < i) {
                                                objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                                i2++;
                                            }
                                            if (objK != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK;
                                            }
                                            throw th;
                                        }
                                    } catch (s1 unused2) {
                                        objG2 = obj2;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG2 = f1.g(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                        f1Var2 = f1Var;
                                        break;
                                    }
                                    break;
                                case 30:
                                    e2Var = e2Var3;
                                    f1Var = f1Var2;
                                    obj3 = obj;
                                    Object obj5 = objG2;
                                    try {
                                        r1 r1VarC = f1.c(iK & 1048575, obj3);
                                        wVar.i0(r1VarC);
                                        try {
                                            objG2 = n2.c(obj3, iV0, r1VarC, e2Var.F(iW), obj5, f1Var);
                                            f1Var = f1Var;
                                            e2Var3 = e2Var;
                                            f1Var2 = f1Var;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            f1Var = f1Var;
                                            f1Var2 = f1Var;
                                            objG2 = obj2;
                                            objK = objG2;
                                            while (i2 < i) {
                                                objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                                i2++;
                                            }
                                            if (objK != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK;
                                            }
                                            throw th;
                                        }
                                    } catch (s1 unused3) {
                                        obj2 = obj5;
                                        objG2 = obj2;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG2 = f1.g(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    break;
                                case 31:
                                    e2Var = e2Var3;
                                    wVar.j0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 32:
                                    e2Var = e2Var3;
                                    wVar.k0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.GETPROP /* 33 */:
                                    e2Var = e2Var3;
                                    wVar.l0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.GETPROPNOWARN /* 34 */:
                                    e2Var = e2Var3;
                                    wVar.m0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 35:
                                    e2Var = e2Var3;
                                    wVar.x0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.GETPROPNOWARN_SUPER /* 36 */:
                                    e2Var = e2Var3;
                                    wVar.y0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SETPROP /* 37 */:
                                    e2Var = e2Var3;
                                    wVar.Y(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SETPROP_SUPER /* 38 */:
                                    e2Var = e2Var3;
                                    wVar.z0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.GETELEM /* 39 */:
                                    e2Var = e2Var3;
                                    wVar.Z(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.GETELEM_SUPER /* 40 */:
                                    e2Var = e2Var3;
                                    wVar.a0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SETELEM /* 41 */:
                                    e2Var = e2Var3;
                                    wVar.b0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SETELEM_SUPER /* 42 */:
                                    e2Var = e2Var3;
                                    wVar.c0(f1.c(iK & 1048575, obj));
                                    obj2 = objG2;
                                    f1Var = f1Var2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.CALL /* 43 */:
                                    e2Var = e2Var3;
                                    obj3 = obj;
                                    try {
                                        wVar.h0(f1.c(iK & 1048575, obj3));
                                        obj2 = objG2;
                                        f1Var = f1Var2;
                                        e2Var3 = e2Var;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                    } catch (s1 unused4) {
                                        obj2 = objG2;
                                        f1Var = f1Var2;
                                        objG2 = obj2;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG2 = f1.g(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case Token.NAME /* 44 */:
                                    f1Var = f1Var2;
                                    try {
                                        r1 r1VarC2 = f1.c(iK & 1048575, obj);
                                        wVar.i0(r1VarC2);
                                        j0 j0VarF2 = e2Var3.F(iW);
                                        e2Var = e2Var3;
                                        obj3 = obj;
                                        Object obj6 = objG2;
                                        try {
                                            try {
                                                objG2 = n2.c(obj3, iV0, r1VarC2, j0VarF2, obj6, f1Var);
                                                f1Var2 = f1Var;
                                                e2Var3 = e2Var;
                                            } catch (s1 unused5) {
                                                obj2 = obj6;
                                                f1Var = f1Var;
                                                objG2 = obj2;
                                                if (objG2 == null) {
                                                    f1Var.getClass();
                                                    objG2 = f1.g(obj3);
                                                }
                                                f1Var.getClass();
                                                if (!f1.h(0, wVar, objG2)) {
                                                    objK2 = objG2;
                                                    while (i2 < i) {
                                                        objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                        i2++;
                                                        e2Var = this;
                                                        obj3 = obj;
                                                    }
                                                    f1Var2 = f1Var;
                                                    if (objK2 != null) {
                                                        f1Var2.getClass();
                                                        ((i1) obj).zzc = (s2) objK2;
                                                    }
                                                }
                                                e2Var3 = this;
                                                f1Var2 = f1Var;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            objG2 = obj6;
                                            f1Var2 = f1Var;
                                            obj2 = objG2;
                                            objG2 = obj2;
                                            objK = objG2;
                                            while (i2 < i) {
                                                objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                                i2++;
                                            }
                                            if (objK != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK;
                                            }
                                            throw th;
                                        }
                                    } catch (s1 unused6) {
                                        e2Var = e2Var3;
                                        obj3 = obj;
                                        obj2 = objG2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case Token.NUMBER /* 45 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.j0(f1.c(iK & 1048575, obj4));
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.STRING /* 46 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.k0(f1.c(iK & 1048575, obj4));
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.NULL /* 47 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.l0(f1.c(iK & 1048575, obj4));
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.THIS /* 48 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.m0(f1.c(iK & 1048575, obj4));
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.FALSE /* 49 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.f0(f1.c(iK & 1048575, obj4), e2Var3.D(iW), a1Var);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.TRUE /* 50 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    Object objE = e2Var3.E(iW);
                                    long jK = e2Var3.k(iW) & 1048575;
                                    Object objI = x2.i(jK, obj4);
                                    if (objI == null) {
                                        objI = z1.y.a();
                                        x2.j(jK, obj4, objI);
                                    } else if (!((z1) objI).e) {
                                        Object objA = z1.y.a();
                                        f1.f(objA, objI);
                                        x2.j(jK, obj4, objA);
                                        objI = objA;
                                    }
                                    wVar.n0((z1) objI, ((y1) objE).c(), a1Var);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SHEQ /* 51 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(1);
                                    x2.j(iK & 1048575, obj4, Double.valueOf(w0Var.o()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.SHNE /* 52 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(5);
                                    x2.j(iK & 1048575, obj4, Float.valueOf(w0Var.p()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.REGEXP /* 53 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Long.valueOf(w0Var.r()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.BINDNAME /* 54 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Long.valueOf(w0Var.q()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.THROW /* 55 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(w0Var.s()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.RETHROW /* 56 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(1);
                                    x2.j(iK & 1048575, obj4, Long.valueOf(w0Var.t()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.IN /* 57 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(5);
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(w0Var.u()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.INSTANCEOF /* 58 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Boolean.valueOf(w0Var.v()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.LOCAL_LOAD /* 59 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    e2Var3.L(iK, wVar, obj4);
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 60:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    m0 m0Var3 = (m0) e2Var3.I(iV0, iW, obj4);
                                    m2 m2VarD3 = e2Var3.D(iW);
                                    wVar.o0(2);
                                    wVar.p0(m0Var3, m2VarD3, a1Var);
                                    e2Var3.J(iV0, obj4, m0Var3, iW);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case 61:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    x2.j(iK & 1048575, obj4, wVar.w0());
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.CATCH_SCOPE /* 62 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(w0Var.A()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_INIT_KEYS /* 63 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    int iB2 = w0Var.B();
                                    j0 j0VarF3 = e2Var3.F(iW);
                                    if (j0VarF3 != null && !j0VarF3.a(iB2)) {
                                        f1 f1Var4 = n2.a;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG = f1.g(obj4);
                                        } else {
                                            objG = objG2;
                                        }
                                        f1Var.getClass();
                                        ((s2) objG).d(iV0 << 3, Long.valueOf(iB2));
                                        objG2 = objG;
                                        f1Var2 = f1Var;
                                    }
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(iB2));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_INIT_VALUES /* 64 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(5);
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(w0Var.C()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_INIT_ARRAY /* 65 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(1);
                                    x2.j(iK & 1048575, obj4, Long.valueOf(w0Var.D()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Integer.valueOf(w0Var.E()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_NEXT /* 67 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    wVar.o0(0);
                                    x2.j(iK & 1048575, obj4, Long.valueOf(w0Var.F()));
                                    e2Var3.v(iV0, iW, obj4);
                                    e2Var = e2Var3;
                                    obj2 = objG2;
                                    e2Var3 = e2Var;
                                    f1Var2 = f1Var;
                                    objG2 = obj2;
                                    break;
                                case Token.ENUM_ID /* 68 */:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    try {
                                        m0 m0Var4 = (m0) e2Var3.I(iV0, iW, obj4);
                                        m2 m2VarD4 = e2Var3.D(iW);
                                        wVar.o0(3);
                                        wVar.q0(m0Var4, m2VarD4, a1Var);
                                        e2Var3.J(iV0, obj4, m0Var4, iW);
                                        e2Var = e2Var3;
                                        obj2 = objG2;
                                        e2Var3 = e2Var;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                    } catch (s1 unused7) {
                                        e2Var = e2Var3;
                                        obj2 = objG2;
                                        obj3 = obj4;
                                        objG2 = obj2;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG2 = f1.g(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                        f1Var2 = f1Var;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objG2;
                                        f1Var2 = f1Var;
                                        objG2 = obj2;
                                        objK = objG2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (s2) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objG2 == null) {
                                        f1Var2.getClass();
                                        objG2 = f1.g(obj);
                                    }
                                    try {
                                        f1Var2.getClass();
                                        if (f1.h(0, wVar, objG2)) {
                                            f1Var = f1Var2;
                                            f1Var2 = f1Var;
                                        } else {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var3.K(obj, iArr[i2], objK2, f1Var2, obj);
                                                i2++;
                                                f1Var2 = f1Var2;
                                            }
                                            f1Var = f1Var2;
                                            f1Var2 = f1Var;
                                        }
                                    } catch (s1 unused8) {
                                        f1Var = f1Var2;
                                        e2Var = e2Var3;
                                        obj3 = obj;
                                        if (objG2 == null) {
                                            f1Var.getClass();
                                            objG2 = f1.g(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.h(0, wVar, objG2)) {
                                            objK2 = objG2;
                                            while (i2 < i) {
                                                objK2 = e2Var.K(obj3, iArr[i2], objK2, f1Var, obj);
                                                i2++;
                                                e2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objK2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (s2) objK2;
                                            }
                                        }
                                        e2Var3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        f1Var = f1Var2;
                                        f1Var2 = f1Var;
                                        objK = objG2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, f1Var2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (s2) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (s1 unused9) {
                            e2Var = e2Var3;
                            obj2 = objG2;
                            f1Var = f1Var2;
                            obj3 = obj;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = objG2;
                    }
                } else if (iV0 == Integer.MAX_VALUE) {
                    objK2 = objG2;
                    while (i2 < i) {
                        objK2 = e2Var3.K(obj, iArr[i2], objK2, f1Var2, obj);
                        i2++;
                        e2Var3 = this;
                    }
                } else {
                    if (objG2 == null) {
                        f1Var2.getClass();
                        objG2 = f1.g(obj);
                    }
                    try {
                        f1Var2.getClass();
                        if (f1.h(0, wVar, objG2)) {
                            e2Var3 = this;
                        } else {
                            objK2 = objG2;
                            while (i2 < i) {
                                objK2 = K(obj, iArr[i2], objK2, f1Var2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objK = objG2;
                        while (i2 < i) {
                            objK = K(obj, iArr[i2], objK, f1Var2, obj);
                            i2++;
                        }
                        if (objK != null) {
                            f1Var2.getClass();
                            ((i1) obj).zzc = (s2) objK;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objK2 != null) {
            f1Var2.getClass();
            ((i1) obj).zzc = (s2) objK2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int iK = k(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = l.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & iK) == 0 || r(obj2, i6, i, i2, i9)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!u(iArr[i6], i6, obj2) || D(i6).e(x2.i(iK & 1048575, obj2))) {
                                i3++;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                z1 z1Var = (z1) x2.i(iK & 1048575, obj2);
                                if (!z1Var.isEmpty() && ((a3) ((y1) E(i6)).a.z).e == b3.F) {
                                    m2 m2VarA = null;
                                    for (Object obj3 : z1Var.values()) {
                                        if (m2VarA == null) {
                                            m2VarA = j2.c.a(obj3.getClass());
                                        }
                                        if (!m2VarA.e(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) x2.i(iK & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        m2 m2VarD = D(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (m2VarD.e(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!r(obj2, i6, i, i2, i9) || D(i6).e(x2.i(iK & 1048575, obj2))) {
                    i3++;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.m2
    public final void f(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            i1Var.m();
            i1Var.zza = 0;
            i1Var.h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                s2 s2Var = ((i1) obj).zzc;
                if (s2Var.e) {
                    s2Var.e = false;
                    return;
                }
                return;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            long j = i2;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
                        case 17:
                            if (s(i, obj)) {
                                D(i).f(l.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case Token.GETPROP /* 33 */:
                        case Token.GETPROPNOWARN /* 34 */:
                        case 35:
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                        case Token.SETPROP /* 37 */:
                        case Token.SETPROP_SUPER /* 38 */:
                        case Token.GETELEM /* 39 */:
                        case Token.GETELEM_SUPER /* 40 */:
                        case Token.SETELEM /* 41 */:
                        case Token.SETELEM_SUPER /* 42 */:
                        case Token.CALL /* 43 */:
                        case Token.NAME /* 44 */:
                        case Token.NUMBER /* 45 */:
                        case Token.STRING /* 46 */:
                        case Token.NULL /* 47 */:
                        case Token.THIS /* 48 */:
                        case Token.FALSE /* 49 */:
                            n0 n0Var = (n0) ((r1) x2.i(j, obj));
                            if (n0Var.e) {
                                n0Var.e = false;
                            }
                            break;
                        case Token.TRUE /* 50 */:
                            Unsafe unsafe = l;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((z1) object).e = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (u(iArr[i], i, obj)) {
                    D(i).f(l.getObject(obj, j));
                }
            } else if (s(i, obj)) {
                D(i).f(l.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.m2
    public final boolean g(i1 i1Var, i1 i1Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iK = k(i);
                int iL = l(iK);
                if (iL <= 50 || iL >= 69) {
                    long j = iK & 1048575;
                    switch (iL) {
                        case 0:
                            if (q(i1Var, i1Var2, i)) {
                                w2 w2Var = x2.c;
                                if (Double.doubleToLongBits(w2Var.k(j, i1Var)) != Double.doubleToLongBits(w2Var.k(j, i1Var2))) {
                                }
                            }
                            break;
                        case 1:
                            if (q(i1Var, i1Var2, i)) {
                                w2 w2Var2 = x2.c;
                                if (Float.floatToIntBits(w2Var2.h(j, i1Var)) != Float.floatToIntBits(w2Var2.h(j, i1Var2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!q(i1Var, i1Var2, i) || x2.g(j, i1Var) != x2.g(j, i1Var2)) {
                            }
                            break;
                        case 3:
                            if (!q(i1Var, i1Var2, i) || x2.g(j, i1Var) != x2.g(j, i1Var2)) {
                            }
                            break;
                        case 4:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 5:
                            if (!q(i1Var, i1Var2, i) || x2.g(j, i1Var) != x2.g(j, i1Var2)) {
                            }
                            break;
                        case 6:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 7:
                            if (q(i1Var, i1Var2, i)) {
                                w2 w2Var3 = x2.c;
                                if (w2Var3.d(j, i1Var) != w2Var3.d(j, i1Var2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!q(i1Var, i1Var2, i) || !n2.a(x2.i(j, i1Var), x2.i(j, i1Var2))) {
                            }
                            break;
                        case 9:
                            if (!q(i1Var, i1Var2, i) || !n2.a(x2.i(j, i1Var), x2.i(j, i1Var2))) {
                            }
                            break;
                        case 10:
                            if (!q(i1Var, i1Var2, i) || !n2.a(x2.i(j, i1Var), x2.i(j, i1Var2))) {
                            }
                            break;
                        case 11:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 12:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 13:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 14:
                            if (!q(i1Var, i1Var2, i) || x2.g(j, i1Var) != x2.g(j, i1Var2)) {
                            }
                            break;
                        case 15:
                            if (!q(i1Var, i1Var2, i) || x2.e(j, i1Var) != x2.e(j, i1Var2)) {
                            }
                            break;
                        case 16:
                            if (!q(i1Var, i1Var2, i) || x2.g(j, i1Var) != x2.g(j, i1Var2)) {
                            }
                            break;
                        case 17:
                            if (!q(i1Var, i1Var2, i) || !n2.a(x2.i(j, i1Var), x2.i(j, i1Var2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case Token.GETPROP /* 33 */:
                        case Token.GETPROPNOWARN /* 34 */:
                        case 35:
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                        case Token.SETPROP /* 37 */:
                        case Token.SETPROP_SUPER /* 38 */:
                        case Token.GETELEM /* 39 */:
                        case Token.GETELEM_SUPER /* 40 */:
                        case Token.SETELEM /* 41 */:
                        case Token.SETELEM_SUPER /* 42 */:
                        case Token.CALL /* 43 */:
                        case Token.NAME /* 44 */:
                        case Token.NUMBER /* 45 */:
                        case Token.STRING /* 46 */:
                        case Token.NULL /* 47 */:
                        case Token.THIS /* 48 */:
                        case Token.FALSE /* 49 */:
                            zA = n2.a(x2.i(j, i1Var), x2.i(j, i1Var2));
                            if (zA) {
                            }
                            break;
                        case Token.TRUE /* 50 */:
                            zA = n2.a(x2.i(j, i1Var), x2.i(j, i1Var2));
                            if (zA) {
                            }
                            break;
                        case Token.SHEQ /* 51 */:
                        case Token.SHNE /* 52 */:
                        case Token.REGEXP /* 53 */:
                        case Token.BINDNAME /* 54 */:
                        case Token.THROW /* 55 */:
                        case Token.RETHROW /* 56 */:
                        case Token.IN /* 57 */:
                        case Token.INSTANCEOF /* 58 */:
                        case Token.LOCAL_LOAD /* 59 */:
                        case 60:
                        case 61:
                        case Token.CATCH_SCOPE /* 62 */:
                        case Token.ENUM_INIT_KEYS /* 63 */:
                        case Token.ENUM_INIT_VALUES /* 64 */:
                        case Token.ENUM_INIT_ARRAY /* 65 */:
                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        case Token.ENUM_NEXT /* 67 */:
                        case Token.ENUM_ID /* 68 */:
                            long j2 = iArr[i + 2] & 1048575;
                            if (x2.e(j2, i1Var) == x2.e(j2, i1Var2) && n2.a(x2.i(j, i1Var), x2.i(j, i1Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (x2.e(j3, i1Var) == x2.e(j3, i1Var2)) {
                            if (!u(0, i3, i1Var)) {
                                long jK = k(i3) & 1048575;
                                if (!n2.a(x2.i(jK, i1Var), x2.i(jK, i1Var2))) {
                                }
                            }
                            i2++;
                        }
                    } else if (i1Var.zzc.equals(i1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void h(Object obj, byte[] bArr, int i, int i2, p0 p0Var) {
        y(obj, bArr, i, i2, 0, p0Var);
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final void i(Object obj, s5 s5Var) {
        int i;
        z0 z0Var = (z0) s5Var.y;
        Unsafe unsafe = l;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((i1) obj).zzc.b(s5Var);
                return;
            }
            int iK = k(i4);
            int iL = l(iK);
            int i6 = iArr[i4];
            if (iL <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iK & i2;
            switch (iL) {
                case 0:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.i(i6, Double.doubleToRawLongBits(x2.c.k(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.g(i6, Float.floatToRawIntBits(x2.c.h(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.j(i6, x2.c.d(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (r(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            z0Var.k(i6, (String) object);
                        } else {
                            z0Var.l(i6, (t0) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (r(obj, i4, i3, i5, i)) {
                        s5Var.e(i6, unsafe.getObject(obj, j), D(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.l(i6, (t0) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.f(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (r(obj, i4, i3, i5, i)) {
                        z0Var.i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (r(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        z0Var.f(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (r(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        z0Var.h(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (r(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        z0Var.d(i6, 3);
                        D(i4).i((m0) object2, s5Var);
                        z0Var.d(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    n2.d(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    n2.e(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    n2.f(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    n2.g(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    n2.k(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    n2.i(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    n2.n(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    n2.q(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    f1 f1Var = n2.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            z0Var.k(i10, (String) list.get(i11));
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    m2 m2VarD = D(i4);
                    f1 f1Var2 = n2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            s5Var.e(i12, list2.get(i13), m2VarD);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    f1 f1Var3 = n2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            z0Var.l(i14, (t0) list3.get(i15));
                        }
                    }
                    break;
                case 29:
                    n2.l(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    n2.p(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    n2.o(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    n2.j(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Token.GETPROP /* 33 */:
                    n2.m(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    n2.h(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    n2.d(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    n2.e(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.SETPROP /* 37 */:
                    n2.f(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    n2.g(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.GETELEM /* 39 */:
                    n2.k(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    n2.i(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.SETELEM /* 41 */:
                    n2.n(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    n2.q(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.CALL /* 43 */:
                    n2.l(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.NAME /* 44 */:
                    n2.p(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.NUMBER /* 45 */:
                    n2.o(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.STRING /* 46 */:
                    n2.j(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.NULL /* 47 */:
                    n2.m(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.THIS /* 48 */:
                    n2.h(iArr[i4], (List) unsafe.getObject(obj, j), s5Var, true);
                    break;
                case Token.FALSE /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    m2 m2VarD2 = D(i4);
                    f1 f1Var4 = n2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            m0 m0Var = (m0) list4.get(i17);
                            z0Var.d(i16, 3);
                            m2VarD2.i(m0Var, s5Var);
                            z0Var.d(i16, 4);
                        }
                    }
                    break;
                case Token.TRUE /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = ((y1) E(i4)).a;
                        for (Map.Entry entry : ((z1) object3).entrySet()) {
                            z0Var.d(i6, 2);
                            z0Var.r(y1.b(cVar, entry.getKey(), entry.getValue()));
                            y1.a(z0Var, cVar, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case Token.SHEQ /* 51 */:
                    if (u(i6, i4, obj)) {
                        z0Var.i(i6, Double.doubleToRawLongBits(((Double) x2.i(j, obj)).doubleValue()));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (u(i6, i4, obj)) {
                        z0Var.g(i6, Float.floatToRawIntBits(((Float) x2.i(j, obj)).floatValue()));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (u(i6, i4, obj)) {
                        z0Var.h(i6, p(j, obj));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (u(i6, i4, obj)) {
                        z0Var.h(i6, p(j, obj));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (u(i6, i4, obj)) {
                        z0Var.e(i6, o(j, obj));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (u(i6, i4, obj)) {
                        z0Var.i(i6, p(j, obj));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (u(i6, i4, obj)) {
                        z0Var.g(i6, o(j, obj));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (u(i6, i4, obj)) {
                        z0Var.j(i6, ((Boolean) x2.i(j, obj)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (u(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            z0Var.k(i6, (String) object4);
                        } else {
                            z0Var.l(i6, (t0) object4);
                        }
                    }
                    break;
                case 60:
                    if (u(i6, i4, obj)) {
                        s5Var.e(i6, unsafe.getObject(obj, j), D(i4));
                    }
                    break;
                case 61:
                    if (u(i6, i4, obj)) {
                        z0Var.l(i6, (t0) unsafe.getObject(obj, j));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (u(i6, i4, obj)) {
                        z0Var.f(i6, o(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (u(i6, i4, obj)) {
                        z0Var.e(i6, o(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (u(i6, i4, obj)) {
                        z0Var.g(i6, o(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (u(i6, i4, obj)) {
                        z0Var.i(i6, p(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (u(i6, i4, obj)) {
                        int iO = o(j, obj);
                        z0Var.f(i6, (iO >> 31) ^ (iO + iO));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (u(i6, i4, obj)) {
                        long jP = p(j, obj);
                        z0Var.h(i6, (jP >> 63) ^ (jP + jP));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (u(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        z0Var.d(i6, 3);
                        D(i4).i((m0) object5, s5Var);
                        z0Var.d(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final int j(i1 i1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int iK = k(i5);
            int iL = l(iK);
            if (iL <= 50 || iL >= 69) {
                long j = iK & 1048575;
                int iHashCode2 = 37;
                switch (iL) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(x2.c.k(j, i1Var));
                        byte[] bArr = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(x2.c.h(j, i1Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = x2.g(j, i1Var);
                        byte[] bArr2 = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = x2.g(j, i1Var);
                        byte[] bArr3 = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = x2.g(j, i1Var);
                        byte[] bArr4 = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zD = x2.c.d(j, i1Var);
                        byte[] bArr5 = p1.a;
                        i3 = zD ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) x2.i(j, i1Var)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objI = x2.i(j, i1Var);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.i(j, i1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = x2.g(j, i1Var);
                        byte[] bArr6 = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.e(j, i1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = x2.g(j, i1Var);
                        byte[] bArr7 = p1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objI2 = x2.i(j, i1Var);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case Token.GETPROP /* 33 */:
                    case Token.GETPROPNOWARN /* 34 */:
                    case 35:
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                    case Token.SETPROP /* 37 */:
                    case Token.SETPROP_SUPER /* 38 */:
                    case Token.GETELEM /* 39 */:
                    case Token.GETELEM_SUPER /* 40 */:
                    case Token.SETELEM /* 41 */:
                    case Token.SETELEM_SUPER /* 42 */:
                    case Token.CALL /* 43 */:
                    case Token.NAME /* 44 */:
                    case Token.NUMBER /* 45 */:
                    case Token.STRING /* 46 */:
                    case Token.NULL /* 47 */:
                    case Token.THIS /* 48 */:
                    case Token.FALSE /* 49 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.i(j, i1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case Token.TRUE /* 50 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = x2.i(j, i1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i6 >= iArr.length) {
                return i1Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!u(0, i7, i1Var)) {
                iHashCode = x2.i(k(i7) & 1048575, i1Var).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final boolean q(i1 i1Var, i1 i1Var2, int i) {
        return s(i, i1Var) == s(i, i1Var2);
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iK = k(i);
            long j2 = iK & 1048575;
            switch (l(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(x2.c.k(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x2.c.h(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x2.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x2.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x2.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x2.c.d(j2, obj);
                case 8:
                    Object objI = x2.i(j2, obj);
                    if (objI instanceof String) {
                        if (((String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof t0)) {
                            net.luminis.tls.engine.impl.c.a();
                            return false;
                        }
                        if (t0.y.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (x2.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (t0.y.equals(x2.i(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x2.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x2.e(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x2.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x2.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    net.luminis.tls.engine.impl.c.a();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & x2.e(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        x2.f(j, obj, (1 << (i2 >>> 20)) | x2.e(j, obj));
    }

    public final boolean u(int i, int i2, Object obj) {
        return x2.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i2, Object obj) {
        x2.f(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int y(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.measurement.p0 r43) {
        /*
            Method dump skipped, instruction units count: 3786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e2.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.p0):int");
    }
}
