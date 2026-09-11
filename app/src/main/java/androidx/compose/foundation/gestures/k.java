package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ l B;
    public final /* synthetic */ j2 C;
    public kotlin.jvm.internal.w e;
    public androidx.compose.animation.core.n y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(float f, l lVar, j2 j2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = f;
        this.B = lVar;
        this.C = j2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new k(this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f;
        androidx.compose.animation.core.n nVar;
        kotlin.jvm.internal.w wVar;
        androidx.compose.animation.core.n nVar2;
        int i = this.z;
        if (i == 0) {
            kotlin.a.e(obj);
            f = this.A;
            if (Math.abs(f) > 1.0f) {
                kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                wVar2.e = f;
                kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                androidx.compose.animation.core.n nVarB = androidx.compose.animation.core.e.b(28, f);
                try {
                    l lVar = this.B;
                    androidx.compose.animation.core.x xVar = lVar.a;
                    androidx.compose.animation.core.i0 i0Var = new androidx.compose.animation.core.i0(wVar3, (Object) this.C, (Object) wVar2, (Object) lVar, 1);
                    this.e = wVar2;
                    this.y = nVarB;
                    this.z = 1;
                    nVar = nVarB;
                    try {
                        Object objC = androidx.compose.animation.core.e.c(nVar, new androidx.compose.animation.core.w(xVar, androidx.compose.animation.core.e.j, nVarB.y.getValue(), nVarB.z), Long.MIN_VALUE, i0Var, this);
                        Object obj2 = kotlin.coroutines.intrinsics.a.e;
                        if (objC != obj2) {
                            objC = kotlin.y.a;
                        }
                        if (objC == obj2) {
                            return obj2;
                        }
                        wVar = wVar2;
                        f = wVar.e;
                    } catch (CancellationException unused) {
                        wVar = wVar2;
                        nVar2 = nVar;
                        wVar.e = ((Number) nVar2.e.b.invoke(nVar2.z)).floatValue();
                    }
                } catch (CancellationException unused2) {
                    nVar = nVarB;
                }
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar2 = this.y;
            wVar = this.e;
            try {
                kotlin.a.e(obj);
            } catch (CancellationException unused3) {
                wVar.e = ((Number) nVar2.e.b.invoke(nVar2.z)).floatValue();
            }
            f = wVar.e;
        }
        return new Float(f);
    }
}
