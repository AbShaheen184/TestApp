package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof v1) {
            List listA = ((v1) iterable).a();
            if (list != null) {
                androidx.transition.k.i();
                return;
            }
            list.size();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof t0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                t0.j(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof i2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof k2) {
                k2 k2Var = (k2) list;
                int i = k2Var.z + size;
                int length = k2Var.y.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10);
                        }
                        k2Var.y = Arrays.copyOf(k2Var.y, length);
                    } else {
                        k2Var.y = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    g1.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                g1.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            i1 i1Var = (i1) this;
            int iN = i1Var.n();
            byte[] bArr = new byte[iN];
            boolean z = z0.b;
            x0 x0Var = new x0(bArr, iN);
            i1Var.f(x0Var);
            if (x0Var.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (x0Var.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            androidx.media3.exoplayer.hls.playlist.a.j(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void b(OutputStream outputStream) {
        i1 i1Var = (i1) this;
        int iN = i1Var.n();
        boolean z = z0.b;
        if (iN > 4096) {
            iN = 4096;
        }
        y0 y0Var = new y0(outputStream, iN);
        i1Var.f(y0Var);
        if (y0Var.e > 0) {
            y0Var.B();
        }
    }

    public abstract int c(m2 m2Var);
}
