package androidx.compose.foundation.lazy.grid;

import com.app.mlounge.ui.components.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public /* synthetic */ g(int i, kotlin.jvm.functions.l lVar) {
        this.e = 2;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                return (b) this.y.invoke((s) obj);
            case 1:
                this.y.invoke(obj);
                return kotlin.y.a;
            default:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.s.A(1);
                b0.c(this.y, (androidx.compose.runtime.r) obj, iA);
                return kotlin.y.a;
        }
    }

    public /* synthetic */ g(kotlin.jvm.functions.l lVar, int i, byte b) {
        this.e = i;
        this.y = lVar;
    }
}
