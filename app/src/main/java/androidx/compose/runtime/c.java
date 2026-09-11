package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void c(int i, Object obj);

    void d(Object obj);

    void e();

    void f(int i, int i2, int i3);

    void g(int i, int i2);

    void k();

    default void l(Object obj, kotlin.jvm.functions.p pVar) {
        pVar.invoke(o(), obj);
    }

    void m(int i, Object obj);

    Object o();

    default void n() {
    }
}
