package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e {
    public final /* synthetic */ int e = 0;
    public final Object y;

    public b0(List list) {
        list.getClass();
        this.y = list;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.e) {
            case 0:
                return ((List) this.y).size();
            default:
                return ((kotlin.text.g) this.y).a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.e) {
            case 0:
                List list = (List) this.y;
                if (i >= 0 && i <= com.google.common.base.c.k(this)) {
                    return list.get(com.google.common.base.c.k(this) - i);
                }
                StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Element index ", i, " must be in range [");
                sbV.append(new kotlin.ranges.d(0, com.google.common.base.c.k(this), 1));
                sbV.append("].");
                throw new IndexOutOfBoundsException(sbV.toString());
            default:
                String strGroup = ((kotlin.text.g) this.y).a.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, 0);
            default:
                return super.listIterator();
        }
    }

    public b0(kotlin.text.g gVar) {
        this.y = gVar;
    }

    @Override // kotlin.collections.e, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
