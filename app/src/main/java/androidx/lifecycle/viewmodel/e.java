package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public e(c cVar) {
        cVar.getClass();
        LinkedHashMap linkedHashMap = cVar.a;
        linkedHashMap.getClass();
        this.a.putAll(linkedHashMap);
    }

    @Override // androidx.lifecycle.viewmodel.c
    public final Object a(b bVar) {
        return this.a.get(bVar);
    }

    public /* synthetic */ e(int i) {
        this(a.b);
    }
}
