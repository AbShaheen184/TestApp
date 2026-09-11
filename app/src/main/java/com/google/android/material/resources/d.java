package com.google.android.material.resources;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.core.content.res.b {
    public final /* synthetic */ g e;
    public final /* synthetic */ f f;

    public d(f fVar, g gVar) {
        this.f = fVar;
        this.e = gVar;
    }

    @Override // androidx.core.content.res.b
    public final void e(int i) {
        this.f.n = true;
        this.e.i(i);
    }

    @Override // androidx.core.content.res.b
    public final void f(Typeface typeface) {
        f fVar = this.f;
        Typeface typefaceCreate = Typeface.create(typeface, fVar.d);
        fVar.p = typefaceCreate;
        fVar.n = true;
        this.e.j(typefaceCreate, false);
    }
}
