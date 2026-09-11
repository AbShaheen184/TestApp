package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.n0;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.r;
import androidx.compose.ui.unit.m;
import kotlin.collections.u;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public String a;
    public m0 b;
    public androidx.compose.ui.text.font.d c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public androidx.compose.ui.unit.c i;
    public androidx.compose.ui.text.a j;
    public boolean k;
    public long l;
    public b m;
    public r n;
    public m o;
    public long s;
    public long h = a.a;
    public long p = androidx.compose.ui.unit.b.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public d(String str, m0 m0Var, androidx.compose.ui.text.font.d dVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = m0Var;
        this.c = dVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public static long f(d dVar, long j, m mVar) {
        int i;
        m0 m0Var = dVar.b;
        b bVar = dVar.m;
        androidx.compose.ui.unit.c cVar = dVar.i;
        cVar.getClass();
        androidx.compose.ui.text.font.d dVar2 = dVar.c;
        if ((bVar == null || mVar != bVar.a || !d0.h(m0Var, mVar).equals(bVar.b) || cVar.a() != bVar.c.e || dVar2 != bVar.d) && ((bVar = b.h) == null || mVar != bVar.a || !d0.h(m0Var, mVar).equals(bVar.b) || cVar.a() != bVar.c.e || dVar2 != bVar.d)) {
            bVar = new b(mVar, d0.h(m0Var, mVar), new androidx.compose.ui.unit.d(cVar.a(), cVar.T()), dVar2);
            b.h = bVar;
        }
        dVar.m = bVar;
        int i2 = dVar.g;
        androidx.compose.ui.unit.d dVar3 = bVar.c;
        float f = bVar.g;
        float f2 = bVar.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float fB = d0.a(c.a, bVar.e, androidx.compose.ui.unit.b.b(0, 0, 15), dVar3, bVar.d, 1, 96).b();
            float fB2 = d0.a(c.b, bVar.e, androidx.compose.ui.unit.b.b(0, 0, 15), dVar3, bVar.d, 2, 96).b() - fB;
            bVar.g = fB;
            bVar.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i2 != 1) {
            int iRound = Math.round((f2 * (i2 - 1)) + f);
            i = iRound >= 0 ? iRound : 0;
            int iG = androidx.compose.ui.unit.a.g(j);
            if (i > iG) {
                i = iG;
            }
        } else {
            i = androidx.compose.ui.unit.a.i(j);
        }
        return androidx.compose.ui.unit.b.a(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j), i, androidx.compose.ui.unit.a.g(j));
    }

    public final int a(int i, m mVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = androidx.compose.ui.unit.b.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, mVar);
        }
        r rVarE = e(mVar);
        long jM = n.m(jA, this.e, this.d, rVarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iJ = n0.j(new androidx.compose.ui.text.a((androidx.compose.ui.text.platform.d) rVarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM).b());
        int i6 = androidx.compose.ui.unit.a.i(jA);
        if (iJ < i6) {
            iJ = i6;
        }
        this.q = i;
        this.r = iJ;
        return iJ;
    }

    public final boolean b(long j, m mVar) {
        r rVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, mVar) : j;
        androidx.compose.ui.text.a aVar = this.j;
        boolean z2 = false;
        if (aVar != null && (rVar = this.n) != null && !rVar.a() && mVar == this.o && (androidx.compose.ui.unit.a.b(jF, this.p) || (androidx.compose.ui.unit.a.h(jF) == androidx.compose.ui.unit.a.h(this.p) && androidx.compose.ui.unit.a.j(jF) == androidx.compose.ui.unit.a.j(this.p) && androidx.compose.ui.unit.a.g(jF) >= aVar.b() && !aVar.d.d))) {
            if (!androidx.compose.ui.unit.a.b(jF, this.p)) {
                androidx.compose.ui.text.a aVar2 = this.j;
                aVar2.getClass();
                long jD = androidx.compose.ui.unit.b.d(jF, (((long) n0.j(Math.min(aVar2.a.F.c(), aVar2.d()))) << 32) | (((long) n0.j(aVar2.b())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= aVar2.d() && ((int) (4294967295L & jD)) >= aVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        r rVarE = e(mVar);
        long jM = n.m(jF, this.e, this.d, rVarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        androidx.compose.ui.text.a aVar3 = new androidx.compose.ui.text.a((androidx.compose.ui.text.platform.d) rVarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM);
        this.p = jF;
        long jD2 = androidx.compose.ui.unit.b.d(jF, (((long) n0.j(aVar3.b())) & 4294967295L) | (((long) n0.j(aVar3.d())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < aVar3.d() || ((int) (jD2 & 4294967295L)) < aVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = aVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = androidx.compose.ui.unit.b.h(0, 0, 0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void d(androidx.compose.ui.unit.c cVar) {
        long jA;
        androidx.compose.ui.unit.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.b;
            jA = a.a(cVar.a(), cVar.T());
        } else {
            jA = a.a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.h = jA;
        } else if (cVar == null || this.h != jA) {
            this.i = cVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final r e(m mVar) {
        r dVar = this.n;
        if (dVar == null || mVar != this.o || dVar.a()) {
            this.o = mVar;
            String str = this.a;
            m0 m0VarH = d0.h(this.b, mVar);
            androidx.compose.ui.unit.c cVar = this.i;
            cVar.getClass();
            androidx.compose.ui.text.font.d dVar2 = this.c;
            u uVar = u.e;
            dVar = new androidx.compose.ui.text.platform.d(str, m0VarH, uVar, uVar, dVar2, cVar);
        }
        this.n = dVar;
        return dVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.h));
        sb.append(", history=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.s, ", constraints=$)", sb);
    }
}
