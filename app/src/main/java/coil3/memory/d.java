package coil3.memory;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.media3.exoplayer.source.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final androidx.compose.ui.input.pointer.util.b a;
    public final l b;
    public final Object c = new Object();

    public d(androidx.compose.ui.input.pointer.util.b bVar, l lVar) {
        this.a = bVar;
        this.b = lVar;
    }

    public final void a(long j) {
        synchronized (this.c) {
            r0 r0Var = (r0) this.a.c;
            r0Var.e = j;
            r0Var.d(j);
        }
    }
}
