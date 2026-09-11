package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.compose.ui.window.c0 {
    public final androidx.compose.ui.e e;
    public final m y;
    public long z = 0;

    public l(androidx.compose.ui.e eVar, m mVar) {
        this.e = eVar;
        this.y = mVar;
    }

    @Override // androidx.compose.ui.window.c0
    public final long a(androidx.compose.ui.unit.k kVar, long j, androidx.compose.ui.unit.m mVar, long j2) {
        long jA = this.y.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.z;
        }
        this.z = jA;
        return androidx.compose.ui.unit.j.c(androidx.compose.ui.unit.j.c((((long) kVar.a) << 32) | (((long) kVar.b) & 4294967295L), android.support.v4.media.session.b.I(jA)), this.e.a(j2, 0L, mVar));
    }
}
