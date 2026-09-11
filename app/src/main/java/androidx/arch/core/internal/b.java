package androidx.arch.core.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {
    public c e;
    public c y;
    public final /* synthetic */ int z;

    public b(c cVar, c cVar2, int i) {
        this.z = i;
        this.e = cVar2;
        this.y = cVar;
    }

    @Override // androidx.arch.core.internal.e
    public final void b(c cVar) {
        c cVar2;
        c cVarC = null;
        if (this.e == cVar && cVar == this.y) {
            this.y = null;
            this.e = null;
        }
        c cVar3 = this.e;
        if (cVar3 == cVar) {
            switch (this.z) {
                case 0:
                    cVar2 = cVar3.A;
                    break;
                default:
                    cVar2 = cVar3.z;
                    break;
            }
            this.e = cVar2;
        }
        c cVar4 = this.y;
        if (cVar4 == cVar) {
            c cVar5 = this.e;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarC = c(cVar4);
            }
            this.y = cVarC;
        }
    }

    public final c c(c cVar) {
        switch (this.z) {
            case 0:
                return cVar.z;
            default:
                return cVar.A;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.y;
        c cVar2 = this.e;
        this.y = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
        return cVar;
    }
}
