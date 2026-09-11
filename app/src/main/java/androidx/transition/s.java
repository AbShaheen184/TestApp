package androidx.transition;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 28;
    }
}
