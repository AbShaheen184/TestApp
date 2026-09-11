package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum c extends b0 {
    public c() {
        super("InTableText", 9);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.a == 5) {
            bVar.t.add(new i0((i0) r0Var));
            return true;
        }
        if (bVar.t.size() > 0) {
            r0 r0Var2 = bVar.g;
            for (i0 i0Var : bVar.t) {
                bVar.g = i0Var;
                if (b0.a(i0Var)) {
                    bVar.I(i0Var, false);
                } else {
                    bVar.z(this);
                    boolean zD = org.jsoup.internal.k.d(bVar.b().A.z, a0.z);
                    x xVar = b0.D;
                    if (zD) {
                        bVar.w = true;
                        xVar.f(i0Var, bVar);
                        bVar.w = false;
                    } else {
                        xVar.f(i0Var, bVar);
                    }
                }
            }
            bVar.g = r0Var2;
            bVar.t.clear();
        }
        bVar.l = bVar.m;
        return bVar.m(r0Var);
    }
}
