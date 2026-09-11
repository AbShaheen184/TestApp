package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static volatile l a;
    public static final l b;

    static {
        l lVar = new l();
        Map map = Collections.EMPTY_MAP;
        b = lVar;
    }

    public static l a() {
        l lVar;
        r0 r0Var = r0.c;
        l lVar2 = a;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (l.class) {
            try {
                lVar = a;
                if (lVar == null) {
                    Class cls = k.a;
                    l lVar3 = null;
                    if (cls != null) {
                        try {
                            lVar3 = (l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    lVar = lVar3 != null ? lVar3 : b;
                    a = lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
