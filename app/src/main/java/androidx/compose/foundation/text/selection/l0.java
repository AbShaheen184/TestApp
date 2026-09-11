package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.c2;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j, androidx.compose.ui.input.pointer.k0 k0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.z = j;
        this.A = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l0((androidx.compose.animation.core.d) this.A, this.z, dVar, 0);
            case 1:
                return new l0(this.z, (androidx.compose.ui.input.pointer.k0) this.A, dVar);
            case 2:
                return new l0((androidx.compose.ui.viewinterop.h) this.A, this.z, dVar, 2);
            default:
                return new l0((com.app.mlounge.ui.viewmodel.k1) this.A, this.z, dVar, 3);
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
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.animation.core.d dVar = (androidx.compose.animation.core.d) this.A;
                    androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b(this.z);
                    androidx.compose.animation.core.k1 k1Var = m0.d;
                    this.y = 1;
                    Object objC = androidx.compose.animation.core.d.c(dVar, bVar, k1Var, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objC == aVar) {
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
            case 1:
                int i2 = this.y;
                long j = this.z;
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
                    cancellableContinuationImpl = ((androidx.compose.ui.input.pointer.k0) this.A).z;
                    if (cancellableContinuationImpl != null) {
                        cancellableContinuationImpl.resumeWith(new kotlin.l(new androidx.compose.ui.input.pointer.o(j)));
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                this.y = 1;
                if (DelayKt.delay(j - 8, this) == aVar2) {
                    return aVar2;
                }
                this.y = 2;
                if (DelayKt.delay(8L, this) == aVar2) {
                    return aVar2;
                }
                cancellableContinuationImpl = ((androidx.compose.ui.input.pointer.k0) this.A).z;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.resumeWith(new kotlin.l(new androidx.compose.ui.input.pointer.o(j)));
                }
                return kotlin.y.a;
            case 2:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.ui.input.nestedscroll.d dVar2 = ((androidx.compose.ui.viewinterop.h) this.A).e;
                    this.y = 1;
                    Object objB = dVar2.b(this.z, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i4 = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                y1 y1Var = ((com.app.mlounge.ui.viewmodel.k1) this.A).b;
                this.y = 1;
                Object objS = android.support.v4.media.session.b.s(z1.a(y1Var.a), new c2(this.z, null, 2), this);
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                if (objS != aVar4) {
                    objS = yVar;
                }
                return objS == aVar4 ? aVar4 : yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.z = j;
    }
}
