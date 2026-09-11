package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public int b;
    public boolean c;
    public final d d;
    public final int e;
    public c f;
    public androidx.constraintlayout.core.h i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i2, boolean z) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z && !i(cVar)) {
            return false;
        }
        this.f = cVar;
        if (cVar.a == null) {
            cVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f) == null || cVar.d.f0 != 8) ? this.g : i;
    }

    public final c f() {
        int i = this.e;
        int iE = androidx.constraintlayout.core.g.e(i);
        d dVar = this.d;
        switch (iE) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.J;
            case 2:
                return dVar.K;
            case 3:
                return dVar.H;
            case 4:
                return dVar.I;
            default:
                net.luminis.tls.engine.impl.c.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.B(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0062 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.d;
            int i = cVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (androidx.constraintlayout.core.g.e(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(dVar instanceof h)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(dVar instanceof h)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        net.luminis.tls.engine.impl.c.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.B(i2));
                        return false;
                }
            } else if (i2 != 6 || (dVar.D && this.d.D)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f;
        if (cVar != null && (hashSet = cVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        androidx.constraintlayout.core.h hVar = this.i;
        if (hVar == null) {
            this.i = new androidx.constraintlayout.core.h(1);
        } else {
            hVar.e();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.B(this.e);
    }
}
