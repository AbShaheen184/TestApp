package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends a {
    @Override // retrofit2.a
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.a(method, cls, obj, objArr);
        }
        com.google.gson.b.r("Calling default methods on API 24 and 25 is not supported");
        return null;
    }

    @Override // retrofit2.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
