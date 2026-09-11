package coil3.decode;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ kotlin.jvm.internal.v b;

    public w(x xVar, kotlin.jvm.internal.v vVar) {
        this.a = xVar;
        this.b = vVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        coil3.request.n nVar = this.a.c;
        coil3.size.h hVar = nVar.b;
        coil3.size.g gVar = nVar.c;
        coil3.i iVar = coil3.request.h.b;
        long j = okhttp3.internal.platform.android.g.j(width, height, hVar, gVar, (coil3.size.h) coil3.m.e(nVar, iVar));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            coil3.request.n nVar2 = this.a.c;
            double dK = okhttp3.internal.platform.android.g.k(width, height, i, i2, nVar2.c, (coil3.size.h) coil3.m.e(nVar2, iVar));
            boolean z = dK < 1.0d;
            this.b.e = z;
            if (z || this.a.c.d == coil3.size.d.e) {
                imageDecoder.setTargetSize(kotlin.math.a.E(((double) width) * dK), kotlin.math.a.E(dK * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new t());
        coil3.request.n nVar3 = this.a.c;
        imageDecoder.setAllocator(com.google.android.gms.common.wrappers.a.d(coil3.request.i.a(nVar3)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) coil3.m.e(nVar3, coil3.request.i.g)).booleanValue() ? 1 : 0);
        coil3.i iVar2 = coil3.request.i.c;
        if (androidx.transition.k.h(coil3.m.e(nVar3, iVar2)) != null) {
            imageDecoder.setTargetColorSpace(androidx.transition.k.h(coil3.m.e(nVar3, iVar2)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) coil3.m.e(nVar3, coil3.request.i.d)).booleanValue());
    }
}
