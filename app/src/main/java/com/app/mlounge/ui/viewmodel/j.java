package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = kVar;
        this.A = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new j(this.z, this.A, dVar, 0);
            case 1:
                return new j(this.z, this.A, dVar, 1);
            case 2:
                return new j(this.z, this.A, dVar, 2);
            case 3:
                return new j(this.z, this.A, dVar, 3);
            case 4:
                return new j(this.z, this.A, dVar, 4);
            case 5:
                return new j(this.z, this.A, dVar, 5);
            case 6:
                return new j(this.z, this.A, dVar, 6);
            case 7:
                return new j(this.z, this.A, dVar, 7);
            default:
                return new j(this.z, this.A, dVar, 8);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((j) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var = this.z.b;
                this.y = 1;
                Object objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.d(3, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objS != aVar) {
                    objS = yVar;
                }
                return objS == aVar ? aVar : yVar;
            case 1:
                int i2 = this.y;
                kotlin.y yVar2 = kotlin.y.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return yVar2;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var2 = this.z.b;
                this.y = 1;
                Object objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var2.a), new com.app.mlounge.data.local.prefs.d(4, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objS2 != aVar2) {
                    objS2 = yVar2;
                }
                return objS2 == aVar2 ? aVar2 : yVar2;
            case 2:
                int i3 = this.y;
                kotlin.y yVar3 = kotlin.y.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return yVar3;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var3 = this.z.b;
                this.y = 1;
                Object objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var3.a), new com.app.mlounge.data.local.prefs.d(5, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (objS3 != aVar3) {
                    objS3 = yVar3;
                }
                return objS3 == aVar3 ? aVar3 : yVar3;
            case 3:
                int i4 = this.y;
                kotlin.y yVar4 = kotlin.y.a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                        return yVar4;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var4 = this.z.b;
                this.y = 1;
                Object objS4 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var4.a), new com.app.mlounge.data.local.prefs.d(6, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                if (objS4 != aVar4) {
                    objS4 = yVar4;
                }
                return objS4 == aVar4 ? aVar4 : yVar4;
            case 4:
                int i5 = this.y;
                kotlin.y yVar5 = kotlin.y.a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kotlin.a.e(obj);
                        return yVar5;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var5 = this.z.b;
                this.y = 1;
                Object objS5 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var5.a), new com.app.mlounge.data.local.prefs.d(7, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                if (objS5 != aVar5) {
                    objS5 = yVar5;
                }
                return objS5 == aVar5 ? aVar5 : yVar5;
            case 5:
                int i6 = this.y;
                kotlin.y yVar6 = kotlin.y.a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlin.a.e(obj);
                        return yVar6;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var6 = this.z.b;
                this.y = 1;
                Object objS6 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var6.a), new com.app.mlounge.data.local.prefs.d(8, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                if (objS6 != aVar6) {
                    objS6 = yVar6;
                }
                return objS6 == aVar6 ? aVar6 : yVar6;
            case 6:
                int i7 = this.y;
                kotlin.y yVar7 = kotlin.y.a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        kotlin.a.e(obj);
                        return yVar7;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var7 = this.z.b;
                this.y = 1;
                Object objS7 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var7.a), new com.app.mlounge.data.local.prefs.d(9, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                if (objS7 != aVar7) {
                    objS7 = yVar7;
                }
                return objS7 == aVar7 ? aVar7 : yVar7;
            case 7:
                int i8 = this.y;
                kotlin.y yVar8 = kotlin.y.a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        kotlin.a.e(obj);
                        return yVar8;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var8 = this.z.b;
                this.y = 1;
                Object objS8 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var8.a), new com.app.mlounge.data.local.prefs.d(10, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                if (objS8 != aVar8) {
                    objS8 = yVar8;
                }
                return objS8 == aVar8 ? aVar8 : yVar8;
            default:
                int i9 = this.y;
                kotlin.y yVar9 = kotlin.y.a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kotlin.a.e(obj);
                        return yVar9;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.local.prefs.y1 y1Var9 = this.z.b;
                this.y = 1;
                Object objS9 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var9.a), new com.app.mlounge.data.local.prefs.d(11, this.A, null), this);
                kotlin.coroutines.intrinsics.a aVar9 = kotlin.coroutines.intrinsics.a.e;
                if (objS9 != aVar9) {
                    objS9 = yVar9;
                }
                return objS9 == aVar9 ? aVar9 : yVar9;
        }
    }
}
