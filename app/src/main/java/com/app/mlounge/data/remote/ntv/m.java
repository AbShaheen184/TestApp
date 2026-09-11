package com.app.mlounge.data.remote.ntv;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final String a;
    public final Map b;

    public m(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.a, mVar.a) && kotlin.jvm.internal.l.a(this.b, mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NtvStreamResult(url=" + this.a + ", headers=" + this.b + ")";
    }
}
