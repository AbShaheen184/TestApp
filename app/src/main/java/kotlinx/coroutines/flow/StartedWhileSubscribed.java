package kotlinx.coroutines.flow;

import kotlin.collections.o;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StartedWhileSubscribed implements SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(SharingCommand sharingCommand, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass2) create(sharingCommand, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return Boolean.valueOf(((SharingCommand) this.L$0) != SharingCommand.START);
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public StartedWhileSubscribed(long j, long j2) {
        this.stopTimeout = j;
        this.replayExpiration = j2;
        if (j < 0) {
            kotlinx.coroutines.channels.e.a("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        kotlinx.coroutines.channels.e.a("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new AnonymousClass1(null)), new AnonymousClass2(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Long.hashCode(this.replayExpiration) + (Long.hashCode(this.stopTimeout) * 31);
    }

    public String toString() {
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(2);
        if (this.stopTimeout > 0) {
            bVar.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("SharingStarted.WhileSubscribed("), o.R(com.google.common.base.c.c(bVar), null, null, null, null, 63), ')');
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {Token.DEBUGGER, Token.GENEXPR, Token.ARROW, Token.YIELD_STAR, Token.TEMPLATE_CHARS}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements q {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, int i, kotlin.coroutines.d<? super y> dVar) {
            AnonymousClass1 anonymousClass1 = StartedWhileSubscribed.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.I$0 = i;
            return anonymousClass1.invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006d  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a A[PHI: r0
  0x007a: PHI (r0v4 kotlinx.coroutines.flow.FlowCollector) = (r0v3 kotlinx.coroutines.flow.FlowCollector), (r0v9 kotlinx.coroutines.flow.FlowCollector) binds: [B:27:0x0077, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x008b A[PHI: r0
  0x008b: PHI (r0v5 kotlinx.coroutines.flow.FlowCollector) = 
  (r0v3 kotlinx.coroutines.flow.FlowCollector)
  (r0v4 kotlinx.coroutines.flow.FlowCollector)
  (r0v11 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:25:0x006b, B:30:0x0088, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r0.emit(r10, r9) == r6) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r0.emit(r10, r9) == r6) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 5
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L39
                if (r0 == r5) goto L35
                if (r0 == r4) goto L2d
                if (r0 == r3) goto L25
                if (r0 == r2) goto L1d
                if (r0 != r1) goto L16
                goto L35
            L16:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r10)
                r10 = 0
                return r10
            L1d:
                java.lang.Object r0 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlin.a.e(r10)
                goto L8b
            L25:
                java.lang.Object r0 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlin.a.e(r10)
                goto L7a
            L2d:
                java.lang.Object r0 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlin.a.e(r10)
                goto L61
            L35:
                kotlin.a.e(r10)
                goto L99
            L39:
                kotlin.a.e(r10)
                java.lang.Object r10 = r9.L$0
                r0 = r10
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                int r10 = r9.I$0
                if (r10 <= 0) goto L50
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.label = r5
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r6) goto L99
                goto L98
            L50:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r7 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r10)
                r9.L$0 = r0
                r9.label = r4
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r7, r9)
                if (r10 != r6) goto L61
                goto L98
            L61:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8b
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.L$0 = r0
                r9.label = r3
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r6) goto L7a
                goto L98
            L7a:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r3 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r9.L$0 = r0
                r9.label = r2
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r3, r9)
                if (r10 != r6) goto L8b
                goto L98
            L8b:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r2 = 0
                r9.L$0 = r2
                r9.label = r1
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r6) goto L99
            L98:
                return r6
            L99:
                kotlin.y r10 = kotlin.y.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FlowCollector<? super SharingCommand>) obj, ((Number) obj2).intValue(), (kotlin.coroutines.d<? super y>) obj3);
        }
    }
}
