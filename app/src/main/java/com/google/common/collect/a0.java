package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public Object[] a;
    public int b;
    public boolean c;

    public a0(int i) {
        q.f(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int e(int i, int i2) {
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.o("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract a0 a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof b0) {
                this.b = ((b0) collection).c(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int iE = e(objArr.length, this.b + i);
        if (iE > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iE);
            this.c = false;
        }
    }
}
