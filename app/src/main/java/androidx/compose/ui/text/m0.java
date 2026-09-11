package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final m0 d = new m0(0, 0, null, 0, 0, 0, 16777215);
    public final e0 a;
    public final s b;
    public final w c;

    public m0(long j, long j2, androidx.compose.ui.text.font.l lVar, long j3, int i, long j4, int i2) {
        this(new e0((i2 & 1) != 0 ? androidx.compose.ui.graphics.t.i : j, (i2 & 2) != 0 ? androidx.compose.ui.unit.o.c : j2, (i2 & 4) != 0 ? null : lVar, (androidx.compose.ui.text.font.j) null, (androidx.compose.ui.text.font.k) null, (androidx.compose.ui.text.font.s) null, (String) null, (i2 & 128) != 0 ? androidx.compose.ui.unit.o.c : j3, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.intl.b) null, androidx.compose.ui.graphics.t.i, (androidx.compose.ui.text.style.l) null, (androidx.compose.ui.graphics.m0) null, (v) null), new s((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? androidx.compose.ui.unit.o.c : j4, null, null, null, 0, 0, null), null);
    }

    public static m0 a(m0 m0Var, long j, long j2, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.s sVar, long j3, long j4, androidx.compose.ui.text.style.i iVar, int i) {
        androidx.compose.ui.text.style.o cVar;
        long jB = (i & 1) != 0 ? m0Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? m0Var.a.b : j2;
        androidx.compose.ui.text.font.l lVar2 = (i & 4) != 0 ? m0Var.a.c : lVar;
        e0 e0Var = m0Var.a;
        androidx.compose.ui.text.font.j jVar = e0Var.d;
        androidx.compose.ui.text.font.k kVar = e0Var.e;
        androidx.compose.ui.text.font.s sVar2 = (i & 32) != 0 ? e0Var.f : sVar;
        String str = e0Var.g;
        long j6 = (i & 128) != 0 ? e0Var.h : j3;
        androidx.compose.ui.text.style.a aVar = e0Var.i;
        androidx.compose.ui.text.style.p pVar = e0Var.j;
        androidx.compose.ui.text.intl.b bVar = e0Var.k;
        long j7 = e0Var.l;
        androidx.compose.ui.text.style.l lVar3 = (i & 4096) != 0 ? e0Var.m : androidx.compose.ui.text.style.l.c;
        androidx.compose.ui.graphics.m0 m0Var2 = e0Var.n;
        androidx.compose.ui.graphics.drawscope.e eVar = e0Var.p;
        s sVar3 = m0Var.b;
        int i2 = sVar3.a;
        int i3 = sVar3.b;
        long j8 = (i & 131072) != 0 ? sVar3.c : j4;
        androidx.compose.ui.text.style.q qVar = sVar3.d;
        w wVar = (i & 524288) != 0 ? m0Var.c : androidx.compose.material3.internal.g.a;
        androidx.compose.ui.text.style.i iVar2 = (i & 1048576) != 0 ? sVar3.f : iVar;
        int i4 = sVar3.g;
        int i5 = sVar3.h;
        androidx.compose.ui.text.style.s sVar4 = sVar3.i;
        if (androidx.compose.ui.graphics.t.c(jB, e0Var.a.b())) {
            cVar = e0Var.a;
        } else {
            cVar = jB != 16 ? new androidx.compose.ui.text.style.c(jB) : androidx.compose.ui.text.style.n.a;
        }
        return new m0(new e0(cVar, j5, lVar2, jVar, kVar, sVar2, str, j6, aVar, pVar, bVar, j7, lVar3, m0Var2, wVar != null ? wVar.a : null, eVar), new s(i2, i3, j8, qVar, wVar != null ? wVar.b : null, iVar2, i4, i5, sVar4), wVar);
    }

    public static m0 e(m0 m0Var, long j, long j2, androidx.compose.ui.text.font.l lVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? androidx.compose.ui.unit.o.c : j2;
        androidx.compose.ui.text.font.l lVar2 = (i2 & 4) != 0 ? null : lVar;
        long j6 = (i2 & 128) != 0 ? androidx.compose.ui.unit.o.c : j3;
        long j7 = androidx.compose.ui.graphics.t.i;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? androidx.compose.ui.unit.o.c : j4;
        e0 e0VarA = f0.a(m0Var.a, j, null, Float.NaN, j5, lVar2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        s sVarA = t.a(m0Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (m0Var.a == e0VarA && m0Var.b == sVarA) ? m0Var : new m0(e0VarA, sVarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(m0 m0Var) {
        if (this != m0Var) {
            return kotlin.jvm.internal.l.a(this.b, m0Var.b) && this.a.a(m0Var.a);
        }
        return true;
    }

    public final m0 d(m0 m0Var) {
        return (m0Var == null || m0Var.equals(d)) ? this : new m0(this.a.c(m0Var.a), this.b.a(m0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.l.a(this.a, m0Var.a) && kotlin.jvm.internal.l.a(this.b, m0Var.b) && kotlin.jvm.internal.l.a(this.c, m0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w wVar = this.c;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) androidx.compose.ui.graphics.t.i(b()));
        sb.append(", brush=");
        e0 e0Var = this.a;
        sb.append(e0Var.a.c());
        sb.append(", alpha=");
        sb.append(e0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) androidx.compose.ui.unit.o.d(e0Var.b));
        sb.append(", fontWeight=");
        sb.append(e0Var.c);
        sb.append(", fontStyle=");
        sb.append(e0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(e0Var.e);
        sb.append(", fontFamily=");
        sb.append(e0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(e0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) androidx.compose.ui.unit.o.d(e0Var.h));
        sb.append(", baselineShift=");
        sb.append(e0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(e0Var.j);
        sb.append(", localeList=");
        sb.append(e0Var.k);
        sb.append(", background=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(e0Var.l, ", textDecoration=", sb);
        sb.append(e0Var.m);
        sb.append(", shadow=");
        sb.append(e0Var.n);
        sb.append(", drawStyle=");
        sb.append(e0Var.p);
        sb.append(", textAlign=");
        s sVar = this.b;
        sb.append((Object) androidx.compose.ui.text.style.k.a(sVar.a));
        sb.append(", textDirection=");
        sb.append((Object) androidx.compose.ui.text.style.m.a(sVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) androidx.compose.ui.unit.o.d(sVar.c));
        sb.append(", textIndent=");
        sb.append(sVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(sVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) androidx.compose.ui.text.style.e.a(sVar.g));
        sb.append(", hyphens=");
        sb.append((Object) androidx.compose.ui.text.style.d.a(sVar.h));
        sb.append(", textMotion=");
        sb.append(sVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(e0 e0Var, s sVar) {
        v vVar = e0Var.o;
        u uVar = sVar.e;
        this(e0Var, sVar, (vVar == null && uVar == null) ? null : new w(vVar, uVar));
    }

    public m0(e0 e0Var, s sVar, w wVar) {
        this.a = e0Var;
        this.b = sVar;
        this.c = wVar;
    }
}
