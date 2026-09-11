package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public SparseArray a;
    public int b;
    public Set c;

    public final g0 a(int i) {
        SparseArray sparseArray = this.a;
        g0 g0Var = (g0) sparseArray.get(i);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        sparseArray.put(i, g0Var2);
        return g0Var2;
    }
}
