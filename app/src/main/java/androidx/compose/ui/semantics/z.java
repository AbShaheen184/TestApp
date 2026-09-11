package androidx.compose.ui.semantics;

import androidx.compose.ui.node.f0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Comparator {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Comparator y;

    public z(z zVar) {
        this.y = zVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                int iCompare = this.y.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return f0.r0.compare(((p) obj).c, ((p) obj2).c);
            default:
                int iCompare2 = ((z) this.y).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : com.google.android.material.resources.c.f(Integer.valueOf(((p) obj).g), Integer.valueOf(((p) obj2).g));
        }
    }

    public z(Comparator comparator) {
        this.y = comparator;
    }
}
