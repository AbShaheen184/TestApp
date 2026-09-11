package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g2 {
    public final kotlin.jvm.functions.l a;
    public final m b = new m(this);
    public final androidx.compose.foundation.n1 c = new androidx.compose.foundation.n1();
    public final androidx.compose.runtime.h1 d;
    public final androidx.compose.runtime.h1 e;
    public final androidx.compose.runtime.h1 f;

    public n(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.s.r(bool);
        this.e = androidx.compose.runtime.s.r(bool);
        this.f = androidx.compose.runtime.s.r(bool);
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final Object c(androidx.compose.foundation.i1 i1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.b0(this, i1Var, pVar, (kotlin.coroutines.d) null, 5), cVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.g2
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
