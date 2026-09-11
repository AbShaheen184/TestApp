package androidx.activity.compose;

import androidx.activity.d0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.compose.internal.b b;

    public /* synthetic */ j(androidx.lifecycle.compose.b bVar, androidx.activity.compose.internal.b bVar2, int i) {
        this.a = i;
        this.b = bVar2;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                ((d0) mVar.a).e(false);
                ((androidx.activity.compose.internal.a) mVar.b).f(false);
                break;
            default:
                ((q) this.b).j(false);
                break;
        }
    }
}
