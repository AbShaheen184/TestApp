package kotlinx.coroutines.channels;

import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.k;
import kotlin.y;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {434}, m = "any")
    public static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.c {
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
            return ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.SETELEM}, m = "consumeEach")
    public static final class C00121<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00121(kotlin.coroutines.d<? super C00121> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "count")
    public static final class C00131<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00131(kotlin.coroutines.d<? super C00131> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C00141 extends i implements p {
        /* synthetic */ Object L$0;
        int label;

        public C00141(kotlin.coroutines.d<? super C00141> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00141 c00141 = new C00141(dVar);
            c00141.L$0 = obj;
            return c00141;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((C00141) create(obj, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return this.L$0;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", l = {417, 418, 420}, m = "invokeSuspend")
    public static final class C00151 extends i implements p {
        final /* synthetic */ p $selector;
        final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00151(ReceiveChannel<? extends E> receiveChannel, p pVar, kotlin.coroutines.d<? super C00151> dVar) {
            super(2, dVar);
            this.$this_distinctBy = receiveChannel;
            this.$selector = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00151 c00151 = new C00151(this.$this_distinctBy, this.$selector, dVar);
            c00151.L$0 = obj;
            return c00151;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super E> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((C00151) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0076 A[PHI: r0 r5 r6 r11
  0x0076: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v6 kotlinx.coroutines.channels.ChannelIterator), (r0v11 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0073, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r5v6 java.util.HashSet) = (r5v8 java.util.HashSet), (r5v12 java.util.HashSet) binds: [B:14:0x0073, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r6v3 kotlinx.coroutines.channels.ProducerScope) = (r6v5 kotlinx.coroutines.channels.ProducerScope), (r6v10 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0073, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r11v4 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:14:0x0073, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x007e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0095  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[PHI: r0 r6 r7
  0x00b7: PHI (r0v7 kotlinx.coroutines.channels.ChannelIterator) = (r0v3 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:23:0x009e, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r6v6 java.util.HashSet) = (r6v2 java.util.HashSet), (r6v8 java.util.HashSet) binds: [B:23:0x009e, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r7v4 kotlinx.coroutines.channels.ProducerScope) = (r7v0 kotlinx.coroutines.channels.ProducerScope), (r7v5 kotlinx.coroutines.channels.ProducerScope) binds: [B:23:0x009e, B:28:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009e -> B:29:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:28:0x00b3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 3
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L4e
                if (r0 == r3) goto L3e
                if (r0 == r2) goto L29
                if (r0 != r1) goto L22
                java.lang.Object r0 = r10.L$3
                java.lang.Object r5 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$1
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r11)
                goto Lb3
            L22:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r11)
                r11 = 0
                return r11
            L29:
                java.lang.Object r0 = r10.L$3
                java.lang.Object r5 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$1
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r11)
                r9 = r5
                r5 = r0
                r0 = r9
                goto L9a
            L3e:
                java.lang.Object r0 = r10.L$2
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r10.L$1
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r11)
                goto L76
            L4e:
                kotlin.a.e(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r10.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r5
                r5 = r0
                r0 = r6
                r6 = r11
            L64:
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r0
                r11 = 0
                r10.L$3 = r11
                r10.label = r3
                java.lang.Object r11 = r0.hasNext(r10)
                if (r11 != r4) goto L76
                goto Lb0
            L76:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lba
                java.lang.Object r11 = r0.next()
                kotlin.jvm.functions.p r7 = r10.$selector
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r0
                r10.L$3 = r11
                r10.label = r2
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r4) goto L95
                goto Lb0
            L95:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9a:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lb7
                r10.L$0 = r7
                r10.L$1 = r6
                r10.L$2 = r0
                r10.L$3 = r11
                r10.label = r1
                java.lang.Object r5 = r7.send(r5, r10)
                if (r5 != r4) goto Lb1
            Lb0:
                return r4
            Lb1:
                r5 = r0
                r0 = r11
            Lb3:
                r6.add(r0)
                r0 = r5
            Lb7:
                r5 = r6
                r6 = r7
                goto L64
            Lba:
                kotlin.y r11 = kotlin.y.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", l = {194, 199, Context.VERSION_ES6}, m = "invokeSuspend")
    public static final class C00161 extends i implements p {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00161(int i, ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$n = i;
            this.$this_drop = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00161 c00161 = new C00161(this.$n, this.$this_drop, dVar);
            c00161.L$0 = obj;
            return c00161;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00161) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0088  */
        /* JADX WARN: Code duplicated, block: B:36:0x0093  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (r9 == r4) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        
            if (r3.send(r9, r8) == r4) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:24:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a1 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 3
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L3d
                if (r0 == r3) goto L2f
                if (r0 == r2) goto L23
                if (r0 != r1) goto L1c
                java.lang.Object r0 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.a.e(r9)
            L1a:
                r9 = r3
                goto L7b
            L1c:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r9)
            L21:
                r9 = 0
                return r9
            L23:
                java.lang.Object r0 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.a.e(r9)
                goto L8b
            L2f:
                int r0 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r9)
                goto L65
            L3d:
                kotlin.a.e(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r0 = r8.$n
                if (r0 < 0) goto L4a
                r5 = r3
                goto L4b
            L4a:
                r5 = 0
            L4b:
                if (r5 == 0) goto La7
                if (r0 <= 0) goto L75
                kotlinx.coroutines.channels.ReceiveChannel r5 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
                r6 = r9
            L56:
                r8.L$0 = r6
                r8.L$1 = r5
                r8.I$0 = r0
                r8.label = r3
                java.lang.Object r9 = r5.hasNext(r8)
                if (r9 != r4) goto L65
                goto La3
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L74
                r5.next()
                int r0 = r0 + (-1)
                if (r0 != 0) goto L56
            L74:
                r9 = r6
            L75:
                kotlinx.coroutines.channels.ReceiveChannel r0 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            L7b:
                r8.L$0 = r9
                r8.L$1 = r0
                r8.label = r2
                java.lang.Object r3 = r0.hasNext(r8)
                if (r3 != r4) goto L88
                goto La3
            L88:
                r7 = r3
                r3 = r9
                r9 = r7
            L8b:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La4
                java.lang.Object r9 = r0.next()
                r8.L$0 = r3
                r8.L$1 = r0
                r8.label = r1
                java.lang.Object r9 = r3.send(r9, r8)
                if (r9 != r4) goto L1a
            La3:
                return r4
            La4:
                kotlin.y r9 = kotlin.y.a
                return r9
            La7:
                java.lang.String r9 = "Requested element count "
                java.lang.String r1 = " is less than zero."
                java.lang.String r9 = androidx.privacysandbox.ads.adservices.java.internal.a.p(r9, r0, r1)
                net.luminis.tls.engine.impl.c.p(r9)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00161.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", l = {211, 212, 213, 217, 218}, m = "invokeSuspend")
    public static final class C00171 extends i implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00171(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00171 c00171 = new C00171(this.$this_dropWhile, this.$predicate, dVar);
            c00171.L$0 = obj;
            return c00171;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00171) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005e A[PHI: r0 r8 r12
  0x005e: PHI (r0v3 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v15 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x007c, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r8v1 kotlinx.coroutines.channels.ProducerScope) = (r8v4 kotlinx.coroutines.channels.ProducerScope), (r8v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x007c, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:21:0x007c, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0088  */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009d -> B:16:0x0051). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ea -> B:10:0x0021). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.ENUM_ID}, m = "elementAt")
    public static final class C00181<E> extends kotlin.coroutines.jvm.internal.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00181(kotlin.coroutines.d<? super C00181> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.ESCXMLATTR}, m = "elementAtOrNull")
    public static final class C00191<E> extends kotlin.coroutines.jvm.internal.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00191(kotlin.coroutines.d<? super C00191> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", l = {228, 229, 229}, m = "invokeSuspend")
    public static final class C00201 extends i implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00201(ReceiveChannel<? extends E> receiveChannel, p pVar, kotlin.coroutines.d<? super C00201> dVar) {
            super(2, dVar);
            this.$this_filter = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00201 c00201 = new C00201(this.$this_filter, this.$predicate, dVar);
            c00201.L$0 = obj;
            return c00201;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super E> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((C00201) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005d A[PHI: r0 r6 r10
  0x005d: PHI (r0v4 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v7 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x005a, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r6v4 kotlinx.coroutines.channels.ProducerScope) = (r6v6 kotlinx.coroutines.channels.ProducerScope), (r6v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x005a, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r10v7 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x005a, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0065  */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x0095  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L40
                if (r0 == r4) goto L34
                if (r0 == r3) goto L23
                if (r0 != r2) goto L1c
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r10)
                goto L4e
            L1c:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r10)
                r10 = 0
                return r10
            L23:
                java.lang.Object r0 = r9.L$2
                java.lang.Object r6 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r10)
                r8 = r6
                r6 = r0
                r0 = r8
                goto L7e
            L34:
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r10)
                goto L5d
            L40:
                kotlin.a.e(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = r10
            L4e:
                r9.L$0 = r6
                r9.L$1 = r0
                r9.L$2 = r1
                r9.label = r4
                java.lang.Object r10 = r0.hasNext(r9)
                if (r10 != r5) goto L5d
                goto L94
            L5d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L97
                java.lang.Object r10 = r0.next()
                kotlin.jvm.functions.p r7 = r9.$predicate
                r9.L$0 = r6
                r9.L$1 = r0
                r9.L$2 = r10
                r9.label = r3
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r5) goto L7a
                goto L94
            L7a:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L7e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L95
                r9.L$0 = r7
                r9.L$1 = r0
                r9.L$2 = r1
                r9.label = r2
                java.lang.Object r10 = r7.send(r6, r9)
                if (r10 != r5) goto L95
            L94:
                return r5
            L95:
                r6 = r7
                goto L4e
            L97:
                kotlin.y r10 = kotlin.y.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
    public static final class C00211 extends i implements p {
        final /* synthetic */ q $predicate;
        final /* synthetic */ ReceiveChannel $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00211(ReceiveChannel receiveChannel, q qVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00211 c00211 = new C00211(this.$this_filterIndexed, this.$predicate, dVar);
            c00211.L$0 = obj;
            return c00211;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00211) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0069 A[PHI: r0 r6 r7 r13
  0x0069: PHI (r0v5 int) = (r0v8 int), (r0v9 int) binds: [B:14:0x0066, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r6v3 kotlinx.coroutines.channels.ChannelIterator) = (r6v4 kotlinx.coroutines.channels.ChannelIterator), (r6v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0066, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r7v5 kotlinx.coroutines.channels.ProducerScope) = (r7v7 kotlinx.coroutines.channels.ProducerScope), (r7v9 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0066, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r13v7 java.lang.Object) = (r13v13 java.lang.Object), (r13v0 java.lang.Object) binds: [B:14:0x0066, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        /* JADX WARN: Code duplicated, block: B:21:0x008f  */
        /* JADX WARN: Code duplicated, block: B:24:0x009b  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L46
                if (r0 == r4) goto L38
                if (r0 == r3) goto L25
                if (r0 != r2) goto L1e
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r13)
                goto L58
            L1e:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r13)
                r13 = 0
                return r13
            L25:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$2
                java.lang.Object r7 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlin.a.e(r13)
                r11 = r7
                r7 = r6
                r6 = r11
                goto L93
            L38:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r13)
                goto L69
            L46:
                kotlin.a.e(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlinx.coroutines.channels.ReceiveChannel r0 = r12.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = 0
                r7 = r6
                r6 = r0
                r0 = r7
                r7 = r13
            L58:
                r12.L$0 = r7
                r12.L$1 = r6
                r12.L$2 = r1
                r12.I$0 = r0
                r12.label = r4
                java.lang.Object r13 = r6.hasNext(r12)
                if (r13 != r5) goto L69
                goto Lab
            L69:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lae
                java.lang.Object r13 = r6.next()
                kotlin.jvm.functions.q r8 = r12.$predicate
                int r9 = r0 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r0)
                r12.L$0 = r7
                r12.L$1 = r6
                r12.L$2 = r13
                r12.I$0 = r9
                r12.label = r3
                java.lang.Object r0 = r8.invoke(r10, r13, r12)
                if (r0 != r5) goto L8f
                goto Lab
            L8f:
                r8 = r7
                r7 = r13
                r13 = r0
                r0 = r9
            L93:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lac
                r12.L$0 = r8
                r12.L$1 = r6
                r12.L$2 = r1
                r12.I$0 = r0
                r12.label = r2
                java.lang.Object r13 = r8.send(r7, r12)
                if (r13 != r5) goto Lac
            Lab:
                return r5
            Lac:
                r7 = r8
                goto L58
            Lae:
                kotlin.y r13 = kotlin.y.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", l = {252}, m = "invokeSuspend")
    public static final class C00221 extends i implements p {
        final /* synthetic */ p $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00221(p pVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00221 c00221 = new C00221(this.$predicate, dVar);
            c00221.L$0 = obj;
            return c00221;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((C00221) create(obj, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                Object obj2 = this.L$0;
                p pVar = this.$predicate;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C00231 extends i implements p {
        /* synthetic */ Object L$0;
        int label;

        public C00231(kotlin.coroutines.d<? super C00231> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00231 c00231 = new C00231(dVar);
            c00231.L$0 = obj;
            return c00231;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(E e, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C00231) create(e, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return Boolean.valueOf(this.L$0 != null);
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "filterNotNullTo")
    public static final class C00241<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00241(kotlin.coroutines.d<? super C00241> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, LibretroCore.PSP_SCREEN_HEIGHT}, m = "filterNotNullTo")
    public static final class AnonymousClass3<E, C extends SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (SendChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.RC}, m = "first")
    public static final class C00251<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00251(kotlin.coroutines.d<? super C00251> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.ASSIGN_LSH}, m = "firstOrNull")
    public static final class C00261<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00261(kotlin.coroutines.d<? super C00261> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend")
    public static final class C00271 extends i implements p {
        final /* synthetic */ ReceiveChannel $this_flatMap;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00271(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_flatMap = receiveChannel;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00271 c00271 = new C00271(this.$this_flatMap, this.$transform, dVar);
            c00271.L$0 = obj;
            return c00271;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00271) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0048 A[PHI: r0 r5
  0x0048: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = 
  (r0v2 kotlinx.coroutines.channels.ChannelIterator)
  (r0v3 kotlinx.coroutines.channels.ChannelIterator)
  (r0v11 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:12:0x003a, B:22:0x007c, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r5v3 kotlinx.coroutines.channels.ProducerScope) = 
  (r5v0 kotlinx.coroutines.channels.ProducerScope)
  (r5v1 kotlinx.coroutines.channels.ProducerScope)
  (r5v9 kotlinx.coroutines.channels.ProducerScope)
 binds: [B:12:0x003a, B:22:0x007c, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0055 A[PHI: r0 r5 r8
  0x0055: PHI (r0v4 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v7 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r5v2 kotlinx.coroutines.channels.ProducerScope) = (r5v3 kotlinx.coroutines.channels.ProducerScope), (r5v5 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r8v6 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0070 A[PHI: r0 r5 r8
  0x0070: PHI (r0v3 kotlinx.coroutines.channels.ChannelIterator) = (r0v4 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r5v1 kotlinx.coroutines.channels.ProducerScope) = (r5v2 kotlinx.coroutines.channels.ProducerScope), (r5v7 kotlinx.coroutines.channels.ProducerScope) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v0 java.lang.Object) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:13:0x0048). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 3
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L3a
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L22
                if (r0 != r1) goto L1b
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.a.e(r8)
                goto L48
            L1b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r8)
                r8 = 0
                return r8
            L22:
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.a.e(r8)
                goto L70
            L2e:
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.a.e(r8)
                goto L55
            L3a:
                kotlin.a.e(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlinx.coroutines.channels.ReceiveChannel r0 = r7.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r5 = r8
            L48:
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r3
                java.lang.Object r8 = r0.hasNext(r7)
                if (r8 != r4) goto L55
                goto L7e
            L55:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L7f
                java.lang.Object r8 = r0.next()
                kotlin.jvm.functions.p r6 = r7.$transform
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r2
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r4) goto L70
                goto L7e
            L70:
                kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r1
                java.lang.Object r8 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r8, r5, r7)
                if (r8 != r4) goto L48
            L7e:
                return r4
            L7f:
                kotlin.y r8 = kotlin.y.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "indexOf")
    public static final class C00281<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00281(kotlin.coroutines.d<? super C00281> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {127, 130}, m = "last")
    public static final class C00291<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00291(kotlin.coroutines.d<? super C00291> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
    public static final class C00301<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C00301(kotlin.coroutines.d<? super C00301> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.SETPROP_OP, Token.SET_REF_OP}, m = "lastOrNull")
    public static final class C00311<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00311(kotlin.coroutines.d<? super C00311> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", l = {514, 363, 363}, m = "invokeSuspend")
    public static final class C00321 extends i implements p {
        final /* synthetic */ ReceiveChannel<E> $this_map;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00321(ReceiveChannel<? extends E> receiveChannel, p pVar, kotlin.coroutines.d<? super C00321> dVar) {
            super(2, dVar);
            this.$this_map = receiveChannel;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00321 c00321 = new C00321(this.$this_map, this.$transform, dVar);
            c00321.L$0 = obj;
            return c00321;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super R> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((C00321) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0082  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:30:0x008e A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:24:0x0072, B:28:0x0086, B:30:0x008e, B:20:0x005c, B:23:0x006b), top: B:44:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bd -> B:24:0x0072). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00321.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend")
    public static final class C00331 extends i implements p {
        final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ q $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00331(ReceiveChannel<? extends E> receiveChannel, q qVar, kotlin.coroutines.d<? super C00331> dVar) {
            super(2, dVar);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00331 c00331 = new C00331(this.$this_mapIndexed, this.$transform, dVar);
            c00331.L$0 = obj;
            return c00331;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super R> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((C00331) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0065  */
        /* JADX WARN: Code duplicated, block: B:19:0x0070  */
        /* JADX WARN: Code duplicated, block: B:22:0x008e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:13:0x0056). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 3
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L45
                if (r0 == r3) goto L37
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1e
                int r0 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r12)
                r12 = r6
                goto L56
            L1e:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r12)
                r12 = 0
                return r12
            L25:
                int r0 = r11.I$0
                java.lang.Object r5 = r11.L$2
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                java.lang.Object r6 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r12)
                goto L92
            L37:
                int r0 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r12)
                goto L68
            L45:
                kotlin.a.e(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r11.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r5 = 0
                r10 = r5
                r5 = r0
                r0 = r10
            L56:
                r11.L$0 = r12
                r11.L$1 = r5
                r11.I$0 = r0
                r11.label = r3
                java.lang.Object r6 = r5.hasNext(r11)
                if (r6 != r4) goto L65
                goto La3
            L65:
                r10 = r6
                r6 = r12
                r12 = r10
            L68:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto La7
                java.lang.Object r12 = r5.next()
                kotlin.jvm.functions.q r7 = r11.$transform
                int r8 = r0 + 1
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r0)
                r11.L$0 = r6
                r11.L$1 = r5
                r11.L$2 = r6
                r11.I$0 = r8
                r11.label = r2
                java.lang.Object r12 = r7.invoke(r9, r12, r11)
                if (r12 != r4) goto L8e
                goto La3
            L8e:
                r7 = r6
                r0 = r8
                r6 = r5
                r5 = r7
            L92:
                r11.L$0 = r7
                r11.L$1 = r6
                r8 = 0
                r11.L$2 = r8
                r11.I$0 = r0
                r11.label = r1
                java.lang.Object r12 = r5.send(r12, r11)
                if (r12 != r4) goto La4
            La3:
                return r4
            La4:
                r5 = r6
                r12 = r7
                goto L56
            La7:
                kotlin.y r12 = kotlin.y.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00331.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {450, 452}, m = "maxWith")
    public static final class C00341<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00341(kotlin.coroutines.d<? super C00341> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {464, 466}, m = "minWith")
    public static final class C00351<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00351(kotlin.coroutines.d<? super C00351> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {477}, m = "none")
    public static final class C00361<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00361(kotlin.coroutines.d<? super C00361> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C00371 extends i implements p {
        final /* synthetic */ ReceiveChannel $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00371(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00371 c00371 = new C00371(this.$this_requireNoNulls, dVar);
            c00371.L$0 = obj;
            return c00371;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((C00371) create(obj, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.SET, Token.SETCONST}, m = "single")
    public static final class C00381<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00381(kotlin.coroutines.d<? super C00381> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {Token.YIELD_STAR, Token.TEMPLATE_LITERAL_SUBST}, m = "singleOrNull")
    public static final class C00391<E> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00391(kotlin.coroutines.d<? super C00391> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend")
    public static final class C00401 extends i implements p {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00401(int i, ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$n = i;
            this.$this_take = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00401 c00401 = new C00401(this.$n, this.$this_take, dVar);
            c00401.L$0 = obj;
            return c00401;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00401) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0065  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            if (r6.send(r9, r8) == r4) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        
            if (r0 == 0) goto L31;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0075 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 2
                kotlin.y r2 = kotlin.y.a
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L32
                if (r0 == r3) goto L24
                if (r0 != r1) goto L1d
                int r0 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r9)
            L1b:
                r9 = r6
                goto L78
            L1d:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r9)
            L22:
                r9 = 0
                return r9
            L24:
                int r0 = r8.I$0
                java.lang.Object r5 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r9)
                goto L5d
            L32:
                kotlin.a.e(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r0 = r8.$n
                if (r0 != 0) goto L3e
                return r2
            L3e:
                if (r0 < 0) goto L42
                r5 = r3
                goto L43
            L42:
                r5 = 0
            L43:
                if (r5 == 0) goto L7d
                kotlinx.coroutines.channels.ReceiveChannel r5 = r8.$this_take
                kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            L4b:
                r8.L$0 = r9
                r8.L$1 = r5
                r8.I$0 = r0
                r8.label = r3
                java.lang.Object r6 = r5.hasNext(r8)
                if (r6 != r4) goto L5a
                goto L77
            L5a:
                r7 = r6
                r6 = r9
                r9 = r7
            L5d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7c
                java.lang.Object r9 = r5.next()
                r8.L$0 = r6
                r8.L$1 = r5
                r8.I$0 = r0
                r8.label = r1
                java.lang.Object r9 = r6.send(r9, r8)
                if (r9 != r4) goto L1b
            L77:
                return r4
            L78:
                int r0 = r0 + (-1)
                if (r0 != 0) goto L4b
            L7c:
                return r2
            L7d:
                java.lang.String r9 = "Requested element count "
                java.lang.String r1 = " is less than zero."
                java.lang.String r9 = androidx.privacysandbox.ads.adservices.java.internal.a.p(r9, r0, r1)
                net.luminis.tls.engine.impl.c.p(r9)
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, 300, 301}, m = "invokeSuspend")
    public static final class C00411 extends i implements p {
        final /* synthetic */ p $predicate;
        final /* synthetic */ ReceiveChannel $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00411 c00411 = new C00411(this.$this_takeWhile, this.$predicate, dVar);
            c00411.L$0 = obj;
            return c00411;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00411) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r0 r6 r10
  0x0059: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v7 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r6v3 kotlinx.coroutines.channels.ProducerScope) = (r6v5 kotlinx.coroutines.channels.ProducerScope), (r6v7 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r10v8 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0061  */
        /* JADX WARN: Code duplicated, block: B:21:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0084  */
        /* JADX WARN: Code duplicated, block: B:28:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:13:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                kotlin.y r1 = kotlin.y.a
                r2 = 3
                r3 = 2
                r4 = 1
                kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L3e
                if (r0 == r4) goto L32
                if (r0 == r3) goto L24
                if (r0 != r2) goto L1d
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r10)
                goto L4c
            L1d:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r10)
                r10 = 0
                return r10
            L24:
                java.lang.Object r0 = r9.L$2
                java.lang.Object r6 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.a.e(r10)
                goto L7b
            L32:
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.a.e(r10)
                goto L59
            L3e:
                kotlin.a.e(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel r0 = r9.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = r10
            L4c:
                r9.L$0 = r6
                r9.L$1 = r0
                r9.label = r4
                java.lang.Object r10 = r0.hasNext(r9)
                if (r10 != r5) goto L59
                goto L93
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L97
                java.lang.Object r10 = r0.next()
                kotlin.jvm.functions.p r7 = r9.$predicate
                r9.L$0 = r6
                r9.L$1 = r0
                r9.L$2 = r10
                r9.label = r3
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r5) goto L76
                goto L93
            L76:
                r8 = r0
                r0 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L7b:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L84
                return r1
            L84:
                r9.L$0 = r7
                r9.L$1 = r6
                r10 = 0
                r9.L$2 = r10
                r9.label = r2
                java.lang.Object r10 = r7.send(r0, r9)
                if (r10 != r5) goto L94
            L93:
                return r5
            L94:
                r0 = r6
                r6 = r7
                goto L4c
            L97:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 308}, m = "toChannel")
    public static final class C00421<E, C extends SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00421(kotlin.coroutines.d<? super C00421> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toCollection")
    public static final class C00431<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00431(kotlin.coroutines.d<? super C00431> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toMap")
    public static final class AnonymousClass2<K, V, M extends Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", l = {400, 401}, m = "invokeSuspend")
    public static final class C00441 extends i implements p {
        final /* synthetic */ ReceiveChannel $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00441(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_withIndex = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00441 c00441 = new C00441(this.$this_withIndex, dVar);
            c00441.L$0 = obj;
            return c00441;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope producerScope, kotlin.coroutines.d dVar) {
            return ((C00441) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0050  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0078  */
        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:7:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 2
                r2 = 1
                kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L33
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1e
                int r0 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.a.e(r10)
                r10 = r4
                r4 = r0
                r0 = r10
            L1c:
                r10 = r5
                goto L41
            L1e:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r10)
                r10 = 0
                return r10
            L25:
                int r0 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.a.e(r10)
                goto L56
            L33:
                kotlin.a.e(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel r0 = r9.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r4 = 0
            L41:
                r9.L$0 = r10
                r9.L$1 = r0
                r9.I$0 = r4
                r9.label = r2
                java.lang.Object r5 = r0.hasNext(r9)
                if (r5 != r3) goto L50
                goto L77
            L50:
                r8 = r5
                r5 = r10
                r10 = r8
                r8 = r4
                r4 = r0
                r0 = r8
            L56:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L7b
                java.lang.Object r10 = r4.next()
                kotlin.collections.x r6 = new kotlin.collections.x
                int r7 = r0 + 1
                r6.<init>(r0, r10)
                r9.L$0 = r5
                r9.L$1 = r4
                r9.I$0 = r7
                r9.label = r1
                java.lang.Object r10 = r5.send(r6, r9)
                if (r10 != r3) goto L78
            L77:
                return r3
            L78:
                r0 = r4
                r4 = r7
                goto L1c
            L7b:
                kotlin.y r10 = kotlin.y.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00441.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", l = {514, 499, 501}, m = "invokeSuspend")
    public static final class C00452 extends i implements p {
        final /* synthetic */ ReceiveChannel<R> $other;
        final /* synthetic */ ReceiveChannel<E> $this_zip;
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00452(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, p pVar, kotlin.coroutines.d<? super C00452> dVar) {
            super(2, dVar);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00452 c00452 = new C00452(this.$other, this.$this_zip, this.$transform, dVar);
            c00452.L$0 = obj;
            return c00452;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super V> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((C00452) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0099  */
        /* JADX WARN: Code duplicated, block: B:27:0x009a A[Catch: all -> 0x0028, PHI: r0 r6 r7 r8 r9 r13
  0x009a: PHI (r0v6 kotlinx.coroutines.channels.ChannelIterator) = (r0v7 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r6v7 kotlinx.coroutines.channels.ReceiveChannel) = (r6v9 kotlinx.coroutines.channels.ReceiveChannel), (r6v11 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r7v5 kotlin.jvm.functions.p) = (r7v7 kotlin.jvm.functions.p), (r7v9 kotlin.jvm.functions.p) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r8v5 kotlinx.coroutines.channels.ChannelIterator) = (r8v7 kotlinx.coroutines.channels.ChannelIterator), (r8v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r9v5 kotlinx.coroutines.channels.ProducerScope) = (r9v7 kotlinx.coroutines.channels.ProducerScope), (r9v9 kotlinx.coroutines.channels.ProducerScope) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r13v12 java.lang.Object) = (r13v18 java.lang.Object), (r13v0 java.lang.Object) binds: [B:25:0x0097, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0028, blocks: (B:8:0x0024, B:24:0x0085, B:27:0x009a, B:29:0x00a2, B:20:0x0068, B:23:0x007d), top: B:49:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:8:0x0024, B:24:0x0085, B:27:0x009a, B:29:0x00a2, B:20:0x0068, B:23:0x007d), top: B:49:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ca A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:33:0x00c2, B:35:0x00ca, B:15:0x0048), top: B:45:0x0048 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00452.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object any(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
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
        Object objHasNext = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                anonymousClass1.L$0 = receiveChannel;
                anonymousClass1.label = 1;
                objHasNext = it.hasNext(anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objHasNext == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannel = (ReceiveChannel) anonymousClass1.L$0;
                kotlin.a.e(objHasNext);
            }
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return objHasNext;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    @ObsoleteCoroutinesApi
    @kotlin.c
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, l lVar) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            return (R) lVar.invoke(receiveChannelOpenSubscription);
        } finally {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0062, B:29:0x006a), top: B:43:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r6, kotlin.jvm.functions.l r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00121
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.l) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L36
            r5 = r0
            r0 = r7
            r7 = r1
        L34:
            r1 = r5
            goto L62
        L36:
            r6 = move-exception
            goto L84
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3f:
            kotlin.a.e(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.openSubscription()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L80
            r5 = r8
            r8 = r6
            r6 = r5
        L4d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L7d
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7d
            r0.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7d
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r4) goto L5e
            return r4
        L5e:
            r5 = r0
            r0 = r8
            r8 = r1
            goto L34
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L74
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L74
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L74
            r8 = r0
            r0 = r1
            goto L4d
        L74:
            r6 = move-exception
            r7 = r0
            goto L84
        L77:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r0, r2, r3, r2)
            kotlin.y r6 = kotlin.y.a
            return r6
        L7d:
            r6 = move-exception
            r7 = r8
            goto L84
        L80:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L84:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r2, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, kotlin.jvm.functions.l, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.c
    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, l lVar, kotlin.coroutines.d<? super y> dVar) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            ChannelIterator<E> it = receiveChannelOpenSubscription.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                lVar.invoke(it.next());
            }
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            return y.a;
        } catch (Throwable th) {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }

    public static final l consumes(ReceiveChannel<?> receiveChannel) {
        return new b(receiveChannel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y consumes$lambda$24$ChannelsKt__DeprecatedKt(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return y.a;
    }

    public static final l consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new b(receiveChannelArr, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y consumesAll$lambda$2$ChannelsKt__DeprecatedKt(ReceiveChannel[] receiveChannelArr, Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                ChannelsKt.cancelConsumed(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    kotlin.a.a(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return y.a;
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x002d, B:26:0x005d, B:28:0x0065), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005a -> B:26:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00131
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00131) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$0
            kotlin.jvm.internal.x r3 = (kotlin.jvm.internal.x) r3
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L5d
        L31:
            r6 = move-exception
            goto L81
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3a:
            kotlin.a.e(r7)
            kotlin.jvm.internal.x r7 = new kotlin.jvm.internal.x
            r7.<init>()
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r3 = r7
            r7 = r6
            r6 = r1
        L49:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L7b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7b
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7b
            r0.label = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7b
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r4) goto L5a
            return r4
        L5a:
            r5 = r1
            r1 = r7
            r7 = r5
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L6f
            r6.next()     // Catch: java.lang.Throwable -> L31
            int r7 = r3.e     // Catch: java.lang.Throwable -> L31
            int r7 = r7 + r2
            r3.e = r7     // Catch: java.lang.Throwable -> L31
            r7 = r1
            goto L49
        L6f:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r6)
            int r6 = r3.e
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L7b:
            r6 = move-exception
            r1 = r7
            goto L81
        L7e:
            r7 = move-exception
            r1 = r6
            r6 = r7
        L81:
            throw r6     // Catch: java.lang.Throwable -> L82
        L82:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        return distinctBy$default(receiveChannel, null, new C00141(null), 1, null);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00151(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, iVar, pVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i, kotlin.coroutines.i iVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00161(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, kotlin.coroutines.i iVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i, iVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00171(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, iVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:26:0x0061, B:28:0x0069, B:34:0x007a, B:35:0x0091), top: B:45:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:26:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00181
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 46
            r3 = 1
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            if (r1 == 0) goto L3f
            if (r1 != r3) goto L38
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L61
        L35:
            r8 = move-exception
            goto Lab
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L3f:
            kotlin.a.e(r10)
            if (r9 < 0) goto L96
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L92
            r1 = 0
        L49:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L92
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L92
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L92
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L92
            r0.label = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L92
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r5 != r6) goto L5c
            return r6
        L5c:
            r7 = r5
            r5 = r8
            r8 = r1
            r1 = r10
            r10 = r7
        L61:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L35
            int r6 = r8 + 1
            if (r9 != r8) goto L76
            r8 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            return r10
        L76:
            r10 = r1
            r8 = r5
            r1 = r6
            goto L49
        L7a:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r10.<init>()     // Catch: java.lang.Throwable -> L35
            r10.append(r4)     // Catch: java.lang.Throwable -> L35
            r10.append(r9)     // Catch: java.lang.Throwable -> L35
            r10.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L35
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L35
            throw r8     // Catch: java.lang.Throwable -> L35
        L92:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto Lab
        L96:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L92
            r0.append(r9)     // Catch: java.lang.Throwable -> L92
            r0.append(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L92
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L92
            throw r10     // Catch: java.lang.Throwable -> L92
        Lab:
            throw r8     // Catch: java.lang.Throwable -> Lac
        Lac:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:28:0x0065, B:30:0x006d, B:23:0x004e, B:22:0x0049), top: B:48:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0061 -> B:28:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, int r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00191
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L40
            if (r1 != r2) goto L39
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.a.e(r9)     // Catch: java.lang.Throwable -> L37
            r6 = r1
            r1 = r7
            r7 = r4
            r4 = r0
            r0 = r6
            goto L65
        L37:
            r7 = move-exception
            goto L85
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L40:
            kotlin.a.e(r9)
            if (r8 >= 0) goto L49
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L49:
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L7d
            r1 = 0
        L4e:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L7d
            r0.I$0 = r8     // Catch: java.lang.Throwable -> L7d
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L7d
            r0.label = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L7d
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r5) goto L61
            return r5
        L61:
            r6 = r0
            r0 = r9
            r9 = r4
            r4 = r6
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L81
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L7d
            int r5 = r1 + 1
            if (r8 != r1) goto L79
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r9
        L79:
            r9 = r0
            r0 = r4
            r1 = r5
            goto L4e
        L7d:
            r8 = move-exception
            r4 = r7
            r7 = r8
            goto L85
        L81:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L85:
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.d):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00201(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, iVar, pVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, q qVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00211(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, iVar, qVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ChannelsKt.filter(receiveChannel, iVar, new C00221(pVar, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, iVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new C00231(null), 1, null);
        receiveChannelFilter$default.getClass();
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0032, B:28:0x006a, B:30:0x0072, B:32:0x0078, B:20:0x004b), top: B:48:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0032, B:28:0x006a, B:30:0x0072, B:32:0x0078, B:20:0x004b), top: B:48:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0076 -> B:35:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:35:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L36
            goto L87
        L36:
            r6 = move-exception
            goto L94
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3f:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L36
            goto L6a
        L4f:
            kotlin.a.e(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L90
        L56:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L90
            if (r1 != r4) goto L65
            goto L86
        L65:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r1
            r1 = r5
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L87
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L36
            r0.label = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r1.send(r8, r0)     // Catch: java.lang.Throwable -> L36
            if (r8 != r4) goto L87
        L86:
            return r4
        L87:
            r8 = r6
            r6 = r7
            r7 = r1
            goto L56
        L8b:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r1
        L90:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L94:
            throw r6     // Catch: java.lang.Throwable -> L95
        L95:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x0050, B:26:0x0058, B:29:0x0061, B:30:0x0068), top: B:41:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #2 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x0050, B:26:0x0058, B:29:0x0061, B:30:0x0068), top: B:41:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object first(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        C00251 c00251;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (dVar instanceof C00251) {
            c00251 = (C00251) dVar;
            int i = c00251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00251.label = i - Integer.MIN_VALUE;
            } else {
                c00251 = new C00251(dVar);
            }
        } else {
            c00251 = new C00251(dVar);
        }
        Object obj = c00251.result;
        int i2 = c00251.label;
        if (i2 != 0) {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channelIterator = (ChannelIterator) c00251.L$1;
            receiveChannel2 = (ReceiveChannel) c00251.L$0;
            try {
                kotlin.a.e(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th3;
                }
            }
        }
        kotlin.a.e(obj);
        try {
            ChannelIterator it = receiveChannel.iterator();
            c00251.L$0 = receiveChannel;
            c00251.L$1 = it;
            c00251.label = 1;
            Object objHasNext = it.hasNext(c00251);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objHasNext == aVar) {
                return aVar;
            }
            receiveChannel2 = receiveChannel;
            channelIterator = it;
            obj = objHasNext;
            if (((Boolean) obj).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            Object next2 = channelIterator.next();
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return next2;
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object firstOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        C00261 c00261;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (dVar instanceof C00261) {
            c00261 = (C00261) dVar;
            int i = c00261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00261.label = i - Integer.MIN_VALUE;
            } else {
                c00261 = new C00261(dVar);
            }
        } else {
            c00261 = new C00261(dVar);
        }
        Object obj = c00261.result;
        int i2 = c00261.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c00261.L$0 = receiveChannel;
                c00261.L$1 = it;
                c00261.label = 1;
                Object objHasNext = it.hasNext(c00261);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objHasNext == aVar) {
                    return aVar;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channelIterator = (ChannelIterator) c00261.L$1;
            receiveChannel2 = (ReceiveChannel) c00261.L$0;
            try {
                kotlin.a.e(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return next;
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00271(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, iVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:26:0x0064, B:28:0x006d, B:30:0x0077, B:33:0x0082, B:21:0x004e), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:26:0x0064, B:28:0x006d, B:30:0x0077, B:33:0x0082, B:21:0x004e), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:26:0x0064, B:28:0x006d, B:30:0x0077, B:33:0x0082, B:21:0x004e), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:26:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r6, java.lang.Object r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00281
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L36
            java.lang.Object r6 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.x r1 = (kotlin.jvm.internal.x) r1
            java.lang.Object r3 = r0.L$0
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L33
            goto L64
        L33:
            r6 = move-exception
            goto L97
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3d:
            kotlin.a.e(r8)
            kotlin.jvm.internal.x r8 = new kotlin.jvm.internal.x
            r8.<init>()
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L93
            r5 = r7
            r7 = r6
            r6 = r1
            r1 = r8
            r8 = r5
        L4e:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$3 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L33
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r3 != r4) goto L61
            return r4
        L61:
            r5 = r3
            r3 = r8
            r8 = r5
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            r4 = 0
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            boolean r8 = kotlin.jvm.internal.l.a(r3, r8)     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L82
            int r6 = r1.e     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> L33
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r8
        L82:
            int r8 = r1.e     // Catch: java.lang.Throwable -> L33
            int r8 = r8 + r2
            r1.e = r8     // Catch: java.lang.Throwable -> L33
            r8 = r3
            goto L4e
        L89:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            java.lang.Integer r6 = new java.lang.Integer
            r7 = -1
            r6.<init>(r7)
            return r6
        L93:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L97:
            throw r6     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:37:0x0088, B:39:0x0090), top: B:51:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:37:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00291
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L38
            java.lang.Object r6 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L34
            goto L88
        L34:
            r6 = move-exception
            r1 = r3
            goto La7
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3f:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L4b
            goto L66
        L4b:
            r6 = move-exception
            goto La7
        L4e:
            kotlin.a.e(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9b
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r0.label = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9b
            if (r1 != r4) goto L62
            goto L83
        L62:
            r5 = r1
            r1 = r6
            r6 = r7
            r7 = r5
        L66:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4b
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4b
            r5 = r1
            r1 = r6
            r6 = r5
        L75:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9b
            r0.label = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r3 = r1.hasNext(r0)     // Catch: java.lang.Throwable -> L9b
            if (r3 != r4) goto L84
        L83:
            return r4
        L84:
            r5 = r3
            r3 = r6
            r6 = r7
            r7 = r5
        L88:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L96
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L34
            r6 = r3
            goto L75
        L96:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
            return r6
        L9b:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto La7
        L9f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            throw r6     // Catch: java.lang.Throwable -> L4b
        La7:
            throw r6     // Catch: java.lang.Throwable -> La8
        La8:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:31:0x0088, B:21:0x005a), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:31:0x0088, B:21:0x005a), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006f -> B:26:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00301
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L3a
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$2
            kotlin.jvm.internal.x r1 = (kotlin.jvm.internal.x) r1
            java.lang.Object r3 = r0.L$1
            kotlin.jvm.internal.x r3 = (kotlin.jvm.internal.x) r3
            java.lang.Object r4 = r0.L$0
            kotlin.a.e(r9)     // Catch: java.lang.Throwable -> L37
            goto L72
        L37:
            r7 = move-exception
            goto L9f
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L41:
            kotlin.a.e(r9)
            kotlin.jvm.internal.x r9 = new kotlin.jvm.internal.x
            r9.<init>()
            r1 = -1
            r9.e = r1
            kotlin.jvm.internal.x r1 = new kotlin.jvm.internal.x
            r1.<init>()
            kotlinx.coroutines.channels.ChannelIterator r3 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r9
            r9 = r6
        L5a:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L37
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L37
            r0.L$2 = r1     // Catch: java.lang.Throwable -> L37
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L37
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L37
            r0.label = r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L37
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r5) goto L6f
            return r5
        L6f:
            r6 = r4
            r4 = r9
            r9 = r6
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.l.a(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L88
            int r9 = r1.e     // Catch: java.lang.Throwable -> L37
            r3.e = r9     // Catch: java.lang.Throwable -> L37
        L88:
            int r9 = r1.e     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r2
            r1.e = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L5a
        L8f:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r7 = r3.e
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L9b:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9f:
            throw r7     // Catch: java.lang.Throwable -> La0
        La0:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:39:0x008c, B:41:0x0094), top: B:53:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0088 -> B:39:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00311
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L40
            if (r1 != r2) goto L39
            java.lang.Object r7 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L35
            goto L8c
        L35:
            r7 = move-exception
            r1 = r3
            goto La1
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L40:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L4c
            goto L66
        L4c:
            r7 = move-exception
            goto La1
        L4e:
            kotlin.a.e(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9e
            r0.label = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r1 != r5) goto L62
            goto L87
        L62:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r8 != 0) goto L72
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r4)
            return r4
        L72:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4c
            r6 = r1
            r1 = r7
            r7 = r6
        L79:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L9e
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9e
            r0.label = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r3 = r1.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r3 != r5) goto L88
        L87:
            return r5
        L88:
            r6 = r3
            r3 = r7
            r7 = r8
            r8 = r6
        L8c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L9a
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L35
            r7 = r3
            goto L79
        L9a:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r7
        L9e:
            r8 = move-exception
            r1 = r7
            r7 = r8
        La1:
            throw r7     // Catch: java.lang.Throwable -> La2
        La2:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.d):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00321(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, iVar, pVar);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.i iVar, q qVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00331(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, iVar, qVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, q qVar) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, iVar, qVar));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, iVar, qVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, iVar, pVar));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, iVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:40:0x00a0, B:42:0x00a8, B:36:0x008b, B:26:0x005f), top: B:56:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009c -> B:15:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00341
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L5c
            if (r1 == r3) goto L49
            if (r1 != r2) goto L42
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L3e
            r7 = r0
            r0 = r8
            r8 = r1
        L3b:
            r1 = r7
            goto La0
        L3e:
            r8 = move-exception
            r9 = r1
            goto Lbf
        L42:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L49:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r1 = r0.L$0
            java.util.Comparator r1 = (java.util.Comparator) r1
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L59
            goto L77
        L59:
            r8 = move-exception
            goto Lbf
        L5c:
            kotlin.a.e(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb6
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lb6
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb6
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Lb6
            r0.label = r3     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r5) goto L72
            goto L9b
        L72:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r1
            r1 = r7
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L59
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L83
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L83:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L59
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r1
        L8b:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Lb6
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb6
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Lb6
            r0.L$3 = r10     // Catch: java.lang.Throwable -> Lb6
            r0.label = r2     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r5) goto L9c
        L9b:
            return r5
        L9c:
            r7 = r0
            r0 = r10
            r10 = r1
            goto L3b
        La0:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb6
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r3.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb6
            if (r6 >= 0) goto Lb4
        Lb2:
            r0 = r1
            goto L8b
        Lb4:
            r10 = r0
            goto Lb2
        Lb6:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lbf
        Lbb:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r0
        Lbf:
            throw r8     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:40:0x00a0, B:42:0x00a8, B:36:0x008b, B:26:0x005f), top: B:56:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009c -> B:15:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00351
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L5c
            if (r1 == r3) goto L49
            if (r1 != r2) goto L42
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L3e
            r7 = r0
            r0 = r8
            r8 = r1
        L3b:
            r1 = r7
            goto La0
        L3e:
            r8 = move-exception
            r9 = r1
            goto Lbf
        L42:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L49:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r1 = r0.L$0
            java.util.Comparator r1 = (java.util.Comparator) r1
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L59
            goto L77
        L59:
            r8 = move-exception
            goto Lbf
        L5c:
            kotlin.a.e(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb6
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lb6
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb6
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Lb6
            r0.label = r3     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r5) goto L72
            goto L9b
        L72:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r1
            r1 = r7
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L59
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L83
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L83:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L59
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r1
        L8b:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Lb6
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb6
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Lb6
            r0.L$3 = r10     // Catch: java.lang.Throwable -> Lb6
            r0.label = r2     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r5) goto L9c
        L9b:
            return r5
        L9c:
            r7 = r0
            r0 = r10
            r10 = r1
            goto L3b
        La0:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb6
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r3.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb6
            if (r6 <= 0) goto Lb4
        Lb2:
            r0 = r1
            goto L8b
        Lb4:
            r10 = r0
            goto Lb2
        Lb6:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lbf
        Lbb:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r0
        Lbf:
            throw r8     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object none(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        C00361 c00361;
        if (dVar instanceof C00361) {
            c00361 = (C00361) dVar;
            int i = c00361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00361.label = i - Integer.MIN_VALUE;
            } else {
                c00361 = new C00361(dVar);
            }
        } else {
            c00361 = new C00361(dVar);
        }
        Object objHasNext = c00361.result;
        int i2 = c00361.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                c00361.L$0 = receiveChannel;
                c00361.label = 1;
                objHasNext = it.hasNext(c00361);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objHasNext == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannel = (ReceiveChannel) c00361.L$0;
                kotlin.a.e(objHasNext);
            }
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) objHasNext).booleanValue());
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return boolValueOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        return map$default(receiveChannel, null, new C00371(receiveChannel, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0061, B:31:0x0069, B:41:0x0093, B:42:0x009a), top: B:51:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x007e, B:39:0x008b, B:40:0x0092), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #1 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0061, B:31:0x0069, B:41:0x0093, B:42:0x009a), top: B:51:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object single(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        C00381 c00381;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        Object next;
        Object objHasNext;
        Object obj;
        ReceiveChannel receiveChannel3;
        if (dVar instanceof C00381) {
            c00381 = (C00381) dVar;
            int i = c00381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00381.label = i - Integer.MIN_VALUE;
            } else {
                c00381 = new C00381(dVar);
            }
        } else {
            c00381 = new C00381(dVar);
        }
        Object obj2 = c00381.result;
        int i2 = c00381.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c00381.L$0 = receiveChannel;
                c00381.L$1 = it;
                c00381.label = 1;
                Object objHasNext2 = it.hasNext(c00381);
                if (objHasNext2 != aVar) {
                    receiveChannel2 = receiveChannel;
                    channelIterator = it;
                    obj2 = objHasNext2;
                    if (((Boolean) obj2).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    next = channelIterator.next();
                    c00381.L$0 = receiveChannel2;
                    c00381.L$1 = next;
                    c00381.label = 2;
                    objHasNext = channelIterator.hasNext(c00381);
                    if (objHasNext != aVar) {
                        obj2 = objHasNext;
                        obj = next;
                        receiveChannel3 = receiveChannel2;
                        if (((Boolean) obj2).booleanValue()) {
                            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                        }
                        ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return obj;
                    }
                }
                return aVar;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c00381.L$1;
            receiveChannel3 = (ReceiveChannel) c00381.L$0;
            try {
                kotlin.a.e(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        channelIterator = (ChannelIterator) c00381.L$1;
        receiveChannel2 = (ReceiveChannel) c00381.L$0;
        try {
            kotlin.a.e(obj2);
            if (((Boolean) obj2).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            next = channelIterator.next();
            c00381.L$0 = receiveChannel2;
            c00381.L$1 = next;
            c00381.label = 2;
            objHasNext = channelIterator.hasNext(c00381);
            if (objHasNext != aVar) {
                obj2 = objHasNext;
                obj = next;
                receiveChannel3 = receiveChannel2;
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @kotlin.c
    public static final Object singleOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        C00391 c00391;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        Object obj;
        ReceiveChannel receiveChannel3;
        if (dVar instanceof C00391) {
            c00391 = (C00391) dVar;
            int i = c00391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00391.label = i - Integer.MIN_VALUE;
            } else {
                c00391 = new C00391(dVar);
            }
        } else {
            c00391 = new C00391(dVar);
        }
        Object obj2 = c00391.result;
        int i2 = c00391.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c00391.L$0 = receiveChannel;
                c00391.L$1 = it;
                c00391.label = 1;
                Object objHasNext = it.hasNext(c00391);
                if (objHasNext != aVar) {
                    receiveChannel2 = receiveChannel;
                    channelIterator = it;
                    obj2 = objHasNext;
                }
                return aVar;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c00391.L$1;
            receiveChannel3 = (ReceiveChannel) c00391.L$0;
            try {
                kotlin.a.e(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    ChannelsKt.cancelConsumed(receiveChannel3, null);
                    return null;
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        channelIterator = (ChannelIterator) c00391.L$1;
        receiveChannel2 = (ReceiveChannel) c00391.L$0;
        try {
            kotlin.a.e(obj2);
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
        if (!((Boolean) obj2).booleanValue()) {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        c00391.L$0 = receiveChannel2;
        c00391.L$1 = next;
        c00391.label = 2;
        Object objHasNext2 = channelIterator.hasNext(c00391);
        if (objHasNext2 != aVar) {
            obj2 = objHasNext2;
            obj = next;
            receiveChannel3 = receiveChannel2;
            if (((Boolean) obj2).booleanValue()) {
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return null;
            }
            ChannelsKt.cancelConsumed(receiveChannel3, null);
            return obj;
        }
        return aVar;
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i, kotlin.coroutines.i iVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00401(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, kotlin.coroutines.i iVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i, iVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00411(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, iVar, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:28:0x006d, B:30:0x0075, B:20:0x004e), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r1.send(r8, r0) == r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, kotlin.coroutines.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00421
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L52
            if (r1 == r3) goto L42
            if (r1 != r2) goto L3b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L39
        L35:
            r8 = r6
            r6 = r7
            r7 = r1
            goto L59
        L39:
            r6 = move-exception
            goto L91
        L3b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L42:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L39
            goto L6d
        L52:
            kotlin.a.e(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8d
        L59:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L8d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L8d
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L8d
            r0.label = r3     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L8d
            if (r1 != r4) goto L68
            goto L87
        L68:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r1
            r1 = r5
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L88
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L39
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L39
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L39
            r0.label = r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r1.send(r8, r0)     // Catch: java.lang.Throwable -> L39
            if (r8 != r4) goto L35
        L87:
            return r4
        L88:
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r1
        L8d:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L91:
            throw r6     // Catch: java.lang.Throwable -> L92
        L92:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x0059, B:28:0x0061, B:21:0x0045), top: B:38:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, C r6, kotlin.coroutines.d<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00431
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r1 = r0.L$0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L59
        L31:
            r5 = move-exception
            goto L73
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L3a:
            kotlin.a.e(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L6f
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L45:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L31
            r0.label = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r3) goto L56
            return r3
        L56:
            r4 = r1
            r1 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L31
            r1.add(r7)     // Catch: java.lang.Throwable -> L31
            r7 = r1
            goto L45
        L6a:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r1
        L6f:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L73:
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x0059, B:28:0x0061, B:21:0x0045), top: B:38:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.k> r5, M r6, kotlin.coroutines.d<? super M> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r1 = r0.L$0
            java.util.Map r1 = (java.util.Map) r1
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L59
        L31:
            r5 = move-exception
            goto L79
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L3a:
            kotlin.a.e(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L75
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L45:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L31
            r0.label = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r3) goto L56
            return r3
        L56:
            r4 = r1
            r1 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L70
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L31
            kotlin.k r7 = (kotlin.k) r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r7.e     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r7.y     // Catch: java.lang.Throwable -> L31
            r1.put(r3, r7)     // Catch: java.lang.Throwable -> L31
            r7 = r1
            goto L45
        L70:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r1
        L75:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L79:
            throw r5     // Catch: java.lang.Throwable -> L7a
        L7a:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.c
    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        return ChannelsKt.toCollection(receiveChannel, new ArrayList(), dVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d<? super Set<E>> dVar) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), dVar);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumes(receiveChannel), new C00441(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, kotlin.coroutines.i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, iVar);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.i iVar, p pVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, iVar, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new C00452(receiveChannel2, receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, kotlin.coroutines.i iVar, p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k zip$lambda$23$ChannelsKt__DeprecatedKt(Object obj, Object obj2) {
        return new k(obj, obj2);
    }

    @kotlin.c
    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        return zip$default(receiveChannel, receiveChannel2, null, new c(), 2, null);
    }

    @kotlin.c
    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        return ChannelsKt.toMap(receiveChannel, new LinkedHashMap(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:21:0x0045), top: B:42:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:21:0x0045), top: B:42:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.c
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00241
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r1 = r0.L$0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L59
        L31:
            r5 = move-exception
            goto L75
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L3a:
            kotlin.a.e(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L71
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L45:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L31
            r0.label = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r3) goto L56
            return r3
        L56:
            r4 = r1
            r1 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L31
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L6c
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L6a
            r1.add(r7)     // Catch: java.lang.Throwable -> L31
        L6a:
            r7 = r1
            goto L45
        L6c:
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r1
        L71:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L75:
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }
}
