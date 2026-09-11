package kotlin.enums;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.e;
import kotlin.collections.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements a, RandomAccess, Serializable {
    public final Enum[] e;

    public b(Enum[] enumArr) {
        enumArr.getClass();
        this.e = enumArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) n.Q(r4.ordinal(), this.e)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        com.google.gson.b.n(c.f("index: ", i, ", size: ", length));
        return null;
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) n.Q(iOrdinal, this.e)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) n.Q(iOrdinal, this.e)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
