package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends u0 {
    @Override // com.caverock.androidsvg.u0, com.caverock.androidsvg.v0
    public final void b(z0 z0Var) throws z1 {
        if (z0Var instanceof j1) {
            this.i.add(z0Var);
            return;
        }
        throw new z1("Text content elements cannot contain " + z0Var + " elements.");
    }
}
