package androidx.media3.extractor.text.webvtt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final int e;
    public final b y;

    public f(int i, b bVar) {
        this.e = i;
        this.y = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.e, ((f) obj).e);
    }
}
