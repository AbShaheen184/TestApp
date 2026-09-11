package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d0 {
    public androidx.compose.ui.graphics.p b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public androidx.compose.ui.graphics.p g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public androidx.compose.ui.graphics.drawscope.h q;
    public final androidx.compose.ui.graphics.j r;
    public androidx.compose.ui.graphics.j s;
    public androidx.compose.ui.graphics.j t;
    public final Object u;

    public i() {
        int i = h0.a;
        this.d = kotlin.collections.u.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        androidx.compose.ui.graphics.j jVarA = androidx.compose.ui.graphics.l.a();
        this.r = jVarA;
        this.s = jVarA;
        this.u = kotlin.a.c(kotlin.i.y, h.z);
    }

    @Override // androidx.compose.ui.graphics.vector.d0
    public final void a(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2;
        androidx.compose.ui.graphics.drawscope.h hVar;
        if (this.n) {
            b.e(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        androidx.compose.ui.graphics.p pVar = this.b;
        if (pVar != null) {
            dVar2 = dVar;
            androidx.compose.ui.graphics.drawscope.d.C(dVar2, this.s, pVar, this.c, null, 56);
        } else {
            dVar2 = dVar;
        }
        androidx.compose.ui.graphics.p pVar2 = this.g;
        if (pVar2 != null) {
            androidx.compose.ui.graphics.drawscope.h hVar2 = this.q;
            if (this.o || hVar2 == null) {
                androidx.compose.ui.graphics.drawscope.h hVar3 = new androidx.compose.ui.graphics.drawscope.h(this.f, this.j, this.h, this.i, 16);
                this.q = hVar3;
                this.o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            androidx.compose.ui.graphics.drawscope.d.C(dVar2, this.s, pVar2, this.e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.h] */
    public final void e() {
        float f = this.k;
        androidx.compose.ui.graphics.j jVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = jVar;
            return;
        }
        if (kotlin.jvm.internal.l.a(this.s, jVar)) {
            this.s = androidx.compose.ui.graphics.l.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r0 = this.u;
        ((androidx.compose.ui.graphics.k) r0.getValue()).a.setPath(jVar != null ? jVar.a : null, false);
        float length = ((androidx.compose.ui.graphics.k) r0.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((androidx.compose.ui.graphics.k) r0.getValue()).a(f4, f5, this.s);
            return;
        }
        androidx.compose.ui.graphics.j jVarA = this.t;
        if (jVarA == null) {
            jVarA = androidx.compose.ui.graphics.l.a();
            this.t = jVarA;
        }
        jVarA.e();
        ((androidx.compose.ui.graphics.k) r0.getValue()).a(f4, length, jVarA);
        androidx.compose.ui.graphics.j.a(this.s, jVarA);
        jVarA.e();
        ((androidx.compose.ui.graphics.k) r0.getValue()).a(0.0f, f5, jVarA);
        androidx.compose.ui.graphics.j.a(this.s, jVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
