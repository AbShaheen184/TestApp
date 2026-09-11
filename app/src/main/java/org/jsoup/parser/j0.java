package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends r0 {
    public final com.google.common.util.concurrent.g0 d;

    public j0() {
        super(4);
        this.d = new com.google.common.util.concurrent.g0(21, false);
    }

    @Override // org.jsoup.parser.r0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.B();
    }

    public final void g(char c) {
        this.d.j(c);
    }

    public final String toString() {
        return "<!--" + this.d.E() + "-->";
    }
}
