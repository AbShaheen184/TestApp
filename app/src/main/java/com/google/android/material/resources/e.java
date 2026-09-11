package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ g c;
    public final /* synthetic */ f d;

    public e(f fVar, Context context, TextPaint textPaint, g gVar) {
        this.d = fVar;
        this.a = context;
        this.b = textPaint;
        this.c = gVar;
    }

    @Override // com.google.android.material.resources.g
    public final void i(int i) {
        this.c.i(i);
    }

    @Override // com.google.android.material.resources.g
    public final void j(Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.j(typeface, z);
    }
}
