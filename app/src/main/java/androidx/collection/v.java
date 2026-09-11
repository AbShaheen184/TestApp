package androidx.collection;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class v implements Map.Entry, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.e) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.l.a(entry.getKey(), this.y) && kotlin.jvm.internal.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.z;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.e) {
            case 1:
                Object obj = this.y;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.y);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
