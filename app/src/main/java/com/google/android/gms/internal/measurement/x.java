package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final t b = new t(0);
    public static final x c;
    public final w a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new x(new w());
    }

    public x(w wVar) {
        this.a = wVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
