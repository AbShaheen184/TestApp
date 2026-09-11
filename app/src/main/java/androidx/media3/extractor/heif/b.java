package androidx.media3.extractor.heif;

import androidx.datastore.preferences.protobuf.h1;
import androidx.media3.extractor.k;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public final boolean b = false;
    public final n a = new a();

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return this.b ? h1.x((k) oVar, false) : this.a.a(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.a.b(j, j2);
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        return this.a.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.a.d(pVar);
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        this.a.release();
    }
}
