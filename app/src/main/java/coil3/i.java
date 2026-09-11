package coil3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static i b;
    public final Object a;

    public i() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new com.google.android.gms.cloudmessaging.k(this, 2));
    }

    public i(Object obj) {
        this.a = obj;
    }
}
