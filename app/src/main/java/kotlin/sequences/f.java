package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, kotlin.jvm.internal.markers.a {
    public Object A;
    public final /* synthetic */ h B;
    public final Iterator y;
    public final /* synthetic */ int e = 0;
    public int z = -1;

    public f(g gVar) {
        this.B = gVar;
        this.y = gVar.a.iterator();
    }

    public void b() {
        Object next;
        g gVar = (g) this.B;
        do {
            Iterator it = this.y;
            if (!it.hasNext()) {
                this.z = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.c.invoke(next)).booleanValue() != gVar.b);
        this.A = next;
        this.z = 1;
    }

    public void c() {
        Iterator it = this.y;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((n) this.B).c.invoke(next)).booleanValue()) {
                this.z = 1;
                this.A = next;
                return;
            }
        }
        this.z = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.z == -1) {
                    b();
                }
                return this.z == 1;
            default:
                if (this.z == -1) {
                    c();
                }
                return this.z == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.z == -1) {
                    b();
                }
                if (this.z == 0) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object obj = this.A;
                this.A = null;
                this.z = -1;
                return obj;
            default:
                if (this.z == -1) {
                    c();
                }
                if (this.z == 0) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object obj2 = this.A;
                this.A = null;
                this.z = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(n nVar) {
        this.B = nVar;
        this.y = nVar.b.iterator();
    }
}
