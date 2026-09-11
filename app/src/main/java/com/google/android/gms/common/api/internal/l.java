package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final b a;
    public final com.google.android.gms.common.d b;

    public /* synthetic */ l(b bVar, com.google.android.gms.common.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.x.j(this.a, lVar.a) && com.google.android.gms.common.internal.x.j(this.b, lVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        coil3.memory.c cVar = new coil3.memory.c(this);
        cVar.f(this.a, "key");
        cVar.f(this.b, "feature");
        return cVar.toString();
    }
}
