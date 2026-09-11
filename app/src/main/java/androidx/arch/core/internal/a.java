package androidx.arch.core.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final HashMap B = new HashMap();

    @Override // androidx.arch.core.internal.f
    public final c b(Object obj) {
        return (c) this.B.get(obj);
    }

    @Override // androidx.arch.core.internal.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.B.remove(obj);
        return objC;
    }
}
