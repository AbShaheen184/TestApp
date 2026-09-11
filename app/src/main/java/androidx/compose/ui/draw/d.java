package androidx.compose.ui.draw;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.compose.ui.unit.c {
    public a e = m.e;
    public i y;

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.a().T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a().a();
    }

    public final i b(kotlin.jvm.functions.l lVar) {
        i iVar = new i();
        iVar.a = lVar;
        this.y = iVar;
        return iVar;
    }
}
