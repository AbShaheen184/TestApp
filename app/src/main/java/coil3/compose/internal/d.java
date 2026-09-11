package coil3.compose.internal;

import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {
    public final i e;

    public d(i iVar) {
        this.e = iVar;
    }

    public final boolean equals(Object obj) {
        return l.a(this.e, obj);
    }

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, p pVar) {
        return this.e.fold(obj, pVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return this.e.get(hVar);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // kotlin.coroutines.i
    public final i minusKey(kotlin.coroutines.h hVar) {
        i iVarMinusKey = this.e.minusKey(hVar);
        int i = h.b;
        CoroutineDispatcher.Key key = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) iVarMinusKey.get(key);
        if ((coroutineDispatcher instanceof e) && !coroutineDispatcher.equals(coroutineDispatcher2)) {
            ((e) coroutineDispatcher).y = 0;
        }
        return new d(iVarMinusKey);
    }

    @Override // kotlin.coroutines.i
    public final i plus(i iVar) {
        i iVarPlus = this.e.plus(iVar);
        int i = h.b;
        CoroutineDispatcher.Key key = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) iVarPlus.get(key);
        if ((coroutineDispatcher instanceof e) && !coroutineDispatcher.equals(coroutineDispatcher2)) {
            ((e) coroutineDispatcher).y = 0;
        }
        return new d(iVarPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.e + ")";
    }
}
