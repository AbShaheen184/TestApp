package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements w2 {
    public final h1 a;

    public i0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // androidx.compose.runtime.w2
    public final Object a(androidx.compose.runtime.internal.j jVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.a.equals(((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
