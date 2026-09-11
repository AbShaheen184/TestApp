package androidx.compose.foundation.text.contextmenu.internal;

import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ i y;
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.e z;

    public /* synthetic */ b(i iVar, androidx.compose.foundation.text.contextmenu.provider.e eVar, int i) {
        this.e = i;
        this.y = iVar;
        this.z = eVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                i iVar = this.y;
                a aVar = iVar.f;
                androidx.activity.w wVar = new androidx.activity.w(this.z, 10);
                z zVar = new z();
                iVar.e.d("dataBuilder", aVar, new androidx.activity.compose.f(8, zVar, wVar));
                Object obj = zVar.e;
                if (obj != null) {
                    return (androidx.compose.foundation.text.contextmenu.data.c) obj;
                }
                kotlin.jvm.internal.l.f("result");
                throw null;
            case 1:
                i iVar2 = this.y;
                a aVar2 = iVar2.g;
                b bVar = new b(iVar2, this.z, 2);
                z zVar2 = new z();
                iVar2.e.d("positioner", aVar2, new androidx.activity.compose.f(8, zVar2, bVar));
                Object obj2 = zVar2.e;
                if (obj2 != null) {
                    return (androidx.compose.ui.geometry.c) obj2;
                }
                kotlin.jvm.internal.l.f("result");
                throw null;
            default:
                Object objInvoke = this.y.c.invoke();
                if (!((androidx.compose.ui.layout.x) objInvoke).l()) {
                    objInvoke = null;
                }
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) objInvoke;
                return xVar == null ? androidx.compose.ui.geometry.c.e : this.z.h0(xVar).i(xVar.W(0L));
        }
    }
}
