package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.window.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements c0 {
    public androidx.compose.ui.unit.l A;
    public androidx.compose.ui.unit.j B;
    public final com.app.mlounge.data.music.e e;
    public androidx.compose.ui.unit.l y;
    public androidx.compose.ui.unit.m z;

    public p(com.app.mlounge.data.music.e eVar) {
        this.e = eVar;
    }

    @Override // androidx.compose.ui.window.c0
    public final long a(androidx.compose.ui.unit.k kVar, long j, androidx.compose.ui.unit.m mVar, long j2) {
        androidx.compose.ui.unit.j jVar = this.B;
        if (jVar != null) {
            androidx.compose.ui.unit.l lVar = this.y;
            if ((lVar == null ? false : androidx.compose.ui.unit.l.a(lVar.a, j)) && this.z == mVar) {
                androidx.compose.ui.unit.l lVar2 = this.A;
                if (lVar2 != null ? androidx.compose.ui.unit.l.a(lVar2.a, j2) : false) {
                    return jVar.a;
                }
            }
        }
        long jA = this.e.a(kVar, j, mVar, j2);
        this.y = new androidx.compose.ui.unit.l(j);
        this.z = mVar;
        this.A = new androidx.compose.ui.unit.l(j2);
        this.B = new androidx.compose.ui.unit.j(jA);
        return jA;
    }
}
