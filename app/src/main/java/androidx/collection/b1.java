package androidx.collection;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public int y;
    public final Object z;

    public b1(Object[] objArr) {
        this.e = 7;
        objArr.getClass();
        this.z = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.y < ((z0) this.z).f();
            case 1:
                return this.y < ((ViewGroup) this.z).getChildCount();
            case 2:
                return this.y < ((byte[]) this.z).length;
            case 3:
                return this.y < ((int[]) this.z).length;
            case 4:
                return this.y < ((long[]) this.z).length;
            case 5:
                return this.y < ((short[]) this.z).length;
            case 6:
                return this.y < ((kotlin.collections.e) this.z).b();
            default:
                return this.y < ((Object[]) this.z).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                z0 z0Var = (z0) this.z;
                int i = this.y;
                this.y = i + 1;
                return z0Var.g(i);
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.z;
                int i2 = this.y;
                this.y = i2 + 1;
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                int i3 = this.y;
                byte[] bArr = (byte[]) this.z;
                if (i3 < bArr.length) {
                    this.y = i3 + 1;
                    return new kotlin.p(bArr[i3]);
                }
                androidx.transition.k.m(String.valueOf(i3));
                return null;
            case 3:
                int i4 = this.y;
                int[] iArr = (int[]) this.z;
                if (i4 < iArr.length) {
                    this.y = i4 + 1;
                    return new kotlin.r(iArr[i4]);
                }
                androidx.transition.k.m(String.valueOf(i4));
                return null;
            case 4:
                int i5 = this.y;
                long[] jArr = (long[]) this.z;
                if (i5 < jArr.length) {
                    this.y = i5 + 1;
                    return new kotlin.t(jArr[i5]);
                }
                androidx.transition.k.m(String.valueOf(i5));
                return null;
            case 5:
                int i6 = this.y;
                short[] sArr = (short[]) this.z;
                if (i6 < sArr.length) {
                    this.y = i6 + 1;
                    return new kotlin.w(sArr[i6]);
                }
                androidx.transition.k.m(String.valueOf(i6));
                return null;
            case 6:
                if (!hasNext()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                kotlin.collections.e eVar = (kotlin.collections.e) this.z;
                int i7 = this.y;
                this.y = i7 + 1;
                return eVar.get(i7);
            default:
                try {
                    Object[] objArr = (Object[]) this.z;
                    int i8 = this.y;
                    this.y = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.y--;
                    androidx.transition.k.m(e.getMessage());
                    return null;
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.z;
                int i = this.y - 1;
                this.y = i;
                viewGroup.removeViewAt(i);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ b1(Object obj, int i) {
        this.e = i;
        this.z = obj;
    }
}
