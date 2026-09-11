package androidx.compose.animation.core;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ h1 B;
    public final /* synthetic */ e2 C;
    public final /* synthetic */ float D;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Object obj, Object obj2, h1 h1Var, e2 e2Var, float f, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = obj;
        this.A = obj2;
        this.B = h1Var;
        this.C = e2Var;
        this.D = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        d1 d1Var = new d1(this.z, this.A, this.B, this.C, this.D, dVar);
        d1Var.y = obj;
        return d1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        h1 h1Var = this.B;
        if (i == 0) {
            kotlin.a.e(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.y;
            Object obj2 = this.z;
            Object obj3 = this.A;
            kotlin.coroutines.d dVar = null;
            if (kotlin.jvm.internal.l.a(obj2, obj3)) {
                h1Var.K = null;
                if (kotlin.jvm.internal.l.a(h1Var.z.getValue(), obj2)) {
                    return yVar;
                }
            } else {
                h1.w(h1Var);
            }
            boolean zA = kotlin.jvm.internal.l.a(obj2, obj3);
            float f = this.D;
            if (!zA) {
                e2 e2Var = this.C;
                e2Var.p(obj2);
                e2Var.n(0L);
                h1Var.y.setValue(obj2);
                e2Var.j(f);
            }
            h1Var.F(f);
            if (h1Var.J.i()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c1(h1Var, dVar, 0), 3, null);
            } else {
                h1Var.I = Long.MIN_VALUE;
            }
            this.e = 1;
            Object objZ = h1.z(h1Var, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objZ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        h1Var.E();
        return yVar;
    }
}
