package androidx.media3.datasource.cache;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {
    public static final i c = new i(Collections.EMPTY_MAP);
    public int a;
    public final Map b;

    public i(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final i b(androidx.media3.common.util.b bVar) {
        byte[] bytes;
        Map map = this.b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) bVar.z));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((HashMap) bVar.y);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    net.luminis.tls.engine.impl.c.a();
                    return null;
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new i(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return c(this.b, ((i) obj).b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = iHashCode;
        }
        return this.a;
    }
}
