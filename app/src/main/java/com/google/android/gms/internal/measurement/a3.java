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
public final class a3 {
    public static final a3 A;
    public static final a3 B;
    public static final /* synthetic */ a3[] C;
    public static final a3 z;
    public final b3 e;
    public final int y;

    /* JADX INFO: Fake field, exist only in values array */
    a3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    a3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    a3 EF0;

    static {
        a3 a3Var = new a3("DOUBLE", 0, b3.A, 1);
        a3 a3Var2 = new a3("FLOAT", 1, b3.z, 5);
        b3 b3Var = b3.y;
        a3 a3Var3 = new a3("INT64", 2, b3Var, 0);
        a3 a3Var4 = new a3("UINT64", 3, b3Var, 0);
        b3 b3Var2 = b3.e;
        a3 a3Var5 = new a3("INT32", 4, b3Var2, 0);
        a3 a3Var6 = new a3("FIXED64", 5, b3Var, 1);
        a3 a3Var7 = new a3("FIXED32", 6, b3Var2, 5);
        a3 a3Var8 = new a3("BOOL", 7, b3.B, 0);
        a3 a3Var9 = new a3("STRING", 8, b3.C, 2);
        z = a3Var9;
        b3 b3Var3 = b3.F;
        a3 a3Var10 = new a3("GROUP", 9, b3Var3, 3);
        A = a3Var10;
        a3 a3Var11 = new a3("MESSAGE", 10, b3Var3, 2);
        B = a3Var11;
        C = new a3[]{a3Var, a3Var2, a3Var3, a3Var4, a3Var5, a3Var6, a3Var7, a3Var8, a3Var9, a3Var10, a3Var11, new a3("BYTES", 11, b3.D, 2), new a3("UINT32", 12, b3Var2, 0), new a3("ENUM", 13, b3.E, 0), new a3("SFIXED32", 14, b3Var2, 5), new a3("SFIXED64", 15, b3Var, 1), new a3("SINT32", 16, b3Var2, 0), new a3("SINT64", 17, b3Var, 0)};
    }

    public a3(String str, int i, b3 b3Var, int i2) {
        super(str, i);
        this.e = b3Var;
        this.y = i2;
    }

    public static a3[] values() {
        return (a3[]) C.clone();
    }
}
