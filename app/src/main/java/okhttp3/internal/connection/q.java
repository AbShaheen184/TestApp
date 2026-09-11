package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final r a;
    public final r b;
    public final Throwable c;

    public /* synthetic */ q(r rVar, Throwable th, int i) {
        this(rVar, (c) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.a(this.a, qVar.a) && kotlin.jvm.internal.l.a(this.b, qVar.b) && kotlin.jvm.internal.l.a(this.c, qVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public q(r rVar, c cVar, Throwable th) {
        this.a = rVar;
        this.b = cVar;
        this.c = th;
    }
}
