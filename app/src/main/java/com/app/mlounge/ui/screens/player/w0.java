package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.gestures.m2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public long A;
    public /* synthetic */ long B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(z0 z0Var, long j, long j2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = z0Var;
        this.A = j;
        this.B = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w0((z0) this.z, this.A, this.B, dVar, 0);
            case 1:
                return new w0((z0) this.z, this.A, this.B, dVar, 1);
            default:
                w0 w0Var = new w0((m2) this.z, dVar);
                w0Var.B = ((androidx.compose.ui.unit.q) obj).a;
                return w0Var;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((w0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((w0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                long j = ((androidx.compose.ui.unit.q) obj).a;
                w0 w0Var = new w0((m2) this.z, (kotlin.coroutines.d) obj2);
                w0Var.B = j;
                return w0Var.invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long jD;
        long j2;
        long j3;
        long j4;
        long j5;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    z0 z0Var = (z0) this.z;
                    com.app.mlounge.data.local.dao.m mVar = z0Var.b;
                    com.app.mlounge.data.local.entity.e eVar = new com.app.mlounge.data.local.entity.e(this.A, this.B, z0Var.m);
                    this.y = 1;
                    Object objA = mVar.a(eVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    z0 z0Var2 = (z0) this.z;
                    com.app.mlounge.data.local.dao.m mVar2 = z0Var2.b;
                    com.app.mlounge.data.local.entity.e eVar2 = new com.app.mlounge.data.local.entity.e(this.A, this.B, z0Var2.m);
                    this.y = 1;
                    Object objA2 = mVar2.a(eVar2, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objA2 == aVar2) {
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
                m2 m2Var = (m2) this.z;
                int i3 = this.y;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    j = this.B;
                    androidx.compose.ui.input.nestedscroll.d dVar = m2Var.f;
                    this.B = j;
                    this.y = 1;
                    obj = dVar.b(j, this);
                    if (obj != aVar3) {
                        jD = androidx.compose.ui.unit.q.d(j, ((androidx.compose.ui.unit.q) obj).a);
                        this.B = j;
                        this.A = jD;
                        this.y = 2;
                        obj = m2Var.a(jD, this);
                        if (obj != aVar3) {
                            j2 = jD;
                            j3 = ((androidx.compose.ui.unit.q) obj).a;
                            androidx.compose.ui.input.nestedscroll.d dVar2 = m2Var.f;
                            long jD2 = androidx.compose.ui.unit.q.d(j2, j3);
                            this.B = j;
                            this.A = j3;
                            this.y = 3;
                            obj = dVar2.a(jD2, j3, this);
                            if (obj == aVar3) {
                                return aVar3;
                            }
                            j4 = j;
                            j5 = j3;
                        }
                    }
                    return aVar3;
                }
                if (i3 == 1) {
                    j = this.B;
                    kotlin.a.e(obj);
                    jD = androidx.compose.ui.unit.q.d(j, ((androidx.compose.ui.unit.q) obj).a);
                    this.B = j;
                    this.A = jD;
                    this.y = 2;
                    obj = m2Var.a(jD, this);
                    if (obj != aVar3) {
                        j2 = jD;
                        j3 = ((androidx.compose.ui.unit.q) obj).a;
                        androidx.compose.ui.input.nestedscroll.d dVar3 = m2Var.f;
                        long jD3 = androidx.compose.ui.unit.q.d(j2, j3);
                        this.B = j;
                        this.A = j3;
                        this.y = 3;
                        obj = dVar3.a(jD3, j3, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        j4 = j;
                        j5 = j3;
                    }
                    return aVar3;
                }
                if (i3 == 2) {
                    j2 = this.A;
                    j = this.B;
                    kotlin.a.e(obj);
                    j3 = ((androidx.compose.ui.unit.q) obj).a;
                    androidx.compose.ui.input.nestedscroll.d dVar4 = m2Var.f;
                    long jD4 = androidx.compose.ui.unit.q.d(j2, j3);
                    this.B = j;
                    this.A = j3;
                    this.y = 3;
                    obj = dVar4.a(jD4, j3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    j4 = j;
                    j5 = j3;
                } else {
                    if (i3 != 3) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        aVar3 = null;
                        return aVar3;
                    }
                    j5 = this.A;
                    j4 = this.B;
                    kotlin.a.e(obj);
                }
                return new androidx.compose.ui.unit.q(androidx.compose.ui.unit.q.d(j4, androidx.compose.ui.unit.q.d(j5, ((androidx.compose.ui.unit.q) obj).a)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m2 m2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.z = m2Var;
    }
}
