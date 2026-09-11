package kotlin.sequences;

import com.app.mlounge.ui.screens.player.j0;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.collections.b {
    public final j0 A;
    public final HashSet B;
    public final Iterator z;

    public b(Iterator it, j0 j0Var) {
        it.getClass();
        this.z = it;
        this.A = j0Var;
        this.B = new HashSet();
    }

    @Override // kotlin.collections.b
    public final void b() throws UnsupportedEncodingException {
        Object next;
        do {
            Iterator it = this.z;
            if (!it.hasNext()) {
                this.e = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.B.add(this.A.invoke(next)));
        this.y = next;
        this.e = 1;
    }
}
