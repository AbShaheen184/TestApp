package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum y extends b0 {
    public y() {
        super("Text", 7);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.a == 5) {
            bVar.I((i0) r0Var, false);
            return true;
        }
        if (!r0Var.c()) {
            if (!r0Var.d()) {
                return true;
            }
            bVar.l();
            bVar.l = bVar.m;
            return true;
        }
        bVar.z(this);
        bVar.l();
        b0 b0Var = bVar.m;
        bVar.l = b0Var;
        if (b0Var == b0.E) {
            bVar.l = b0.D;
        }
        return bVar.m(r0Var);
    }
}
