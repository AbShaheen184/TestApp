package kotlin.coroutines.intrinsics;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.g {
    public int e;
    public final /* synthetic */ l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.coroutines.d dVar, l lVar) {
        super(dVar);
        this.y = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            this.e = 1;
            kotlin.a.e(obj);
            l lVar = this.y;
            c0.c(1, lVar);
            return lVar.invoke(this);
        }
        if (i != 1) {
            net.luminis.tls.engine.impl.c.r("This coroutine had already completed");
            return null;
        }
        this.e = 2;
        kotlin.a.e(obj);
        return obj;
    }
}
