package androidx.media3.common;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    public static final UUID d;
    public static final UUID e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        a = new UUID(0L, 0L);
        b = new UUID(1186680826959645954L, -5988876978535335093L);
        c = new UUID(-2129748144642739255L, 8654423357094679310L);
        d = new UUID(-1301668207276963122L, -6645017420763422227L);
        e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
