package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public d(int i, PendingIntent pendingIntent, String str) {
        IconCompat iconCompatB = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatB;
        if (iconCompatB != null && iconCompatB.d() == 2) {
            this.e = iconCompatB.c();
        }
        this.f = h.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
