package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class RhinoSecurityManager extends SecurityManager {
    public Class<?> getCurrentScriptClass() {
        for (Class<?> cls : getClassContext()) {
            if ((cls != InterpretedFunction.class && NativeFunction.class.isAssignableFrom(cls)) || PolicySecurityController.SecureCaller.class.isAssignableFrom(cls)) {
                return cls;
            }
        }
        return null;
    }
}
