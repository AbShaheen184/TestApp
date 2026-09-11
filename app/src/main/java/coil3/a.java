package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {
    public final Bitmap a;

    public a(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // coil3.k
    public final int a() {
        return this.a.getHeight();
    }

    @Override // coil3.k
    public final int b() {
        return this.a.getWidth();
    }

    @Override // coil3.k
    public final boolean c() {
        return true;
    }

    @Override // coil3.k
    public final void d(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // coil3.k
    public final long e() {
        return com.google.android.gms.common.wrappers.a.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.l.a(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
