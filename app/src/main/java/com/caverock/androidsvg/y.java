package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y extends x0 implements v0 {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // com.caverock.androidsvg.v0
    public final void b(z0 z0Var) throws z1 {
        if (z0Var instanceof q0) {
            this.h.add(z0Var);
            return;
        }
        throw new z1("Gradient elements cannot contain " + z0Var + " elements.");
    }

    @Override // com.caverock.androidsvg.v0
    public final List getChildren() {
        return this.h;
    }
}
