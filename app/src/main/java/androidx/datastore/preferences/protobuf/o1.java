package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class o1 {
    public static final l1 A;
    public static final m1 B;
    public static final /* synthetic */ o1[] C;
    public static final k1 z;
    public final p1 e;
    public final int y;

    /* JADX INFO: Fake field, exist only in values array */
    o1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    o1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    o1 EF2;

    static {
        o1 o1Var = new o1("DOUBLE", 0, p1.DOUBLE, 1);
        o1 o1Var2 = new o1("FLOAT", 1, p1.FLOAT, 5);
        p1 p1Var = p1.LONG;
        o1 o1Var3 = new o1("INT64", 2, p1Var, 0);
        o1 o1Var4 = new o1("UINT64", 3, p1Var, 0);
        p1 p1Var2 = p1.INT;
        o1 o1Var5 = new o1("INT32", 4, p1Var2, 0);
        o1 o1Var6 = new o1("FIXED64", 5, p1Var, 1);
        o1 o1Var7 = new o1("FIXED32", 6, p1Var2, 5);
        o1 o1Var8 = new o1("BOOL", 7, p1.BOOLEAN, 0);
        k1 k1Var = new k1("STRING", 8, p1.STRING, 2);
        z = k1Var;
        p1 p1Var3 = p1.MESSAGE;
        l1 l1Var = new l1("GROUP", 9, p1Var3, 3);
        A = l1Var;
        m1 m1Var = new m1("MESSAGE", 10, p1Var3, 2);
        B = m1Var;
        C = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7, o1Var8, k1Var, l1Var, m1Var, new n1("BYTES", 11, p1.BYTE_STRING, 2), new o1("UINT32", 12, p1Var2, 0), new o1("ENUM", 13, p1.ENUM, 0), new o1("SFIXED32", 14, p1Var2, 5), new o1("SFIXED64", 15, p1Var, 1), new o1("SINT32", 16, p1Var2, 0), new o1("SINT64", 17, p1Var, 0)};
    }

    public o1(String str, int i, p1 p1Var, int i2) {
        super(str, i);
        this.e = p1Var;
        this.y = i2;
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) C.clone();
    }
}
