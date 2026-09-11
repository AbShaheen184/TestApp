package okhttp3.internal.cache;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {
    public final /* synthetic */ h A;
    public final String e;
    public final long y;
    public final ArrayList z;

    public e(h hVar, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.A = hVar;
        this.e = str;
        this.y = j;
        this.z = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            okhttp3.internal.e.b((h0) it.next());
        }
    }
}
