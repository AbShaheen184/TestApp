package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.o1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ CoroutineScope A;
    public final /* synthetic */ androidx.compose.runtime.y0 B;
    public final /* synthetic */ androidx.compose.foundation.interaction.k C;
    public int e;
    public /* synthetic */ androidx.compose.foundation.gestures.l1 y;
    public /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(CoroutineScope coroutineScope, androidx.compose.runtime.y0 y0Var, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.A = coroutineScope;
        this.B = y0Var;
        this.C = kVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.geometry.b) obj2).a;
        androidx.compose.runtime.y0 y0Var = this.B;
        androidx.compose.foundation.interaction.k kVar = this.C;
        d1 d1Var = new d1(this.A, y0Var, kVar, (kotlin.coroutines.d) obj3);
        d1Var.y = (androidx.compose.foundation.gestures.l1) obj;
        d1Var.z = j;
        return d1Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.gestures.l1 l1Var = this.y;
            BuildersKt__Builders_commonKt.launch$default(this.A, null, null, new androidx.compose.foundation.d(this.B, this.z, this.C, null, 3), 3, null);
            this.e = 1;
            obj = ((o1) l1Var).f(this);
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
        BuildersKt__Builders_commonKt.launch$default(this.A, null, null, new androidx.compose.foundation.g(this.B, ((Boolean) obj).booleanValue(), this.C, (kotlin.coroutines.d) null), 3, null);
        return kotlin.y.a;
    }
}
