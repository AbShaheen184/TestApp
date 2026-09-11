package net.luminis.quic.cid;

import androidx.constraintlayout.core.g;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final ConcurrentHashMap a;
    public volatile byte[] b;
    public final net.luminis.quic.log.a c;
    public final SecureRandom d;
    public final int e;

    public c(Integer num, net.luminis.quic.log.a aVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        int iIntValue = num != null ? num.intValue() : 8;
        this.e = iIntValue;
        this.c = aVar;
        SecureRandom secureRandom = new SecureRandom();
        this.d = secureRandom;
        byte[] bArr = new byte[iIntValue];
        secureRandom.nextBytes(bArr);
        this.b = bArr;
        concurrentHashMap.put(0, new a(this.b, 0, 2));
    }

    public final byte[] a() {
        for (Map.Entry entry : this.a.entrySet()) {
            if (!g.b(((a) entry.getValue()).c, 4)) {
                return ((a) entry.getValue()).b;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.a.values()) {
            if (!g.b(aVar.c, 4)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public final byte[] c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(numValueOf)) {
            return null;
        }
        a aVar = (a) concurrentHashMap.get(Integer.valueOf(i));
        if (g.b(aVar.c, 4)) {
            return null;
        }
        aVar.c = 4;
        return aVar.b;
    }
}
