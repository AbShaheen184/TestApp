package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = str;
        this.A = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                f fVar = new f(this.z, this.A, dVar, 0);
                fVar.y = obj;
                return fVar;
            case 1:
                f fVar2 = new f(this.z, this.A, dVar, 1);
                fVar2.y = obj;
                return fVar2;
            case 2:
                f fVar3 = new f(this.z, this.A, dVar, 2);
                fVar3.y = obj;
                return fVar3;
            default:
                f fVar4 = new f(this.z, this.A, dVar, 3);
                fVar4.y = obj;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                f fVar = (f) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                fVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                f fVar2 = (f) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                fVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                f fVar3 = (f) create(aVar, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                fVar3.invokeSuspend(yVar3);
                return yVar3;
            default:
                f fVar4 = (f) create(aVar, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                fVar4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        String str = this.A;
        String str2 = this.z;
        switch (i) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 == null) {
                    aVar.d(y1.w0);
                } else {
                    aVar.e(y1.w0, str2);
                }
                if (str != null) {
                    aVar.e(y1.x0, str);
                } else {
                    aVar.d(y1.x0);
                }
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 != null) {
                    aVar2.e(y1.V0, str2);
                    androidx.datastore.preferences.core.d dVar = y1.W0;
                    if (str == null) {
                        str = str2;
                    }
                    aVar2.e(dVar, str);
                } else {
                    aVar2.d(y1.V0);
                    aVar2.d(y1.W0);
                }
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 != null) {
                    aVar3.e(y1.K0, str2);
                    androidx.datastore.preferences.core.d dVar2 = y1.L0;
                    if (str == null) {
                        str = str2;
                    }
                    aVar3.e(dVar2, str);
                } else {
                    aVar3.d(y1.K0);
                    aVar3.d(y1.L0);
                }
                break;
            default:
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = y1.j0;
                aVar4.e(y1.u0, str2);
                aVar4.e(y1.v0, str);
                break;
        }
        return yVar;
    }
}
