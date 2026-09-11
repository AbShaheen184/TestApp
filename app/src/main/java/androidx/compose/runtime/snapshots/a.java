package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.r1;
import androidx.compose.runtime.v0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // androidx.compose.runtime.snapshots.b
    public final b C(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        return (b) ((f) n.e(new r1(1, new androidx.compose.foundation.text.c0(3, lVar, lVar2))));
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void c() {
        synchronized (n.c) {
            o();
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void k() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void l() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void m() {
        n.a();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        int i = 1;
        return (e) ((f) n.e(new r1(i, new v0(i, lVar))));
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
