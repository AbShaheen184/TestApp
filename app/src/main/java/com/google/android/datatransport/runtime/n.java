package com.google.android.datatransport.runtime;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.c a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(n.class, e.a);
        map2.remove(n.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.a.class, a.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.a.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.g.class, g.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.g.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.e.class, d.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.e.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.d.class, c.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.d.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.b.class, b.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.b.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.f.class, f.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.f.class);
        a = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(17, new HashMap(map), new HashMap(map2), com.google.firebase.encoders.proto.g.a);
    }
}
