package coil3.network;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o b = new o(a0.H(new LinkedHashMap()));
    public final Map a;

    public o(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.a.get(lowerCase);
        if (list != null) {
            return (String) kotlin.collections.o.T(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ")";
    }
}
