package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p1 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public b0(kotlin.jvm.functions.l lVar) {
        super(new androidx.activity.compose.b(28));
        this.c = new c0(lVar);
    }

    @Override // androidx.compose.runtime.p1
    public final androidx.appcompat.widget.r a(Object obj) {
        switch (this.b) {
            case 0:
                return new androidx.appcompat.widget.r(this, obj, obj == null, null, true);
            default:
                return new androidx.appcompat.widget.r(this, obj, obj == null, (f) this.c, true);
        }
    }

    @Override // androidx.compose.runtime.p1
    public w2 b() {
        switch (this.b) {
            case 0:
                return (c0) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.functions.a aVar) {
        super(aVar);
        f fVar = f.D;
        this.c = fVar;
    }
}
