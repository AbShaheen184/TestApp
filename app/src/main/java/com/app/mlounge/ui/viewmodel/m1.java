package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.anime.AnimeSubtitleStore;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ ChqStream A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ r1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(r1 r1Var, ChqStream chqStream, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = r1Var;
        this.A = chqStream;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new m1(this.z, this.A, dVar, 0);
            case 1:
                return new m1(this.z, this.A, dVar, 1);
            default:
                return new m1(this.z, this.A, dVar, 2);
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
        return ((m1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        String strL;
        Object objB;
        switch (this.e) {
            case 0:
                ChqStream chqStream = this.A;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        objE = obj;
                    } else {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                kotlin.a.e(obj);
                r1 r1Var = this.z;
                this.y = 1;
                objE = r1.e(r1Var, chqStream, this);
                if (objE == aVar) {
                    return aVar;
                }
                if (((Boolean) objE).booleanValue()) {
                    return chqStream;
                }
                return null;
            case 1:
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    if (kotlin.jvm.internal.l.a(this.z.r, "anime")) {
                        AnimeSubtitleStore animeSubtitleStore = AnimeSubtitleStore.INSTANCE;
                        List listB = this.A.b();
                        if (listB == null) {
                            listB = this.z.g;
                        }
                        animeSubtitleStore.set(listB);
                    }
                    String str = this.z.r;
                    if (kotlin.jvm.internal.l.a(str, "anime")) {
                        String str2 = this.z.s;
                        str2.getClass();
                        strL = "anime:".concat(str2);
                    } else {
                        boolean zA = kotlin.jvm.internal.l.a(str, "tv");
                        r1 r1Var2 = this.z;
                        int i3 = r1Var2.t;
                        if (zA) {
                            int i4 = r1Var2.v;
                            int i5 = r1Var2.w;
                            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", i3, ":", i4);
                            sbW.append(i5);
                            strL = sbW.toString();
                        } else {
                            strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "movie:");
                        }
                    }
                    String str3 = strL;
                    MutableSharedFlow mutableSharedFlow = this.z.p;
                    String strM = this.A.m();
                    String str4 = this.z.u;
                    Map mapE = this.A.e();
                    String strK = this.A.k();
                    if (strK == null) {
                        strK = this.A.l();
                    }
                    r1 r1Var3 = this.z;
                    j0 j0Var = new j0(strM, str4, mapE, strK, r1Var3.t, r1Var3.r, r1Var3.v, r1Var3.w, str3);
                    this.y = 1;
                    if (mutableSharedFlow.emit(j0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                r1 r1Var4 = this.z;
                MutableStateFlow mutableStateFlow = r1Var4.n;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlin.a.e(obj);
                        objB = obj;
                    } else {
                        if (i6 != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                objB = r1Var4.c.b(this);
                if (objB == aVar3) {
                    return aVar3;
                }
                List list = (List) objB;
                if (list.isEmpty()) {
                    mutableStateFlow.setValue(new m("A debrid service (Premiumize, TorBox, AllDebrid, or Real-Debrid) is required to use torrent sources. Log in via Services.", null, null, null, 61));
                } else if (list.size() == 1) {
                    ChqStream chqStream2 = this.A;
                    l lVar = (l) kotlin.collections.o.K(list);
                    this.y = 2;
                    if (r1.k(r1Var4, chqStream2, lVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    mutableStateFlow.setValue(new m(null, null, this.A, list, 7));
                }
                return kotlin.y.a;
        }
    }
}
