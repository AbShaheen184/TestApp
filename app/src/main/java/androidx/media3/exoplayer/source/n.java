package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final AtomicLong b = new AtomicLong();
    public final long a;

    public n(androidx.media3.datasource.l lVar, long j) {
        this(lVar, lVar.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public n(androidx.media3.datasource.l lVar, Uri uri, Map map, long j, long j2, long j3) {
        this.a = j2;
    }
}
