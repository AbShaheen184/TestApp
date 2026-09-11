package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.collection.b1;
import androidx.compose.runtime.n1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.n;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.collections.f implements Collection, kotlin.jvm.internal.markers.b {
    public int A;
    public androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b B = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b();
    public Object[] C;
    public Object[] D;
    public int E;
    public c e;
    public Object[] y;
    public Object[] z;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = cVar;
        this.y = objArr;
        this.z = objArr2;
        this.A = i;
        this.C = objArr;
        this.D = objArr2;
        this.E = cVar.b();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(l lVar, int i, e eVar) {
        int iZ = z(lVar, this.D, i, eVar);
        Object obj = eVar.a;
        if (iZ == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iZ, i, (Object) null);
        this.D = objArr;
        this.E -= i - iZ;
        return iZ;
    }

    public final boolean B(l lVar) {
        int i;
        l lVar2 = lVar;
        int iH = H();
        Object[] objArrR = null;
        e eVar = new e(null);
        boolean z = false;
        if (this.C != null) {
            a aVarL = l(0);
            int iZ = 32;
            while (iZ == 32 && aVarL.hasNext()) {
                iZ = z(lVar2, (Object[]) aVarL.next(), 32, eVar);
            }
            if (iZ == 32) {
                int iA = A(lVar2, iH, eVar);
                if (iA == 0) {
                    t(this.C, this.E, this.A);
                }
                if (iA != iH) {
                }
            } else {
                int i2 = (aVarL.e - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iY = iZ;
                while (aVarL.hasNext()) {
                    iY = y(lVar2, (Object[]) aVarL.next(), 32, iY, eVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iY2 = y(lVar, this.D, iH, iY, eVar, arrayList2, arrayList);
                Object obj = eVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iY2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrU = this.C;
                if (zIsEmpty) {
                    objArrU.getClass();
                } else {
                    objArrU = u(objArrU, i2, this.A, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    n1.a("invalid size");
                }
                if (size == 0) {
                    this.A = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.A;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.A = i - 5;
                        Object[] objArr2 = objArrU[0];
                        objArr2.getClass();
                        objArrU = objArr2;
                    }
                    objArrR = r(objArrU, i3, i);
                }
                this.C = objArrR;
                this.D = objArr;
                this.E = size + iY2;
            }
            z = true;
        } else if (A(lVar2, iH, eVar) != iH) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] C(Object[] objArr, int i, int i2, e eVar) {
        int iU = com.google.android.gms.dynamite.g.u(i2, i);
        if (i == 0) {
            Object obj = objArr[iU];
            Object[] objArrN = n(objArr);
            n.D(iU, iU + 1, 32, objArr, objArrN);
            objArrN[31] = eVar.a;
            eVar.a = obj;
            return objArrN;
        }
        int iU2 = objArr[31] == null ? com.google.android.gms.dynamite.g.u(E() - 1, i) : 31;
        Object[] objArrN2 = n(objArr);
        int i3 = i - 5;
        int i4 = iU + 1;
        if (i4 <= iU2) {
            while (true) {
                Object obj2 = objArrN2[iU2];
                obj2.getClass();
                objArrN2[iU2] = C((Object[]) obj2, i3, 0, eVar);
                if (iU2 == i4) {
                    break;
                }
                iU2--;
            }
        }
        Object obj3 = objArrN2[iU];
        obj3.getClass();
        objArrN2[iU] = C((Object[]) obj3, i3, i2, eVar);
        return objArrN2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.E - i;
        Object[] objArr2 = this.D;
        if (i4 == 1) {
            Object obj = objArr2[0];
            t(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrN = n(objArr2);
        n.D(i3, i3 + 1, i4, objArr2, objArrN);
        objArrN[i4 - 1] = null;
        this.C = objArr;
        this.D = objArrN;
        this.E = (i + i4) - 1;
        this.A = i2;
        return obj2;
    }

    public final int E() {
        int i = this.E;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i, int i2, Object obj, e eVar) {
        int iU = com.google.android.gms.dynamite.g.u(i2, i);
        Object[] objArrN = n(objArr);
        if (i != 0) {
            Object obj2 = objArrN[iU];
            obj2.getClass();
            objArrN[iU] = F((Object[]) obj2, i - 5, i2, obj, eVar);
            return objArrN;
        }
        if (objArrN != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.a = objArrN[iU];
        objArrN[iU] = obj;
        return objArrN;
    }

    public final void G(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrP;
        if (i3 < 1) {
            n1.a("requires at least one nullBuffer");
        }
        Object[] objArrN = n(objArr);
        objArr2[0] = objArrN;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            n.D(size + 1, i4, i2, objArrN, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrP = objArrN;
            } else {
                objArrP = p();
                i3--;
                objArr2[i3] = objArrP;
            }
            int i7 = i2 - i6;
            n.D(0, i7, i2, objArrN, objArr3);
            n.D(size + 1, i4, i7, objArrN, objArrP);
            objArr3 = objArrP;
        }
        Iterator it = collection.iterator();
        e(objArrN, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrP2 = p();
            e(objArrP2, 0, it);
            objArr2[i8] = objArrP2;
        }
        e(objArr3, 0, it);
    }

    public final int H() {
        int i = this.E;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        t1.f(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            j(i - iE, obj, this.C);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.C;
        objArr.getClass();
        j(0, eVar.a, i(objArr, this.A, i, obj, eVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] objArrP;
        t1.f(i, this.E);
        if (i == this.E) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.E - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.D;
            Object[] objArrN = n(objArr);
            n.D(size2 + 1, i3, H(), objArr, objArrN);
            e(objArrN, i3, collection.iterator());
            this.D = objArrN;
            this.E = collection.size() + this.E;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iH = H();
        int size3 = collection.size() + this.E;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            objArrP = p();
            collection2 = collection;
            G(collection2, i, this.D, iH, objArr2, size, objArrP);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            Object[] objArr3 = gVar.D;
            if (size3 > iH) {
                int i4 = size3 - iH;
                Object[] objArrO = o(i4, objArr3);
                gVar.h(collection2, i, i4, objArr2, size, objArrO);
                objArr2 = objArr2;
                objArrP = objArrO;
            } else {
                objArrP = p();
                int i5 = iH - size3;
                n.D(0, i5, iH, objArr3, objArrP);
                int i6 = 32 - i5;
                Object[] objArrO2 = o(i6, gVar.D);
                int i7 = size - 1;
                objArr2[i7] = objArrO2;
                gVar.h(collection2, i, i6, objArr2, i7, objArrO2);
                collection2 = collection2;
            }
        }
        gVar.C = v(gVar.C, i2, objArr2);
        gVar.D = objArrP;
        gVar.E = collection2.size() + gVar.E;
        return true;
    }

    @Override // kotlin.collections.f
    public final int b() {
        return this.E;
    }

    @Override // kotlin.collections.f
    public final Object c(int i) {
        t1.e(i, b());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            return D(this.C, iE, this.A, i - iE);
        }
        e eVar = new e(this.D[0]);
        Object[] objArr = this.C;
        objArr.getClass();
        D(C(objArr, this.A, i, eVar), iE, this.A, 0);
        return eVar.a;
    }

    public final c d() {
        c fVar;
        Object[] objArr = this.C;
        if (objArr == this.y && this.D == this.z) {
            fVar = this.e;
        } else {
            this.B = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b();
            this.y = objArr;
            Object[] objArr2 = this.D;
            this.z = objArr2;
            if (objArr == null) {
                fVar = objArr2.length == 0 ? j.y : new j(Arrays.copyOf(objArr2, this.E));
            } else {
                fVar = new f(objArr, objArr2, this.E, this.A);
            }
        }
        this.e = fVar;
        return fVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        t1.e(i, b());
        if (E() <= i) {
            objArr = this.D;
        } else {
            objArr = this.C;
            objArr.getClass();
            for (int i2 = this.A; i2 > 0; i2 -= 5) {
                Object obj = objArr[com.google.android.gms.dynamite.g.u(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final void h(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.C == null) {
            net.luminis.tls.engine.impl.c.r("root is null");
            return;
        }
        int i4 = i >> 5;
        a aVarL = l(E() >> 5);
        int i5 = i3;
        Object[] objArrO = objArr2;
        while (aVarL.e - 1 != i4) {
            Object[] objArr3 = (Object[]) aVarL.previous();
            n.D(0, 32 - i2, 32, objArr3, objArrO);
            objArrO = o(i2, objArr3);
            i5--;
            objArr[i5] = objArrO;
        }
        Object[] objArr4 = (Object[]) aVarL.previous();
        int iE = i3 - (((E() >> 5) - 1) - i4);
        if (iE < i3) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        G(collection, i, objArr4, 32, objArr, iE, objArr2);
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, e eVar) {
        Object obj2;
        int iU = com.google.android.gms.dynamite.g.u(i2, i);
        if (i == 0) {
            eVar.a = objArr[31];
            Object[] objArrN = n(objArr);
            n.D(iU + 1, iU, 31, objArr, objArrN);
            objArrN[iU] = obj;
            return objArrN;
        }
        Object[] objArrN2 = n(objArr);
        int i3 = i - 5;
        Object obj3 = objArrN2[iU];
        obj3.getClass();
        objArrN2[iU] = i((Object[]) obj3, i3, i2, obj, eVar);
        while (true) {
            iU++;
            if (iU >= 32 || (obj2 = objArrN2[iU]) == null) {
                break;
            }
            objArrN2[iU] = i((Object[]) obj2, i3, 0, eVar.a, eVar);
        }
        return objArrN2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int iH = H();
        Object[] objArrN = n(this.D);
        Object[] objArr2 = this.D;
        if (iH >= 32) {
            Object obj2 = objArr2[31];
            n.D(i + 1, i, 31, objArr2, objArrN);
            objArrN[i] = obj;
            w(objArr, objArrN, q(obj2));
            return;
        }
        n.D(i + 1, i, iH, objArr2, objArrN);
        objArrN[i] = obj;
        this.C = objArr;
        this.D = objArrN;
        this.E++;
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.B;
    }

    public final a l(int i) {
        Object[] objArr = this.C;
        if (objArr == null) {
            net.luminis.tls.engine.impl.c.r("Invalid root");
            return null;
        }
        int iE = E() >> 5;
        t1.f(i, iE);
        int i2 = this.A;
        return i2 == 0 ? new d(objArr, i) : new k(objArr, i, iE, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        t1.f(i, this.E);
        return new i(this, i);
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] objArrP = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        n.H(0, length, 6, objArr, objArrP);
        return objArrP;
    }

    public final Object[] o(int i, Object[] objArr) {
        if (k(objArr)) {
            n.D(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrP = p();
        n.D(i, 0, 32 - i, objArr, objArrP);
        return objArrP;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.B;
        return objArr;
    }

    public final Object[] q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.B;
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            n1.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iU = com.google.android.gms.dynamite.g.u(i, i2);
        Object obj = objArr[iU];
        obj.getClass();
        Object objR = r((Object[]) obj, i, i2 - 5);
        if (iU < 31) {
            int i3 = iU + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrP = p();
                n.D(0, 0, i3, objArr, objArrP);
                objArr = objArrP;
            }
        }
        if (objR == objArr[iU]) {
            return objArr;
        }
        Object[] objArrN = n(objArr);
        objArrN[iU] = objR;
        return objArrN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return B(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, e eVar) {
        Object[] objArrS;
        int iU = com.google.android.gms.dynamite.g.u(i2 - 1, i);
        if (i == 5) {
            eVar.a = objArr[iU];
            objArrS = null;
        } else {
            Object obj = objArr[iU];
            obj.getClass();
            objArrS = s((Object[]) obj, i - 5, i2, eVar);
        }
        if (objArrS == null && iU == 0) {
            return null;
        }
        Object[] objArrN = n(objArr);
        objArrN[iU] = objArrS;
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        t1.e(i, b());
        if (E() > i) {
            e eVar = new e(null);
            Object[] objArr = this.C;
            objArr.getClass();
            this.C = F(objArr, this.A, i, obj, eVar);
            return eVar.a;
        }
        Object[] objArrN = n(this.D);
        if (objArrN != this.D) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrN[i2];
        objArrN[i2] = obj;
        this.D = objArrN;
        return obj2;
    }

    public final void t(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.C = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.D = objArr;
            this.E = i;
            this.A = i2;
            return;
        }
        e eVar = new e(null);
        objArr.getClass();
        Object[] objArrS = s(objArr, i2, i, eVar);
        objArrS.getClass();
        Object obj = eVar.a;
        obj.getClass();
        this.D = (Object[]) obj;
        this.E = i;
        if (objArrS[1] == null) {
            this.C = (Object[]) objArrS[0];
            this.A = i2 - 5;
        } else {
            this.C = objArrS;
            this.A = i2;
        }
    }

    public final Object[] u(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            n1.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            n1.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrN = n(objArr);
        int iU = com.google.android.gms.dynamite.g.u(i, i2);
        int i3 = i2 - 5;
        objArrN[iU] = u((Object[]) objArrN[iU], i, i3, it);
        while (true) {
            iU++;
            if (iU >= 32 || !it.hasNext()) {
                break;
            }
            objArrN[iU] = u((Object[]) objArrN[iU], 0, i3, it);
        }
        return objArrN;
    }

    public final Object[] v(Object[] objArr, int i, Object[][] objArr2) {
        b1 b1Var = new b1(objArr2);
        int i2 = i >> 5;
        int i3 = this.A;
        Object[] objArrU = i2 < (1 << i3) ? u(objArr, i, i3, b1Var) : n(objArr);
        while (b1Var.hasNext()) {
            this.A += 5;
            objArrU = q(objArrU);
            int i4 = this.A;
            u(objArrU, 1 << i4, i4, b1Var);
        }
        return objArrU;
    }

    public final void w(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.E;
        int i2 = i >> 5;
        int i3 = this.A;
        if (i2 > (1 << i3)) {
            this.C = x(this.A + 5, q(objArr), objArr2);
            this.D = objArr3;
            this.A += 5;
            this.E++;
            return;
        }
        if (objArr == null) {
            this.C = objArr2;
            this.D = objArr3;
            this.E = i + 1;
        } else {
            this.C = x(i3, objArr, objArr2);
            this.D = objArr3;
            this.E++;
        }
    }

    public final Object[] x(int i, Object[] objArr, Object[] objArr2) {
        int iU = com.google.android.gms.dynamite.g.u(b() - 1, i);
        Object[] objArrN = n(objArr);
        if (i == 5) {
            objArrN[iU] = objArr2;
            return objArrN;
        }
        objArrN[iU] = x(i - 5, (Object[]) objArrN[iU], objArr2);
        return objArrN;
    }

    public final int y(l lVar, Object[] objArr, int i, int i2, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrP = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrP = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : p();
                    i2 = 0;
                }
                objArrP[i2] = obj2;
                i2++;
            }
        }
        eVar.a = objArrP;
        if (objArr2 != objArrP) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int z(l lVar, Object[] objArr, int i, e eVar) {
        Object[] objArrN = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrN = n(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrN[i2] = obj;
                i2++;
            }
        }
        eVar.a = objArrN;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iH = H();
        if (iH < 32) {
            Object[] objArrN = n(this.D);
            objArrN[iH] = obj;
            this.D = objArrN;
            this.E = b() + 1;
        } else {
            w(this.C, this.D, q(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        Iterator it = collection.iterator();
        if (32 - iH >= collection.size()) {
            Object[] objArrN = n(this.D);
            e(objArrN, iH, it);
            this.D = objArrN;
            this.E = collection.size() + this.E;
            return true;
        }
        int size = ((collection.size() + iH) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrN2 = n(this.D);
        e(objArrN2, iH, it);
        objArr[0] = objArrN2;
        for (int i = 1; i < size; i++) {
            Object[] objArrP = p();
            e(objArrP, 0, it);
            objArr[i] = objArrP;
        }
        this.C = v(this.C, E(), objArr);
        Object[] objArrP2 = p();
        e(objArrP2, 0, it);
        this.D = objArrP2;
        this.E = collection.size() + this.E;
        return true;
    }
}
