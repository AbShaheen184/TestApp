package com.app.mlounge.ui.screens.player;

import androidx.compose.runtime.d1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ androidx.compose.runtime.y0 B;
    public final /* synthetic */ d1 C;
    public int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j, boolean z, kotlin.jvm.functions.l lVar, androidx.compose.runtime.y0 y0Var, d1 d1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = j;
        this.z = z;
        this.A = lVar;
        this.B = y0Var;
        this.C = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e0(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        long j = this.y;
        androidx.compose.runtime.y0 y0Var = this.B;
        if (i == 0) {
            kotlin.a.e(obj);
            Object obj2 = i0.a;
            if (((Boolean) y0Var.getValue()).booleanValue() && j > 0 && this.z) {
                this.e = 1;
                Object objDelay = DelayKt.delay(1000L, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objDelay == aVar) {
                    return aVar;
                }
            }
            return kotlin.y.a;
        }
        if (i != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Object obj3 = i0.a;
        this.A.invoke(new Long((long) (this.C.g() * j)));
        y0Var.setValue(Boolean.FALSE);
        return kotlin.y.a;
    }
}
