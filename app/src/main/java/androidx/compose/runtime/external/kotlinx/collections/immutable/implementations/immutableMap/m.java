package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.n1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m e = new m(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b c;
    public Object[] d;

    public m(int i, int i2, Object[] objArr, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar;
        this.d = objArr;
    }

    public static m j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar) {
        if (i3 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iY = com.google.firebase.b.y(i, i3);
        int iY2 = com.google.firebase.b.y(i2, i3);
        if (iY != iY2) {
            return new m((1 << iY) | (1 << iY2), 0, iY < iY2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iY, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar) {
        Object obj3 = this.d[i];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, bVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.n.H(0, i, 6, objArr, objArr2);
        kotlin.collections.n.D(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = mVarJ;
        kotlin.collections.n.D(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, this.d.length), 2);
        int i = bVarO.e;
        int i2 = bVarO.y;
        int i3 = bVarO.z;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!kotlin.jvm.internal.l.a(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iY = 1 << com.google.firebase.b.y(i, i2);
        if (h(iY)) {
            return kotlin.jvm.internal.l.a(obj, this.d[f(iY)]);
        }
        if (!i(iY)) {
            return false;
        }
        m mVarS = s(t(iY));
        return i2 == 30 ? mVarS.c(obj) : mVarS.d(i, i2 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.b == mVar.b && this.a == mVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == mVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iY = 1 << com.google.firebase.b.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (kotlin.jvm.internal.l.a(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iY)) {
            return null;
        }
        m mVarS = s(t(iY));
        if (i2 != 30) {
            return mVarS.g(i, i2 + 5, obj);
        }
        kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVarS.d.length), 2);
        int i3 = bVarO.e;
        int i4 = bVarO.y;
        int i5 = bVarO.z;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!kotlin.jvm.internal.l.a(obj, mVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return mVarS.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final m k(int i, androidx.compose.runtime.internal.i iVar) {
        iVar.e(iVar.size() - 1);
        iVar.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != iVar.e) {
            return new m(0, 0, com.google.firebase.b.d(i, objArr), iVar.e);
        }
        this.d = com.google.firebase.b.d(i, objArr);
        return this;
    }

    public final m l(int i, Object obj, Object obj2, int i2, androidx.compose.runtime.internal.i iVar) {
        androidx.compose.runtime.internal.i iVar2;
        m mVarL;
        int iY = 1 << com.google.firebase.b.y(i, i2);
        boolean zH = h(iY);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar = this.c;
        if (zH) {
            int iF = f(iY);
            if (!kotlin.jvm.internal.l.a(obj, this.d[iF])) {
                iVar.e(iVar.size() + 1);
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar2 = iVar.e;
                if (bVar != bVar2) {
                    return new m(this.a ^ iY, this.b | iY, a(iF, iY, i, obj, obj2, i2, bVar2), bVar2);
                }
                this.d = a(iF, iY, i, obj, obj2, i2, bVar2);
                this.a ^= iY;
                this.b |= iY;
                return this;
            }
            iVar.z = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == iVar.e) {
                this.d[iF + 1] = obj2;
                return this;
            }
            iVar.A++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new m(this.a, this.b, objArrCopyOf, iVar.e);
        }
        if (!i(iY)) {
            iVar.e(iVar.size() + 1);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar3 = iVar.e;
            int iF2 = f(iY);
            Object[] objArr2 = this.d;
            if (bVar != bVar3) {
                return new m(this.a | iY, this.b, com.google.firebase.b.c(objArr2, iF2, obj, obj2), bVar3);
            }
            this.d = com.google.firebase.b.c(objArr2, iF2, obj, obj2);
            this.a |= iY;
            return this;
        }
        int iT = t(iY);
        m mVarS = s(iT);
        if (i2 == 30) {
            kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVarS.d.length), 2);
            int i3 = bVarO.e;
            int i4 = bVarO.y;
            int i5 = bVarO.z;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!kotlin.jvm.internal.l.a(obj, mVarS.d[i3])) {
                        if (i3 == i4) {
                            iVar.e(iVar.size() + 1);
                            mVarL = new m(0, 0, com.google.firebase.b.c(mVarS.d, 0, obj, obj2), iVar.e);
                            break;
                        }
                        i3 += i5;
                    } else {
                        iVar.z = mVarS.x(i3);
                        if (mVarS.c != iVar.e) {
                            iVar.A++;
                            Object[] objArr3 = mVarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            mVarL = new m(0, 0, objArrCopyOf2, iVar.e);
                            break;
                        }
                        mVarS.d[i3 + 1] = obj2;
                        mVarL = mVarS;
                        break;
                    }
                }
            } else {
                iVar.e(iVar.size() + 1);
                mVarL = new m(0, 0, com.google.firebase.b.c(mVarS.d, 0, obj, obj2), iVar.e);
                break;
            }
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            mVarL = mVarS.l(i, obj, obj2, i2 + 5, iVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, iVar2.e);
    }

    public final m m(m mVar, int i, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a aVar, androidx.compose.runtime.internal.i iVar) {
        m mVar2;
        Object[] objArr;
        m mVarJ;
        androidx.compose.runtime.internal.i iVar2 = iVar;
        if (this == mVar) {
            aVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar = iVar2.e;
            int i3 = mVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.d.length);
            int length = this.d.length;
            kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVar.d.length), 2);
            int i4 = bVarO.e;
            int i5 = bVarO.y;
            int i6 = bVarO.z;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(mVar.d[i4])) {
                        aVar.a++;
                    } else {
                        Object[] objArr3 = mVar.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == mVar.d.length) {
                    return mVar;
                }
                return length == objArrCopyOf.length ? new m(0, 0, objArrCopyOf, bVar) : new m(0, 0, Arrays.copyOf(objArrCopyOf, length), bVar);
            }
        } else {
            int i7 = this.b | mVar.b;
            int i8 = this.a;
            int i9 = mVar.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (kotlin.jvm.internal.l.a(this.d[f(iLowestOneBit)], mVar.d[mVar.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                n1.b("Check failed.");
            }
            if (kotlin.jvm.internal.l.a(this.c, iVar2.e) && this.a == i12 && this.b == i7) {
                mVar2 = this;
            } else {
                mVar2 = new m(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = mVar2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i + 5, aVar, iVar2);
                        objArr = objArr4;
                    } else {
                        if (mVar.h(iLowestOneBit2)) {
                            int iF = mVar.f(iLowestOneBit2);
                            Object obj = mVar.d[iF];
                            Object objX = mVar.x(iF);
                            int size = iVar2.size();
                            objArr = objArr4;
                            mVarJ = mVarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, iVar2);
                            if (iVar.size() == size) {
                                aVar.a++;
                            }
                        } else {
                            objArr = objArr4;
                        }
                        iVar2 = iVar;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i15 = i + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                                aVar.a++;
                                iVar2 = iVar;
                                mVarJ = mVarS;
                            } else {
                                iVar2 = iVar;
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i15, iVar2);
                            }
                        } else {
                            iVar2 = iVar;
                            mVarJ = mVarS;
                        }
                    } else {
                        iVar2 = iVar;
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i + 5, iVar2.e);
                    }
                }
                objArr[length2] = mVarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i16 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i17 = i16 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.d;
                    objArr5[i17] = mVar.d[iF5];
                    objArr5[i17 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.d;
                    objArr6[i17] = this.d[iF6];
                    objArr6[i17 + 1] = x(iF6);
                }
                i16++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i, Object obj, int i2, androidx.compose.runtime.internal.i iVar) {
        m mVarN;
        int iY = 1 << com.google.firebase.b.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (kotlin.jvm.internal.l.a(obj, this.d[iF])) {
                return p(iF, iY, iVar);
            }
        } else if (i(iY)) {
            int iT = t(iY);
            m mVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVarS.d.length), 2);
                int i3 = bVarO.e;
                int i4 = bVarO.y;
                int i5 = bVarO.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!kotlin.jvm.internal.l.a(obj, mVarS.d[i3])) {
                            if (i3 == i4) {
                                mVarN = mVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            mVarN = mVarS.k(i3, iVar);
                            break;
                        }
                    }
                } else {
                    mVarN = mVarS;
                    break;
                }
            } else {
                mVarN = mVarS.n(i, obj, i2 + 5, iVar);
            }
            return q(mVarS, mVarN, iT, iY, iVar.e);
        }
        return this;
    }

    public final m o(int i, Object obj, Object obj2, int i2, androidx.compose.runtime.internal.i iVar) {
        m mVar;
        m mVarO;
        int iY = 1 << com.google.firebase.b.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (kotlin.jvm.internal.l.a(obj, this.d[iF]) && kotlin.jvm.internal.l.a(obj2, x(iF))) {
                return p(iF, iY, iVar);
            }
        } else if (i(iY)) {
            int iT = t(iY);
            m mVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVarS.d.length), 2);
                int i3 = bVarO.e;
                int i4 = bVarO.y;
                int i5 = bVarO.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!kotlin.jvm.internal.l.a(obj, mVarS.d[i3]) || !kotlin.jvm.internal.l.a(obj2, mVarS.x(i3))) {
                            if (i3 == i4) {
                                mVarO = mVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            mVarO = mVarS.k(i3, iVar);
                            break;
                        }
                    }
                } else {
                    mVarO = mVarS;
                    break;
                }
                mVar = mVarS;
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i, obj, obj2, i2 + 5, iVar);
            }
            return q(mVar, mVarO, iT, iY, iVar.e);
        }
        return this;
    }

    public final m p(int i, int i2, androidx.compose.runtime.internal.i iVar) {
        iVar.e(iVar.size() - 1);
        iVar.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != iVar.e) {
            return new m(i2 ^ this.a, this.b, com.google.firebase.b.d(i, objArr), iVar.e);
        }
        this.d = com.google.firebase.b.d(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final m q(m mVar, m mVar2, int i, int i2, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar2 = this.c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i, mVar2, bVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.a, i2 ^ this.b, com.google.firebase.b.e(i, objArr), bVar);
        }
        this.d = com.google.firebase.b.e(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final m r(int i, m mVar, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && mVar.d.length == 2 && mVar.b == 0) {
            mVar.a = this.b;
            return mVar;
        }
        if (this.c == bVar) {
            objArr[i] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = mVar;
        return new m(this.a, this.b, objArrCopyOf, bVar);
    }

    public final m s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (m) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        r14.z = w(r12, r4, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m) r14.z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.u(int, java.lang.Object, java.lang.Object, int):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l");
    }

    public final m v(int i, int i2, Object obj) {
        m mVarV;
        int iY = 1 << com.google.firebase.b.y(i, i2);
        if (h(iY)) {
            int iF = f(iY);
            if (kotlin.jvm.internal.l.a(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new m(this.a ^ iY, this.b, com.google.firebase.b.d(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iY)) {
            int iT = t(iY);
            m mVarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.b bVarO = com.google.android.material.resources.c.o(com.google.android.material.resources.c.r(0, mVarS.d.length), 2);
                int i3 = bVarO.e;
                int i4 = bVarO.y;
                int i5 = bVarO.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!kotlin.jvm.internal.l.a(obj, mVarS.d[i3])) {
                            if (i3 == i4) {
                                mVarV = mVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = mVarS.d;
                            if (objArr2.length != 2) {
                                mVarV = new m(0, 0, com.google.firebase.b.d(i3, objArr2), null);
                                break;
                            }
                            mVarV = null;
                            break;
                        }
                    }
                } else {
                    mVarV = mVarS;
                    break;
                }
            } else {
                mVarV = mVarS.v(i, i2 + 5, obj);
            }
            if (mVarV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new m(this.a, iY ^ this.b, com.google.firebase.b.e(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iY, mVarV);
            }
        }
        return this;
    }

    public final m w(int i, int i2, m mVar) {
        Object[] objArr = mVar.d;
        if (objArr.length != 2 || mVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = mVar;
            return new m(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            mVar.a = this.b;
            return mVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.collections.n.D(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        kotlin.collections.n.D(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
