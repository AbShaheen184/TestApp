package kotlin.coroutines;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements h {
    private final l safeCast;
    private final h topmostKey;

    public b(h hVar, l lVar) {
        hVar.getClass();
        this.safeCast = lVar;
        this.topmostKey = hVar instanceof b ? ((b) hVar).topmostKey : hVar;
    }

    public final boolean isSubKey$kotlin_stdlib(h hVar) {
        hVar.getClass();
        return hVar == this || this.topmostKey == hVar;
    }

    public final Object tryCast$kotlin_stdlib(g gVar) {
        gVar.getClass();
        return (g) this.safeCast.invoke(gVar);
    }
}
