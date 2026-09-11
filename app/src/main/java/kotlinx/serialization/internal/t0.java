package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static final kotlin.collections.builders.e a;

    static {
        kotlin.collections.builders.e eVar = new kotlin.collections.builders.e();
        eVar.put(kotlin.jvm.internal.a0.a(String.class), y0.a);
        eVar.put(kotlin.jvm.internal.a0.a(Character.TYPE), m.a);
        eVar.put(kotlin.jvm.internal.a0.a(char[].class), l.c);
        eVar.put(kotlin.jvm.internal.a0.a(Double.TYPE), q.a);
        eVar.put(kotlin.jvm.internal.a0.a(double[].class), p.c);
        eVar.put(kotlin.jvm.internal.a0.a(Float.TYPE), v.a);
        eVar.put(kotlin.jvm.internal.a0.a(float[].class), u.c);
        eVar.put(kotlin.jvm.internal.a0.a(Long.TYPE), h0.a);
        eVar.put(kotlin.jvm.internal.a0.a(long[].class), g0.c);
        eVar.put(kotlin.jvm.internal.a0.a(kotlin.t.class), h1.a);
        eVar.put(kotlin.jvm.internal.a0.a(Integer.TYPE), b0.a);
        eVar.put(kotlin.jvm.internal.a0.a(int[].class), a0.c);
        eVar.put(kotlin.jvm.internal.a0.a(kotlin.r.class), e1.a);
        eVar.put(kotlin.jvm.internal.a0.a(Short.TYPE), x0.a);
        eVar.put(kotlin.jvm.internal.a0.a(short[].class), w0.c);
        eVar.put(kotlin.jvm.internal.a0.a(kotlin.w.class), k1.a);
        eVar.put(kotlin.jvm.internal.a0.a(Byte.TYPE), i.a);
        eVar.put(kotlin.jvm.internal.a0.a(byte[].class), h.c);
        eVar.put(kotlin.jvm.internal.a0.a(kotlin.p.class), b1.a);
        eVar.put(kotlin.jvm.internal.a0.a(Boolean.TYPE), f.a);
        eVar.put(kotlin.jvm.internal.a0.a(boolean[].class), e.c);
        eVar.put(kotlin.jvm.internal.a0.a(kotlin.y.class), l1.b);
        eVar.put(kotlin.jvm.internal.a0.a(Void.class), j0.a);
        try {
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(kotlin.time.a.class);
            kotlin.time.g gVar = kotlin.time.a.y;
            eVar.put(eVarA, r.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            eVar.put(kotlin.jvm.internal.a0.a(kotlin.u.class), g1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            eVar.put(kotlin.jvm.internal.a0.a(kotlin.s.class), d1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            eVar.put(kotlin.jvm.internal.a0.a(kotlin.x.class), j1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            eVar.put(kotlin.jvm.internal.a0.a(kotlin.q.class), a1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            eVar.put(kotlin.jvm.internal.a0.a(kotlin.uuid.a.class), m1.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = eVar.b();
    }
}
