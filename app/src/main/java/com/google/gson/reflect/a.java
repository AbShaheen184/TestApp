package com.google.gson.reflect;

import com.google.gson.internal.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeA = h.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    c(typeA);
                }
                this.type = typeA;
                this.rawType = h.g(typeA);
                this.hashCode = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            c.r("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        c.r("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public static void c(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
            sb.append(typeVariable.getName());
            sb.append(" declared by ");
            sb.append(typeVariable.getGenericDeclaration());
            org.mozilla.javascript.typedarrays.c.e(sb, "\nSee ", "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
            return;
        }
        if (type instanceof GenericArrayType) {
            c(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                c(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                c(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type != null) {
                return;
            }
            c.o("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            c(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            c(upperBounds[i]);
            i++;
        }
    }

    public final Class a() {
        return this.rawType;
    }

    public final Type b() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && h.d(this.type, ((a) obj).type);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return h.k(this.type);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = h.a(type);
        this.type = typeA;
        this.rawType = h.g(typeA);
        this.hashCode = typeA.hashCode();
    }
}
