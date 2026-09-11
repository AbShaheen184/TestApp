package coil3.transition;

import coil3.compose.j;
import coil3.request.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {
    public final j a;
    public final coil3.request.j b;

    public e(j jVar, coil3.request.j jVar2) {
        this.a = jVar;
        this.b = jVar2;
    }

    @Override // coil3.transition.g
    public final void a() {
        coil3.request.j jVar = this.b;
        boolean z = jVar instanceof p;
        j jVar2 = this.a;
        if (z) {
            jVar2.getClass();
        } else if (jVar instanceof coil3.request.c) {
            jVar2.getClass();
        } else {
            coil3.g.a();
        }
    }
}
