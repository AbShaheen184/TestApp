package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final e a;
    public final Context b;
    public y c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public b0(Context context) {
        this.b = context;
        e eVar = new e();
        eVar.a = new d();
        eVar.b = new d();
        eVar.d = -9223372036854775807L;
        this.a = eVar;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f || !surface.isValid()) {
            return;
        }
        this.h = 0.0f;
        androidx.compose.ui.graphics.layer.i.m(this.e, 0.0f);
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        e eVar = this.a;
        if (!eVar.a.a()) {
            f = this.f;
        } else if (eVar.a.a()) {
            d dVar = eVar.a;
            long j = dVar.e;
            f = (float) (1.0E9d / (j != 0 ? dVar.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (eVar.a.a()) {
                if ((eVar.a.a() ? eVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && eVar.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            androidx.compose.ui.graphics.layer.i.m(this.e, f);
        }
    }
}
