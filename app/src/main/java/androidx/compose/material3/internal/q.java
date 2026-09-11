package androidx.compose.material3.internal;

import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.o implements kotlin.reflect.h {
    @Override // kotlin.jvm.internal.c
    public final kotlin.reflect.b computeReflected() {
        kotlin.jvm.internal.a0.a.getClass();
        return this;
    }

    @Override // kotlin.reflect.h
    public final Object get() {
        return ((y0) this.receiver).getValue();
    }

    @Override // kotlin.reflect.h
    public final Object getDelegate() {
        return ((q) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.h
    /* JADX INFO: renamed from: getGetter */
    public final kotlin.reflect.g mo15getGetter() {
        ((q) getReflected()).mo15getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return get();
    }
}
