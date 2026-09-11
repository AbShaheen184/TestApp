package androidx.room.coroutines;

import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {
    public final kotlin.o A = new kotlin.o(new d(this, 1));
    public final androidx.sqlite.b e;
    public final String y;
    public final kotlin.jvm.internal.j z;

    /* JADX WARN: Multi-variable type inference failed */
    public s(androidx.sqlite.b bVar, String str, kotlin.jvm.functions.p pVar) {
        this.e = bVar;
        this.y = str;
        this.z = (kotlin.jvm.internal.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.coroutines.b
    public final Object D(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar = (r) cVar.getContext().get(r.y);
        q qVar = rVar != null ? rVar.e : null;
        if (qVar != null) {
            return pVar.invoke(qVar, cVar);
        }
        q qVar2 = new q(this.z, (androidx.sqlite.a) this.A.getValue());
        return BuildersKt.withContext(new r(qVar2), new f(pVar, qVar2, (kotlin.coroutines.d) null), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        kotlin.o oVar = this.A;
        if (oVar.a()) {
            ((androidx.sqlite.a) oVar.getValue()).close();
        }
    }
}
