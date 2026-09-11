package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.a2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.compose.foundation.lazy.layout.m {
    public static final a2 e = new a2(3);
    public final u b = new u(this);
    public final androidx.appcompat.widget.x c = new androidx.appcompat.widget.x();
    public boolean d;

    public h(kotlin.jvm.functions.l lVar) {
        lVar.invoke(this);
    }

    public static void p(int i, h hVar, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.l lVar) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        hVar.c.b(1, new f(null, lVar != null ? new g(lVar, 0, (byte) 0) : e, new androidx.compose.foundation.lazy.i(0), new androidx.compose.runtime.internal.f(-291643851, true, new androidx.compose.foundation.lazy.j(fVar, 1))));
        if (lVar != null) {
            hVar.d = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public final androidx.appcompat.widget.x k() {
        return this.c;
    }

    public final void q(int i, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.c.b(i, new f(lVar, e, lVar2, fVar));
    }
}
