package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {
    public e0 a;
    public a b;
    public t0 c;
    public org.jsoup.nodes.g d;
    public ArrayList e;
    public String f;
    public r0 g;
    public d0 h;
    public g0 i;
    public n0 j;
    public final m0 k = new m0(3, this);

    public abstract List a();

    public final org.jsoup.nodes.j b() {
        int size = this.e.size();
        return size > 0 ? (org.jsoup.nodes.j) this.e.get(size - 1) : this.d;
    }

    public final boolean c(String str) {
        org.jsoup.nodes.j jVarB;
        if (this.e.size() == 0 || (jVarB = b()) == null) {
            return false;
        }
        f0 f0Var = jVarB.A;
        return f0Var.z.equals(str) && f0Var.e.equals("http://www.w3.org/1999/xhtml");
    }

    public int d() {
        return 512;
    }

    public String e() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract d0 f();

    public g0 g() {
        return new g0(g0.d, null);
    }

    public final void h(String str, Object... objArr) {
        c0 c0Var = this.a.y;
        if (c0Var.b()) {
            c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(this.b, str, objArr));
        }
    }

    public void i(Reader reader, String str, e0 e0Var) {
        org.jsoup.helper.n.I(str, "baseUri");
        org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(e0Var.e.e(), str);
        this.d = gVar;
        gVar.H = e0Var;
        this.a = e0Var;
        this.h = e0Var.z;
        a aVar = new a(reader);
        this.b = aVar;
        c0 c0Var = e0Var.y;
        c0Var.getClass();
        aVar.G = null;
        c0Var.getClass();
        this.c = new t0(this);
        this.e = new ArrayList(32);
        this.i = e0Var.b();
        n0 n0Var = new n0(2, this);
        this.j = n0Var;
        this.g = n0Var;
        this.f = str;
    }

    public abstract void j();

    public abstract m3 k();

    public org.jsoup.nodes.j l() {
        return (org.jsoup.nodes.j) this.e.remove(this.e.size() - 1);
    }

    public abstract boolean m(r0 r0Var);

    public final boolean n(String str) {
        r0 r0Var = this.g;
        m0 m0Var = this.k;
        if (r0Var == m0Var) {
            m0 m0Var2 = new m0(3, this);
            m0Var2.j(str);
            return m(m0Var2);
        }
        m0Var.f();
        m0Var.j(str);
        return m(m0Var);
    }

    public final void o(String str) {
        n0 n0Var = this.j;
        if (this.g == n0Var) {
            n0 n0Var2 = new n0(2, this);
            n0Var2.j(str);
            m(n0Var2);
        } else {
            n0Var.f();
            n0Var.j(str);
            m(n0Var);
        }
    }

    public final void p() {
        while (true) {
            if (this.g.a == 7) {
                ArrayList arrayList = this.e;
                if (arrayList == null) {
                    break;
                } else if (arrayList.isEmpty()) {
                    this.e = null;
                } else {
                    l();
                }
            } else {
                t0 t0Var = this.c;
                i0 i0Var = t0Var.k;
                while (!t0Var.e) {
                    t0Var.c.f(t0Var, t0Var.a);
                }
                boolean zS = i0Var.d.s();
                r0 r0Var = i0Var;
                if (!zS) {
                    t0Var.e = false;
                    r0Var = t0Var.d;
                }
                this.g = r0Var;
                m(r0Var);
                r0Var.f();
            }
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.close();
        this.b = null;
        this.c = null;
        this.e = null;
    }

    public final f0 q(n0 n0Var) {
        return this.i.d(n0Var.d.E(), n0Var.e, e(), this.h.a);
    }
}
