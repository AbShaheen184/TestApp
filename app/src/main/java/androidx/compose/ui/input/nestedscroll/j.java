package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m implements l {
    public final /* synthetic */ int y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, z zVar) {
        super(1);
        this.y = i;
        this.z = zVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.y) {
            case 0:
                androidx.compose.ui.node.i iVar = (z1) obj;
                if (((q) iVar).e.K) {
                    this.z.e = iVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                androidx.compose.ui.input.pointer.f fVar = (androidx.compose.ui.input.pointer.f) obj;
                z zVar = this.z;
                Object obj2 = zVar.e;
                if (obj2 == null && fVar.N) {
                    zVar.e = fVar;
                } else if (obj2 != null) {
                    fVar.getClass();
                }
                return Boolean.TRUE;
            default:
                this.z.e = (e0) obj;
                return Boolean.TRUE;
        }
    }
}
