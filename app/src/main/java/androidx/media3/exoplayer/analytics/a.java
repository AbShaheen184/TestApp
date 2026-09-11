package androidx.media3.exoplayer.analytics;

import androidx.media3.common.v0;
import androidx.media3.exoplayer.source.v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;
    public final v0 b;
    public final int c;
    public final v d;
    public final long e;
    public final v0 f;
    public final int g;
    public final v h;
    public final long i;
    public final long j;

    public a(long j, v0 v0Var, int i, v vVar, long j2, v0 v0Var2, int i2, v vVar2, long j3, long j4) {
        this.a = j;
        this.b = v0Var;
        this.c = i;
        this.d = vVar;
        this.e = j2;
        this.f = v0Var2;
        this.g = i2;
        this.h = vVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && this.b.equals(aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
