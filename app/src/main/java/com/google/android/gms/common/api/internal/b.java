package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final coil3.memory.c b;
    public final com.google.android.gms.common.api.b c;
    public final String d;

    public b(coil3.memory.c cVar, com.google.android.gms.common.api.b bVar, String str) {
        this.b = cVar;
        this.c = bVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{cVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.x.j(this.b, bVar.b) && com.google.android.gms.common.internal.x.j(this.c, bVar.c) && com.google.android.gms.common.internal.x.j(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
