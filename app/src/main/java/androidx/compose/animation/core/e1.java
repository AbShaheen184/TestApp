package androidx.compose.animation.core;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ h1 A;
    public final /* synthetic */ e2 B;
    public final /* synthetic */ float C;
    public int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Object obj, Object obj2, h1 h1Var, e2 e2Var, float f, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.y = obj;
        this.z = obj2;
        this.A = h1Var;
        this.B = e2Var;
        this.C = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new e1(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return ((e1) create((kotlin.coroutines.d) obj)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            d1 d1Var = new d1(this.y, this.z, this.A, this.B, this.C, null);
            this.e = 1;
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(d1Var, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCoroutineScope == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }
}
