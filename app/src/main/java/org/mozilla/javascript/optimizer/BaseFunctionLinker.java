package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import jdk.dynalink.linker.support.Guards;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class BaseFunctionLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object getPrototype(Object obj, Context context, Scriptable scriptable) {
        return ((BaseFunction) obj).getPrototypeProperty();
    }

    public boolean canLinkType(Class<?> cls) {
        return BaseFunction.class.isAssignableFrom(cls);
    }

    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) throws IllegalAccessException, NoSuchMethodException {
        MethodHandle methodHandleFindStatic;
        MethodHandle instanceOfGuard;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        if (parsedOperation.isNamespace(StandardNamespace.PROPERTY) && parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN) && "prototype".equals(parsedOperation.getName())) {
            methodHandleFindStatic = MethodHandles.lookup().findStatic(BaseFunctionLinker.class, "getPrototype", linkRequest.getCallSiteDescriptor().getMethodType());
            instanceOfGuard = Guards.getInstanceOfGuard(BaseFunction.class);
        } else {
            methodHandleFindStatic = null;
            instanceOfGuard = null;
        }
        if (methodHandleFindStatic == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" base function operation"));
        }
        return new GuardedInvocation(methodHandleFindStatic, instanceOfGuard);
    }
}
