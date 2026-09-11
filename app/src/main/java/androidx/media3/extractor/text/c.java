package androidx.media3.extractor.text;

import androidx.activity.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.media3.decoder.f implements d {
    public d B;
    public long C;
    public final /* synthetic */ int D = 1;
    public Object E;

    public c(androidx.media3.exoplayer.text.b bVar) {
        this.E = bVar;
    }

    @Override // androidx.media3.extractor.text.d
    public final int e(long j) {
        d dVar = this.B;
        dVar.getClass();
        return dVar.e(j - this.C);
    }

    @Override // androidx.media3.extractor.text.d
    public final long f(int i) {
        d dVar = this.B;
        dVar.getClass();
        return dVar.f(i) + this.C;
    }

    @Override // androidx.media3.extractor.text.d
    public final List j(long j) {
        d dVar = this.B;
        dVar.getClass();
        return dVar.j(j - this.C);
    }

    @Override // androidx.media3.extractor.text.d
    public final int k() {
        d dVar = this.B;
        dVar.getClass();
        return dVar.k();
    }

    @Override // androidx.media3.decoder.f
    public final void o() {
        this.y = 0;
        this.z = 0L;
        this.A = false;
        this.B = null;
    }

    @Override // androidx.media3.decoder.f
    public final void p() {
        switch (this.D) {
            case 0:
                ((androidx.media3.exoplayer.text.b) this.E).m(this);
                break;
            default:
                androidx.media3.extractor.text.cea.h hVar = (androidx.media3.extractor.text.cea.h) ((y) this.E).y;
                o();
                hVar.b.add(this);
                break;
        }
    }

    public /* synthetic */ c() {
    }
}
