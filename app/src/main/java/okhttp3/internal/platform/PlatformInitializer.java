package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.collections.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return u.e;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        context.getClass();
        e eVar = e.a;
        Object obj = e.a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.a;
    }
}
