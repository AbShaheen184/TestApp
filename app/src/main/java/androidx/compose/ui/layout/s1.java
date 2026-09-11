package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static final androidx.collection.z a;
    public static final q1[] b;

    static {
        androidx.collection.z zVar = new androidx.collection.z(8);
        q1.a.getClass();
        r1 r1Var = p1.g;
        zVar.h(1, r1Var);
        r1 r1Var2 = p1.f;
        zVar.h(2, r1Var2);
        r1 r1Var3 = p1.b;
        zVar.h(4, r1Var3);
        r1 r1Var4 = p1.d;
        zVar.h(8, r1Var4);
        r1 r1Var5 = p1.h;
        zVar.h(16, r1Var5);
        r1 r1Var6 = p1.e;
        zVar.h(32, r1Var6);
        r1 r1Var7 = p1.i;
        zVar.h(64, r1Var7);
        r1 r1Var8 = p1.c;
        zVar.h(128, r1Var8);
        a = zVar;
        b = new q1[]{r1Var, r1Var2, r1Var3, r1Var7, r1Var5, r1Var6, r1Var4, p1.j, r1Var8};
    }

    public static final void a(androidx.compose.ui.node.k0 k0Var, q qVar, long j, int i, int i2) {
        if (a0.f(j, -1L)) {
            return;
        }
        k0Var.b(qVar.b(), (int) ((j >>> 48) & 65535));
        k0Var.b(qVar.d(), (int) ((j >>> 32) & 65535));
        k0Var.b(qVar.c(), i - ((int) ((j >>> 16) & 65535)));
        k0Var.b(qVar.a(), i2 - ((int) (j & 65535)));
    }
}
