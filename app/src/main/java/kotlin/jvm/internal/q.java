package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends u implements kotlin.reflect.h {
    @Override // kotlin.jvm.internal.c
    public kotlin.reflect.b computeReflected() {
        a0.a.getClass();
        return this;
    }

    @Override // kotlin.reflect.h
    public Object getDelegate() {
        return ((kotlin.reflect.h) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.h
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public kotlin.reflect.g mo15getGetter() {
        ((kotlin.reflect.h) getReflected()).mo15getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.a
    public Object invoke() {
        return get();
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.f getGetter() {
        mo15getGetter();
        return null;
    }
}
