package androidx.localbroadcastmanager.content;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Object d = new Object();
    public static b e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public b(Context context) {
        new a(this, context.getMainLooper(), 0);
    }
}
