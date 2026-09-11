package coil3.decode;

import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    public final Semaphore a;
    public final n b;

    public c(Semaphore semaphore, n nVar) {
        this.a = semaphore;
        this.b = nVar;
    }

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, coil3.request.n nVar) {
        return new e(kVar.a, nVar, this.a, this.b);
    }
}
