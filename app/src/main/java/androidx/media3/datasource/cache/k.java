package androidx.media3.datasource.cache;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final TreeSet a = new TreeSet(new j());
    public long b;

    public final void a(n nVar, long j) {
        while (this.b + j > 4294967296L && !this.a.isEmpty()) {
            o oVar = (o) this.a.first();
            synchronized (nVar) {
                nVar.j(oVar);
            }
        }
    }

    public final void b(n nVar, o oVar) {
        this.a.add(oVar);
        this.b += oVar.z;
        a(nVar, 0L);
    }
}
