package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements WildcardType {
    public final Type e;
    public final Type y;

    public y0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        if (typeArr.length != 1) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            z0.d(typeArr[0]);
            this.y = null;
            this.e = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        z0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        this.y = typeArr2[0];
        this.e = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && z0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.y;
        return type != null ? new Type[]{type} : z0.a;
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
            return "? super " + z0.r(type);
        }
        Type type2 = this.e;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + z0.r(type2);
    }
}
