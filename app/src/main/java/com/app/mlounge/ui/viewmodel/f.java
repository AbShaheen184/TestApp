package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.HiAnimeCategoryData;
import com.app.mlounge.data.remote.model.HiAnimeGenresData;
import com.app.mlounge.data.remote.model.HiAnimeResponse;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(this.z, dVar, 0);
            default:
                return new f(this.z, dVar, 1);
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
        return ((f) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List listA;
        Boolean boolB;
        List listA2;
        switch (this.e) {
            case 0:
                g gVar = this.z;
                MutableStateFlow mutableStateFlow = gVar.j;
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow.setValue(Boolean.TRUE);
                        String str = (String) gVar.p.getValue();
                        String str2 = (String) gVar.r.getValue();
                        com.app.mlounge.data.repository.r rVar = gVar.b;
                        this.y = 1;
                        rVar.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.animation.b0(1, rVar, str, str2, (kotlin.coroutines.d) null), this);
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
                    HiAnimeResponse hiAnimeResponse = (HiAnimeResponse) obj;
                    MutableStateFlow mutableStateFlow2 = gVar.f;
                    HiAnimeCategoryData hiAnimeCategoryData = (HiAnimeCategoryData) hiAnimeResponse.a();
                    if (hiAnimeCategoryData == null || (listA = hiAnimeCategoryData.a()) == null) {
                        listA = kotlin.collections.u.e;
                    }
                    mutableStateFlow2.setValue(listA);
                    HiAnimeCategoryData hiAnimeCategoryData2 = (HiAnimeCategoryData) hiAnimeResponse.a();
                    gVar.H = (hiAnimeCategoryData2 == null || (boolB = hiAnimeCategoryData2.b()) == null) ? false : boolB.booleanValue();
                    break;
                } catch (Exception e) {
                    MutableStateFlow mutableStateFlow3 = gVar.n;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to load anime";
                    }
                    mutableStateFlow3.setValue(message);
                } finally {
                    mutableStateFlow.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                g gVar2 = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        com.app.mlounge.data.repository.r rVar2 = gVar2.b;
                        this.y = 1;
                        rVar2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new androidx.compose.foundation.text.selection.q(rVar2, null, 3), this);
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
                    MutableStateFlow mutableStateFlow4 = gVar2.h;
                    HiAnimeGenresData hiAnimeGenresData = (HiAnimeGenresData) ((HiAnimeResponse) obj).a();
                    if (hiAnimeGenresData == null || (listA2 = hiAnimeGenresData.a()) == null) {
                        listA2 = kotlin.collections.u.e;
                    }
                    mutableStateFlow4.setValue(listA2);
                    break;
                } catch (Exception unused) {
                }
                return kotlin.y.a;
        }
    }
}
