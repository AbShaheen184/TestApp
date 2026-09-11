package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.r;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.video.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements u, a {
    public int F;
    public SurfaceTexture G;
    public byte[] J;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean y = new AtomicBoolean(true);
    public final g z = new g();
    public final b1 A = new b1(3);
    public final androidx.compose.ui.text.android.selection.e B = new androidx.compose.ui.text.android.selection.e();
    public final androidx.compose.ui.text.android.selection.e C = new androidx.compose.ui.text.android.selection.e();
    public final float[] D = new float[16];
    public final float[] E = new float[16];
    public volatile int H = 0;
    public int I = -1;

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void a(long j, float[] fArr) {
        ((androidx.compose.ui.text.android.selection.e) this.A.A).f(j, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void b() {
        this.B.l();
        b1 b1Var = this.A;
        ((androidx.compose.ui.text.android.selection.e) b1Var.A).l();
        b1Var.e = false;
        this.y.set(true);
    }

    @Override // androidx.media3.exoplayer.video.u
    public final void c(long j, long j2, r rVar, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListT;
        this.B.f(j2, Long.valueOf(j));
        byte[] bArr = rVar.C;
        int i2 = rVar.D;
        byte[] bArr2 = this.J;
        int i3 = this.I;
        this.J = bArr;
        if (i2 == -1) {
            i2 = this.H;
        }
        this.I = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.J)) {
            return;
        }
        byte[] bArr3 = this.J;
        f fVar = null;
        if (bArr3 != null) {
            int i4 = this.I;
            w wVar = new w(bArr3);
            try {
                wVar.N(4);
                int iM = wVar.m();
                wVar.M(0);
                if (iM == 1886547818) {
                    wVar.N(8);
                    int i5 = wVar.b;
                    int i6 = wVar.c;
                    while (true) {
                        if (i5 < i6) {
                            int iM2 = wVar.m() + i5;
                            if (iM2 > i5 && iM2 <= i6) {
                                int iM3 = wVar.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    wVar.M(iM2);
                                    i5 = iM2;
                                }
                                wVar.L(iM2);
                                arrayListT = coil3.network.g.t(wVar);
                            }
                        }
                        arrayListT = null;
                    }
                } else {
                    arrayListT = coil3.network.g.t(wVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListT != null) {
                int size = arrayListT.size();
                if (size == 1) {
                    e eVar = (e) arrayListT.get(0);
                    fVar = new f(eVar, eVar, i4);
                } else if (size == 2) {
                    fVar = new f((e) arrayListT.get(0), (e) arrayListT.get(1), i4);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i7 = this.I;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 == 0 && i17 == 0) || (i13 == 72 && i17 == 1)) {
                            System.arraycopy(fArr, i15, fArr, i19, 3);
                            i15 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i16, fArr2, i20, 2);
                            i16 += 4;
                        } else {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                        }
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            e eVar2 = new e(new androidx.compose.ui.text.android.selection.e(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i7);
        }
        this.C.f(j2, fVar);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            androidx.media3.common.util.c.b();
            this.z.a();
            androidx.media3.common.util.c.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            androidx.media3.common.util.c.b();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            androidx.media3.common.util.c.b();
            GLES20.glTexParameteri(36197, 10240, 9729);
            androidx.media3.common.util.c.b();
            GLES20.glTexParameteri(36197, 10241, 9729);
            androidx.media3.common.util.c.b();
            GLES20.glTexParameteri(36197, 10242, 33071);
            androidx.media3.common.util.c.b();
            GLES20.glTexParameteri(36197, 10243, 33071);
            androidx.media3.common.util.c.b();
            this.F = i;
        } catch (androidx.media3.common.util.k e) {
            androidx.media3.common.util.c.g("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.F);
        this.G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.e.e.set(true);
            }
        });
        return this.G;
    }
}
