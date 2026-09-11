package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final androidx.compose.runtime.collection.b a = new androidx.compose.runtime.collection.b(new h0[16]);
    public final androidx.compose.runtime.h1 b = androidx.compose.runtime.s.r(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final androidx.compose.runtime.h1 d = androidx.compose.runtime.s.r(Boolean.TRUE);

    public final void a(int i, androidx.compose.runtime.r rVar) {
        rVar.c0(-318043801);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = rVar.Q();
            kotlin.coroutines.d dVar = null;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ);
            }
            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objQ;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                rVar.b0(-144841960);
                boolean zH = rVar.h(this);
                Object objQ2 = rVar.Q();
                if (zH || objQ2 == fVar) {
                    objQ2 = new f(y0Var, this, dVar, 1);
                    rVar.l0(objQ2);
                }
                androidx.compose.runtime.j0.c(rVar, this, (kotlin.jvm.functions.p) objQ2);
            } else {
                rVar.b0(-151918981);
            }
            rVar.p(false);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g0(this, i, 0);
        }
    }
}
