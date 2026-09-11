package androidx.collection;

import com.google.android.gms.internal.measurement.eh;
import com.google.android.gms.internal.measurement.o2;
import com.google.protobuf.c2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractSet {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.w0) this.y).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((o2) this.y).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
            default:
                return super.add(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((c2) this.y).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.e) {
            case 1:
                ((androidx.datastore.preferences.protobuf.w0) this.y).clear();
                break;
            case 2:
                ((o2) this.y).clear();
                break;
            case 3:
            default:
                super.clear();
                break;
            case 4:
                ((c2) this.y).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((androidx.datastore.preferences.protobuf.w0) this.y).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((o2) this.y).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 3:
            default:
                return super.contains(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((c2) this.y).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.e) {
            case 0:
                return new d((f) this.y);
            case 1:
                return new androidx.datastore.preferences.protobuf.y0((androidx.datastore.preferences.protobuf.w0) this.y, 0);
            case 2:
                return new androidx.datastore.preferences.protobuf.y0((o2) this.y);
            case 3:
                return new com.google.android.gms.internal.measurement.u(this, 1);
            default:
                return new androidx.datastore.preferences.protobuf.y0((c2) this.y, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.e) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.w0) this.y).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((o2) this.y).remove(entry2.getKey());
                return true;
            case 3:
            default:
                return super.remove(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((c2) this.y).remove(entry3.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.e) {
            case 0:
                return ((f) this.y).z;
            case 1:
                return ((androidx.datastore.preferences.protobuf.w0) this.y).size();
            case 2:
                return ((o2) this.y).size();
            case 3:
                return ((eh) this.y).e;
            default:
                return ((c2) this.y).size();
        }
    }
}
