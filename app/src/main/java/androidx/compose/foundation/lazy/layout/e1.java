package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    public static final d1 a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        d1 d1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                d1Var = new d1();
            } else {
                d1Var = null;
            }
        } else {
            d1Var = null;
        }
        a = d1Var;
    }
}
