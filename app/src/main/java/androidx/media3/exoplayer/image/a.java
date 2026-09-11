package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.media3.decoder.f {
    public Bitmap B;
    public final /* synthetic */ b C;

    public a(b bVar) {
        this.C = bVar;
    }

    @Override // androidx.media3.decoder.f
    public final void o() {
        this.B = null;
        this.y = 0;
        this.z = 0L;
        this.A = false;
    }

    @Override // androidx.media3.decoder.f
    public final void p() {
        this.C.m(this);
    }
}
