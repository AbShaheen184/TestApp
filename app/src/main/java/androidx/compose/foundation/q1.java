package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(new androidx.compose.animation.core.n1(25));

    public static final n a(androidx.compose.runtime.r rVar) {
        rVar.b0(282942128);
        o oVar = (o) rVar.j(a);
        if (oVar == null) {
            rVar.p(false);
            return null;
        }
        boolean zF = rVar.f(oVar);
        Object objQ = rVar.Q();
        if (zF || objQ == androidx.compose.runtime.m.a) {
            Object nVar = new n(oVar.a, oVar.b, oVar.c, oVar.d);
            rVar.l0(nVar);
            objQ = nVar;
        }
        n nVar2 = (n) objQ;
        rVar.p(false);
        return nVar2;
    }
}
