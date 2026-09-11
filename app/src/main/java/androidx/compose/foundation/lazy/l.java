package androidx.compose.foundation.lazy;

import com.app.mlounge.ui.screens.settings.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                m mVar = (m) this.z;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.appcompat.widget.x xVar = mVar.b.b;
                    int i = this.y;
                    androidx.compose.foundation.lazy.layout.j jVarI = xVar.i(i);
                    ((h) jVarI.c).c.invoke(mVar.c, Integer.valueOf(i - jVarI.a), rVar, 0);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.grid.i iVar = (androidx.compose.foundation.lazy.grid.i) this.z;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.appcompat.widget.x xVar2 = iVar.b.c;
                    int i2 = this.y;
                    androidx.compose.foundation.lazy.layout.j jVarI2 = xVar2.i(i2);
                    ((androidx.compose.foundation.lazy.grid.f) jVarI2.c).d.invoke(androidx.compose.foundation.lazy.grid.j.a, Integer.valueOf(i2 - jVarI2.a), rVar2, 6);
                } else {
                    rVar2.W();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                e0.e((com.app.mlounge.ui.viewmodel.k) this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.y | 1));
                break;
        }
        return kotlin.y.a;
    }
}
