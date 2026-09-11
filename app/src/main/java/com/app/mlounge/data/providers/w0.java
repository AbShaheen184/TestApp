package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements okhttp3.n {
    private final Map<String, List<okhttp3.m>> store = new LinkedHashMap();

    @Override // okhttp3.n
    public final void g(okhttp3.s sVar, List list) {
        sVar.getClass();
        String str = sVar.d;
        Map<String, List<okhttp3.m>> map = this.store;
        List<okhttp3.m> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.addAll(list);
    }

    @Override // okhttp3.n
    public final List h(okhttp3.s sVar) {
        sVar.getClass();
        List<okhttp3.m> list = this.store.get(sVar.d);
        return list != null ? list : kotlin.collections.u.e;
    }
}
