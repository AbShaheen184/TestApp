package kotlinx.serialization.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends n {
    public final q0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlinx.serialization.a aVar) {
        super(aVar);
        aVar.getClass();
        this.b = new q0(aVar.d());
    }

    @Override // kotlinx.serialization.internal.a, kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        return i(bVar);
    }

    @Override // kotlinx.serialization.internal.n, kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        int iH = h(obj);
        q0 q0Var = this.b;
        q0Var.getClass();
        kotlinx.serialization.json.internal.n nVarA = nVar.a(q0Var);
        o(nVarA, obj, iH);
        nVarA.s(q0Var);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object e() {
        return (p0) k(n());
    }

    @Override // kotlinx.serialization.internal.a
    public final int f(Object obj) {
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        return p0Var.d();
    }

    @Override // kotlinx.serialization.internal.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.a
    public final Object l(Object obj) {
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        return p0Var.a();
    }

    @Override // kotlinx.serialization.internal.n
    public final void m(int i, Object obj, Object obj2) {
        ((p0) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(kotlinx.serialization.json.internal.n nVar, Object obj, int i);
}
