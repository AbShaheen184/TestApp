package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ParameterizedType {
    public final Type e;
    public final Type y;
    public final Type[] z;

    public x0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                net.luminis.tls.engine.impl.c.a();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            z0.d(type3);
        }
        this.e = type;
        this.y = type2;
        this.z = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && z0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.z.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.y;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.z) ^ this.y.hashCode();
        Type type = this.e;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.z;
        int length = typeArr.length;
        Type type = this.y;
        if (length == 0) {
            return z0.r(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(z0.r(type));
        sb.append("<");
        sb.append(z0.r(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(z0.r(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
