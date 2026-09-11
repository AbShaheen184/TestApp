package coil3.compose.internal;

import coil3.q;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;
    public final coil3.compose.b b;
    public final q c;

    public a(Object obj, coil3.compose.b bVar, q qVar) {
        this.a = obj;
        this.b = bVar;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        coil3.compose.b bVar = aVar.b;
        coil3.compose.b bVar2 = this.b;
        return l.a(bVar2, bVar) && bVar2.a(this.a, aVar.a) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        coil3.compose.b bVar = this.b;
        return this.c.hashCode() + ((bVar.b(this.a) + (bVar.hashCode() * 31)) * 31);
    }
}
