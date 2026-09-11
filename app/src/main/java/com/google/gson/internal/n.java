package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractMap implements Serializable {
    public static final com.google.android.material.internal.k F = new com.google.android.material.internal.k(1);
    public final m C;
    public l D;
    public l E;
    public final boolean y;
    public m z;
    public int A = 0;
    public int B = 0;
    public final Comparator e = F;

    public n(boolean z) {
        this.y = z;
        this.C = new m(z);
    }

    public final m a(Object obj, boolean z) {
        int iCompareTo;
        m mVar;
        m mVar2 = this.z;
        com.google.android.material.internal.k kVar = F;
        Comparator comparator = this.e;
        if (mVar2 != null) {
            Comparable comparable = comparator == kVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.C;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mVar2;
                }
                m mVar3 = iCompareTo < 0 ? mVar2.y : mVar2.z;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            iCompareTo = 0;
        }
        m mVar4 = mVar2;
        if (!z) {
            return null;
        }
        m mVar5 = this.C;
        if (mVar4 != null) {
            mVar = new m(this.y, mVar4, obj, mVar5, mVar5.B);
            if (iCompareTo < 0) {
                mVar4.y = mVar;
            } else {
                mVar4.z = mVar;
            }
            b(mVar4, true);
        } else {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.y, mVar4, obj, mVar5, mVar5.B);
            this.z = mVar;
        }
        this.A++;
        this.B++;
        return mVar;
    }

    public final void b(m mVar, boolean z) {
        while (mVar != null) {
            m mVar2 = mVar.y;
            m mVar3 = mVar.z;
            int i = mVar2 != null ? mVar2.F : 0;
            int i2 = mVar3 != null ? mVar3.F : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                m mVar4 = mVar3.y;
                m mVar5 = mVar3.z;
                int i4 = (mVar4 != null ? mVar4.F : 0) - (mVar5 != null ? mVar5.F : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(mVar);
                } else {
                    f(mVar3);
                    e(mVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                m mVar6 = mVar2.y;
                m mVar7 = mVar2.z;
                int i5 = (mVar6 != null ? mVar6.F : 0) - (mVar7 != null ? mVar7.F : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(mVar);
                } else {
                    e(mVar2);
                    f(mVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                mVar.F = i + 1;
                if (z) {
                    return;
                }
            } else {
                mVar.F = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            mVar = mVar.e;
        }
    }

    public final void c(m mVar, boolean z) {
        m mVar2;
        m mVar3;
        int i;
        if (z) {
            m mVar4 = mVar.B;
            mVar4.A = mVar.A;
            mVar.A.B = mVar4;
        }
        m mVar5 = mVar.y;
        m mVar6 = mVar.z;
        m mVar7 = mVar.e;
        int i2 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                d(mVar, mVar5);
                mVar.y = null;
            } else if (mVar6 != null) {
                d(mVar, mVar6);
                mVar.z = null;
            } else {
                d(mVar, null);
            }
            b(mVar7, false);
            this.A--;
            this.B++;
            return;
        }
        if (mVar5.F > mVar6.F) {
            m mVar8 = mVar5.z;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.z;
                }
            }
        } else {
            m mVar10 = mVar6.y;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.y;
                }
            }
            mVar3 = mVar2;
        }
        c(mVar3, false);
        m mVar11 = mVar.y;
        if (mVar11 != null) {
            i = mVar11.F;
            mVar3.y = mVar11;
            mVar11.e = mVar3;
            mVar.y = null;
        } else {
            i = 0;
        }
        m mVar12 = mVar.z;
        if (mVar12 != null) {
            i2 = mVar12.F;
            mVar3.z = mVar12;
            mVar12.e = mVar3;
            mVar.z = null;
        }
        mVar3.F = Math.max(i, i2) + 1;
        d(mVar, mVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.z = null;
        this.A = 0;
        this.B++;
        m mVar = this.C;
        mVar.B = mVar;
        mVar.A = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVarA = null;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVarA != null;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.e;
        mVar.e = null;
        if (mVar2 != null) {
            mVar2.e = mVar3;
        }
        if (mVar3 == null) {
            this.z = mVar2;
        } else if (mVar3.y == mVar) {
            mVar3.y = mVar2;
        } else {
            mVar3.z = mVar2;
        }
    }

    public final void e(m mVar) {
        m mVar2 = mVar.y;
        m mVar3 = mVar.z;
        m mVar4 = mVar3.y;
        m mVar5 = mVar3.z;
        mVar.z = mVar4;
        if (mVar4 != null) {
            mVar4.e = mVar;
        }
        d(mVar, mVar3);
        mVar3.y = mVar;
        mVar.e = mVar3;
        int iMax = Math.max(mVar2 != null ? mVar2.F : 0, mVar4 != null ? mVar4.F : 0) + 1;
        mVar.F = iMax;
        mVar3.F = Math.max(iMax, mVar5 != null ? mVar5.F : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.D;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.D = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.y;
        m mVar3 = mVar.z;
        m mVar4 = mVar2.y;
        m mVar5 = mVar2.z;
        mVar.y = mVar5;
        if (mVar5 != null) {
            mVar5.e = mVar;
        }
        d(mVar, mVar2);
        mVar2.z = mVar;
        mVar.e = mVar2;
        int iMax = Math.max(mVar3 != null ? mVar3.F : 0, mVar5 != null ? mVar5.F : 0) + 1;
        mVar.F = iMax;
        mVar2.F = Math.max(iMax, mVar4 != null ? mVar4.F : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            return mVarA.E;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.E;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.E = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            com.google.gson.b.h("key == null");
            return null;
        }
        if (obj2 == null && !this.y) {
            com.google.gson.b.h("value == null");
            return null;
        }
        m mVarA = a(obj, true);
        Object obj3 = mVarA.E;
        mVarA.E = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            c(mVarA, true);
        }
        if (mVarA != null) {
            return mVarA.E;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A;
    }
}
