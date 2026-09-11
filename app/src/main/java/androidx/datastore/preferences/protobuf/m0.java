package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements u0 {
    public final a a;
    public final b1 b;
    public final m c;

    public m0(b1 b1Var, m mVar, a aVar) {
        this.b = b1Var;
        mVar.getClass();
        this.c = mVar;
        this.a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void a(Object obj, Object obj2) {
        v0.k(this.b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void b(Object obj) {
        this.b.getClass();
        a1 a1Var = ((t) obj).unknownFields;
        if (a1Var.e) {
            a1Var.e = false;
        }
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean c(Object obj) {
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final t d() {
        a aVar = this.a;
        return aVar instanceof t ? ((t) aVar).i() : ((r) ((t) aVar).c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void e(Object obj, d0 d0Var) {
        this.c.getClass();
        androidx.privacysandbox.ads.adservices.java.internal.a.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final int f(t tVar) {
        this.b.getClass();
        a1 a1Var = tVar.unknownFields;
        int i = a1Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < a1Var.a; i2++) {
            int i3 = a1Var.b[i2] >>> 3;
            iF += j.f(3, (f) a1Var.c[i2]) + j.i(i3) + j.h(2) + (j.h(1) * 2);
        }
        a1Var.d = iF;
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final int g(t tVar) {
        this.b.getClass();
        return tVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean h(t tVar, t tVar2) {
        this.b.getClass();
        return tVar.unknownFields.equals(tVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void i(Object obj, androidx.compose.foundation.text.selection.w wVar, l lVar) {
        this.b.getClass();
        b1.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
