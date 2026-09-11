package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final g a = new g(-1.0f);
    public static final g b = new g(1.0f);
    public static final f c = new f(-1.0f);
    public static final f d = new f(1.0f);

    public static r a(r rVar, kotlin.jvm.functions.q qVar) {
        return rVar.d(new m(qVar));
    }

    public static final r b(androidx.compose.runtime.r rVar, r rVar2) {
        if (rVar2.b(n.y)) {
            return rVar2;
        }
        rVar.X(1219399079, null, null, 0);
        r rVar3 = (r) rVar2.a(o.b, new androidx.compose.animation.f(rVar, 1));
        rVar.p(false);
        return rVar3;
    }

    public static final r c(androidx.compose.runtime.r rVar, r rVar2) {
        rVar.b0(439770924);
        r rVarB = b(rVar, rVar2);
        rVar.p(false);
        return rVarB;
    }
}
