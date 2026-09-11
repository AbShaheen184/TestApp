package androidx.media3.extractor.mp4;

import androidx.media3.common.j0;
import androidx.media3.common.util.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final w f;
    public final w g;
    public int h;
    public int i;

    public b(w wVar, w wVar2, boolean z) throws j0 {
        this.g = wVar;
        this.f = wVar2;
        this.e = z;
        wVar2.M(12);
        this.a = wVar2.D();
        wVar.M(12);
        this.i = wVar.D();
        androidx.media3.extractor.b.b("first_chunk must be 1", wVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        w wVar = this.f;
        this.d = z ? wVar.F() : wVar.B();
        if (this.b == this.h) {
            w wVar2 = this.g;
            this.c = wVar2.D();
            wVar2.N(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? wVar2.D() - 1 : -1;
        }
        return true;
    }
}
