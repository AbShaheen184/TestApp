package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import org.mozilla.javascript.annotations.JSStaticFunction;
import org.mozilla.javascript.debug.DebuggableObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ScriptableObject implements Scriptable, SymbolScriptable, Serializable, DebuggableObject, ConstProperties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONST = 13;
    public static final int DONTENUM = 2;
    public static final int EMPTY = 0;
    private static final Method GET_ARRAY_LENGTH;
    private static final Comparator<Object> KEY_COMPARATOR;
    public static final int PERMANENT = 4;
    public static final int READONLY = 1;
    public static final int UNINITIALIZED_CONST = 8;
    private static final long serialVersionUID = 2829861078851942586L;
    private volatile Map<Object, Object> associatedValues;
    private transient ExternalArrayData externalData;
    private boolean isExtensible;
    private boolean isSealed;
    private Scriptable parentScopeObject;
    private Scriptable prototypeObject;
    private transient SlotMapContainer slotMap;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class KeyComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = 6411335891523988149L;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (!(obj instanceof Integer)) {
                return obj2 instanceof Integer ? 1 : 0;
            }
            if (obj2 instanceof Integer) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
            return -1;
        }
    }

    static {
        try {
            GET_ARRAY_LENGTH = ScriptableObject.class.getMethod("getExternalArrayLength", null);
            KEY_COMPARATOR = new KeyComparator();
        } catch (NoSuchMethodException e) {
            net.luminis.tls.engine.impl.c.k(e);
        }
    }

    public ScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        this.isExtensible = true;
        this.isSealed = false;
        if (scriptable == null) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        this.parentScopeObject = scriptable;
        this.prototypeObject = scriptable2;
        this.slotMap = createSlotMap(0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197 A[PHI: r5 r28
  0x0197: PHI (r5v3 java.lang.reflect.Method) = (r5v2 java.lang.reflect.Method), (r5v2 java.lang.reflect.Method), (r5v4 java.lang.reflect.Method) binds: [B:131:0x0200, B:105:0x01a6, B:101:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r28v3 java.lang.String) = (r28v1 java.lang.String), (r28v2 java.lang.String), (r28v4 java.lang.String) binds: [B:131:0x0200, B:105:0x01a6, B:101:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:132:0x0202  */
    /* JADX WARN: Code duplicated, block: B:133:0x0204  */
    /* JADX WARN: Code duplicated, block: B:136:0x020b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x0219  */
    /* JADX WARN: Code duplicated, block: B:144:0x021e  */
    /* JADX WARN: Code duplicated, block: B:147:0x022a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0231  */
    /* JADX WARN: Code duplicated, block: B:151:0x0237  */
    /* JADX WARN: Code duplicated, block: B:171:0x027d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0285  */
    /* JADX WARN: Code duplicated, block: B:174:0x0288  */
    /* JADX WARN: Code duplicated, block: B:201:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    public static <T extends Scriptable> BaseFunction buildClassCtor(Scriptable scriptable, Class<T> cls, boolean z, boolean z2) throws IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor;
        Class<T> cls2;
        Scriptable objectPrototype;
        Annotation annotation;
        String str;
        String str2;
        int i;
        HashSet hashSet;
        String propertyName;
        int i2;
        Method methodFindSetterMethod;
        int i3;
        Constructor<?> constructor2;
        Method methodFindSingleMethod;
        String strDefineClass;
        BaseFunction baseFunction;
        Object prototypeProperty;
        Method[] methodList = FunctionObject.getMethodList(cls);
        int length = methodList.length;
        int i4 = 0;
        while (true) {
            int i5 = 3;
            int i6 = 2;
            int i7 = 1;
            if (i4 >= length) {
                Constructor<?>[] constructors = cls.getConstructors();
                int length2 = constructors.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i8];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i8++;
                }
                if (constructor == null) {
                    throw Context.reportRuntimeErrorById("msg.zero.arg.ctor", cls.getName());
                }
                Scriptable scriptable2 = (Scriptable) constructor.newInstance(ScriptRuntime.emptyArgs);
                String className = scriptable2.getClassName();
                Object property = getProperty(getTopLevelScope(scriptable), className);
                if (!(property instanceof BaseFunction) || (prototypeProperty = (baseFunction = (BaseFunction) property).getPrototypeProperty()) == null) {
                    cls2 = cls;
                } else {
                    cls2 = cls;
                    if (cls2.equals(prototypeProperty.getClass())) {
                        return baseFunction;
                    }
                }
                if (z2) {
                    Class<? super T> superclass = cls2.getSuperclass();
                    if (!ScriptRuntime.ScriptableClass.isAssignableFrom(superclass) || Modifier.isAbstract(superclass.getModifiers()) || (strDefineClass = defineClass(scriptable, extendsScriptable(superclass), z, z2)) == null) {
                        objectPrototype = null;
                    } else {
                        objectPrototype = getClassPrototype(scriptable, strDefineClass);
                    }
                } else {
                    objectPrototype = null;
                }
                if (objectPrototype == null) {
                    objectPrototype = getObjectPrototype(scriptable);
                }
                scriptable2.setPrototype(objectPrototype);
                Member memberFindAnnotatedMember = findAnnotatedMember(methodList, JSConstructor.class);
                Member memberFindAnnotatedMember2 = memberFindAnnotatedMember;
                if (memberFindAnnotatedMember == null) {
                    memberFindAnnotatedMember2 = findAnnotatedMember(constructors, JSConstructor.class);
                }
                String str3 = "jsConstructor";
                Member member = memberFindAnnotatedMember2;
                if (memberFindAnnotatedMember2 == null) {
                    methodFindSingleMethod = FunctionObject.findSingleMethod(methodList, "jsConstructor");
                }
                if (member == null) {
                    if (constructors.length == 1) {
                        constructor2 = constructors[0];
                    } else if (constructors.length == 2) {
                        if (constructors[0].getParameterTypes().length == 0) {
                            member = methodFindSingleMethod;
                            member = member;
                            member = constructors[1];
                        } else if (constructors[1].getParameterTypes().length == 0) {
                            member = methodFindSingleMethod;
                            member = member;
                            member = member;
                            member = constructors[0];
                        }
                    }
                    if (member == null) {
                        member = methodFindSingleMethod;
                        member = constructor2;
                        throw Context.reportRuntimeErrorById("msg.ctor.multiple.parms", cls2.getName());
                    }
                }
                member = methodFindSingleMethod;
                member = constructor2;
                member = methodFindSingleMethod;
                FunctionObject functionObject = new FunctionObject(className, member, scriptable);
                if (functionObject.isVarArgsMethod()) {
                    throw Context.reportRuntimeErrorById("msg.varargs.ctor", member.getName());
                }
                functionObject.initAsConstructor(scriptable, scriptable2, 7);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                int length3 = methodList.length;
                int i9 = 0;
                Method method = null;
                while (i9 < length3) {
                    int i10 = i7;
                    Method method2 = methodList[i9];
                    if (method2 == member) {
                        str = str3;
                        i2 = i6;
                        hashSet2 = hashSet2;
                    } else {
                        String name = method2.getName();
                        int i11 = i6;
                        if (name.equals("finishInit")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (parameterTypes.length == i5) {
                                Class<?> cls3 = parameterTypes[0];
                                Class<Scriptable> cls4 = ScriptRuntime.ScriptableClass;
                                if (cls3 == cls4 && parameterTypes[i10] == FunctionObject.class && parameterTypes[i11] == cls4 && Modifier.isStatic(method2.getModifiers())) {
                                    str = str3;
                                    method = method2;
                                } else if (name.indexOf(36) == -1 || name.equals(str3)) {
                                    str = str3;
                                } else {
                                    if (method2.isAnnotationPresent(JSFunction.class)) {
                                        annotation = method2.getAnnotation(JSFunction.class);
                                    } else if (method2.isAnnotationPresent(JSStaticFunction.class)) {
                                        annotation = method2.getAnnotation(JSStaticFunction.class);
                                    } else if (method2.isAnnotationPresent(JSGetter.class)) {
                                        annotation = method2.getAnnotation(JSGetter.class);
                                    } else if (method2.isAnnotationPresent(JSSetter.class)) {
                                        str = str3;
                                    } else {
                                        annotation = null;
                                    }
                                    str = str3;
                                    if (annotation == null) {
                                        str2 = "jsFunction_";
                                        if (!name.startsWith("jsFunction_")) {
                                            if (name.startsWith("jsStaticFunction_")) {
                                                str2 = "jsStaticFunction_";
                                            } else if (name.startsWith("jsGet_")) {
                                                str2 = "jsGet_";
                                            }
                                        }
                                    } else {
                                        str2 = null;
                                    }
                                    if (!(annotation instanceof JSStaticFunction) || Objects.equals(str2, "jsStaticFunction_")) {
                                        i = i10;
                                    } else {
                                        i = 0;
                                    }
                                    if (i != 0) {
                                        hashSet = hashSet2;
                                    } else {
                                        hashSet = hashSet3;
                                    }
                                    int i12 = i;
                                    propertyName = getPropertyName(name, str2, annotation);
                                    if (hashSet.contains(propertyName)) {
                                        throw Context.reportRuntimeErrorById("duplicate.defineClass.name", name, propertyName);
                                    }
                                    hashSet.add(propertyName);
                                    if (!(annotation instanceof JSGetter) || Objects.equals(str2, "jsGet_")) {
                                        i2 = i11;
                                        if (!(scriptable2 instanceof ScriptableObject)) {
                                            throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), propertyName);
                                        }
                                        methodFindSetterMethod = findSetterMethod(methodList, propertyName, "jsSet_");
                                        if (methodFindSetterMethod != null) {
                                            i3 = 0;
                                        } else {
                                            i3 = i10;
                                        }
                                        ((ScriptableObject) scriptable2).defineProperty(propertyName, (Object) null, method2, methodFindSetterMethod, i3 | 6);
                                    } else {
                                        if (i12 != 0 && !Modifier.isStatic(method2.getModifiers())) {
                                            throw Context.reportRuntimeError("jsStaticFunction must be used with static method.");
                                        }
                                        FunctionObject functionObject2 = new FunctionObject(propertyName, method2, scriptable2);
                                        if (functionObject2.isVarArgsConstructor()) {
                                            throw Context.reportRuntimeErrorById("msg.varargs.fun", member.getName());
                                        }
                                        i2 = i11;
                                        defineProperty(i12 != 0 ? functionObject : scriptable2, propertyName, functionObject2, i2);
                                        if (z) {
                                            functionObject2.sealObject();
                                        }
                                    }
                                }
                                hashSet2 = hashSet2;
                                i2 = i11;
                            } else if (name.indexOf(36) == -1) {
                                str = str3;
                                hashSet2 = hashSet2;
                                i2 = i11;
                            } else {
                                if (method2.isAnnotationPresent(JSFunction.class)) {
                                    annotation = method2.getAnnotation(JSFunction.class);
                                } else if (method2.isAnnotationPresent(JSStaticFunction.class)) {
                                    annotation = method2.getAnnotation(JSStaticFunction.class);
                                } else if (method2.isAnnotationPresent(JSGetter.class)) {
                                    annotation = method2.getAnnotation(JSGetter.class);
                                } else {
                                    if (method2.isAnnotationPresent(JSSetter.class)) {
                                        str = str3;
                                    } else {
                                        annotation = null;
                                    }
                                    hashSet2 = hashSet2;
                                    i2 = i11;
                                }
                                str = str3;
                                if (annotation == null) {
                                    str2 = "jsFunction_";
                                    if (!name.startsWith("jsFunction_")) {
                                        if (name.startsWith("jsStaticFunction_")) {
                                            str2 = "jsStaticFunction_";
                                        } else if (name.startsWith("jsGet_")) {
                                            str2 = "jsGet_";
                                        } else {
                                            hashSet2 = hashSet2;
                                            i2 = i11;
                                        }
                                    }
                                } else {
                                    str2 = null;
                                }
                                if (annotation instanceof JSStaticFunction) {
                                    i = i10;
                                } else {
                                    i = i10;
                                }
                                if (i != 0) {
                                    hashSet = hashSet2;
                                } else {
                                    hashSet = hashSet3;
                                }
                                int i13 = i;
                                propertyName = getPropertyName(name, str2, annotation);
                                if (hashSet.contains(propertyName)) {
                                    throw Context.reportRuntimeErrorById("duplicate.defineClass.name", name, propertyName);
                                }
                                hashSet.add(propertyName);
                                if (annotation instanceof JSGetter) {
                                    i2 = i11;
                                    if (!(scriptable2 instanceof ScriptableObject)) {
                                        throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), propertyName);
                                    }
                                    methodFindSetterMethod = findSetterMethod(methodList, propertyName, "jsSet_");
                                    if (methodFindSetterMethod != null) {
                                        i3 = 0;
                                    } else {
                                        i3 = i10;
                                    }
                                    ((ScriptableObject) scriptable2).defineProperty(propertyName, (Object) null, method2, methodFindSetterMethod, i3 | 6);
                                } else {
                                    i2 = i11;
                                    if (!(scriptable2 instanceof ScriptableObject)) {
                                        throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), propertyName);
                                    }
                                    methodFindSetterMethod = findSetterMethod(methodList, propertyName, "jsSet_");
                                    if (methodFindSetterMethod != null) {
                                        i3 = 0;
                                    } else {
                                        i3 = i10;
                                    }
                                    ((ScriptableObject) scriptable2).defineProperty(propertyName, (Object) null, method2, methodFindSetterMethod, i3 | 6);
                                }
                            }
                        } else if (name.indexOf(36) == -1) {
                            str = str3;
                            hashSet2 = hashSet2;
                            i2 = i11;
                        } else {
                            if (method2.isAnnotationPresent(JSFunction.class)) {
                                annotation = method2.getAnnotation(JSFunction.class);
                            } else if (method2.isAnnotationPresent(JSStaticFunction.class)) {
                                annotation = method2.getAnnotation(JSStaticFunction.class);
                            } else if (method2.isAnnotationPresent(JSGetter.class)) {
                                annotation = method2.getAnnotation(JSGetter.class);
                            } else {
                                if (method2.isAnnotationPresent(JSSetter.class)) {
                                    str = str3;
                                } else {
                                    annotation = null;
                                }
                                hashSet2 = hashSet2;
                                i2 = i11;
                            }
                            str = str3;
                            if (annotation == null) {
                                str2 = "jsFunction_";
                                if (!name.startsWith("jsFunction_")) {
                                    if (name.startsWith("jsStaticFunction_")) {
                                        str2 = "jsStaticFunction_";
                                    } else if (name.startsWith("jsGet_")) {
                                        str2 = "jsGet_";
                                    } else {
                                        hashSet2 = hashSet2;
                                        i2 = i11;
                                    }
                                }
                            } else {
                                str2 = null;
                            }
                            if (annotation instanceof JSStaticFunction) {
                                i = i10;
                            } else {
                                i = i10;
                            }
                            if (i != 0) {
                                hashSet = hashSet2;
                            } else {
                                hashSet = hashSet3;
                            }
                            int i14 = i;
                            propertyName = getPropertyName(name, str2, annotation);
                            if (hashSet.contains(propertyName)) {
                                throw Context.reportRuntimeErrorById("duplicate.defineClass.name", name, propertyName);
                            }
                            hashSet.add(propertyName);
                            if (annotation instanceof JSGetter) {
                                i2 = i11;
                                if (!(scriptable2 instanceof ScriptableObject)) {
                                    throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), propertyName);
                                }
                                methodFindSetterMethod = findSetterMethod(methodList, propertyName, "jsSet_");
                                if (methodFindSetterMethod != null) {
                                    i3 = 0;
                                } else {
                                    i3 = i10;
                                }
                                ((ScriptableObject) scriptable2).defineProperty(propertyName, (Object) null, method2, methodFindSetterMethod, i3 | 6);
                            } else {
                                i2 = i11;
                                if (!(scriptable2 instanceof ScriptableObject)) {
                                    throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), propertyName);
                                }
                                methodFindSetterMethod = findSetterMethod(methodList, propertyName, "jsSet_");
                                if (methodFindSetterMethod != null) {
                                    i3 = 0;
                                } else {
                                    i3 = i10;
                                }
                                ((ScriptableObject) scriptable2).defineProperty(propertyName, (Object) null, method2, methodFindSetterMethod, i3 | 6);
                            }
                        }
                    }
                    i9++;
                    hashSet2 = hashSet2;
                    str3 = str;
                    i6 = i2;
                    i7 = i10;
                    i5 = 3;
                }
                if (method != null) {
                    method.invoke(null, scriptable, functionObject, scriptable2);
                }
                if (z) {
                    functionObject.sealObject();
                    if (scriptable2 instanceof ScriptableObject) {
                        ((ScriptableObject) scriptable2).sealObject();
                    }
                }
                return functionObject;
            }
            Method method3 = methodList[i4];
            if (method3.getName().equals("init")) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 3 && parameterTypes2[0] == ScriptRuntime.ContextClass && parameterTypes2[1] == ScriptRuntime.ScriptableClass && parameterTypes2[2] == Boolean.TYPE && Modifier.isStatic(method3.getModifiers())) {
                    method3.invoke(null, Context.getContext(), scriptable, z ? Boolean.TRUE : Boolean.FALSE);
                    return null;
                }
                if (parameterTypes2.length == 1 && parameterTypes2[0] == ScriptRuntime.ScriptableClass && Modifier.isStatic(method3.getModifiers())) {
                    method3.invoke(null, scriptable);
                    return null;
                }
            }
            i4++;
        }
    }

    public static ScriptableObject buildDataDescriptor(Scriptable scriptable, Object obj, int i) {
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel.Builtins.Object);
        nativeObject.defineProperty(ES6Iterator.VALUE_PROPERTY, obj, 0);
        nativeObject.setCommonDescriptorProperties(i, true);
        return nativeObject;
    }

    public static Object callMethod(Context context, Scriptable scriptable, String str, Object[] objArr) {
        Object property = getProperty(scriptable, str);
        if (!(property instanceof Function)) {
            throw ScriptRuntime.notFunctionError(scriptable, str);
        }
        Function function = (Function) property;
        Scriptable topLevelScope = getTopLevelScope(scriptable);
        return context != null ? function.call(context, topLevelScope, scriptable, objArr) : Context.call(null, function, topLevelScope, scriptable, objArr);
    }

    private void checkNotSealed(Object obj, int i) {
        if (isSealed()) {
            throw Context.reportRuntimeErrorById("msg.modify.sealed", obj != null ? obj.toString() : Integer.toString(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Slot checkSlotRemoval(Object obj, int i, Slot slot) {
        if (slot == null || (slot.getAttributes() & 4) == 0) {
            return null;
        }
        if (Context.getContext().isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", obj);
        }
        return slot;
    }

    public static void checkValidAttributes(int i) {
        if ((i & (-16)) == 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.o(String.valueOf(i));
    }

    private LambdaAccessorSlot createLambdaAccessorSlot(Object obj, int i, java.util.function.Function<Scriptable, Object> function, BiConsumer<Scriptable, Object> biConsumer, int i2) {
        LambdaAccessorSlot lambdaAccessorSlot = new LambdaAccessorSlot(obj, i);
        lambdaAccessorSlot.setGetter(this, function);
        lambdaAccessorSlot.setSetter(this, biConsumer);
        lambdaAccessorSlot.setAttributes(i2);
        return lambdaAccessorSlot;
    }

    private static SlotMapContainer createSlotMap(int i) {
        Context currentContext = Context.getCurrentContext();
        return (currentContext == null || !currentContext.hasFeature(17)) ? new SlotMapContainer(i) : new ThreadSafeSlotMapContainer(i);
    }

    public static <T extends Scriptable> String defineClass(Scriptable scriptable, Class<T> cls, boolean z, boolean z2) throws IllegalAccessException, InvocationTargetException {
        BaseFunction baseFunctionBuildClassCtor = buildClassCtor(scriptable, cls, z, z2);
        if (baseFunctionBuildClassCtor == null) {
            return null;
        }
        String className = baseFunctionBuildClassCtor.getClassPrototype().getClassName();
        defineProperty(scriptable, className, baseFunctionBuildClassCtor, 2);
        return className;
    }

    public static void defineConstProperty(Scriptable scriptable, String str) {
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).defineConst(str, scriptable);
        } else {
            defineProperty(scriptable, str, Undefined.instance, 13);
        }
    }

    public static boolean deleteProperty(Scriptable scriptable, Symbol symbol) {
        Scriptable base = getBase(scriptable, symbol);
        if (base == null) {
            return true;
        }
        SymbolScriptable symbolScriptableEnsureSymbolScriptable = ensureSymbolScriptable(base);
        symbolScriptableEnsureSymbolScriptable.delete(symbol);
        return !symbolScriptableEnsureSymbolScriptable.has(symbol, scriptable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AccessorSlot ensureAccessorSlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new AccessorSlot(obj, i);
        }
        return slot instanceof AccessorSlot ? (AccessorSlot) slot : new AccessorSlot(slot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LambdaSlot ensureLambdaSlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new LambdaSlot(obj, i);
        }
        return slot instanceof LambdaSlot ? (LambdaSlot) slot : new LambdaSlot(slot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LazyLoadSlot ensureLazySlot(Object obj, int i, Slot slot) {
        if (slot == null) {
            return new LazyLoadSlot(obj, i);
        }
        return slot instanceof LazyLoadSlot ? (LazyLoadSlot) slot : new LazyLoadSlot(slot);
    }

    public static Scriptable ensureScriptable(Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static ScriptableObject ensureScriptableObject(Object obj) {
        if (obj instanceof ScriptableObject) {
            return (ScriptableObject) obj;
        }
        if (obj instanceof Delegator) {
            return (ScriptableObject) ((Delegator) obj).getDelegee();
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static ScriptableObject ensureScriptableObjectButNotSymbol(Object obj) {
        if (obj instanceof Symbol) {
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(obj));
        }
        return ensureScriptableObject(obj);
    }

    public static SymbolScriptable ensureSymbolScriptable(Object obj) {
        if (obj instanceof SymbolScriptable) {
            return (SymbolScriptable) obj;
        }
        throw ScriptRuntime.typeErrorById("msg.object.not.symbolscriptable", ScriptRuntime.typeof(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends Scriptable> Class<T> extendsScriptable(Class<?> cls) {
        if (ScriptRuntime.ScriptableClass.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Member findAnnotatedMember(AccessibleObject[] accessibleObjectArr, Class<? extends Annotation> cls) {
        for (Constructor constructor : accessibleObjectArr) {
            if (constructor.isAnnotationPresent(cls)) {
                return constructor;
            }
        }
        return null;
    }

    private static Method findSetterMethod(Method[] methodArr, String str, String str2) {
        String str3 = "set" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
        for (Method method : methodArr) {
            JSSetter jSSetter = (JSSetter) method.getAnnotation(JSSetter.class);
            if (jSSetter != null && (str.equals(jSSetter.value()) || ("".equals(jSSetter.value()) && str3.equals(method.getName())))) {
                return method;
            }
        }
        String strC = androidx.constraintlayout.core.g.c(str2, str);
        for (Method method2 : methodArr) {
            if (strC.equals(method2.getName())) {
                return method2;
            }
        }
        return null;
    }

    public static Scriptable getArrayPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Array);
    }

    private Slot getAttributeSlot(String str, int i) {
        Slot slotQuery = this.slotMap.query(str, i);
        if (slotQuery != null) {
            return slotQuery;
        }
        if (str == null) {
            str = Integer.toString(i);
        }
        throw Context.reportRuntimeErrorById("msg.prop.not.found", str);
    }

    private static Scriptable getBase(Scriptable scriptable, Symbol symbol) {
        Scriptable prototype = scriptable;
        while (!ensureSymbolScriptable(prototype).has(symbol, scriptable)) {
            prototype = prototype.getPrototype();
            if (prototype == null) {
                return prototype;
            }
        }
        return prototype;
    }

    public static Scriptable getClassPrototype(Scriptable scriptable, String str) {
        Object prototypeProperty;
        Object property = getProperty(getTopLevelScope(scriptable), str);
        if (!(property instanceof BaseFunction)) {
            if (property instanceof Scriptable) {
                Scriptable scriptable2 = (Scriptable) property;
                prototypeProperty = scriptable2.get("prototype", scriptable2);
            }
            return null;
        }
        prototypeProperty = ((BaseFunction) property).getPrototypeProperty();
        if (prototypeProperty instanceof Scriptable) {
            return (Scriptable) prototypeProperty;
        }
        return null;
    }

    public static Object getDefaultValue(Scriptable scriptable, Class<?> cls) {
        Context context = null;
        for (int i = 0; i < 2; i++) {
            boolean z = true;
            if (cls != ScriptRuntime.StringClass ? i != 1 : i != 0) {
                z = false;
            }
            Object property = getProperty(scriptable, z ? "toString" : "valueOf");
            if (property instanceof Function) {
                Function function = (Function) property;
                if (context == null) {
                    context = Context.getContext();
                }
                Object objCall = function.call(context, function.getParentScope(), scriptable, ScriptRuntime.emptyArgs);
                if (objCall != null) {
                    if ((objCall instanceof Scriptable) && cls != ScriptRuntime.ScriptableClass && cls != ScriptRuntime.FunctionClass) {
                        if (z && (objCall instanceof Wrapper)) {
                            objCall = ((Wrapper) objCall).unwrap();
                            if (objCall instanceof String) {
                            }
                        }
                    }
                    return objCall;
                }
                continue;
            }
        }
        throw ScriptRuntime.typeErrorById("msg.default.value", cls == null ? "undefined" : cls.getName());
    }

    public static Scriptable getFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Function);
    }

    public static Scriptable getGeneratorFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.GeneratorFunction);
    }

    public static Scriptable getObjectPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Object);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, Scriptable scriptable2, Symbol symbol) {
        Object obj;
        do {
            obj = ensureSymbolScriptable(scriptable).get(symbol, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public static Object getProperty(Scriptable scriptable, String str) {
        return getPropWalkingPrototypeChain(scriptable, str, scriptable);
    }

    public static Object[] getPropertyIds(Scriptable scriptable) {
        if (scriptable == null) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] ids = scriptable.getIds();
        HashSet hashSet = null;
        while (true) {
            scriptable = scriptable.getPrototype();
            if (scriptable == null) {
                break;
            }
            Object[] ids2 = scriptable.getIds();
            if (ids2.length != 0) {
                if (hashSet == null) {
                    if (ids.length == 0) {
                        ids = ids2;
                    } else {
                        hashSet = new HashSet();
                        for (int i = 0; i != ids.length; i++) {
                            hashSet.add(ids[i]);
                        }
                        ids = null;
                    }
                }
                for (int i2 = 0; i2 != ids2.length; i2++) {
                    hashSet.add(ids2[i2]);
                }
            }
        }
        return hashSet != null ? hashSet.toArray() : ids;
    }

    private static String getPropertyName(String str, String str2, Annotation annotation) {
        String strValue;
        if (str2 != null) {
            return str.substring(str2.length());
        }
        if (annotation instanceof JSGetter) {
            strValue = ((JSGetter) annotation).value();
            if ((strValue == null || strValue.length() == 0) && str.length() > 3 && str.startsWith("get")) {
                strValue = str.substring(3);
                if (Character.isUpperCase(strValue.charAt(0))) {
                    if (strValue.length() == 1) {
                        strValue = strValue.toLowerCase(Locale.ROOT);
                    } else if (!Character.isUpperCase(strValue.charAt(1))) {
                        strValue = Character.toLowerCase(strValue.charAt(0)) + strValue.substring(1);
                    }
                }
            }
        } else if (annotation instanceof JSFunction) {
            strValue = ((JSFunction) annotation).value();
        } else {
            strValue = annotation instanceof JSStaticFunction ? ((JSStaticFunction) annotation).value() : null;
        }
        return (strValue == null || strValue.length() == 0) ? str : strValue;
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, String str) {
        return getPropWalkingPrototypeChain(scriptable, str, scriptable2);
    }

    public static Scriptable getTopLevelScope(Scriptable scriptable) {
        while (true) {
            Scriptable parentScope = scriptable.getParentScope();
            if (parentScope == null) {
                return scriptable;
            }
            scriptable = parentScope;
        }
    }

    public static Object getTopScopeValue(Scriptable scriptable, Object obj) {
        Object associatedValue;
        Scriptable topLevelScope = getTopLevelScope(scriptable);
        do {
            if ((topLevelScope instanceof ScriptableObject) && (associatedValue = ((ScriptableObject) topLevelScope).getAssociatedValue(obj)) != null) {
                return associatedValue;
            }
            topLevelScope = topLevelScope.getPrototype();
        } while (topLevelScope != null);
        return null;
    }

    public static <T> T getTypedProperty(Scriptable scriptable, int i, Class<T> cls) {
        Object property = getProperty(scriptable, i);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    public static boolean hasProperty(Scriptable scriptable, String str) {
        return getBase(scriptable, str) != null;
    }

    public static boolean isAccessorDescriptor(ScriptableObject scriptableObject) {
        return hasProperty(scriptableObject, "get") || hasProperty(scriptableObject, "set");
    }

    public static boolean isDataDescriptor(ScriptableObject scriptableObject) {
        return hasProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY) || hasProperty(scriptableObject, "writable");
    }

    public static boolean isFalse(Object obj) {
        return !isTrue(obj);
    }

    public static boolean isGenericDescriptor(ScriptableObject scriptableObject) {
        return (isDataDescriptor(scriptableObject) || isAccessorDescriptor(scriptableObject)) ? false : true;
    }

    public static boolean isTrue(Object obj) {
        return obj != Scriptable.NOT_FOUND && ScriptRuntime.toBoolean(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Slot lambda$defineOwnProperty$0(boolean z, Object obj, ScriptableObject scriptableObject, Object obj2, Object obj3, Object obj4, boolean z2, Object obj5, Object obj6, Object obj7, Object obj8, int i, Slot slot) {
        int iApplyDescriptorToAttributeBitset;
        Slot slot2;
        AccessorSlot accessorSlot;
        if (z) {
            checkPropertyChangeForSlot(obj, slot, scriptableObject);
        }
        if (slot == null) {
            slot2 = new Slot(obj8, i, 0);
            iApplyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(7, obj2, obj3, obj4);
        } else {
            iApplyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(slot.getAttributes(), obj2, obj3, obj4);
            slot2 = slot;
        }
        if (z2) {
            if (slot2 instanceof AccessorSlot) {
                accessorSlot = (AccessorSlot) slot2;
            } else {
                accessorSlot = new AccessorSlot(slot2);
                slot2 = accessorSlot;
            }
            Object obj9 = Scriptable.NOT_FOUND;
            if (obj5 != obj9) {
                accessorSlot.getter = new AccessorSlot.FunctionGetter(obj5);
            }
            if (obj6 != obj9) {
                accessorSlot.setter = new AccessorSlot.FunctionSetter(obj6);
            }
            accessorSlot.value = Undefined.instance;
        } else {
            if (!slot2.isValueSlot() && isDataDescriptor(scriptableObject)) {
                slot2 = new Slot(slot2);
            }
            if (obj7 != Scriptable.NOT_FOUND) {
                slot2.value = obj7;
            } else if (slot == null) {
                slot2.value = Undefined.instance;
            }
        }
        slot2.setAttributes(iApplyDescriptorToAttributeBitset);
        return slot2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LambdaAccessorSlot lambda$defineProperty$1(Context context, String str, LambdaAccessorSlot lambdaAccessorSlot, ScriptableObject scriptableObject, Object obj, int i, Slot slot) {
        if (slot != null) {
            return replaceExistingLambdaSlot(context, str, slot, lambdaAccessorSlot);
        }
        checkPropertyChangeForSlot(str, null, scriptableObject);
        return lambdaAccessorSlot;
    }

    private boolean putConstImpl(String str, int i, Scriptable scriptable, Object obj, int i2) {
        Slot slotQuery;
        if (!this.isExtensible && Context.getContext().isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
        }
        if (this != scriptable) {
            slotQuery = this.slotMap.query(str, i);
            if (slotQuery == null) {
                return false;
            }
        } else {
            if (isExtensible()) {
                checkNotSealed(str, i);
                Slot slotModify = this.slotMap.modify(str, i, 13);
                int attributes = slotModify.getAttributes();
                if ((attributes & 1) == 0) {
                    throw Context.reportRuntimeErrorById("msg.var.redecl", str);
                }
                if ((attributes & 8) != 0) {
                    slotModify.value = obj;
                    if (i2 != 8) {
                        slotModify.setAttributes(attributes & (-9));
                    }
                }
                return true;
            }
            slotQuery = this.slotMap.query(str, i);
            if (slotQuery == null) {
                return true;
            }
        }
        return slotQuery.setValue(obj, this, scriptable);
    }

    public static void putConstProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        if (base instanceof ConstProperties) {
            ((ConstProperties) base).putConst(str, scriptable, obj);
        }
    }

    private boolean putImpl(Object obj, int i, Scriptable scriptable, Object obj2, boolean z) {
        Slot slotModify;
        if (this != scriptable) {
            slotModify = this.slotMap.query(obj, i);
            if (!this.isExtensible && ((slotModify == null || (!(slotModify instanceof AccessorSlot) && (slotModify.getAttributes() & 1) != 0)) && z)) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
            if (slotModify == null) {
                return false;
            }
        } else if (this.isExtensible) {
            if (this.isSealed) {
                checkNotSealed(obj, i);
            }
            slotModify = this.slotMap.modify(obj, i, 0);
        } else {
            slotModify = this.slotMap.query(obj, i);
            if ((slotModify == null || !((slotModify instanceof AccessorSlot) || (slotModify.getAttributes() & 1) == 0)) && z) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
            if (slotModify == null) {
                return true;
            }
        }
        return slotModify.setValue(obj2, this, scriptable, z);
    }

    public static void putProperty(Scriptable scriptable, Symbol symbol, Object obj) {
        Scriptable base = getBase(scriptable, symbol);
        if (base == null) {
            base = scriptable;
        }
        ensureSymbolScriptable(base).put(symbol, scriptable, obj);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, Symbol symbol, Object obj) {
        ensureSymbolScriptable(scriptable).put(symbol, scriptable2, obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.slotMap = createSlotMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.slotMap.add((Slot) objectInputStream.readObject());
        }
    }

    public static void redefineProperty(Scriptable scriptable, String str, boolean z) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            return;
        }
        if ((base instanceof ConstProperties) && ((ConstProperties) base).isConst(str)) {
            throw ScriptRuntime.typeErrorById("msg.const.redecl", str);
        }
        if (z) {
            throw ScriptRuntime.typeErrorById("msg.var.redecl", str);
        }
    }

    private LambdaAccessorSlot replaceExistingLambdaSlot(Context context, String str, Slot slot, LambdaAccessorSlot lambdaAccessorSlot) {
        LambdaAccessorSlot lambdaAccessorSlot2 = slot instanceof LambdaAccessorSlot ? (LambdaAccessorSlot) slot : new LambdaAccessorSlot(slot);
        lambdaAccessorSlot2.replaceWith(lambdaAccessorSlot);
        checkPropertyChangeForSlot(str, slot, lambdaAccessorSlot2.buildPropertyDescriptor(context));
        return lambdaAccessorSlot2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long lock = this.slotMap.readLock();
        try {
            int iDirtySize = this.slotMap.dirtySize();
            if (iDirtySize == 0) {
                objectOutputStream.writeInt(0);
            } else {
                objectOutputStream.writeInt(iDirtySize);
                Iterator<Slot> it = this.slotMap.iterator();
                while (it.hasNext()) {
                    objectOutputStream.writeObject(it.next());
                }
            }
        } finally {
            this.slotMap.unlockRead(lock);
        }
    }

    public void addLazilyInitializedValue(String str, int i, LazilyLoadedCtor lazilyLoadedCtor, int i2) {
        if (str != null && i != 0) {
            net.luminis.tls.engine.impl.c.o(str);
            return;
        }
        checkNotSealed(str, i);
        LazyLoadSlot lazyLoadSlot = (LazyLoadSlot) this.slotMap.compute(str, i, new c(3));
        lazyLoadSlot.setAttributes(i2);
        lazyLoadSlot.value = lazilyLoadedCtor;
    }

    public int applyDescriptorToAttributeBitset(int i, Object obj, Object obj2, Object obj3) {
        Object obj4 = Scriptable.NOT_FOUND;
        if (obj != obj4) {
            i = ScriptRuntime.toBoolean(obj) ? i & (-3) : i | 2;
        }
        if (obj2 != obj4) {
            i = ScriptRuntime.toBoolean(obj2) ? i & (-2) : i | 1;
        }
        if (obj3 != obj4) {
            return ScriptRuntime.toBoolean(obj3) ? i & (-5) : i | 4;
        }
        return i;
    }

    public final synchronized Object associateValue(Object obj, Object obj2) {
        Map map;
        try {
            if (obj2 == null) {
                throw new IllegalArgumentException();
            }
            map = this.associatedValues;
            if (map == null) {
                map = new HashMap();
                this.associatedValues = map;
            }
        } catch (Throwable th) {
            throw th;
        }
        return Kit.initHash(map, obj, obj2);
    }

    public boolean avoidObjectDetection() {
        return false;
    }

    public void checkPropertyChangeForSlot(Object obj, Slot slot, ScriptableObject scriptableObject) {
        if (slot == null) {
            if (!isExtensible()) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
            return;
        }
        if ((slot.getAttributes() & 4) != 0) {
            if (isTrue(getProperty(scriptableObject, "configurable"))) {
                throw ScriptRuntime.typeErrorById("msg.change.configurable.false.to.true", obj);
            }
            if (((slot.getAttributes() & 2) == 0) != isTrue(getProperty(scriptableObject, "enumerable"))) {
                throw ScriptRuntime.typeErrorById("msg.change.enumerable.with.configurable.false", obj);
            }
            boolean zIsDataDescriptor = isDataDescriptor(scriptableObject);
            boolean zIsAccessorDescriptor = isAccessorDescriptor(scriptableObject);
            if (zIsDataDescriptor || zIsAccessorDescriptor) {
                if (zIsDataDescriptor) {
                    if ((slot.getAttributes() & 1) != 0) {
                        if (isTrue(getProperty(scriptableObject, "writable"))) {
                            throw ScriptRuntime.typeErrorById("msg.change.writable.false.to.true.with.configurable.false", obj);
                        }
                        if (!sameValue(getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY), slot.value)) {
                            throw ScriptRuntime.typeErrorById("msg.change.value.with.writable.false", obj);
                        }
                        return;
                    }
                    return;
                }
                if (!zIsAccessorDescriptor || !(slot instanceof AccessorSlot)) {
                    throw ScriptRuntime.typeErrorById("msg.change.property.data.to.accessor.with.configurable.false", obj);
                }
                AccessorSlot accessorSlot = (AccessorSlot) slot;
                if (!accessorSlot.isSameSetterFunction(getProperty(scriptableObject, "set"))) {
                    throw ScriptRuntime.typeErrorById("msg.change.setter.with.configurable.false", obj);
                }
                if (!accessorSlot.isSameGetterFunction(getProperty(scriptableObject, "get"))) {
                    throw ScriptRuntime.typeErrorById("msg.change.getter.with.configurable.false", obj);
                }
            }
        }
    }

    public void checkPropertyDefinition(ScriptableObject scriptableObject) {
        Object property = getProperty(scriptableObject, "get");
        Object obj = Scriptable.NOT_FOUND;
        if (property != obj && property != Undefined.instance && !(property instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property);
        }
        Object property2 = getProperty(scriptableObject, "set");
        if (property2 != obj && property2 != Undefined.instance && !(property2 instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property2);
        }
        if (isDataDescriptor(scriptableObject) && isAccessorDescriptor(scriptableObject)) {
            throw ScriptRuntime.typeErrorById("msg.both.data.and.accessor.desc", new Object[0]);
        }
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void defineConst(String str, Scriptable scriptable) {
        if (putConstImpl(str, 0, scriptable, Undefined.instance, 8)) {
            return;
        }
        if (scriptable == this) {
            throw Kit.codeBug();
        }
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).defineConst(str, scriptable);
        }
    }

    public void defineFunctionProperties(String[] strArr, Class<?> cls, int i) {
        Method[] methodList = FunctionObject.getMethodList(cls);
        for (String str : strArr) {
            Method methodFindSingleMethod = FunctionObject.findSingleMethod(methodList, str);
            if (methodFindSingleMethod == null) {
                throw Context.reportRuntimeErrorById("msg.method.not.found", str, cls.getName());
            }
            defineProperty(str, new FunctionObject(str, methodFindSingleMethod, this), i);
        }
    }

    public void defineOwnProperties(Context context, ScriptableObject scriptableObject) {
        Object[] ids = scriptableObject.getIds(false, true);
        ScriptableObject[] scriptableObjectArr = new ScriptableObject[ids.length];
        int length = ids.length;
        for (int i = 0; i < length; i++) {
            ScriptableObject scriptableObjectEnsureScriptableObject = ensureScriptableObject(ScriptRuntime.getObjectElem((Scriptable) scriptableObject, ids[i], context));
            checkPropertyDefinition(scriptableObjectEnsureScriptableObject);
            scriptableObjectArr[i] = scriptableObjectEnsureScriptableObject;
        }
        int length2 = ids.length;
        for (int i2 = 0; i2 < length2; i2++) {
            defineOwnProperty(context, ids[i2], scriptableObjectArr[i2]);
        }
    }

    public boolean defineOwnProperty(Context context, final Object obj, final ScriptableObject scriptableObject, final boolean z) {
        int i;
        Object obj2;
        int i2 = 0;
        if (obj instanceof Symbol) {
            i = 0;
            obj2 = obj;
        } else {
            ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
            String str = stringIdOrIndex.stringId;
            if (str == null) {
                i2 = stringIdOrIndex.index;
                str = null;
            }
            i = i2;
            obj2 = str;
        }
        final Object property = getProperty(scriptableObject, "enumerable");
        final Object property2 = getProperty(scriptableObject, "writable");
        final Object property3 = getProperty(scriptableObject, "configurable");
        final Object property4 = getProperty(scriptableObject, "get");
        final Object property5 = getProperty(scriptableObject, "set");
        final Object property6 = getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY);
        final boolean zIsAccessorDescriptor = isAccessorDescriptor(scriptableObject);
        this.slotMap.compute(obj2, i, new SlotMap.SlotComputer() { // from class: org.mozilla.javascript.j0
            @Override // org.mozilla.javascript.SlotMap.SlotComputer
            public final Slot compute(Object obj3, int i3, Slot slot) {
                return this.a.lambda$defineOwnProperty$0(z, obj, scriptableObject, property, property2, property3, zIsAccessorDescriptor, property4, property5, property6, obj3, i3, slot);
            }
        });
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public void defineProperty(String str, Object obj, Method method, Method method2, int i) {
        MemberBox memberBox;
        boolean z;
        boolean z2;
        String str2;
        Class<?> cls;
        Class<?> cls2 = Void.TYPE;
        MemberBox memberBox2 = null;
        str = null;
        String str3 = null;
        if (method != null) {
            memberBox = new MemberBox(method);
            if (Modifier.isStatic(method.getModifiers())) {
                memberBox.delegateTo = cls2;
                z2 = true;
            } else {
                boolean z3 = obj != null;
                memberBox.delegateTo = obj;
                z2 = z3;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 0) {
                if (z2) {
                    str2 = "msg.obj.getter.parms";
                } else {
                    str2 = null;
                }
            } else if (parameterTypes.length == 1 && (((cls = parameterTypes[0]) == ScriptRuntime.ScriptableClass || cls == ScriptRuntime.ScriptableObjectClass) && z2)) {
                str2 = null;
            } else {
                str2 = "msg.bad.getter.parms";
            }
            if (str2 != null) {
                throw Context.reportRuntimeErrorById(str2, method.toString());
            }
        } else {
            memberBox = null;
        }
        if (method2 != null) {
            if (method2.getReturnType() != cls2) {
                throw Context.reportRuntimeErrorById("msg.setter.return", method2.toString());
            }
            MemberBox memberBox3 = new MemberBox(method2);
            if (Modifier.isStatic(method2.getModifiers())) {
                memberBox3.delegateTo = cls2;
                z = true;
            } else {
                boolean z4 = obj != null;
                memberBox3.delegateTo = obj;
                z = z4;
            }
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            if (parameterTypes2.length == 1) {
                if (z) {
                    str3 = "msg.setter2.expected";
                }
            } else if (parameterTypes2.length == 2) {
                Class<?> cls3 = parameterTypes2[0];
                if (cls3 != ScriptRuntime.ScriptableClass && cls3 != ScriptRuntime.ScriptableObjectClass) {
                    str3 = "msg.setter2.parms";
                } else if (!z) {
                    str3 = "msg.setter1.parms";
                }
            } else {
                str3 = "msg.setter.parms";
            }
            if (str3 != null) {
                throw Context.reportRuntimeErrorById(str3, method2.toString());
            }
            memberBox2 = memberBox3;
        }
        AccessorSlot accessorSlot = (AccessorSlot) this.slotMap.compute(str, 0, new c(4));
        accessorSlot.setAttributes(i);
        if (memberBox != null) {
            accessorSlot.getter = new AccessorSlot.MemberBoxGetter(memberBox);
        }
        if (memberBox2 != null) {
            accessorSlot.setter = new AccessorSlot.MemberBoxSetter(memberBox2);
        }
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(String str) {
        checkNotSealed(str, 0);
        this.slotMap.compute(str, 0, new c(2));
    }

    public Object equivalentValues(Object obj) {
        return this == obj ? Boolean.TRUE : Scriptable.NOT_FOUND;
    }

    public Object get(Object obj) {
        Object obj2;
        if (obj instanceof String) {
            obj2 = get((String) obj, this);
        } else if (obj instanceof Symbol) {
            obj2 = get((Symbol) obj, this);
        } else {
            obj2 = obj instanceof Number ? get(((Number) obj).intValue(), this) : null;
        }
        if (obj2 == Scriptable.NOT_FOUND || obj2 == Undefined.instance) {
            return null;
        }
        return obj2 instanceof Wrapper ? ((Wrapper) obj2).unwrap() : obj2;
    }

    @Override // org.mozilla.javascript.debug.DebuggableObject
    public Object[] getAllIds() {
        return getIds(true, false);
    }

    public final Object getAssociatedValue(Object obj) {
        Map<Object, Object> map = this.associatedValues;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public int getAttributes(String str) {
        return getAttributeSlot(str, 0).getAttributes();
    }

    @Override // org.mozilla.javascript.Scriptable
    public abstract String getClassName();

    public ExternalArrayData getExternalArrayData() {
        return this.externalData;
    }

    public Object getExternalArrayLength() {
        ExternalArrayData externalArrayData = this.externalData;
        return Integer.valueOf(externalArrayData == null ? 0 : externalArrayData.getArrayLength());
    }

    public Object getGetterOrSetter(String str, int i, Scriptable scriptable, boolean z) {
        if (str != null && i != 0) {
            net.luminis.tls.engine.impl.c.o(str);
            return null;
        }
        Slot slotQuery = this.slotMap.query(str, i);
        if (slotQuery == null) {
            return null;
        }
        Function setterFunction = z ? slotQuery.getSetterFunction(str, scriptable) : slotQuery.getGetterFunction(str, scriptable);
        return setterFunction == null ? Undefined.instance : setterFunction;
    }

    public Object[] getIds(boolean z, boolean z2) {
        Object[] objArr;
        ExternalArrayData externalArrayData = this.externalData;
        int arrayLength = externalArrayData == null ? 0 : externalArrayData.getArrayLength();
        if (arrayLength == 0) {
            objArr = ScriptRuntime.emptyArgs;
        } else {
            objArr = new Object[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                objArr[i] = Integer.valueOf(i);
            }
        }
        if (this.slotMap.isEmpty()) {
            return objArr;
        }
        long lock = this.slotMap.readLock();
        try {
            int i2 = arrayLength;
            for (Slot slot : this.slotMap) {
                if (z || (slot.getAttributes() & 2) == 0) {
                    if (z2 || !(slot.name instanceof Symbol)) {
                        if (i2 == arrayLength) {
                            Object[] objArr2 = new Object[this.slotMap.dirtySize() + arrayLength];
                            if (objArr != null) {
                                System.arraycopy(objArr, 0, objArr2, 0, arrayLength);
                            }
                            objArr = objArr2;
                        }
                        int i3 = i2 + 1;
                        Object objValueOf = slot.name;
                        if (objValueOf == null) {
                            objValueOf = Integer.valueOf(slot.indexOrHash);
                        }
                        objArr[i2] = objValueOf;
                        i2 = i3;
                    }
                }
            }
            this.slotMap.unlockRead(lock);
            if (i2 != objArr.length + arrayLength) {
                Object[] objArr3 = new Object[i2];
                System.arraycopy(objArr, 0, objArr3, 0, i2);
                objArr = objArr3;
            }
            Context currentContext = Context.getCurrentContext();
            if (currentContext != null && currentContext.hasFeature(16)) {
                Arrays.sort(objArr, KEY_COMPARATOR);
            }
            return objArr;
        } catch (Throwable th) {
            this.slotMap.unlockRead(lock);
            throw th;
        }
    }

    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        Slot slotQuerySlot = querySlot(context, obj);
        if (slotQuerySlot == null) {
            return null;
        }
        return slotQuerySlot.getPropertyDescriptor(context, this);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getParentScope() {
        return this.parentScopeObject;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        return this.prototypeObject;
    }

    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "object";
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            return i < externalArrayData.getArrayLength();
        }
        return this.slotMap.query(null, i) != null;
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        return ScriptRuntime.jsDelegatesTo(scriptable, this);
    }

    @Override // org.mozilla.javascript.ConstProperties
    public boolean isConst(String str) {
        Slot slotQuery = this.slotMap.query(str, 0);
        return slotQuery != null && (slotQuery.getAttributes() & 5) == 5;
    }

    public boolean isEmpty() {
        return this.slotMap.isEmpty();
    }

    public boolean isExtensible() {
        return this.isExtensible;
    }

    public boolean isGetterOrSetter(String str, int i, boolean z) {
        Slot slotQuery = this.slotMap.query(str, i);
        return slotQuery != null && slotQuery.isSetterSlot();
    }

    public final boolean isSealed() {
        return this.isSealed;
    }

    public boolean preventExtensions() {
        this.isExtensible = false;
        return true;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (i >= externalArrayData.getArrayLength()) {
                throw new JavaScriptException(ScriptRuntime.newNativeError(Context.getCurrentContext(), this, TopLevel.NativeErrors.RangeError, new Object[]{"External array index out of bounds "}), null, 0);
            }
            this.externalData.setArrayElement(i, obj);
        } else {
            if (putOwnProperty(i, scriptable, obj, Context.isCurrentContextStrict())) {
                return;
            }
            if (scriptable == this) {
                throw Kit.codeBug();
            }
            scriptable.put(i, scriptable, obj);
        }
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void putConst(String str, Scriptable scriptable, Object obj) {
        if (putConstImpl(str, 0, scriptable, obj, 1)) {
            return;
        }
        if (scriptable == this) {
            throw Kit.codeBug();
        }
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).putConst(str, scriptable, obj);
        } else {
            scriptable.put(str, scriptable, obj);
        }
    }

    public boolean putOwnProperty(String str, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(str, 0, scriptable, obj, z);
    }

    public Slot querySlot(Context context, Object obj) {
        if (obj instanceof Symbol) {
            return this.slotMap.query(obj, 0);
        }
        ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
        String str = stringIdOrIndex.stringId;
        SlotMapContainer slotMapContainer = this.slotMap;
        return str == null ? slotMapContainer.query(null, stringIdOrIndex.index) : slotMapContainer.query(str, 0);
    }

    public boolean sameValue(Object obj, Object obj2) {
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj == obj3) {
            return true;
        }
        if (obj2 == obj3) {
            obj2 = Undefined.instance;
        }
        if ((obj2 instanceof Number) && (obj instanceof Number)) {
            double dDoubleValue = ((Number) obj2).doubleValue();
            double dDoubleValue2 = ((Number) obj).doubleValue();
            if (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2)) {
                return true;
            }
            if (dDoubleValue == 0.0d && Double.doubleToLongBits(dDoubleValue) != Double.doubleToLongBits(dDoubleValue2)) {
                return false;
            }
        }
        return ScriptRuntime.shallowEq(obj2, obj);
    }

    public void sealObject() {
        ArrayList<Slot> arrayList = new ArrayList();
        while (!this.isSealed) {
            for (Slot slot : arrayList) {
                Object obj = slot.value;
                if (obj instanceof LazilyLoadedCtor) {
                    LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj;
                    try {
                        lazilyLoadedCtor.init();
                        slot.value = lazilyLoadedCtor.getValue();
                    } catch (Throwable th) {
                        slot.value = lazilyLoadedCtor.getValue();
                        throw th;
                    }
                }
            }
            arrayList.clear();
            long lock = this.slotMap.readLock();
            try {
                for (Slot slot2 : this.slotMap) {
                    if (slot2.value instanceof LazilyLoadedCtor) {
                        arrayList.add(slot2);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.isSealed = true;
                }
                this.slotMap.unlockRead(lock);
            } catch (Throwable th2) {
                this.slotMap.unlockRead(lock);
                throw th2;
            }
        }
    }

    public void setAttributes(int i, int i2) {
        checkNotSealed(null, i);
        this.slotMap.modify(null, i, 0).setAttributes(i2);
    }

    public void setCommonDescriptorProperties(int i, boolean z) {
        if (z) {
            defineProperty("writable", Boolean.valueOf((i & 1) == 0), 0);
        }
        defineProperty("enumerable", Boolean.valueOf((i & 2) == 0), 0);
        defineProperty("configurable", Boolean.valueOf((i & 4) == 0), 0);
    }

    public void setExternalArrayData(ExternalArrayData externalArrayData) {
        this.externalData = externalArrayData;
        if (externalArrayData == null) {
            delete("length");
        } else {
            defineProperty("length", (Object) null, GET_ARRAY_LENGTH, (Method) null, 3);
        }
    }

    public void setGetterOrSetter(Object obj, int i, Callable callable, boolean z) {
        AccessorSlot accessorSlot;
        if (obj != null && i != 0) {
            net.luminis.tls.engine.impl.c.p(obj);
            return;
        }
        checkNotSealed(obj, i);
        boolean zIsExtensible = isExtensible();
        SlotMapContainer slotMapContainer = this.slotMap;
        if (zIsExtensible) {
            accessorSlot = (AccessorSlot) slotMapContainer.compute(obj, i, new c(4));
        } else {
            Slot slotQuery = slotMapContainer.query(obj, i);
            if (!(slotQuery instanceof AccessorSlot)) {
                return;
            } else {
                accessorSlot = (AccessorSlot) slotQuery;
            }
        }
        if ((accessorSlot.getAttributes() & 1) != 0) {
            throw Context.reportRuntimeErrorById("msg.modify.readonly", obj);
        }
        if (z) {
            if (callable instanceof Function) {
                accessorSlot.setter = new AccessorSlot.FunctionSetter(callable);
            } else {
                accessorSlot.setter = null;
            }
        } else if (callable instanceof Function) {
            accessorSlot.getter = new AccessorSlot.FunctionGetter(callable);
        } else {
            accessorSlot.getter = null;
        }
        accessorSlot.value = Undefined.instance;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setParentScope(Scriptable scriptable) {
        this.parentScopeObject = scriptable;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        this.prototypeObject = scriptable;
    }

    public int size() {
        return this.slotMap.size();
    }

    public static Object getProperty(Scriptable scriptable, Symbol symbol) {
        return getPropWalkingPrototypeChain(scriptable, scriptable, symbol);
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, Symbol symbol) {
        return getPropWalkingPrototypeChain(scriptable, scriptable2, symbol);
    }

    public static Object getProperty(Scriptable scriptable, int i) {
        return getPropWalkingPrototypeChain(scriptable, i, scriptable);
    }

    public static Object getSuperProperty(Scriptable scriptable, Scriptable scriptable2, int i) {
        return getPropWalkingPrototypeChain(scriptable, i, scriptable2);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, String str, Object obj) {
        scriptable.put(str, scriptable2, obj);
    }

    public static void putSuperProperty(Scriptable scriptable, Scriptable scriptable2, int i, Object obj) {
        scriptable.put(i, scriptable2, obj);
    }

    public static boolean hasProperty(Scriptable scriptable, int i) {
        return getBase(scriptable, i) != null;
    }

    @Deprecated
    public final int getAttributes(int i, Scriptable scriptable) {
        return getAttributes(i);
    }

    public static boolean hasProperty(Scriptable scriptable, Symbol symbol) {
        return getBase(scriptable, symbol) != null;
    }

    @Deprecated
    public final int getAttributes(String str, Scriptable scriptable) {
        return getAttributes(str);
    }

    public boolean putOwnProperty(int i, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(null, i, scriptable, obj, z);
    }

    public int getAttributes(int i) {
        return getAttributeSlot(null, i).getAttributes();
    }

    public boolean putOwnProperty(Symbol symbol, Scriptable scriptable, Object obj, boolean z) {
        return putImpl(symbol, 0, scriptable, obj, z);
    }

    public int getAttributes(Symbol symbol) {
        return getAttributeSlot(symbol).getAttributes();
    }

    public static void putProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        base.put(str, scriptable, obj);
    }

    @Deprecated
    public void setAttributes(int i, Scriptable scriptable, int i2) {
        setAttributes(i, i2);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(int i) {
        checkNotSealed(null, i);
        this.slotMap.compute(null, i, new c(2));
    }

    public void setAttributes(String str, int i) {
        checkNotSealed(str, 0);
        this.slotMap.modify(str, 0, 0).setAttributes(i);
    }

    public static void putProperty(Scriptable scriptable, int i, Object obj) {
        Scriptable base = getBase(scriptable, i);
        if (base == null) {
            base = scriptable;
        }
        base.put(i, scriptable, obj);
    }

    public static <T> T getTypedProperty(Scriptable scriptable, String str, Class<T> cls) {
        Object property = getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    public void delete(Symbol symbol) {
        checkNotSealed(symbol, 0);
        this.slotMap.compute(symbol, 0, new c(2));
    }

    public static Scriptable getBase(Scriptable scriptable, int i) {
        Scriptable prototype = scriptable;
        while (!prototype.has(i, scriptable)) {
            prototype = prototype.getPrototype();
            if (prototype == null) {
                return prototype;
            }
        }
        return prototype;
    }

    @Deprecated
    public final void setAttributes(String str, Scriptable scriptable, int i) {
        setAttributes(str, i);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, String str, Scriptable scriptable2) {
        Object obj;
        do {
            obj = scriptable.get(str, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public void setAttributes(Symbol symbol, int i) {
        checkNotSealed(symbol, 0);
        this.slotMap.modify(symbol, 0, 0).setAttributes(i);
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls, boolean z) throws IllegalAccessException, InvocationTargetException {
        defineClass(scriptable, cls, z, false);
    }

    public static boolean deleteProperty(Scriptable scriptable, int i) {
        Scriptable base = getBase(scriptable, i);
        if (base == null) {
            return true;
        }
        base.delete(i);
        return !base.has(i, scriptable);
    }

    public static Scriptable getBase(Scriptable scriptable, String str) {
        Scriptable prototype = scriptable;
        while (!prototype.has(str, scriptable)) {
            prototype = prototype.getPrototype();
            if (prototype == null) {
                return prototype;
            }
        }
        return prototype;
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        defineClass(scriptable, cls, false, false);
    }

    private static Object getPropWalkingPrototypeChain(Scriptable scriptable, int i, Scriptable scriptable2) {
        Object obj;
        do {
            obj = scriptable.get(i, scriptable2);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        return obj;
    }

    public static boolean deleteProperty(Scriptable scriptable, String str) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            return true;
        }
        base.delete(str);
        return !base.has(str, scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return this.slotMap.query(str, 0) != null;
    }

    public boolean has(Symbol symbol, Scriptable scriptable) {
        return this.slotMap.query(symbol, 0) != null;
    }

    public ScriptableObject() {
        this.isExtensible = true;
        this.isSealed = false;
        this.slotMap = createSlotMap(0);
    }

    private Slot getAttributeSlot(Symbol symbol) {
        Slot slotQuery = this.slotMap.query(symbol, 0);
        if (slotQuery != null) {
            return slotQuery;
        }
        throw Context.reportRuntimeErrorById("msg.prop.not.found", symbol);
    }

    public static Object callMethod(Scriptable scriptable, String str, Object[] objArr) {
        return callMethod(null, scriptable, str, objArr);
    }

    @Deprecated
    public Object getGetterOrSetter(String str, int i, boolean z) {
        return getGetterOrSetter(str, i, this, z);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (i < externalArrayData.getArrayLength()) {
                return this.externalData.getArrayElement(i);
            }
            return Scriptable.NOT_FOUND;
        }
        Slot slotQuery = this.slotMap.query(null, i);
        if (slotQuery == null) {
            return Scriptable.NOT_FOUND;
        }
        return slotQuery.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (putOwnProperty(str, scriptable, obj, Context.isCurrentContextStrict())) {
            return;
        }
        if (scriptable != this) {
            scriptable.put(str, scriptable, obj);
            return;
        }
        throw Kit.codeBug();
    }

    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        if (putOwnProperty(symbol, scriptable, obj, Context.isCurrentContextStrict())) {
            return;
        }
        if (scriptable != this) {
            ensureSymbolScriptable(scriptable).put(symbol, scriptable, obj);
            return;
        }
        throw Kit.codeBug();
    }

    public Object get(Symbol symbol, Scriptable scriptable) {
        Slot slotQuery = this.slotMap.query(symbol, 0);
        if (slotQuery == null) {
            return Scriptable.NOT_FOUND;
        }
        return slotQuery.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Slot slotQuery = this.slotMap.query(str, 0);
        if (slotQuery == null) {
            return Scriptable.NOT_FOUND;
        }
        return slotQuery.getValue(scriptable);
    }

    public boolean defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject) {
        checkPropertyDefinition(scriptableObject);
        return defineOwnProperty(context, obj, scriptableObject, true);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return getDefaultValue(this, cls);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return getIds(false, false);
    }

    public void defineProperty(Symbol symbol, Object obj, int i) {
        checkNotSealed(symbol, 0);
        put(symbol, this, obj);
        setAttributes(symbol, i);
    }

    public static void defineProperty(Scriptable scriptable, String str, Object obj, int i) {
        if (!(scriptable instanceof ScriptableObject)) {
            scriptable.put(str, scriptable, obj);
        } else {
            ((ScriptableObject) scriptable).defineProperty(str, obj, i);
        }
    }

    public void defineProperty(Scriptable scriptable, String str, int i, Callable callable, int i2, int i3) {
        LambdaFunction lambdaFunction = new LambdaFunction(scriptable, str, i, callable);
        lambdaFunction.setStandardPropertyAttributes(i3);
        defineProperty(str, lambdaFunction, i2);
    }

    public void defineProperty(String str, Class<?> cls, int i) {
        int length = str.length();
        if (length != 0) {
            char[] cArr = new char[length + 3];
            str.getChars(0, length, cArr, 3);
            cArr[3] = Character.toUpperCase(cArr[3]);
            cArr[0] = 'g';
            cArr[1] = 'e';
            cArr[2] = 't';
            String str2 = new String(cArr);
            cArr[0] = 's';
            String str3 = new String(cArr);
            Method[] methodList = FunctionObject.getMethodList(cls);
            Method methodFindSingleMethod = FunctionObject.findSingleMethod(methodList, str2);
            Method methodFindSingleMethod2 = FunctionObject.findSingleMethod(methodList, str3);
            if (methodFindSingleMethod2 == null) {
                i |= 1;
            }
            int i2 = i;
            if (methodFindSingleMethod2 == null) {
                methodFindSingleMethod2 = null;
            }
            defineProperty(str, (Object) null, methodFindSingleMethod, methodFindSingleMethod2, i2);
            return;
        }
        net.luminis.tls.engine.impl.c.a();
    }

    public void defineProperty(String str, Object obj, int i) {
        checkNotSealed(str, 0);
        put(str, this, obj);
        setAttributes(str, i);
    }

    public void defineProperty(String str, Supplier<Object> supplier, Consumer<Object> consumer, int i) {
        LambdaSlot lambdaSlot = (LambdaSlot) this.slotMap.compute(str, 0, new c(5));
        lambdaSlot.setAttributes(i);
        lambdaSlot.getter = supplier;
        lambdaSlot.setter = consumer;
    }

    public void defineProperty(final Context context, final String str, java.util.function.Function<Scriptable, Object> function, BiConsumer<Scriptable, Object> biConsumer, int i) {
        if (function == null && biConsumer == null) {
            throw ScriptRuntime.typeError("at least one of {getter, setter} is required");
        }
        final LambdaAccessorSlot lambdaAccessorSlotCreateLambdaAccessorSlot = createLambdaAccessorSlot(str, 0, function, biConsumer, i);
        final ScriptableObject scriptableObjectBuildPropertyDescriptor = lambdaAccessorSlotCreateLambdaAccessorSlot.buildPropertyDescriptor(context);
        checkPropertyDefinition(scriptableObjectBuildPropertyDescriptor);
        this.slotMap.compute(str, 0, new SlotMap.SlotComputer() { // from class: org.mozilla.javascript.k0
            @Override // org.mozilla.javascript.SlotMap.SlotComputer
            public final Slot compute(Object obj, int i2, Slot slot) {
                return this.a.lambda$defineProperty$1(context, str, lambdaAccessorSlotCreateLambdaAccessorSlot, scriptableObjectBuildPropertyDescriptor, obj, i2, slot);
            }
        });
    }
}
