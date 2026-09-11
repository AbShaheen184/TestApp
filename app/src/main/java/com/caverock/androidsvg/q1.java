package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements k0 {
    public final ArrayList a;
    public float b;
    public float c;
    public r1 d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public q1(y1 y1Var, androidx.compose.ui.text.android.selection.e eVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (eVar == null) {
            return;
        }
        eVar.r(this);
        if (this.h) {
            this.d.b((r1) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        r1 r1Var = this.d;
        if (r1Var != null) {
            arrayList.add(r1Var);
        }
    }

    @Override // com.caverock.androidsvg.k0
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new r1(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // com.caverock.androidsvg.k0
    public final void b(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((r1) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        r1 r1Var = this.d;
        if (r1Var != null) {
            arrayList.add(r1Var);
        }
        this.b = f;
        this.c = f2;
        this.d = new r1(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // com.caverock.androidsvg.k0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new r1(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // com.caverock.androidsvg.k0
    public final void close() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // com.caverock.androidsvg.k0
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        r1 r1Var = this.d;
        y1.i(r1Var.a, r1Var.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // com.caverock.androidsvg.k0
    public final void e(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        r1 r1Var = this.d;
        this.d = new r1(f, f2, f - r1Var.a, f2 - r1Var.b);
        this.h = false;
    }
}
