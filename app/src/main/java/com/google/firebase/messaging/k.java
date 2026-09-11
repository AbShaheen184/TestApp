package com.google.firebase.messaging;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.c a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(k.class, c.a);
        map2.remove(k.class);
        map.put(com.google.firebase.messaging.reporting.e.class, b.a);
        map2.remove(com.google.firebase.messaging.reporting.e.class);
        map.put(com.google.firebase.messaging.reporting.d.class, a.a);
        map2.remove(com.google.firebase.messaging.reporting.d.class);
        a = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(17, new HashMap(map), new HashMap(map2), com.google.firebase.encoders.proto.g.a);
    }
}
