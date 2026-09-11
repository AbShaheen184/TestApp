package kotlinx.coroutines.internal;

import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.Segment;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    private final Object value;

    private /* synthetic */ SegmentOrClosed(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SegmentOrClosed m88boximpl(Object obj) {
        return new SegmentOrClosed(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m90equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && l.a(obj, ((SegmentOrClosed) obj2).m96unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m91equalsimpl0(Object obj, Object obj2) {
        return l.a(obj, obj2);
    }

    /* JADX INFO: renamed from: getSegment-impl, reason: not valid java name */
    public static final S m92getSegmentimpl(Object obj) {
        if (obj != ConcurrentLinkedListKt.CLOSED) {
            obj.getClass();
            return (S) obj;
        }
        c.r("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m93hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m94isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m95toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m90equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m93hashCodeimpl(this.value);
    }

    public String toString() {
        return m95toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m96unboximpl() {
        return this.value;
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <S extends Segment<S>> Object m89constructorimpl(Object obj) {
        return obj;
    }
}
