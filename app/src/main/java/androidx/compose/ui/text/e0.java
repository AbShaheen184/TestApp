package androidx.compose.ui.text;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements b {
    public final androidx.compose.ui.text.style.o a;
    public final long b;
    public final androidx.compose.ui.text.font.l c;
    public final androidx.compose.ui.text.font.j d;
    public final androidx.compose.ui.text.font.k e;
    public final androidx.compose.ui.text.font.s f;
    public final String g;
    public final long h;
    public final androidx.compose.ui.text.style.a i;
    public final androidx.compose.ui.text.style.p j;
    public final androidx.compose.ui.text.intl.b k;
    public final long l;
    public final androidx.compose.ui.text.style.l m;
    public final androidx.compose.ui.graphics.m0 n;
    public final v o;
    public final androidx.compose.ui.graphics.drawscope.e p;

    public e0(long j, long j2, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.s sVar, String str, long j3, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.p pVar, androidx.compose.ui.text.intl.b bVar, long j4, androidx.compose.ui.text.style.l lVar2, androidx.compose.ui.graphics.m0 m0Var, int i) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.t.i : j, (i & 2) != 0 ? androidx.compose.ui.unit.o.c : j2, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : jVar, (i & 16) != 0 ? null : kVar, (i & 32) != 0 ? null : sVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.o.c : j3, (i & LibretroCore.SCREEN_WIDTH) != 0 ? null : aVar, (i & 512) != 0 ? null : pVar, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : bVar, (i & 2048) != 0 ? androidx.compose.ui.graphics.t.i : j4, (i & 4096) != 0 ? null : lVar2, (i & 8192) != 0 ? null : m0Var, (v) null);
    }

    public final boolean a(e0 e0Var) {
        if (this == e0Var) {
            return true;
        }
        return androidx.compose.ui.unit.o.a(this.b, e0Var.b) && kotlin.jvm.internal.l.a(this.c, e0Var.c) && kotlin.jvm.internal.l.a(this.d, e0Var.d) && kotlin.jvm.internal.l.a(this.e, e0Var.e) && kotlin.jvm.internal.l.a(this.f, e0Var.f) && kotlin.jvm.internal.l.a(this.g, e0Var.g) && androidx.compose.ui.unit.o.a(this.h, e0Var.h) && kotlin.jvm.internal.l.a(this.i, e0Var.i) && kotlin.jvm.internal.l.a(this.j, e0Var.j) && kotlin.jvm.internal.l.a(this.k, e0Var.k) && androidx.compose.ui.graphics.t.c(this.l, e0Var.l) && kotlin.jvm.internal.l.a(this.o, e0Var.o);
    }

    public final boolean b(e0 e0Var) {
        return kotlin.jvm.internal.l.a(this.a, e0Var.a) && kotlin.jvm.internal.l.a(this.m, e0Var.m) && kotlin.jvm.internal.l.a(this.n, e0Var.n) && kotlin.jvm.internal.l.a(this.p, e0Var.p);
    }

    public final e0 c(e0 e0Var) {
        if (e0Var == null) {
            return this;
        }
        androidx.compose.ui.text.style.o oVar = e0Var.a;
        return f0.a(this, oVar.b(), oVar.c(), oVar.a(), e0Var.b, e0Var.c, e0Var.d, e0Var.e, e0Var.f, e0Var.g, e0Var.h, e0Var.i, e0Var.j, e0Var.k, e0Var.l, e0Var.m, e0Var.n, e0Var.o, e0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return a(e0Var) && b(e0Var);
    }

    public final int hashCode() {
        androidx.compose.ui.text.style.o oVar = this.a;
        long jB = oVar.b();
        int i = androidx.compose.ui.graphics.t.j;
        int iHashCode = Long.hashCode(jB) * 31;
        androidx.compose.ui.graphics.p pVarC = oVar.c();
        int iHashCode2 = (Float.hashCode(oVar.a()) + ((iHashCode + (pVarC != null ? pVarC.hashCode() : 0)) * 31)) * 31;
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(iHashCode2, 31, this.b);
        androidx.compose.ui.text.font.l lVar = this.c;
        int i2 = (iC + (lVar != null ? lVar.e : 0)) * 31;
        androidx.compose.ui.text.font.j jVar = this.d;
        int iHashCode3 = (i2 + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31;
        androidx.compose.ui.text.font.k kVar = this.e;
        int iHashCode4 = (iHashCode3 + (kVar != null ? Integer.hashCode(kVar.a) : 0)) * 31;
        androidx.compose.ui.text.font.s sVar = this.f;
        int iHashCode5 = (iHashCode4 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = androidx.privacysandbox.ads.adservices.java.internal.a.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        androidx.compose.ui.text.style.a aVar = this.i;
        int iHashCode6 = (iC2 + (aVar != null ? Float.hashCode(aVar.a) : 0)) * 31;
        androidx.compose.ui.text.style.p pVar = this.j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        androidx.compose.ui.text.intl.b bVar = this.k;
        int iC3 = androidx.privacysandbox.ads.adservices.java.internal.a.c((iHashCode7 + (bVar != null ? bVar.e.hashCode() : 0)) * 31, 31, this.l);
        androidx.compose.ui.text.style.l lVar2 = this.m;
        int i3 = (iC3 + (lVar2 != null ? lVar2.a : 0)) * 31;
        androidx.compose.ui.graphics.m0 m0Var = this.n;
        int iHashCode8 = (i3 + (m0Var != null ? m0Var.hashCode() : 0)) * 31;
        v vVar = this.o;
        int iHashCode9 = (iHashCode8 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.drawscope.e eVar = this.p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        androidx.compose.ui.text.style.o oVar = this.a;
        sb.append((Object) androidx.compose.ui.graphics.t.i(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) androidx.compose.ui.unit.o.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) androidx.compose.ui.unit.o.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public e0(androidx.compose.ui.text.style.o oVar, long j, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.s sVar, String str, long j2, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.p pVar, androidx.compose.ui.text.intl.b bVar, long j3, androidx.compose.ui.text.style.l lVar2, androidx.compose.ui.graphics.m0 m0Var, v vVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.a = oVar;
        this.b = j;
        this.c = lVar;
        this.d = jVar;
        this.e = kVar;
        this.f = sVar;
        this.g = str;
        this.h = j2;
        this.i = aVar;
        this.j = pVar;
        this.k = bVar;
        this.l = j3;
        this.m = lVar2;
        this.n = m0Var;
        this.o = vVar;
        this.p = eVar;
    }

    public e0(long j, long j2, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.s sVar, String str, long j3, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.p pVar, androidx.compose.ui.text.intl.b bVar, long j4, androidx.compose.ui.text.style.l lVar2, androidx.compose.ui.graphics.m0 m0Var, v vVar) {
        this(j != 16 ? new androidx.compose.ui.text.style.c(j) : androidx.compose.ui.text.style.n.a, j2, lVar, jVar, kVar, sVar, str, j3, aVar, pVar, bVar, j4, lVar2, m0Var, vVar, null);
    }
}
