package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.animation.core.j2;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j2 {
    public boolean A;
    public IconCompat y;
    public IconCompat z;

    @Override // androidx.compose.animation.core.j2
    public final void j(o oVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) oVar.z;
        Context context = (Context) oVar.y;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.y;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                e.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.y;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        com.google.gson.b.m(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.A) {
            IconCompat iconCompat3 = this.z;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(bigContentTitle, false);
            e.b(bigContentTitle, null);
        }
    }

    @Override // androidx.compose.animation.core.j2
    public final String m() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
