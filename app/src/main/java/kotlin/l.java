package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {
    public final Throwable e;

    public l(Throwable th) {
        th.getClass();
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.l.a(this.e, ((l) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.e + ')';
    }
}
