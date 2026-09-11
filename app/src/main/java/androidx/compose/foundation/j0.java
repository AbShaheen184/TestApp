package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ k0 A;
    public int e;
    public /* synthetic */ androidx.compose.foundation.gestures.l1 y;
    public /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.A = k0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.geometry.b) obj2).a;
        j0 j0Var = new j0(this.A, (kotlin.coroutines.d) obj3);
        j0Var.y = (androidx.compose.foundation.gestures.l1) obj;
        j0Var.z = j;
        return j0Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objCoroutineScope;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        if (i == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.gestures.l1 l1Var = this.y;
            long j = this.z;
            k0 k0Var = this.A;
            if (k0Var.S) {
                this.e = 1;
                androidx.compose.foundation.interaction.k kVar = k0Var.N;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (kVar == null || (objCoroutineScope = CoroutineScopeKt.coroutineScope(new e(l1Var, j, kVar, k0Var, null), this)) != aVar) {
                    objCoroutineScope = yVar;
                }
                if (objCoroutineScope == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return yVar;
    }
}
