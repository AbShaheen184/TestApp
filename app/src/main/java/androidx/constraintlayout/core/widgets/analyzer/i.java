package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.c && !fVar.j) {
            fVar.d((int) ((((f) fVar.l.get(0)).g * ((androidx.constraintlayout.core.widgets.h) this.b).p0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void d() {
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) dVar;
        int i = hVar.q0;
        int i2 = hVar.r0;
        int i3 = hVar.t0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.l.add(dVar.S.d.h);
                this.b.S.d.h.k.add(fVar);
                fVar.f = i;
            } else if (i2 != -1) {
                fVar.l.add(dVar.S.d.i);
                this.b.S.d.i.k.add(fVar);
                fVar.f = -i2;
            } else {
                fVar.b = true;
                fVar.l.add(dVar.S.d.i);
                this.b.S.d.i.k.add(fVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fVar.l.add(dVar.S.e.h);
            this.b.S.e.h.k.add(fVar);
            fVar.f = i;
        } else if (i2 != -1) {
            fVar.l.add(dVar.S.e.i);
            this.b.S.e.i.k.add(fVar);
            fVar.f = -i2;
        } else {
            fVar.b = true;
            fVar.l.add(dVar.S.e.i);
            this.b.S.e.i.k.add(fVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void e() {
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        int i = ((androidx.constraintlayout.core.widgets.h) dVar).t0;
        f fVar = this.h;
        if (i == 1) {
            dVar.X = fVar.g;
        } else {
            dVar.Y = fVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void f() {
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
