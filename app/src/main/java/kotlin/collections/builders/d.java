package kotlin.collections.builders;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, kotlin.jvm.internal.markers.c {
    public final e e;
    public final int y;
    public final int z;

    public d(e eVar, int i) {
        eVar.getClass();
        this.e = eVar;
        this.y = i;
        this.z = eVar.E;
    }

    public final void a() {
        if (this.e.E != this.z) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.y];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.y;
        objArr.getClass();
        return objArr[this.y];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.e;
        eVar.c();
        Object[] objArr = eVar.y;
        if (objArr == null) {
            int length = eVar.e.length;
            if (length < 0) {
                net.luminis.tls.engine.impl.c.o("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            eVar.y = objArr;
        }
        int i = this.y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
