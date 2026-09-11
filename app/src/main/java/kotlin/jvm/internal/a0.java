package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final b0 a;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        a = b0Var;
    }

    public static e a(Class cls) {
        a.getClass();
        return new e(cls);
    }
}
