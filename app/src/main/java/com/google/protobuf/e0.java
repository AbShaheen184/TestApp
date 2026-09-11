package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0[] A;
    public static final /* synthetic */ e0[] B;
    public static final e0 y;
    public static final e0 z;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF0;

    static {
        z0 z0Var = z0.DOUBLE;
        e0 e0Var = new e0("DOUBLE", 0, 0, 1, z0Var);
        z0 z0Var2 = z0.FLOAT;
        e0 e0Var2 = new e0("FLOAT", 1, 1, 1, z0Var2);
        z0 z0Var3 = z0.LONG;
        e0 e0Var3 = new e0("INT64", 2, 2, 1, z0Var3);
        e0 e0Var4 = new e0("UINT64", 3, 3, 1, z0Var3);
        z0 z0Var4 = z0.INT;
        e0 e0Var5 = new e0("INT32", 4, 4, 1, z0Var4);
        e0 e0Var6 = new e0("FIXED64", 5, 5, 1, z0Var3);
        e0 e0Var7 = new e0("FIXED32", 6, 6, 1, z0Var4);
        z0 z0Var5 = z0.BOOLEAN;
        e0 e0Var8 = new e0("BOOL", 7, 7, 1, z0Var5);
        z0 z0Var6 = z0.STRING;
        e0 e0Var9 = new e0("STRING", 8, 8, 1, z0Var6);
        z0 z0Var7 = z0.MESSAGE;
        e0 e0Var10 = new e0("MESSAGE", 9, 9, 1, z0Var7);
        z0 z0Var8 = z0.BYTE_STRING;
        e0 e0Var11 = new e0("BYTES", 10, 10, 1, z0Var8);
        e0 e0Var12 = new e0("UINT32", 11, 11, 1, z0Var4);
        z0 z0Var9 = z0.ENUM;
        e0 e0Var13 = new e0("ENUM", 12, 12, 1, z0Var9);
        e0 e0Var14 = new e0("SFIXED32", 13, 13, 1, z0Var4);
        e0 e0Var15 = new e0("SFIXED64", 14, 14, 1, z0Var3);
        e0 e0Var16 = new e0("SINT32", 15, 15, 1, z0Var4);
        e0 e0Var17 = new e0("SINT64", 16, 16, 1, z0Var3);
        e0 e0Var18 = new e0("GROUP", 17, 17, 1, z0Var7);
        e0 e0Var19 = new e0("DOUBLE_LIST", 18, 18, 2, z0Var);
        e0 e0Var20 = new e0("FLOAT_LIST", 19, 19, 2, z0Var2);
        e0 e0Var21 = new e0("INT64_LIST", 20, 20, 2, z0Var3);
        e0 e0Var22 = new e0("UINT64_LIST", 21, 21, 2, z0Var3);
        e0 e0Var23 = new e0("INT32_LIST", 22, 22, 2, z0Var4);
        e0 e0Var24 = new e0("FIXED64_LIST", 23, 23, 2, z0Var3);
        e0 e0Var25 = new e0("FIXED32_LIST", 24, 24, 2, z0Var4);
        e0 e0Var26 = new e0("BOOL_LIST", 25, 25, 2, z0Var5);
        e0 e0Var27 = new e0("STRING_LIST", 26, 26, 2, z0Var6);
        e0 e0Var28 = new e0("MESSAGE_LIST", 27, 27, 2, z0Var7);
        e0 e0Var29 = new e0("BYTES_LIST", 28, 28, 2, z0Var8);
        e0 e0Var30 = new e0("UINT32_LIST", 29, 29, 2, z0Var4);
        e0 e0Var31 = new e0("ENUM_LIST", 30, 30, 2, z0Var9);
        e0 e0Var32 = new e0("SFIXED32_LIST", 31, 31, 2, z0Var4);
        e0 e0Var33 = new e0("SFIXED64_LIST", 32, 32, 2, z0Var3);
        e0 e0Var34 = new e0("SINT32_LIST", 33, 33, 2, z0Var4);
        e0 e0Var35 = new e0("SINT64_LIST", 34, 34, 2, z0Var3);
        e0 e0Var36 = new e0("DOUBLE_LIST_PACKED", 35, 35, 3, z0Var);
        y = e0Var36;
        e0 e0Var37 = new e0("FLOAT_LIST_PACKED", 36, 36, 3, z0Var2);
        e0 e0Var38 = new e0("INT64_LIST_PACKED", 37, 37, 3, z0Var3);
        e0 e0Var39 = new e0("UINT64_LIST_PACKED", 38, 38, 3, z0Var3);
        e0 e0Var40 = new e0("INT32_LIST_PACKED", 39, 39, 3, z0Var4);
        e0 e0Var41 = new e0("FIXED64_LIST_PACKED", 40, 40, 3, z0Var3);
        e0 e0Var42 = new e0("FIXED32_LIST_PACKED", 41, 41, 3, z0Var4);
        e0 e0Var43 = new e0("BOOL_LIST_PACKED", 42, 42, 3, z0Var5);
        e0 e0Var44 = new e0("UINT32_LIST_PACKED", 43, 43, 3, z0Var4);
        e0 e0Var45 = new e0("ENUM_LIST_PACKED", 44, 44, 3, z0Var9);
        e0 e0Var46 = new e0("SFIXED32_LIST_PACKED", 45, 45, 3, z0Var4);
        e0 e0Var47 = new e0("SFIXED64_LIST_PACKED", 46, 46, 3, z0Var3);
        e0 e0Var48 = new e0("SINT32_LIST_PACKED", 47, 47, 3, z0Var4);
        e0 e0Var49 = new e0("SINT64_LIST_PACKED", 48, 48, 3, z0Var3);
        z = e0Var49;
        B = new e0[]{e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9, e0Var10, e0Var11, e0Var12, e0Var13, e0Var14, e0Var15, e0Var16, e0Var17, e0Var18, e0Var19, e0Var20, e0Var21, e0Var22, e0Var23, e0Var24, e0Var25, e0Var26, e0Var27, e0Var28, e0Var29, e0Var30, e0Var31, e0Var32, e0Var33, e0Var34, e0Var35, e0Var36, e0Var37, e0Var38, e0Var39, e0Var40, e0Var41, e0Var42, e0Var43, e0Var44, e0Var45, e0Var46, e0Var47, e0Var48, e0Var49, new e0("GROUP_LIST", 49, 49, 2, z0Var7), new e0("MAP", 50, 50, 4, z0.VOID)};
        e0[] e0VarArrValues = values();
        A = new e0[e0VarArrValues.length];
        for (e0 e0Var50 : e0VarArrValues) {
            A[e0Var50.e] = e0Var50;
        }
    }

    public e0(String str, int i, int i2, int i3, z0 z0Var) {
        super(str, i);
        this.e = i2;
        int iE = androidx.constraintlayout.core.g.e(i3);
        if (iE == 1 || iE == 3) {
            z0Var.getClass();
        }
        if (i3 == 1) {
            z0Var.ordinal();
        }
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) B.clone();
    }
}
