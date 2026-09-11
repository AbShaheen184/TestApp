package androidx.activity.compose;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.internal.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.v vVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.e = vVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.e, (kotlin.coroutines.d) obj3);
        y yVar = y.a;
        oVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        this.e.e = true;
        return y.a;
    }
}
