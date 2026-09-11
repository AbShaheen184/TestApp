package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.compose.runtime.saveable.l {
    public final /* synthetic */ kotlin.jvm.functions.p e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public b0(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.l lVar) {
        this.e = pVar;
        this.y = lVar;
    }

    @Override // androidx.compose.runtime.saveable.l
    public final Object a(androidx.compose.runtime.saveable.c cVar, Object obj) {
        return this.e.invoke(cVar, obj);
    }

    @Override // androidx.compose.runtime.saveable.l
    public final Object b(Object obj) {
        return this.y.invoke(obj);
    }
}
