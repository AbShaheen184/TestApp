package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object e;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(float f, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        k kVar = new k(this.y, dVar);
        kVar.e = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        kVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.e;
        kotlin.a.e(obj);
        androidx.datastore.preferences.core.d dVar = y1.j0;
        aVar.e(y1.O0, new Float(this.y));
        return kotlin.y.a;
    }
}
