package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ m2 C;
    public final /* synthetic */ kotlin.jvm.internal.y D;
    public final /* synthetic */ long E;
    public m2 e;
    public kotlin.jvm.internal.y y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, kotlin.jvm.internal.y yVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = m2Var;
        this.D = yVar;
        this.E = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        k2 k2Var = new k2(this.C, this.D, this.E, dVar);
        k2Var.B = obj;
        return k2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((l2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m2 m2Var;
        kotlin.jvm.internal.y yVar;
        long j;
        m2 m2Var2;
        int i = this.A;
        k1 k1Var = k1.y;
        if (i == 0) {
            kotlin.a.e(obj);
            l2 l2Var = (l2) this.B;
            m2Var = this.C;
            j2 j2Var = new j2(m2Var, l2Var);
            l lVar = m2Var.c;
            kotlin.jvm.internal.y yVar2 = this.D;
            long j2 = yVar2.e;
            k1 k1Var2 = m2Var.d;
            long j3 = this.E;
            float fD = m2Var.d(k1Var2 == k1Var ? androidx.compose.ui.unit.q.b(j3) : androidx.compose.ui.unit.q.c(j3));
            this.B = m2Var;
            this.e = m2Var;
            this.y = yVar2;
            this.z = j2;
            this.A = 1;
            lVar.getClass();
            obj = BuildersKt.withContext(lVar.b, new k(fD, lVar, j2Var, null), this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
            yVar = yVar2;
            j = j2;
            m2Var2 = m2Var;
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.z;
            yVar = this.y;
            m2Var = this.e;
            m2Var2 = (m2) this.B;
            kotlin.a.e(obj);
        }
        float fD2 = m2Var2.d(((Number) obj).floatValue());
        yVar.e = m2Var.d == k1Var ? androidx.compose.ui.unit.q.a(j, fD2, 0.0f, 2) : androidx.compose.ui.unit.q.a(j, 0.0f, fD2, 1);
        return kotlin.y.a;
    }
}
