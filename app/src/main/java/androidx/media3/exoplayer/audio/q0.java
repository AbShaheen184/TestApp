package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.appcompat.widget.c2;
import androidx.media3.exoplayer.h1;
import com.caverock.androidsvg.y1;
import com.google.common.collect.a1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends androidx.media3.exoplayer.mediacodec.r implements androidx.media3.exoplayer.o0 {
    public final Context f1;
    public final t g1;
    public final n0 h1;
    public final androidx.media3.exoplayer.mediacodec.j i1;
    public int j1;
    public boolean k1;
    public androidx.media3.common.r l1;
    public androidx.media3.common.r m1;
    public long n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public boolean t1;
    public long u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, androidx.media3.exoplayer.mediacodec.k kVar, Handler handler, androidx.media3.exoplayer.x xVar, n0 n0Var) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        androidx.media3.exoplayer.mediacodec.j jVar = Build.VERSION.SDK_INT >= 35 ? new androidx.media3.exoplayer.mediacodec.j() : null;
        this.f1 = context.getApplicationContext();
        this.h1 = n0Var;
        this.i1 = jVar;
        this.s1 = -1000;
        this.g1 = new t(handler, xVar, 0);
        this.u1 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final int A0(androidx.media3.exoplayer.mediacodec.i iVar, androidx.media3.common.r rVar) {
        int iE0;
        a1 a1VarG;
        boolean z;
        boolean z2;
        int iF = androidx.media3.exoplayer.a.f(1, 0, 0, 0);
        String str = rVar.o;
        String str2 = rVar.o;
        if (!androidx.media3.common.i0.k(str)) {
            return androidx.media3.exoplayer.a.f(0, 0, 0, 0);
        }
        int i = rVar.P;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        n0 n0Var = this.h1;
        if (z4) {
            if (z3) {
                List listE = androidx.media3.exoplayer.mediacodec.v.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : (androidx.media3.exoplayer.mediacodec.o) listE.get(0)) == null) {
                    iE0 = 0;
                }
            }
            iE0 = E0(rVar);
            if (n0Var.h(rVar) != 0) {
                return androidx.media3.exoplayer.a.f(4, 8, 32, iE0);
            }
        } else {
            iE0 = 0;
        }
        if (!"audio/raw".equals(str2) || n0Var.h(rVar) != 0) {
            int i3 = rVar.G;
            int i4 = rVar.H;
            androidx.media3.common.q qVar = new androidx.media3.common.q();
            qVar.n = androidx.media3.common.i0.p("audio/raw");
            qVar.F = i3;
            qVar.G = i4;
            qVar.H = 2;
            if (n0Var.h(new androidx.media3.common.r(qVar)) != 0) {
                if (str2 == null) {
                    a1VarG = a1.B;
                } else if (n0Var.h(rVar) != 0) {
                    List listE2 = androidx.media3.exoplayer.mediacodec.v.e("audio/raw", false, false);
                    androidx.media3.exoplayer.mediacodec.o oVar = listE2.isEmpty() ? null : (androidx.media3.exoplayer.mediacodec.o) listE2.get(0);
                    if (oVar != null) {
                        a1VarG = com.google.common.collect.h0.s(oVar);
                    } else {
                        a1VarG = androidx.media3.exoplayer.mediacodec.v.g(iVar, rVar, false, false);
                    }
                } else {
                    a1VarG = androidx.media3.exoplayer.mediacodec.v.g(iVar, rVar, false, false);
                }
                if (!a1VarG.isEmpty()) {
                    if (!z4) {
                        return androidx.media3.exoplayer.a.f(2, 0, 0, 0);
                    }
                    androidx.media3.exoplayer.mediacodec.o oVar2 = (androidx.media3.exoplayer.mediacodec.o) a1VarG.get(0);
                    Context context = this.f1;
                    boolean zE = oVar2.e(context, rVar);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= a1VarG.A) {
                                z = zE;
                                z2 = true;
                                break;
                            }
                            androidx.media3.exoplayer.mediacodec.o oVar3 = (androidx.media3.exoplayer.mediacodec.o) a1VarG.get(i5);
                            if (oVar3.e(context, rVar)) {
                                z2 = false;
                                oVar2 = oVar3;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zE;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && oVar2.f(rVar)) {
                        i2 = 16;
                    }
                    return (oVar2.g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iE0;
                }
            }
        }
        return iF;
    }

    public final int E0(androidx.media3.common.r rVar) {
        h hVarA;
        n0 n0Var = this.h1;
        if (n0Var.X) {
            hVarA = h.d;
        } else {
            m mVarB = ((f0) n0Var.r).b(n0Var.g(rVar));
            g gVar = new g();
            gVar.a = mVarB.a;
            gVar.b = mVarB.b;
            gVar.c = mVarB.c;
            hVarA = gVar.a();
        }
        if (!hVarA.a) {
            return 0;
        }
        int i = hVarA.b ? 1536 : 512;
        return hVarA.c ? i | 2048 : i;
    }

    public final void F0() {
        long j;
        long jMax;
        long j2;
        m();
        n0 n0Var = this.h1;
        c2 c2Var = n0Var.b;
        if (!n0Var.n() || n0Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(n0Var.t.a(), androidx.media3.common.util.j0.W(((p) n0Var.p.e).b, n0Var.j()));
            ArrayDeque arrayDeque = n0Var.h;
            while (!arrayDeque.isEmpty() && jMin >= ((m0) arrayDeque.getFirst()).c) {
                n0Var.w = (m0) arrayDeque.remove();
            }
            m0 m0Var = n0Var.w;
            long jY = jMin - m0Var.c;
            long jB = androidx.media3.common.util.j0.B(m0Var.a.a, jY);
            if (arrayDeque.isEmpty()) {
                androidx.media3.common.audio.s sVar = (androidx.media3.common.audio.s) c2Var.A;
                if (!sVar.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (sVar.n >= 1024) {
                    long j3 = sVar.m;
                    androidx.media3.common.audio.r rVar = sVar.j;
                    rVar.getClass();
                    long jN = j3 - ((long) (rVar.i.n() * (rVar.j * rVar.b)));
                    int i = sVar.h.a;
                    int i2 = sVar.g.a;
                    j = Long.MIN_VALUE;
                    long j4 = sVar.n;
                    jY = i == i2 ? androidx.media3.common.util.j0.Y(jY, jN, j4, RoundingMode.DOWN) : androidx.media3.common.util.j0.Y(jY, jN * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jY = (long) (((double) sVar.c) * jY);
                }
                m0 m0Var2 = n0Var.w;
                j2 = m0Var2.b + jY;
                m0Var2.d = jY - jB;
            } else {
                j = Long.MIN_VALUE;
                m0 m0Var3 = n0Var.w;
                j2 = m0Var3.b + jB + m0Var3.d;
            }
            long j5 = ((s0) c2Var.z).q;
            jMax = androidx.media3.common.util.j0.W(((p) n0Var.p.e).b, j5) + j2;
            long j6 = n0Var.Z;
            if (j5 > j6) {
                long jW = androidx.media3.common.util.j0.W(((p) n0Var.p.e).b, j5 - j6);
                n0Var.Z = j5;
                n0Var.a0 += jW;
                if (n0Var.b0 == null) {
                    n0Var.b0 = new Handler(Looper.myLooper());
                }
                n0Var.b0.removeCallbacksAndMessages(null);
                n0Var.b0.postDelayed(new androidx.activity.l(n0Var, 19), 100L);
            }
        }
        if (jMax != j) {
            if (!this.o1) {
                jMax = Math.max(this.n1, jMax);
            }
            this.n1 = jMax;
            this.o1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final androidx.media3.exoplayer.d I(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z) {
        androidx.media3.exoplayer.d dVarB = oVar.b(rVar, rVar2);
        int i = dVarB.e;
        if (this.e0 == null && z0(rVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(oVar.a);
        if (rVar2.p > this.j1) {
            i |= 64;
        }
        int i2 = i;
        return new androidx.media3.exoplayer.d(oVar.a, rVar, rVar2, i2 != 0 ? 0 : dVarB.d, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final float Q(float f, androidx.media3.common.r rVar, androidx.media3.common.r[] rVarArr) {
        int iMax = -1;
        for (androidx.media3.common.r rVar2 : rVarArr) {
            int i = rVar2.H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final ArrayList R(androidx.media3.exoplayer.mediacodec.i iVar, androidx.media3.common.r rVar, boolean z) {
        a1 a1VarG;
        if (rVar.o == null) {
            a1VarG = a1.B;
        } else if (this.h1.h(rVar) != 0) {
            List listE = androidx.media3.exoplayer.mediacodec.v.e("audio/raw", false, false);
            androidx.media3.exoplayer.mediacodec.o oVar = listE.isEmpty() ? null : (androidx.media3.exoplayer.mediacodec.o) listE.get(0);
            if (oVar != null) {
                a1VarG = com.google.common.collect.h0.s(oVar);
            } else {
                a1VarG = androidx.media3.exoplayer.mediacodec.v.g(iVar, rVar, z, false);
            }
        } else {
            a1VarG = androidx.media3.exoplayer.mediacodec.v.g(iVar, rVar, z, false);
        }
        HashMap map = androidx.media3.exoplayer.mediacodec.v.a;
        ArrayList arrayList = new ArrayList(a1VarG);
        Collections.sort(arrayList, new androidx.compose.ui.semantics.y(new androidx.media3.exoplayer.analytics.c(2, this.f1, rVar), 1));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final long S(long j, long j2, boolean z) {
        long jY;
        n0 n0Var = this.h1;
        boolean z2 = n0Var.l() && this.u1 != -9223372036854775807L;
        if (this.t1) {
            if (!n0Var.n()) {
                jY = -9223372036854775807L;
            } else if (androidx.compose.foundation.lazy.grid.l.a(n0Var.p)) {
                jY = androidx.media3.common.util.j0.W(((p) n0Var.p.e).b, n0Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = n0Var.t.a.getBufferSizeInFrames();
                int iJ = androidx.media3.extractor.b.j(((p) n0Var.p.e).a);
                com.google.android.material.motion.a.q(iJ != -2147483647);
                jY = androidx.media3.common.util.j0.Y(bufferSizeInFrames, 1000000L, iJ, RoundingMode.DOWN);
            }
            if (this.r1 && z2 && jY != -9223372036854775807L) {
                float fMin = Math.min(jY, this.u1 - j);
                androidx.media3.common.l0 l0Var = n0Var.x;
                return Math.max(10000L, (long) ((fMin / (l0Var != null ? l0Var.a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.Q0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final y1 U(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        Integer num;
        androidx.media3.common.r[] rVarArr = this.G;
        rVarArr.getClass();
        String str = oVar.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = rVar.p;
        String str2 = rVar.o;
        int i = rVar.G;
        int i2 = 0;
        if (rVarArr.length != 1) {
            for (androidx.media3.common.r rVar2 : rVarArr) {
                if (oVar.b(rVar, rVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, rVar2.p);
                }
            }
        }
        this.j1 = iMax;
        this.k1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = oVar.c;
        int i3 = this.j1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i4 = rVar.H;
        mediaFormat.setInteger("sample-rate", i4);
        androidx.media3.common.util.c.s(mediaFormat, rVar.r);
        androidx.media3.common.util.c.o(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = androidx.media3.common.util.f.b(rVar);
            if (pairB != null) {
                androidx.media3.common.util.c.o(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                androidx.media3.common.util.c.o(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = androidx.media3.common.i0.p("audio/raw");
        qVar.F = i;
        qVar.G = i4;
        qVar.H = 4;
        androidx.media3.common.r rVar3 = new androidx.media3.common.r(qVar);
        n0 n0Var = this.h1;
        if (n0Var.h(rVar3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.s1));
        }
        androidx.media3.common.r rVar4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            q qVar2 = n0Var.r;
            b bVar = qVar2 instanceof f0 ? ((f0) qVar2).h : null;
            int i6 = 12;
            if (bVar == null) {
                androidx.media3.common.util.c.t("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                com.google.common.collect.k0 k0Var = p0.a;
                Iterator it = bVar.d.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!p0.a.contains(num));
                if (iIntValue != 0) {
                    i6 = iIntValue;
                } else {
                    for (Integer num2 : bVar.c) {
                        int iIntValue2 = num2.intValue();
                        if (p0.a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i6 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i6);
                mediaFormat.setInteger("channel-mask", i6);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        G(mediaFormat);
        if ("audio/raw".equals(oVar.b) && !"audio/raw".equals(str2)) {
            rVar4 = rVar;
        }
        this.m1 = rVar4;
        return new y1(oVar, mediaFormat, rVar, null, mediaCrypto, this.i1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void V(androidx.media3.decoder.e eVar) {
        androidx.media3.common.r rVar;
        androidx.compose.foundation.lazy.grid.l lVar;
        if (Build.VERSION.SDK_INT < 29 || (rVar = eVar.z) == null || !Objects.equals(rVar.o, "audio/opus") || !this.E0) {
            return;
        }
        ByteBuffer byteBuffer = eVar.E;
        byteBuffer.getClass();
        androidx.media3.common.r rVar2 = eVar.z;
        rVar2.getClass();
        int i = rVar2.J;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            n0 n0Var = this.h1;
            d0 d0Var = n0Var.t;
            if (d0Var == null || !d0Var.c() || (lVar = n0Var.p) == null || !((p) lVar.e).k) {
                return;
            }
            n0Var.t.d(i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.o0
    public final void a(androidx.media3.common.l0 l0Var) {
        n0 n0Var = this.h1;
        if (n0Var.v()) {
            n0Var.x = l0Var;
            n0Var.t();
            return;
        }
        androidx.media3.common.l0 l0Var2 = new androidx.media3.common.l0(androidx.media3.common.util.j0.i(l0Var.a, 0.1f, 8.0f), androidx.media3.common.util.j0.i(l0Var.b, 0.1f, 8.0f));
        n0Var.x = l0Var2;
        m0 m0Var = new m0(l0Var2, -9223372036854775807L, -9223372036854775807L);
        if (n0Var.n()) {
            n0Var.v = m0Var;
        } else {
            n0Var.w = m0Var;
        }
    }

    @Override // androidx.media3.exoplayer.o0
    public final long b() {
        if (this.E == 2) {
            F0();
        }
        return this.n1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void b0(Exception exc) {
        androidx.media3.common.util.c.g("MediaCodecAudioRenderer", "Audio codec error", exc);
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new r(tVar, exc, 2));
        }
    }

    @Override // androidx.media3.exoplayer.o0
    public final boolean c() {
        boolean z = this.q1;
        this.q1 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void c0(long j, long j2, String str) {
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new r(tVar, str, j, j2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) {
        androidx.media3.exoplayer.mediacodec.j jVar;
        n0 n0Var = this.h1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (n0Var.H != fFloatValue) {
                n0Var.H = fFloatValue;
                if (n0Var.n()) {
                    n0Var.t.a.setVolume(n0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            androidx.media3.common.e eVar = (androidx.media3.common.e) obj;
            eVar.getClass();
            if (n0Var.u.equals(eVar)) {
                return;
            }
            n0Var.u = eVar;
            if (n0Var.V) {
                return;
            }
            n0Var.r();
            return;
        }
        if (i == 6) {
            androidx.media3.common.f fVar = (androidx.media3.common.f) obj;
            fVar.getClass();
            if (n0Var.S.equals(fVar)) {
                return;
            }
            if (n0Var.t != null) {
                n0Var.S.getClass();
            }
            n0Var.S = fVar;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            n0Var.T = audioDeviceInfo;
            d0 d0Var = n0Var.t;
            if (d0Var != null) {
                d0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.s1 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.l lVar = this.k0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.s1));
                lVar.d(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            n0Var.y = ((Boolean) obj).booleanValue();
            m0 m0Var = new m0(n0Var.v() ? androidx.media3.common.l0.d : n0Var.x, -9223372036854775807L, -9223372036854775807L);
            if (n0Var.n()) {
                n0Var.v = m0Var;
                return;
            } else {
                n0Var.w = m0Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (n0Var.R) {
                if (n0Var.Q == iIntValue) {
                    n0Var.R = false;
                    if (n0Var.Q != iIntValue) {
                        n0Var.Q = iIntValue;
                        n0Var.P = iIntValue != 0;
                        n0Var.r();
                    }
                }
            } else if (n0Var.Q != iIntValue) {
                n0Var.Q = iIntValue;
                n0Var.P = iIntValue != 0;
                n0Var.r();
            }
            if (Build.VERSION.SDK_INT < 35 || (jVar = this.i1) == null) {
                return;
            }
            jVar.d(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = n0.c0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (n0Var.U == iIntValue2) {
                return;
            }
            n0Var.U = iIntValue2;
            n0Var.r();
            return;
        }
        if (i != 20) {
            super.d(i, obj);
            return;
        }
        obj.getClass();
        q qVar = (q) obj;
        if (qVar.equals(n0Var.r)) {
            return;
        }
        ((f0) n0Var.r).d();
        n0Var.r = qVar;
        i0 i0Var = n0Var.s;
        if (i0Var != null) {
            f0 f0Var = (f0) qVar;
            f0Var.f();
            if (f0Var.f == null) {
                f0Var.f = new androidx.media3.common.util.p(Thread.currentThread());
            }
            f0Var.f.a(i0Var);
        }
        n0Var.r();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void d0(androidx.media3.exoplayer.b bVar) {
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(15, tVar, bVar));
        }
    }

    @Override // androidx.media3.exoplayer.o0
    public final androidx.media3.common.l0 e() {
        return this.h1.x;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void e0(String str) {
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new r(tVar, str, 4));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final androidx.media3.exoplayer.d f0(androidx.media3.common.util.b bVar) throws androidx.media3.exoplayer.j {
        androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.z;
        rVar.getClass();
        this.l1 = rVar;
        androidx.media3.exoplayer.d dVarF0 = super.f0(bVar);
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new r(tVar, rVar, dVarF0));
        }
        return dVarF0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: u -> 0x00e8, TryCatch #0 {u -> 0x00e8, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e2, B:50:0x00ea, B:54:0x00f1, B:55:0x00f6), top: B:59:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void g0(androidx.media3.common.r rVar, MediaFormat mediaFormat) throws androidx.media3.exoplayer.j {
        int iD;
        androidx.media3.common.r rVar2 = this.m1;
        boolean z = true;
        int[] iArr = null;
        if (rVar2 != null) {
            rVar = rVar2;
        } else if (this.k0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(rVar.o)) {
                iD = rVar.I;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iD = mediaFormat.getInteger("pcm-encoding");
            } else {
                iD = mediaFormat.containsKey("v-bits-per-sample") ? androidx.media3.common.util.j0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            androidx.media3.common.q qVar = new androidx.media3.common.q();
            qVar.n = androidx.media3.common.i0.p("audio/raw");
            qVar.H = iD;
            qVar.I = rVar.J;
            qVar.J = rVar.K;
            qVar.k = rVar.l;
            qVar.a = rVar.a;
            qVar.b = rVar.b;
            qVar.c = com.google.common.collect.h0.o(rVar.c);
            qVar.d = rVar.d;
            qVar.e = rVar.e;
            qVar.f = rVar.f;
            qVar.F = mediaFormat.getInteger("channel-count");
            qVar.G = mediaFormat.getInteger("sample-rate");
            rVar = new androidx.media3.common.r(qVar);
            if (this.k1) {
                int i = rVar.G;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            n0 n0Var = this.h1;
            if (i2 >= 29) {
                if (this.E0) {
                    h1 h1Var = this.A;
                    h1Var.getClass();
                    if (h1Var.a != 0) {
                        h1 h1Var2 = this.A;
                        h1Var2.getClass();
                        int i3 = h1Var2.a;
                        n0Var.getClass();
                        if (i2 < 29) {
                            z = false;
                        }
                        com.google.android.material.motion.a.q(z);
                        n0Var.i = i3;
                    } else {
                        n0Var.getClass();
                        if (i2 >= 29) {
                            z = false;
                        }
                        com.google.android.material.motion.a.q(z);
                        n0Var.i = 0;
                    }
                } else {
                    n0Var.getClass();
                    if (i2 >= 29) {
                        z = false;
                    }
                    com.google.android.material.motion.a.q(z);
                    n0Var.i = 0;
                }
            }
            n0Var.c(rVar, iArr);
        } catch (u e) {
            throw g(e, e.e, false, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void h0() {
        this.h1.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void j0() {
        this.h1.E = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        if (!this.Q0) {
            return false;
        }
        n0 n0Var = this.h1;
        if (n0Var.n()) {
            return n0Var.L && !n0Var.l();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean m0(long j, long j2, androidx.media3.exoplayer.mediacodec.l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.r rVar) throws androidx.media3.exoplayer.j {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.u1 = -9223372036854775807L;
        if (this.m1 != null && (i2 & 2) != 0) {
            lVar.getClass();
            lVar.g(i);
            return true;
        }
        n0 n0Var = this.h1;
        if (z) {
            if (lVar != null) {
                lVar.g(i);
            }
            this.U0.f += i3;
            n0Var.E = true;
            return true;
        }
        try {
            if (!n0Var.k(i3, j3, byteBuffer)) {
                this.u1 = j3;
                return false;
            }
            if (lVar != null) {
                lVar.g(i);
            }
            this.U0.e += i3;
            return true;
        } catch (v e) {
            androidx.media3.common.r rVar2 = this.l1;
            if (this.E0) {
                h1 h1Var = this.A;
                h1Var.getClass();
                if (h1Var.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw g(e, rVar2, e.e, i5);
        } catch (w e2) {
            if (this.E0) {
                h1 h1Var2 = this.A;
                h1Var2.getClass();
                if (h1Var2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw g(e2, rVar, e2.y, i4);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        return this.h1.l();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void p() {
        t tVar = this.g1;
        this.p1 = true;
        this.l1 = null;
        this.u1 = -9223372036854775807L;
        this.r1 = false;
        try {
            this.h1.f();
            try {
                super.p();
            } finally {
                tVar.a(this.U0);
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
                tVar.a(this.U0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void p0() throws androidx.media3.exoplayer.j {
        try {
            n0 n0Var = this.h1;
            if (!n0Var.L && n0Var.n() && n0Var.e()) {
                n0Var.p();
                n0Var.L = true;
            }
            long j = this.V0.f;
            if (j != -9223372036854775807L) {
                this.u1 = j;
            }
        } catch (w e) {
            throw g(e, e.z, e.y, this.E0 ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void q(boolean z, boolean z2) {
        androidx.media3.exoplayer.c cVar = new androidx.media3.exoplayer.c();
        this.U0 = cVar;
        t tVar = this.g1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new r(tVar, cVar, 0));
        }
        h1 h1Var = this.A;
        h1Var.getClass();
        boolean z3 = h1Var.b;
        n0 n0Var = this.h1;
        if (z3) {
            com.google.android.material.motion.a.q(n0Var.P);
            if (!n0Var.V) {
                n0Var.V = true;
                n0Var.r();
            }
        } else if (n0Var.V) {
            n0Var.V = false;
            n0Var.r();
        }
        androidx.media3.exoplayer.analytics.k kVar = this.C;
        kVar.getClass();
        n0Var.m = kVar;
        androidx.media3.common.util.e0 e0Var = this.D;
        e0Var.getClass();
        ((f0) n0Var.r).g = e0Var;
        n0Var.n = new com.app.mlounge.data.music.e(this, 29);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) throws androidx.media3.exoplayer.j {
        super.r(j, z, z2);
        this.h1.f();
        this.n1 = j;
        this.u1 = -9223372036854775807L;
        this.q1 = false;
        this.r1 = false;
        this.o1 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        androidx.media3.exoplayer.mediacodec.j jVar;
        ((f0) this.h1.r).d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.i1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // androidx.media3.exoplayer.a
    public final void t() {
        n0 n0Var = this.h1;
        this.q1 = false;
        this.r1 = false;
        this.u1 = -9223372036854775807L;
        try {
            try {
                this.E0 = false;
                q0();
                o0();
                androidx.media3.exoplayer.dash.manifest.t tVar = this.e0;
                if (tVar != null) {
                    tVar.O(null);
                }
                this.e0 = null;
                if (this.p1) {
                    this.p1 = false;
                    n0Var.s();
                }
            } catch (Throwable th) {
                androidx.media3.exoplayer.dash.manifest.t tVar2 = this.e0;
                if (tVar2 != null) {
                    tVar2.O(null);
                }
                this.e0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.p1) {
                this.p1 = false;
                n0Var.s();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void u() {
        this.h1.o();
        this.t1 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void v() {
        F0();
        this.t1 = false;
        n0 n0Var = this.h1;
        n0Var.O = false;
        if (n0Var.n()) {
            d0 d0Var = n0Var.t;
            g0 g0Var = d0Var.f;
            g0Var.k = 0L;
            g0Var.t = 0;
            g0Var.s = 0;
            g0Var.l = 0L;
            g0Var.y = -9223372036854775807L;
            g0Var.z = -9223372036854775807L;
            if (g0Var.u == -9223372036854775807L) {
                g0Var.h.a(0);
            }
            g0Var.w = g0Var.a();
            if (!d0Var.k || d0Var.c()) {
                d0Var.a.pause();
            }
        }
        this.r1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean z0(androidx.media3.common.r rVar) {
        h1 h1Var = this.A;
        h1Var.getClass();
        if (h1Var.a != 0) {
            int iE0 = E0(rVar);
            if ((iE0 & 512) != 0) {
                h1 h1Var2 = this.A;
                h1Var2.getClass();
                if (h1Var2.a == 2 || (iE0 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 || (rVar.J == 0 && rVar.K == 0)) {
                    return true;
                }
            }
        }
        return this.h1.h(rVar) != 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final androidx.media3.exoplayer.o0 j() {
        return this;
    }
}
