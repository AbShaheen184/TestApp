package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.b;
        int i = aVar.r0;
        f fVar = this.h;
        Iterator it = fVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + aVar.t0);
        } else {
            fVar.d(i2 + aVar.t0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void d() {
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        if (dVar instanceof androidx.constraintlayout.core.widgets.a) {
            f fVar = this.h;
            fVar.b = true;
            ArrayList arrayList = fVar.l;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) dVar;
            int i = aVar.r0;
            boolean z = aVar.s0;
            int i2 = 0;
            if (i == 0) {
                fVar.e = 4;
                while (i2 < aVar.q0) {
                    androidx.constraintlayout.core.widgets.d dVar2 = aVar.p0[i2];
                    if (z || dVar2.f0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                fVar.e = 5;
                while (i2 < aVar.q0) {
                    androidx.constraintlayout.core.widgets.d dVar3 = aVar.p0[i2];
                    if (z || dVar3.f0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                fVar.e = 6;
                while (i2 < aVar.q0) {
                    androidx.constraintlayout.core.widgets.d dVar4 = aVar.p0[i2];
                    if (z || dVar4.f0 != 8) {
                        f fVar4 = dVar4.e.h;
                        fVar4.k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.e = 7;
            while (i2 < aVar.q0) {
                androidx.constraintlayout.core.widgets.d dVar5 = aVar.p0[i2];
                if (z || dVar5.f0 != 8) {
                    f fVar5 = dVar5.e.i;
                    fVar5.k.add(fVar);
                    arrayList.add(fVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void e() {
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        if (dVar instanceof androidx.constraintlayout.core.widgets.a) {
            int i = ((androidx.constraintlayout.core.widgets.a) dVar).r0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.X = fVar.g;
            } else {
                dVar.Y = fVar.g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.k.add(fVar);
        fVar.l.add(fVar2);
    }
}
