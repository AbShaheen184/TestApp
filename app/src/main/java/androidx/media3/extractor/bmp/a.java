package androidx.media3.extractor.bmp;

import androidx.media3.extractor.c0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public final /* synthetic */ int a;
    public final n b;

    public a(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new c0(35152, 2, "image/png");
                break;
            default:
                this.b = new c0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        switch (this.a) {
            case 0:
                return ((c0) this.b).a(oVar);
            case 1:
                return ((c0) this.b).a(oVar);
            default:
                return this.b.a(oVar);
        }
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                ((c0) this.b).b(j, j2);
                break;
            case 1:
                ((c0) this.b).b(j, j2);
                break;
            default:
                this.b.b(j, j2);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        switch (this.a) {
            case 0:
                return ((c0) this.b).c(oVar, rVar);
            case 1:
                return ((c0) this.b).c(oVar, rVar);
            default:
                return this.b.c(oVar, rVar);
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        switch (this.a) {
            case 0:
                ((c0) this.b).d(pVar);
                break;
            case 1:
                ((c0) this.b).d(pVar);
                break;
            default:
                this.b.d(pVar);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b.release();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    public a(int i) {
        this.a = 2;
        if ((i & 1) != 0) {
            this.b = new c0(65496, 2, "image/jpeg");
        } else {
            this.b = new androidx.media3.extractor.jpeg.a();
        }
    }
}
