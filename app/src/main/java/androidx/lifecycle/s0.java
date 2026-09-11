package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 {
    default q0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default q0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        return a(cls);
    }

    default q0 c(kotlin.jvm.internal.e eVar, androidx.lifecycle.viewmodel.e eVar2) {
        Class clsA = eVar.a();
        clsA.getClass();
        return b(clsA, eVar2);
    }
}
