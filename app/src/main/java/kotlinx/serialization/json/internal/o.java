package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.h1;
import kotlinx.serialization.internal.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final Set a = kotlin.collections.n.W(new kotlinx.serialization.descriptors.e[]{e1.b, h1.b, b1.b, k1.b});

    public static final boolean a(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return eVar.isInline() && a.contains(eVar);
    }
}
