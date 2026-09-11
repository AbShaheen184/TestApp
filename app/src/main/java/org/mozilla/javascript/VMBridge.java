package org.mozilla.javascript;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class VMBridge {
    static final VMBridge instance = makeInstance();

    private static VMBridge makeInstance() {
        VMBridge vMBridge;
        String[] strArr = {"org.mozilla.javascript.VMBridge_custom", "org.mozilla.javascript.jdk18.VMBridge_jdk18"};
        for (int i = 0; i != 2; i++) {
            Class<?> clsClassOrNull = Kit.classOrNull(strArr[i]);
            if (clsClassOrNull != null && (vMBridge = (VMBridge) Kit.newInstanceOrNull(clsClassOrNull)) != null) {
                return vMBridge;
            }
        }
        net.luminis.tls.engine.impl.c.r("Failed to create VMBridge instance");
        return null;
    }

    public abstract Context getContext(Object obj);

    public abstract Object getInterfaceProxyHelper(ContextFactory contextFactory, Class<?>[] clsArr);

    public abstract Object getThreadContextHelper();

    public abstract Object newInterfaceProxy(Object obj, ContextFactory contextFactory, InterfaceAdapter interfaceAdapter, Object obj2, Scriptable scriptable);

    public abstract void setContext(Object obj, Context context);

    public abstract boolean tryToMakeAccessible(AccessibleObject accessibleObject);
}
