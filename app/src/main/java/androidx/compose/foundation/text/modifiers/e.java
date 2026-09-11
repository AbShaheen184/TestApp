package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.node.k;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import androidx.compose.ui.text.m0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w0 {
    public final String b;
    public final m0 c;
    public final androidx.compose.ui.text.font.d d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public e(String str, m0 m0Var, androidx.compose.ui.text.font.d dVar, int i, boolean z, int i2, int i3) {
        this.b = str;
        this.c = m0Var;
        this.d = dVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        h hVar = new h();
        hVar.L = this.b;
        hVar.M = this.c;
        hVar.N = this.d;
        hVar.O = this.e;
        hVar.P = this.f;
        hVar.Q = this.g;
        hVar.R = this.h;
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.b, eVar.b) && l.a(this.c, eVar.c) && l.a(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        androidx.compose.ui.text.font.d dVar;
        androidx.compose.ui.text.font.d dVar2;
        int i5;
        int i6;
        h hVar = (h) qVar;
        hVar.getClass();
        m0 m0Var = hVar.M;
        boolean z5 = false;
        boolean z6 = true;
        m0 m0Var2 = this.c;
        if (m0Var2 != m0Var) {
            if (!m0Var2.a.b(m0Var.a)) {
                z = true;
            }
            str = hVar.L;
            str2 = this.b;
            if (!l.a(str, str2)) {
                hVar.L = str2;
                hVar.V = null;
                z5 = true;
            }
            z2 = !hVar.M.c(m0Var2);
            hVar.M = m0Var2;
            i = hVar.R;
            i2 = this.h;
            if (i != i2) {
                hVar.R = i2;
                z2 = true;
            }
            i3 = hVar.Q;
            i4 = this.g;
            if (i3 != i4) {
                hVar.Q = i4;
                z2 = true;
            }
            z3 = hVar.P;
            z4 = this.f;
            if (z3 != z4) {
                hVar.P = z4;
                z2 = true;
            }
            dVar = hVar.N;
            dVar2 = this.d;
            if (!l.a(dVar, dVar2)) {
                hVar.N = dVar2;
                z2 = true;
            }
            i5 = hVar.O;
            i6 = this.e;
            if (i5 == i6) {
                z6 = z2;
            } else {
                hVar.O = i6;
            }
            if (z5 || z6) {
                d dVarL0 = hVar.L0();
                String str3 = hVar.L;
                m0 m0Var3 = hVar.M;
                androidx.compose.ui.text.font.d dVar3 = hVar.N;
                int i7 = hVar.O;
                boolean z7 = hVar.P;
                int i8 = hVar.Q;
                int i9 = hVar.R;
                dVarL0.a = str3;
                dVarL0.b = m0Var3;
                dVarL0.c = dVar3;
                dVarL0.d = i7;
                dVarL0.e = z7;
                dVarL0.f = i8;
                dVarL0.g = i9;
                dVarL0.s = (dVarL0.s << 2) | 2;
                dVarL0.c();
            }
            if (hVar.K) {
                if (z5 || (z && hVar.U != null)) {
                    k.l(hVar);
                }
                if (z5 || z6) {
                    k.k(hVar);
                    k.j(hVar);
                }
                if (z) {
                    k.j(hVar);
                }
            }
            return;
        }
        m0Var2.getClass();
        z = false;
        str = hVar.L;
        str2 = this.b;
        if (!l.a(str, str2)) {
            hVar.L = str2;
            hVar.V = null;
            z5 = true;
        }
        z2 = !hVar.M.c(m0Var2);
        hVar.M = m0Var2;
        i = hVar.R;
        i2 = this.h;
        if (i != i2) {
            hVar.R = i2;
            z2 = true;
        }
        i3 = hVar.Q;
        i4 = this.g;
        if (i3 != i4) {
            hVar.Q = i4;
            z2 = true;
        }
        z3 = hVar.P;
        z4 = this.f;
        if (z3 != z4) {
            hVar.P = z4;
            z2 = true;
        }
        dVar = hVar.N;
        dVar2 = this.d;
        if (!l.a(dVar, dVar2)) {
            hVar.N = dVar2;
            z2 = true;
        }
        i5 = hVar.O;
        i6 = this.e;
        if (i5 == i6) {
            z6 = z2;
        } else {
            hVar.O = i6;
        }
        if (z5) {
            d dVarL1 = hVar.L0();
            String str4 = hVar.L;
            m0 m0Var4 = hVar.M;
            androidx.compose.ui.text.font.d dVar4 = hVar.N;
            int i10 = hVar.O;
            boolean z8 = hVar.P;
            int i11 = hVar.Q;
            int i12 = hVar.R;
            dVarL1.a = str4;
            dVarL1.b = m0Var4;
            dVarL1.c = dVar4;
            dVarL1.d = i10;
            dVarL1.e = z8;
            dVarL1.f = i11;
            dVarL1.g = i12;
            dVarL1.s = (dVarL1.s << 2) | 2;
            dVarL1.c();
        } else {
            d dVarL2 = hVar.L0();
            String str5 = hVar.L;
            m0 m0Var5 = hVar.M;
            androidx.compose.ui.text.font.d dVar5 = hVar.N;
            int i13 = hVar.O;
            boolean z9 = hVar.P;
            int i14 = hVar.Q;
            int i15 = hVar.R;
            dVarL2.a = str5;
            dVarL2.b = m0Var5;
            dVarL2.c = dVar5;
            dVarL2.d = i13;
            dVarL2.e = z9;
            dVarL2.f = i14;
            dVarL2.g = i15;
            dVarL2.s = (dVarL2.s << 2) | 2;
            dVarL2.c();
        }
        if (hVar.K) {
            return;
        }
        if (z5) {
            k.l(hVar);
        } else {
            k.l(hVar);
        }
        if (z5) {
            k.k(hVar);
            k.j(hVar);
        } else {
            k.k(hVar);
            k.j(hVar);
        }
        if (z) {
            k.j(hVar);
        }
    }

    public final int hashCode() {
        return (((androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.e, (this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b.hashCode() * 31, 31, this.c)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
    }
}
