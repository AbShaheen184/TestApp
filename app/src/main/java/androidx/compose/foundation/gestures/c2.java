package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c2 c2Var = new c2(this.z, dVar, 0);
                c2Var.y = obj;
                return c2Var;
            case 1:
                c2 c2Var2 = new c2(this.z, dVar, 1);
                c2Var2.y = obj;
                return c2Var2;
            case 2:
                c2 c2Var3 = new c2(this.z, dVar, 2);
                c2Var3.y = obj;
                return c2Var3;
            default:
                c2 c2Var4 = new c2(this.z, dVar, 3);
                c2Var4.y = obj;
                return c2Var4;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                c2 c2Var = (c2) create((l2) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                c2Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                c2 c2Var2 = (c2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                c2Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                c2 c2Var3 = (c2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar3 = kotlin.y.a;
                c2Var3.invokeSuspend(yVar3);
                return yVar3;
            default:
                c2 c2Var4 = (c2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar4 = kotlin.y.a;
                c2Var4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        long j = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                m2 m2Var = ((l2) this.y).a;
                m2Var.c(m2Var.k, j, 1);
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar = com.app.mlounge.data.local.prefs.y1.j0;
                aVar.e(com.app.mlounge.data.local.prefs.y1.l1, new Long(j));
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar2 = com.app.mlounge.data.local.prefs.y1.j0;
                aVar2.e(com.app.mlounge.data.local.prefs.y1.F0, new Long(j));
                break;
            default:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = com.app.mlounge.data.local.prefs.y1.j0;
                aVar3.e(com.app.mlounge.data.local.prefs.y1.A0, new Long(j));
                break;
        }
        return yVar;
    }
}
