package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final com.google.android.datatransport.runtime.time.a a;
    public final HashMap b;

    public a(com.google.android.datatransport.runtime.time.a aVar, HashMap map) {
        this.a = aVar;
        this.b = map;
    }

    public final long a(com.google.android.datatransport.d dVar, long j, int i) {
        long jH = j - this.a.h();
        b bVar = (b) this.b.get(dVar);
        long j2 = bVar.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jH), bVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
