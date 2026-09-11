package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.e;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
    public static final class AnonymousClass1<T, C extends Collection<? super T>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.toCollection(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, final C c, kotlin.coroutines.d<? super C> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Collection collection = (Collection) anonymousClass1.L$0;
            kotlin.a.e(obj);
            return collection;
        }
        kotlin.a.e(obj);
        FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CollectionKt.toCollection.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                c.add(t);
                return y.a;
            }
        };
        anonymousClass1.L$0 = c;
        anonymousClass1.label = 1;
        Object objCollect = flow.collect(flowCollector, anonymousClass1);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objCollect == aVar ? aVar : c;
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return FlowKt.toCollection(flow, list, dVar);
    }

    public static /* synthetic */ Object toList$default(Flow flow, List list, kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return FlowKt.toList(flow, list, dVar);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return FlowKt.toCollection(flow, set, dVar);
    }

    public static /* synthetic */ Object toSet$default(Flow flow, Set set, kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return FlowKt.toSet(flow, set, dVar);
    }
}
