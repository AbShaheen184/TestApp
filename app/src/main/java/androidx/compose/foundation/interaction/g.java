package androidx.compose.foundation.interaction;

import androidx.compose.runtime.y0;
import com.app.mlounge.ui.components.x;
import java.util.ArrayList;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, y0 y0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = kVar;
        this.A = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g(this.z, this.A, dVar, 0);
            case 1:
                return new g(this.z, this.A, dVar, 1);
            case 2:
                return new g(this.z, this.A, dVar, 2);
            case 3:
                return new g(this.z, this.A, dVar, 3);
            case 4:
                return new g(this.z, this.A, dVar, 4);
            case 5:
                return new g(this.z, this.A, dVar, 5);
            case 6:
                return new g(this.z, this.A, dVar, 6);
            default:
                return new g(this.z, this.A, dVar, 7);
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
        }
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    ArrayList arrayList = new ArrayList();
                    MutableSharedFlow mutableSharedFlow = this.z.a;
                    f fVar = new f(0, arrayList, this.A);
                    this.y = 1;
                    Object objCollect = mutableSharedFlow.collect(fVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow2 = this.z.a;
                    x xVar = new x(this.A, 0);
                    this.y = 1;
                    Object objCollect2 = mutableSharedFlow2.collect(xVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 2:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow3 = this.z.a;
                    x xVar2 = new x(this.A, 1);
                    this.y = 1;
                    Object objCollect3 = mutableSharedFlow3.collect(xVar2, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 3:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow4 = this.z.a;
                    x xVar3 = new x(this.A, 2);
                    this.y = 1;
                    Object objCollect4 = mutableSharedFlow4.collect(xVar3, this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 4:
                int i5 = this.y;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow5 = this.z.a;
                    x xVar4 = new x(this.A, 3);
                    this.y = 1;
                    Object objCollect5 = mutableSharedFlow5.collect(xVar4, this);
                    kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 5:
                int i6 = this.y;
                if (i6 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow6 = this.z.a;
                    x xVar5 = new x(this.A, 4);
                    this.y = 1;
                    Object objCollect6 = mutableSharedFlow6.collect(xVar5, this);
                    kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 6:
                int i7 = this.y;
                if (i7 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow7 = this.z.a;
                    x xVar6 = new x(this.A, 5);
                    this.y = 1;
                    Object objCollect7 = mutableSharedFlow7.collect(xVar6, this);
                    kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect7 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            default:
                int i8 = this.y;
                if (i8 == 0) {
                    kotlin.a.e(obj);
                    MutableSharedFlow mutableSharedFlow8 = this.z.a;
                    x xVar7 = new x(this.A, 6);
                    this.y = 1;
                    Object objCollect8 = mutableSharedFlow8.collect(xVar7, this);
                    kotlin.coroutines.intrinsics.a aVar8 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect8 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i8 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
        }
    }
}
