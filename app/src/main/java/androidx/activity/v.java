package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.google.firebase.b {
    public final u l;
    public final androidx.lifecycle.v m;

    public v(u uVar, androidx.lifecycle.v vVar) {
        uVar.getClass();
        this.l = uVar;
        this.m = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.l.a(this.l, vVar.l) && kotlin.jvm.internal.l.a(this.m, vVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        androidx.lifecycle.v vVar = this.m;
        return iHashCode + (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.l + ", owner=" + this.m + ')';
    }
}
