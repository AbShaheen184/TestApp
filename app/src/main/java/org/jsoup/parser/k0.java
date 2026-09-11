package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends r0 {
    public final com.google.common.util.concurrent.g0 d;
    public String e;
    public final com.google.common.util.concurrent.g0 f;
    public final com.google.common.util.concurrent.g0 g;
    public final com.google.common.util.concurrent.g0 h;
    public boolean i;
    public boolean j;

    public k0() {
        super(1);
        int i = 21;
        boolean z = false;
        this.d = new com.google.common.util.concurrent.g0(i, z);
        this.e = null;
        this.f = new com.google.common.util.concurrent.g0(i, z);
        this.g = new com.google.common.util.concurrent.g0(i, z);
        this.h = new com.google.common.util.concurrent.g0(i, z);
        this.i = false;
        this.j = false;
    }

    @Override // org.jsoup.parser.r0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.B();
        this.e = null;
        this.f.B();
        this.g.B();
        this.h.B();
        this.i = false;
        this.j = false;
    }

    public final String toString() {
        return "<!doctype " + this.d.E() + ">";
    }
}
