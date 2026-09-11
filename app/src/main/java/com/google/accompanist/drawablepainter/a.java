package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.h1;
import androidx.compose.ui.geometry.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Drawable.Callback {
    public final /* synthetic */ b e;

    public a(b bVar) {
        this.e = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        b bVar = this.e;
        h1 h1Var = bVar.D;
        h1Var.setValue(Integer.valueOf(((Number) h1Var.getValue()).intValue() + 1));
        bVar.E.setValue(new e(c.a(bVar.C)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) c.a.getValue()).postAtTime(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) c.a.getValue()).removeCallbacks(runnable);
    }
}
