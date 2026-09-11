package com.google.android.material.internal;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public float c;
    public final WeakReference e;
    public com.google.android.material.resources.f f;
    public final TextPaint a = new TextPaint(1);
    public final com.google.android.material.chip.b b = new com.google.android.material.chip.b(this, 1);
    public boolean d = true;

    public h(com.google.android.material.chip.e eVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
