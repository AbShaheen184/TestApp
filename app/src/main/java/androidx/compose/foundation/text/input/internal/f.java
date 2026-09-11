package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.text.input.e0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends w0 {
    public final e0 b;
    public final androidx.compose.ui.text.input.x c;
    public final r0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final androidx.compose.ui.text.input.q h;
    public final c1 i;
    public final androidx.compose.ui.text.input.k j;
    public final y k;

    public f(e0 e0Var, androidx.compose.ui.text.input.x xVar, r0 r0Var, boolean z, boolean z2, boolean z3, androidx.compose.ui.text.input.q qVar, c1 c1Var, androidx.compose.ui.text.input.k kVar, y yVar) {
        this.b = e0Var;
        this.c = xVar;
        this.d = r0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = qVar;
        this.i = c1Var;
        this.j = kVar;
        this.k = yVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        i iVar = new i();
        iVar.N = this.b;
        iVar.O = this.c;
        iVar.P = this.d;
        iVar.Q = this.e;
        iVar.R = this.f;
        iVar.S = this.g;
        iVar.T = this.h;
        c1 c1Var = this.i;
        iVar.U = c1Var;
        iVar.V = this.j;
        iVar.W = this.k;
        c1Var.g = new g(iVar, 4);
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b.equals(fVar.b) && this.c.equals(fVar.c) && this.d.equals(fVar.d) && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && kotlin.jvm.internal.l.a(this.h, fVar.h) && this.i.equals(fVar.i) && kotlin.jvm.internal.l.a(this.j, fVar.j) && kotlin.jvm.internal.l.a(this.k, fVar.k);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        i iVar = (i) qVar;
        boolean z = iVar.R;
        boolean z2 = false;
        boolean z3 = z && !iVar.Q;
        boolean z4 = iVar.S;
        androidx.compose.ui.text.input.k kVar = iVar.V;
        c1 c1Var = iVar.U;
        boolean z5 = this.e;
        boolean z6 = this.f;
        if (z6 && !z5) {
            z2 = true;
        }
        iVar.N = this.b;
        androidx.compose.ui.text.input.x xVar = this.c;
        iVar.O = xVar;
        iVar.P = this.d;
        iVar.Q = z5;
        iVar.R = z6;
        iVar.T = this.h;
        c1 c1Var2 = this.i;
        iVar.U = c1Var2;
        androidx.compose.ui.text.input.k kVar2 = this.j;
        iVar.V = kVar2;
        iVar.W = this.k;
        if (z6 != z || z2 != z3 || !kotlin.jvm.internal.l.a(kVar2, kVar) || this.g != z4 || !l0.c(xVar.b)) {
            androidx.compose.ui.node.k.l(iVar);
        }
        if (c1Var2.equals(c1Var)) {
            return;
        }
        c1Var2.g = new g(iVar, 0);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.b + ", value=" + this.c + ", state=" + this.d + ", readOnly=" + this.e + ", enabled=" + this.f + ", isPassword=" + this.g + ", offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ')';
    }
}
