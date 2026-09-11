package androidx.navigationevent;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends t1 {
    public final b o;

    public j(b bVar) {
        bVar.getClass();
        this.o = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && kotlin.jvm.internal.l.a(this.o, ((j) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.o + ", direction=-1)";
    }
}
