package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface o extends androidx.media3.common.i {
    boolean b(byte[] bArr, int i, int i2, boolean z);

    boolean d(int i, boolean z);

    boolean e(byte[] bArr, int i, int i2, boolean z);

    long f();

    long getLength();

    long getPosition();

    void h(int i);

    int i(int i);

    int j(byte[] bArr, int i, int i2);

    void n();

    void r(int i);

    void readFully(byte[] bArr, int i, int i2);

    void x(byte[] bArr, int i, int i2);
}
