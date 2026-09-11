package androidx.compose.foundation;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final Context a;
    public final androidx.compose.ui.unit.c b;
    public final long c;
    public final androidx.compose.foundation.layout.m0 d;

    public o(Context context, androidx.compose.ui.unit.c cVar, long j, androidx.compose.foundation.layout.m0 m0Var) {
        this.a = context;
        this.b = cVar;
        this.c = j;
        this.d = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.a, oVar.a) && kotlin.jvm.internal.l.a(this.b, oVar.b) && androidx.compose.ui.graphics.t.c(this.c, oVar.c) && kotlin.jvm.internal.l.a(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = androidx.compose.ui.graphics.t.j;
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.c(iHashCode, 31, this.c);
    }
}
