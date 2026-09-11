package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a {
    @Override // retrofit2.a
    public final String c(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.c(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // retrofit2.a
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        return p.a(method, cls, obj, objArr);
    }

    @Override // retrofit2.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
