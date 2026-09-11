package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ d e;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, kotlin.coroutines.d dVar2) {
        super(1, dVar2);
        this.e = dVar;
        this.y = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new c(this.e, this.y, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        c cVar = (c) create((kotlin.coroutines.d) obj);
        kotlin.y yVar = kotlin.y.a;
        cVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        d dVar = this.e;
        d.b(dVar);
        Object objA = d.a(dVar, this.y);
        dVar.c.y.setValue(objA);
        dVar.e.setValue(objA);
        return kotlin.y.a;
    }
}
