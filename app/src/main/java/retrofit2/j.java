package retrofit2;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CompletableFuture {
    public final z e;

    public j(z zVar) {
        this.e = zVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.e.cancel();
        }
        return super.cancel(z);
    }
}
