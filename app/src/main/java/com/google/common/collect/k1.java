package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends p1 {
    public final /* synthetic */ l1 A;
    public int e = 2;
    public Object y;
    public final Iterator z;

    public k1(l1 l1Var) {
        this.A = l1Var;
        this.z = l1Var.e.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        com.google.android.material.motion.a.q(this.e != 4);
        int iE = androidx.constraintlayout.core.g.e(this.e);
        if (iE == 0) {
            return true;
        }
        if (iE != 2) {
            this.e = 4;
            do {
                Iterator it = this.z;
                if (!it.hasNext()) {
                    this.e = 3;
                    next = null;
                    break;
                }
                next = it.next();
            } while (!this.A.y.contains(next));
            this.y = next;
            if (this.e != 3) {
                this.e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.e = 2;
        Object obj = this.y;
        this.y = null;
        return obj;
    }
}
