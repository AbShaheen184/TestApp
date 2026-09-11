package androidx.media3.extractor.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public final long e;
    public final byte[] y;

    public g(long j, byte[] bArr) {
        this.e = j;
        this.y = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.e, ((g) obj).e);
    }
}
