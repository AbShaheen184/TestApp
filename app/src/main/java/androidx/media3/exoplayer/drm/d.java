package androidx.media3.exoplayer.drm;

import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.source.a0;
import androidx.media3.exoplayer.source.b0;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.v;
import androidx.media3.exoplayer.source.x;
import androidx.media3.exoplayer.source.y;
import androidx.media3.exoplayer.source.z;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final v b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i, v vVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = vVar;
    }

    public void a(androidx.media3.common.util.i iVar) {
        for (b0 b0Var : this.c) {
            j0.U(b0Var.a, new androidx.activity.c(23, iVar, b0Var.b));
        }
    }

    public void b(int i, r rVar, int i2, Object obj, long j) {
        a(new androidx.media3.exoplayer.analytics.c(3, this, new s(1, i, rVar, i2, obj, j0.d0(j), -9223372036854775807L)));
    }

    public void c(n nVar, int i, int i2, r rVar, int i3, Object obj, long j, long j2) {
        a(new y(this, nVar, new s(i, i2, rVar, i3, obj, j0.d0(j), j0.d0(j2)), 1));
    }

    public void d(n nVar, int i, int i2, r rVar, int i3, Object obj, long j, long j2) {
        a(new y(this, nVar, new s(i, i2, rVar, i3, obj, j0.d0(j), j0.d0(j2)), 0));
    }

    public void e(n nVar, int i, int i2, r rVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new z(this, nVar, new s(i, i2, rVar, i3, obj, j0.d0(j), j0.d0(j2)), iOException, z));
    }

    public void f(n nVar, int i, IOException iOException, boolean z) {
        e(nVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void g(n nVar, int i, int i2, r rVar, int i3, Object obj, long j, long j2, int i4) {
        a(new x(this, nVar, new s(i, i2, rVar, i3, obj, j0.d0(j), j0.d0(j2)), i4));
    }

    public void h(long j, long j2, int i) {
        s sVar = new s(1, i, null, 3, null, j0.d0(j), j0.d0(j2));
        v vVar = this.b;
        vVar.getClass();
        a(new a0(0, this, vVar, sVar));
    }
}
