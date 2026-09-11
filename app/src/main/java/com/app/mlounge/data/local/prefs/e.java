package com.app.mlounge.data.local.prefs;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ LinkedHashSet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LinkedHashSet linkedHashSet, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = linkedHashSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                e eVar = new e(this.z, dVar, 0);
                eVar.y = obj;
                return eVar;
            default:
                e eVar2 = new e(this.z, dVar, 1);
                eVar2.y = obj;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                e eVar = (e) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                eVar.invokeSuspend(yVar);
                return yVar;
            default:
                e eVar2 = (e) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                eVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.Y0, this.z);
                break;
            default:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar2.e(y1.B0, this.z);
                break;
        }
        return kotlin.y.a;
    }
}
