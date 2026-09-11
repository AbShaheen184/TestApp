package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends okio.m {
    public final /* synthetic */ f y;
    public final /* synthetic */ androidx.compose.material.ripple.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, androidx.compose.material.ripple.g gVar, okio.f0 f0Var) {
        super(f0Var);
        this.y = fVar;
        this.z = gVar;
    }

    @Override // okio.m, okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f fVar = this.y;
        androidx.compose.material.ripple.g gVar = this.z;
        synchronized (fVar) {
            if (gVar.a) {
                return;
            }
            gVar.a = true;
            super.close();
            ((b1) this.z.b).c();
        }
    }
}
