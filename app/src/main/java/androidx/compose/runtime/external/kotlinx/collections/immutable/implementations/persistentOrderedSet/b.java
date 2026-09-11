package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.collection.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Set, Collection, kotlin.jvm.internal.markers.a {
    public static final b A;
    public final Object e;
    public final Object y;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b z;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b.a;
        A = new b(bVar, bVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b.z);
    }

    public b(Object obj, Object obj2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVar) {
        this.e = obj;
        this.y = obj2;
        this.z = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z.y;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.z.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m0(this.e, this.z);
    }
}
