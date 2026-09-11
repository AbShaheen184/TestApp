package androidx.media3.exoplayer;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.media3.exoplayer.video.u, androidx.media3.exoplayer.video.spherical.a, d1 {
    public androidx.media3.exoplayer.video.spherical.a A;
    public androidx.media3.exoplayer.video.u e;
    public androidx.media3.exoplayer.video.spherical.a y;
    public androidx.media3.exoplayer.video.u z;

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void a(long j, float[] fArr) {
        androidx.media3.exoplayer.video.spherical.a aVar = this.A;
        if (aVar != null) {
            aVar.a(j, fArr);
        }
        androidx.media3.exoplayer.video.spherical.a aVar2 = this.y;
        if (aVar2 != null) {
            aVar2.a(j, fArr);
        }
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void b() {
        androidx.media3.exoplayer.video.spherical.a aVar = this.A;
        if (aVar != null) {
            aVar.b();
        }
        androidx.media3.exoplayer.video.spherical.a aVar2 = this.y;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // androidx.media3.exoplayer.video.u
    public final void c(long j, long j2, androidx.media3.common.r rVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        androidx.media3.common.r rVar2;
        MediaFormat mediaFormat2;
        androidx.media3.exoplayer.video.u uVar = this.z;
        if (uVar != null) {
            uVar.c(j, j2, rVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            rVar2 = rVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            rVar2 = rVar;
            mediaFormat2 = mediaFormat;
        }
        androidx.media3.exoplayer.video.u uVar2 = this.e;
        if (uVar2 != null) {
            uVar2.c(j3, j4, rVar2, mediaFormat2);
        }
    }

    @Override // androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.e = (androidx.media3.exoplayer.video.u) obj;
            return;
        }
        if (i == 8) {
            this.y = (androidx.media3.exoplayer.video.spherical.a) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        androidx.media3.exoplayer.video.spherical.k kVar = (androidx.media3.exoplayer.video.spherical.k) obj;
        if (kVar == null) {
            this.z = null;
            this.A = null;
        } else {
            this.z = kVar.getVideoFrameMetadataListener();
            this.A = kVar.getCameraMotionListener();
        }
    }
}
