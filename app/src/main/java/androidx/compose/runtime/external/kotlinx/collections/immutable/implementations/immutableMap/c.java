package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterator, kotlin.jvm.internal.markers.a {
    public final n[] e;
    public int y;
    public boolean z = true;

    public c(m mVar, n[] nVarArr) {
        this.e = nVarArr;
        nVarArr[0].b(mVar.d, Integer.bitCount(mVar.a) * 2, 0);
        this.y = 0;
        b();
    }

    public final void b() {
        int i = this.y;
        n[] nVarArr = this.e;
        n nVar = nVarArr[i];
        if (nVar.z < nVar.y) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                n nVar2 = nVarArr[i];
                int i2 = nVar2.z;
                Object[] objArr = nVar2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    nVar2.z = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.y = iC;
                return;
            }
            if (i > 0) {
                n nVar3 = nVarArr[i - 1];
                int i3 = nVar3.z;
                int length2 = nVar3.e.length;
                nVar3.z = i3 + 1;
            }
            nVarArr[i].b(m.e.d, 0, 0);
            i--;
        }
        this.z = false;
    }

    public final int c(int i) {
        n[] nVarArr = this.e;
        n nVar = nVarArr[i];
        int i2 = nVar.z;
        if (i2 < nVar.y) {
            return i;
        }
        Object[] objArr = nVar.e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        m mVar = (m) obj;
        if (i == 6) {
            n nVar2 = nVarArr[i + 1];
            Object[] objArr2 = mVar.d;
            nVar2.b(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i + 1].b(mVar.d, Integer.bitCount(mVar.a) * 2, 0);
        }
        return c(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.z) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        Object next = this.e[this.y].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
