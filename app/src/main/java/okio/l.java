package okio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k {
    public final k z;

    public l(k kVar) {
        kVar.getClass();
        this.z = kVar;
    }

    @Override // okio.k
    public final List X(x xVar) {
        List<x> listX = this.z.X(xVar);
        ArrayList arrayList = new ArrayList();
        for (x xVar2 : listX) {
            xVar2.getClass();
            arrayList.add(xVar2);
        }
        kotlin.collections.r.A(arrayList);
        return arrayList;
    }

    @Override // okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) {
        xVar.getClass();
        androidx.constraintlayout.core.widgets.analyzer.e eVarZ = this.z.Z(xVar);
        if (eVarZ == null) {
            return null;
        }
        x xVar2 = (x) eVarZ.d;
        if (xVar2 == null) {
            return eVarZ;
        }
        boolean z = eVarZ.b;
        boolean z2 = eVarZ.c;
        Long l = (Long) eVarZ.e;
        Long l2 = (Long) eVarZ.f;
        Long l3 = (Long) eVarZ.g;
        Long l4 = (Long) eVarZ.h;
        Map map = (Map) eVarZ.i;
        map.getClass();
        return new androidx.constraintlayout.core.widgets.analyzer.e(z, z2, xVar2, l, l2, l3, l4, map);
    }

    @Override // okio.k
    public final f0 a(x xVar) {
        xVar.getClass();
        return this.z.a(xVar);
    }

    @Override // okio.k
    public final s a0(x xVar) {
        return this.z.a0(xVar);
    }

    @Override // okio.k
    public final h0 c0(x xVar) {
        xVar.getClass();
        return this.z.c0(xVar);
    }

    @Override // okio.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }

    @Override // okio.k
    public final void g(x xVar, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        this.z.g(xVar, xVar2);
    }

    public final String toString() {
        return kotlin.jvm.internal.a0.a(getClass()).c() + '(' + this.z + ')';
    }

    @Override // okio.k
    public final void w(x xVar) {
        xVar.getClass();
        this.z.w(xVar);
    }

    @Override // okio.k
    public final void z(x xVar) {
        xVar.getClass();
        this.z.z(xVar);
    }
}
