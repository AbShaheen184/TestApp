package androidx.collection;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public int e;
    public int y;
    public boolean z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i) {
        this(fVar.z);
        this.A = i;
        switch (i) {
            case 1:
                this.B = fVar;
                this(fVar.z);
                break;
            default:
                this.B = fVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y;
        switch (this.A) {
            case 0:
                objF = ((f) this.B).f(i);
                break;
            case 1:
                objF = ((f) this.B).i(i);
                break;
            default:
                objF = ((h) this.B).y[i];
                break;
        }
        this.y++;
        this.z = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.z) {
            net.luminis.tls.engine.impl.c.r("Call next() before removing an element.");
            return;
        }
        int i = this.y - 1;
        this.y = i;
        switch (this.A) {
            case 0:
                ((f) this.B).g(i);
                break;
            case 1:
                ((f) this.B).g(i);
                break;
            default:
                ((h) this.B).b(i);
                break;
        }
        this.e--;
        this.z = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(h hVar) {
        this(hVar.z);
        this.A = 2;
        this.B = hVar;
    }

    public b(int i) {
        this.e = i;
    }
}
