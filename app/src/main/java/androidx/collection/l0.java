package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ n0 D;
    public final /* synthetic */ m0 E;
    public m0 e;
    public n0 y;
    public long[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, m0 m0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = n0Var;
        this.E = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        l0 l0Var = new l0(this.D, this.E, dVar);
        l0Var.C = obj;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.sequences.j jVar;
        n0 n0Var;
        long[] jArr;
        int i;
        m0 m0Var;
        int i2 = this.B;
        if (i2 == 0) {
            kotlin.a.e(obj);
            jVar = (kotlin.sequences.j) this.C;
            n0Var = this.D;
            k0 k0Var = n0Var.y;
            jArr = k0Var.c;
            i = k0Var.e;
            m0Var = this.E;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.A;
            jArr = this.z;
            n0Var = this.y;
            m0Var = this.e;
            jVar = (kotlin.sequences.j) this.C;
            kotlin.a.e(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return kotlin.y.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        m0Var.y = i;
        Object obj2 = n0Var.y.b[i];
        this.C = jVar;
        this.e = m0Var;
        this.y = n0Var;
        this.z = jArr;
        this.A = i3;
        this.B = 1;
        jVar.b(obj2, this);
        return kotlin.coroutines.intrinsics.a.e;
    }
}
