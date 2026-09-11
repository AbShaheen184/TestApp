package com.google.android.gms.internal.measurement;

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
public final class d1 {
    public static final d1[] A;
    public static final /* synthetic */ d1[] B;
    public static final d1 y;
    public static final d1 z;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    d1 EF0;

    static {
        u1 u1Var = u1.B;
        d1 d1Var = new d1("DOUBLE", 0, 0, 1, u1Var);
        u1 u1Var2 = u1.A;
        d1 d1Var2 = new d1("FLOAT", 1, 1, 1, u1Var2);
        u1 u1Var3 = u1.z;
        d1 d1Var3 = new d1("INT64", 2, 2, 1, u1Var3);
        d1 d1Var4 = new d1("UINT64", 3, 3, 1, u1Var3);
        u1 u1Var4 = u1.y;
        d1 d1Var5 = new d1("INT32", 4, 4, 1, u1Var4);
        d1 d1Var6 = new d1("FIXED64", 5, 5, 1, u1Var3);
        d1 d1Var7 = new d1("FIXED32", 6, 6, 1, u1Var4);
        u1 u1Var5 = u1.C;
        d1 d1Var8 = new d1("BOOL", 7, 7, 1, u1Var5);
        u1 u1Var6 = u1.D;
        d1 d1Var9 = new d1("STRING", 8, 8, 1, u1Var6);
        u1 u1Var7 = u1.G;
        d1 d1Var10 = new d1("MESSAGE", 9, 9, 1, u1Var7);
        u1 u1Var8 = u1.E;
        d1 d1Var11 = new d1("BYTES", 10, 10, 1, u1Var8);
        d1 d1Var12 = new d1("UINT32", 11, 11, 1, u1Var4);
        u1 u1Var9 = u1.F;
        d1 d1Var13 = new d1("ENUM", 12, 12, 1, u1Var9);
        d1 d1Var14 = new d1("SFIXED32", 13, 13, 1, u1Var4);
        d1 d1Var15 = new d1("SFIXED64", 14, 14, 1, u1Var3);
        d1 d1Var16 = new d1("SINT32", 15, 15, 1, u1Var4);
        d1 d1Var17 = new d1("SINT64", 16, 16, 1, u1Var3);
        d1 d1Var18 = new d1("GROUP", 17, 17, 1, u1Var7);
        d1 d1Var19 = new d1("DOUBLE_LIST", 18, 18, 2, u1Var);
        d1 d1Var20 = new d1("FLOAT_LIST", 19, 19, 2, u1Var2);
        d1 d1Var21 = new d1("INT64_LIST", 20, 20, 2, u1Var3);
        d1 d1Var22 = new d1("UINT64_LIST", 21, 21, 2, u1Var3);
        d1 d1Var23 = new d1("INT32_LIST", 22, 22, 2, u1Var4);
        d1 d1Var24 = new d1("FIXED64_LIST", 23, 23, 2, u1Var3);
        d1 d1Var25 = new d1("FIXED32_LIST", 24, 24, 2, u1Var4);
        d1 d1Var26 = new d1("BOOL_LIST", 25, 25, 2, u1Var5);
        d1 d1Var27 = new d1("STRING_LIST", 26, 26, 2, u1Var6);
        d1 d1Var28 = new d1("MESSAGE_LIST", 27, 27, 2, u1Var7);
        d1 d1Var29 = new d1("BYTES_LIST", 28, 28, 2, u1Var8);
        d1 d1Var30 = new d1("UINT32_LIST", 29, 29, 2, u1Var4);
        d1 d1Var31 = new d1("ENUM_LIST", 30, 30, 2, u1Var9);
        d1 d1Var32 = new d1("SFIXED32_LIST", 31, 31, 2, u1Var4);
        d1 d1Var33 = new d1("SFIXED64_LIST", 32, 32, 2, u1Var3);
        d1 d1Var34 = new d1("SINT32_LIST", 33, 33, 2, u1Var4);
        d1 d1Var35 = new d1("SINT64_LIST", 34, 34, 2, u1Var3);
        d1 d1Var36 = new d1("DOUBLE_LIST_PACKED", 35, 35, 3, u1Var);
        y = d1Var36;
        d1 d1Var37 = new d1("FLOAT_LIST_PACKED", 36, 36, 3, u1Var2);
        d1 d1Var38 = new d1("INT64_LIST_PACKED", 37, 37, 3, u1Var3);
        d1 d1Var39 = new d1("UINT64_LIST_PACKED", 38, 38, 3, u1Var3);
        d1 d1Var40 = new d1("INT32_LIST_PACKED", 39, 39, 3, u1Var4);
        d1 d1Var41 = new d1("FIXED64_LIST_PACKED", 40, 40, 3, u1Var3);
        d1 d1Var42 = new d1("FIXED32_LIST_PACKED", 41, 41, 3, u1Var4);
        d1 d1Var43 = new d1("BOOL_LIST_PACKED", 42, 42, 3, u1Var5);
        d1 d1Var44 = new d1("UINT32_LIST_PACKED", 43, 43, 3, u1Var4);
        d1 d1Var45 = new d1("ENUM_LIST_PACKED", 44, 44, 3, u1Var9);
        d1 d1Var46 = new d1("SFIXED32_LIST_PACKED", 45, 45, 3, u1Var4);
        d1 d1Var47 = new d1("SFIXED64_LIST_PACKED", 46, 46, 3, u1Var3);
        d1 d1Var48 = new d1("SINT32_LIST_PACKED", 47, 47, 3, u1Var4);
        d1 d1Var49 = new d1("SINT64_LIST_PACKED", 48, 48, 3, u1Var3);
        z = d1Var49;
        B = new d1[]{d1Var, d1Var2, d1Var3, d1Var4, d1Var5, d1Var6, d1Var7, d1Var8, d1Var9, d1Var10, d1Var11, d1Var12, d1Var13, d1Var14, d1Var15, d1Var16, d1Var17, d1Var18, d1Var19, d1Var20, d1Var21, d1Var22, d1Var23, d1Var24, d1Var25, d1Var26, d1Var27, d1Var28, d1Var29, d1Var30, d1Var31, d1Var32, d1Var33, d1Var34, d1Var35, d1Var36, d1Var37, d1Var38, d1Var39, d1Var40, d1Var41, d1Var42, d1Var43, d1Var44, d1Var45, d1Var46, d1Var47, d1Var48, d1Var49, new d1("GROUP_LIST", 49, 49, 2, u1Var7), new d1("MAP", 50, 50, 4, u1.e)};
        d1[] d1VarArrValues = values();
        A = new d1[d1VarArrValues.length];
        for (d1 d1Var50 : d1VarArrValues) {
            A[d1Var50.e] = d1Var50;
        }
    }

    public d1(String str, int i, int i2, int i3, u1 u1Var) {
        super(str, i);
        this.e = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            u1Var.getClass();
        }
        if (i3 == 1) {
            u1 u1Var2 = u1.e;
            u1Var.ordinal();
        }
    }

    public static d1[] values() {
        return (d1[]) B.clone();
    }
}
