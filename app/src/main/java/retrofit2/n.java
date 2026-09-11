package retrofit2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d {
    public final Executor e;
    public final d y;

    public n(Executor executor, d dVar) {
        this.e = executor;
        this.y = dVar;
    }

    @Override // retrofit2.d
    public final okhttp3.b0 N() {
        return this.y.N();
    }

    @Override // retrofit2.d
    public final void cancel() {
        this.y.cancel();
    }

    @Override // retrofit2.d
    public final d clone() {
        return new n(this.e, this.y.clone());
    }

    @Override // retrofit2.d
    public final void w(g gVar) {
        this.y.w(new com.google.common.util.concurrent.g0(25, this, gVar));
    }

    @Override // retrofit2.d
    public final boolean z() {
        return this.y.z();
    }
}
