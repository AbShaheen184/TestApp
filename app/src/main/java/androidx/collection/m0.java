package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Iterator, kotlin.jvm.internal.markers.a {
    public final Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    public m0(r0 r0Var) {
        this.e = 1;
        this.A = r0Var;
        this.y = -1;
        this.z = com.google.android.material.resources.g.g(new q0(r0Var, this, null));
    }

    public void b() {
        Object objInvoke;
        int i = this.y;
        kotlin.io.h hVar = (kotlin.io.h) this.A;
        if (i == -2) {
            objInvoke = ((kotlin.jvm.functions.a) hVar.b).invoke();
        } else {
            kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) hVar.c;
            Object obj = this.z;
            obj.getClass();
            objInvoke = lVar.invoke(obj);
        }
        this.z = objInvoke;
        this.y = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((kotlin.sequences.i) this.z).hasNext();
            case 1:
                return ((kotlin.sequences.i) this.z).hasNext();
            case 2:
                return this.y < ((Map) this.A).size();
            case 3:
                if (this.y < 0) {
                    b();
                }
                return this.y == 1;
            default:
                kotlin.sequences.l lVar = (kotlin.sequences.l) this.A;
                Iterator it = (Iterator) this.z;
                while (this.y < lVar.b && it.hasNext()) {
                    it.next();
                    this.y++;
                }
                return this.y < lVar.c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return ((kotlin.sequences.i) this.z).next();
            case 1:
                return ((kotlin.sequences.i) this.z).next();
            case 2:
                if (!hasNext()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object obj = this.z;
                this.y++;
                Object obj2 = ((Map) this.A).get(obj);
                if (obj2 != null) {
                    this.z = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a) obj2).b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 3:
                if (this.y < 0) {
                    b();
                }
                if (this.y == 0) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                Object obj3 = this.z;
                obj3.getClass();
                this.y = -1;
                return obj3;
            default:
                kotlin.sequences.l lVar = (kotlin.sequences.l) this.A;
                Iterator it = (Iterator) this.z;
                while (this.y < lVar.b && it.hasNext()) {
                    it.next();
                    this.y++;
                }
                int i = this.y;
                if (i < lVar.c) {
                    this.y = i + 1;
                    return it.next();
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != -1) {
                    ((n0) this.A).y.h(i);
                    this.y = -1;
                    return;
                }
                return;
            case 1:
                int i2 = this.y;
                if (i2 != -1) {
                    ((r0) this.A).y.m(i2);
                    this.y = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m0(kotlin.sequences.l lVar) {
        this.e = 4;
        this.A = lVar;
        this.z = lVar.a.iterator();
    }

    public m0(kotlin.io.h hVar) {
        this.e = 3;
        this.A = hVar;
        this.y = -2;
    }

    public m0(Object obj, Map map) {
        this.e = 2;
        this.z = obj;
        this.A = map;
    }

    public m0(n0 n0Var) {
        this.e = 0;
        this.A = n0Var;
        this.y = -1;
        this.z = com.google.android.material.resources.g.g(new l0(n0Var, this, null));
    }
}
