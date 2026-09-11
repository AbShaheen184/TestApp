package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public j(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
