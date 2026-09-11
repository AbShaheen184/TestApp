package retrofit2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z0 {
    public static final i0 c = new i0();

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        okhttp3.v vVar = (okhttp3.v) obj;
        if (vVar != null) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = o0Var.i;
            cVar.getClass();
            ((ArrayList) cVar.A).add(vVar);
        }
    }
}
