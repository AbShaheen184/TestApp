package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements j {
    public final Semaphore a;

    public u(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, coil3.request.n nVar) {
        ImageDecoder.Source sourceB;
        Bitmap.Config configA = coil3.request.i.a(nVar);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceB = androidx.compose.ui.platform.coreshims.b.B(kVar.a, nVar)) != null) {
            return new x(sourceB, kVar.a, nVar, this.a);
        }
        return null;
    }
}
