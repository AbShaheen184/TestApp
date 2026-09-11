package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import java.util.Collection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(h0 h0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g0(this.z, dVar, 0);
            default:
                return new g0(this.z, dVar, 1);
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
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                h0 h0Var = this.z;
                MutableStateFlow mutableStateFlow = h0Var.n;
                MutableStateFlow mutableStateFlow2 = h0Var.h;
                int i = this.y;
                boolean z = true;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        String strA = ((MusicGenre) mutableStateFlow.getValue()).a();
                        String strB = ((MusicGenre) mutableStateFlow.getValue()).b();
                        this.y = 1;
                        obj = h0.e(h0Var, strA, strB, null, this);
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
                    MusicPageResponse musicPageResponse = (MusicPageResponse) obj;
                    h0Var.f.setValue(musicPageResponse.a());
                    h0Var.l = musicPageResponse.b();
                    if (musicPageResponse.b() == null) {
                        z = false;
                    }
                    h0Var.m = z;
                    break;
                } catch (Exception e) {
                    com.app.mlounge.util.a.b("MusicVM", "loadHome failed", e);
                    break;
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                h0 h0Var2 = this.z;
                MutableStateFlow mutableStateFlow3 = h0Var2.n;
                MutableStateFlow mutableStateFlow4 = h0Var2.j;
                int i2 = this.y;
                boolean z2 = true;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        String strA2 = ((MusicGenre) mutableStateFlow3.getValue()).a();
                        String strB2 = ((MusicGenre) mutableStateFlow3.getValue()).b();
                        Object obj2 = h0Var2.l;
                        this.y = 1;
                        obj = h0.e(h0Var2, strA2, strB2, obj2, this);
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
                    MusicPageResponse musicPageResponse2 = (MusicPageResponse) obj;
                    if (musicPageResponse2.a().isEmpty()) {
                        h0Var2.m = false;
                    } else {
                        MutableStateFlow mutableStateFlow5 = h0Var2.f;
                        mutableStateFlow5.setValue(kotlin.collections.o.X((Collection) mutableStateFlow5.getValue(), musicPageResponse2.a()));
                        h0Var2.l = musicPageResponse2.b();
                        if (musicPageResponse2.b() == null) {
                            z2 = false;
                        }
                        h0Var2.m = z2;
                    }
                } catch (Exception e2) {
                    com.app.mlounge.util.a.b("MusicVM", "loadMore failed", e2);
                    h0Var2.m = false;
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
