package androidx.compose.runtime.tooling;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final List a;

    public a(List list) {
        this.a = list;
    }

    public final boolean a() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((b) list.get(i)).getClass();
        }
        return false;
    }
}
