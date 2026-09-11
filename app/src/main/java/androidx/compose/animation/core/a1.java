package androidx.compose.animation.core;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(androidx.room.coroutines.q qVar, androidx.room.x xVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.B = qVar;
        this.z = xVar;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a1((e2) this.B, (h1) this.z, this.A, dVar);
            case 1:
                return new a1((h1) this.z, this.A, (e2) this.B, dVar);
            default:
                return new a1((androidx.room.coroutines.q) this.B, (androidx.room.x) this.z, (kotlin.jvm.functions.p) this.A, dVar);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a1) create(dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f;
        switch (this.e) {
            case 0:
                e2 e2Var = (e2) this.B;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    z0 z0Var = new z0((h1) this.z, this.A, e2Var, (kotlin.coroutines.d) null);
                    this.y = 1;
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(z0Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCoroutineScope == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                e2Var.i();
                return kotlin.y.a;
            case 1:
                e2 e2Var2 = (e2) this.B;
                h1 h1Var = (h1) this.z;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    h1Var.B();
                    androidx.compose.runtime.h1 h1Var2 = h1Var.y;
                    h1Var.I = Long.MIN_VALUE;
                    h1Var.F(0.0f);
                    Object value = h1Var.z.getValue();
                    Object obj2 = this.A;
                    if (obj2.equals(value)) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(h1Var2.getValue()) ? -5.0f : -3.0f;
                    }
                    e2Var2.p(obj2);
                    e2Var2.n(0L);
                    h1Var2.setValue(obj2);
                    h1Var.F(0.0f);
                    h1Var.s(obj2);
                    e2Var2.j(f);
                    if (f == -3.0f) {
                        this.y = 1;
                        Object objZ = h1.z(h1Var, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objZ == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                e2Var2.i();
                return kotlin.y.a;
            default:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                androidx.room.coroutines.q qVar = (androidx.room.coroutines.q) this.B;
                androidx.room.x xVar = (androidx.room.x) this.z;
                ?? r2 = (kotlin.coroutines.jvm.internal.i) this.A;
                this.y = 1;
                Object objE = qVar.e(xVar, r2, this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                return objE == aVar3 ? aVar3 : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e2 e2Var, h1 h1Var, Object obj, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.B = e2Var;
        this.z = h1Var;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h1 h1Var, Object obj, e2 e2Var, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.z = h1Var;
        this.A = obj;
        this.B = e2Var;
    }
}
