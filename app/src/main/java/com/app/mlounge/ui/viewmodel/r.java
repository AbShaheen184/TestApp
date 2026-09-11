package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.GameStatsResponse;
import com.app.mlounge.data.remote.model.GamesResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new r(this.z, dVar, 0);
            case 1:
                return new r(this.z, dVar, 1);
            default:
                return new r(this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((r) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Set setKeySet;
        Set setEntrySet;
        switch (this.e) {
            case 0:
                s sVar = this.z;
                MutableStateFlow mutableStateFlow = sVar.k;
                MutableStateFlow mutableStateFlow2 = sVar.g;
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        mutableStateFlow.setValue(null);
                        com.app.mlounge.data.repository.r rVar = sVar.b;
                        String strA = ((GamePlatform) sVar.u.getValue()).a();
                        String str = (String) sVar.C.getValue();
                        String str2 = (String) sVar.E.getValue();
                        this.y = 1;
                        rVar.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.download.e(rVar, strA, 1, str, str2, null), this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GamesResponse gamesResponse = (GamesResponse) obj;
                    MutableStateFlow mutableStateFlow3 = sVar.e;
                    List listA = gamesResponse.a();
                    if (listA == null) {
                        listA = kotlin.collections.u.e;
                    }
                    mutableStateFlow3.setValue(listA);
                    sVar.N = gamesResponse.b();
                    sVar.M = 1;
                    break;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to load games";
                    }
                    mutableStateFlow.setValue(message);
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 1:
                s sVar2 = this.z;
                MutableStateFlow mutableStateFlow4 = sVar2.e;
                MutableStateFlow mutableStateFlow5 = sVar2.i;
                int i2 = this.y;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow5.setValue(Boolean.TRUE);
                        com.app.mlounge.data.repository.r rVar2 = sVar2.b;
                        String strA2 = ((GamePlatform) sVar2.u.getValue()).a();
                        int i3 = sVar2.M + 1;
                        String str3 = (String) sVar2.C.getValue();
                        String str4 = (String) sVar2.E.getValue();
                        this.y = 1;
                        rVar2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.download.e(rVar2, strA2, i3, str3, str4, null), this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GamesResponse gamesResponse2 = (GamesResponse) obj;
                    Iterable iterable = (Iterable) mutableStateFlow4.getValue();
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Game) it.next()).c());
                    }
                    Set setO0 = kotlin.collections.o.o0(arrayList2);
                    List listA2 = gamesResponse2.a();
                    if (listA2 == null) {
                        listA2 = kotlin.collections.u.e;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listA2) {
                        if (!setO0.contains(((Game) obj2).c())) {
                            arrayList3.add(obj2);
                        }
                    }
                    mutableStateFlow4.setValue(kotlin.collections.o.X((Collection) mutableStateFlow4.getValue(), arrayList3));
                    sVar2.M++;
                    break;
                } catch (Exception unused) {
                } finally {
                    mutableStateFlow5.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                int i4 = this.y;
                s sVar3 = this.z;
                try {
                    if (i4 == 0) {
                        kotlin.a.e(obj);
                        com.app.mlounge.data.repository.r rVar3 = sVar3.b;
                        String strA3 = ((GamePlatform) sVar3.u.getValue()).a();
                        this.y = 1;
                        rVar3.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.f(rVar3, strA3, null), this);
                        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i4 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GameStatsResponse gameStatsResponse = (GameStatsResponse) obj;
                    sVar3.w.setValue(gameStatsResponse);
                    MutableStateFlow mutableStateFlow6 = sVar3.y;
                    Map mapB = gameStatsResponse.b();
                    List listK0 = kotlin.collections.u.e;
                    if (mapB == null || (setEntrySet = mapB.entrySet()) == null) {
                        arrayList = listK0;
                    } else {
                        List listF0 = kotlin.collections.o.f0(setEntrySet, new androidx.constraintlayout.core.e(17));
                        arrayList = new ArrayList(kotlin.collections.p.y(listF0, 10));
                        Iterator it2 = listF0.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
                        }
                    }
                    mutableStateFlow6.setValue(arrayList);
                    MutableStateFlow mutableStateFlow7 = sVar3.A;
                    Map mapA = gameStatsResponse.a();
                    if (mapA != null && (setKeySet = mapA.keySet()) != null) {
                        listK0 = kotlin.collections.o.k0(kotlin.collections.o.f0(setKeySet, kotlin.comparisons.a.z));
                    }
                    mutableStateFlow7.setValue(listK0);
                    break;
                } catch (Exception unused2) {
                }
                return kotlin.y.a;
        }
    }
}
