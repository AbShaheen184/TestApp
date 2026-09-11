package org.jsoup.parser;

import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static final char[] u;
    public static final int[] v = {8364, Token.DEFAULT, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, Token.EMPTY, 381, Token.BLOCK, Token.LABEL, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, Token.DOTDOT, 382, 376};
    public final a a;
    public final c0 b;
    public final int g;
    public final n0 h;
    public final m0 i;
    public o0 j;
    public final q0 n;
    public String o;
    public String p;
    public int q;
    public l3 c = l3.e;
    public r0 d = null;
    public boolean e = false;
    public final com.google.common.util.concurrent.g0 f = new com.google.common.util.concurrent.g0(21, false);
    public final i0 k = new i0();
    public final k0 l = new k0();
    public final j0 m = new j0();
    public int r = 0;
    public final int[] s = new int[1];
    public final int[] t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    public t0(m3 m3Var) {
        this.g = m3Var instanceof n3 ? 2 : 1;
        n0 n0Var = new n0(2, m3Var);
        this.h = n0Var;
        this.j = n0Var;
        this.i = new m0(3, m3Var);
        q0 q0Var = new q0(6, m3Var);
        q0Var.k = true;
        this.n = q0Var;
        this.a = m3Var.b;
        this.b = m3Var.a.y;
    }

    public final void a(l3 l3Var) {
        o(l3Var);
        this.a.a();
    }

    public final void b(String str, Object... objArr) {
        c0 c0Var = this.b;
        if (c0Var.b()) {
            c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x020e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0220  */
    /* JADX WARN: Code duplicated, block: B:128:0x0224  */
    /* JADX WARN: Code duplicated, block: B:130:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x022e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:149:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:4: B:95:0x0198->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0168  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019e  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dc, code lost:
    
        if (r0.h0('=', '-', '_') == false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] c(java.lang.Character r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.t0.c(java.lang.Character, boolean):int[]");
    }

    public final o0 d(boolean z) {
        o0 o0Var;
        if (z) {
            o0Var = this.h;
            o0Var.f();
        } else {
            o0Var = this.i;
            o0Var.f();
        }
        this.j = o0Var;
        return o0Var;
    }

    public final void e() {
        this.f.B();
    }

    public final void f(char c) {
        i0 i0Var = this.k;
        i0Var.d.j(c);
        i0Var.b = this.r;
        i0Var.c = this.a.l0();
    }

    public final void g(String str) {
        i0 i0Var = this.k;
        i0Var.d.k(str);
        i0Var.b = this.r;
        i0Var.c = this.a.l0();
    }

    public final void h(r0 r0Var) {
        if (this.e) {
            throw new org.jsoup.helper.o("Must be false");
        }
        this.d = r0Var;
        this.e = true;
        r0Var.b = this.q;
        a aVar = this.a;
        r0Var.c = aVar.l0();
        this.r = aVar.l0();
        int i = r0Var.a;
        if (i == 2) {
            this.o = ((n0) r0Var).d.E();
            this.p = null;
        } else if (i == 3) {
            m0 m0Var = (m0) r0Var;
            if (m0Var.g != null) {
                Object[] objArr = {m0Var.l()};
                c0 c0Var = this.b;
                if (c0Var.b()) {
                    c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(aVar, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void i() {
        h(this.m);
    }

    public final void j() {
        h(this.l);
    }

    public final void k() {
        o0 o0Var = this.j;
        if (o0Var.h.s()) {
            o0Var.k();
        }
        h(this.j);
    }

    public final void l(l3 l3Var) {
        c0 c0Var = this.b;
        if (c0Var.b()) {
            c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{l3Var}));
        }
    }

    public final void m(l3 l3Var) {
        c0 c0Var = this.b;
        if (c0Var.b()) {
            a aVar = this.a;
            c0Var.add(new androidx.media3.exoplayer.dash.manifest.u(aVar, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.b0()), l3Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.j.d.E().equalsIgnoreCase(this.o);
    }

    public final void o(l3 l3Var) {
        if (l3Var == l3.E) {
            this.q = this.a.l0();
        }
        this.c = l3Var;
    }
}
