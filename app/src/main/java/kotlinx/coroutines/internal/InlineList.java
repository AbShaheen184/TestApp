package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineList m75boximpl(Object obj) {
        return new InlineList(obj);
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m77constructorimpl$default(Object obj, int i, f fVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m76constructorimpl(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m78equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && l.a(obj, ((InlineList) obj2).m84unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m79equalsimpl0(Object obj, Object obj2) {
        return l.a(obj, obj2);
    }

    /* JADX INFO: renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m80forEachReversedimpl(Object obj, kotlin.jvm.functions.l lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke(arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m81hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m82plusFjFbRPM(Object obj, E e) {
        if (obj == null) {
            return m76constructorimpl(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m76constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m76constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m83toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m78equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m81hashCodeimpl(this.holder);
    }

    public String toString() {
        return m83toStringimpl(this.holder);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m84unboximpl() {
        return this.holder;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m76constructorimpl(Object obj) {
        return obj;
    }
}
