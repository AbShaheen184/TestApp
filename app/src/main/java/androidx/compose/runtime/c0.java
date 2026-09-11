package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements w2 {
    public final kotlin.jvm.functions.l a;

    public c0(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
    }

    @Override // androidx.compose.runtime.w2
    public final Object a(androidx.compose.runtime.internal.j jVar) {
        return this.a.invoke(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a.equals(((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
