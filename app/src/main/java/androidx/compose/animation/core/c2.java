package androidx.compose.animation.core;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 2;
    public int y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(float f, h1 h1Var, androidx.navigation.i iVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = f;
        this.A = h1Var;
        this.B = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c2 c2Var = new c2((e2) this.B, dVar);
                c2Var.A = obj;
                return c2Var;
            case 1:
                return new c2((androidx.compose.material.ripple.g) this.A, this.z, (m) this.B, dVar);
            default:
                return new c2(this.z, (h1) this.A, (androidx.navigation.i) this.B, dVar);
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
        return ((c2) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        final float fJ;
        CoroutineScope coroutineScope;
        Object objA;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.A;
                    fJ = e.j(coroutineScope2.getCoroutineContext());
                    coroutineScope = coroutineScope2;
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fJ = this.z;
                    coroutineScope = (CoroutineScope) this.A;
                    kotlin.a.e(obj);
                }
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    final e2 e2Var = (e2) this.B;
                    kotlin.jvm.functions.l lVar = new kotlin.jvm.functions.l() { // from class: androidx.compose.animation.core.b2
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            e2 e2Var2 = e2Var;
                            boolean zG = e2Var2.g();
                            androidx.compose.runtime.f1 f1Var = e2Var2.g;
                            if (!zG) {
                                if (f1Var.g() == Long.MIN_VALUE) {
                                    f1Var.h(jLongValue);
                                    ((androidx.compose.runtime.h1) e2Var2.a.e).setValue(Boolean.TRUE);
                                }
                                long jG = jLongValue - f1Var.g();
                                float f = fJ;
                                if (f != 0.0f) {
                                    jG = kotlin.math.a.G(jG / ((double) f));
                                }
                                e2Var2.n(jG);
                                e2Var2.h(jG, f == 0.0f);
                            }
                            return kotlin.y.a;
                        }
                    };
                    this.A = coroutineScope;
                    this.z = fJ;
                    this.y = 1;
                    Object objA2 = androidx.compose.runtime.s.o(getContext()).a(this, lVar);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA2 == aVar) {
                        return aVar;
                    }
                }
                return kotlin.y.a;
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    d dVar = (d) ((androidx.compose.material.ripple.g) this.A).c;
                    Float f = new Float(this.z);
                    m mVar = (m) this.B;
                    this.y = 1;
                    Object objC = d.c(dVar, f, mVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objC == aVar2) {
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
                h1 h1Var = (h1) this.A;
                float f2 = this.z;
                int i3 = this.y;
                kotlin.y yVar = kotlin.y.a;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    if (f2 > 0.0f) {
                        this.y = 1;
                        if (h1Var.D(f2, h1Var.y.getValue(), this) != aVar3) {
                        }
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                if (f2 != 0.0f) {
                    return yVar;
                }
                androidx.navigation.i iVar = (androidx.navigation.i) this.B;
                this.y = 2;
                e2 e2Var2 = h1Var.B;
                if (e2Var2 == null || ((kotlin.jvm.internal.l.a(h1Var.z.getValue(), iVar) && kotlin.jvm.internal.l.a(h1Var.y.getValue(), iVar)) || (objA = u0.a(h1Var.H, new a1(h1Var, iVar, e2Var2, (kotlin.coroutines.d) null), this)) != aVar3)) {
                    objA = yVar;
                }
                if (objA != aVar3) {
                    return yVar;
                }
                return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(e2 e2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = e2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(androidx.compose.material.ripple.g gVar, float f, m mVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = gVar;
        this.z = f;
        this.B = mVar;
    }
}
