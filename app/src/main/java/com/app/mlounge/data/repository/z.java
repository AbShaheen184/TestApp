package com.app.mlounge.data.repository;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, String str, String str2, Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a0Var;
        this.A = str;
        this.B = str2;
        this.C = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new z(this.z, this.A, this.B, this.C, dVar, 0);
            case 1:
                return new z(this.z, this.A, this.B, this.C, dVar, 1);
            case 2:
                return new z(this.z, this.A, this.B, this.C, dVar, 2);
            default:
                return new z(this.z, this.A, this.B, this.C, dVar, 3);
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
            case 2:
                break;
        }
        return ((z) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.music.d dVar = (com.app.mlounge.data.music.d) this.z.b.getValue();
                this.y = 1;
                Object objB = dVar.b(this.A, this.B, this.C, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objB == aVar ? aVar : objB;
            case 1:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.music.d dVar2 = (com.app.mlounge.data.music.d) this.z.b.getValue();
                this.y = 1;
                Object objG = dVar2.g(this.A, this.B, this.C, this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                return objG == aVar2 ? aVar2 : objG;
            case 2:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.music.d dVar3 = (com.app.mlounge.data.music.d) this.z.b.getValue();
                this.y = 1;
                Object objC = dVar3.c(this.A, this.B, this.C, this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                return objC == aVar3 ? aVar3 : objC;
            default:
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.music.d dVar4 = (com.app.mlounge.data.music.d) this.z.b.getValue();
                this.y = 1;
                Object objD = dVar4.d(this.A, this.B, this.C, this);
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                return objD == aVar4 ? aVar4 : objD;
        }
    }
}
