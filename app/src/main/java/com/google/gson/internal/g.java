package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements WildcardType, Serializable {
    public final Type e;
    public final Type y;

    public g(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            net.luminis.tls.engine.impl.c.o("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            net.luminis.tls.engine.impl.c.o("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            h.b(typeArr[0]);
            this.y = null;
            this.e = h.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        h.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            net.luminis.tls.engine.impl.c.o("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.y = h.a(typeArr2[0]);
        this.e = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && h.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.y;
        return type != null ? new Type[]{type} : h.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.e};
    }

    public final int hashCode() {
        Type type = this.y;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.e.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.y;
        if (type != null) {
            return "? super " + h.k(type);
        }
        Type type2 = this.e;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + h.k(type2);
    }
}
