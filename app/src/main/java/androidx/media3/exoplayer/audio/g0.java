package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public boolean A;
    public long B;
    public final com.app.mlounge.data.music.e a;
    public final androidx.media3.common.util.e0 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final y h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public g0(com.app.mlounge.data.music.e eVar, androidx.media3.common.util.e0 e0Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = eVar;
        this.b = e0Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new y(audioTrack, eVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zM = androidx.media3.common.util.j0.M(i);
        this.g = zM;
        this.f = zM ? androidx.media3.common.util.j0.W(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.p = jElapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jB;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jB = this.u != -9223372036854775807L ? androidx.media3.common.util.j0.W(i2, c()) : androidx.media3.common.util.j0.W(i2, a());
        } else {
            jB = androidx.media3.common.util.j0.B(this.i, j + this.k);
        }
        long jMax = Math.max(0L, jB - this.n);
        return this.u != -9223372036854775807L ? Math.min(androidx.media3.common.util.j0.W(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + androidx.media3.common.util.j0.Y(androidx.media3.common.util.j0.B(this.i, androidx.media3.common.util.j0.Q(SystemClock.elapsedRealtime()) - this.u), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jE = androidx.media3.common.util.j0.E(this.i, j - j2);
        this.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - androidx.media3.common.util.j0.d0(jE);
        this.j = -9223372036854775807L;
        androidx.media3.common.util.p pVar = ((d0) this.a.y).j;
        pVar.getClass();
        if (Thread.currentThread() == pVar.a) {
            pVar.e(-1, new a0(jCurrentTimeMillis, 0));
        }
    }
}
