package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static final Type[] a = new Type[0];
    public static boolean b = true;

    public static final Object b(d dVar, kotlin.coroutines.d dVar2) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new v(dVar, 0));
        dVar.w(new coil3.network.okhttp.internal.e(cancellableContinuationImpl, 1));
        return cancellableContinuationImpl.getResult();
    }

    public static final Object c(d dVar, kotlin.coroutines.d dVar2) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar2), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new v(dVar, 1));
        dVar.w(new com.google.android.material.internal.b(cancellableContinuationImpl));
        return cancellableContinuationImpl.getResult();
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            net.luminis.tls.engine.impl.c.a();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Index ", i, " not in range [0,");
        sbV.append(actualTypeArguments.length);
        sbV.append(") for ");
        sbV.append(parameterizedType);
        throw new IllegalArgumentException(sbV.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            net.luminis.tls.engine.impl.c.a();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        org.mozilla.javascript.typedarrays.c.e(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return o(type, cls, f(type, cls, Map.class));
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return j(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            org.mozilla.javascript.typedarrays.c.c("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (j(type2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException l(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbD = androidx.constraintlayout.core.g.d(String.format(str, objArr), "\n    for method ");
        sbD.append(method.getDeclaringClass().getSimpleName());
        sbD.append(".");
        sbD.append(method.getName());
        return new IllegalArgumentException(sbD.toString(), exc);
    }

    public static IllegalArgumentException m(Method method, int i, String str, Object... objArr) {
        return l(method, null, str + " (" + k0.b.c(i, method) + ")", objArr);
    }

    public static IllegalArgumentException n(Method method, Exception exc, int i, String str, Object... objArr) {
        return l(method, exc, str + " (" + k0.b.c(i, method) + ")", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type o(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeO;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeO2 = o(type, cls, componentType);
                        return componentType == typeO2 ? cls2 : new w0(typeO2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeO3 = o(type, cls, genericComponentType);
                    return genericComponentType == typeO3 ? genericArrayType : new w0(typeO3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeO4 = o(type, cls, ownerType);
                    boolean z = typeO4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeO5 = o(type, cls, actualTypeArguments[i]);
                        if (typeO5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeO5;
                        }
                        i++;
                    }
                    return z ? new x0(typeO4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeO6 = o(type, cls, lowerBounds[0]);
                        if (typeO6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new y0(new Type[]{Object.class}, new Type[]{typeO6});
                        }
                    } else if (upperBounds.length == 1 && (typeO = o(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new y0(new Type[]{typeO}, a);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeF = f(type, cls, cls3);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            org.mozilla.javascript.typedarrays.c.a();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeF).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void p(Throwable th, kotlin.coroutines.d dVar) {
        w wVar;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i = wVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.y = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(dVar);
            }
        } else {
            wVar = new w(dVar);
        }
        Object obj = wVar.e;
        int i2 = wVar.y;
        if (i2 == 0) {
            kotlin.a.e(obj);
            wVar.y = 1;
            Dispatchers.getDefault().mo86dispatch(wVar.getContext(), new com.google.android.material.behavior.d(wVar, th));
        } else if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
        } else {
            kotlin.a.e(obj);
            com.google.gson.b.b();
        }
    }

    public static void q(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(o0 o0Var, Object obj);
}
