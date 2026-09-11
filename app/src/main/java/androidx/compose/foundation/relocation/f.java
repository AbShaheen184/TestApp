package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.d1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends j implements kotlin.jvm.functions.a {
    public final /* synthetic */ h e;
    public final /* synthetic */ d1 y;
    public final /* synthetic */ androidx.compose.ui.draw.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, d1 d1Var, androidx.compose.ui.draw.b bVar) {
        super(0, k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.e = hVar;
        this.y = d1Var;
        this.z = bVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return h.L0(this.e, this.y, this.z);
    }
}
