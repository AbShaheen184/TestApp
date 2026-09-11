package androidx.compose.foundation.text;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ x0 A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ androidx.compose.ui.input.pointer.y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(androidx.compose.ui.input.pointer.y yVar, x0 x0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = yVar;
        this.A = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new z(this.z, this.A, dVar, 0);
            case 1:
                return new z(this.z, this.A, dVar, 1);
            default:
                return new z(this.z, this.A, dVar, 2);
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
        return ((z) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        x0 x0Var = this.A;
        androidx.compose.ui.input.pointer.y yVar = this.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        kotlin.y yVar2 = kotlin.y.a;
        int i2 = 0;
        kotlin.coroutines.d dVar = null;
        switch (i) {
            case 0:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new u0(yVar, x0Var, dVar, i2), this);
                    if (objCoroutineScope != aVar) {
                        objCoroutineScope = yVar2;
                    }
                    if (objCoroutineScope == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar2;
            case 1:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objI = kotlin.math.a.i(yVar, new androidx.compose.foundation.gestures.o0(x0Var, dVar, 3), this);
                    if (objI != aVar) {
                        objI = yVar2;
                    }
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar2;
            default:
                int i5 = this.y;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    s0 s0Var = new s0(x0Var, 0);
                    t0 t0Var = new t0(x0Var, 0);
                    t0 t0Var2 = new t0(x0Var, 1);
                    androidx.compose.animation.core.g0 g0Var = new androidx.compose.animation.core.g0(x0Var, 5);
                    androidx.compose.foundation.gestures.y yVar3 = new androidx.compose.foundation.gestures.y(s0Var, i2);
                    androidx.activity.compose.g gVar = new androidx.activity.compose.g(t0Var, 5);
                    androidx.activity.compose.b bVar = new androidx.activity.compose.b(9);
                    float f = androidx.compose.foundation.gestures.f0.a;
                    Object objI2 = kotlin.math.a.i(yVar, new androidx.compose.foundation.gestures.d0(bVar, new kotlin.jvm.internal.y(), null, yVar3, g0Var, t0Var2, gVar, null), this);
                    if (objI2 != aVar) {
                        objI2 = yVar2;
                    }
                    if (objI2 != aVar) {
                        objI2 = yVar2;
                    }
                    if (objI2 != aVar) {
                        objI2 = yVar2;
                    }
                    if (objI2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar2;
        }
    }
}
