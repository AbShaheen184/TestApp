package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class fh extends c {
    public final Map b;

    public fh(ka kaVar, ka kaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, kaVar);
        d(linkedHashMap, kaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((kg) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, ka kaVar) {
        for (int i = 0; i < kaVar.a(); i++) {
            kg kgVarI = kaVar.i(i);
            Object obj = linkedHashMap.get(kgVarI);
            boolean z = kgVarI.c;
            Class cls = kgVarI.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(kgVarI, arrayList);
                }
                arrayList.add(cls.cast(kaVar.j(i)));
            } else {
                linkedHashMap.put(kgVarI, cls.cast(kaVar.j(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(bh bhVar, wg wgVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            kg kgVar = (kg) entry.getKey();
            Object value = entry.getValue();
            if (kgVar.c) {
                bhVar.b(kgVar, ((List) value).iterator(), wgVar);
            } else {
                bhVar.a(kgVar, value, wgVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return this.b.keySet();
    }
}
