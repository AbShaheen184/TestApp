package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public a(String str) {
        this.a = str;
    }

    public static void a(a aVar, String str, e eVar) {
        aVar.getClass();
        eVar.getClass();
        if (!aVar.c.add(str)) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Element with name '", str, "' is already registered in ");
            sbX.append(aVar.a);
            throw new IllegalArgumentException(sbX.toString().toString());
        }
        aVar.b.add(str);
        aVar.d.add(eVar);
        aVar.e.add(u.e);
        aVar.f.add(false);
    }
}
