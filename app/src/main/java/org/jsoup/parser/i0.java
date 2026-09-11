package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends r0 {
    public static final String e = String.valueOf((char) 0);
    public final com.google.common.util.concurrent.g0 d;

    public i0(i0 i0Var) {
        super(5);
        com.google.common.util.concurrent.g0 g0Var = new com.google.common.util.concurrent.g0(21, false);
        this.d = g0Var;
        this.b = i0Var.b;
        this.c = i0Var.c;
        String strE = i0Var.d.E();
        g0Var.B();
        g0Var.y = strE;
    }

    @Override // org.jsoup.parser.r0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.B();
    }

    public String toString() {
        return this.d.E();
    }

    public i0() {
        super(5);
        this.d = new com.google.common.util.concurrent.g0(21, false);
    }
}
