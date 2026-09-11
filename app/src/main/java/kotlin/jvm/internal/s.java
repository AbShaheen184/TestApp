package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class s extends u implements kotlin.reflect.i {
    public s(Class cls, String str, String str2, int i) {
        super(c.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.c
    public final kotlin.reflect.b computeReflected() {
        a0.a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // kotlin.reflect.i
    public final void getGetter() {
        ((kotlin.reflect.i) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
