package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    default int a(androidx.media3.common.i iVar, int i, boolean z) {
        return c(iVar, i, z);
    }

    void b(androidx.media3.common.util.w wVar, int i, int i2);

    int c(androidx.media3.common.i iVar, int i, boolean z);

    void e(androidx.media3.common.r rVar);

    default void f(int i, androidx.media3.common.util.w wVar) {
        b(wVar, i, 0);
    }

    void g(long j, int i, int i2, int i3, g0 g0Var);

    default void d(long j) {
    }
}
