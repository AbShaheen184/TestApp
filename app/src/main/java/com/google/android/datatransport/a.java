package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;
    public final d b;
    public final b c;

    public a(Object obj, d dVar, b bVar) {
        this.a = obj;
        this.b = dVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
            return false;
        }
        b bVar = aVar.c;
        b bVar2 = this.c;
        if (bVar2 == null) {
            return bVar == null;
        }
        return bVar2.equals(bVar);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        b bVar = this.c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
