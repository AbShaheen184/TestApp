package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.text.input.d0;
import androidx.compose.ui.text.input.e0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.node.j implements u1 {
    public e0 N;
    public androidx.compose.ui.text.input.x O;
    public r0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public androidx.compose.ui.text.input.q T;
    public c1 U;
    public androidx.compose.ui.text.input.k V;
    public y W;

    public static void O0(r0 r0Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        d0 d0Var = r0Var.e;
        androidx.compose.foundation.text.s sVar = r0Var.v;
        if (d0Var == null) {
            int length = str.length();
            sVar.invoke(new androidx.compose.ui.text.input.x(4, androidx.compose.ui.text.d0.b(length, length), str));
        } else {
            androidx.compose.ui.text.input.x xVarJ = r0Var.d.j(com.google.common.base.c.q(new androidx.compose.ui.text.input.d(), new androidx.compose.ui.text.input.a(str, 1)));
            d0Var.a(null, xVarJ);
            sVar.invoke(xVarJ);
        }
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        boolean z = this.S;
        androidx.compose.ui.text.g gVar = this.O.a;
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.E;
        kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
        kotlin.reflect.j jVar = jVarArr2[18];
        xVar.b(wVar, gVar);
        androidx.compose.ui.text.g gVar2 = this.N.a;
        androidx.compose.ui.semantics.w wVar2 = androidx.compose.ui.semantics.t.F;
        kotlin.reflect.j jVar2 = jVarArr2[19];
        xVar.b(wVar2, gVar2);
        long j = this.O.b;
        androidx.compose.ui.semantics.w wVar3 = androidx.compose.ui.semantics.t.G;
        kotlin.reflect.j jVar3 = jVarArr2[20];
        xVar.b(wVar3, new l0(j));
        androidx.compose.ui.semantics.w wVar4 = androidx.compose.ui.semantics.t.r;
        kotlin.reflect.j jVar4 = jVarArr2[9];
        xVar.b(wVar4, androidx.compose.ui.autofill.n.a);
        androidx.compose.ui.autofill.g gVarI = androidx.media3.common.audio.h.i(this.O.a);
        if (gVarI != null) {
            androidx.compose.ui.semantics.w wVar5 = androidx.compose.ui.semantics.t.s;
            kotlin.reflect.j jVar5 = jVarArr2[10];
            xVar.b(wVar5, gVarI);
        }
        boolean z2 = false;
        androidx.compose.ui.semantics.v.b(xVar, new h(this, 0));
        int i = this.V.d;
        if (i == 6) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar = androidx.compose.ui.autofill.o.c;
            androidx.compose.ui.semantics.w wVar6 = androidx.compose.ui.semantics.t.q;
            kotlin.reflect.j jVar6 = jVarArr2[8];
            xVar.b(wVar6, fVar);
        } else if (i == 7 || i == 8) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar2 = androidx.compose.ui.autofill.o.b;
            androidx.compose.ui.semantics.w wVar7 = androidx.compose.ui.semantics.t.q;
            kotlin.reflect.j jVar7 = jVarArr2[8];
            xVar.b(wVar7, fVar2);
        } else if (i == 4) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar3 = androidx.compose.ui.autofill.o.d;
            androidx.compose.ui.semantics.w wVar8 = androidx.compose.ui.semantics.t.q;
            kotlin.reflect.j jVar8 = jVarArr2[8];
            xVar.b(wVar8, fVar3);
        }
        boolean z3 = this.R;
        kotlin.y yVar = kotlin.y.a;
        if (!z3) {
            xVar.b(androidx.compose.ui.semantics.t.i, yVar);
        }
        if (z) {
            xVar.b(androidx.compose.ui.semantics.t.K, yVar);
        }
        if (this.R && !this.Q) {
            z2 = true;
        }
        androidx.compose.ui.semantics.w wVar9 = androidx.compose.ui.semantics.t.N;
        kotlin.reflect.j jVar9 = jVarArr2[26];
        xVar.b(wVar9, Boolean.valueOf(z2));
        androidx.compose.ui.semantics.v.a(xVar, new h(this, 1));
        if (z2) {
            xVar.b(androidx.compose.ui.semantics.k.k, new androidx.compose.ui.semantics.a(null, new h(this, 2)));
            xVar.b(androidx.compose.ui.semantics.k.o, new androidx.compose.ui.semantics.a(null, new h(this, xVar)));
        }
        xVar.b(androidx.compose.ui.semantics.k.j, new androidx.compose.ui.semantics.a(null, new androidx.compose.foundation.gestures.y(this, 3)));
        int i2 = this.V.e;
        g gVar3 = new g(this, 6);
        xVar.b(androidx.compose.ui.semantics.t.H, new androidx.compose.ui.text.input.j(i2));
        xVar.b(androidx.compose.ui.semantics.k.p, new androidx.compose.ui.semantics.a(null, gVar3));
        xVar.b(androidx.compose.ui.semantics.k.b, new androidx.compose.ui.semantics.a(null, new g(this, 7)));
        xVar.b(androidx.compose.ui.semantics.k.c, new androidx.compose.ui.semantics.a(null, new g(this, 1)));
        if (!l0.c(this.O.b) && !z) {
            xVar.b(androidx.compose.ui.semantics.k.q, new androidx.compose.ui.semantics.a(null, new g(this, 2)));
            if (this.R && !this.Q) {
                xVar.b(androidx.compose.ui.semantics.k.r, new androidx.compose.ui.semantics.a(null, new g(this, 3)));
            }
        }
        if (!this.R || this.Q) {
            return;
        }
        xVar.b(androidx.compose.ui.semantics.k.s, new androidx.compose.ui.semantics.a(null, new g(this, 5)));
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean t0() {
        return true;
    }
}
