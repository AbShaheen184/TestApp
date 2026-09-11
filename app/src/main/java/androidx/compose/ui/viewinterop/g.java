package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.ui.node.o1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(v vVar, int i) {
        super(0);
        this.y = i;
        this.z = vVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                this.z.getLayoutNode().C();
                return y.a;
            case 1:
                v vVar = this.z;
                if (vVar.B && vVar.isAttachedToWindow() && vVar.getView().getParent() == vVar) {
                    o1 snapshotObserver = vVar.getSnapshotObserver();
                    snapshotObserver.a.d(vVar, b.z, vVar.getUpdate());
                }
                return y.a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.z.a0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                v vVar2 = this.z;
                vVar2.getReleaseBlock().invoke(vVar2.a0);
                v.n(vVar2);
                return y.a;
            case 4:
                v vVar3 = this.z;
                vVar3.getResetBlock().invoke(vVar3.a0);
                return y.a;
            default:
                v vVar4 = this.z;
                vVar4.getUpdateBlock().invoke(vVar4.a0);
                return y.a;
        }
    }
}
