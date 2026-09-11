package coil3.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final void c(h hVar, String str, String str2) {
        int iOrdinal = hVar.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal == 2) {
                i = 4;
            } else if (iOrdinal == 3) {
                i = 5;
            } else {
                if (iOrdinal != 4) {
                    coil3.g.a();
                    return;
                }
                i = 6;
            }
        }
        Log.println(i, str, str2);
    }
}
