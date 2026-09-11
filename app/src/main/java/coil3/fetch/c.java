package coil3.fetch;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {
    public final Bitmap a;

    public c(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) {
        return new j(new coil3.a(this.a), false, coil3.decode.h.y);
    }
}
