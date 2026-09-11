package coil3.disk;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AutoCloseable {
    public final a e;
    public boolean y;
    public final /* synthetic */ d z;

    public b(d dVar, a aVar) {
        this.z = dVar;
        this.e = aVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        d dVar = this.z;
        synchronized (dVar.E) {
            a aVar = this.e;
            int i = aVar.h - 1;
            aVar.h = i;
            if (i == 0 && aVar.f) {
                dVar.Y(aVar);
            }
        }
    }
}
