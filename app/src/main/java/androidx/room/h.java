package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((d) iInterface).getClass();
        obj.getClass();
        this.a.y.remove((Integer) obj);
    }
}
