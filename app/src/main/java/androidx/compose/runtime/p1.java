package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {
    public final u0 a;

    public p1(kotlin.jvm.functions.a aVar) {
        this.a = new u0(aVar);
    }

    public abstract androidx.appcompat.widget.r a(Object obj);

    public w2 b() {
        return this.a;
    }

    public final w2 c(androidx.appcompat.widget.r rVar, w2 w2Var) {
        i0 i0Var;
        w2 w2Var2 = null;
        w2Var2 = null;
        w2Var2 = null;
        w2Var2 = null;
        w2Var2 = null;
        w2Var2 = null;
        if (w2Var instanceof i0) {
            if (rVar.b) {
                i0Var = (i0) w2Var;
                i0Var.a.setValue(rVar.b());
            }
        } else if (w2Var instanceof v2) {
            if ((rVar.a || rVar.f != null) && !rVar.b) {
                v2 v2Var = (v2) w2Var;
                if (kotlin.jvm.internal.l.a(rVar.b(), v2Var.a)) {
                    w2Var2 = v2Var;
                }
            }
        } else if (w2Var instanceof c0) {
            rVar.getClass();
        }
        if (w2Var2 != null) {
            w2Var2 = i0Var;
            return w2Var2;
        }
        if (!rVar.b) {
            w2Var2 = i0Var;
            return new v2(rVar.b());
        }
        Object obj = rVar.f;
        f fVar = (f) rVar.e;
        if (fVar == null) {
            w2Var2 = i0Var;
            fVar = f.D;
        }
        w2Var2 = i0Var;
        return new i0(new h1(obj, fVar));
    }
}
