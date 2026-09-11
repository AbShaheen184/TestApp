package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractMap {
    public static final t C = new t(1);
    public Integer A;
    public String B;
    public final Object[] e;
    public final int[] y;
    public final v z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.w, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.w] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public w(w wVar, w wVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.z = new v(abstractMap, -1);
        abstractMap.A = null;
        abstractMap.B = null;
        int size = wVar2.size() + wVar.size();
        int i = wVar.y[wVar.size()] + wVar2.y[wVar2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = wVar.c(0);
        Map.Entry entryC2 = wVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        int i6 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new v(abstractMap, i6));
                        v vVar = (v) entryC.getValue();
                        v vVar2 = (v) entryC2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iC = vVar.c();
                            w wVar3 = vVar.y;
                            if (i9 >= iC - vVar.b() && i10 >= vVar2.c() - vVar2.b()) {
                                break;
                            }
                            int iCompare = i9 == vVar.c() - vVar.b() ? 1 : i10 == vVar2.c() - vVar2.b() ? -1 : 0;
                            if (iCompare == 0) {
                                t tVar = x.b;
                                iCompare = x.b.compare(wVar3.e[vVar.b() + i9], vVar2.y.e[vVar2.b() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = wVar3.e[vVar.b() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = vVar2.y.e[vVar2.b() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i6] = iA;
                        entryC = wVar.c(i8);
                        entryC2 = wVar2.c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC, i6, iA, objArr2, iArr);
                entryC = wVar.c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = wVar2.c(i4);
            iA = iA2;
            entryC = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.e = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.y = b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        v vVar = (v) entry.getValue();
        int iC = vVar.c() - vVar.b();
        System.arraycopy(vVar.y.e, vVar.b(), objArr, i2, iC);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new v(this, i));
        int i3 = i2 + iC;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.y[0]) {
            return (Map.Entry) this.e[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.A == null) {
            this.A = Integer.valueOf(super.hashCode());
        }
        return this.A.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.B == null) {
            this.B = super.toString();
        }
        return this.B;
    }

    public w() {
        List list = Collections.EMPTY_LIST;
        this.z = new v(this, -1);
        this.A = null;
        this.B = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.e = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.y = iArr;
                return;
            }
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it2);
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
    }
}
