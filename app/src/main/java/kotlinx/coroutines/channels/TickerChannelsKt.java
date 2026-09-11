package kotlinx.coroutines.channels;

import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {Token.ASSIGN_BITXOR, Token.ASSIGN_LOGICAL_AND, Token.ASSIGN_LSH}, m = "fixedDelayTicker")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        long J$0;
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
            return TickerChannelsKt.fixedDelayTicker(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {Token.STRICT_SETNAME, Token.ESCXMLTEXT, Token.TRY, Token.LB}, m = "fixedPeriodTicker")
    public static final class C00461 extends kotlin.coroutines.jvm.internal.c {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00461(kotlin.coroutines.d<? super C00461> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.fixedPeriodTicker(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", l = {Token.ENUM_ID, Token.THISFN}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ TickerMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TickerMode.values().length];
                try {
                    iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TickerMode tickerMode, long j, long j2, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$mode = tickerMode;
            this.$delayMillis = j;
            this.$initialDelayMillis = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mode, this.$delayMillis, this.$initialDelayMillis, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super y> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass3) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        
            if (kotlinx.coroutines.channels.TickerChannelsKt.fixedDelayTicker(r4, r6, r8, r10) == r3) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            if (kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(r4, r6, r8, r10) == r3) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            return r3;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 == r2) goto L16
                if (r0 != r1) goto Lf
                kotlin.a.e(r11)
                r9 = r10
                goto L5a
            Lf:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r11)
            L14:
                r11 = 0
                return r11
            L16:
                kotlin.a.e(r11)
                goto L5a
            L1a:
                kotlin.a.e(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.TickerMode r0 = r10.$mode
                int[] r3 = kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0
                int r0 = r0.ordinal()
                r0 = r3[r0]
                kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                if (r0 == r2) goto L48
                if (r0 != r1) goto L43
                long r4 = r10.$delayMillis
                long r6 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r11.getChannel()
                r10.label = r1
                r9 = r10
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                if (r11 != r3) goto L5a
                goto L59
            L43:
                r9 = r10
                coil3.g.a()
                goto L14
            L48:
                r9 = r10
                long r4 = r9.$delayMillis
                long r6 = r9.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r11.getChannel()
                r9.label = r2
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r4, r6, r8, r9)
                if (r11 != r3) goto L5a
            L59:
                return r3
            L5a:
                kotlin.y r11 = kotlin.y.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) == r5) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007a -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fixedDelayTicker(long r6, long r8, kotlinx.coroutines.channels.SendChannel<? super kotlin.y> r10, kotlin.coroutines.d<? super kotlin.y> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L50
            if (r1 == r4) goto L45
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.a.e(r11)
        L32:
            r10 = r8
            goto L60
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3b:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.a.e(r11)
            goto L70
        L45:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.SendChannel r10 = (kotlinx.coroutines.channels.SendChannel) r10
            kotlin.a.e(r11)
            goto L60
        L50:
            kotlin.a.e(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r5) goto L60
            goto L7c
        L60:
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r3
            kotlin.y r8 = kotlin.y.a
            java.lang.Object r8 = r10.send(r8, r0)
            if (r8 != r5) goto L6f
            goto L7c
        L6f:
            r8 = r10
        L70:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r2
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r9 != r5) goto L32
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedDelayTicker(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r22, r1) == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r12, r1) == r7) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e4 -> B:19:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f8 -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fixedPeriodTicker(long r20, long r22, kotlinx.coroutines.channels.SendChannel<? super kotlin.y> r24, kotlin.coroutines.d<? super kotlin.y> r25) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.d):java.lang.Object");
    }

    @ObsoleteCoroutinesApi
    public static final ReceiveChannel<y> ticker(long j, long j2, kotlin.coroutines.i iVar, TickerMode tickerMode) {
        if (j < 0) {
            e.a("Expected non-negative delay, but has ", j, " ms");
            return null;
        }
        if (j2 >= 0) {
            return ProduceKt.produce(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(iVar), 0, new AnonymousClass3(tickerMode, j, j2, null));
        }
        e.a("Expected non-negative initial delay, but has ", j2, " ms");
        return null;
    }

    public static /* synthetic */ ReceiveChannel ticker$default(long j, long j2, kotlin.coroutines.i iVar, TickerMode tickerMode, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            iVar = j.e;
        }
        if ((i & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return ticker(j, j2, iVar, tickerMode);
    }
}
