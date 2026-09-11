package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object e;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = str;
        this.z = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        n nVar = new n(this.y, this.z, dVar);
        nVar.e = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        nVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.e;
        kotlin.a.e(obj);
        String str = this.y;
        if (str == null) {
            aVar.d(y1.r0);
            aVar.d(y1.s0);
            aVar.d(y1.t0);
            aVar.d(y1.u0);
            aVar.d(y1.v0);
        } else {
            aVar.e(y1.r0, str);
            aVar.e(y1.s0, new Long(this.z));
        }
        return kotlin.y.a;
    }
}
