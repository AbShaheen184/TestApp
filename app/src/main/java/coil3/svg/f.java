package coil3.svg;

import androidx.room.z;
import coil3.decode.k;
import coil3.decode.q;
import coil3.request.n;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.InterruptibleKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {
    public static final z g = new z(2);
    public final q a;
    public final n b;
    public final c c;
    public final l d;
    public final boolean e;
    public final boolean f;

    public f(q qVar, n nVar, c cVar, l lVar, boolean z, boolean z2) {
        this.a = qVar;
        this.b = nVar;
        this.c = cVar;
        this.d = lVar;
        this.e = z;
        this.f = z2;
    }

    @Override // coil3.decode.k
    public final Object a(kotlin.coroutines.d dVar) {
        return InterruptibleKt.runInterruptible(j.e, new androidx.room.coroutines.d(this, 9), dVar);
    }
}
