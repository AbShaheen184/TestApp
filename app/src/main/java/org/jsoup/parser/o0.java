package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends r0 {
    public final com.google.common.util.concurrent.g0 d;
    public String e;
    public boolean f;
    public org.jsoup.nodes.b g;
    public final com.google.common.util.concurrent.g0 h;
    public final com.google.common.util.concurrent.g0 i;
    public boolean j;

    public o0(int i, m3 m3Var) {
        super(i);
        this.d = new com.google.common.util.concurrent.g0(21, false);
        this.f = false;
        int i2 = 21;
        boolean z = false;
        this.h = new com.google.common.util.concurrent.g0(i2, z);
        this.i = new com.google.common.util.concurrent.g0(i2, z);
        this.j = false;
        m3Var.getClass();
    }

    public final void g(char c, int i, int i2) {
        this.i.j(c);
    }

    public final void h(int[] iArr, int i, int i2) {
        for (int i3 : iArr) {
            com.google.common.util.concurrent.g0 g0Var = this.i;
            StringBuilder sb = (StringBuilder) g0Var.z;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) g0Var.y) != null) {
                StringBuilder sbB = org.jsoup.internal.k.b();
                g0Var.z = sbB;
                sbB.append((String) g0Var.y);
                g0Var.y = null;
                ((StringBuilder) g0Var.z).appendCodePoint(i3);
            } else {
                g0Var.y = String.valueOf(Character.toChars(i3));
            }
        }
    }

    public final void i(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        com.google.common.util.concurrent.g0 g0Var = this.d;
        g0Var.k(strReplace);
        this.e = org.jsoup.internal.b.d(g0Var.E());
    }

    public final void j(String str) {
        com.google.common.util.concurrent.g0 g0Var = this.d;
        g0Var.B();
        g0Var.y = str;
        this.e = org.jsoup.internal.b.d(g0Var.E());
    }

    public final void k() {
        String strE;
        if (this.g == null) {
            this.g = new org.jsoup.nodes.b();
        }
        com.google.common.util.concurrent.g0 g0Var = this.h;
        boolean zS = g0Var.s();
        com.google.common.util.concurrent.g0 g0Var2 = this.i;
        if (zS && this.g.size() < 512) {
            String strTrim = g0Var.E().trim();
            if (!strTrim.isEmpty()) {
                if (g0Var2.s()) {
                    strE = g0Var2.E();
                } else {
                    strE = this.j ? "" : null;
                }
                this.g.c(strTrim, strE);
            }
        }
        g0Var.B();
        g0Var2.B();
        this.j = false;
    }

    public final String l() {
        String str = this.e;
        if (str == null || str.isEmpty()) {
            throw new org.jsoup.helper.o("Must be false");
        }
        return this.e;
    }

    @Override // org.jsoup.parser.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o0 f() {
        this.b = -1;
        this.c = -1;
        this.d.B();
        this.e = null;
        this.f = false;
        this.g = null;
        this.h.B();
        this.i.B();
        this.j = false;
        return this;
    }

    public final String n() {
        String strE = this.d.E();
        return strE.isEmpty() ? "[unset]" : strE;
    }
}
