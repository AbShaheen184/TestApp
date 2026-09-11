package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.audio.r0;
import androidx.media3.exoplayer.f0;
import androidx.media3.exoplayer.source.w0;
import com.caverock.androidsvg.y1;
import com.google.common.collect.h1;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends androidx.media3.exoplayer.a {
    public static final byte[] e1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public int B0;
    public ByteBuffer C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final Context P;
    public boolean P0;
    public final k Q;
    public boolean Q0;
    public final i R;
    public boolean R0;
    public final float S;
    public boolean S0;
    public final androidx.media3.decoder.e T;
    public androidx.media3.exoplayer.j T0;
    public final androidx.media3.decoder.e U;
    public androidx.media3.exoplayer.c U0;
    public final androidx.media3.decoder.e V;
    public q V0;
    public final f W;
    public long W0;
    public final MediaCodec.BufferInfo X;
    public boolean X0;
    public final ArrayDeque Y;
    public boolean Y0;
    public final r0 Z;
    public boolean Z0;
    public final AtomicInteger a0;
    public long a1;
    public androidx.media3.common.r b0;
    public androidx.media3.exoplayer.b b1;
    public androidx.media3.common.r c0;
    public androidx.media3.exoplayer.b c1;
    public androidx.media3.exoplayer.dash.manifest.t d0;
    public k0 d1;
    public androidx.media3.exoplayer.dash.manifest.t e0;
    public f0 f0;
    public MediaCrypto g0;
    public final long h0;
    public float i0;
    public float j0;
    public l k0;
    public androidx.media3.common.r l0;
    public MediaFormat m0;
    public boolean n0;
    public float o0;
    public ArrayDeque p0;
    public p q0;
    public o r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public long x0;
    public boolean y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i, k kVar, float f) {
        super(i);
        i iVar = i.y;
        this.P = context.getApplicationContext();
        this.Q = kVar;
        this.R = iVar;
        this.S = f;
        this.a0 = new AtomicInteger();
        this.T = new androidx.media3.decoder.e(0);
        this.U = new androidx.media3.decoder.e(0);
        this.V = new androidx.media3.decoder.e(2);
        f fVar = new f(2);
        fVar.I = 32;
        this.W = fVar;
        this.X = new MediaCodec.BufferInfo();
        this.i0 = 1.0f;
        this.j0 = 1.0f;
        this.h0 = -9223372036854775807L;
        this.Y = new ArrayDeque();
        this.V0 = q.g;
        fVar.q(0);
        fVar.B.order(ByteOrder.nativeOrder());
        r0 r0Var = new r0();
        r0Var.a = androidx.media3.common.audio.m.a;
        r0Var.c = 0;
        r0Var.b = 2;
        this.Z = r0Var;
        this.o0 = -1.0f;
        this.s0 = 0;
        this.I0 = 0;
        this.A0 = -1;
        this.B0 = -1;
        this.z0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.x0 = -9223372036854775807L;
        this.J0 = 0;
        this.K0 = 0;
        this.U0 = new androidx.media3.exoplayer.c();
        this.Z0 = false;
        this.a1 = 0L;
        int i2 = k0.z;
        this.d1 = h1.G;
        androidx.media3.exoplayer.b bVar = androidx.media3.exoplayer.b.b;
        this.b1 = bVar;
        this.c1 = bVar;
    }

    public abstract int A0(i iVar, androidx.media3.common.r rVar);

    public final boolean B0(androidx.media3.common.r rVar) throws androidx.media3.exoplayer.j {
        if (this.k0 != null && this.K0 != 3 && this.E != 0) {
            float f = this.j0;
            rVar.getClass();
            androidx.media3.common.r[] rVarArr = this.G;
            rVarArr.getClass();
            float fQ = Q(f, rVar, rVarArr);
            float f2 = this.o0;
            if (f2 != fQ) {
                if (fQ == -1.0f) {
                    if (this.L0) {
                        this.J0 = 1;
                        this.K0 = 3;
                        return false;
                    }
                    o0();
                    Y();
                    return false;
                }
                if (f2 != -1.0f || fQ > this.S) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fQ);
                    l lVar = this.k0;
                    lVar.getClass();
                    lVar.d(bundle);
                    this.o0 = fQ;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public void C(float f, float f2) throws androidx.media3.exoplayer.j {
        this.i0 = f;
        this.j0 = f2;
        B0(this.l0);
    }

    public final void C0() {
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e0;
        tVar.getClass();
        tVar.J();
        t0(this.e0);
        this.J0 = 0;
        this.K0 = 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(androidx.media3.common.r rVar) throws androidx.media3.exoplayer.j {
        try {
            return A0(this.R, rVar);
        } catch (t e) {
            throw g(e, rVar, false, 4002);
        }
    }

    public final void D0(long j) {
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.V0.d.K(j);
        if (rVar == null && this.X0 && this.m0 != null) {
            rVar = (androidx.media3.common.r) this.V0.d.J();
        }
        if (rVar != null) {
            this.c0 = rVar;
        } else if (!this.n0 || this.c0 == null) {
            return;
        }
        androidx.media3.common.r rVar2 = this.c0;
        rVar2.getClass();
        g0(rVar2, this.m0);
        this.n0 = false;
        this.X0 = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final int E() {
        return 8;
    }

    public final void G(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.b1.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x030a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0312 A[LOOP:0: B:25:0x0090->B:117:0x0312, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.exoplayer.a, androidx.media3.exoplayer.mediacodec.r] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    public final boolean H(long j, long j2) throws androidx.media3.exoplayer.j {
        f fVar;
        ?? r4;
        ?? r28;
        com.google.android.material.motion.a.q(!this.Q0);
        f fVar2 = this.W;
        if (fVar2.t()) {
            ByteBuffer byteBuffer = fVar2.B;
            int i = this.B0;
            int i2 = fVar2.H;
            long j3 = fVar2.D;
            boolean zX = X(this.I, fVar2.G);
            boolean zG = fVar2.g(4);
            androidx.media3.common.r rVar = this.c0;
            rVar.getClass();
            fVar = fVar2;
            if (m0(j, j2, null, byteBuffer, i, 0, i2, j3, zX, zG, rVar)) {
                i0(fVar.G);
                fVar.o();
            }
        }
        fVar = fVar2;
        if (this.P0) {
            this.Q0 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z = this.F0;
        androidx.media3.decoder.e eVar = this.V;
        if (z) {
            com.google.android.material.motion.a.q(fVar.s(eVar));
            this.F0 = false;
        }
        if (this.G0) {
            if (fVar.t()) {
                return true;
            }
            this.E0 = false;
            q0();
            this.G0 = false;
            Y();
            if (!this.E0) {
                return false;
            }
        }
        com.google.android.material.motion.a.q(!this.P0);
        androidx.media3.common.util.b bVar = this.z;
        bVar.o();
        eVar.o();
        while (true) {
            eVar.o();
            int iY = y(bVar, eVar, r2);
            if (iY == -5) {
                f0(bVar);
            } else if (iY != -4) {
                if (iY != -3) {
                    org.mozilla.javascript.c.a();
                    return false;
                }
                if (l()) {
                    T().f = this.O0;
                }
            } else if (eVar.g(4)) {
                this.P0 = true;
                T().f = this.O0;
            } else {
                this.O0 = Math.max(this.O0, eVar.D);
                if (l() || this.U.g(536870912)) {
                    T().f = this.O0;
                }
                byte[] bArr = null;
                if (this.R0) {
                    androidx.media3.common.r rVar2 = this.b0;
                    rVar2.getClass();
                    this.c0 = rVar2;
                    if (Objects.equals(rVar2.o, "audio/opus") && !this.c0.r.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.c0.r.get(r2);
                        int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        androidx.media3.common.q qVarA = this.c0.a();
                        qVarA.I = i3;
                        this.c0 = new androidx.media3.common.r(qVarA);
                    }
                    g0(this.c0, null);
                    this.R0 = r2;
                }
                eVar.r();
                androidx.media3.common.r rVar3 = this.c0;
                if (rVar3 != null && Objects.equals(rVar3.o, "audio/opus")) {
                    if (eVar.g(268435456)) {
                        eVar.z = this.c0;
                        V(eVar);
                    }
                    if (this.I - eVar.D <= 80000) {
                        ?? r5 = this.c0.r;
                        r0 r0Var = this.Z;
                        r0Var.getClass();
                        eVar.B.getClass();
                        if (eVar.B.limit() - eVar.B.position() != 0) {
                            if (r0Var.b == 2 && (r5.size() == 1 || r5.size() == 3)) {
                                bArr = (byte[]) r5.get(r2);
                            }
                            ByteBuffer byteBuffer2 = eVar.B;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i4 = iLimit - iPosition;
                            int i5 = (i4 + 255) / 255;
                            int i6 = i5 + 27 + i4;
                            if (r0Var.b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i6 = (length == true ? 1 : 0) + 44 + i6;
                                r4 = length;
                            } else {
                                r4 = r2;
                            }
                            if (r0Var.a.capacity() < i6) {
                                r0Var.a = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                r0Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = r0Var.a;
                            if (r0Var.b == 2) {
                                if (bArr != null) {
                                    r0.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(com.google.android.material.motion.a.s(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, j0.p(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(r0.d);
                                }
                                byteBuffer3.put(r0.e);
                                r28 = r4;
                            } else {
                                r28 = r4 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iE = r0Var.c + ((int) ((androidx.media3.container.r.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            r0Var.c = iE;
                            r0.a(byteBuffer3, iE, r0Var.b, i5, false);
                            for (int i7 = 0; i7 < i5; i7++) {
                                if (i4 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i4 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i4);
                                    i4 = 0;
                                }
                            }
                            int i8 = iLimit;
                            while (iPosition < i8) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (r0Var.b == 2) {
                                byteBuffer3.putInt(r28 + 66, j0.p(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            } else {
                                byteBuffer3.putInt(22, j0.p(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            }
                            r0Var.b++;
                            r0Var.a = byteBuffer3;
                            eVar.o();
                            eVar.q(r0Var.a.remaining());
                            eVar.B.put(r0Var.a);
                            eVar.r();
                        }
                    }
                }
                if (fVar.t()) {
                    long j4 = this.I;
                    if (X(j4, fVar.G) == X(j4, eVar.D)) {
                        if (!fVar.s(eVar)) {
                            r2 = 0;
                        }
                    }
                } else if (!fVar.s(eVar)) {
                    r2 = 0;
                }
                this.F0 = true;
            }
            if (fVar.t()) {
                fVar.r();
            }
            return fVar.t() || this.P0 || this.G0;
        }
    }

    public abstract androidx.media3.exoplayer.d I(o oVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z);

    public n J(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean K() {
        if (!this.L0) {
            C0();
            return true;
        }
        this.J0 = 1;
        this.K0 = 2;
        return true;
    }

    public final boolean L(long j, long j2) throws androidx.media3.exoplayer.j {
        l lVar = this.k0;
        lVar.getClass();
        int i = this.B0;
        MediaCodec.BufferInfo bufferInfo = this.X;
        if (i < 0) {
            int iM = lVar.m(bufferInfo);
            if (iM < 0) {
                if (iM != -2) {
                    if (this.w0 && (this.P0 || this.J0 == 2)) {
                        l0();
                    }
                    long j3 = this.x0;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.D.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            l0();
                            return false;
                        }
                    }
                    return false;
                }
                this.N0 = true;
                l lVar2 = this.k0;
                lVar2.getClass();
                MediaFormat mediaFormatI = lVar2.i();
                if (this.s0 != 0 && mediaFormatI.getInteger("width") == 32 && mediaFormatI.getInteger("height") == 32) {
                    this.v0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.d1.isEmpty()) {
                    androidx.media3.exoplayer.b bVar = new androidx.media3.exoplayer.b((HashMap) androidx.media3.exoplayer.b.a(mediaFormatI, this.d1).y);
                    if (!bVar.equals(this.c1)) {
                        this.c1 = bVar;
                        d0(bVar);
                    }
                }
                this.m0 = mediaFormatI;
                this.n0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.a1;
            if (this.v0) {
                this.v0 = false;
                lVar.g(iM);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            }
            this.B0 = iM;
            ByteBuffer byteBufferR = lVar.r(iM);
            this.C0 = byteBufferR;
            if (byteBufferR != null) {
                byteBufferR.position(bufferInfo.offset);
                this.C0.limit(bufferInfo.offset + bufferInfo.size);
            }
            D0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.Z0 || bufferInfo.presentationTimeUs < this.I;
        long j5 = this.V0.f;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.D0 = z2;
        ByteBuffer byteBuffer = this.C0;
        int i2 = this.B0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        androidx.media3.common.r rVar = this.c0;
        rVar.getClass();
        if (!m0(j, j2, lVar, byteBuffer, i2, i3, 1, j6, z, z2, rVar)) {
            return false;
        }
        i0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.M0 && this.D0) {
            this.D.getClass();
            this.x0 = System.currentTimeMillis();
        }
        this.B0 = -1;
        this.C0 = null;
        if (!z3) {
            return true;
        }
        l0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0191  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    public final boolean M() throws androidx.media3.exoplayer.j {
        int iPosition;
        androidx.media3.common.util.b bVar;
        int i;
        long j;
        boolean zG;
        int iP;
        long j2;
        int i2;
        long j3;
        androidx.media3.decoder.a aVar;
        int i3;
        androidx.media3.common.r rVar;
        l lVar = this.k0;
        if (lVar != null && this.J0 != 2 && !this.P0) {
            int i4 = this.A0;
            androidx.media3.decoder.e eVar = this.U;
            if (i4 < 0) {
                int iL = lVar.l();
                this.A0 = iL;
                if (iL >= 0) {
                    eVar.B = lVar.p(iL);
                    eVar.o();
                    if (this.J0 == 1) {
                        if (!this.w0) {
                            this.M0 = true;
                            lVar.f(this.A0, 0, 4, 0L);
                            this.A0 = -1;
                            eVar.B = null;
                        }
                        this.J0 = 2;
                        return false;
                    }
                    if (this.u0) {
                        this.u0 = false;
                        ByteBuffer byteBuffer = eVar.B;
                        byteBuffer.getClass();
                        byteBuffer.put(e1);
                        lVar.f(this.A0, 38, 0, 0L);
                        this.A0 = -1;
                        eVar.B = null;
                        this.L0 = true;
                        return true;
                    }
                    if (this.I0 == 1) {
                        i3 = 0;
                        while (true) {
                            rVar = this.l0;
                            rVar.getClass();
                            if (i3 < rVar.r.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.l0.r.get(i3);
                            ByteBuffer byteBuffer2 = eVar.B;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.I0 = 2;
                    }
                    ByteBuffer byteBuffer3 = eVar.B;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    bVar = this.z;
                    bVar.o();
                    try {
                        lVar.o(new androidx.activity.c(22, this, bVar));
                        i = this.a0.get();
                        if (i == -3) {
                            if (l()) {
                                T().f = this.O0;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.I0 == 2) {
                                    eVar.o();
                                    this.I0 = 1;
                                }
                                f0(bVar);
                                return true;
                            }
                            if (eVar.g(4)) {
                                if (!this.L0 || eVar.g(1)) {
                                    j = eVar.D;
                                    if (!v0(eVar)) {
                                        zG = eVar.g(1073741824);
                                        if (zG) {
                                            aVar = eVar.A;
                                            if (iPosition == 0) {
                                                aVar.getClass();
                                            } else {
                                                if (aVar.d == null) {
                                                    int[] iArr = new int[1];
                                                    aVar.d = iArr;
                                                    aVar.i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = aVar.d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.R0) {
                                            q qVarT = T();
                                            androidx.compose.ui.text.android.selection.e eVar2 = qVarT.d;
                                            androidx.media3.common.r rVar2 = this.b0;
                                            rVar2.getClass();
                                            eVar2.f(j, rVar2);
                                            qVarT.e = true;
                                            this.R0 = false;
                                        }
                                        this.O0 = Math.max(this.O0, j);
                                        if (l() || eVar.g(536870912)) {
                                            T().f = this.O0;
                                        }
                                        eVar.r();
                                        if (eVar.g(268435456)) {
                                            V(eVar);
                                        }
                                        if (this.Z0) {
                                            j3 = this.O0;
                                            if (j <= j3) {
                                                this.a1 = (j3 - j) + 1 + this.a1;
                                            }
                                            this.O0 = j;
                                            this.Z0 = false;
                                        }
                                        k0(eVar);
                                        iP = P(eVar);
                                        j2 = j + this.a1;
                                        i2 = this.A0;
                                        if (zG) {
                                            lVar.c(i2, eVar.A, j2, iP);
                                        } else {
                                            ByteBuffer byteBuffer4 = eVar.B;
                                            byteBuffer4.getClass();
                                            lVar.f(i2, byteBuffer4.limit(), iP, j2);
                                        }
                                        this.A0 = -1;
                                        eVar.B = null;
                                        this.L0 = true;
                                        this.I0 = 0;
                                        this.U0.c++;
                                        return true;
                                    }
                                } else {
                                    eVar.o();
                                    if (this.I0 == 2) {
                                        this.I0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            T().f = this.O0;
                            if (this.I0 == 2) {
                                eVar.o();
                                this.I0 = 1;
                            }
                            this.P0 = true;
                            if (!this.L0) {
                                l0();
                                return false;
                            }
                            if (!this.w0) {
                                this.M0 = true;
                                lVar.f(this.A0, 0, 4, 0L);
                                this.A0 = -1;
                                eVar.B = null;
                                return false;
                            }
                        }
                    } catch (androidx.media3.decoder.d e) {
                        b0(e);
                        n0(0);
                        N();
                        return true;
                    }
                }
            } else {
                if (this.J0 == 1) {
                    if (!this.w0) {
                        this.M0 = true;
                        lVar.f(this.A0, 0, 4, 0L);
                        this.A0 = -1;
                        eVar.B = null;
                    }
                    this.J0 = 2;
                    return false;
                }
                if (this.u0) {
                    this.u0 = false;
                    ByteBuffer byteBuffer5 = eVar.B;
                    byteBuffer5.getClass();
                    byteBuffer5.put(e1);
                    lVar.f(this.A0, 38, 0, 0L);
                    this.A0 = -1;
                    eVar.B = null;
                    this.L0 = true;
                    return true;
                }
                if (this.I0 == 1) {
                    i3 = 0;
                    while (true) {
                        rVar = this.l0;
                        rVar.getClass();
                        if (i3 < rVar.r.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.l0.r.get(i3);
                        ByteBuffer byteBuffer6 = eVar.B;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.I0 = 2;
                }
                ByteBuffer byteBuffer7 = eVar.B;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                bVar = this.z;
                bVar.o();
                lVar.o(new androidx.activity.c(22, this, bVar));
                i = this.a0.get();
                if (i == -3) {
                    if (l()) {
                        T().f = this.O0;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.I0 == 2) {
                            eVar.o();
                            this.I0 = 1;
                        }
                        f0(bVar);
                        return true;
                    }
                    if (eVar.g(4)) {
                        if (this.L0) {
                            j = eVar.D;
                            if (!v0(eVar)) {
                                zG = eVar.g(1073741824);
                                if (zG) {
                                    aVar = eVar.A;
                                    if (iPosition == 0) {
                                        aVar.getClass();
                                    } else {
                                        if (aVar.d == null) {
                                            int[] iArr3 = new int[1];
                                            aVar.d = iArr3;
                                            aVar.i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = aVar.d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.R0) {
                                    q qVarT2 = T();
                                    androidx.compose.ui.text.android.selection.e eVar3 = qVarT2.d;
                                    androidx.media3.common.r rVar3 = this.b0;
                                    rVar3.getClass();
                                    eVar3.f(j, rVar3);
                                    qVarT2.e = true;
                                    this.R0 = false;
                                }
                                this.O0 = Math.max(this.O0, j);
                                if (l()) {
                                    T().f = this.O0;
                                } else {
                                    T().f = this.O0;
                                }
                                eVar.r();
                                if (eVar.g(268435456)) {
                                    V(eVar);
                                }
                                if (this.Z0) {
                                    j3 = this.O0;
                                    if (j <= j3) {
                                        this.a1 = (j3 - j) + 1 + this.a1;
                                    }
                                    this.O0 = j;
                                    this.Z0 = false;
                                }
                                k0(eVar);
                                iP = P(eVar);
                                j2 = j + this.a1;
                                i2 = this.A0;
                                if (zG) {
                                    lVar.c(i2, eVar.A, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer8 = eVar.B;
                                    byteBuffer8.getClass();
                                    lVar.f(i2, byteBuffer8.limit(), iP, j2);
                                }
                                this.A0 = -1;
                                eVar.B = null;
                                this.L0 = true;
                                this.I0 = 0;
                                this.U0.c++;
                                return true;
                            }
                        } else {
                            j = eVar.D;
                            if (!v0(eVar)) {
                                zG = eVar.g(1073741824);
                                if (zG) {
                                    aVar = eVar.A;
                                    if (iPosition == 0) {
                                        aVar.getClass();
                                    } else {
                                        if (aVar.d == null) {
                                            int[] iArr5 = new int[1];
                                            aVar.d = iArr5;
                                            aVar.i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = aVar.d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.R0) {
                                    q qVarT3 = T();
                                    androidx.compose.ui.text.android.selection.e eVar4 = qVarT3.d;
                                    androidx.media3.common.r rVar4 = this.b0;
                                    rVar4.getClass();
                                    eVar4.f(j, rVar4);
                                    qVarT3.e = true;
                                    this.R0 = false;
                                }
                                this.O0 = Math.max(this.O0, j);
                                if (l()) {
                                    T().f = this.O0;
                                } else {
                                    T().f = this.O0;
                                }
                                eVar.r();
                                if (eVar.g(268435456)) {
                                    V(eVar);
                                }
                                if (this.Z0) {
                                    j3 = this.O0;
                                    if (j <= j3) {
                                        this.a1 = (j3 - j) + 1 + this.a1;
                                    }
                                    this.O0 = j;
                                    this.Z0 = false;
                                }
                                k0(eVar);
                                iP = P(eVar);
                                j2 = j + this.a1;
                                i2 = this.A0;
                                if (zG) {
                                    lVar.c(i2, eVar.A, j2, iP);
                                } else {
                                    ByteBuffer byteBuffer9 = eVar.B;
                                    byteBuffer9.getClass();
                                    lVar.f(i2, byteBuffer9.limit(), iP, j2);
                                }
                                this.A0 = -1;
                                eVar.B = null;
                                this.L0 = true;
                                this.I0 = 0;
                                this.U0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    T().f = this.O0;
                    if (this.I0 == 2) {
                        eVar.o();
                        this.I0 = 1;
                    }
                    this.P0 = true;
                    if (!this.L0) {
                        l0();
                        return false;
                    }
                    if (!this.w0) {
                        this.M0 = true;
                        lVar.f(this.A0, 0, 4, 0L);
                        this.A0 = -1;
                        eVar.B = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void N() {
        try {
            l lVar = this.k0;
            lVar.getClass();
            lVar.flush();
        } finally {
            r0();
        }
    }

    public final List O(boolean z) {
        androidx.media3.common.r rVar = this.b0;
        rVar.getClass();
        i iVar = this.R;
        ArrayList arrayListR = R(iVar, rVar, z);
        if (!arrayListR.isEmpty() || !z) {
            return arrayListR;
        }
        ArrayList arrayListR2 = R(iVar, rVar, false);
        if (!arrayListR2.isEmpty()) {
            androidx.media3.common.util.c.t("MediaCodecRenderer", "Drm session requires secure decoder for " + rVar.o + ", but no secure decoder available. Trying to proceed with " + arrayListR2 + ".");
        }
        return arrayListR2;
    }

    public int P(androidx.media3.decoder.e eVar) {
        return 0;
    }

    public abstract float Q(float f, androidx.media3.common.r rVar, androidx.media3.common.r[] rVarArr);

    public abstract ArrayList R(i iVar, androidx.media3.common.r rVar, boolean z);

    public long S(long j, long j2, boolean z) {
        return super.i(j, j2);
    }

    public final q T() {
        ArrayDeque arrayDeque = this.Y;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.V0;
    }

    public abstract y1 U(o oVar, androidx.media3.common.r rVar, MediaCrypto mediaCrypto, float f);

    public abstract void V(androidx.media3.decoder.e eVar);

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    public final void W(o oVar, MediaCrypto mediaCrypto) {
        int i;
        this.r0 = oVar;
        androidx.media3.common.r rVar = this.b0;
        rVar.getClass();
        String str = oVar.a;
        float f = this.j0;
        androidx.media3.common.r[] rVarArr = this.G;
        rVarArr.getClass();
        float fQ = Q(f, rVar, rVarArr);
        if (fQ <= this.S) {
            fQ = -1.0f;
        }
        this.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        y1 y1VarU = U(oVar, rVar, mediaCrypto, fQ);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            androidx.media3.exoplayer.analytics.k kVar = this.C;
            kVar.getClass();
            androidx.compose.ui.contentcapture.b.j(y1VarU, kVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l lVarO = this.Q.o(y1VarU);
            this.k0 = lVarO;
            this.y0 = lVarO.t(new androidx.media3.exoplayer.hls.c(this));
            Trace.endSection();
            this.D.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.P, rVar)) {
                String strC = androidx.media3.common.r.c(rVar);
                Locale locale = Locale.US;
                androidx.media3.common.util.c.t("MediaCodecRenderer", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.o0 = fQ;
            this.l0 = rVar;
            boolean z = false;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.s0 = i;
            this.t0 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = oVar.a;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f))) {
                z = true;
            }
            this.w0 = z;
            this.k0.getClass();
            if (this.E == 2) {
                this.D.getClass();
                this.z0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.U0.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i2 >= 31 && !this.d1.isEmpty()) {
                l lVar = this.k0;
                lVar.getClass();
                lVar.s(new ArrayList(this.d1));
            }
            c0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean X(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        androidx.media3.common.r rVar = this.c0;
        return rVar == null || !Objects.equals(rVar.o, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void Y() throws androidx.media3.exoplayer.j {
        androidx.media3.common.r rVar;
        androidx.media3.exoplayer.dash.manifest.t tVar;
        if (this.k0 != null || this.E0 || (rVar = this.b0) == null) {
            return;
        }
        String str = rVar.o;
        if (this.e0 == null && z0(rVar)) {
            this.E0 = false;
            q0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            f fVar = this.W;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                fVar.getClass();
                fVar.I = 32;
            } else {
                fVar.getClass();
                fVar.I = 1;
            }
            this.E0 = true;
            return;
        }
        t0(this.e0);
        if (this.d0 == null) {
            try {
                tVar = this.d0;
                if (tVar != null && (tVar.M() == 3 || this.d0.M() == 4)) {
                    androidx.media3.exoplayer.dash.manifest.t tVar2 = this.d0;
                    str.getClass();
                    tVar2.getClass();
                }
                Z(this.g0, false);
            } catch (p e) {
                throw g(e, rVar, false, 4001);
            }
        } else {
            com.google.android.material.motion.a.q(this.g0 == null);
            androidx.media3.exoplayer.dash.manifest.t tVar3 = this.d0;
            tVar3.J();
            boolean z = androidx.media3.exoplayer.drm.h.a;
            if (tVar3.K() != null) {
                tVar = this.d0;
                if (tVar != null) {
                    androidx.media3.exoplayer.dash.manifest.t tVar4 = this.d0;
                    str.getClass();
                    tVar4.getClass();
                }
                Z(this.g0, false);
            }
        }
        MediaCrypto mediaCrypto = this.g0;
        if (mediaCrypto == null || this.k0 != null) {
            return;
        }
        mediaCrypto.release();
        this.g0 = null;
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) throws p {
        androidx.media3.common.r rVar = this.b0;
        rVar.getClass();
        if (this.p0 == null) {
            try {
                List listO = O(z);
                this.p0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listO;
                if (!arrayList.isEmpty()) {
                    this.p0.add((o) arrayList.get(0));
                }
                this.q0 = null;
            } catch (t e) {
                throw new p(rVar, e, z, -49998);
            }
        }
        if (this.p0.isEmpty()) {
            throw new p(rVar, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.p0;
        arrayDeque.getClass();
        while (this.k0 == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!a0(rVar) || !x0(oVar)) {
                return;
            }
            try {
                W(oVar, mediaCrypto);
            } catch (Exception e2) {
                androidx.media3.common.util.c.u("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e2);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.a + ", " + rVar, e2, rVar.o, z, oVar, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                b0(pVar);
                p pVar2 = this.q0;
                if (pVar2 == null) {
                    this.q0 = pVar;
                } else {
                    this.q0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.e, pVar2.y, pVar2.z, pVar2.A);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.q0;
                }
            }
        }
        this.p0 = null;
    }

    public boolean a0(androidx.media3.common.r rVar) {
        return true;
    }

    public abstract void b0(Exception exc);

    public abstract void c0(long j, long j2, String str);

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public void d(int i, Object obj) {
        int i2;
        if (i == 11) {
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            this.f0 = f0Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                k0 k0Var = (k0) obj;
                if (this.d1.equals(k0Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(k0Var);
                    HashSet hashSet2 = new HashSet();
                    p1 it = this.d1.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    l lVar = this.k0;
                    if (lVar != null) {
                        if (!hashSet2.isEmpty()) {
                            lVar.u(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            lVar.s(new ArrayList(hashSet));
                        }
                    }
                }
                this.d1 = k0Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) obj;
            this.b1 = bVar;
            l lVar2 = this.k0;
            if (lVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : bVar.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                lVar2.d(bundle);
            }
        }
    }

    public abstract void d0(androidx.media3.exoplayer.b bVar);

    public abstract void e0(String str);

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
    public androidx.media3.exoplayer.d f0(androidx.media3.common.util.b bVar) throws androidx.media3.exoplayer.j {
        androidx.media3.common.r rVar;
        int i;
        Pair pairB;
        String str;
        boolean z = true;
        this.R0 = true;
        androidx.media3.common.r rVar2 = (androidx.media3.common.r) bVar.z;
        rVar2.getClass();
        String str2 = rVar2.o;
        if (str2 == null) {
            throw g(new IllegalArgumentException("Sample MIME type is null."), rVar2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = androidx.media3.common.util.f.a;
                if (str2.equals("video/dolby-vision") && (pairB = androidx.media3.common.util.f.b(rVar2)) != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                        str = "video/hevc";
                    } else if (iIntValue == 512) {
                        str = "video/avc";
                    } else if (iIntValue != 1024) {
                        str = null;
                    } else {
                        str = "video/av01";
                    }
                } else {
                    str = null;
                }
                if (Objects.equals(str, "video/av01")) {
                    if (rVar2.r.isEmpty()) {
                        androidx.media3.common.q qVarA = rVar2.a();
                        qVarA.q = null;
                        rVar = new androidx.media3.common.r(qVarA);
                    }
                }
            }
            rVar = rVar2;
        } else if (rVar2.r.isEmpty()) {
            rVar = rVar2;
        } else {
            androidx.media3.common.q qVarA2 = rVar2.a();
            qVarA2.q = null;
            rVar = new androidx.media3.common.r(qVarA2);
        }
        androidx.media3.exoplayer.dash.manifest.t tVar = (androidx.media3.exoplayer.dash.manifest.t) bVar.y;
        androidx.media3.exoplayer.dash.manifest.t tVar2 = this.e0;
        if (tVar2 != tVar) {
            if (tVar != null) {
                tVar.F(null);
            }
            if (tVar2 != null) {
                tVar2.O(null);
            }
        }
        this.e0 = tVar;
        this.b0 = rVar;
        if (this.E0) {
            this.G0 = true;
            return null;
        }
        l lVar = this.k0;
        if (lVar == null) {
            this.p0 = null;
            Y();
            return null;
        }
        o oVar = this.r0;
        oVar.getClass();
        androidx.media3.common.r rVar3 = this.l0;
        rVar3.getClass();
        androidx.media3.exoplayer.dash.manifest.t tVar3 = this.d0;
        androidx.media3.exoplayer.dash.manifest.t tVar4 = this.e0;
        if (tVar3 != tVar4) {
            if (tVar4 != null && tVar3 != null) {
                tVar4.J();
            }
            if (this.L0) {
                this.J0 = 1;
                this.K0 = 3;
            } else {
                o0();
                Y();
            }
            return new androidx.media3.exoplayer.d(oVar.a, rVar3, rVar, 0, 128);
        }
        boolean z2 = this.e0 != this.d0;
        androidx.media3.exoplayer.d dVarI = I(oVar, rVar3, rVar, T().e);
        int i2 = dVarI.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        org.mozilla.javascript.c.a();
                        return null;
                    }
                    if (B0(rVar)) {
                        this.l0 = rVar;
                        if (z2) {
                            K();
                        }
                    } else {
                        i = 16;
                    }
                } else if (B0(rVar)) {
                    this.H0 = true;
                    this.I0 = 1;
                    int i3 = this.s0;
                    if (i3 != 2 && (i3 != 1 || rVar.v != rVar3.v || rVar.w != rVar3.w)) {
                        z = false;
                    }
                    this.u0 = z;
                    this.l0 = rVar;
                    if (z2) {
                        K();
                    }
                } else {
                    i = 16;
                }
            } else if (B0(rVar)) {
                this.l0 = rVar;
                if (z2) {
                    K();
                } else if (this.L0) {
                    this.J0 = 1;
                    this.K0 = 1;
                }
            } else {
                i = 16;
            }
            return (i2 != 0 || (this.k0 == lVar && this.K0 != 3)) ? dVarI : new androidx.media3.exoplayer.d(oVar.a, rVar3, rVar, 0, i);
        }
        if (this.L0) {
            this.J0 = 1;
            this.K0 = 3;
        } else {
            o0();
            Y();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void g0(androidx.media3.common.r rVar, MediaFormat mediaFormat);

    @Override // androidx.media3.exoplayer.a
    public final long i(long j, long j2) {
        return S(j, j2, this.y0);
    }

    public void i0(long j) {
        this.W0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.Y;
            if (arrayDeque.isEmpty() || j < ((q) arrayDeque.peek()).a) {
                return;
            }
            q qVar = (q) arrayDeque.poll();
            qVar.getClass();
            u0(qVar);
            j0();
        }
    }

    public abstract void j0();

    public final void l0() throws androidx.media3.exoplayer.j {
        int i = this.K0;
        if (i == 1) {
            N();
            return;
        }
        if (i == 2) {
            N();
            C0();
        } else if (i != 3) {
            this.Q0 = true;
            p0();
        } else {
            o0();
            Y();
        }
    }

    public abstract boolean m0(long j, long j2, l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.r rVar);

    public final boolean n0(int i) throws androidx.media3.exoplayer.j {
        androidx.media3.common.util.b bVar = this.z;
        bVar.o();
        androidx.media3.decoder.e eVar = this.T;
        eVar.o();
        int iY = y(bVar, eVar, i | 4);
        if (iY == -5) {
            f0(bVar);
            return true;
        }
        if (iY != -4 || !eVar.g(4)) {
            return false;
        }
        this.P0 = true;
        l0();
        return false;
    }

    public final void o0() {
        try {
            l lVar = this.k0;
            if (lVar != null) {
                lVar.release();
                this.U0.b++;
                o oVar = this.r0;
                oVar.getClass();
                e0(oVar.a);
            }
            this.k0 = null;
            try {
                MediaCrypto mediaCrypto = this.g0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.g0 = null;
                t0(null);
                s0();
            }
        } catch (Throwable th) {
            this.k0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.g0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.g0 = null;
                t0(null);
                s0();
            }
        }
    }

    @Override // androidx.media3.exoplayer.a
    public void p() {
        this.b0 = null;
        u0(q.g);
        this.Y.clear();
        if (this.E0) {
            this.E0 = false;
            q0();
        } else {
            if (this.k0 == null) {
                return;
            }
            if (y0()) {
                o0();
            } else if (w0()) {
                N();
            } else {
                this.Z0 = true;
            }
        }
    }

    public abstract void p0();

    public final void q0() {
        this.O0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.G0 = false;
        this.W.o();
        this.V.o();
        this.F0 = false;
        r0 r0Var = this.Z;
        r0Var.getClass();
        r0Var.a = androidx.media3.common.audio.m.a;
        r0Var.c = 0;
        r0Var.b = 2;
    }

    @Override // androidx.media3.exoplayer.a
    public void r(long j, boolean z, boolean z2) throws androidx.media3.exoplayer.j {
        ArrayDeque arrayDeque = this.Y;
        if (!arrayDeque.isEmpty()) {
            this.V0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.P0 = false;
            this.Q0 = false;
            this.S0 = false;
            if (this.E0) {
                q0();
            } else if (this.k0 != null) {
                if (y0()) {
                    o0();
                    Y();
                } else if (w0()) {
                    N();
                } else {
                    this.Z0 = true;
                }
            }
            if (this.V0.d.P() > 0) {
                this.R0 = true;
            }
            this.V0.d.l();
            this.V0.e = false;
        }
    }

    public void r0() {
        this.A0 = -1;
        this.U.B = null;
        this.B0 = -1;
        this.C0 = null;
        this.O0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.z0 = -9223372036854775807L;
        this.M0 = false;
        this.x0 = -9223372036854775807L;
        this.L0 = false;
        this.u0 = false;
        this.v0 = false;
        this.D0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = this.H0 ? 1 : 0;
        this.Z0 = false;
        this.a1 = 0L;
    }

    public final void s0() {
        r0();
        this.T0 = null;
        this.p0 = null;
        this.r0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = false;
        this.N0 = false;
        this.o0 = -1.0f;
        this.s0 = 0;
        this.t0 = false;
        this.w0 = false;
        this.y0 = false;
        this.H0 = false;
        this.I0 = 0;
    }

    public final void t0(androidx.media3.exoplayer.dash.manifest.t tVar) {
        androidx.media3.exoplayer.dash.manifest.t tVar2 = this.d0;
        if (tVar2 != tVar) {
            if (tVar != null) {
                tVar.F(null);
            }
            if (tVar2 != null) {
                tVar2.O(null);
            }
        }
        this.d0 = tVar;
    }

    public final void u0(q qVar) {
        this.V0 = qVar;
        if (qVar.c != -9223372036854775807L) {
            this.X0 = true;
            h0();
        }
    }

    public boolean v0(androidx.media3.decoder.e eVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(androidx.media3.common.r[] r12, long r13, long r15, androidx.media3.exoplayer.source.v r17) {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.q r12 = r11.V0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.q r4 = new androidx.media3.exoplayer.mediacodec.q
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            boolean r12 = r11.Y0
            if (r12 == 0) goto L56
            r11.j0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.Y
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.O0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.W0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            androidx.media3.exoplayer.mediacodec.q r4 = new androidx.media3.exoplayer.mediacodec.q
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            androidx.media3.exoplayer.mediacodec.q r12 = r11.V0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.j0()
        L56:
            return
        L57:
            androidx.media3.exoplayer.mediacodec.q r0 = new androidx.media3.exoplayer.mediacodec.q
            long r1 = r11.O0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.r.w(androidx.media3.common.r[], long, long, androidx.media3.exoplayer.source.v):void");
    }

    public boolean w0() {
        return true;
    }

    public boolean x0(o oVar) {
        return true;
    }

    public boolean y0() {
        int i = this.K0;
        if (i == 3 || (this.t0 && !this.N0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            C0();
            return false;
        } catch (androidx.media3.exoplayer.j e) {
            androidx.media3.common.util.c.u("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public void z(long j, long j2) throws androidx.media3.exoplayer.j {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.S0) {
            this.S0 = false;
            l0();
        }
        androidx.media3.exoplayer.j jVar = this.T0;
        if (jVar != null) {
            this.T0 = null;
            throw jVar;
        }
        try {
            if (this.Q0) {
                p0();
                return;
            }
            if (this.b0 != null || n0(2)) {
                Y();
                if (this.E0) {
                    Trace.beginSection("bypassRender");
                    while (H(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.k0 != null) {
                    this.D.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (L(j, j2)) {
                        long j3 = this.h0;
                        if (j3 != -9223372036854775807L) {
                            this.D.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (M()) {
                        long j4 = this.h0;
                        if (j4 != -9223372036854775807L) {
                            this.D.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    androidx.media3.exoplayer.c cVar = this.U0;
                    int i = cVar.d;
                    w0 w0Var = this.F;
                    w0Var.getClass();
                    cVar.d = i + w0Var.g(j - this.H);
                    n0(1);
                }
                synchronized (this.U0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw g(e, this.b0, false, j0.z(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            b0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                o0();
            }
            n nVarJ = J(e2, this.r0);
            throw g(nVarJ, this.b0, z3, nVarJ.e == 1101 ? 4006 : 4003);
        }
    }

    public boolean z0(androidx.media3.common.r rVar) {
        return false;
    }

    public void h0() {
    }

    public void k0(androidx.media3.decoder.e eVar) {
    }
}
