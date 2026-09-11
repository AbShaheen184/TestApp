package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final p0 b = new p0(63, null);
    public final kotlin.jvm.functions.l a;

    public p0(int i, kotlin.jvm.functions.l lVar) {
        this.a = (i & 16) != 0 ? null : lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.a == ((p0) obj).a;
    }

    public final int hashCode() {
        kotlin.jvm.functions.l lVar = this.a;
        return (lVar != null ? lVar.hashCode() : 0) * 31;
    }
}
