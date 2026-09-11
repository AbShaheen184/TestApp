package androidx.media3.extractor.ogg;

import androidx.media3.common.util.w;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public h0 b;
    public p c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final e a = new e();
    public androidx.media3.common.util.b j = new androidx.media3.common.util.b(18, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j, androidx.media3.common.util.b bVar);

    public void d(boolean z) {
        if (z) {
            this.j = new androidx.media3.common.util.b(18, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
