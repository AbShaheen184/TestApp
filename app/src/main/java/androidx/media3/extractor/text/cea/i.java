package androidx.media3.extractor.text.cea;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.media3.extractor.text.d {
    public final List e;

    public /* synthetic */ i(List list) {
        this.e = list;
    }

    @Override // androidx.media3.extractor.text.d
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.d
    public long f(int i) {
        com.google.android.material.motion.a.f(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.d
    public List j(long j) {
        return j >= 0 ? this.e : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.d
    public int k() {
        return 1;
    }
}
