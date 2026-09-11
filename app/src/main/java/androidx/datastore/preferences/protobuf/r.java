package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Cloneable {
    public final t e;
    public t y;

    public r(t tVar) {
        this.e = tVar;
        if (tVar.g()) {
            net.luminis.tls.engine.impl.c.o("Default instance must be immutable.");
            throw null;
        }
        this.y = tVar.i();
    }

    public final t a() {
        t tVarB = b();
        tVarB.getClass();
        if (t.f(tVarB, true)) {
            return tVarB;
        }
        throw new z0();
    }

    public final t b() {
        boolean zG = this.y.g();
        t tVar = this.y;
        if (!zG) {
            return tVar;
        }
        tVar.getClass();
        r0 r0Var = r0.c;
        r0Var.getClass();
        r0Var.a(tVar.getClass()).b(tVar);
        tVar.h();
        return this.y;
    }

    public final void c() {
        if (this.y.g()) {
            return;
        }
        t tVarI = this.e.i();
        t tVar = this.y;
        r0 r0Var = r0.c;
        r0Var.getClass();
        r0Var.a(tVarI.getClass()).a(tVarI, tVar);
        this.y = tVarI;
    }

    public final Object clone() {
        r rVar = (r) this.e.c(5);
        rVar.y = b();
        return rVar;
    }
}
