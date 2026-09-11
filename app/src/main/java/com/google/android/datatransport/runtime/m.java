package com.google.android.datatransport.runtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;

    @Override // javax.inject.a
    public final Object get() {
        Set setUnmodifiableSet;
        switch (this.a) {
            case 0:
                return new p(Executors.newSingleThreadExecutor(), 0);
            default:
                com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    map.put(com.google.android.datatransport.d.e, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(30000L, 86400000L, set));
                    if (set != null) {
                        map.put(com.google.android.datatransport.d.z, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(1000L, 86400000L, set));
                        if (set == null || (setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.runtime.scheduling.jobscheduling.d.y)))) == null) {
                            com.google.gson.b.h("Null flags");
                        } else {
                            map.put(com.google.android.datatransport.d.y, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(86400000L, 86400000L, setUnmodifiableSet));
                            if (map.keySet().size() >= com.google.android.datatransport.d.values().length) {
                                new HashMap();
                                return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(gVar, map);
                            }
                            net.luminis.tls.engine.impl.c.r("Not all priorities have been configured");
                        }
                    } else {
                        com.google.gson.b.h("Null flags");
                    }
                } else {
                    com.google.gson.b.h("Null flags");
                }
                return null;
        }
    }
}
