package androidx.datastore.preferences.protobuf;

import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements u0 {
    public static final int[] n = new int[0];
    public static final Unsafe o = g1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final n0 j;
    public final a0 k;
    public final b1 l;
    public final h0 m;

    public l0(int[] iArr, Object[] objArr, int i, int i2, a aVar, int[] iArr2, int i3, int i4, n0 n0Var, a0 a0Var, b1 b1Var, m mVar, h0 h0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof t;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = n0Var;
        this.k = a0Var;
        this.l = b1Var;
        this.e = aVar;
        this.m = h0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbX.toString());
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t) {
            return ((t) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    public static l0 w(t0 t0Var, n0 n0Var, a0 a0Var, b1 b1Var, m mVar, h0 h0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldF;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldF2;
        int i27;
        Object obj2;
        Field fieldF3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = t0Var.b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i31;
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
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i61;
            i7 = iCharAt9;
        }
        Unsafe unsafe = o;
        Object[] objArr = t0Var.c;
        Class<?> cls = t0Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= i32) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i16;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i30;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i72 = i29;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int iCharAt12 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i25 = i6 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i80 == 12 && (androidx.constraintlayout.core.g.b(t0Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr3[i26] = fieldF2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr3[i27] = fieldF3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                    int i82 = i4;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i23 = iObjectFieldOffset3;
                    i18 = i82;
                    i22 = i6;
                    i20 = i81;
                    i21 = 0;
                    cls = cls;
                }
                i6 = i25;
                i26 = iCharAt12 * 2;
                obj = objArr3[i26];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr3[i26] = fieldF2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldF2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr3[i27] = fieldF3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldF3);
                int i83 = i4;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i23 = iObjectFieldOffset5;
                i18 = i83;
                i22 = i6;
                i20 = i81;
                i21 = 0;
                cls = cls;
            } else {
                int i84 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (t0Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            int i85 = i72 + 1;
                            int iCharAt13 = str.charAt(i72);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i20 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr3[i88] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i21 = iCharAt13 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            iArr[i64] = iObjectFieldOffset;
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i67;
                            int i90 = (i67 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr2[i90] = objArr3[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                                i18 = i4;
                                i65 = i89;
                            } else {
                                i19 = i91;
                                i65 = i89;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        }
                        if (i75 >= 18) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        }
                    }
                    i19 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                } else {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
            }
            int i92 = i67 + 1;
            iArr4[i67] = i76;
            int i93 = i67 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & LibretroCore.SCREEN_WIDTH) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
            i67 += 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i34 = i20;
            i32 = 55296;
            i6 = i22;
            iArr3 = iArr4;
        }
        return new l0(iArr3, objArr2, i2, i5, t0Var.a, iArr, i7, i63, n0Var, a0Var, b1Var, mVar, h0Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) g1.c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) g1.c.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, androidx.compose.foundation.text.selection.w wVar, u0 u0Var, l lVar) throws w {
        int I;
        this.k.getClass();
        u uVarA = a0.a(j, obj);
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) wVar.e;
        int i = wVar.b;
        if ((i & 7) != 3) {
            throw x.b();
        }
        do {
            t tVarD = u0Var.d();
            wVar.f(tVarD, u0Var, lVar);
            u0Var.b(tVarD);
            ((s0) uVarA).add(tVarD);
            if (w0Var.l() || wVar.d != 0) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == i);
        wVar.d = I;
    }

    public final void C(Object obj, int i, androidx.compose.foundation.text.selection.w wVar, u0 u0Var, l lVar) throws x {
        int I;
        this.k.getClass();
        u uVarA = a0.a(i & 1048575, obj);
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) wVar.e;
        int i2 = wVar.b;
        if ((i2 & 7) != 2) {
            throw x.b();
        }
        do {
            t tVarD = u0Var.d();
            wVar.h(tVarD, u0Var, lVar);
            u0Var.b(tVarD);
            ((s0) uVarA).add(tVarD);
            if (w0Var.l() || wVar.d != 0) {
                return;
            } else {
                I = w0Var.I();
            }
        } while (I == i2);
        wVar.d = I;
    }

    public final void D(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws com.google.protobuf.w0, w {
        if ((536870912 & i) != 0) {
            wVar.U(2);
            g1.o(i & 1048575, obj, ((androidx.core.view.w0) wVar.e).H());
        } else if (!this.f) {
            g1.o(i & 1048575, obj, wVar.l());
        } else {
            wVar.U(2);
            g1.o(i & 1048575, obj, ((androidx.core.view.w0) wVar.e).G());
        }
    }

    public final void E(int i, androidx.compose.foundation.text.selection.w wVar, Object obj) throws com.google.protobuf.w0, w {
        boolean z = (536870912 & i) != 0;
        a0 a0Var = this.k;
        if (z) {
            a0Var.getClass();
            wVar.N(a0.a(i & 1048575, obj), true);
        } else {
            a0Var.getClass();
            wVar.N(a0.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        g1.m(j, obj, (1 << (i2 >>> 20)) | g1.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        g1.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void I(Object obj, int i, a aVar) {
        o.putObject(obj, L(i) & 1048575, aVar);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, a aVar) {
        o.putObject(obj, L(i2) & 1048575, aVar);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, d0 d0Var) throws IOException {
        int i;
        int i2;
        boolean z;
        l0 l0Var = this;
        int[] iArr = l0Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iL = l0Var.L(i5);
            int i7 = iArr[i5];
            int iK = K(iL);
            if (iK <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & i3;
            switch (iK) {
                case 0:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        double d = g1.c.d(j, obj);
                        j jVar = (j) d0Var.a;
                        jVar.getClass();
                        jVar.t(i7, Double.doubleToRawLongBits(d));
                    }
                    break;
                case 1:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        float fE = g1.c.e(j, obj);
                        j jVar2 = (j) d0Var.a;
                        jVar2.getClass();
                        jVar2.r(i7, Float.floatToRawIntBits(fE));
                    }
                    l0Var = this;
                    break;
                case 2:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).E(i7, unsafe.getLong(obj, j));
                    }
                    l0Var = this;
                    break;
                case 3:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).E(i7, unsafe.getLong(obj, j));
                    }
                    l0Var = this;
                    break;
                case 4:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).v(i7, unsafe.getInt(obj, j));
                    }
                    l0Var = this;
                    break;
                case 5:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).t(i7, unsafe.getLong(obj, j));
                    }
                    l0Var = this;
                    break;
                case 6:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).r(i7, unsafe.getInt(obj, j));
                    }
                    l0Var = this;
                    break;
                case 7:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).o(i7, g1.c.c(j, obj));
                    }
                    l0Var = this;
                    break;
                case 8:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((j) d0Var.a).z(i7, (String) object);
                        } else {
                            ((j) d0Var.a).p(i7, (f) object);
                        }
                    }
                    l0Var = this;
                    break;
                case 9:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).y(i7, (a) unsafe.getObject(obj, j), l0Var.m(i5));
                    }
                    break;
                case 10:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).p(i7, (f) unsafe.getObject(obj, j));
                    }
                    l0Var = this;
                    break;
                case 11:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).C(i7, unsafe.getInt(obj, j));
                    }
                    l0Var = this;
                    break;
                case 12:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).v(i7, unsafe.getInt(obj, j));
                    }
                    l0Var = this;
                    break;
                case 13:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).r(i7, unsafe.getInt(obj, j));
                    }
                    l0Var = this;
                    break;
                case 14:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        ((j) d0Var.a).t(i7, unsafe.getLong(obj, j));
                    }
                    l0Var = this;
                    break;
                case 15:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((j) d0Var.a).C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    l0Var = this;
                    break;
                case 16:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((j) d0Var.a).E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    l0Var = this;
                    break;
                case 17:
                    if (l0Var.o(obj, i5, i4, i6, i)) {
                        d0Var.a(i7, unsafe.getObject(obj, j), l0Var.m(i5));
                    }
                    break;
                case 18:
                    i4 = i4;
                    v0.n(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 19:
                    i4 = i4;
                    v0.r(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    v0.t(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    v0.z(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    v0.s(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 23:
                    i4 = i4;
                    v0.q(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 24:
                    i4 = i4;
                    v0.p(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    v0.m(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 26:
                    i2 = i4;
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = v0.a;
                    if (list != null && !list.isEmpty()) {
                        d0Var.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            ((j) d0Var.a).z(i11, (String) list.get(i12));
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    u0 u0VarM = l0Var.m(i5);
                    Class cls2 = v0.a;
                    if (list2 != null && !list2.isEmpty()) {
                        d0Var.getClass();
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((j) d0Var.a).y(i13, (a) list2.get(i14), u0VarM);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = v0.a;
                    if (list3 != null && !list3.isEmpty()) {
                        d0Var.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((j) d0Var.a).p(i15, (f) list3.get(i16));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    z = false;
                    v0.y(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 30:
                    z = false;
                    v0.o(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 31:
                    z = false;
                    v0.u(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 32:
                    z = false;
                    v0.v(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case Token.GETPROP /* 33 */:
                    z = false;
                    v0.w(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    z = false;
                    v0.x(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, false);
                    i4 = i4;
                    break;
                case 35:
                    i2 = i4;
                    v0.n(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i2 = i4;
                    v0.r(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.SETPROP /* 37 */:
                    i2 = i4;
                    v0.t(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    i2 = i4;
                    v0.z(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.GETELEM /* 39 */:
                    i2 = i4;
                    v0.s(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    i2 = i4;
                    v0.q(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.SETELEM /* 41 */:
                    i2 = i4;
                    v0.p(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    i2 = i4;
                    v0.m(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.CALL /* 43 */:
                    i2 = i4;
                    v0.y(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.NAME /* 44 */:
                    i2 = i4;
                    v0.o(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.NUMBER /* 45 */:
                    i2 = i4;
                    v0.u(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.STRING /* 46 */:
                    i2 = i4;
                    v0.v(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.NULL /* 47 */:
                    i2 = i4;
                    v0.w(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.THIS /* 48 */:
                    i2 = i4;
                    v0.x(iArr[i5], (List) unsafe.getObject(obj, j), d0Var, true);
                    i4 = i2;
                    break;
                case Token.FALSE /* 49 */:
                    i2 = i4;
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    u0 u0VarM2 = l0Var.m(i5);
                    Class cls4 = v0.a;
                    if (list4 != null && !list4.isEmpty()) {
                        d0Var.getClass();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            d0Var.a(i17, list4.get(i18), u0VarM2);
                        }
                    }
                    i4 = i2;
                    break;
                case Token.TRUE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i19 = 2;
                        Object obj2 = l0Var.b[(i5 / 3) * 2];
                        l0Var.m.getClass();
                        e0 e0Var = ((f0) obj2).a;
                        j jVar3 = (j) d0Var.a;
                        jVar3.getClass();
                        for (Map.Entry entry : ((g0) object2).entrySet()) {
                            jVar3.B(i7, i19);
                            jVar3.D(f0.a(e0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            o.b(jVar3, e0Var.a, 1, key);
                            i19 = 2;
                            o.b(jVar3, e0Var.b, 2, value);
                            i4 = i4;
                        }
                    }
                    i2 = i4;
                    i4 = i2;
                    break;
                case Token.SHEQ /* 51 */:
                    if (l0Var.q(i7, i5, obj)) {
                        double dDoubleValue = ((Double) g1.c.h(j, obj)).doubleValue();
                        j jVar4 = (j) d0Var.a;
                        jVar4.getClass();
                        jVar4.t(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (l0Var.q(i7, i5, obj)) {
                        float fFloatValue = ((Float) g1.c.h(j, obj)).floatValue();
                        j jVar5 = (j) d0Var.a;
                        jVar5.getClass();
                        jVar5.r(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).E(i7, z(j, obj));
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).E(i7, z(j, obj));
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).v(i7, y(j, obj));
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).t(i7, z(j, obj));
                    }
                    break;
                case Token.IN /* 57 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).r(i7, y(j, obj));
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).o(i7, ((Boolean) g1.c.h(j, obj)).booleanValue());
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (l0Var.q(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((j) d0Var.a).z(i7, (String) object3);
                        } else {
                            ((j) d0Var.a).p(i7, (f) object3);
                        }
                    }
                    break;
                case 60:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).y(i7, (a) unsafe.getObject(obj, j), l0Var.m(i5));
                    }
                    break;
                case 61:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).p(i7, (f) unsafe.getObject(obj, j));
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).C(i7, y(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).v(i7, y(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).r(i7, y(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (l0Var.q(i7, i5, obj)) {
                        ((j) d0Var.a).t(i7, z(j, obj));
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (l0Var.q(i7, i5, obj)) {
                        int iY = y(j, obj);
                        ((j) d0Var.a).C(i7, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (l0Var.q(i7, i5, obj)) {
                        long jZ = z(j, obj);
                        ((j) d0Var.a).E(i7, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (l0Var.q(i7, i5, obj)) {
                        d0Var.a(i7, unsafe.getObject(obj, j), l0Var.m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        l0Var.l.getClass();
        ((t) obj).unknownFields.d(d0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.o(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                v0.k(this.l, obj, obj2);
                return;
            }
            int iL = L(i);
            long j = 1048575 & iL;
            int i2 = iArr[i];
            switch (K(iL)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        f1 f1Var = g1.c;
                        obj3 = obj;
                        f1Var.l(obj3, j, f1Var.d(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        f1 f1Var2 = g1.c;
                        f1Var2.m(obj, j, f1Var2.e(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        g1.n(obj, j, g1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        g1.n(obj, j, g1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        g1.n(obj, j, g1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        f1 f1Var3 = g1.c;
                        f1Var3.j(obj, j, f1Var3.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        g1.o(j, obj, g1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        g1.o(j, obj, g1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        g1.n(obj, j, g1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        g1.m(j, obj, g1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        g1.n(obj, j, g1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                    f1 f1Var4 = g1.c;
                    u uVarD = (u) f1Var4.h(j, obj);
                    u uVar = (u) f1Var4.h(j, obj2);
                    s0 s0Var = (s0) uVarD;
                    int i3 = s0Var.z;
                    int i4 = ((s0) uVar).z;
                    if (i3 > 0 && i4 > 0) {
                        if (!((s0) uVarD).e) {
                            uVarD = s0Var.d(i4 + i3);
                        }
                        ((s0) uVarD).addAll(uVar);
                    }
                    if (i3 > 0) {
                        uVar = uVarD;
                    }
                    g1.o(j, obj, uVar);
                    obj3 = obj;
                    break;
                case Token.TRUE /* 50 */:
                    Class cls = v0.a;
                    f1 f1Var5 = g1.c;
                    Object objH = f1Var5.h(j, obj);
                    Object objH2 = f1Var5.h(j, obj2);
                    this.m.getClass();
                    g1.o(j, obj, h0.a(objH, objH2));
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
                    if (q(i2, i, obj2)) {
                        g1.o(j, obj, g1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    if (q(i2, i, obj2)) {
                        g1.o(j, obj, g1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case Token.ENUM_ID /* 68 */:
                    t(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                tVar.k(Integer.MAX_VALUE);
                tVar.memoizedHashCode = 0;
                tVar.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iL = L(i);
                long j = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).b(o.getObject(obj, j));
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
                                s0 s0Var = (s0) ((u) g1.c.h(j, obj));
                                if (s0Var.e) {
                                    s0Var.e = false;
                                }
                                break;
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((g0) object).e = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(o.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).b(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            a1 a1Var = ((t) obj).unknownFields;
            if (a1Var.e) {
                a1Var.e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iL = L(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iL) == 0 || o(obj, i6, i, i2, i10)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i6, i, i2, i10)) {
                        if (!m(i6).c(g1.c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i7, i6, obj)) {
                                if (!m(i6).c(g1.c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = g1.c.h(iL & 1048575, obj);
                                this.m.getClass();
                                g0 g0Var = (g0) objH;
                                if (g0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((f0) this.b[(i6 / 3) * 2]).a.b.e != p1.MESSAGE) {
                                        continue;
                                    } else {
                                        u0 u0VarA = null;
                                        for (Object obj2 : g0Var.values()) {
                                            if (u0VarA == null) {
                                                u0VarA = r0.c.a(obj2.getClass());
                                            }
                                            if (!u0VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) g1.c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        u0 u0VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (u0VarM.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final t d() {
        this.j.getClass();
        return ((t) this.e).i();
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void e(Object obj, d0 d0Var) throws IOException {
        d0Var.getClass();
        M(obj, d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final int f(t tVar) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iF;
        int iH7;
        int iA;
        int iC;
        int iH8;
        int size;
        int i2;
        int iH9;
        int iH10;
        int size2;
        int iH11;
        int i3;
        int iJ3;
        int iA2;
        int iH12;
        int i4;
        l0 l0Var = this;
        t tVar2 = tVar;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iF2 = 0;
        while (true) {
            int[] iArr = l0Var.a;
            if (i6 >= iArr.length) {
                l0Var.l.getClass();
                return tVar2.unknownFields.b() + iF2;
            }
            int iL = l0Var.L(i6);
            int iK = K(iL);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & 1048575;
            if (iK <= 17) {
                if (i10 != i5) {
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(tVar2, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & 1048575;
            if (iK >= p.y.e) {
                int i11 = p.z.e;
            }
            switch (iK) {
                case 0:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH = j.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 1:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH2 = j.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 2:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(tVar2, j);
                        iH3 = j.h(i8);
                        iJ = j.j(j2);
                        iF2 += iJ + iH3;
                    }
                    l0Var = this;
                    break;
                case 3:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(tVar2, j);
                        iH3 = j.h(i8);
                        iJ = j.j(j3);
                        iF2 += iJ + iH3;
                    }
                    l0Var = this;
                    break;
                case 4:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        int i12 = unsafe.getInt(tVar2, j);
                        iH4 = j.h(i8);
                        iJ2 = j.j(i12);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    l0Var = this;
                    break;
                case 5:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH5 = j.h(i8);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 6:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH2 = j.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 7:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH6 = j.h(i8) + 1;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 8:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(tVar2, j);
                        iF2 = (object instanceof f ? j.f(i8, (f) object) : j.g((String) object) + j.h(i8)) + iF2;
                    }
                    l0Var = this;
                    break;
                case 9:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(tVar2, j);
                        u0 u0VarM = l0Var.m(i6);
                        Class cls = v0.a;
                        int iH13 = j.h(i8);
                        int iA3 = ((a) object2).a(u0VarM);
                        iF2 += j.i(iA3) + iA3 + iH13;
                    }
                    break;
                case 10:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iF = j.f(i8, (f) unsafe.getObject(tVar2, j));
                        iF2 += iF;
                    }
                    l0Var = this;
                    break;
                case 11:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(tVar2, j);
                        iH4 = j.h(i8);
                        iJ2 = j.i(i13);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    l0Var = this;
                    break;
                case 12:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(tVar2, j);
                        iH4 = j.h(i8);
                        iJ2 = j.j(i14);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    l0Var = this;
                    break;
                case 13:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH2 = j.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 14:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        iH5 = j.h(i8);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    l0Var = this;
                    tVar2 = tVar;
                    break;
                case 15:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        int i15 = unsafe.getInt(tVar2, j);
                        iH4 = j.h(i8);
                        iJ2 = j.i((i15 >> 31) ^ (i15 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    l0Var = this;
                    break;
                case 16:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(tVar2, j);
                        iH3 = j.h(i8);
                        iJ = j.j((j4 << 1) ^ (j4 >> 63));
                        iF2 += iJ + iH3;
                    }
                    l0Var = this;
                    break;
                case 17:
                    if (l0Var.o(tVar2, i6, i5, i7, i)) {
                        a aVar = (a) unsafe.getObject(tVar2, j);
                        u0 u0VarM2 = l0Var.m(i6);
                        iH7 = j.h(i8) * 2;
                        iA = aVar.a(u0VarM2);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 18:
                    iC = v0.c(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case 19:
                    iC = v0.b(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(tVar2, j);
                    Class cls2 = v0.a;
                    if (list.size() == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = (j.h(i8) * list.size()) + v0.e(list);
                    }
                    iF2 += iH8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(tVar2, j);
                    Class cls3 = v0.a;
                    size = list2.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.i(list2);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(tVar2, j);
                    Class cls4 = v0.a;
                    size = list3.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.d(list3);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 23:
                    iC = v0.c(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case 24:
                    iC = v0.b(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(tVar2, j);
                    Class cls5 = v0.a;
                    int size3 = list4.size();
                    iF2 += size3 == 0 ? 0 : (j.h(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(tVar2, j);
                    Class cls6 = v0.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = j.h(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof f) {
                                int size5 = ((f) obj).size();
                                iH8 = j.i(size5) + size5 + iH8;
                            } else {
                                iH8 = j.g((String) obj) + iH8;
                            }
                        }
                    }
                    iF2 += iH8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(tVar2, j);
                    u0 u0VarM3 = l0Var.m(i6);
                    Class cls7 = v0.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iH10 = 0;
                    } else {
                        iH10 = j.h(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int iA4 = ((a) list6.get(i17)).a(u0VarM3);
                            iH10 += j.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(tVar2, j);
                    Class cls8 = v0.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = j.h(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((f) list7.get(i18)).size();
                            iH8 += j.i(size8) + size8;
                        }
                    }
                    iF2 += iH8;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(tVar2, j);
                    Class cls9 = v0.a;
                    size = list8.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.h(list8);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(tVar2, j);
                    Class cls10 = v0.a;
                    size = list9.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.a(list9);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 31:
                    iC = v0.b(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case 32:
                    iC = v0.c(i8, (List) unsafe.getObject(tVar2, j));
                    iF2 += iC;
                    break;
                case Token.GETPROP /* 33 */:
                    List list10 = (List) unsafe.getObject(tVar2, j);
                    Class cls11 = v0.a;
                    size = list10.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.f(list10);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    List list11 = (List) unsafe.getObject(tVar2, j);
                    Class cls12 = v0.a;
                    size = list11.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = v0.g(list11);
                        iH9 = j.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(tVar2, j);
                    Class cls13 = v0.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    List list13 = (List) unsafe.getObject(tVar2, j);
                    Class cls14 = v0.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.SETPROP /* 37 */:
                    size2 = v0.e((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    size2 = v0.i((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.GETELEM /* 39 */:
                    size2 = v0.d((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    List list14 = (List) unsafe.getObject(tVar2, j);
                    Class cls15 = v0.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.SETELEM /* 41 */:
                    List list15 = (List) unsafe.getObject(tVar2, j);
                    Class cls16 = v0.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    List list16 = (List) unsafe.getObject(tVar2, j);
                    Class cls17 = v0.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.CALL /* 43 */:
                    size2 = v0.h((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.NAME /* 44 */:
                    size2 = v0.a((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(tVar2, j);
                    Class cls18 = v0.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.STRING /* 46 */:
                    List list18 = (List) unsafe.getObject(tVar2, j);
                    Class cls19 = v0.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.NULL /* 47 */:
                    size2 = v0.f((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.THIS /* 48 */:
                    size2 = v0.g((List) unsafe.getObject(tVar2, j));
                    if (size2 > 0) {
                        iH11 = j.h(i8);
                        i3 = j.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.FALSE /* 49 */:
                    List list19 = (List) unsafe.getObject(tVar2, j);
                    u0 u0VarM4 = l0Var.m(i6);
                    Class cls20 = v0.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            iA2 += ((a) list19.get(i19)).a(u0VarM4) + (j.h(i8) * 2);
                        }
                    }
                    iF2 += iA2;
                    break;
                case Token.TRUE /* 50 */:
                    Object object3 = unsafe.getObject(tVar2, j);
                    Object obj2 = l0Var.b[(i6 / 3) * 2];
                    l0Var.m.getClass();
                    g0 g0Var = (g0) object3;
                    f0 f0Var = (f0) obj2;
                    if (g0Var.isEmpty()) {
                        iH10 = 0;
                    } else {
                        iH10 = 0;
                        for (Map.Entry entry : g0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            f0Var.getClass();
                            int iH14 = j.h(i8);
                            int iA5 = f0.a(f0Var.a, key, value);
                            iH10 += j.i(iA5) + iA5 + iH14;
                        }
                    }
                    iF2 += iH10;
                    break;
                case Token.SHEQ /* 51 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH = j.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH12 = j.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        long jZ = z(j, tVar2);
                        size2 = j.h(i8);
                        iJ3 = j.j(jZ);
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        long jZ2 = z(j, tVar2);
                        size2 = j.h(i8);
                        iJ3 = j.j(jZ2);
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        int iY = y(j, tVar2);
                        iH7 = j.h(i8);
                        iA = j.j(iY);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH = j.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case Token.IN /* 57 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH12 = j.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iC = j.h(i8) + 1;
                        iF2 += iC;
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        Object object4 = unsafe.getObject(tVar2, j);
                        iF2 = (object4 instanceof f ? j.f(i8, (f) object4) : j.g((String) object4) + j.h(i8)) + iF2;
                    }
                    break;
                case 60:
                    if (l0Var.q(i8, i6, tVar2)) {
                        Object object5 = unsafe.getObject(tVar2, j);
                        u0 u0VarM5 = l0Var.m(i6);
                        Class cls21 = v0.a;
                        int iH15 = j.h(i8);
                        int iA6 = ((a) object5).a(u0VarM5);
                        i4 = j.i(iA6) + iA6 + iH15;
                        iF2 += i4;
                    }
                    break;
                case 61:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iC = j.f(i8, (f) unsafe.getObject(tVar2, j));
                        iF2 += iC;
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        int iY2 = y(j, tVar2);
                        iH7 = j.h(i8);
                        iA = j.i(iY2);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        int iY3 = y(j, tVar2);
                        iH7 = j.h(i8);
                        iA = j.j(iY3);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH12 = j.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iH = j.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        int iY4 = y(j, tVar2);
                        iH7 = j.h(i8);
                        iA = j.i((iY4 >> 31) ^ (iY4 << 1));
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        long jZ3 = z(j, tVar2);
                        size2 = j.h(i8);
                        iJ3 = j.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (l0Var.q(i8, i6, tVar2)) {
                        iC = ((a) unsafe.getObject(tVar2, j)).a(l0Var.m(i6)) + (j.h(i8) * 2);
                        iF2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final int g(t tVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iL = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iL;
            int i6 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i = i3 * 53;
                    iB = v.b(Double.doubleToLongBits(g1.c.d(j, tVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(g1.c.e(j, tVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = v.b(g1.c.g(j, tVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = v.b(g1.c.g(j, tVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = v.b(g1.c.g(j, tVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = g1.c.c(j, tVar);
                    Charset charset = v.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) g1.c.h(j, tVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = g1.c.h(j, tVar);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = g1.c.h(j, tVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = v.b(g1.c.g(j, tVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = g1.c.f(j, tVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = v.b(g1.c.g(j, tVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = g1.c.h(j, tVar);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iB = g1.c.h(j, tVar).hashCode();
                    i3 = iB + i;
                    break;
                case Token.TRUE /* 50 */:
                    i = i3 * 53;
                    iB = g1.c.h(j, tVar).hashCode();
                    i3 = iB + i;
                    break;
                case Token.SHEQ /* 51 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(Double.doubleToLongBits(((Double) g1.c.h(j, tVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) g1.c.h(j, tVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(z(j, tVar));
                        i3 = iB + i;
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(z(j, tVar));
                        i3 = iB + i;
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(z(j, tVar));
                        i3 = iB + i;
                    }
                    break;
                case Token.IN /* 57 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (q(i5, i4, tVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) g1.c.h(j, tVar)).booleanValue();
                        Charset charset2 = v.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = ((String) g1.c.h(j, tVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = g1.c.h(j, tVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = g1.c.h(j, tVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(z(j, tVar));
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = y(j, tVar);
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = v.b(z(j, tVar));
                        i3 = iB + i;
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (q(i5, i4, tVar)) {
                        i = i3 * 53;
                        iB = g1.c.h(j, tVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.l.getClass();
        return tVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean h(t tVar, t tVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iL = L(i);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var = g1.c;
                            if (Double.doubleToLongBits(f1Var.d(j, tVar)) != Double.doubleToLongBits(f1Var.d(j, tVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var2 = g1.c;
                            if (Float.floatToIntBits(f1Var2.e(j, tVar)) != Float.floatToIntBits(f1Var2.e(j, tVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var3 = g1.c;
                            if (f1Var3.g(j, tVar) != f1Var3.g(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var4 = g1.c;
                            if (f1Var4.g(j, tVar) != f1Var4.g(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var5 = g1.c;
                            if (f1Var5.f(j, tVar) != f1Var5.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var6 = g1.c;
                            if (f1Var6.g(j, tVar) != f1Var6.g(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var7 = g1.c;
                            if (f1Var7.f(j, tVar) != f1Var7.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var8 = g1.c;
                            if (f1Var8.c(j, tVar) != f1Var8.c(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var9 = g1.c;
                            if (!v0.l(f1Var9.h(j, tVar), f1Var9.h(j, tVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var10 = g1.c;
                            if (!v0.l(f1Var10.h(j, tVar), f1Var10.h(j, tVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var11 = g1.c;
                            if (!v0.l(f1Var11.h(j, tVar), f1Var11.h(j, tVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var12 = g1.c;
                            if (f1Var12.f(j, tVar) != f1Var12.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var13 = g1.c;
                            if (f1Var13.f(j, tVar) != f1Var13.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var14 = g1.c;
                            if (f1Var14.f(j, tVar) != f1Var14.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var15 = g1.c;
                            if (f1Var15.g(j, tVar) != f1Var15.g(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var16 = g1.c;
                            if (f1Var16.f(j, tVar) != f1Var16.f(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var17 = g1.c;
                            if (f1Var17.g(j, tVar) != f1Var17.g(j, tVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(tVar, tVar2, i)) {
                            zL = false;
                        } else {
                            f1 f1Var18 = g1.c;
                            if (!v0.l(f1Var18.h(j, tVar), f1Var18.h(j, tVar2))) {
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
                        f1 f1Var19 = g1.c;
                        zL = v0.l(f1Var19.h(j, tVar), f1Var19.h(j, tVar2));
                        break;
                    case Token.TRUE /* 50 */:
                        f1 f1Var20 = g1.c;
                        zL = v0.l(f1Var20.h(j, tVar), f1Var20.h(j, tVar2));
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
                        f1 f1Var21 = g1.c;
                        if (f1Var21.f(j2, tVar) != f1Var21.f(j2, tVar2) || !v0.l(f1Var21.h(j, tVar), f1Var21.h(j, tVar2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (tVar.unknownFields.equals(tVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.u0
    public final void i(java.lang.Object r19, androidx.compose.foundation.text.selection.w r20, androidx.datastore.preferences.protobuf.l r21) {
        /*
            Method dump skipped, instruction units count: 1930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l0.i(java.lang.Object, androidx.compose.foundation.text.selection.w, androidx.datastore.preferences.protobuf.l):void");
    }

    public final boolean j(t tVar, t tVar2, int i) {
        return n(i, tVar) == n(i, tVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (g1.c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        androidx.transition.k.i();
    }

    public final u0 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        u0 u0Var = (u0) objArr[i2];
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0VarA = r0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = u0VarA;
        return u0VarA;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iL = L(i);
            long j2 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(g1.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(g1.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (g1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (g1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (g1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return g1.c.c(j2, obj);
                case 8:
                    Object objH = g1.c.h(j2, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof f) {
                        return !f.z.equals(objH);
                    }
                    net.luminis.tls.engine.impl.c.a();
                    return false;
                case 9:
                    if (g1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !f.z.equals(g1.c.h(j2, obj));
                case 11:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (g1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (g1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (g1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (g1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    net.luminis.tls.engine.impl.c.a();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & g1.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return g1.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(Object obj, int i, Object obj2, l lVar, androidx.compose.foundation.text.selection.w wVar) throws com.google.protobuf.w0, w {
        long jL = L(i) & 1048575;
        Object objH = g1.c.h(jL, obj);
        h0 h0Var = this.m;
        if (objH == null) {
            h0Var.getClass();
            objH = g0.y.b();
            g1.o(jL, obj, objH);
        } else {
            h0Var.getClass();
            if (!((g0) objH).e) {
                g0 g0VarB = g0.y.b();
                h0.a(g0VarB, objH);
                g1.o(jL, obj, g0VarB);
                objH = g0VarB;
            }
        }
        h0Var.getClass();
        g0 g0Var = (g0) objH;
        e0 e0Var = ((f0) obj2).a;
        wVar.U(2);
        androidx.core.view.w0 w0Var = (androidx.core.view.w0) wVar.e;
        int iS = w0Var.s(w0Var.J());
        Object obj3 = e0Var.c;
        Object objT = "";
        Object objT2 = obj3;
        while (true) {
            try {
                int iC = wVar.c();
                if (iC == Integer.MAX_VALUE || w0Var.l()) {
                    break;
                }
                if (iC == 1) {
                    objT = wVar.t(e0Var.a, null, null);
                } else if (iC != 2) {
                    try {
                        if (!wVar.V()) {
                            throw new x("Unable to parse map entry.");
                        }
                    } catch (w unused) {
                        if (!wVar.V()) {
                            throw new x("Unable to parse map entry.");
                        }
                    }
                } else {
                    objT2 = wVar.t(e0Var.b, obj3.getClass(), lVar);
                }
            } catch (Throwable th) {
                w0Var.r(iS);
                throw th;
            }
        }
        g0Var.put(objT, objT2);
        w0Var.r(iS);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                com.google.gson.b.c(this.a[i], obj2);
                return;
            }
            u0 u0VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    t tVarD = u0VarM.d();
                    u0VarM.a(tVarD, object);
                    unsafe.putObject(obj, jL, tVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                t tVarD2 = u0VarM.d();
                u0VarM.a(tVarD2, object2);
                unsafe.putObject(obj, jL, tVarD2);
                object2 = tVarD2;
            }
            u0VarM.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                com.google.gson.b.c(iArr[i], obj2);
                return;
            }
            u0 u0VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    t tVarD = u0VarM.d();
                    u0VarM.a(tVarD, object);
                    unsafe.putObject(obj, jL, tVarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                t tVarD2 = u0VarM.d();
                u0VarM.a(tVarD2, object2);
                unsafe.putObject(obj, jL, tVarD2);
                object2 = tVarD2;
            }
            u0VarM.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        u0 u0VarM = m(i);
        long jL = L(i) & 1048575;
        if (!n(i, obj)) {
            return u0VarM.d();
        }
        Object object = o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        t tVarD = u0VarM.d();
        if (object != null) {
            u0VarM.a(tVarD, object);
        }
        return tVarD;
    }

    public final Object v(int i, int i2, Object obj) {
        u0 u0VarM = m(i2);
        if (!q(i, i2, obj)) {
            return u0VarM.d();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        t tVarD = u0VarM.d();
        if (object != null) {
            u0VarM.a(tVarD, object);
        }
        return tVarD;
    }
}
