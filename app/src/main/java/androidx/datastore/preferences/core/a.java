package androidx.datastore.preferences.core;

import androidx.compose.ui.text.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.internal.l;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final LinkedHashMap a;
    public final com.app.mlounge.data.music.e b;

    public a(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new com.app.mlounge.data.music.e(z);
    }

    public final Map a() {
        k kVar;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iU = a0.u(p.y(setEntrySet, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                kVar = new k(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                kVar = new k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kVar.e, kVar.y);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.y).get()) {
            net.luminis.tls.engine.impl.c.r("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        dVar.getClass();
        Object obj = this.a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(d dVar) {
        dVar.getClass();
        b();
        this.a.remove(dVar);
    }

    public final void e(d dVar, Object obj) {
        dVar.getClass();
        f(dVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof a) {
            LinkedHashMap linkedHashMap = ((a) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = l.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d dVar, Object obj) {
        dVar.getClass();
        b();
        if (obj == null) {
            d(dVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(o.o0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(dVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(dVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(dVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return o.R(this.a.entrySet(), ",\n", "{\n", "\n}", new y(13), 24);
    }

    public /* synthetic */ a(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
