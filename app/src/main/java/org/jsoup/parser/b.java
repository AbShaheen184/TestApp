package org.jsoup.parser;

import com.app.mlounge.emulator.LibretroCore;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m3 {
    public b0 l;
    public b0 m;
    public boolean n;
    public org.jsoup.nodes.j o;
    public org.jsoup.nodes.m p;
    public org.jsoup.nodes.j q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;
    public m0 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final String[] y = {null};
    public static final String[] z = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};
    public static final String[] A = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] B = {"desc", "foreignobject", "title"};
    public static final String[] C = {"ol", "ul"};
    public static final String[] D = {"button"};
    public static final String[] E = {"html", "table"};
    public static final String[] F = {"optgroup", "option"};
    public static final String[] G = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] H = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] I = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
    public static final String[] J = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] K = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] L = {"desc", "foreignObject", "title"};
    public static final String[] M = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    public static boolean P(org.jsoup.nodes.j jVar) {
        f0 f0Var = jVar.A;
        String str = f0Var.e;
        String str2 = f0Var.z;
        str.getClass();
        switch (str) {
            case "http://www.w3.org/1999/xhtml":
                return org.jsoup.internal.k.d(str2, I);
            case "http://www.w3.org/2000/svg":
                return org.jsoup.internal.k.d(str2, L);
            case "http://www.w3.org/1998/Math/MathML":
                return org.jsoup.internal.k.d(str2, J);
            default:
                return false;
        }
    }

    public static boolean R(ArrayList arrayList, org.jsoup.nodes.j jVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((org.jsoup.nodes.j) arrayList.get(i)) == jVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void A(String str) {
        while (org.jsoup.internal.k.d(b().A.z, G)) {
            if (str != null && c(str)) {
                return;
            } else {
                l();
            }
        }
    }

    public final void B(boolean z2) {
        String[] strArr = z2 ? H : G;
        while ("http://www.w3.org/1999/xhtml".equals(b().A.e) && org.jsoup.internal.k.d(b().A.z, strArr)) {
            l();
        }
    }

    public final org.jsoup.nodes.j C(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) this.e.get(i);
            f0 f0Var = jVar.A;
            if (f0Var.z.equals(str) && f0Var.e.equals("http://www.w3.org/1999/xhtml")) {
                return jVar;
            }
            i--;
        }
        return null;
    }

    public final boolean D(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return G(strArr, z, D);
    }

    public final boolean E(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return G(strArr, z, null);
    }

    public final boolean F(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((org.jsoup.nodes.j) this.e.get(size)).A.z;
            if (str2.equals(str)) {
                return true;
            }
            if (!org.jsoup.internal.k.d(str2, F)) {
                return false;
            }
        }
        return false;
    }

    public final boolean G(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            f0 f0Var = ((org.jsoup.nodes.j) this.e.get(size)).A;
            String str = f0Var.z;
            String str2 = f0Var.e;
            if (str2.equals("http://www.w3.org/1999/xhtml")) {
                if (org.jsoup.internal.k.d(str, strArr)) {
                    return true;
                }
                if (org.jsoup.internal.k.d(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && org.jsoup.internal.k.d(str, strArr3)) {
                    return false;
                }
            } else if (strArr2 != z) {
                continue;
            } else {
                if (str2.equals("http://www.w3.org/1998/Math/MathML") && org.jsoup.internal.k.d(str, A)) {
                    return false;
                }
                if (str2.equals("http://www.w3.org/2000/svg") && org.jsoup.internal.k.d(str, B)) {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean H(String str) {
        String[] strArr = this.y;
        strArr[0] = str;
        return G(strArr, E, null);
    }

    public final void I(i0 i0Var, boolean z2) {
        com.google.common.util.concurrent.g0 g0Var = i0Var.d;
        String strE = g0Var.E();
        if (strE.indexOf(0) != -1) {
            String strReplace = z2 ? strE.replace((char) 0, (char) 65533) : strE.replace(i0.e, "");
            g0Var.B();
            g0Var.y = strReplace;
        }
        J(i0Var, b());
    }

    public final void J(i0 i0Var, org.jsoup.nodes.j jVar) {
        org.jsoup.nodes.o eVar;
        String strE = i0Var.d.E();
        if (i0Var instanceof h0) {
            eVar = new org.jsoup.nodes.c(strE);
        } else {
            eVar = jVar.A.b(LibretroCore.SCREEN_WIDTH) ? new org.jsoup.nodes.e(strE) : new org.jsoup.nodes.v(strE);
        }
        jVar.J(eVar);
    }

    public final void K(j0 j0Var) {
        b().J(new org.jsoup.nodes.d(j0Var.d.E()));
    }

    public final org.jsoup.nodes.j L(n0 n0Var) {
        org.jsoup.nodes.j jVarX = x(n0Var, "http://www.w3.org/1999/xhtml", false);
        f0 f0Var = jVarX.A;
        y(jVarX);
        if (n0Var.f) {
            f0Var.A |= 32;
            if (!f0Var.c()) {
                if ((f0Var.A & 1) == 0 || !f0Var.d()) {
                    t0 t0Var = this.c;
                    Object[] objArr = {f0Var.z};
                    c0 c0Var = t0Var.b;
                    if (c0Var.b()) {
                        c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(t0Var.a, "Tag [%s] cannot be self-closing; not a void tag", objArr));
                    }
                } else {
                    this.c.o(l3.e);
                    t0 t0Var2 = this.c;
                    m0 m0Var = this.u;
                    m0Var.f();
                    m0Var.j(f0Var.y);
                    t0Var2.h(m0Var);
                }
            }
        }
        if (f0Var.c()) {
            l();
        }
        return jVarX;
    }

    public final org.jsoup.nodes.j M(n0 n0Var) {
        org.jsoup.nodes.j jVarX = x(n0Var, "http://www.w3.org/1999/xhtml", false);
        y(jVarX);
        l();
        return jVarX;
    }

    public final void N(n0 n0Var, String str) {
        org.jsoup.nodes.j jVarX = x(n0Var, str, true);
        y(jVarX);
        if (n0Var.f) {
            jVarX.A.A |= 32;
            l();
        }
    }

    public final void O(n0 n0Var, boolean z2, boolean z3) {
        org.jsoup.nodes.m mVar = (org.jsoup.nodes.m) x(n0Var, "http://www.w3.org/1999/xhtml", false);
        if (!z3 || !Q("template")) {
            this.p = mVar;
        }
        y(mVar);
        if (z2) {
            return;
        }
        l();
    }

    public final boolean Q(String str) {
        return C(str) != null;
    }

    public final boolean S(String[] strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (!org.jsoup.internal.k.d(((org.jsoup.nodes.j) this.e.get(size)).A.z, strArr)) {
                return true;
            }
        }
        return false;
    }

    public final void T(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            f0 f0Var = l().A;
            if (f0Var.z.equals(str) && f0Var.e.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void U() {
        if (this.s.size() > 0) {
            ArrayList arrayList = this.s;
        }
    }

    public final void V(b0 b0Var) {
        this.s.add(b0Var);
    }

    public final void W() {
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        org.jsoup.nodes.j jVar = this.r.size() > 0 ? (org.jsoup.nodes.j) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, this.r) : null;
        if (jVar == null || R(this.e, jVar)) {
            return;
        }
        int size = this.r.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            jVar = (org.jsoup.nodes.j) this.r.get(i3);
            if (jVar == null || R(this.e, jVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                jVar = (org.jsoup.nodes.j) this.r.get(i3);
            }
            org.jsoup.helper.n.H(jVar);
            org.jsoup.nodes.j jVar2 = new org.jsoup.nodes.j(this.i.d(jVar.v(), jVar.A.z, "http://www.w3.org/1999/xhtml", this.h.a), null, jVar.f().clone());
            y(jVar2);
            this.r.set(i3, jVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void X(org.jsoup.nodes.j jVar) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.j) this.r.get(size)) == jVar) {
                this.r.remove(size);
                return;
            }
        }
    }

    public final void Y(org.jsoup.nodes.j jVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((org.jsoup.nodes.j) this.e.get(size)) == jVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    public final void Z() {
        if (!Q("body")) {
            ArrayList arrayList = this.e;
            org.jsoup.nodes.g gVar = this.d;
            org.jsoup.nodes.j jVarU = gVar.U();
            while (true) {
                if (jVarU == null) {
                    jVarU = gVar.K("html");
                    break;
                } else if (jVarU.s("html")) {
                    break;
                } else {
                    jVarU = jVarU.t();
                }
            }
            org.jsoup.nodes.j jVarU2 = jVarU.U();
            while (true) {
                if (jVarU2 == null) {
                    jVarU2 = jVarU.K("body");
                    break;
                } else if (jVarU2.s("body") || jVarU2.s("frameset")) {
                    break;
                } else {
                    jVarU2 = jVarU2.t();
                }
            }
            arrayList.add(jVarU2);
        }
        this.l = b0.D;
    }

    @Override // org.jsoup.parser.m3
    public final List a() {
        List list;
        org.jsoup.nodes.j jVar = this.q;
        if (jVar == null) {
            return this.d.k();
        }
        org.jsoup.nodes.j jVar2 = jVar.e;
        if (jVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList<org.jsoup.nodes.o> arrayList = (ArrayList) jVar2.o();
            ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
            for (org.jsoup.nodes.o oVar : arrayList) {
                if (oVar != jVar) {
                    arrayList2.add(oVar);
                }
            }
            list = arrayList2;
        }
        if (!list.isEmpty()) {
            org.jsoup.nodes.j jVar3 = this.q;
            jVar3.getClass();
            int size = jVar3.B.size();
            org.jsoup.helper.n.B("Insert position out of bounds.", size >= 0);
            jVar3.c(size, (org.jsoup.nodes.o[]) list.toArray(new org.jsoup.nodes.o[0]));
        }
        return this.q.k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0186 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0053. Please report as an issue. */
    public final boolean a0() {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        b0 b0Var = this.l;
        if (this.e.size() == 0) {
            this.l = b0.D;
        }
        boolean z2 = false;
        while (i >= i2) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) this.e.get(i);
            if (i == i2) {
                if (this.x) {
                    jVar = this.q;
                }
                z2 = true;
            }
            String str = jVar != null ? jVar.A.z : "";
            if ("http://www.w3.org/1999/xhtml".equals(jVar.A.e)) {
                str.getClass();
                switch (str) {
                    case "frameset":
                        this.l = b0.Q;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "template":
                        b0 b0Var2 = this.s.size() > 0 ? (b0) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, this.s) : null;
                        if (b0Var2 == null) {
                            throw new org.jsoup.helper.o("Bug: no template insertion mode on stack!");
                        }
                        this.l = b0Var2;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "select":
                        this.l = b0.M;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "colgroup":
                        this.l = b0.I;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "td":
                    case "th":
                        if (z2) {
                            if (z2) {
                                this.l = b0.D;
                            }
                            break;
                        } else {
                            this.l = b0.L;
                        }
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "tr":
                        this.l = b0.K;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "body":
                        this.l = b0.D;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "head":
                        if (z2) {
                            if (z2) {
                                this.l = b0.D;
                            }
                            break;
                        } else {
                            this.l = b0.A;
                        }
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "html":
                        this.l = this.o == null ? b0.z : b0.C;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "table":
                        this.l = b0.F;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        this.l = b0.J;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    case "caption":
                        this.l = b0.H;
                        if (this.l != b0Var) {
                            return true;
                        }
                        return false;
                    default:
                        if (z2) {
                            this.l = b0.D;
                            if (this.l != b0Var) {
                                return true;
                            }
                            return false;
                        }
                        break;
                        break;
                }
            }
            i--;
        }
        if (this.l != b0Var) {
            return true;
        }
        return false;
    }

    @Override // org.jsoup.parser.m3
    public final d0 f() {
        return d0.c;
    }

    @Override // org.jsoup.parser.m3
    public final void i(Reader reader, String str, e0 e0Var) {
        super.i(reader, str, e0Var);
        this.l = b0.e;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new m0(3, this);
        this.v = true;
        this.w = false;
        this.x = false;
    }

    @Override // org.jsoup.parser.m3
    public final void j() {
        this.l = b0.e;
        this.x = true;
    }

    @Override // org.jsoup.parser.m3
    public final m3 k() {
        return new b();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    @Override // org.jsoup.parser.m3
    public final boolean m(r0 r0Var) {
        boolean zC = true;
        if (!this.e.isEmpty()) {
            org.jsoup.nodes.j jVarB = b();
            f0 f0Var = jVarB.A;
            String str = f0Var.e;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                String str2 = f0Var.e;
                if ("http://www.w3.org/1998/Math/MathML".equals(str2) && org.jsoup.internal.k.d(f0Var.z, K)) {
                    if (r0Var.e()) {
                        n0 n0Var = (n0) r0Var;
                        if ("mglyph".equals(n0Var.e) || "malignmark".equals(n0Var.e)) {
                            if (r0Var.a != 5) {
                                if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                                    if (!"http://www.w3.org/1998/Math/MathML".equals(str2)) {
                                        if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                        }
                                    } else if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                    }
                                    zC = r0Var.c();
                                } else {
                                    if (!"http://www.w3.org/1998/Math/MathML".equals(str2)) {
                                        if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                        }
                                    } else if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                    }
                                    zC = r0Var.c();
                                }
                            }
                        }
                    } else if (r0Var.a != 5) {
                        if ("http://www.w3.org/1998/Math/MathML".equals(str)) {
                            if (!"http://www.w3.org/1998/Math/MathML".equals(str2)) {
                                if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                }
                            } else if (!"http://www.w3.org/2000/svg".equals(str2)) {
                            }
                            zC = r0Var.c();
                        } else {
                            if (!"http://www.w3.org/1998/Math/MathML".equals(str2)) {
                                if (!"http://www.w3.org/2000/svg".equals(str2)) {
                                }
                            } else if (!"http://www.w3.org/2000/svg".equals(str2)) {
                            }
                            zC = r0Var.c();
                        }
                    }
                } else if ("http://www.w3.org/1998/Math/MathML".equals(str) || !jVarB.s("annotation-xml") || !r0Var.e() || !"svg".equals(((n0) r0Var).e)) {
                    if (!"http://www.w3.org/1998/Math/MathML".equals(str2) && jVarB.s("annotation-xml")) {
                        String strD = org.jsoup.internal.b.d(jVarB.d("encoding"));
                        if (strD.equals("text/html") || strD.equals("application/xhtml+xml")) {
                            if (!r0Var.e()) {
                            }
                        } else if (!"http://www.w3.org/2000/svg".equals(str2)) {
                        }
                    } else if (!"http://www.w3.org/2000/svg".equals(str2) && org.jsoup.internal.k.c(f0Var.y, L)) {
                        if (!r0Var.e() && r0Var.a != 5) {
                        }
                    }
                    zC = r0Var.c();
                }
            }
        }
        return (zC ? this.l : b0.U).f(r0Var, this);
    }

    public final org.jsoup.nodes.j r(org.jsoup.nodes.j jVar) {
        if (!R(this.e, jVar)) {
            return null;
        }
        for (int size = this.e.size() - 1; size > 0; size--) {
            if (((org.jsoup.nodes.j) this.e.get(size)) == jVar) {
                return (org.jsoup.nodes.j) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void s(org.jsoup.nodes.j jVar) {
        int size = this.r.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            org.jsoup.nodes.j jVar2 = (org.jsoup.nodes.j) this.r.get(i3);
            if (jVar2 == null) {
                return;
            }
            if (jVar.A.z.equals(jVar2.A.z) && jVar.f().equals(jVar2.f())) {
                i2++;
            }
            if (i2 == 3) {
                this.r.remove(i3);
                return;
            }
        }
    }

    public final void t() {
        while (!this.r.isEmpty()) {
            int size = this.r.size();
            if ((size > 0 ? (org.jsoup.nodes.j) this.r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + b() + '}';
    }

    public final void u(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) this.e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(jVar.A.e) && (org.jsoup.internal.k.c(jVar.A.z, strArr) || jVar.s("html"))) {
                return;
            }
            l();
        }
    }

    public final void v() {
        u("table", "template");
    }

    public final void w() {
        u("tr", "template");
    }

    public final org.jsoup.nodes.j x(n0 n0Var, String str, boolean z2) {
        org.jsoup.nodes.b bVar = n0Var.g;
        if (bVar != null && bVar.size() != 0) {
            if (!z2) {
                this.h.a(bVar);
            }
            if (bVar.f(this.h) > 0) {
                h("Dropped duplicate attribute(s) in tag [%s]", n0Var.e);
            }
        }
        f0 f0VarD = this.i.d(n0Var.d.E(), n0Var.e, str, (z2 ? d0.d : this.h).a);
        return f0VarD.z.equals("form") ? new org.jsoup.nodes.m(f0VarD, bVar) : new org.jsoup.nodes.j(f0VarD, null, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    public final void y(org.jsoup.nodes.j jVar) {
        org.jsoup.nodes.j jVarR;
        boolean z2;
        f0 f0Var = jVar.A;
        int i = this.a.C;
        if (i != Integer.MAX_VALUE) {
            while (this.e.size() >= i) {
                org.jsoup.nodes.j jVarL = l();
                if (jVarL == this.o) {
                    this.o = null;
                }
                if (jVarL == this.p) {
                    this.p = null;
                }
                X(jVarL);
                if (jVarL.s("template")) {
                    t();
                    if (this.s.size() > 0) {
                        U();
                    }
                    a0();
                }
            }
        }
        if (this.p != null && f0Var.e.equals("http://www.w3.org/1999/xhtml") && org.jsoup.internal.k.d(f0Var.z, M)) {
            this.p.G.add(jVar);
        }
        if (this.a.y.b() && jVar.q("xmlns") && !jVar.d("xmlns").equals(f0Var.e)) {
            h("Invalid xmlns attribute [%s] on tag [%s]", jVar.d("xmlns"), f0Var.y);
        }
        if (this.w && org.jsoup.internal.k.d(b().A.z, a0.z)) {
            org.jsoup.nodes.j jVarC = C("table");
            if (jVarC != null) {
                jVarR = jVarC.e;
                if (jVarR != null) {
                    z2 = true;
                } else {
                    jVarR = r(jVarC);
                }
                if (z2) {
                    org.jsoup.helper.n.H(jVarC);
                    org.jsoup.helper.n.H(jVarC.e);
                    if (jVar.e == jVarC.e) {
                        jVar.F();
                    }
                    jVarC.e.c(jVarC.I(), jVar);
                } else {
                    jVarR.J(jVar);
                }
            } else {
                jVarR = (org.jsoup.nodes.j) this.e.get(0);
            }
            z2 = false;
            if (z2) {
                org.jsoup.helper.n.H(jVarC);
                org.jsoup.helper.n.H(jVarC.e);
                if (jVar.e == jVarC.e) {
                    jVar.F();
                }
                jVarC.e.c(jVarC.I(), jVar);
            } else {
                jVarR.J(jVar);
            }
        } else {
            b().J(jVar);
        }
        this.e.add(jVar);
    }

    public final void z(b0 b0Var) {
        if (this.a.y.b()) {
            this.a.y.add(new androidx.media3.exoplayer.dash.manifest.u(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b0Var}));
        }
    }
}
