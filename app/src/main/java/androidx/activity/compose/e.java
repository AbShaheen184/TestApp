package androidx.activity.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.firebase.b {
    public final Object l;
    public final long m;

    public e(long j, Object obj) {
        this.l = obj;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.l.equals(eVar.l) && this.m == eVar.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + (this.l.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.l + ", compositeKey=" + this.m + ')';
    }
}
