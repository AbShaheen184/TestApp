package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final androidx.compose.foundation.layout.m0 a;
    public static final androidx.compose.foundation.layout.m0 b;
    public static final float c;
    public static final float d;

    static {
        float f = androidx.compose.material3.tokens.a.a;
        float f2 = androidx.compose.material3.tokens.a.b;
        float f3 = 16;
        float f4 = androidx.compose.material3.tokens.b.a;
        float f5 = 8;
        a = new androidx.compose.foundation.layout.m0(f, f5, f2, f5);
        androidx.compose.foundation.layout.b.b(f3, f5, f2, f5);
        float f6 = 12;
        b = new androidx.compose.foundation.layout.m0(f6, f5, f6, f5);
        androidx.compose.foundation.layout.b.b(f6, f5, f3, f5);
        c = 58;
        d = androidx.compose.material3.tokens.b.a;
    }

    public static q a(long j, long j2, androidx.compose.runtime.r rVar) {
        q qVar;
        long j3 = androidx.compose.ui.graphics.t.i;
        n0 n0Var = (n0) rVar.j(o0.a);
        q qVar2 = n0Var.X;
        if (qVar2 == null) {
            long j4 = androidx.compose.ui.graphics.t.h;
            q qVar3 = new q(j4, o0.c(n0Var, androidx.compose.material3.tokens.r.c), j4, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.r.b, o0.c(n0Var, androidx.compose.material3.tokens.r.a)));
            n0Var.X = qVar3;
            qVar = qVar3;
        } else {
            qVar = qVar2;
        }
        return qVar.a(j, j2, j3, j3);
    }
}
