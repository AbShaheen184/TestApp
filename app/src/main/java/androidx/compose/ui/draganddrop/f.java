package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.y1;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements l {
    public final /* synthetic */ int y = 0;
    public final /* synthetic */ v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.app.mlounge.data.music.e eVar, g gVar, v vVar) {
        super(1);
        this.z = vVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                g gVar = (g) obj;
                if (!gVar.K) {
                    return y1.y;
                }
                if (gVar.M != null) {
                    androidx.compose.ui.internal.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gVar.M = null;
                v vVar = this.z;
                vVar.e = vVar.e;
                return y1.e;
            default:
                if (!((androidx.compose.ui.input.pointer.f) obj).N) {
                    return y1.e;
                }
                this.z.e = false;
                return y1.z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar) {
        super(1);
        this.z = vVar;
    }
}
