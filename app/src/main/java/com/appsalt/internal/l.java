package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ s0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(s0 s0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l(this.z, dVar, 0);
            default:
                return new l(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return new l(this.z, dVar, 0).invokeSuspend(kotlin.y.a);
            default:
                return new l(this.z, dVar, 1).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                s0 s0Var = this.z;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                obj = s0.d(s0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((n1) obj) == n1.e) {
                    c cVar = s0Var.g;
                    this.y = 2;
                    if (cVar.invoke(this) == aVar) {
                        return aVar;
                    }
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                s0 s0Var2 = this.z;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i2 != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                obj = s0.d(s0Var2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (((n1) obj) == n1.e) {
                    c cVar2 = s0Var2.g;
                    this.y = 2;
                    if (cVar2.invoke(this) == aVar2) {
                        return aVar2;
                    }
                }
                return kotlin.y.a;
        }
    }
}
