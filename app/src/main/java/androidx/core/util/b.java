package androidx.core.util;

import androidx.constraintlayout.core.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final Object c;

    public b() {
        super(12);
        this.c = new Object();
    }

    @Override // androidx.constraintlayout.core.d
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // androidx.constraintlayout.core.d
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
