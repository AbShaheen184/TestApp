package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.q2;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.collect.a1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public androidx.media3.common.f S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final c2 b;
    public Handler b0;
    public final h0 c;
    public final v0 d;
    public final androidx.media3.common.audio.t e;
    public final u0 f;
    public final a1 g;
    public final ArrayDeque h;
    public int i;
    public k0 j;
    public final q2 k;
    public final q2 l;
    public androidx.media3.exoplayer.analytics.k m;
    public com.app.mlounge.data.music.e n;
    public androidx.compose.foundation.lazy.grid.l o;
    public androidx.compose.foundation.lazy.grid.l p;
    public androidx.media3.common.audio.i q;
    public q r;
    public i0 s;
    public d0 t;
    public androidx.media3.common.e u;
    public m0 v;
    public m0 w;
    public androidx.media3.common.l0 x;
    public boolean y;
    public long z;

    public n0(l0 l0Var) {
        int deviceId;
        Context context = l0Var.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = androidx.media3.common.e.b;
        this.b = l0Var.c;
        this.i = 0;
        this.r = l0Var.f;
        h0 h0Var = new h0();
        this.c = h0Var;
        v0 v0Var = new v0();
        v0Var.m = androidx.media3.common.util.j0.b;
        this.d = v0Var;
        this.e = new androidx.media3.common.audio.t();
        this.f = new u0();
        this.g = com.google.common.collect.h0.t(v0Var, h0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new androidx.media3.common.f();
        androidx.media3.common.l0 l0Var2 = androidx.media3.common.l0.d;
        this.w = new m0(l0Var2, 0L, 0L);
        this.x = l0Var2;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new q2();
        this.l = new q2();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int i(ByteBuffer byteBuffer, int i) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((androidx.media3.container.r.e(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = androidx.media3.common.util.j0.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        net.luminis.tls.engine.impl.c.a();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    net.luminis.tls.engine.impl.c.a();
                    return 0;
                case 10:
                    return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = androidx.media3.common.util.j0.a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return androidx.media3.extractor.b.m(new androidx.media3.common.util.v(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return androidx.media3.extractor.b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * LibretroCore.SCREEN_WIDTH;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        androidx.media3.common.l0 l0Var;
        boolean zV = v();
        boolean z = false;
        c2 c2Var = this.b;
        if (zV) {
            l0Var = androidx.media3.common.l0.d;
        } else {
            if (this.V || !androidx.compose.foundation.lazy.grid.l.a(this.p)) {
                l0Var = androidx.media3.common.l0.d;
            } else {
                int i = ((androidx.media3.common.r) this.p.c).I;
                l0Var = this.x;
                androidx.media3.common.audio.s sVar = (androidx.media3.common.audio.s) c2Var.A;
                float f = l0Var.a;
                sVar.getClass();
                com.google.android.material.motion.a.f(f > 0.0f);
                if (sVar.c != f) {
                    sVar.c = f;
                    sVar.i = true;
                }
                float f2 = l0Var.b;
                com.google.android.material.motion.a.f(f2 > 0.0f);
                if (sVar.d != f2) {
                    sVar.d = f2;
                    sVar.i = true;
                }
            }
            this.x = l0Var;
        }
        androidx.media3.common.l0 l0Var2 = l0Var;
        if (!this.V && androidx.compose.foundation.lazy.grid.l.a(this.p)) {
            int i2 = ((androidx.media3.common.r) this.p.c).I;
            z = this.y;
            ((s0) c2Var.z).o = z;
        }
        this.y = z;
        this.h.add(new m0(l0Var2, Math.max(0L, j), androidx.media3.common.util.j0.W(((p) this.p.e).b, j())));
        androidx.media3.common.audio.i iVar = (androidx.media3.common.audio.i) this.p.f;
        this.q = iVar;
        iVar.a();
        com.app.mlounge.data.music.e eVar = this.n;
        if (eVar != null) {
            final boolean z2 = this.y;
            final t tVar = ((q0) eVar.y).g1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.x xVar = tVar.b;
                        String str = androidx.media3.common.util.j0.a;
                        androidx.media3.exoplayer.c0 c0Var = xVar.e;
                        boolean z3 = c0Var.c0;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        c0Var.c0 = z4;
                        c0Var.m.e(23, new androidx.media3.exoplayer.p(1, z4));
                    }
                });
            }
        }
    }

    public final d0 b(p pVar) throws v {
        try {
            return ((f0) this.r).a(pVar);
        } catch (n e) {
            v vVar = new v(pVar.b, pVar.c, pVar.a, pVar.f, (androidx.media3.common.r) this.p.c, pVar.e, e);
            com.app.mlounge.data.music.e eVar = this.n;
            if (eVar == null) {
                throw vVar;
            }
            eVar.u(vVar);
            throw vVar;
        }
    }

    public final void c(androidx.media3.common.r rVar, int[] iArr) throws u {
        androidx.media3.common.audio.i iVar;
        androidx.media3.common.r rVar2;
        int i;
        int iU;
        if (this.s == null && this.a != null) {
            i0 i0Var = new i0(this);
            this.s = i0Var;
            f0 f0Var = (f0) this.r;
            f0Var.f();
            if (f0Var.f == null) {
                f0Var.f = new androidx.media3.common.util.p(Thread.currentThread());
            }
            f0Var.f.a(i0Var);
        }
        String str = rVar.o;
        int i2 = rVar.G;
        int i3 = rVar.I;
        if ("audio/raw".equals(str)) {
            com.google.android.material.motion.a.f(androidx.media3.common.util.j0.M(i3));
            int iU2 = androidx.media3.common.util.j0.u(i3) * i2;
            com.google.common.collect.d0 d0Var = new com.google.common.collect.d0(4);
            d0Var.c(this.g);
            d0Var.b(this.e);
            d0Var.f((androidx.media3.common.audio.m[]) this.b.y);
            iVar = new androidx.media3.common.audio.i(d0Var.g());
            if (iVar.equals(this.q)) {
                iVar = this.q;
            }
            int i4 = rVar.J;
            int i5 = rVar.K;
            v0 v0Var = this.d;
            v0Var.i = i4;
            v0Var.j = i5;
            this.c.i = iArr;
            androidx.media3.common.audio.j jVar = new androidx.media3.common.audio.j(rVar.H, i2, i3);
            try {
                com.google.common.collect.h0 h0Var = iVar.a;
                if (jVar.equals(androidx.media3.common.audio.j.e)) {
                    throw new androidx.media3.common.audio.l(jVar);
                }
                for (int i6 = 0; i6 < h0Var.size(); i6++) {
                    androidx.media3.common.audio.m mVar = (androidx.media3.common.audio.m) h0Var.get(i6);
                    androidx.media3.common.audio.j jVarF = mVar.f(jVar);
                    if (mVar.isActive()) {
                        com.google.android.material.motion.a.q(!jVarF.equals(androidx.media3.common.audio.j.e));
                        jVar = jVarF;
                    }
                }
                int i7 = jVar.b;
                int i8 = jVar.c;
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.H = i8;
                qVarA.G = jVar.a;
                qVarA.F = i7;
                rVar2 = new androidx.media3.common.r(qVarA);
                i = iU2;
                iU = androidx.media3.common.util.j0.u(i8) * i7;
            } catch (androidx.media3.common.audio.l e) {
                throw new u(e, rVar);
            }
        } else {
            iVar = new androidx.media3.common.audio.i(a1.B);
            rVar2 = rVar;
            i = -1;
            iU = -1;
        }
        androidx.media3.common.audio.i iVar2 = iVar;
        k kVarG = g(rVar2);
        androidx.media3.common.r rVar3 = kVarG.a;
        try {
            p pVarC = ((f0) this.r).c(kVarG);
            boolean z = pVarC.e;
            if (pVarC.a == 0) {
                throw new u("Invalid output encoding (isOffload=" + z + ")", rVar3);
            }
            if (pVarC.c == 0) {
                throw new u("Invalid output channel config (isOffload=" + z + ")", rVar3);
            }
            this.X = false;
            androidx.compose.foundation.lazy.grid.l lVar = new androidx.compose.foundation.lazy.grid.l(rVar, rVar2, i, iU, pVarC, iVar2);
            if (n()) {
                this.o = lVar;
            } else {
                this.p = lVar;
            }
        } catch (j e2) {
            throw new u(e2, rVar);
        }
    }

    public final void d(long j) throws w {
        com.app.mlounge.data.music.e eVar;
        androidx.media3.exoplayer.f0 f0Var;
        if (this.K == null) {
            return;
        }
        q2 q2Var = this.l;
        if (((Exception) q2Var.z) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < q2Var.y)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z = false;
        try {
            boolean zG = this.t.g(this.J, j, this.K);
            this.W = SystemClock.elapsedRealtime();
            q2Var.z = null;
            q2Var.e = -9223372036854775807L;
            q2Var.y = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (eVar = this.n) != null && !zG && !this.Y && (f0Var = ((q0) eVar.y).f0) != null) {
                    f0Var.a.p0 = true;
                }
            }
            if (androidx.compose.foundation.lazy.grid.l.a(this.p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zG) {
                if (!androidx.compose.foundation.lazy.grid.l.a(this.p)) {
                    com.google.android.material.motion.a.q(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (i e) {
            boolean z2 = e.y;
            if (z2) {
                if (j() > 0) {
                    z = true;
                } else if (this.t.c()) {
                    if (((p) this.p.e).e) {
                        this.X = true;
                    }
                    z = true;
                }
            }
            w wVar = new w(e.e, (androidx.media3.common.r) this.p.c, z);
            com.app.mlounge.data.music.e eVar2 = this.n;
            if (eVar2 != null) {
                eVar2.u(wVar);
            }
            if (z2) {
                throw wVar;
            }
            q2Var.e(wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws w {
        ByteBuffer byteBuffer;
        if (!this.q.d()) {
            d(Long.MIN_VALUE);
            if (this.K == null) {
                return true;
            }
            return false;
        }
        androidx.media3.common.audio.i iVar = this.q;
        if (iVar.d() && !iVar.d) {
            iVar.d = true;
            ((androidx.media3.common.audio.m) iVar.b.get(0)).e();
        }
        q(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new m0(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            androidx.media3.common.audio.i iVar = (androidx.media3.common.audio.i) this.p.f;
            this.q = iVar;
            iVar.a();
            this.j = null;
            androidx.compose.foundation.lazy.grid.l lVar = this.o;
            if (lVar != null) {
                this.p = lVar;
                this.o = null;
            }
            c0.incrementAndGet();
            d0 d0Var = this.t;
            if (d0Var.f.d.getPlayState() == 3) {
                d0Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && d0Var.c()) {
                c0 c0Var = d0Var.i;
                c0Var.getClass();
                c0.a(c0Var);
            }
            com.google.firebase.messaging.o oVar = d0Var.e;
            if (oVar != null) {
                AudioTrack audioTrack = (AudioTrack) oVar.y;
                z zVar = (z) oVar.B;
                zVar.getClass();
                audioTrack.removeOnRoutingChangedListener(zVar);
                oVar.B = null;
                d0Var.e = null;
            }
            AudioTrack audioTrack2 = d0Var.a;
            androidx.media3.common.util.p pVar = d0Var.j;
            Handler handlerQ = androidx.media3.common.util.j0.q(null);
            synchronized (d0.s) {
                try {
                    if (d0.t == null) {
                        d0.t = Executors.newSingleThreadScheduledExecutor(new androidx.media3.common.util.i0());
                    }
                    d0.u++;
                    d0.t.schedule(new androidx.compose.foundation.text.contextmenu.internal.g(3, audioTrack2, handlerQ, pVar), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        q2 q2Var = this.l;
        q2Var.z = null;
        q2Var.e = -9223372036854775807L;
        q2Var.y = -9223372036854775807L;
        q2 q2Var2 = this.k;
        q2Var2.z = null;
        q2Var2.e = -9223372036854775807L;
        q2Var2.y = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final k g(androidx.media3.common.r rVar) {
        k kVar = new k(rVar);
        kVar.b = this.u;
        kVar.d = this.i != 0;
        kVar.c = this.T;
        kVar.e = this.Q;
        kVar.g = this.V;
        kVar.h = -1;
        kVar.f = this.U;
        return new k(kVar);
    }

    public final int h(androidx.media3.common.r rVar) {
        boolean z;
        if (!androidx.media3.common.util.j0.M(rVar.I) || rVar.I == 2) {
            z = false;
        } else {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.H = 2;
            rVar = new androidx.media3.common.r(qVarA);
            z = true;
        }
        int i = ((f0) this.r).b(g(rVar)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!androidx.compose.foundation.lazy.grid.l.a(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final boolean k(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.n0.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.N) {
            return false;
        }
        long j = j();
        long jA = this.t.a();
        d0 d0Var = this.t;
        d0Var.getClass();
        return j > androidx.media3.common.util.j0.Y(jA, (long) d0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean m() throws v {
        d0 d0VarB;
        androidx.media3.exoplayer.mediacodec.j jVar;
        q2 q2Var = this.k;
        if (((Exception) q2Var.z) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < q2Var.y)) {
            return false;
        }
        try {
            d0VarB = b((p) this.p.e);
        } catch (v e) {
            int i = ((p) this.p.e).f;
            while (true) {
                androidx.compose.foundation.lazy.grid.l lVar = this.p;
                if (i <= 1000000) {
                    if (!((p) lVar.e).e) {
                        throw e;
                    }
                    this.X = true;
                    throw e;
                }
                int i2 = i / 2;
                int i3 = lVar.b;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                o oVarA = ((p) lVar.e).a();
                oVarA.f = i5;
                p pVar = new p(oVarA);
                try {
                    d0VarB = b(pVar);
                    androidx.compose.foundation.lazy.grid.l lVar2 = this.p;
                    this.p = new androidx.compose.foundation.lazy.grid.l((androidx.media3.common.r) lVar2.c, (androidx.media3.common.r) lVar2.d, lVar2.a, lVar2.b, pVar, (androidx.media3.common.audio.i) lVar2.f);
                    break;
                } catch (v e2) {
                    e.addSuppressed(e2);
                    i = i5;
                }
            }
        }
        this.t = d0VarB;
        k0 k0Var = new k0(this, (p) this.p.e);
        this.j = k0Var;
        d0VarB.j.a(k0Var);
        if (this.t.c()) {
            androidx.compose.foundation.lazy.grid.l lVar3 = this.p;
            if (((p) lVar3.e).k) {
                d0 d0Var = this.t;
                androidx.media3.common.r rVar = (androidx.media3.common.r) lVar3.c;
                d0Var.d(rVar.J, rVar.K);
            }
        }
        androidx.media3.exoplayer.analytics.k kVar = this.m;
        if (kVar != null) {
            this.t.f(kVar);
        }
        if (n()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z = audioSessionId != this.Q;
        this.Q = audioSessionId;
        com.app.mlounge.data.music.e eVar = this.n;
        if (eVar != null) {
            int i6 = ((p) this.p.e).a;
            o0 o0Var = new o0();
            t tVar = ((q0) eVar.y).g1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new r(tVar, o0Var, 5));
            }
            if (z) {
                this.R = true;
                androidx.compose.foundation.lazy.grid.l lVar4 = this.p;
                o oVarA2 = ((p) lVar4.e).a();
                oVarA2.h = this.Q;
                this.p = new androidx.compose.foundation.lazy.grid.l((androidx.media3.common.r) lVar4.c, (androidx.media3.common.r) lVar4.d, lVar4.a, lVar4.b, new p(oVarA2), (androidx.media3.common.audio.i) lVar4.f);
                androidx.compose.foundation.lazy.grid.l lVar5 = this.o;
                if (lVar5 != null) {
                    o oVarA3 = ((p) lVar5.e).a();
                    oVarA3.h = this.Q;
                    this.o = new androidx.compose.foundation.lazy.grid.l((androidx.media3.common.r) lVar5.c, (androidx.media3.common.r) lVar5.d, lVar5.a, lVar5.b, new p(oVarA3), (androidx.media3.common.audio.i) lVar5.f);
                }
                com.app.mlounge.data.music.e eVar2 = this.n;
                int i7 = this.Q;
                q0 q0Var = (q0) eVar2.y;
                if (Build.VERSION.SDK_INT >= 35 && (jVar = q0Var.i1) != null) {
                    jVar.d(i7);
                }
                t tVar2 = q0Var.g1;
                Handler handler2 = tVar2.a;
                if (handler2 != null) {
                    handler2.post(new androidx.compose.foundation.text.input.internal.d(tVar2, i7, 4));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            d0 d0Var = this.t;
            g0 g0Var = d0Var.f;
            if (g0Var.u != -9223372036854775807L) {
                g0Var.b.getClass();
                g0Var.u = androidx.media3.common.util.j0.Q(SystemClock.elapsedRealtime());
            }
            g0Var.j = androidx.media3.common.util.j0.W(g0Var.e, g0Var.a());
            g0Var.h.a(0);
            if (!d0Var.k || d0Var.c()) {
                d0Var.a.play();
            }
        }
    }

    public final void p() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.c()) {
            this.N = false;
        }
        d0 d0Var = this.t;
        if (d0Var.k) {
            return;
        }
        d0Var.k = true;
        g0 g0Var = d0Var.f;
        long jB = d0Var.b();
        g0Var.w = g0Var.a();
        g0Var.b.getClass();
        g0Var.u = androidx.media3.common.util.j0.Q(SystemClock.elapsedRealtime());
        g0Var.x = jB;
        d0Var.a.stop();
        d0Var.p = 0;
    }

    public final void q(long j) throws w {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                androidx.media3.common.audio.i iVar = this.q;
                if (iVar.d()) {
                    ByteBuffer byteBuffer3 = iVar.c[iVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        iVar.e(androidx.media3.common.audio.m.a);
                        byteBuffer = iVar.c[iVar.b()];
                    }
                } else {
                    byteBuffer = androidx.media3.common.audio.m.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.i iVar2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (iVar2.d() && !iVar2.d) {
                        iVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void r() {
        if (this.p != null) {
            androidx.compose.foundation.lazy.grid.l lVar = this.o;
            if (lVar != null) {
                this.p = lVar;
                this.o = null;
            }
            try {
                p pVarC = ((f0) this.r).c(g((androidx.media3.common.r) this.p.d));
                androidx.compose.foundation.lazy.grid.l lVar2 = this.p;
                this.p = new androidx.compose.foundation.lazy.grid.l((androidx.media3.common.r) lVar2.c, (androidx.media3.common.r) lVar2.d, lVar2.a, lVar2.b, pVarC, (androidx.media3.common.audio.i) lVar2.f);
            } catch (j e) {
                throw new IllegalStateException(new u(e, (androidx.media3.common.r) this.p.c));
            }
        }
        f();
    }

    public final void s() {
        f();
        com.google.common.collect.e0 e0VarListIterator = this.g.listIterator(0);
        while (e0VarListIterator.hasNext()) {
            ((androidx.media3.common.audio.m) e0VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        androidx.media3.common.audio.i iVar = this.q;
        if (iVar != null) {
            com.google.common.collect.h0 h0Var = iVar.a;
            for (int i = 0; i < h0Var.size(); i++) {
                androidx.media3.common.audio.m mVar = (androidx.media3.common.audio.m) h0Var.get(i);
                mVar.d(androidx.media3.common.audio.k.b);
                mVar.reset();
            }
            iVar.b.clear();
            iVar.c = new ByteBuffer[0];
            androidx.media3.common.audio.j jVar = androidx.media3.common.audio.j.e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            d0 d0Var = this.t;
            androidx.media3.common.l0 l0Var = this.x;
            AudioTrack audioTrack = d0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(androidx.media3.common.util.j0.i(l0Var.a, 0.1f, d0Var.c)).setPitch(androidx.media3.common.util.j0.i(l0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                androidx.media3.common.util.c.u("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            g0 g0Var = d0Var.f;
            g0Var.i = audioTrack.getPlaybackParams().getSpeed();
            g0Var.h.a(0);
            g0Var.k = 0L;
            g0Var.t = 0;
            g0Var.s = 0;
            g0Var.l = 0L;
            g0Var.y = -9223372036854775807L;
            g0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new androidx.media3.common.l0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0221  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0061 A[SYNTHETIC] */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        com.google.android.material.motion.a.q(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (androidx.compose.foundation.lazy.grid.l.a(this.p)) {
                int iY = (int) androidx.media3.common.util.j0.Y(androidx.media3.common.util.j0.Q(20L), ((p) this.p.e).b, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = iY;
                if (j >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    androidx.compose.foundation.lazy.grid.l lVar = this.p;
                    int i5 = ((p) lVar.e).a;
                    int i6 = lVar.b;
                    int i7 = (int) j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iY) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fI = androidx.media3.common.util.j0.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (fI < 0.0f ? (-fI) * (-2.1474836E9f) : fI * 2.1474836E9f);
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else if (i5 != 1879048192) {
                                    org.mozilla.javascript.c.a();
                                    return;
                                } else {
                                    double dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (dMax < 0.0d ? (-dMax) * (-2.147483648E9d) : dMax * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 == 1879048192) {
                                    org.mozilla.javascript.c.a();
                                    return;
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 == 1879048192) {
                                org.mozilla.javascript.c.a();
                                return;
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.K = byteBufferOrder;
        }
    }

    public final boolean v() {
        androidx.compose.foundation.lazy.grid.l lVar = this.p;
        return lVar != null && ((p) lVar.e).j;
    }
}
