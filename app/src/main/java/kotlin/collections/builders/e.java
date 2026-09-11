package kotlin.collections.builders;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.h;
import androidx.transition.k;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map, Serializable, kotlin.jvm.internal.markers.d {
    public static final e K;
    public int[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public f G;
    public h H;
    public f I;
    public boolean J;
    public Object[] e;
    public Object[] y;
    public int[] z;

    static {
        e eVar = new e(0);
        eVar.J = true;
        K = eVar;
    }

    public e(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.e = objArr;
        this.y = null;
        this.z = iArr;
        this.A = new int[iHighestOneBit];
        this.B = 2;
        this.C = 0;
        this.D = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.B * 2;
            int length = this.A.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.A;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.C;
                    Object[] objArr = this.e;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.C = i6;
                    objArr[i5] = obj;
                    this.z[i5] = i;
                    iArr[i] = i6;
                    this.F++;
                    this.E++;
                    if (i3 > this.B) {
                        this.B = i3;
                    }
                    return i5;
                }
                if (l.a(this.e[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.A.length * 2);
                    break;
                }
                i = i == 0 ? this.A.length - 1 : i - 1;
            }
        }
    }

    public final e b() {
        c();
        this.J = true;
        if (this.F > 0) {
            return this;
        }
        e eVar = K;
        eVar.getClass();
        return eVar;
    }

    public final void c() {
        if (this.J) {
            k.n();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.C - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.z;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.A[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        com.google.android.material.resources.b.t(this.e, 0, this.C);
        Object[] objArr = this.y;
        if (objArr != null) {
            com.google.android.material.resources.b.t(objArr, 0, this.C);
        }
        this.F = 0;
        this.C = 0;
        this.E++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.y;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.C;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.z;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.A[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        com.google.android.material.resources.b.t(this.e, i3, i);
        if (objArr != null) {
            com.google.android.material.resources.b.t(objArr, i3, this.C);
        }
        this.C = i3;
    }

    public final boolean e(Collection collection) {
        boolean zA;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zA = false;
                    } else {
                        Object[] objArr = this.y;
                        objArr.getClass();
                        zA = l.a(objArr[iG], entry.getValue());
                    }
                    if (!zA) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.I;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.I = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.F == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int i2 = this.C;
        int i3 = length - i2;
        int i4 = i2 - this.F;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.y;
            this.y = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.z = Arrays.copyOf(this.z, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.A.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.B;
        while (true) {
            int i3 = this.A[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (l.a(this.e[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.A.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.y;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.C;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.z[i] >= 0) {
                Object[] objArr = this.y;
                objArr.getClass();
                if (l.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            int i2 = cVar.e;
            e eVar = (e) cVar.A;
            if (i2 >= eVar.C) {
                org.mozilla.javascript.typedarrays.c.a();
                return 0;
            }
            cVar.e = i2 + 1;
            cVar.y = i2;
            Object obj = eVar.e[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.y;
            objArr.getClass();
            Object obj2 = objArr[cVar.y];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.d();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.D;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.F == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.E++;
        int i2 = 0;
        if (this.C > this.F) {
            d(false);
        }
        this.A = new int[i];
        this.D = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.C) {
            int i3 = i2 + 1;
            int i4 = i(this.e[i2]);
            int i5 = this.B;
            while (true) {
                iArr = this.A;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    net.luminis.tls.engine.impl.c.r("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.z[i2] = i4;
            i2 = i3;
        }
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.e;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.y;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.z[i];
        loop0: while (true) {
            int i5 = length;
            int i6 = 0;
            do {
                length = length == 0 ? this.A.length - 1 : length - 1;
                int[] iArr2 = this.A;
                i2 = iArr2[length];
                i6++;
                if (i6 > this.B) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.e[i3]) - length;
                    iArr = this.A;
                }
            } while ((i4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.z[i3] = i5;
        }
        this.z[i] = -1;
        this.F--;
        this.E++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.G;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.G = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.y;
        if (objArr == null) {
            int length = this.e.length;
            if (length < 0) {
                net.luminis.tls.engine.impl.c.o("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.y = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.y;
            if (objArr == null) {
                int length = this.e.length;
                if (length < 0) {
                    net.luminis.tls.engine.impl.c.o("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.y = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!l.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.y;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.F * 3) + 2);
        sb.append("{");
        int i = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = cVar.e;
            e eVar = (e) cVar.A;
            if (i2 >= eVar.C) {
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            }
            cVar.e = i2 + 1;
            cVar.y = i2;
            Object obj = eVar.e[i2];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.y;
            objArr.getClass();
            Object obj2 = objArr[cVar.y];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.d();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.H = hVar2;
        return hVar2;
    }

    public e() {
        this(8);
    }
}
