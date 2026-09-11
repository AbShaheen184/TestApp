package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e implements RandomAccess {
    public int A;
    public final Object[] e;
    public final int y;
    public int z;

    public d0(Object[] objArr, int i) {
        this.e = objArr;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            net.luminis.tls.engine.impl.c.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("ring buffer filled size: ", i, " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.y = objArr.length;
        this.A = i;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.A;
    }

    public final void c(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.A) {
            net.luminis.tls.engine.impl.c.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("n shouldn't be greater than the buffer size: n = ", i, ", size = "), this.A);
            return;
        }
        if (i > 0) {
            int i2 = this.z;
            int i3 = this.y;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.e;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.z = i4;
            this.A -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A;
        if (i < 0 || i >= i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return null;
        }
        return this.e[(this.z + i) % this.y];
    }

    @Override // kotlin.collections.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new c0(this);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.A;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.A;
        int i3 = this.z;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.e;
            if (i5 >= i2 || i3 >= this.y) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }
}
