package org.jsoup.internal;

import java.util.WeakHashMap;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Supplier b;

    public /* synthetic */ f(Supplier supplier, int i) {
        this.a = i;
        this.b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return ((c) this.b).get();
            case 1:
                ((c) this.b).getClass();
                return new char[2];
            default:
                ((c) this.b).getClass();
                return new WeakHashMap();
        }
    }
}
