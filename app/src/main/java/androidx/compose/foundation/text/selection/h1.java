package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ h1(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.jvm.functions.a aVar = this.y;
        switch (i) {
            case 0:
                return (androidx.compose.ui.geometry.b) aVar.invoke();
            default:
                androidx.compose.ui.semantics.x xVar = (androidx.compose.ui.semantics.x) obj;
                Object objInvoke = aVar.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                androidx.compose.ui.semantics.g gVar = new androidx.compose.ui.semantics.g(f != null ? f.floatValue() : 0.0f, new kotlin.ranges.a(1.0f));
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.c;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.v.a[1];
                xVar.b(wVar, gVar);
                return kotlin.y.a;
        }
    }
}
