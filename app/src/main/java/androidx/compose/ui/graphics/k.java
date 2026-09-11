package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final PathMeasure a;

    public k(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, j jVar) {
        if (jVar == null) {
            com.google.gson.b.r("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, jVar.a, true);
        }
    }
}
