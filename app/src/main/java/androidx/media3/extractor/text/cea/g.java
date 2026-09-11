package androidx.media3.extractor.text.cea;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.media3.extractor.text.i implements Comparable {
    public long H;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (g(4) != gVar.g(4)) {
            return g(4) ? 1 : -1;
        }
        long j = this.D - gVar.D;
        if (j == 0) {
            j = this.H - gVar.H;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
