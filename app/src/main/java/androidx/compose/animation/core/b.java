package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ d A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ t1 C;
    public final /* synthetic */ long D;
    public n e;
    public kotlin.jvm.internal.v y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, t1 t1Var, long j, kotlin.coroutines.d dVar2) {
        super(1, dVar2);
        this.A = dVar;
        this.B = obj;
        this.C = t1Var;
        this.D = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new b(this.A, this.B, this.C, this.D, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return ((b) create((kotlin.coroutines.d) obj)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        kotlin.jvm.internal.v vVar;
        t1 t1Var = this.C;
        int i = this.z;
        d dVar = this.A;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                dVar.c.z = (s) dVar.a.a.invoke(this.B);
                dVar.e.setValue(t1Var.c);
                dVar.d.setValue(Boolean.TRUE);
                n nVar2 = dVar.c;
                n nVar3 = new n(nVar2.e, nVar2.y.getValue(), e.g(nVar2.z), nVar2.A, Long.MIN_VALUE, nVar2.C);
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                long j = this.D;
                a aVar = new a(0, dVar, nVar3, vVar2);
                this.e = nVar3;
                this.y = vVar2;
                this.z = 1;
                Object objC = e.c(nVar3, t1Var, j, aVar, this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objC == aVar2) {
                    return aVar2;
                }
                nVar = nVar3;
                vVar = vVar2;
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vVar = this.y;
                nVar = this.e;
                kotlin.a.e(obj);
            }
            j jVar = vVar.e ? j.e : j.y;
            d.b(dVar);
            return new k(nVar, jVar);
        } catch (CancellationException e) {
            d.b(dVar);
            throw e;
        }
    }
}
