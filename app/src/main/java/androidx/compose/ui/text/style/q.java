package androidx.compose.ui.text.style;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q c = new q(h1.r(0), h1.r(0));
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return androidx.compose.ui.unit.o.a(this.a, qVar.a) && androidx.compose.ui.unit.o.a(this.b, qVar.b);
    }

    public final int hashCode() {
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) androidx.compose.ui.unit.o.d(this.a)) + ", restLine=" + ((Object) androidx.compose.ui.unit.o.d(this.b)) + ')';
    }
}
