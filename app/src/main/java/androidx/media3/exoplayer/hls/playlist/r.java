package androidx.media3.exoplayer.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements androidx.media3.exoplayer.offline.a {
    public final String a;
    public final List b;
    public final boolean c;

    public r(List list, String str, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
