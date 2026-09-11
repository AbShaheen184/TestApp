package androidx.compose.animation.core;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements y {
    public final n0 a;

    public o0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // androidx.compose.animation.core.y, androidx.compose.animation.core.m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final s2 a(l2 l2Var) {
        int[] iArr;
        Object[] objArr;
        n0 n0Var = this.a;
        androidx.collection.z zVar = n0Var.b;
        androidx.collection.y yVar = new androidx.collection.y(zVar.e + 2);
        androidx.collection.z zVar2 = new androidx.collection.z(zVar.e);
        int[] iArr2 = zVar.b;
        Object[] objArr2 = zVar.c;
        long[] jArr = zVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j & 255) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            m0 m0Var = (m0) objArr2[i5];
                            yVar.a(i6);
                            zVar2.h(i6, new r2((s) l2Var.a.invoke(m0Var.a), m0Var.b));
                        }
                        j >>= i2;
                        i4++;
                        iArr2 = iArr2;
                        i2 = i2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!zVar.a(0)) {
            int i7 = yVar.b;
            if (i7 < 0) {
                com.google.gson.b.n("Index must be between 0 and size");
                return null;
            }
            yVar.b(i7 + 1);
            int[] iArr3 = yVar.a;
            int i8 = yVar.b;
            if (i8 != 0) {
                kotlin.collections.n.C(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            yVar.b++;
        }
        if (!zVar.a(n0Var.a)) {
            yVar.a(n0Var.a);
        }
        int i9 = yVar.b;
        if (i9 != 0) {
            int[] iArr4 = yVar.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new s2(yVar, zVar2, n0Var.a, a0.b);
    }
}
