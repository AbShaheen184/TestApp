package com.google.protobuf;

import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements a2 {
    public static final int[] n = new int[0];
    public static final Unsafe o = l2.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final l1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final p1 j;
    public final b1 k;
    public final g2 l;
    public final h1 m;

    public n1(int[] iArr, Object[] objArr, int i, int i2, l1 l1Var, int[] iArr2, int i3, int i4, p1 p1Var, b1 b1Var, g2 g2Var, b0 b0Var, h1 h1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = l1Var instanceof GeneratedMessageLite;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = p1Var;
        this.k = b1Var;
        this.l = g2Var;
        this.e = l1Var;
        this.m = h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0249  */
    /* JADX WARN: Code duplicated, block: B:120:0x024c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:124:0x026c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0329  */
    /* JADX WARN: Code duplicated, block: B:176:0x037c  */
    public static n1 A(v1 v1Var, p1 p1Var, b1 b1Var, g2 g2Var, b0 b0Var, h1 h1Var) {
        int i;
        int iCharAt;
        int[] iArr;
        int i2;
        int i3;
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
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int i23;
        Field fieldM;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM2;
        int i28;
        Object obj2;
        Field fieldM3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        String str = v1Var.b;
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
            iArr = n;
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
            iArr = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i60 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = o;
        Object[] objArr = v1Var.c;
        Class<?> cls = v1Var.a.getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i35 < length) {
            int i67 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i68 = iCharAt9 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    cCharAt11 = str.charAt(i69);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt11 & 8191) << i70;
                    i70 += 13;
                    i69 = i31;
                    length = i16;
                }
                iCharAt9 = i68 | (cCharAt11 << i70);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i67;
            }
            int i71 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i72 = iCharAt10 & 8191;
                int i73 = 13;
                while (true) {
                    i30 = i71 + 1;
                    cCharAt10 = str.charAt(i71);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i72 |= (cCharAt10 & 8191) << i73;
                    i73 += 13;
                    i71 = i30;
                    c = 55296;
                }
                iCharAt10 = i72 | (cCharAt10 << i73);
                i71 = i30;
            }
            int i74 = iCharAt10 & 255;
            int i75 = iCharAt9;
            if ((iCharAt10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr3 = iArr2;
            if (i74 >= 51) {
                int i76 = i71 + 1;
                int iCharAt11 = str.charAt(i71);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i77 = iCharAt11 & 8191;
                    int i78 = 13;
                    while (true) {
                        i29 = i76 + 1;
                        cCharAt9 = str.charAt(i76);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i77 |= (cCharAt9 & 8191) << i78;
                        i78 += 13;
                        i76 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i77 | (cCharAt9 << i78);
                    i76 = i29;
                }
                int i79 = i74 - 51;
                i22 = i76;
                if (i79 == 9 || i79 == 17) {
                    i26 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12 && (androidx.constraintlayout.core.g.b(v1Var.a(), 1) || (iCharAt10 & 2048) != 0)) {
                        i26 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i27 = iCharAt11 * 2;
                    obj = objArr3[i27];
                    if (obj instanceof Field) {
                        fieldM2 = (Field) obj;
                    } else {
                        fieldM2 = M(cls, (String) obj);
                        objArr3[i27] = fieldM2;
                        iArr[i63] = i66;
                        i63++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM2);
                    i28 = i27 + 1;
                    obj2 = objArr3[i28];
                    if (obj2 instanceof Field) {
                        fieldM3 = (Field) obj2;
                    } else {
                        fieldM3 = M(cls, (String) obj2);
                        objArr3[i28] = fieldM3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3);
                    i20 = i6;
                    i21 = iObjectFieldOffset3;
                    i23 = 0;
                    i18 = i4;
                    cls = cls;
                }
                i6 = i26;
                i27 = iCharAt11 * 2;
                obj = objArr3[i27];
                if (obj instanceof Field) {
                    fieldM2 = (Field) obj;
                } else {
                    fieldM2 = M(cls, (String) obj);
                    objArr3[i27] = fieldM2;
                    iArr[i63] = i66;
                    i63++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM2);
                i28 = i27 + 1;
                obj2 = objArr3[i28];
                if (obj2 instanceof Field) {
                    fieldM3 = (Field) obj2;
                } else {
                    fieldM3 = M(cls, (String) obj2);
                    objArr3[i28] = fieldM3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3);
                i20 = i6;
                i21 = iObjectFieldOffset4;
                i23 = 0;
                i18 = i4;
                cls = cls;
            } else {
                int i80 = i6 + 1;
                Field fieldM4 = M(cls, (String) objArr3[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i4;
                    objArr2[((i66 / 3) * 2) + 1] = fieldM4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i4;
                        i25 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i80];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i4;
                        if (v1Var.a() == 1 || (iCharAt10 & 2048) != 0) {
                            i25 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i80];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                        if ((iCharAt10 & 4096) != 0 || i74 > 17) {
                            i20 = i19;
                            iObjectFieldOffset2 = 1048575;
                            i21 = iObjectFieldOffset;
                            i22 = i71;
                            i23 = 0;
                        } else {
                            int i81 = i71 + 1;
                            int iCharAt12 = str.charAt(i71);
                            if (iCharAt12 >= 55296) {
                                int i82 = iCharAt12 & 8191;
                                int i83 = 13;
                                while (true) {
                                    i24 = i81 + 1;
                                    cCharAt8 = str.charAt(i81);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i82 |= (cCharAt8 & 8191) << i83;
                                    i83 += 13;
                                    i81 = i24;
                                }
                                iCharAt12 = i82 | (cCharAt8 << i83);
                                i81 = i24;
                            }
                            int i84 = (iCharAt12 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i84];
                            if (obj3 instanceof Field) {
                                fieldM = (Field) obj3;
                            } else {
                                fieldM = M(cls, (String) obj3);
                                objArr3[i84] = fieldM;
                            }
                            i20 = i19;
                            i23 = iCharAt12 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM);
                            i21 = iObjectFieldOffset;
                            i22 = i81;
                        }
                    } else {
                        if (i74 == 50) {
                            int i85 = i64 + 1;
                            iArr[i64] = i66;
                            int i86 = (i66 / 3) * 2;
                            int i87 = i6 + 2;
                            objArr2[i86] = objArr3[i80];
                            if ((iCharAt10 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i86 + 1] = objArr3[i87];
                                i18 = i4;
                                i64 = i85;
                            } else {
                                i19 = i87;
                                i64 = i85;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                        if ((iCharAt10 & 4096) != 0) {
                            i20 = i19;
                            iObjectFieldOffset2 = 1048575;
                            i21 = iObjectFieldOffset;
                            i22 = i71;
                            i23 = 0;
                        } else {
                            i20 = i19;
                            iObjectFieldOffset2 = 1048575;
                            i21 = iObjectFieldOffset;
                            i22 = i71;
                            i23 = 0;
                        }
                    }
                    i19 = i25;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                    if ((iCharAt10 & 4096) != 0) {
                        i20 = i19;
                        iObjectFieldOffset2 = 1048575;
                        i21 = iObjectFieldOffset;
                        i22 = i71;
                        i23 = 0;
                    } else {
                        i20 = i19;
                        iObjectFieldOffset2 = 1048575;
                        i21 = iObjectFieldOffset;
                        i22 = i71;
                        i23 = 0;
                    }
                }
                i19 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                if ((iCharAt10 & 4096) != 0) {
                    i20 = i19;
                    iObjectFieldOffset2 = 1048575;
                    i21 = iObjectFieldOffset;
                    i22 = i71;
                    i23 = 0;
                } else {
                    i20 = i19;
                    iObjectFieldOffset2 = 1048575;
                    i21 = iObjectFieldOffset;
                    i22 = i71;
                    i23 = 0;
                }
            }
            int i88 = i66 + 1;
            iArr3[i66] = i75;
            int i89 = i66 + 2;
            iArr3[i88] = ((iCharAt10 & LibretroCore.SCREEN_WIDTH) != 0 ? 268435456 : 0) | ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i21;
            i66 += 3;
            iArr3[i89] = (i23 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            length = i16;
            i4 = i18;
            i6 = i20;
            iArr2 = iArr3;
            str = str;
            i35 = i22;
            i33 = 55296;
        }
        return new n1(iArr2, objArr2, i2, i5, v1Var.a, iArr, i7, i62, p1Var, b1Var, g2Var, b0Var, h1Var);
    }

    public static long B(int i) {
        return i & 1048575;
    }

    public static int C(long j, Object obj) {
        return ((Integer) l2.c.k(j, obj)).intValue();
    }

    public static long D(long j, Object obj) {
        return ((Long) l2.c.k(j, obj)).longValue();
    }

    public static Field M(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Field ", str, " for ");
            sbX.append(cls.getName());
            sbX.append(" not found. Known fields are ");
            sbX.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbX.toString(), e);
        }
    }

    public static int S(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.o(obj, "Mutating immutable message: "));
    }

    public static int m(byte[] bArr, int i, int i2, t2 t2Var, Class cls, com.google.android.gms.internal.measurement.p0 p0Var) throws x0 {
        switch (t2Var.ordinal()) {
            case 0:
                p0Var.c = Double.valueOf(Double.longBitsToDouble(kotlin.collections.a0.f(bArr, i)));
                return i + 8;
            case 1:
                p0Var.c = Float.valueOf(Float.intBitsToFloat(kotlin.collections.a0.e(bArr, i)));
                return i + 4;
            case 2:
            case 3:
                int iM = kotlin.collections.a0.m(bArr, i, p0Var);
                p0Var.c = Long.valueOf(p0Var.b);
                return iM;
            case 4:
            case 12:
            case 13:
                int iK = kotlin.collections.a0.k(bArr, i, p0Var);
                p0Var.c = Integer.valueOf(p0Var.a);
                return iK;
            case 5:
            case 15:
                p0Var.c = Long.valueOf(kotlin.collections.a0.f(bArr, i));
                return i + 8;
            case 6:
            case 14:
                p0Var.c = Integer.valueOf(kotlin.collections.a0.e(bArr, i));
                return i + 4;
            case 7:
                int iM2 = kotlin.collections.a0.m(bArr, i, p0Var);
                p0Var.c = Boolean.valueOf(p0Var.b != 0);
                return iM2;
            case 8:
                int iK2 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i3 = p0Var.a;
                if (i3 < 0) {
                    throw x0.e();
                }
                String strG = "";
                if (i3 == 0) {
                    p0Var.c = "";
                    return iK2;
                }
                if (i3 == 0) {
                    com.google.android.material.resources.b bVar = o2.a;
                } else {
                    strG = o2.a.g(bArr, iK2, i3);
                }
                p0Var.c = strG;
                return iK2 + i3;
            case 9:
            default:
                org.mozilla.javascript.c.b("unsupported field type.");
                return 0;
            case 10:
                a2 a2VarA = t1.c.a(cls);
                GeneratedMessageLite generatedMessageLiteD = a2VarA.d();
                int iX = kotlin.collections.a0.x(generatedMessageLiteD, a2VarA, bArr, i, i2, p0Var);
                a2VarA.b(generatedMessageLiteD);
                p0Var.c = generatedMessageLiteD;
                return iX;
            case 11:
                return kotlin.collections.a0.d(bArr, i, p0Var);
            case 16:
                int iK3 = kotlin.collections.a0.k(bArr, i, p0Var);
                p0Var.c = Integer.valueOf(t.b(p0Var.a));
                return iK3;
            case 17:
                int iM3 = kotlin.collections.a0.m(bArr, i, p0Var);
                p0Var.c = Long.valueOf(t.c(p0Var.b));
                return iM3;
        }
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.measurement.p0 p0Var) throws x0 {
        int iM;
        Unsafe unsafe = o;
        Object objP = p(i3);
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            h1.a(mapFieldLiteMutableCopy, object);
            unsafe.putObject(obj, j, mapFieldLiteMutableCopy);
            object = mapFieldLiteMutableCopy;
        }
        com.google.common.util.concurrent.g0 g0Var = ((g1) objP).a;
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int iK = kotlin.collections.a0.k(bArr, i, p0Var);
        int i4 = p0Var.a;
        if (i4 < 0 || i4 > i2 - iK) {
            throw x0.g();
        }
        int i5 = iK + i4;
        Object obj2 = "";
        Object obj3 = obj2;
        while (iK < i5) {
            int iJ = iK + 1;
            int i6 = bArr[iK];
            if (i6 < 0) {
                iJ = kotlin.collections.a0.j(i6, bArr, iJ, p0Var);
                i6 = p0Var.a;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2) {
                    t2 t2Var = (t2) g0Var.z;
                    if (i8 == t2Var.y) {
                        iM = m(bArr, iJ, i2, t2Var, "".getClass(), p0Var);
                        obj3 = p0Var.c;
                        iK = iM;
                    }
                }
                iK = kotlin.collections.a0.E(i6, bArr, iJ, i2, p0Var);
            } else {
                t2 t2Var2 = (t2) g0Var.y;
                if (i8 == t2Var2.y) {
                    iM = m(bArr, iJ, i2, t2Var2, null, p0Var);
                    obj2 = p0Var.c;
                    iK = iM;
                } else {
                    iK = kotlin.collections.a0.E(i6, bArr, iJ, i2, p0Var);
                }
            }
        }
        if (iK != i5) {
            throw x0.f();
        }
        mapFieldLite.put(obj2, obj3);
        return i5;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int F(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.p0 r34) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.n1.F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.p0):int");
    }

    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.measurement.p0 p0Var) throws x0 {
        int i9;
        Unsafe unsafe = o;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case Token.SHEQ /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(kotlin.collections.a0.f(bArr, i))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case Token.SHNE /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(kotlin.collections.a0.e(bArr, i))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int iM = kotlin.collections.a0.m(bArr, i, p0Var);
                unsafe.putObject(obj, j, Long.valueOf(p0Var.b));
                unsafe.putInt(obj, j2, i4);
                return iM;
            case Token.THROW /* 55 */:
            case Token.CATCH_SCOPE /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iK = kotlin.collections.a0.k(bArr, i, p0Var);
                unsafe.putObject(obj, j, Integer.valueOf(p0Var.a));
                unsafe.putInt(obj, j2, i4);
                return iK;
            case Token.RETHROW /* 56 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(kotlin.collections.a0.f(bArr, i)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case Token.IN /* 57 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(kotlin.collections.a0.e(bArr, i)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case Token.INSTANCEOF /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                int iM2 = kotlin.collections.a0.m(bArr, i, p0Var);
                unsafe.putObject(obj, j, Boolean.valueOf(p0Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM2;
            case Token.LOCAL_LOAD /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int iK2 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i14 = p0Var.a;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!o2.a.m(bArr, iK2, iK2 + i14)) {
                            throw x0.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iK2, i14, StandardCharsets.UTF_8));
                    iK2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iK2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objZ = z(i4, i8, obj);
                    int iX = kotlin.collections.a0.x(objZ, q(i8), bArr, i9, i2, p0Var);
                    R(i4, obj, objZ, i8);
                    return iX;
                }
                break;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iD = kotlin.collections.a0.d(bArr, i9, p0Var);
                    unsafe.putObject(obj, j, p0Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return iD;
                }
                break;
            case Token.ENUM_INIT_KEYS /* 63 */:
                i9 = i;
                if (i5 == 0) {
                    int iK3 = kotlin.collections.a0.k(bArr, i9, p0Var);
                    int i15 = p0Var.a;
                    o(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iK3;
                }
                break;
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                i9 = i;
                if (i5 == 0) {
                    int iK4 = kotlin.collections.a0.k(bArr, i9, p0Var);
                    unsafe.putObject(obj, j, Integer.valueOf(t.b(p0Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return iK4;
                }
                break;
            case Token.ENUM_NEXT /* 67 */:
                i9 = i;
                if (i5 == 0) {
                    int iM3 = kotlin.collections.a0.m(bArr, i9, p0Var);
                    unsafe.putObject(obj, j, Long.valueOf(t.c(p0Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return iM3;
                }
                break;
            case Token.ENUM_ID /* 68 */:
                if (i5 == 3) {
                    Object objZ2 = z(i4, i8, obj);
                    int iW = kotlin.collections.a0.w(objZ2, q(i8), bArr, i, i2, (i3 & (-8)) | 4, p0Var);
                    R(i4, obj, objZ2, i8);
                    return iW;
                }
            default:
                return i;
        }
        return i9;
    }

    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, com.google.android.gms.internal.measurement.p0 p0Var) throws x0 {
        int i7;
        int iL;
        Unsafe unsafe = o;
        t0 t0VarM = (t0) unsafe.getObject(obj, j2);
        if (!((c) t0VarM).e) {
            t0VarM = t0VarM.m(t0VarM.size() * 2);
            unsafe.putObject(obj, j2, t0VarM);
        }
        t0 t0Var = t0VarM;
        switch (i6) {
            case 18:
            case 35:
                if (i4 != 2) {
                    if (i4 != 1) {
                        return i;
                    }
                    x xVar = (x) t0Var;
                    xVar.c(Double.longBitsToDouble(kotlin.collections.a0.f(bArr, i)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int iK = kotlin.collections.a0.k(bArr, i8, p0Var);
                        if (i3 != p0Var.a) {
                            return i8;
                        }
                        xVar.c(Double.longBitsToDouble(kotlin.collections.a0.f(bArr, iK)));
                        i8 = iK + 8;
                    }
                    return i8;
                }
                x xVar2 = (x) t0Var;
                int iK2 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i9 = p0Var.a;
                int i10 = iK2 + i9;
                if (i10 > bArr.length) {
                    throw x0.g();
                }
                int i11 = (i9 / 8) + xVar2.z;
                double[] dArr = xVar2.y;
                if (i11 > dArr.length) {
                    if (dArr.length == 0) {
                        xVar2.y = new double[Math.max(i11, 10)];
                    } else {
                        int length = dArr.length;
                        while (length < i11) {
                            length = com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10);
                        }
                        xVar2.y = Arrays.copyOf(xVar2.y, length);
                    }
                }
                while (iK2 < i10) {
                    xVar2.c(Double.longBitsToDouble(kotlin.collections.a0.f(bArr, iK2)));
                    iK2 += 8;
                }
                if (iK2 == i10) {
                    return iK2;
                }
                throw x0.g();
            case 19:
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                if (i4 != 2) {
                    if (i4 != 5) {
                        return i;
                    }
                    f0 f0Var = (f0) t0Var;
                    f0Var.c(Float.intBitsToFloat(kotlin.collections.a0.e(bArr, i)));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int iK3 = kotlin.collections.a0.k(bArr, i12, p0Var);
                        if (i3 != p0Var.a) {
                            return i12;
                        }
                        f0Var.c(Float.intBitsToFloat(kotlin.collections.a0.e(bArr, iK3)));
                        i12 = iK3 + 4;
                    }
                    return i12;
                }
                f0 f0Var2 = (f0) t0Var;
                int iK4 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i13 = p0Var.a;
                int i14 = iK4 + i13;
                if (i14 > bArr.length) {
                    throw x0.g();
                }
                int i15 = (i13 / 4) + f0Var2.z;
                float[] fArr = f0Var2.y;
                if (i15 > fArr.length) {
                    if (fArr.length == 0) {
                        f0Var2.y = new float[Math.max(i15, 10)];
                    } else {
                        int length2 = fArr.length;
                        while (length2 < i15) {
                            length2 = com.google.android.datatransport.runtime.backends.c.o(length2, 3, 2, 1, 10);
                        }
                        f0Var2.y = Arrays.copyOf(f0Var2.y, length2);
                    }
                }
                while (iK4 < i14) {
                    f0Var2.c(Float.intBitsToFloat(kotlin.collections.a0.e(bArr, iK4)));
                    iK4 += 4;
                }
                if (iK4 == i14) {
                    return iK4;
                }
                throw x0.g();
            case 20:
            case 21:
            case Token.SETPROP /* 37 */:
            case Token.SETPROP_SUPER /* 38 */:
                if (i4 == 2) {
                    d1 d1Var = (d1) t0Var;
                    int iK5 = kotlin.collections.a0.k(bArr, i, p0Var);
                    int i16 = p0Var.a + iK5;
                    while (iK5 < i16) {
                        iK5 = kotlin.collections.a0.m(bArr, iK5, p0Var);
                        d1Var.c(p0Var.b);
                    }
                    if (iK5 == i16) {
                        return iK5;
                    }
                    throw x0.g();
                }
                if (i4 != 0) {
                    return i;
                }
                d1 d1Var2 = (d1) t0Var;
                int iM = kotlin.collections.a0.m(bArr, i, p0Var);
                d1Var2.c(p0Var.b);
                while (iM < i2) {
                    int iK6 = kotlin.collections.a0.k(bArr, iM, p0Var);
                    if (i3 != p0Var.a) {
                        return iM;
                    }
                    iM = kotlin.collections.a0.m(bArr, iK6, p0Var);
                    d1Var2.c(p0Var.b);
                }
                return iM;
            case 22:
            case 29:
            case Token.GETELEM /* 39 */:
            case Token.CALL /* 43 */:
                if (i4 != 2) {
                    return i4 == 0 ? kotlin.collections.a0.l(i3, bArr, i, i2, t0Var, p0Var) : i;
                }
                m0 m0Var = (m0) t0Var;
                int iK7 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i17 = p0Var.a + iK7;
                while (iK7 < i17) {
                    iK7 = kotlin.collections.a0.k(bArr, iK7, p0Var);
                    m0Var.c(p0Var.a);
                }
                if (iK7 == i17) {
                    return iK7;
                }
                throw x0.g();
            case 23:
            case 32:
            case Token.GETELEM_SUPER /* 40 */:
            case Token.STRING /* 46 */:
                if (i4 != 2) {
                    if (i4 != 1) {
                        return i;
                    }
                    d1 d1Var3 = (d1) t0Var;
                    d1Var3.c(kotlin.collections.a0.f(bArr, i));
                    int i18 = i + 8;
                    while (i18 < i2) {
                        int iK8 = kotlin.collections.a0.k(bArr, i18, p0Var);
                        if (i3 != p0Var.a) {
                            return i18;
                        }
                        d1Var3.c(kotlin.collections.a0.f(bArr, iK8));
                        i18 = iK8 + 8;
                    }
                    return i18;
                }
                d1 d1Var4 = (d1) t0Var;
                int iK9 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i19 = p0Var.a;
                int i20 = iK9 + i19;
                if (i20 > bArr.length) {
                    throw x0.g();
                }
                int i21 = (i19 / 8) + d1Var4.z;
                long[] jArr = d1Var4.y;
                if (i21 > jArr.length) {
                    if (jArr.length == 0) {
                        d1Var4.y = new long[Math.max(i21, 10)];
                    } else {
                        int length3 = jArr.length;
                        while (length3 < i21) {
                            length3 = com.google.android.datatransport.runtime.backends.c.o(length3, 3, 2, 1, 10);
                        }
                        d1Var4.y = Arrays.copyOf(d1Var4.y, length3);
                    }
                }
                while (iK9 < i20) {
                    d1Var4.c(kotlin.collections.a0.f(bArr, iK9));
                    iK9 += 8;
                }
                if (iK9 == i20) {
                    return iK9;
                }
                throw x0.g();
            case 24:
            case 31:
            case Token.SETELEM /* 41 */:
            case Token.NUMBER /* 45 */:
                if (i4 != 2) {
                    if (i4 != 5) {
                        return i;
                    }
                    m0 m0Var2 = (m0) t0Var;
                    m0Var2.c(kotlin.collections.a0.e(bArr, i));
                    int i22 = i + 4;
                    while (i22 < i2) {
                        int iK10 = kotlin.collections.a0.k(bArr, i22, p0Var);
                        if (i3 != p0Var.a) {
                            return i22;
                        }
                        m0Var2.c(kotlin.collections.a0.e(bArr, iK10));
                        i22 = iK10 + 4;
                    }
                    return i22;
                }
                m0 m0Var3 = (m0) t0Var;
                int iK11 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i23 = p0Var.a;
                int i24 = iK11 + i23;
                if (i24 > bArr.length) {
                    throw x0.g();
                }
                int i25 = (i23 / 4) + m0Var3.z;
                int[] iArr = m0Var3.y;
                if (i25 > iArr.length) {
                    if (iArr.length == 0) {
                        m0Var3.y = new int[Math.max(i25, 10)];
                    } else {
                        int length4 = iArr.length;
                        while (length4 < i25) {
                            length4 = com.google.android.datatransport.runtime.backends.c.o(length4, 3, 2, 1, 10);
                        }
                        m0Var3.y = Arrays.copyOf(m0Var3.y, length4);
                    }
                }
                while (iK11 < i24) {
                    m0Var3.c(kotlin.collections.a0.e(bArr, iK11));
                    iK11 += 4;
                }
                if (iK11 == i24) {
                    return iK11;
                }
                throw x0.g();
            case 25:
            case Token.SETELEM_SUPER /* 42 */:
                if (i4 == 2) {
                    e eVar = (e) t0Var;
                    int iK12 = kotlin.collections.a0.k(bArr, i, p0Var);
                    int i26 = p0Var.a + iK12;
                    while (iK12 < i26) {
                        iK12 = kotlin.collections.a0.m(bArr, iK12, p0Var);
                        eVar.c(p0Var.b != 0);
                    }
                    if (iK12 == i26) {
                        return iK12;
                    }
                    throw x0.g();
                }
                if (i4 != 0) {
                    return i;
                }
                e eVar2 = (e) t0Var;
                int iM2 = kotlin.collections.a0.m(bArr, i, p0Var);
                eVar2.c(p0Var.b != 0);
                while (iM2 < i2) {
                    int iK13 = kotlin.collections.a0.k(bArr, iM2, p0Var);
                    if (i3 != p0Var.a) {
                        return iM2;
                    }
                    iM2 = kotlin.collections.a0.m(bArr, iK13, p0Var);
                    eVar2.c(p0Var.b != 0);
                }
                return iM2;
            case 26:
                if (i4 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    int iK14 = kotlin.collections.a0.k(bArr, i, p0Var);
                    int i27 = p0Var.a;
                    if (i27 < 0) {
                        throw x0.e();
                    }
                    if (i27 == 0) {
                        t0Var.add("");
                    } else {
                        t0Var.add(new String(bArr, iK14, i27, StandardCharsets.UTF_8));
                        iK14 += i27;
                    }
                    while (iK14 < i2) {
                        int iK15 = kotlin.collections.a0.k(bArr, iK14, p0Var);
                        if (i3 != p0Var.a) {
                            return iK14;
                        }
                        iK14 = kotlin.collections.a0.k(bArr, iK15, p0Var);
                        int i28 = p0Var.a;
                        if (i28 < 0) {
                            throw x0.e();
                        }
                        if (i28 == 0) {
                            t0Var.add("");
                        } else {
                            t0Var.add(new String(bArr, iK14, i28, StandardCharsets.UTF_8));
                            iK14 += i28;
                        }
                    }
                    return iK14;
                }
                int iK16 = kotlin.collections.a0.k(bArr, i, p0Var);
                int i29 = p0Var.a;
                if (i29 < 0) {
                    throw x0.e();
                }
                if (i29 == 0) {
                    t0Var.add("");
                } else {
                    int i30 = iK16 + i29;
                    if (!o2.a.m(bArr, iK16, i30)) {
                        throw x0.b();
                    }
                    t0Var.add(new String(bArr, iK16, i29, StandardCharsets.UTF_8));
                    iK16 = i30;
                }
                while (iK16 < i2) {
                    int iK17 = kotlin.collections.a0.k(bArr, iK16, p0Var);
                    if (i3 != p0Var.a) {
                        return iK16;
                    }
                    iK16 = kotlin.collections.a0.k(bArr, iK17, p0Var);
                    int i31 = p0Var.a;
                    if (i31 < 0) {
                        throw x0.e();
                    }
                    if (i31 == 0) {
                        t0Var.add("");
                    } else {
                        int i32 = iK16 + i31;
                        if (!o2.a.m(bArr, iK16, i32)) {
                            throw x0.b();
                        }
                        t0Var.add(new String(bArr, iK16, i31, StandardCharsets.UTF_8));
                        iK16 = i32;
                    }
                }
                return iK16;
            case 27:
                i7 = i;
                if (i4 == 2) {
                    return kotlin.collections.a0.h(q(i5), i3, bArr, i7, i2, t0Var, p0Var);
                }
                break;
            case 28:
                i7 = i;
                if (i4 == 2) {
                    int iK18 = kotlin.collections.a0.k(bArr, i7, p0Var);
                    int i33 = p0Var.a;
                    if (i33 < 0) {
                        throw x0.e();
                    }
                    if (i33 > bArr.length - iK18) {
                        throw x0.g();
                    }
                    if (i33 == 0) {
                        t0Var.add(ByteString.EMPTY);
                    } else {
                        t0Var.add(ByteString.copyFrom(bArr, iK18, i33));
                        iK18 += i33;
                    }
                    while (iK18 < i2) {
                        int iK19 = kotlin.collections.a0.k(bArr, iK18, p0Var);
                        if (i3 != p0Var.a) {
                            return iK18;
                        }
                        iK18 = kotlin.collections.a0.k(bArr, iK19, p0Var);
                        int i34 = p0Var.a;
                        if (i34 < 0) {
                            throw x0.e();
                        }
                        if (i34 > bArr.length - iK18) {
                            throw x0.g();
                        }
                        if (i34 == 0) {
                            t0Var.add(ByteString.EMPTY);
                        } else {
                            t0Var.add(ByteString.copyFrom(bArr, iK18, i34));
                            iK18 += i34;
                        }
                    }
                    return iK18;
                }
                break;
            case 30:
            case Token.NAME /* 44 */:
                i7 = i;
                if (i4 == 2) {
                    m0 m0Var4 = (m0) t0Var;
                    iL = kotlin.collections.a0.k(bArr, i7, p0Var);
                    int i35 = p0Var.a + iL;
                    while (iL < i35) {
                        iL = kotlin.collections.a0.k(bArr, iL, p0Var);
                        m0Var4.c(p0Var.a);
                    }
                    if (iL != i35) {
                        throw x0.g();
                    }
                } else if (i4 == 0) {
                    iL = kotlin.collections.a0.l(i3, bArr, i7, i2, t0Var, p0Var);
                }
                o(i5);
                Class cls = b2.a;
                return iL;
            case Token.GETPROP /* 33 */:
            case Token.NULL /* 47 */:
                i7 = i;
                if (i4 == 2) {
                    m0 m0Var5 = (m0) t0Var;
                    int iK20 = kotlin.collections.a0.k(bArr, i7, p0Var);
                    int i36 = p0Var.a + iK20;
                    while (iK20 < i36) {
                        iK20 = kotlin.collections.a0.k(bArr, iK20, p0Var);
                        m0Var5.c(t.b(p0Var.a));
                    }
                    if (iK20 == i36) {
                        return iK20;
                    }
                    throw x0.g();
                }
                if (i4 == 0) {
                    m0 m0Var6 = (m0) t0Var;
                    int iK21 = kotlin.collections.a0.k(bArr, i7, p0Var);
                    m0Var6.c(t.b(p0Var.a));
                    while (iK21 < i2) {
                        int iK22 = kotlin.collections.a0.k(bArr, iK21, p0Var);
                        if (i3 != p0Var.a) {
                            return iK21;
                        }
                        iK21 = kotlin.collections.a0.k(bArr, iK22, p0Var);
                        m0Var6.c(t.b(p0Var.a));
                    }
                    return iK21;
                }
                break;
            case Token.GETPROPNOWARN /* 34 */:
            case Token.THIS /* 48 */:
                i7 = i;
                if (i4 == 2) {
                    d1 d1Var5 = (d1) t0Var;
                    int iK23 = kotlin.collections.a0.k(bArr, i7, p0Var);
                    int i37 = p0Var.a + iK23;
                    while (iK23 < i37) {
                        iK23 = kotlin.collections.a0.m(bArr, iK23, p0Var);
                        d1Var5.c(t.c(p0Var.b));
                    }
                    if (iK23 == i37) {
                        return iK23;
                    }
                    throw x0.g();
                }
                if (i4 == 0) {
                    d1 d1Var6 = (d1) t0Var;
                    int iM3 = kotlin.collections.a0.m(bArr, i7, p0Var);
                    d1Var6.c(t.c(p0Var.b));
                    while (iM3 < i2) {
                        int iK24 = kotlin.collections.a0.k(bArr, iM3, p0Var);
                        if (i3 != p0Var.a) {
                            return iM3;
                        }
                        iM3 = kotlin.collections.a0.m(bArr, iK24, p0Var);
                        d1Var6.c(t.c(p0Var.b));
                    }
                    return iM3;
                }
                break;
            case Token.FALSE /* 49 */:
                if (i4 == 3) {
                    a2 a2VarQ = q(i5);
                    int i38 = (i3 & (-8)) | 4;
                    int iG = kotlin.collections.a0.g(a2VarQ, bArr, i, i2, i38, p0Var);
                    byte[] bArr2 = bArr;
                    int i39 = i2;
                    int i40 = i38;
                    com.google.android.gms.internal.measurement.p0 p0Var2 = p0Var;
                    t0Var.add(p0Var2.c);
                    while (iG < i39) {
                        int iK25 = kotlin.collections.a0.k(bArr2, iG, p0Var2);
                        if (i3 != p0Var2.a) {
                            return iG;
                        }
                        byte[] bArr3 = bArr2;
                        int i41 = i39;
                        com.google.android.gms.internal.measurement.p0 p0Var3 = p0Var2;
                        int i42 = i40;
                        iG = kotlin.collections.a0.g(a2VarQ, bArr3, iK25, i41, i42, p0Var3);
                        t0Var.add(p0Var3.c);
                        i40 = i42;
                        bArr2 = bArr3;
                        i39 = i41;
                        p0Var2 = p0Var3;
                    }
                    return iG;
                }
            default:
                return i;
        }
        return i7;
    }

    public final void I(Object obj, long j, androidx.compose.foundation.text.selection.w wVar, a2 a2Var, a0 a0Var) throws w0 {
        int iZ;
        this.k.getClass();
        t0 t0VarA = b1.a(j, obj);
        t tVar = (t) wVar.e;
        int i = wVar.b;
        if ((i & 7) != 3) {
            throw x0.c();
        }
        do {
            GeneratedMessageLite generatedMessageLiteD = a2Var.d();
            wVar.g(generatedMessageLiteD, a2Var, a0Var);
            a2Var.b(generatedMessageLiteD);
            t0VarA.add(generatedMessageLiteD);
            if (tVar.e() || wVar.d != 0) {
                return;
            } else {
                iZ = tVar.z();
            }
        } while (iZ == i);
        wVar.d = iZ;
    }

    public final void J(Object obj, int i, androidx.compose.foundation.text.selection.w wVar, a2 a2Var, a0 a0Var) throws x0 {
        int iZ;
        this.k.getClass();
        t0 t0VarA = b1.a(i & 1048575, obj);
        t tVar = (t) wVar.e;
        int i2 = wVar.b;
        if ((i2 & 7) != 2) {
            throw x0.c();
        }
        do {
            GeneratedMessageLite generatedMessageLiteD = a2Var.d();
            wVar.i(generatedMessageLiteD, a2Var, a0Var);
            a2Var.b(generatedMessageLiteD);
            t0VarA.add(generatedMessageLiteD);
            if (tVar.e() || wVar.d != 0) {
                return;
            } else {
                iZ = tVar.z();
            }
        } while (iZ == i2);
        wVar.d = iZ;
    }

    public final void K(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws w0, androidx.datastore.preferences.protobuf.w {
        t tVar = (t) wVar.e;
        if ((536870912 & i) != 0) {
            wVar.U(2);
            l2.p(i & 1048575, obj, tVar.y());
        } else if (!this.f) {
            l2.p(i & 1048575, obj, wVar.m());
        } else {
            wVar.U(2);
            l2.p(i & 1048575, obj, tVar.x());
        }
    }

    public final void L(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws w0, androidx.datastore.preferences.protobuf.w {
        boolean z = (536870912 & i) != 0;
        b1 b1Var = this.k;
        if (z) {
            b1Var.getClass();
            wVar.O(b1.a(i & 1048575, obj), true);
        } else {
            b1Var.getClass();
            wVar.O(b1.a(i & 1048575, obj), false);
        }
    }

    public final void N(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        l2.n(j, obj, (1 << (i2 >>> 20)) | l2.c.h(j, obj));
    }

    public final void O(int i, int i2, Object obj) {
        l2.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int P(int i, int i2) {
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

    public final void Q(int i, Object obj, Object obj2) {
        o.putObject(obj, T(i) & 1048575, obj2);
        N(i, obj);
    }

    public final void R(int i, Object obj, Object obj2, int i2) {
        o.putObject(obj, T(i2) & 1048575, obj2);
        O(i, i2, obj);
    }

    public final int T(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final void U(Object obj, f1 f1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        n1 n1Var = this;
        w wVar = (w) f1Var.a;
        int[] iArr = n1Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iT = n1Var.T(i7);
            int i9 = iArr[i7];
            int iS = S(iT);
            if (iS <= 17) {
                int i10 = iArr[i7 + 2];
                i = 1;
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iT & i5;
            switch (iS) {
                case 0:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        double dF = l2.c.f(j, obj);
                        wVar.getClass();
                        wVar.o(i9, Double.doubleToRawLongBits(dF));
                    }
                    break;
                case 1:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        float fG = l2.c.g(j, obj);
                        wVar.getClass();
                        wVar.m(i9, Float.floatToRawIntBits(fG));
                    }
                    n1Var = this;
                    break;
                case 2:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.y(i9, unsafe.getLong(obj, j));
                    }
                    n1Var = this;
                    break;
                case 3:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.y(i9, unsafe.getLong(obj, j));
                    }
                    n1Var = this;
                    break;
                case 4:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.q(i9, unsafe.getInt(obj, j));
                    }
                    n1Var = this;
                    break;
                case 5:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.o(i9, unsafe.getLong(obj, j));
                    }
                    n1Var = this;
                    break;
                case 6:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.m(i9, unsafe.getInt(obj, j));
                    }
                    n1Var = this;
                    break;
                case 7:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.i(i9, l2.c.c(j, obj));
                    }
                    n1Var = this;
                    break;
                case 8:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            wVar.t(i9, (String) object);
                        } else {
                            wVar.k(i9, (ByteString) object);
                        }
                    }
                    n1Var = this;
                    break;
                case 9:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        f1Var.c(i9, unsafe.getObject(obj, j), n1Var.q(i7));
                    }
                    break;
                case 10:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.k(i9, (ByteString) unsafe.getObject(obj, j));
                    }
                    n1Var = this;
                    break;
                case 11:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.w(i9, unsafe.getInt(obj, j));
                    }
                    n1Var = this;
                    break;
                case 12:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.q(i9, unsafe.getInt(obj, j));
                    }
                    n1Var = this;
                    break;
                case 13:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.m(i9, unsafe.getInt(obj, j));
                    }
                    n1Var = this;
                    break;
                case 14:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        wVar.o(i9, unsafe.getLong(obj, j));
                    }
                    n1Var = this;
                    break;
                case 15:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        wVar.w(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    n1Var = this;
                    break;
                case 16:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        wVar.y(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    n1Var = this;
                    break;
                case 17:
                    if (n1Var.s(obj, i7, i6, i8, i2)) {
                        f1Var.b(i9, unsafe.getObject(obj, j), n1Var.q(i7));
                    }
                    break;
                case 18:
                    i6 = i6;
                    i8 = i8;
                    b2.n(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 19:
                    i6 = i6;
                    i8 = i8;
                    b2.r(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 20:
                    i6 = i6;
                    i8 = i8;
                    b2.t(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 21:
                    i6 = i6;
                    i8 = i8;
                    b2.z(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 22:
                    i6 = i6;
                    i8 = i8;
                    b2.s(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 23:
                    i6 = i6;
                    i8 = i8;
                    b2.q(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 24:
                    i6 = i6;
                    i8 = i8;
                    b2.p(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 25:
                    i6 = i6;
                    i8 = i8;
                    b2.m(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 26:
                    i3 = i6;
                    i4 = i8;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = b2.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            wVar.t(i13, (String) list.get(i14));
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 27:
                    i3 = i6;
                    i4 = i8;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    a2 a2VarQ = n1Var.q(i7);
                    Class cls2 = b2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            f1Var.c(i15, list2.get(i16), a2VarQ);
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 28:
                    i3 = i6;
                    i4 = i8;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = b2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            wVar.k(i17, (ByteString) list3.get(i18));
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case 29:
                    z = false;
                    b2.y(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 30:
                    z = false;
                    b2.o(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 31:
                    z = false;
                    b2.u(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 32:
                    z = false;
                    b2.v(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case Token.GETPROP /* 33 */:
                    z = false;
                    b2.w(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    z = false;
                    b2.x(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, false);
                    i6 = i6;
                    i8 = i8;
                    break;
                case 35:
                    i3 = i6;
                    i4 = i8;
                    b2.n(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i3 = i6;
                    i4 = i8;
                    b2.r(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.SETPROP /* 37 */:
                    i3 = i6;
                    i4 = i8;
                    b2.t(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    i3 = i6;
                    i4 = i8;
                    b2.z(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.GETELEM /* 39 */:
                    i3 = i6;
                    i4 = i8;
                    b2.s(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    i3 = i6;
                    i4 = i8;
                    b2.q(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.SETELEM /* 41 */:
                    i3 = i6;
                    i4 = i8;
                    b2.p(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    i3 = i6;
                    i4 = i8;
                    b2.m(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.CALL /* 43 */:
                    i3 = i6;
                    i4 = i8;
                    b2.y(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.NAME /* 44 */:
                    i3 = i6;
                    i4 = i8;
                    b2.o(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.NUMBER /* 45 */:
                    i3 = i6;
                    i4 = i8;
                    b2.u(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.STRING /* 46 */:
                    i3 = i6;
                    i4 = i8;
                    b2.v(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.NULL /* 47 */:
                    i3 = i6;
                    i4 = i8;
                    b2.w(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, i);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.THIS /* 48 */:
                    i3 = i6;
                    i4 = i8;
                    b2.x(iArr[i7], (List) unsafe.getObject(obj, j), f1Var, true);
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.FALSE /* 49 */:
                    i3 = i6;
                    i4 = i8;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    a2 a2VarQ2 = n1Var.q(i7);
                    Class cls4 = b2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            f1Var.b(i19, list4.get(i20), a2VarQ2);
                        }
                    }
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.TRUE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objP = n1Var.p(i7);
                        n1Var.m.getClass();
                        com.google.common.util.concurrent.g0 g0Var = ((g1) objP).a;
                        t2 t2Var = (t2) g0Var.z;
                        t2 t2Var2 = (t2) g0Var.y;
                        wVar.getClass();
                        Iterator it = ((MapFieldLite) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            wVar.v(i9, 2);
                            int i21 = i6;
                            wVar.x(d0.a(t2Var, 2, entry.getValue()) + d0.a(t2Var2, i, entry.getKey()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            d0.e(wVar, t2Var2, 1, key);
                            d0.e(wVar, t2Var, 2, value);
                            i6 = i21;
                            i8 = i8;
                            i = 1;
                        }
                    }
                    i3 = i6;
                    i4 = i8;
                    i6 = i3;
                    i8 = i4;
                    break;
                case Token.SHEQ /* 51 */:
                    if (n1Var.u(i9, i7, obj)) {
                        double dDoubleValue = ((Double) l2.c.k(j, obj)).doubleValue();
                        wVar.getClass();
                        wVar.o(i9, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (n1Var.u(i9, i7, obj)) {
                        float fFloatValue = ((Float) l2.c.k(j, obj)).floatValue();
                        wVar.getClass();
                        wVar.m(i9, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.y(i9, D(j, obj));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.y(i9, D(j, obj));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.q(i9, C(j, obj));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.o(i9, D(j, obj));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.m(i9, C(j, obj));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.i(i9, ((Boolean) l2.c.k(j, obj)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (n1Var.u(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            wVar.t(i9, (String) object3);
                        } else {
                            wVar.k(i9, (ByteString) object3);
                        }
                    }
                    break;
                case 60:
                    if (n1Var.u(i9, i7, obj)) {
                        f1Var.c(i9, unsafe.getObject(obj, j), n1Var.q(i7));
                    }
                    break;
                case 61:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.k(i9, (ByteString) unsafe.getObject(obj, j));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.w(i9, C(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.q(i9, C(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.m(i9, C(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (n1Var.u(i9, i7, obj)) {
                        wVar.o(i9, D(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (n1Var.u(i9, i7, obj)) {
                        int iC = C(j, obj);
                        wVar.w(i9, (iC >> 31) ^ (iC << 1));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (n1Var.u(i9, i7, obj)) {
                        long jD = D(j, obj);
                        wVar.y(i9, (jD << i) ^ (jD >> 63));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (n1Var.u(i9, i7, obj)) {
                        f1Var.b(i9, unsafe.getObject(obj, j), n1Var.q(i7));
                    }
                    break;
                default:
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        n1Var.l.getClass();
        ((GeneratedMessageLite) obj).unknownFields.g(f1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // com.google.protobuf.a2
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        byte[] bArr = u0.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                b2.k(this.l, obj, obj2);
                return;
            }
            int iT = T(i);
            long j = 1048575 & iT;
            int i2 = iArr[i];
            switch (S(iT)) {
                case 0:
                    if (!r(i, obj2)) {
                        obj3 = obj;
                    } else {
                        k2 k2Var = l2.c;
                        obj3 = obj;
                        k2Var.o(obj3, j, k2Var.f(j, obj2));
                        N(i, obj3);
                    }
                    break;
                case 1:
                    if (r(i, obj2)) {
                        k2 k2Var2 = l2.c;
                        k2Var2.p(obj, j, k2Var2.g(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i, obj2)) {
                        l2.o(obj, j, l2.c.j(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i, obj2)) {
                        l2.o(obj, j, l2.c.j(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i, obj2)) {
                        l2.o(obj, j, l2.c.j(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i, obj2)) {
                        k2 k2Var3 = l2.c;
                        k2Var3.m(obj, j, k2Var3.c(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i, obj2)) {
                        l2.p(j, obj, l2.c.k(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i, obj2)) {
                        l2.p(j, obj, l2.c.k(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i, obj2)) {
                        l2.o(obj, j, l2.c.j(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i, obj2)) {
                        l2.n(j, obj, l2.c.h(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i, obj2)) {
                        l2.o(obj, j, l2.c.j(j, obj2));
                        N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i, obj, obj2);
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
                    this.k.getClass();
                    k2 k2Var4 = l2.c;
                    t0 t0VarM = (t0) k2Var4.k(j, obj);
                    t0 t0Var = (t0) k2Var4.k(j, obj2);
                    int size = t0VarM.size();
                    int size2 = t0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((c) t0VarM).e) {
                            t0VarM = t0VarM.m(size2 + size);
                        }
                        t0VarM.addAll(t0Var);
                    }
                    if (size > 0) {
                        t0Var = t0VarM;
                    }
                    l2.p(j, obj, t0Var);
                    obj3 = obj;
                    break;
                case Token.TRUE /* 50 */:
                    Class cls = b2.a;
                    k2 k2Var5 = l2.c;
                    Object objK = k2Var5.k(j, obj);
                    Object objK2 = k2Var5.k(j, obj2);
                    this.m.getClass();
                    l2.p(j, obj, h1.a(objK, objK2));
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
                    if (u(i2, i, obj2)) {
                        l2.p(j, obj, l2.c.k(j, obj2));
                        O(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    if (u(i2, i, obj2)) {
                        l2.p(j, obj, l2.c.k(j, obj2));
                        O(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case Token.ENUM_ID /* 68 */:
                    x(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[SYNTHETIC] */
    @Override // com.google.protobuf.a2
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iT = T(i);
                long j = 1048575 & iT;
                int iS = S(iT);
                if (iS != 9) {
                    if (iS != 60 && iS != 68) {
                        switch (iS) {
                            case 17:
                                if (r(i, obj)) {
                                    q(i).b(o.getObject(obj, j));
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
                                this.k.getClass();
                                c cVar = (c) ((t0) l2.c.k(j, obj));
                                if (cVar.e) {
                                    cVar.e = false;
                                }
                                break;
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((MapFieldLite) object).makeImmutable();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (u(iArr[i], i, obj)) {
                        q(i).b(o.getObject(obj, j));
                    }
                } else if (r(i, obj)) {
                    q(i).b(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            f2 f2Var = ((GeneratedMessageLite) obj).unknownFields;
            if (f2Var.e) {
                f2Var.e = false;
            }
        }
    }

    @Override // com.google.protobuf.a2
    public final boolean c(Object obj) {
        int i;
        int i2;
        n1 n1Var;
        Object obj2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int iT = T(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = o.getInt(obj, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & iT) != 0) {
                n1Var = this;
                obj2 = obj;
                if (!n1Var.s(obj2, i6, i, i2, i9)) {
                }
                return false;
            }
            n1Var = this;
            obj2 = obj;
            int iS = S(iT);
            if (iS == 9 || iS == 17) {
                if (n1Var.s(obj2, i6, i, i2, i9)) {
                    if (!q(i6).c(l2.c.k(iT & 1048575, obj2))) {
                        return false;
                    }
                } else {
                    continue;
                }
                i4++;
                obj = obj2;
                i3 = i;
                i5 = i2;
            } else {
                if (iS != 27) {
                    if (iS == 60 || iS == 68) {
                        if (u(iArr[i6], i6, obj2)) {
                            if (!q(i6).c(l2.c.k(iT & 1048575, obj2))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                        i4++;
                        obj = obj2;
                        i3 = i;
                        i5 = i2;
                    } else if (iS != 49) {
                        if (iS != 50) {
                            continue;
                        } else {
                            Object objK = l2.c.k(iT & 1048575, obj2);
                            n1Var.m.getClass();
                            MapFieldLite mapFieldLite = (MapFieldLite) objK;
                            if (!mapFieldLite.isEmpty() && ((t2) ((g1) p(i6)).a.z).e == u2.MESSAGE) {
                                a2 a2VarA = null;
                                for (Object obj3 : mapFieldLite.values()) {
                                    if (a2VarA == null) {
                                        a2VarA = t1.c.a(obj3.getClass());
                                    }
                                    if (!a2VarA.c(obj3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        i4++;
                        obj = obj2;
                        i3 = i;
                        i5 = i2;
                    }
                }
                List list = (List) l2.c.k(iT & 1048575, obj2);
                if (list.isEmpty()) {
                    continue;
                } else {
                    a2 a2VarQ = q(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!a2VarQ.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
                i4++;
                obj = obj2;
                i3 = i;
                i5 = i2;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.a2
    public final GeneratedMessageLite d() {
        this.j.getClass();
        return ((GeneratedMessageLite) this.e).newMutableInstance();
    }

    @Override // com.google.protobuf.a2
    public final void e(Object obj, f1 f1Var) {
        U(obj, f1Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.protobuf.a2
    public final void f(java.lang.Object r19, androidx.compose.foundation.text.selection.w r20, com.google.protobuf.a0 r21) {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.n1.f(java.lang.Object, androidx.compose.foundation.text.selection.w, com.google.protobuf.a0):void");
    }

    @Override // com.google.protobuf.a2
    public final void g(Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.p0 p0Var) {
        F(obj, bArr, i, i2, 0, p0Var);
    }

    @Override // com.google.protobuf.a2
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iA;
        int length = this.a.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iT = T(i2);
            int iS = S(iT);
            if (iS <= 50 || iS >= 69) {
                long j = 1048575 & iT;
                int iHashCode2 = 37;
                switch (iS) {
                    case 0:
                        i = iHashCode * 53;
                        iA = u0.a(Double.doubleToLongBits(l2.c.f(j, generatedMessageLite)));
                        iHashCode = i + iA;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iA = Float.floatToIntBits(l2.c.g(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        iA = u0.a(l2.c.j(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        iA = u0.a(l2.c.j(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        iA = u0.a(l2.c.j(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zC = l2.c.c(j, generatedMessageLite);
                        byte[] bArr = u0.a;
                        iA = zC ? 1231 : 1237;
                        iHashCode = i + iA;
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iA = ((String) l2.c.k(j, generatedMessageLite)).hashCode();
                        iHashCode = i + iA;
                        break;
                    case 9:
                        Object objK = l2.c.k(j, generatedMessageLite);
                        if (objK != null) {
                            iHashCode2 = objK.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iA = l2.c.k(j, generatedMessageLite).hashCode();
                        iHashCode = i + iA;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        iA = u0.a(l2.c.j(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iA = l2.c.h(j, generatedMessageLite);
                        iHashCode = i + iA;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        iA = u0.a(l2.c.j(j, generatedMessageLite));
                        iHashCode = i + iA;
                        break;
                    case 17:
                        Object objK2 = l2.c.k(j, generatedMessageLite);
                        if (objK2 != null) {
                            iHashCode2 = objK2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
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
                        i = iHashCode * 53;
                        iA = l2.c.k(j, generatedMessageLite).hashCode();
                        iHashCode = i + iA;
                        break;
                    case Token.TRUE /* 50 */:
                        i = iHashCode * 53;
                        iA = l2.c.k(j, generatedMessageLite).hashCode();
                        iHashCode = i + iA;
                        break;
                }
            }
        }
        int i3 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i3 >= iArr.length) {
                this.l.getClass();
                return generatedMessageLite.unknownFields.hashCode() + (iHashCode * 53);
            }
            int i4 = iArr[i3];
            if (!u(0, i4, generatedMessageLite)) {
                iHashCode = l2.c.k(T(i4) & 1048575, generatedMessageLite).hashCode() + (iHashCode * 53);
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03bc A[PHI: r17
  0x03bc: PHI (r17v19 int) = 
  (r17v2 int)
  (r17v3 int)
  (r17v4 int)
  (r17v8 int)
  (r17v10 int)
  (r17v11 int)
  (r17v12 int)
  (r17v16 int)
  (r17v20 int)
 binds: [B:204:0x0555, B:200:0x0539, B:196:0x051d, B:178:0x04a8, B:164:0x0443, B:160:0x0429, B:156:0x040f, B:149:0x03d9, B:143:0x03ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.a2
    public final int i(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iE;
        int iE2;
        int iE3;
        int iG;
        int iE4;
        int iG2;
        int iE5;
        int iE6;
        int iU;
        int iB;
        int serializedSize;
        int iC;
        int iE7;
        int size;
        int i2;
        int iE8;
        int iA;
        int iF;
        int iE9;
        int serializedSize2;
        int iU2;
        int iE10;
        int iE11;
        int iG3;
        int iE12;
        int iG4;
        int iU3;
        n1 n1Var = this;
        GeneratedMessageLite generatedMessageLite2 = generatedMessageLite;
        Unsafe unsafe = o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iU4 = 0;
        while (true) {
            int[] iArr = n1Var.a;
            if (i5 >= iArr.length) {
                n1Var.l.getClass();
                return generatedMessageLite2.unknownFields.c() + iU4;
            }
            int iT = n1Var.T(i5);
            int iS = S(iT);
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iS <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(generatedMessageLite2, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iT & i3;
            if (iS >= e0.y.e) {
                int i10 = e0.z.e;
            }
            switch (iS) {
                case 0:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE = w.e(i7);
                        serializedSize = iE + 8;
                        iU4 += serializedSize;
                    }
                    break;
                case 1:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE2 = w.e(i7);
                        iE6 = iE2 + 4;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 2:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(generatedMessageLite2, j);
                        iE3 = w.e(i7);
                        iG = w.g(j2);
                        iU4 += iG + iE3;
                    }
                    n1Var = this;
                    break;
                case 3:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(generatedMessageLite2, j);
                        iE3 = w.e(i7);
                        iG = w.g(j3);
                        iU4 += iG + iE3;
                    }
                    n1Var = this;
                    break;
                case 4:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        int i11 = unsafe.getInt(generatedMessageLite2, j);
                        iE4 = w.e(i7);
                        iG2 = w.g(i11);
                        iB = iG2 + iE4;
                        iU4 += iB;
                    }
                    n1Var = this;
                    break;
                case 5:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE5 = w.e(i7);
                        iE6 = iE5 + 8;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 6:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE2 = w.e(i7);
                        iE6 = iE2 + 4;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 7:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE6 = w.e(i7) + 1;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 8:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(generatedMessageLite2, j);
                        if (object instanceof ByteString) {
                            iU = w.b(i7, (ByteString) object) + iU4;
                        } else {
                            int iE13 = w.e(i7);
                            int iA2 = o2.a((String) object);
                            iU = com.google.android.datatransport.runtime.backends.c.u(iA2, iA2, iE13, iU4);
                        }
                        iU4 = iU;
                    }
                    n1Var = this;
                    break;
                case 9:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(generatedMessageLite2, j);
                        a2 a2VarQ = n1Var.q(i5);
                        Class cls = b2.a;
                        int iE14 = w.e(i7);
                        int serializedSize3 = ((b) object2).getSerializedSize(a2VarQ);
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(serializedSize3, serializedSize3, iE14, iU4);
                    }
                    break;
                case 10:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iB = w.b(i7, (ByteString) unsafe.getObject(generatedMessageLite2, j));
                        iU4 += iB;
                    }
                    n1Var = this;
                    break;
                case 11:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(generatedMessageLite2, j);
                        iE4 = w.e(i7);
                        iG2 = w.f(i12);
                        iB = iG2 + iE4;
                        iU4 += iB;
                    }
                    n1Var = this;
                    break;
                case 12:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(generatedMessageLite2, j);
                        iE4 = w.e(i7);
                        iG2 = w.g(i13);
                        iB = iG2 + iE4;
                        iU4 += iB;
                    }
                    n1Var = this;
                    break;
                case 13:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE2 = w.e(i7);
                        iE6 = iE2 + 4;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 14:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        iE5 = w.e(i7);
                        iE6 = iE5 + 8;
                        iU4 += iE6;
                    }
                    n1Var = this;
                    generatedMessageLite2 = generatedMessageLite;
                    break;
                case 15:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(generatedMessageLite2, j);
                        iE4 = w.e(i7);
                        iG2 = w.c(i14);
                        iB = iG2 + iE4;
                        iU4 += iB;
                    }
                    n1Var = this;
                    break;
                case 16:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(generatedMessageLite2, j);
                        iE3 = w.e(i7);
                        iG = w.d(j4);
                        iU4 += iG + iE3;
                    }
                    n1Var = this;
                    break;
                case 17:
                    if (n1Var.s(generatedMessageLite2, i5, i4, i6, i)) {
                        l1 l1Var = (l1) unsafe.getObject(generatedMessageLite2, j);
                        a2 a2VarQ2 = n1Var.q(i5);
                        Class cls2 = b2.a;
                        serializedSize = ((b) l1Var).getSerializedSize(a2VarQ2) + (w.e(i7) * 2);
                        iU4 += serializedSize;
                    }
                    break;
                case 18:
                    iC = b2.c(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case 19:
                    iC = b2.b(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    List list = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls3 = b2.a;
                    if (list.size() == 0) {
                        iE7 = 0;
                    } else {
                        iE7 = (w.e(i7) * list.size()) + b2.e(list);
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    List list2 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls4 = b2.a;
                    size = list2.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.i(list2);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    List list3 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls5 = b2.a;
                    size = list3.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.d(list3);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 23:
                    iC = b2.c(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case 24:
                    iC = b2.b(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    List list4 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls6 = b2.a;
                    int size2 = list4.size();
                    iU4 += size2 == 0 ? 0 : (w.e(i7) + 1) * size2;
                    i4 = i4;
                    break;
                case 26:
                    i4 = i4;
                    List list5 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls7 = b2.a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iE7 = 0;
                    } else {
                        iE7 = w.e(i7) * size3;
                        for (int i15 = 0; i15 < size3; i15++) {
                            Object obj = list5.get(i15);
                            if (obj instanceof ByteString) {
                                iA = ((ByteString) obj).size();
                                iF = w.f(iA);
                            } else {
                                iA = o2.a((String) obj);
                                iF = w.f(iA);
                            }
                            iE7 = iF + iA + iE7;
                        }
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 27:
                    i4 = i4;
                    List list6 = (List) unsafe.getObject(generatedMessageLite2, j);
                    a2 a2VarQ3 = n1Var.q(i5);
                    Class cls8 = b2.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iE9 = 0;
                    } else {
                        iE9 = w.e(i7) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            int serializedSize4 = ((b) list6.get(i16)).getSerializedSize(a2VarQ3);
                            iE9 += w.f(serializedSize4) + serializedSize4;
                        }
                    }
                    iU4 += iE9;
                    i4 = i4;
                    break;
                case 28:
                    i4 = i4;
                    List list7 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls9 = b2.a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iE7 = 0;
                    } else {
                        iE7 = w.e(i7) * size5;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int size6 = ((ByteString) list7.get(i17)).size();
                            iE7 += w.f(size6) + size6;
                        }
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 29:
                    i4 = i4;
                    List list8 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls10 = b2.a;
                    size = list8.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.h(list8);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 30:
                    i4 = i4;
                    List list9 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls11 = b2.a;
                    size = list9.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.a(list9);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 31:
                    iC = b2.b(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case 32:
                    iC = b2.c(i7, (List) unsafe.getObject(generatedMessageLite2, j));
                    iU4 += iC;
                    i4 = i4;
                    break;
                case Token.GETPROP /* 33 */:
                    i4 = i4;
                    List list10 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls12 = b2.a;
                    size = list10.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.f(list10);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    i4 = i4;
                    List list11 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls13 = b2.a;
                    size = list11.size();
                    if (size == 0) {
                        iE7 = 0;
                    } else {
                        i2 = b2.g(list11);
                        iE8 = w.e(i7);
                        iE7 = (iE8 * size) + i2;
                    }
                    iU4 += iE7;
                    i4 = i4;
                    break;
                case 35:
                    i4 = i4;
                    List list12 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls14 = b2.a;
                    int size7 = list12.size() * 8;
                    if (size7 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size7, w.e(i7), size7, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i4 = i4;
                    List list13 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls15 = b2.a;
                    int size8 = list13.size() * 4;
                    if (size8 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size8, w.e(i7), size8, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.SETPROP /* 37 */:
                    i4 = i4;
                    int iE15 = b2.e((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iE15 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iE15, w.e(i7), iE15, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    i4 = i4;
                    int i18 = b2.i((List) unsafe.getObject(generatedMessageLite2, j));
                    if (i18 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(i18, w.e(i7), i18, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.GETELEM /* 39 */:
                    i4 = i4;
                    int iD = b2.d((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iD > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iD, w.e(i7), iD, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    i4 = i4;
                    List list14 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls16 = b2.a;
                    int size9 = list14.size() * 8;
                    if (size9 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size9, w.e(i7), size9, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.SETELEM /* 41 */:
                    i4 = i4;
                    List list15 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls17 = b2.a;
                    int size10 = list15.size() * 4;
                    if (size10 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size10, w.e(i7), size10, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    i4 = i4;
                    List list16 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls18 = b2.a;
                    int size11 = list16.size();
                    if (size11 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size11, w.e(i7), size11, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.CALL /* 43 */:
                    i4 = i4;
                    int iH = b2.h((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iH > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iH, w.e(i7), iH, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.NAME /* 44 */:
                    i4 = i4;
                    int iA3 = b2.a((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iA3 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iA3, w.e(i7), iA3, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.NUMBER /* 45 */:
                    i4 = i4;
                    List list17 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls19 = b2.a;
                    int size12 = list17.size() * 4;
                    if (size12 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size12, w.e(i7), size12, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.STRING /* 46 */:
                    i4 = i4;
                    List list18 = (List) unsafe.getObject(generatedMessageLite2, j);
                    Class cls20 = b2.a;
                    int size13 = list18.size() * 8;
                    if (size13 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(size13, w.e(i7), size13, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.NULL /* 47 */:
                    i4 = i4;
                    int iF2 = b2.f((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iF2 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iF2, w.e(i7), iF2, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.THIS /* 48 */:
                    i4 = i4;
                    int iG5 = b2.g((List) unsafe.getObject(generatedMessageLite2, j));
                    if (iG5 > 0) {
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(iG5, w.e(i7), iG5, iU4);
                    }
                    i4 = i4;
                    break;
                case Token.FALSE /* 49 */:
                    i4 = i4;
                    List list19 = (List) unsafe.getObject(generatedMessageLite2, j);
                    a2 a2VarQ4 = n1Var.q(i5);
                    Class cls21 = b2.a;
                    int size14 = list19.size();
                    if (size14 == 0) {
                        serializedSize2 = 0;
                    } else {
                        serializedSize2 = 0;
                        for (int i19 = 0; i19 < size14; i19++) {
                            serializedSize2 += ((b) ((l1) list19.get(i19))).getSerializedSize(a2VarQ4) + (w.e(i7) * 2);
                        }
                    }
                    iU4 += serializedSize2;
                    i4 = i4;
                    break;
                case Token.TRUE /* 50 */:
                    Object object3 = unsafe.getObject(generatedMessageLite2, j);
                    Object objP = n1Var.p(i5);
                    n1Var.m.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    g1 g1Var = (g1) objP;
                    if (mapFieldLite.isEmpty()) {
                        iU2 = 0;
                    } else {
                        iU2 = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g1Var.getClass();
                            int iE16 = w.e(i7);
                            com.google.common.util.concurrent.g0 g0Var = g1Var.a;
                            int iA4 = d0.a((t2) g0Var.z, 2, value) + d0.a((t2) g0Var.y, 1, key);
                            iU2 = com.google.android.datatransport.runtime.backends.c.u(iA4, iA4, iE16, iU2);
                            i4 = i4;
                        }
                    }
                    i4 = i4;
                    iU4 += iU2;
                    i4 = i4;
                    break;
                case Token.SHEQ /* 51 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE = w.e(i7);
                        serializedSize = iE + 8;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE10 = w.e(i7);
                        serializedSize = iE10 + 4;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        long jD = D(j, generatedMessageLite2);
                        iE11 = w.e(i7);
                        iG3 = w.g(jD);
                        iU4 += iG3 + iE11;
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        long jD2 = D(j, generatedMessageLite2);
                        iE11 = w.e(i7);
                        iG3 = w.g(jD2);
                        iU4 += iG3 + iE11;
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        int iC2 = C(j, generatedMessageLite2);
                        iE12 = w.e(i7);
                        iG4 = w.g(iC2);
                        serializedSize = iG4 + iE12;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE = w.e(i7);
                        serializedSize = iE + 8;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.IN /* 57 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE10 = w.e(i7);
                        serializedSize = iE10 + 4;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        serializedSize = w.e(i7) + 1;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        Object object4 = unsafe.getObject(generatedMessageLite2, j);
                        if (object4 instanceof ByteString) {
                            iU3 = w.b(i7, (ByteString) object4) + iU4;
                        } else {
                            int iE17 = w.e(i7);
                            int iA5 = o2.a((String) object4);
                            iU3 = com.google.android.datatransport.runtime.backends.c.u(iA5, iA5, iE17, iU4);
                        }
                        iU4 = iU3;
                    }
                    break;
                case 60:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        Object object5 = unsafe.getObject(generatedMessageLite2, j);
                        a2 a2VarQ5 = n1Var.q(i5);
                        Class cls22 = b2.a;
                        int iE18 = w.e(i7);
                        int serializedSize5 = ((b) object5).getSerializedSize(a2VarQ5);
                        iU4 = com.google.android.datatransport.runtime.backends.c.u(serializedSize5, serializedSize5, iE18, iU4);
                    }
                    break;
                case 61:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        serializedSize = w.b(i7, (ByteString) unsafe.getObject(generatedMessageLite2, j));
                        iU4 += serializedSize;
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        int iC3 = C(j, generatedMessageLite2);
                        iE12 = w.e(i7);
                        iG4 = w.f(iC3);
                        serializedSize = iG4 + iE12;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        int iC4 = C(j, generatedMessageLite2);
                        iE12 = w.e(i7);
                        iG4 = w.g(iC4);
                        serializedSize = iG4 + iE12;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE10 = w.e(i7);
                        serializedSize = iE10 + 4;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        iE = w.e(i7);
                        serializedSize = iE + 8;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        int iC5 = C(j, generatedMessageLite2);
                        iE12 = w.e(i7);
                        iG4 = w.c(iC5);
                        serializedSize = iG4 + iE12;
                        iU4 += serializedSize;
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        long jD3 = D(j, generatedMessageLite2);
                        iE11 = w.e(i7);
                        iG3 = w.d(jD3);
                        iU4 += iG3 + iE11;
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (n1Var.u(i7, i5, generatedMessageLite2)) {
                        l1 l1Var2 = (l1) unsafe.getObject(generatedMessageLite2, j);
                        a2 a2VarQ6 = n1Var.q(i5);
                        Class cls23 = b2.a;
                        serializedSize = ((b) l1Var2).getSerializedSize(a2VarQ6) + (w.e(i7) * 2);
                        iU4 += serializedSize;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    @Override // com.google.protobuf.a2
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iT = T(i);
                int iS = S(iT);
                if (iS <= 50 || iS >= 69) {
                    long j = iT & 1048575;
                    switch (iS) {
                        case 0:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var = l2.c;
                                if (Double.doubleToLongBits(k2Var.f(j, generatedMessageLite)) != Double.doubleToLongBits(k2Var.f(j, generatedMessageLite2))) {
                                    zL = false;
                                }
                            }
                            break;
                        case 1:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var2 = l2.c;
                                if (Float.floatToIntBits(k2Var2.g(j, generatedMessageLite)) != Float.floatToIntBits(k2Var2.g(j, generatedMessageLite2))) {
                                    zL = false;
                                }
                            }
                            break;
                        case 2:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var3 = l2.c;
                                if (k2Var3.j(j, generatedMessageLite) != k2Var3.j(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 3:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var4 = l2.c;
                                if (k2Var4.j(j, generatedMessageLite) != k2Var4.j(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 4:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var5 = l2.c;
                                if (k2Var5.h(j, generatedMessageLite) != k2Var5.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 5:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var6 = l2.c;
                                if (k2Var6.j(j, generatedMessageLite) != k2Var6.j(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 6:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var7 = l2.c;
                                if (k2Var7.h(j, generatedMessageLite) != k2Var7.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 7:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var8 = l2.c;
                                if (k2Var8.c(j, generatedMessageLite) != k2Var8.c(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 8:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var9 = l2.c;
                                if (!b2.l(k2Var9.k(j, generatedMessageLite), k2Var9.k(j, generatedMessageLite2))) {
                                    zL = false;
                                }
                            }
                            break;
                        case 9:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var10 = l2.c;
                                if (!b2.l(k2Var10.k(j, generatedMessageLite), k2Var10.k(j, generatedMessageLite2))) {
                                    zL = false;
                                }
                            }
                            break;
                        case 10:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var11 = l2.c;
                                if (!b2.l(k2Var11.k(j, generatedMessageLite), k2Var11.k(j, generatedMessageLite2))) {
                                    zL = false;
                                }
                            }
                            break;
                        case 11:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var12 = l2.c;
                                if (k2Var12.h(j, generatedMessageLite) != k2Var12.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 12:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var13 = l2.c;
                                if (k2Var13.h(j, generatedMessageLite) != k2Var13.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 13:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var14 = l2.c;
                                if (k2Var14.h(j, generatedMessageLite) != k2Var14.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 14:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var15 = l2.c;
                                if (k2Var15.j(j, generatedMessageLite) != k2Var15.j(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 15:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var16 = l2.c;
                                if (k2Var16.h(j, generatedMessageLite) != k2Var16.h(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 16:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var17 = l2.c;
                                if (k2Var17.j(j, generatedMessageLite) != k2Var17.j(j, generatedMessageLite2)) {
                                    zL = false;
                                }
                            }
                            break;
                        case 17:
                            if (!k(generatedMessageLite, generatedMessageLite2, i)) {
                                zL = false;
                            } else {
                                k2 k2Var18 = l2.c;
                                if (!b2.l(k2Var18.k(j, generatedMessageLite), k2Var18.k(j, generatedMessageLite2))) {
                                    zL = false;
                                }
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
                            k2 k2Var19 = l2.c;
                            zL = b2.l(k2Var19.k(j, generatedMessageLite), k2Var19.k(j, generatedMessageLite2));
                            break;
                        case Token.TRUE /* 50 */:
                            k2 k2Var20 = l2.c;
                            zL = b2.l(k2Var20.k(j, generatedMessageLite), k2Var20.k(j, generatedMessageLite2));
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
                            long j2 = 1048575 & iArr[i + 2];
                            k2 k2Var21 = l2.c;
                            if (k2Var21.h(j2, generatedMessageLite) != k2Var21.h(j2, generatedMessageLite2) || !b2.l(k2Var21.k(j, generatedMessageLite), k2Var21.k(j, generatedMessageLite2))) {
                                zL = false;
                            }
                            break;
                    }
                    if (!zL) {
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
                        k2 k2Var22 = l2.c;
                        if (k2Var22.h(j3, generatedMessageLite) == k2Var22.h(j3, generatedMessageLite2)) {
                            if (!u(0, i3, generatedMessageLite)) {
                                long jT = T(i3) & 1048575;
                                if (!b2.l(k2Var22.k(jT, generatedMessageLite), k2Var22.k(jT, generatedMessageLite2))) {
                                }
                            }
                            i2++;
                        }
                    } else {
                        this.l.getClass();
                        if (generatedMessageLite.unknownFields.equals(generatedMessageLite2.unknownFields)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return r(i, generatedMessageLite) == r(i, generatedMessageLite2);
    }

    public final void n(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (l2.c.k(T(i) & 1048575, obj) == null) {
            return;
        }
        o(i);
    }

    public final void o(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        androidx.transition.k.i();
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final a2 q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        a2 a2Var = (a2) objArr[i2];
        if (a2Var != null) {
            return a2Var;
        }
        a2 a2VarA = t1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a2VarA;
        return a2VarA;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iT = T(i);
            long j2 = iT & 1048575;
            switch (S(iT)) {
                case 0:
                    if (Double.doubleToRawLongBits(l2.c.f(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(l2.c.g(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (l2.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (l2.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (l2.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return l2.c.c(j2, obj);
                case 8:
                    Object objK = l2.c.k(j2, obj);
                    if (objK instanceof String) {
                        return !((String) objK).isEmpty();
                    }
                    if (objK instanceof ByteString) {
                        return !ByteString.EMPTY.equals(objK);
                    }
                    net.luminis.tls.engine.impl.c.a();
                    return false;
                case 9:
                    if (l2.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(l2.c.k(j2, obj));
                case 11:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (l2.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (l2.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (l2.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (l2.c.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    net.luminis.tls.engine.impl.c.a();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & l2.c.h(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return r(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean u(int i, int i2, Object obj) {
        return l2.c.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(Object obj, int i, Object obj2, a0 a0Var, androidx.compose.foundation.text.selection.w wVar) throws w0, androidx.datastore.preferences.protobuf.w {
        long jT = T(i) & 1048575;
        Object objK = l2.c.k(jT, obj);
        h1 h1Var = this.m;
        if (objK == null) {
            h1Var.getClass();
            objK = MapFieldLite.emptyMapField().mutableCopy();
            l2.p(jT, obj, objK);
        } else {
            h1Var.getClass();
            if (!((MapFieldLite) objK).isMutable()) {
                MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
                h1.a(mapFieldLiteMutableCopy, objK);
                l2.p(jT, obj, mapFieldLiteMutableCopy);
                objK = mapFieldLiteMutableCopy;
            }
        }
        h1Var.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) objK;
        com.google.common.util.concurrent.g0 g0Var = ((g1) obj2).a;
        wVar.U(2);
        t tVar = (t) wVar.e;
        int i2 = tVar.i(tVar.A());
        Object objU = "";
        Object objU2 = objU;
        while (true) {
            try {
                int iC = wVar.c();
                if (iC == Integer.MAX_VALUE || tVar.e()) {
                    break;
                }
                if (iC == 1) {
                    objU = wVar.u((t2) g0Var.y, null, null);
                } else if (iC != 2) {
                    try {
                        if (!wVar.V()) {
                            throw new x0("Unable to parse map entry.");
                        }
                    } catch (w0 e) {
                        if (!wVar.V()) {
                            throw new x0("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objU2 = wVar.u((t2) g0Var.z, "".getClass(), a0Var);
                }
            } catch (Throwable th) {
                tVar.h(i2);
                throw th;
            }
        }
        mapFieldLite.put(objU, objU2);
        tVar.h(i2);
    }

    public final void w(int i, Object obj, Object obj2) {
        if (r(i, obj2)) {
            long jT = T(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                com.google.gson.b.c(this.a[i], obj2);
                return;
            }
            a2 a2VarQ = q(i);
            if (!r(i, obj)) {
                if (t(object)) {
                    GeneratedMessageLite generatedMessageLiteD = a2VarQ.d();
                    a2VarQ.a(generatedMessageLiteD, object);
                    unsafe.putObject(obj, jT, generatedMessageLiteD);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                N(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jT);
            if (!t(object2)) {
                GeneratedMessageLite generatedMessageLiteD2 = a2VarQ.d();
                a2VarQ.a(generatedMessageLiteD2, object2);
                unsafe.putObject(obj, jT, generatedMessageLiteD2);
                object2 = generatedMessageLiteD2;
            }
            a2VarQ.a(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            long jT = T(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                com.google.gson.b.c(iArr[i], obj2);
                return;
            }
            a2 a2VarQ = q(i);
            if (!u(i2, i, obj)) {
                if (t(object)) {
                    GeneratedMessageLite generatedMessageLiteD = a2VarQ.d();
                    a2VarQ.a(generatedMessageLiteD, object);
                    unsafe.putObject(obj, jT, generatedMessageLiteD);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                O(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jT);
            if (!t(object2)) {
                GeneratedMessageLite generatedMessageLiteD2 = a2VarQ.d();
                a2VarQ.a(generatedMessageLiteD2, object2);
                unsafe.putObject(obj, jT, generatedMessageLiteD2);
                object2 = generatedMessageLiteD2;
            }
            a2VarQ.a(object2, object);
        }
    }

    public final Object y(int i, Object obj) {
        a2 a2VarQ = q(i);
        long jT = T(i) & 1048575;
        if (!r(i, obj)) {
            return a2VarQ.d();
        }
        Object object = o.getObject(obj, jT);
        if (t(object)) {
            return object;
        }
        GeneratedMessageLite generatedMessageLiteD = a2VarQ.d();
        if (object != null) {
            a2VarQ.a(generatedMessageLiteD, object);
        }
        return generatedMessageLiteD;
    }

    public final Object z(int i, int i2, Object obj) {
        a2 a2VarQ = q(i2);
        if (!u(i, i2, obj)) {
            return a2VarQ.d();
        }
        Object object = o.getObject(obj, T(i2) & 1048575);
        if (t(object)) {
            return object;
        }
        GeneratedMessageLite generatedMessageLiteD = a2VarQ.d();
        if (object != null) {
            a2VarQ.a(generatedMessageLiteD, object);
        }
        return generatedMessageLiteD;
    }
}
