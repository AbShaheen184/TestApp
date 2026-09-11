package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final j1 b;
    public final com.google.common.collect.k0 a;

    static {
        com.google.firebase.platforminfo.c cVar = new com.google.firebase.platforminfo.c();
        cVar.e = com.google.common.collect.k0.k(2, 1, 5);
        b = new j1(cVar);
    }

    public j1(com.google.firebase.platforminfo.c cVar) {
        this.a = (com.google.common.collect.k0) cVar.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j1) && this.a.equals(((j1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
