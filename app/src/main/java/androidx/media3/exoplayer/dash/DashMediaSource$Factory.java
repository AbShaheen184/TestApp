package androidx.media3.exoplayer.dash;

import androidx.appcompat.widget.x;
import androidx.compose.animation.core.t2;
import androidx.compose.foundation.gestures.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory {
    public final x a;
    public final androidx.media3.datasource.g b;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e c;
    public final com.google.android.material.shape.g d;
    public t2 e;
    public final long f;
    public final long g;

    public DashMediaSource$Factory(androidx.media3.datasource.g gVar) {
        x xVar = new x(gVar);
        this.a = xVar;
        this.b = gVar;
        this.c = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e();
        this.e = new t2(-1);
        this.f = 30000L;
        this.g = 5000000L;
        this.d = new com.google.android.material.shape.g();
        ((z1) xVar.A).e = true;
    }
}
