package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    public final androidx.compose.runtime.internal.i A;
    public Object B;
    public boolean C;
    public int D;

    public d(androidx.compose.runtime.internal.i iVar, n[] nVarArr) {
        super(iVar.y, nVarArr);
        this.A = iVar;
        this.D = iVar.A;
    }

    public final void d(int i, m mVar, Object obj, int i2) {
        int i3 = i2 * 5;
        n[] nVarArr = this.e;
        if (i3 <= 30) {
            int iY = 1 << com.google.firebase.b.y(i, i3);
            if (mVar.h(iY)) {
                nVarArr[i2].b(mVar.d, Integer.bitCount(mVar.a) * 2, mVar.f(iY));
                this.y = i2;
                return;
            } else {
                int iT = mVar.t(iY);
                m mVarS = mVar.s(iT);
                nVarArr[i2].b(mVar.d, Integer.bitCount(mVar.a) * 2, iT);
                d(i, mVarS, obj, i2 + 1);
                return;
            }
        }
        n nVar = nVarArr[i2];
        Object[] objArr = mVar.d;
        nVar.b(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i2];
            if (kotlin.jvm.internal.l.a(nVar2.e[nVar2.z], obj)) {
                this.y = i2;
                return;
            } else {
                nVarArr[i2].z += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.c, java.util.Iterator
    public final Object next() {
        if (this.A.A != this.D) {
            androidx.collection.g.d();
            return null;
        }
        if (!this.z) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        n nVar = this.e[this.y];
        this.B = nVar.e[nVar.z];
        this.C = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.c, java.util.Iterator
    public final void remove() {
        if (!this.C) {
            org.mozilla.javascript.c.a();
            return;
        }
        boolean z = this.z;
        androidx.compose.runtime.internal.i iVar = this.A;
        if (!z) {
            c0.b(iVar).remove(this.B);
        } else {
            if (!z) {
                org.mozilla.javascript.typedarrays.c.a();
                return;
            }
            n nVar = this.e[this.y];
            Object obj = nVar.e[nVar.z];
            c0.b(iVar).remove(this.B);
            d(obj != null ? obj.hashCode() : 0, iVar.y, obj, 0);
        }
        this.B = null;
        this.C = false;
        this.D = iVar.A;
    }
}
