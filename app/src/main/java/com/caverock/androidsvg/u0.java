package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends w0 implements v0, t0 {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // com.caverock.androidsvg.t0
    public final Set a() {
        return null;
    }

    public void b(z0 z0Var) {
        this.i.add(z0Var);
    }

    @Override // com.caverock.androidsvg.t0
    public final String c() {
        return this.k;
    }

    @Override // com.caverock.androidsvg.t0
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // com.caverock.androidsvg.t0
    public final Set f() {
        return this.j;
    }

    @Override // com.caverock.androidsvg.t0
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // com.caverock.androidsvg.v0
    public final List getChildren() {
        return this.i;
    }

    @Override // com.caverock.androidsvg.t0
    public final void h(String str) {
        this.k = str;
    }

    @Override // com.caverock.androidsvg.t0
    public final void i(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // com.caverock.androidsvg.t0
    public final Set l() {
        return this.l;
    }

    @Override // com.caverock.androidsvg.t0
    public final Set m() {
        return this.m;
    }

    @Override // com.caverock.androidsvg.t0
    public final void j(HashSet hashSet) {
    }
}
