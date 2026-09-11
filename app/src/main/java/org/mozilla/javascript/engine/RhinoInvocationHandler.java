package org.mozilla.javascript.engine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class RhinoInvocationHandler implements InvocationHandler {
    private final RhinoScriptEngine engine;
    private final Object thiz;

    public RhinoInvocationHandler(RhinoScriptEngine rhinoScriptEngine, Object obj) {
        this.engine = rhinoScriptEngine;
        this.thiz = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.engine.invokeMethodRaw(this.thiz, method.getName(), method.getReturnType(), objArr);
    }
}
