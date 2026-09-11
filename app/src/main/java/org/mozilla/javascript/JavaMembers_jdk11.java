package org.mozilla.javascript;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class JavaMembers_jdk11 extends JavaMembers {
    public JavaMembers_jdk11(Scriptable scriptable, Class<?> cls, boolean z) {
        super(scriptable, cls, z);
    }

    private static Method findAccessibleMethod(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        loop0: while (true) {
            for (Class<?> cls : declaringClass.getInterfaces()) {
                try {
                    method = cls.getMethod(name, parameterTypes);
                    break loop0;
                } catch (NoSuchMethodException unused) {
                }
            }
            declaringClass = declaringClass.getSuperclass();
            if (declaringClass == null) {
                break;
            }
            if (isExportedClass(declaringClass)) {
                try {
                    method = declaringClass.getMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused2) {
                    continue;
                }
            }
        }
        return method;
    }

    private static boolean isExportedClass(Class<?> cls) {
        String name;
        Package r0 = cls.getPackage();
        if (r0 != null) {
            name = r0.getName();
        } else {
            if (!Proxy.isProxyClass(cls)) {
                return true;
            }
            String name2 = cls.getName();
            name = name2.substring(0, name2.lastIndexOf(46));
        }
        try {
            try {
                Object objInvoke = cls.getClass().getMethod("getModule", null).invoke(cls, null);
                return ((Boolean) objInvoke.getClass().getMethod("isExported", String.class).invoke(objInvoke, name)).booleanValue();
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // org.mozilla.javascript.JavaMembers
    public void discoverPublicMethods(Class<?> cls, Map<JavaMembers.MethodSignature, Method> map) {
        if (isExportedClass(cls)) {
            super.discoverPublicMethods(cls, map);
            return;
        }
        for (Method method : cls.getMethods()) {
            JavaMembers.registerMethod(map, findAccessibleMethod(method));
        }
    }
}
