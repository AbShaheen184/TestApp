package androidx.compose.foundation.lazy.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ a1 f;

    public z0(a1 a1Var, List list) {
        this.f = a1Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            androidx.compose.foundation.internal.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
