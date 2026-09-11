package kotlin.random;

import androidx.compose.ui.platform.q0;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final q0 y = new q0(5);

    @Override // kotlin.random.a
    public final Random f() {
        Object obj = this.y.get();
        obj.getClass();
        return (Random) obj;
    }
}
