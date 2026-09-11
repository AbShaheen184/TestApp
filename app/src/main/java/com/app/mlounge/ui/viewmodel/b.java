package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerVideo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ com.app.mlounge.data.repository.a A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, com.app.mlounge.data.repository.a aVar, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = cVar;
        this.A = aVar;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b(this.z, this.A, this.B, dVar, 0);
            default:
                return new b(this.z, this.A, this.B, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((b) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List listC;
        Integer numA;
        switch (this.e) {
            case 0:
                c cVar = this.z;
                MutableStateFlow mutableStateFlow = cVar.k;
                int i = this.y;
                boolean z = true;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow.setValue(Boolean.TRUE);
                        com.app.mlounge.data.repository.r rVar = cVar.b;
                        com.app.mlounge.data.repository.a aVar = this.A;
                        String str = this.B;
                        int i2 = cVar.E + 1;
                        this.y = 1;
                        obj = com.app.mlounge.data.repository.r.d(rVar, aVar, str, i2, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    EpornerSearchDetails epornerSearchDetails = (EpornerSearchDetails) obj;
                    if (epornerSearchDetails == null || (listC = epornerSearchDetails.c()) == null) {
                        listC = kotlin.collections.u.e;
                    }
                    MutableStateFlow mutableStateFlow2 = cVar.e;
                    ArrayList arrayListX = kotlin.collections.o.X((Collection) mutableStateFlow2.getValue(), listC);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListX) {
                        if (hashSet.add(((EpornerVideo) obj2).b())) {
                            arrayList.add(obj2);
                        }
                    }
                    mutableStateFlow2.setValue(arrayList);
                    cVar.E = (epornerSearchDetails == null || (numA = epornerSearchDetails.a()) == null) ? cVar.E + 1 : numA.intValue();
                    Integer numB = epornerSearchDetails != null ? epornerSearchDetails.b() : null;
                    if (numB != null) {
                        if (cVar.E >= numB.intValue()) {
                            z = false;
                        }
                    } else if (listC.size() < 20) {
                        z = false;
                    }
                    cVar.F = z;
                    break;
                } catch (Exception e) {
                    com.app.mlounge.util.a.b("AdultViewModel", "loadMore failed", e);
                    break;
                } finally {
                    mutableStateFlow.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                c cVar2 = this.z;
                MutableStateFlow mutableStateFlow3 = cVar2.m;
                MutableStateFlow mutableStateFlow4 = cVar2.i;
                int i3 = this.y;
                String str2 = this.B;
                boolean z2 = true;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow3.setValue(null);
                        com.app.mlounge.data.repository.r rVar2 = cVar2.b;
                        com.app.mlounge.data.repository.a aVar3 = this.A;
                        this.y = 1;
                        obj = com.app.mlounge.data.repository.r.d(rVar2, aVar3, str2, 1, this);
                        kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i3 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    EpornerSearchDetails epornerSearchDetails2 = (EpornerSearchDetails) obj;
                    if (epornerSearchDetails2 != null) {
                        List listC2 = epornerSearchDetails2.c();
                        if (listC2 == null) {
                            listC2 = kotlin.collections.u.e;
                        }
                        if (listC2.isEmpty()) {
                            mutableStateFlow3.setValue("No videos found for \"" + str2 + "\" — try a different category");
                        }
                        cVar2.e.setValue(listC2);
                        Integer numA2 = epornerSearchDetails2.a();
                        cVar2.E = numA2 != null ? numA2.intValue() : 1;
                        Integer numB2 = epornerSearchDetails2.b();
                        if (numB2 != null) {
                            if (cVar2.E >= numB2.intValue()) {
                                z2 = false;
                            }
                        } else if (listC2.size() < 20) {
                            z2 = false;
                        }
                        cVar2.F = z2;
                    } else {
                        mutableStateFlow3.setValue("Adult source is currently unavailable — check your internet connection");
                    }
                } catch (Exception e2) {
                    com.app.mlounge.util.a.b("AdultViewModel", "loadVideos failed", e2);
                    mutableStateFlow3.setValue("Failed to load — API returned an unexpected response");
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
