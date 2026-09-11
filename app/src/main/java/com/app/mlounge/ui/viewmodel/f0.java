package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ h0 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public MutableStateFlow y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = h0Var;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f0(this.A, this.B, dVar, 0);
            default:
                return new f0(this.A, this.B, dVar, 1);
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
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        h0 h0Var = this.A;
        String str = this.B;
        switch (i) {
            case 0:
                MutableStateFlow mutableStateFlow3 = h0Var.h;
                int i2 = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow3.setValue(Boolean.TRUE);
                        mutableStateFlow = h0Var.x;
                        com.app.mlounge.data.repository.a0 a0Var = h0Var.c;
                        this.y = mutableStateFlow;
                        this.z = 1;
                        a0Var.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.y(a0Var, str, null, 0), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = this.y;
                        kotlin.a.e(obj);
                    }
                    mutableStateFlow.setValue(obj);
                    break;
                } catch (Exception e) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("MusicVM", "loadAlbumDetail failed for ".concat(str), e);
                    break;
                } finally {
                    mutableStateFlow3.setValue(Boolean.FALSE);
                }
                return yVar;
            default:
                MutableStateFlow mutableStateFlow4 = h0Var.h;
                int i3 = this.z;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow2 = h0Var.z;
                        com.app.mlounge.data.repository.a0 a0Var2 = h0Var.c;
                        this.y = mutableStateFlow2;
                        this.z = 1;
                        a0Var2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.y(a0Var2, str, null, 1), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow2 = this.y;
                        kotlin.a.e(obj);
                    }
                    mutableStateFlow2.setValue(obj);
                    break;
                } catch (Exception e2) {
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("MusicVM", "loadArtistDetail failed for ".concat(str), e2);
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return yVar;
        }
    }
}
