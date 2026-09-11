package androidx.core.app;

import android.app.Notification;
import androidx.compose.animation.core.j2;
import com.google.firebase.messaging.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j2 {
    public CharSequence y;

    @Override // androidx.compose.animation.core.j2
    public final void j(o oVar) {
        new Notification.BigTextStyle((Notification.Builder) oVar.z).setBigContentTitle(null).bigText(this.y);
    }

    @Override // androidx.compose.animation.core.j2
    public final String m() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
