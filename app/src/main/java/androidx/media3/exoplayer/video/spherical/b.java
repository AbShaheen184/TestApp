package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.media3.exoplayer.a {
    public final androidx.media3.decoder.e P;
    public final w Q;
    public a R;
    public long S;

    public b() {
        super(6);
        this.P = new androidx.media3.decoder.e(1);
        this.Q = new w();
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(r rVar) {
        return "application/x-camera-motion".equals(rVar.o) ? androidx.media3.exoplayer.a.f(4, 0, 0, 0) : androidx.media3.exoplayer.a.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.R = (a) obj;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        return l();
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void p() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) {
        this.S = Long.MIN_VALUE;
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.S < 100000 + j) {
            androidx.media3.decoder.e eVar = this.P;
            eVar.o();
            androidx.media3.common.util.b bVar = this.z;
            bVar.o();
            if (y(bVar, eVar, 0) != -4 || eVar.g(4)) {
                return;
            }
            long j3 = eVar.D;
            this.S = j3;
            boolean z = j3 < this.I;
            if (this.R != null && !z) {
                eVar.r();
                ByteBuffer byteBuffer = eVar.B;
                String str = j0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    w wVar = this.Q;
                    wVar.K(bArrArray, iLimit);
                    wVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(wVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.R.a(this.S - this.H, fArr);
                }
            }
        }
    }
}
