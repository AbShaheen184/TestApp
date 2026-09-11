package androidx.collection;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Cloneable {
    public /* synthetic */ int A;
    public /* synthetic */ boolean e;
    public /* synthetic */ int[] y;
    public /* synthetic */ Object[] z;

    public z0(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.y = new int[i5];
        this.z = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.A;
        if (i2 != 0 && i <= this.y[i2 - 1]) {
            e(i, colorStateList);
            return;
        }
        if (this.e && i2 >= this.y.length) {
            t.a(this);
        }
        int i3 = this.A;
        if (i3 >= this.y.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.y = Arrays.copyOf(this.y, i7);
            this.z = Arrays.copyOf(this.z, i7);
        }
        this.y[i3] = i;
        this.z[i3] = colorStateList;
        this.A = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        z0 z0Var = (z0) objClone;
        z0Var.y = (int[]) this.y.clone();
        z0Var.z = (Object[]) this.z.clone();
        return z0Var;
    }

    public final Object c(int i) {
        Object obj;
        int iA = androidx.collection.internal.a.a(this.y, this.A, i);
        if (iA < 0 || (obj = this.z[iA]) == t.c) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.e) {
            t.a(this);
        }
        return this.y[i];
    }

    public final void e(int i, Object obj) {
        int iA = androidx.collection.internal.a.a(this.y, this.A, i);
        if (iA >= 0) {
            this.z[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.A;
        if (i2 < i3) {
            Object[] objArr = this.z;
            if (objArr[i2] == t.c) {
                this.y[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.e && i3 >= this.y.length) {
            t.a(this);
            i2 = ~androidx.collection.internal.a.a(this.y, this.A, i);
        }
        int i4 = this.A;
        if (i4 >= this.y.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.y = Arrays.copyOf(this.y, i8);
            this.z = Arrays.copyOf(this.z, i8);
        }
        int i9 = this.A;
        if (i9 - i2 != 0) {
            int[] iArr = this.y;
            int i10 = i2 + 1;
            kotlin.collections.n.C(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.z;
            kotlin.collections.n.D(i10, i2, this.A, objArr2, objArr2);
        }
        this.y[i2] = i;
        this.z[i2] = obj;
        this.A++;
    }

    public final int f() {
        if (this.e) {
            t.a(this);
        }
        return this.A;
    }

    public final Object g(int i) {
        if (this.e) {
            t.a(this);
        }
        Object[] objArr = this.z;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A * 28);
        sb.append('{');
        int i = this.A;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objG = g(i2);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
