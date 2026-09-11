package com.google.android.material.resources;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final Typeface a;
    public final com.google.android.material.internal.b b;
    public boolean c;

    public a(com.google.android.material.internal.b bVar, Typeface typeface) {
        this.a = typeface;
        this.b = bVar;
    }

    @Override // com.google.android.material.resources.g
    public final void i(int i) {
        if (this.c) {
            return;
        }
        com.google.android.material.internal.c cVar = (com.google.android.material.internal.c) this.b.e;
        if (cVar.l(this.a)) {
            cVar.j(false);
        }
    }

    @Override // com.google.android.material.resources.g
    public final void j(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        com.google.android.material.internal.c cVar = (com.google.android.material.internal.c) this.b.e;
        if (cVar.l(typeface)) {
            cVar.j(false);
        }
    }
}
