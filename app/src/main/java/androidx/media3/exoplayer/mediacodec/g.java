package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.text.selection.q0;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import com.caverock.androidsvg.y1;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k {
    public final Context e;

    public g(Context context) {
        x.g(context);
        Context applicationContext = context.getApplicationContext();
        x.g(applicationContext);
        this.e = applicationContext;
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.e;
        if (i >= 28 && context.checkSelfPermission("android.permission.FOREGROUND_SERVICE") != 0) {
            return false;
        }
        return i < 34 || context.checkSelfPermission("android.permission.FOREGROUND_SERVICE_SPECIAL_USE") == 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.k
    public l o(y1 y1Var) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.e) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new com.google.android.gms.common.internal.k(15).o(y1Var);
        }
        int i2 = i0.i(((androidx.media3.common.r) y1Var.c).o);
        androidx.media3.common.util.c.k("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(j0.H(i2)));
        q0 q0Var = new q0(new androidx.media3.exoplayer.r(i2, 3), new androidx.media3.exoplayer.r(i2, 4));
        q0Var.y = true;
        return q0Var.o(y1Var);
    }

    public /* synthetic */ g(Context context, boolean z) {
        this.e = context;
    }
}
