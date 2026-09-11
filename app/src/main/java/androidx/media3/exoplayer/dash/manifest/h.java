package androidx.media3.exoplayer.dash.manifest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }
}
