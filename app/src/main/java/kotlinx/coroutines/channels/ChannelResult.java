package kotlinx.coroutines.channels;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelResult<T> {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && l.a(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m42boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m44equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && l.a(obj, ((ChannelResult) obj2).m54unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m45equalsimpl0(Object obj, Object obj2) {
        return l.a(obj, obj2);
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m46exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m47getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m48getOrThrowimpl(Object obj) throws Throwable {
        if (!(obj instanceof Failed)) {
            return obj;
        }
        if (!(obj instanceof Closed)) {
            net.luminis.tls.engine.impl.c.r("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
            return null;
        }
        Throwable th = ((Closed) obj).cause;
        if (th != null) {
            throw th;
        }
        net.luminis.tls.engine.impl.c.r("Trying to call 'getOrThrow' on a channel closed without a cause");
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m49hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m50isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m51isFailureimpl(Object obj) {
        return obj instanceof Failed;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m52isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m53toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m44equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m49hashCodeimpl(this.holder);
    }

    public String toString() {
        return m53toStringimpl(this.holder);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m54unboximpl() {
        return this.holder;
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @InternalCoroutinesApi
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @InternalCoroutinesApi
        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m55closedJP2dKIU(Throwable th) {
            return ChannelResult.m43constructorimpl(new Closed(th));
        }

        @InternalCoroutinesApi
        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m56failurePtdJZtk() {
            return ChannelResult.m43constructorimpl(ChannelResult.failed);
        }

        @InternalCoroutinesApi
        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m57successJP2dKIU(E e) {
            return ChannelResult.m43constructorimpl(e);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m43constructorimpl(Object obj) {
        return obj;
    }
}
