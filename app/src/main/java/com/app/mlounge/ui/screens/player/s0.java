package com.app.mlounge.ui.screens.player;

import com.app.mlounge.data.remote.api.TmdbApi;
import com.app.mlounge.data.remote.model.TmdbCombinedCreditsResponse;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i, com.google.common.util.concurrent.g0 g0Var, com.i4studio.subslib.model.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.A = g0Var;
        this.B = bVar;
        this.z = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new s0(this.z, (com.google.common.util.concurrent.g0) this.A, (com.i4studio.subslib.model.b) this.B, dVar);
            case 1:
                return new s0((com.app.mlounge.ui.viewmodel.e0) this.B, this.z, dVar, 1);
            default:
                return new s0((com.app.mlounge.ui.viewmodel.i0) this.B, this.z, dVar, 2);
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
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: all -> 0x0020, Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, all -> 0x0020, blocks: (B:8:0x001c, B:23:0x0060, B:25:0x006a, B:26:0x006c, B:14:0x0030, B:20:0x0050, B:17:0x0041), top: B:79:0x0016 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        MutableStateFlow mutableStateFlow;
        Exception exc;
        MutableStateFlow mutableStateFlow2;
        List listA;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.google.common.util.concurrent.g0 g0Var = (com.google.common.util.concurrent.g0) this.A;
                com.i4studio.subslib.model.b bVar = (com.i4studio.subslib.model.b) this.B;
                this.y = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.download.e(this.z, g0Var, bVar, null), this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objWithContext == aVar ? aVar : objWithContext;
            case 1:
                com.app.mlounge.ui.viewmodel.e0 e0Var = (com.app.mlounge.ui.viewmodel.e0) this.B;
                MutableStateFlow mutableStateFlow3 = e0Var.D;
                int i2 = this.y;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow3.setValue(Boolean.TRUE);
                        try {
                            mutableStateFlow = e0Var.B;
                            com.app.mlounge.data.repository.j0 j0Var = e0Var.b;
                            int i3 = this.z;
                            this.A = mutableStateFlow;
                            this.y = 1;
                            try {
                                obj = TmdbApi.getMovieDetail$default(j0Var.a, i3, null, this, 2, null);
                                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                e0Var.o.setValue(exc.getMessage());
                            }
                        } catch (Exception e2) {
                            e = e2;
                            exc = e;
                            e0Var.o.setValue(exc.getMessage());
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            mutableStateFlow3.setValue(Boolean.FALSE);
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = (MutableStateFlow) this.A;
                        try {
                            kotlin.a.e(obj);
                        } catch (Exception e3) {
                            exc = e3;
                            e0Var.o.setValue(exc.getMessage());
                        } catch (Throwable th3) {
                            th = th3;
                            mutableStateFlow3.setValue(Boolean.FALSE);
                            throw th;
                        }
                    }
                    mutableStateFlow.setValue(obj);
                    mutableStateFlow3.setValue(Boolean.FALSE);
                    return kotlin.y.a;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            default:
                com.app.mlounge.ui.viewmodel.i0 i0Var = (com.app.mlounge.ui.viewmodel.i0) this.B;
                com.app.mlounge.data.repository.j0 j0Var2 = i0Var.b;
                MutableStateFlow mutableStateFlow4 = i0Var.g;
                int i4 = this.y;
                int i5 = this.z;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            mutableStateFlow2 = (MutableStateFlow) this.A;
                            kotlin.a.e(obj);
                        } else {
                            if (i4 != 2) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.a.e(obj);
                        }
                        MutableStateFlow mutableStateFlow5 = i0Var.e;
                        listA = ((TmdbCombinedCreditsResponse) obj).a();
                        if (listA == null) {
                            listA = kotlin.collections.u.e;
                        }
                        mutableStateFlow5.setValue(kotlin.sequences.k.r(new kotlin.io.h(3, new kotlin.io.h(1, new kotlin.collections.s(listA, 0), new j0(8)), new androidx.constraintlayout.core.e(19))));
                        return kotlin.y.a;
                    }
                    kotlin.a.e(obj);
                    mutableStateFlow4.setValue(Boolean.TRUE);
                    i0Var.i.setValue(null);
                    mutableStateFlow2 = i0Var.c;
                    this.A = mutableStateFlow2;
                    this.y = 1;
                    obj = j0Var2.a.getPersonDetail(i5, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    mutableStateFlow2.setValue(obj);
                    this.A = null;
                    this.y = 2;
                    obj = j0Var2.a.getPersonCredits(i5, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    MutableStateFlow mutableStateFlow6 = i0Var.e;
                    listA = ((TmdbCombinedCreditsResponse) obj).a();
                    if (listA == null) {
                        listA = kotlin.collections.u.e;
                    }
                    mutableStateFlow6.setValue(kotlin.sequences.k.r(new kotlin.io.h(3, new kotlin.io.h(1, new kotlin.collections.s(listA, 0), new j0(8)), new androidx.constraintlayout.core.e(19))));
                    break;
                } catch (Exception unused) {
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(androidx.lifecycle.q0 q0Var, int i, kotlin.coroutines.d dVar, int i2) {
        super(2, dVar);
        this.e = i2;
        this.B = q0Var;
        this.z = i;
    }
}
