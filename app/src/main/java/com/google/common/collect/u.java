package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractMap implements Serializable {
    public static final Object G = new Object();
    public transient Object[] A;
    public transient int B;
    public transient int C;
    public transient s D;
    public transient s E;
    public transient n F;
    public transient Object e;
    public transient int[] y;
    public transient Object[] z;

    public static u a(int i) {
        u uVar = new u();
        com.google.android.material.motion.a.e("Expected size must be >= 0", i >= 0);
        uVar.B = Math.min(Math.max(i, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return uVar;
    }

    public final Map b() {
        Object obj = this.e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.B & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.B += 32;
        Map mapB = b();
        if (mapB != null) {
            this.B = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapB.clear();
            this.e = null;
            this.C = 0;
            return;
        }
        Arrays.fill(i(), 0, this.C, (Object) null);
        Arrays.fill(j(), 0, this.C, (Object) null);
        Object obj = this.e;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.C, 0);
        this.C = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.C; i++) {
            if (kotlin.collections.a0.n(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iT = q.t(obj);
        int iC = c();
        Object obj2 = this.e;
        Objects.requireNonNull(obj2);
        int iU = q.u(iT & iC, obj2);
        if (iU == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iT & i;
        do {
            int i3 = iU - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && kotlin.collections.a0.n(obj, i()[i3])) {
                return i3;
            }
            iU = i4 & iC;
        } while (iU != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.e;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iT = q.t(obj2) & i2;
        int iU = q.u(iT, obj);
        if (iU == size) {
            q.v(iT, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iU - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = q.o(i5, i + 1, i2);
                return;
            }
            iU = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.E;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.E = sVar2;
        return sVar2;
    }

    public final boolean f() {
        return this.e == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.e;
            Objects.requireNonNull(obj2);
            int iQ = q.q(obj, null, iC, obj2, h(), i(), null);
            if (iQ != -1) {
                Object obj3 = j()[iQ];
                e(iQ, iC);
                this.C--;
                this.B += 32;
                return obj3;
            }
        }
        return G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.A;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objG = q.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            q.v(i3 & i5, i4 + 1, objG);
        }
        Object obj = this.e;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iU = q.u(i6, obj);
            while (iU != 0) {
                int i7 = iU - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iU2 = q.u(i10, objG);
                q.v(i10, iU, objG);
                iArrH[i7] = q.o(i9, iU2, i5);
                iU = i8 & i;
            }
        }
        this.e = objG;
        this.B = q.o(this.B, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.D;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.D = sVar2;
        return sVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == G) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.F;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(1, this);
        this.F = nVar2;
        return nVar2;
    }
}
