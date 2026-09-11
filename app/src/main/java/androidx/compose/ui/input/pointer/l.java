package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.text.selection.q0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public final androidx.compose.runtime.collection.b a = new androidx.compose.runtime.collection.b(new k[16]);
    public final androidx.collection.j0 b = new androidx.collection.j0(10);

    public boolean a(androidx.collection.s sVar, androidx.compose.ui.layout.x xVar, q0 q0Var, boolean z) {
        androidx.compose.runtime.collection.b bVar = this.a;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((k) objArr[i2]).a(sVar, xVar, q0Var, z) || z2;
        }
        return z2;
    }

    public void b(q0 q0Var) {
        androidx.compose.runtime.collection.b bVar = this.a;
        int i = bVar.z;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((k) bVar.e[i]).d.b == 0) {
                bVar.k(i);
            }
        }
    }
}
