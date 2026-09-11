package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d c = new d();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, c cVar, n nVar, Class cls) {
        n nVar2 = (n) map.get(cVar);
        if (nVar2 == null || nVar == nVar2) {
            if (nVar2 == null) {
                map.put(cVar, nVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + nVar2 + ", new value " + nVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            b bVarA = (b) map2.get(superclass);
            if (bVarA == null) {
                bVarA = a(superclass, null);
            }
            map.putAll(bVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVarA2 = (b) map2.get(cls2);
            if (bVarA2 == null) {
                bVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : bVarA2.b.entrySet()) {
                b(map, (c) entry.getKey(), (n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            b0 b0Var = (b0) method.getAnnotation(b0.class);
            if (b0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!v.class.isAssignableFrom(parameterTypes[0])) {
                        net.luminis.tls.engine.impl.c.o("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                n nVarValue = b0Var.value();
                if (parameterTypes.length > 1) {
                    if (!n.class.isAssignableFrom(parameterTypes[1])) {
                        net.luminis.tls.engine.impl.c.o("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (nVarValue != n.ON_ANY) {
                        net.luminis.tls.engine.impl.c.o("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    net.luminis.tls.engine.impl.c.o("cannot have more than 2 params");
                    return null;
                }
                b(map, new c(i, method), nVarValue, cls);
                z = true;
            }
        }
        b bVar = new b(map);
        map2.put(cls, bVar);
        this.b.put(cls, Boolean.valueOf(z));
        return bVar;
    }
}
