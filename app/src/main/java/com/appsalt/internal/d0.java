package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ s0 A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f fVar, s0 s0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = fVar;
        this.A = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d0(this.z, this.A, dVar, 0);
            default:
                return new d0(this.z, this.A, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return new d0(this.z, this.A, dVar, 0).invokeSuspend(kotlin.y.a);
            default:
                return new d0(this.z, this.A, dVar, 1).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object mVar;
        Object objD2;
        Object mVar2;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    String str = this.A.l;
                    if (str == null) {
                        str = null;
                    }
                    this.y = 1;
                    objD = this.z.d(str, this);
                    mVar = kotlin.coroutines.intrinsics.a.e;
                    if (objD != mVar) {
                    }
                    return mVar;
                }
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objD = ((kotlin.m) obj).e;
                mVar = new kotlin.m(objD);
                return mVar;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    String str2 = this.A.l;
                    if (str2 == null) {
                        str2 = null;
                    }
                    this.y = 1;
                    objD2 = this.z.d(str2, this);
                    mVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objD2 != mVar2) {
                    }
                    return mVar2;
                }
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objD2 = ((kotlin.m) obj).e;
                mVar2 = new kotlin.m(objD2);
                return mVar2;
        }
    }
}
