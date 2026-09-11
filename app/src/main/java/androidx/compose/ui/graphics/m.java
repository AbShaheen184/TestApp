package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.f2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public m(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            f2.e();
            porterDuffColorFilter = f2.a(a0.y(j), b.d(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(a0.y(j), b.e(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return t.c(this.b, mVar.b) && this.c == mVar.c;
    }

    public final int hashCode() {
        int i = t.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.b, ", blendMode=", sb);
        sb.append((Object) a0.B(this.c));
        sb.append(')');
        return sb.toString();
    }
}
