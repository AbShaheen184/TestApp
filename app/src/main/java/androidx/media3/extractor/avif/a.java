package androidx.media3.extractor.avif;

import androidx.media3.common.util.w;
import androidx.media3.extractor.c0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public final /* synthetic */ int a;
    public final w b;
    public final c0 c;

    public a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new w(4);
                this.c = new c0(-1, -1, "image/webp");
                break;
            default:
                this.b = new w(4);
                this.c = new c0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        switch (this.a) {
            case 0:
                k kVar = (k) oVar;
                kVar.a(4, false);
                w wVar = this.b;
                wVar.J(4);
                kVar.e(wVar.a, 0, 4, false);
                if (wVar.B() != 1718909296) {
                    return false;
                }
                wVar.J(4);
                kVar.e(wVar.a, 0, 4, false);
                return wVar.B() == ((long) 1635150182);
            default:
                w wVar2 = this.b;
                wVar2.J(4);
                k kVar2 = (k) oVar;
                kVar2.e(wVar2.a, 0, 4, false);
                if (wVar2.B() != 1380533830) {
                    return false;
                }
                kVar2.a(4, false);
                wVar2.J(4);
                kVar2.e(wVar2.a, 0, 4, false);
                return wVar2.B() == 1464156752;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.b(j, j2);
                break;
            default:
                this.c.b(j, j2);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        switch (this.a) {
            case 0:
                this.c.d(pVar);
                break;
            default:
                this.c.d(pVar);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        int i = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }
}
