package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 implements Iterator {
    public final /* synthetic */ int e;
    public int y = 0;
    public final /* synthetic */ Object z;

    public /* synthetic */ f5(Object obj, int i) {
        this.e = i;
        this.z = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.y < ((g5) this.z).e.length();
            case 1:
                return this.y < ((g5) this.z).e.length();
            default:
                return this.y < ((l1) this.z).p();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.e) {
            case 0:
                String str = ((g5) this.z).e;
                int i = this.y;
                if (i < str.length()) {
                    this.y = i + 1;
                    return new g5(String.valueOf(i));
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            case 1:
                g5 g5Var = (g5) this.z;
                String str2 = g5Var.e;
                int i2 = this.y;
                if (i2 < str2.length()) {
                    this.y = i2 + 1;
                    return new g5(String.valueOf(g5Var.e.charAt(i2)));
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            default:
                l1 l1Var = (l1) this.z;
                int i3 = this.y;
                int iP = l1Var.p();
                int i4 = this.y;
                if (i3 < iP) {
                    this.y = i4 + 1;
                    return l1Var.q(i4);
                }
                androidx.transition.k.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                return null;
        }
    }
}
