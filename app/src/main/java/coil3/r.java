package coil3;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    public final /* synthetic */ androidx.media3.exoplayer.dash.manifest.t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CoroutineExceptionHandler.Key key, androidx.media3.exoplayer.dash.manifest.t tVar) {
        super(key);
        this.e = tVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.i iVar, Throwable th) {
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        if (tVar != null) {
            coil3.util.h hVar = (coil3.util.h) tVar.y;
            coil3.util.h hVar2 = coil3.util.h.B;
            if (hVar.compareTo(hVar2) <= 0) {
                androidx.media3.exoplayer.dash.manifest.t.N("RealImageLoader", hVar2, null, th);
            }
        }
    }
}
