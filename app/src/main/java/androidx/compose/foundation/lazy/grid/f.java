package androidx.compose.foundation.lazy.grid;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.compose.foundation.lazy.layout.r {
    public final kotlin.jvm.functions.l a;
    public final kotlin.jvm.functions.p b;
    public final kotlin.jvm.functions.l c;
    public final androidx.compose.runtime.internal.f d;

    public f(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar) {
        this.a = lVar;
        this.b = pVar;
        this.c = lVar2;
        this.d = fVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.r
    public final kotlin.jvm.functions.l a() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.r
    public final kotlin.jvm.functions.l getKey() {
        return this.a;
    }
}
