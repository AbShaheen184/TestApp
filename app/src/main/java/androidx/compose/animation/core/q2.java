package androidx.compose.animation.core;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements m2 {
    public long e = -9223372036854775807L;
    public long y = -9223372036854775807L;
    public Object z;

    @Override // androidx.compose.animation.core.m2
    public boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.m2
    public long b(s sVar, s sVar2, s sVar3) {
        return Long.MAX_VALUE;
    }

    public long c(long j) {
        long j2 = j + this.y;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.e;
        return j2 - ((j2 / j3) * j3);
    }

    public s d(long j, s sVar, s sVar2, s sVar3) {
        long j2 = this.y;
        long j3 = j + j2;
        long j4 = this.e;
        return j3 > j4 ? ((o2) this.z).i(j4 - j2, sVar, sVar3, sVar2) : sVar2;
    }

    public void e(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.z) == null) {
            this.z = exc;
        }
        if (this.e == -9223372036854775807L && androidx.media3.exoplayer.audio.n0.c0.get() <= 0) {
            this.e = 200 + jElapsedRealtime;
        }
        long j = this.e;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.y = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.z;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.z;
        this.z = null;
        this.e = -9223372036854775807L;
        this.y = -9223372036854775807L;
        throw exc3;
    }

    @Override // androidx.compose.animation.core.m2
    public s i(long j, s sVar, s sVar2, s sVar3) {
        return ((o2) this.z).i(c(j), sVar, sVar2, d(j, sVar, sVar3, sVar2));
    }

    @Override // androidx.compose.animation.core.m2
    public s t(long j, s sVar, s sVar2, s sVar3) {
        return ((o2) this.z).t(c(j), sVar, sVar2, d(j, sVar, sVar3, sVar2));
    }
}
