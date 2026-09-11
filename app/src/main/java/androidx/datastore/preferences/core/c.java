package androidx.datastore.preferences.core;

import kotlin.jvm.functions.p;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.datastore.core.e {
    public final androidx.datastore.core.e a;

    public c(androidx.datastore.core.e eVar) {
        this.a = eVar;
    }

    @Override // androidx.datastore.core.e
    public final Object a(p pVar, kotlin.coroutines.d dVar) {
        return this.a.a(new b(pVar, null, 0), dVar);
    }

    @Override // androidx.datastore.core.e
    public final Flow b() {
        return this.a.b();
    }
}
