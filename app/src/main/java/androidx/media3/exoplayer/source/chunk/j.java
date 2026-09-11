package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.datasource.y;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    public final e G;
    public androidx.media3.common.util.b H;
    public long I;
    public volatile boolean J;

    public j(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, e eVar) {
        super(hVar, lVar, 2, rVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.G = eVar;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        if (this.I == 0) {
            this.G.b(this.H, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            androidx.media3.datasource.l lVarC = this.y.c(this.I);
            y yVar = this.F;
            androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(yVar, lVarC.f, yVar.t(lVarC));
            while (!this.J) {
                try {
                    int iC = this.G.e.c(kVar, e.H);
                    boolean z = false;
                    com.google.android.material.motion.a.q(iC != 1);
                    if (iC == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } catch (Throwable th) {
                    this.I = kVar.A - this.y.f;
                    this.G.a();
                    throw th;
                }
            }
            this.I = kVar.A - this.y.f;
            this.G.a();
            n.f(this.F);
        } catch (Throwable th2) {
            n.f(this.F);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
        this.J = true;
    }
}
