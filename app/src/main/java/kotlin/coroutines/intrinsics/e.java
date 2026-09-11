package kotlin.coroutines.intrinsics;

import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {
    public int e;
    public final /* synthetic */ p y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.coroutines.d dVar, i iVar, p pVar, Object obj) {
        super(dVar, iVar);
        this.y = pVar;
        this.z = obj;
        dVar.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            kotlin.a.e(obj);
            return obj;
        }
        this.e = 1;
        kotlin.a.e(obj);
        p pVar = this.y;
        pVar.getClass();
        c0.c(2, pVar);
        return pVar.invoke(this.z, this);
    }
}
