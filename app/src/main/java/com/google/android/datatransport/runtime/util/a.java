package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.d;
import com.google.gson.b;
import java.util.HashMap;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(d.e, 0);
        map.put(d.y, 1);
        map.put(d.z, 2);
        for (d dVar : map.keySet()) {
            a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        b.m(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i) {
        d dVar = (d) a.get(i);
        if (dVar != null) {
            return dVar;
        }
        c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unknown Priority for value "));
        return null;
    }
}
