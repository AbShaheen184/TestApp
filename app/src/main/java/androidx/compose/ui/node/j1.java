package androidx.compose.ui.node;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Comparator {
    public static final j1 y = new j1(0);
    public final /* synthetic */ int e;

    public /* synthetic */ j1(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int iB = kotlin.jvm.internal.l.b(f0Var2.N, f0Var.N);
                return iB != 0 ? iB : kotlin.jvm.internal.l.b(f0Var.hashCode(), f0Var2.hashCode());
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int iB2 = kotlin.jvm.internal.l.b(f0Var3.N, f0Var4.N);
                return iB2 != 0 ? iB2 : kotlin.jvm.internal.l.b(f0Var3.hashCode(), f0Var4.hashCode());
        }
    }
}
