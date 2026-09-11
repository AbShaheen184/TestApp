package androidx.datastore.preferences.protobuf;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {
    public final /* synthetic */ Iterable A;
    public final /* synthetic */ int e;
    public int y;
    public int z;

    public c(com.google.android.gms.internal.measurement.t0 t0Var) {
        this.e = 1;
        this.A = t0Var;
        this.y = 0;
        this.z = t0Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.y < this.z;
            case 1:
                return this.y < this.z;
            default:
                org.jsoup.nodes.b bVar = (org.jsoup.nodes.b) this.A;
                if (bVar.e != this.y) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                while (true) {
                    int i = this.z;
                    if (i < bVar.e && org.jsoup.nodes.b.o(bVar.y[i])) {
                        this.z++;
                    }
                }
                return this.z < bVar.e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i < this.z) {
                    this.y = i + 1;
                    return Byte.valueOf(((f) this.A).h(i));
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            case 1:
                int i2 = this.y;
                if (i2 < this.z) {
                    this.y = i2 + 1;
                    return Byte.valueOf(((com.google.android.gms.internal.measurement.t0) this.A).b(i2));
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            default:
                org.jsoup.nodes.b bVar = (org.jsoup.nodes.b) this.A;
                int i3 = bVar.e;
                if (i3 != this.y) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                int i4 = this.z;
                if (i4 >= i3) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                org.jsoup.nodes.a aVar = new org.jsoup.nodes.a(bVar.y[i4], (String) bVar.z[this.z], bVar);
                this.z++;
                return aVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                org.jsoup.nodes.b bVar = (org.jsoup.nodes.b) this.A;
                int i = this.z - 1;
                this.z = i;
                bVar.q(i);
                this.y--;
                return;
        }
    }

    public c(f fVar) {
        this.e = 0;
        this.A = fVar;
        this.y = 0;
        this.z = fVar.size();
    }

    public c(org.jsoup.nodes.b bVar) {
        this.e = 2;
        this.A = bVar;
        this.y = bVar.e;
        this.z = 0;
    }
}
