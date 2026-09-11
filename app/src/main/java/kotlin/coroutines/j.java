package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {
    public static final j e = new j();

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, p pVar) {
        pVar.getClass();
        return obj;
    }

    @Override // kotlin.coroutines.i
    public final g get(h hVar) {
        hVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.i
    public final i minusKey(h hVar) {
        hVar.getClass();
        return this;
    }

    @Override // kotlin.coroutines.i
    public final i plus(i iVar) {
        iVar.getClass();
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
