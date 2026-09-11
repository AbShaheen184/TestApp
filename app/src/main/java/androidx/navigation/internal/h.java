package androidx.navigation.internal;

import androidx.collection.z0;
import androidx.navigation.t;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, kotlin.jvm.internal.markers.a {
    public int e = -1;
    public boolean y;
    public final /* synthetic */ androidx.fragment.app.h z;

    public h(androidx.fragment.app.h hVar) {
        this.z = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e + 1 < ((z0) this.z.A).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.y = true;
        z0 z0Var = (z0) this.z.A;
        int i = this.e + 1;
        this.e = i;
        return (t) z0Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.y) {
            net.luminis.tls.engine.impl.c.r("You must call next() before you can remove an element");
            return;
        }
        z0 z0Var = (z0) this.z.A;
        ((t) z0Var.g(this.e)).z = null;
        int i = this.e;
        Object[] objArr = z0Var.z;
        Object obj = objArr[i];
        Object obj2 = androidx.collection.t.c;
        if (obj != obj2) {
            objArr[i] = obj2;
            z0Var.e = true;
        }
        this.e = i - 1;
        this.y = false;
    }
}
