package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public transient Set e;
    public transient Collection y;
    public transient Map z;

    public Map a() {
        Map map = this.z;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.z = mapB;
        return mapB;
    }

    public abstract Map b();

    public abstract Set c();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return a().equals(((o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
