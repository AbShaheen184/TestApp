package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c cVar = new c(this.z, dVar, 0);
                cVar.y = obj;
                return cVar;
            case 1:
                c cVar2 = new c(this.z, dVar, 1);
                cVar2.y = obj;
                return cVar2;
            case 2:
                c cVar3 = new c(this.z, dVar, 2);
                cVar3.y = obj;
                return cVar3;
            case 3:
                c cVar4 = new c(this.z, dVar, 3);
                cVar4.y = obj;
                return cVar4;
            case 4:
                c cVar5 = new c(this.z, dVar, 4);
                cVar5.y = obj;
                return cVar5;
            case 5:
                c cVar6 = new c(this.z, dVar, 5);
                cVar6.y = obj;
                return cVar6;
            case 6:
                c cVar7 = new c(this.z, dVar, 6);
                cVar7.y = obj;
                return cVar7;
            case 7:
                c cVar8 = new c(this.z, dVar, 7);
                cVar8.y = obj;
                return cVar8;
            case 8:
                c cVar9 = new c(this.z, dVar, 8);
                cVar9.y = obj;
                return cVar9;
            case 9:
                c cVar10 = new c(this.z, dVar, 9);
                cVar10.y = obj;
                return cVar10;
            case 10:
                c cVar11 = new c(this.z, dVar, 10);
                cVar11.y = obj;
                return cVar11;
            case 11:
                c cVar12 = new c(this.z, dVar, 11);
                cVar12.y = obj;
                return cVar12;
            default:
                c cVar13 = new c(this.z, dVar, 12);
                cVar13.y = obj;
                return cVar13;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                c cVar = (c) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                cVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                c cVar2 = (c) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                cVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                c cVar3 = (c) create(aVar, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                cVar3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                c cVar4 = (c) create(aVar, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                cVar4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                c cVar5 = (c) create(aVar, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                cVar5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                c cVar6 = (c) create(aVar, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                cVar6.invokeSuspend(yVar6);
                return yVar6;
            case 6:
                c cVar7 = (c) create(aVar, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                cVar7.invokeSuspend(yVar7);
                return yVar7;
            case 7:
                c cVar8 = (c) create(aVar, dVar);
                kotlin.y yVar8 = kotlin.y.a;
                cVar8.invokeSuspend(yVar8);
                return yVar8;
            case 8:
                c cVar9 = (c) create(aVar, dVar);
                kotlin.y yVar9 = kotlin.y.a;
                cVar9.invokeSuspend(yVar9);
                return yVar9;
            case 9:
                c cVar10 = (c) create(aVar, dVar);
                kotlin.y yVar10 = kotlin.y.a;
                cVar10.invokeSuspend(yVar10);
                return yVar10;
            case 10:
                c cVar11 = (c) create(aVar, dVar);
                kotlin.y yVar11 = kotlin.y.a;
                cVar11.invokeSuspend(yVar11);
                return yVar11;
            case 11:
                c cVar12 = (c) create(aVar, dVar);
                kotlin.y yVar12 = kotlin.y.a;
                cVar12.invokeSuspend(yVar12);
                return yVar12;
            default:
                c cVar13 = (c) create(aVar, dVar);
                kotlin.y yVar13 = kotlin.y.a;
                cVar13.invokeSuspend(yVar13);
                return yVar13;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        boolean z = this.z;
        switch (i) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.j0, Boolean.valueOf(z));
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar = y1.j0;
                aVar2.e(y1.a1, Boolean.valueOf(z));
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar2 = y1.j0;
                aVar3.e(y1.D0, Boolean.valueOf(z));
                break;
            case 3:
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = y1.j0;
                aVar4.e(y1.m1, Boolean.valueOf(z));
                break;
            case 4:
                androidx.datastore.preferences.core.a aVar5 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar4 = y1.j0;
                aVar5.e(y1.n1, Boolean.valueOf(z));
                break;
            case 5:
                androidx.datastore.preferences.core.a aVar6 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar5 = y1.j0;
                aVar6.e(y1.R0, Boolean.valueOf(z));
                break;
            case 6:
                androidx.datastore.preferences.core.a aVar7 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar6 = y1.j0;
                aVar7.e(y1.P0, Boolean.valueOf(z));
                break;
            case 7:
                androidx.datastore.preferences.core.a aVar8 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar7 = y1.j0;
                aVar8.e(y1.N0, Boolean.valueOf(z));
                break;
            case 8:
                androidx.datastore.preferences.core.a aVar9 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar8 = y1.j0;
                aVar9.e(y1.l0, Boolean.valueOf(z));
                break;
            case 9:
                androidx.datastore.preferences.core.a aVar10 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar9 = y1.j0;
                aVar10.e(y1.n0, Boolean.valueOf(z));
                break;
            case 10:
                androidx.datastore.preferences.core.a aVar11 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar10 = y1.j0;
                aVar11.e(y1.m0, Boolean.valueOf(z));
                break;
            case 11:
                androidx.datastore.preferences.core.a aVar12 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar11 = y1.j0;
                aVar12.e(y1.E0, Boolean.valueOf(z));
                break;
            default:
                androidx.datastore.preferences.core.a aVar13 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar12 = y1.j0;
                aVar13.e(y1.X0, Boolean.valueOf(z));
                break;
        }
        return yVar;
    }
}
