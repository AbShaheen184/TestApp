package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements GenericArrayType, Serializable {
    public final Type e;

    public e(Type type) {
        Objects.requireNonNull(type);
        this.e = h.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && h.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return h.k(this.e) + "[]";
    }
}
