package androidx.compose.material3;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ s3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(s3 s3Var, float f, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = s3Var;
        this.A = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new r3(this.z, this.A, dVar, 0);
            default:
                return new r3(this.z, this.A, dVar, 1);
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
        return ((r3) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    s3 s3Var = this.z;
                    androidx.compose.animation.core.d dVar = s3Var.Q;
                    if (dVar != null) {
                        Float f = new Float(this.A);
                        androidx.compose.animation.core.m mVar = s3Var.O ? j3.f : s3Var.N;
                        this.y = 1;
                        obj = androidx.compose.animation.core.d.c(dVar, f, mVar, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return kotlin.y.a;
                }
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                return kotlin.y.a;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    s3 s3Var2 = this.z;
                    androidx.compose.animation.core.d dVar2 = s3Var2.P;
                    if (dVar2 != null) {
                        Float f2 = new Float(this.A);
                        androidx.compose.animation.core.m mVar2 = s3Var2.O ? j3.f : s3Var2.N;
                        this.y = 1;
                        obj = androidx.compose.animation.core.d.c(dVar2, f2, mVar2, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return kotlin.y.a;
                }
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                return kotlin.y.a;
        }
    }
}
