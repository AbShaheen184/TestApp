package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.compose.foundation.lazy.layout.m {
    public final androidx.appcompat.widget.x b = new androidx.appcompat.widget.x();

    public k(kotlin.jvm.functions.l lVar) {
        lVar.invoke(this);
    }

    public static void p(k kVar, androidx.compose.runtime.internal.f fVar, int i) {
        String str = (i & 1) != 0 ? null : "..";
        kVar.b.b(1, new h(str != null ? new androidx.activity.compose.g(str, 7) : null, new i(0), new androidx.compose.runtime.internal.f(-857469575, true, new j(fVar, 0))));
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public final androidx.appcompat.widget.x k() {
        return this.b;
    }

    public final void q(int i, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.b.b(i, new h(lVar, lVar2, fVar));
    }
}
