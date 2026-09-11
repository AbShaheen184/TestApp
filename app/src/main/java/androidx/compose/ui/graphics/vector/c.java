package androidx.compose.ui.graphics.vector;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d0 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = androidx.compose.ui.graphics.t.i;
    public List f;
    public boolean g;
    public androidx.compose.ui.graphics.j h;
    public kotlin.jvm.functions.l i;
    public final androidx.compose.animation.e j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public c() {
        int i = h0.a;
        this.f = kotlin.collections.u.e;
        this.g = true;
        this.j = new androidx.compose.animation.e(this, 7);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // androidx.compose.ui.graphics.vector.d0
    public final void a(androidx.compose.ui.graphics.drawscope.d dVar) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = androidx.compose.ui.graphics.f0.a();
                this.b = fArrA;
            } else {
                androidx.compose.ui.graphics.f0.d(fArrA);
            }
            androidx.compose.ui.graphics.f0.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            androidx.compose.ui.graphics.f0.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                androidx.compose.ui.graphics.j jVarA = this.h;
                if (jVarA == null) {
                    jVarA = androidx.compose.ui.graphics.l.a();
                    this.h = jVarA;
                }
                b.e(this.f, jVarA);
            }
            this.g = false;
        }
        c2 c2VarB0 = dVar.b0();
        long jH = c2VarB0.H();
        c2VarB0.w().f();
        try {
            c2 c2Var = (c2) ((com.google.firebase.platforminfo.c) c2VarB0.y).e;
            float[] fArr = this.b;
            if (fArr != null) {
                c2Var.w().j(fArr);
            }
            androidx.compose.ui.graphics.j jVar = this.h;
            if (!this.f.isEmpty() && jVar != null) {
                c2Var.w().a(jVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((d0) arrayList.get(i)).a(dVar);
            }
        } finally {
            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarB0, jH);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.d0
    public final kotlin.jvm.functions.l b() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.vector.d0
    public final void d(androidx.compose.animation.e eVar) {
        this.i = eVar;
    }

    public final void e(int i, d0 d0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, d0Var);
        } else {
            arrayList.add(d0Var);
        }
        g(d0Var);
        d0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = h0.a;
            if (androidx.compose.ui.graphics.t.h(j2) == androidx.compose.ui.graphics.t.h(j) && androidx.compose.ui.graphics.t.g(j2) == androidx.compose.ui.graphics.t.g(j) && androidx.compose.ui.graphics.t.e(j2) == androidx.compose.ui.graphics.t.e(j)) {
                return;
            }
            this.d = false;
            this.e = androidx.compose.ui.graphics.t.i;
        }
    }

    public final void g(d0 d0Var) {
        if (!(d0Var instanceof i)) {
            if (d0Var instanceof c) {
                c cVar = (c) d0Var;
                if (cVar.d && this.d) {
                    f(cVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = androidx.compose.ui.graphics.t.i;
                    return;
                }
            }
            return;
        }
        i iVar = (i) d0Var;
        androidx.compose.ui.graphics.p pVar = iVar.b;
        if (this.d && pVar != null) {
            if (pVar instanceof p0) {
                f(((p0) pVar).a);
            } else {
                this.d = false;
                this.e = androidx.compose.ui.graphics.t.i;
            }
        }
        androidx.compose.ui.graphics.p pVar2 = iVar.g;
        if (this.d && pVar2 != null) {
            if (pVar2 instanceof p0) {
                f(((p0) pVar2).a);
            } else {
                this.d = false;
                this.e = androidx.compose.ui.graphics.t.i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d0 d0Var = (d0) arrayList.get(i);
            sb.append("\t");
            sb.append(d0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
