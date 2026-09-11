package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {
    public final Object e;

    public static final Throwable a(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.a(this.e, ((m) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.e;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
