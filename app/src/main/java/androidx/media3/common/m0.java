package androidx.media3.common;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final o a;

    static {
        new SparseBooleanArray();
        com.google.android.material.motion.a.q(!false);
        androidx.media3.common.util.j0.K(0);
    }

    public m0(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return this.a.equals(((m0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
