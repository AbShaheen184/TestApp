package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Surface {
    public static int A;
    public static boolean B;
    public final boolean e;
    public final l y;
    public boolean z;

    public m(l lVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.y = lVar;
        this.e = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? androidx.media3.common.util.c.m("EGL_EXT_protected_content") : false) {
                return androidx.media3.common.util.c.m("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (androidx.media3.common.util.k e) {
            androidx.media3.common.util.c.f("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!B) {
                A = a(context);
                B = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return A != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.y) {
            try {
                if (!this.z) {
                    l lVar = this.y;
                    lVar.y.getClass();
                    lVar.y.sendEmptyMessage(2);
                    this.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
