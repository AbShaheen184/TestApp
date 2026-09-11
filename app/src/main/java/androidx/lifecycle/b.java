package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public b(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            n nVar = (n) entry.getValue();
            List arrayList = (List) this.a.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(nVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, v vVar, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.b;
                try {
                    int i = cVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, vVar);
                    } else if (i == 2) {
                        method.invoke(obj, vVar, nVar);
                    }
                } catch (IllegalAccessException e) {
                    net.luminis.tls.engine.impl.c.k(e);
                    return;
                } catch (InvocationTargetException e2) {
                    androidx.media3.exoplayer.hls.playlist.a.j("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
