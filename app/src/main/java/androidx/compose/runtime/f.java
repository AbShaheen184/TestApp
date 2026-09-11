package androidx.compose.runtime;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.coroutines.h {
    public final /* synthetic */ int e;
    public static final androidx.collection.g y = new androidx.collection.g(8);
    public static final /* synthetic */ f z = new f(1);
    public static final f A = new f(2);
    public static final f B = new f(3);
    public static final f C = new f(4);
    public static final f D = new f(5);

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    public static final void a(f fVar) {
        MutableStateFlow mutableStateFlow;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b bVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b bVar2;
        MutableStateFlow mutableStateFlow2 = w1.z;
        do {
            mutableStateFlow = w1.z;
            bVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b) mutableStateFlow.getValue();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVarA = bVar.z;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a aVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a) bVarA.get(fVar);
            if (aVar == null) {
                bVar2 = bVar;
            } else {
                Object obj = aVar.a;
                Object obj2 = aVar.b;
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVar = bVarA.e;
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVarV = mVar.v(fVar != null ? fVar.hashCode() : 0, 0, fVar);
                if (mVar != mVarV) {
                    bVarA = mVarV == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b.z : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b(mVarV, bVarA.y - 1);
                }
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b.a;
                if (obj != bVar3) {
                    Object obj3 = bVarA.get(obj);
                    obj3.getClass();
                    bVarA = bVarA.a(obj, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a(((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a) obj3).a, obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = bVarA.get(obj2);
                    obj4.getClass();
                    bVarA = bVarA.a(obj2, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a(obj, ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a) obj4).b));
                }
                Object obj5 = obj != bVar3 ? bVar.e : obj2;
                if (obj2 != bVar3) {
                    obj = bVar.y;
                }
                bVar2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b(obj5, obj, bVarA);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(bVar, bVar2));
    }

    public boolean b(Object obj, Object obj2) {
        switch (this.e) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
