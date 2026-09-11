package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements CoroutineScope {
    public final AtomicReference A = new AtomicReference(null);
    public final View e;
    public final androidx.compose.ui.text.input.y y;
    public final CoroutineScope z;

    public o0(View view, androidx.compose.ui.text.input.y yVar, CoroutineScope coroutineScope) {
        this.e = view;
        this.y = yVar;
        this.z = coroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(androidx.compose.foundation.text.input.internal.w wVar, kotlin.coroutines.jvm.internal.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i = n0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0Var.z = i - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object obj = n0Var.e;
        int i2 = n0Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.animation.c cVar2 = new androidx.compose.animation.c(6, wVar, this);
            androidx.activity.compose.p pVar = new androidx.activity.compose.p(this, (kotlin.coroutines.d) null, 16);
            n0Var.z = 1;
            if (CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.f(cVar2, this.A, pVar, (kotlin.coroutines.d) null), n0Var) == kotlin.coroutines.intrinsics.a.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            kotlin.a.e(obj);
        }
        com.google.gson.b.b();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.i getCoroutineContext() {
        return this.z.getCoroutineContext();
    }
}
