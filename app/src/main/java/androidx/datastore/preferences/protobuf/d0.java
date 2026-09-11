package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final q b = new q(1);
    public final Object a;

    public d0() {
        j0 j0Var;
        r0 r0Var = r0.c;
        try {
            j0Var = (j0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            j0Var = b;
        }
        j0[] j0VarArr = {q.b, j0Var};
        c0 c0Var = new c0();
        c0Var.a = j0VarArr;
        Charset charset = v.a;
        this.a = c0Var;
    }

    public void a(int i, Object obj, u0 u0Var) {
        j jVar = (j) this.a;
        jVar.B(i, 3);
        u0Var.e((a) obj, jVar.a);
        jVar.B(i, 4);
    }

    public d0(j jVar) {
        v.a(jVar, "output");
        this.a = jVar;
        jVar.a = this;
    }
}
