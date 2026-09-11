package okhttp3;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i c = new i(kotlin.collections.o.o0(new ArrayList()), null);
    public final Set a;
    public final com.google.android.material.resources.b b;

    public i(Set set, com.google.android.material.resources.b bVar) {
        this.a = set;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.a.equals(this.a) && kotlin.jvm.internal.l.a(iVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        com.google.android.material.resources.b bVar = this.b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
