package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import jdk.dynalink.linker.support.Guards;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class StringLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object add(Object obj, Object obj2, Context context) {
        return new ConsString((String) obj, ((CharSequence) obj2).toString());
    }

    private static boolean eq(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static Object getLength(Object obj, Context context, Scriptable scriptable) {
        return Integer.valueOf(((String) obj).length());
    }

    private static boolean testAdd(Object obj, Object obj2, Context context) {
        return (obj instanceof String) && (obj2 instanceof CharSequence);
    }

    private static boolean testEq(Object obj, Object obj2) {
        return (obj instanceof String) && (obj2 instanceof String);
    }

    public boolean canLinkType(Class<?> cls) {
        return String.class.equals(cls);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) throws IllegalAccessException, NoSuchMethodException {
        MethodHandle methodHandleFindStatic;
        MethodHandle instanceOfGuard;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        Object obj = linkRequest.getArguments().length > 1 ? linkRequest.getArguments()[1] : null;
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        MethodType methodType = linkRequest.getCallSiteDescriptor().getMethodType();
        if (parsedOperation.isNamespace(RhinoNamespace.MATH)) {
            if (parsedOperation.isOperation(RhinoOperation.ADD)) {
                MethodType methodTypeChangeReturnType = methodType.changeReturnType(Boolean.TYPE);
                if (obj instanceof CharSequence) {
                    methodHandleFindStatic = lookup.findStatic(StringLinker.class, "add", methodType);
                    instanceOfGuard = lookup.findStatic(StringLinker.class, "testAdd", methodTypeChangeReturnType);
                } else {
                    methodHandleFindStatic = null;
                    instanceOfGuard = null;
                }
            } else if (parsedOperation.isOperation(RhinoOperation.EQ, RhinoOperation.SHALLOWEQ) && (obj instanceof String)) {
                MethodHandle methodHandleFindStatic2 = lookup.findStatic(StringLinker.class, "eq", methodType);
                instanceOfGuard = lookup.findStatic(StringLinker.class, "testEq", methodType);
                methodHandleFindStatic = methodHandleFindStatic2;
            } else {
                methodHandleFindStatic = null;
                instanceOfGuard = null;
            }
        } else if (parsedOperation.isNamespace(StandardNamespace.PROPERTY) && parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN) && "length".equals(parsedOperation.getName())) {
            methodHandleFindStatic = lookup.findStatic(StringLinker.class, "getLength", methodType);
            instanceOfGuard = Guards.getInstanceOfGuard(String.class);
        } else {
            methodHandleFindStatic = null;
            instanceOfGuard = null;
        }
        if (methodHandleFindStatic == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" string operation"));
        }
        return new GuardedInvocation(methodHandleFindStatic, instanceOfGuard);
    }
}
