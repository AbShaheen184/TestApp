package coil3.request;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    public final coil3.k a;
    public final g b;
    public final Throwable c;

    public c(coil3.k kVar, g gVar, Throwable th) {
        this.a = kVar;
        this.b = gVar;
        this.c = th;
    }

    @Override // coil3.request.j
    public final coil3.k a() {
        return this.a;
    }

    @Override // coil3.request.j
    public final g b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.a, cVar.a) && kotlin.jvm.internal.l.a(this.b, cVar.b) && this.c.equals(cVar.c);
    }

    public final int hashCode() {
        coil3.k kVar = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((kVar == null ? 0 : kVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
