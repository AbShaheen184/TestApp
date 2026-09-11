package kotlinx.serialization.json.internal;

import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int a;

    static {
        Object lVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            lVar = r.Q(property);
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        if (lVar instanceof kotlin.l) {
            lVar = null;
        }
        Integer num = (Integer) lVar;
        a = num != null ? num.intValue() : 2097152;
    }
}
