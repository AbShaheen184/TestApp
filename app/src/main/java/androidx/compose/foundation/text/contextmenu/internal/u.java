package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kotlin.jvm.functions.q {
    public final /* synthetic */ RemoteAction e;

    public u(RemoteAction remoteAction) {
        this.e = remoteAction;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.graphics.t) obj).a;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            v.a.e(this.e.getIcon(), rVar, 48);
        } else {
            rVar.W();
        }
        return y.a;
    }
}
