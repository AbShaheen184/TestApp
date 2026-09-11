package kotlinx.coroutines.flow;

import coil3.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharing$1 extends i implements p {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ MutableSharedFlow<T> $shared;
    final /* synthetic */ SharingStarted $started;
    final /* synthetic */ Flow<T> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ MutableSharedFlow<T> $shared;
        final /* synthetic */ Flow<T> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, T t, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$upstream = flow;
            this.$shared = mutableSharedFlow;
            this.$initialValue = t;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(SharingCommand sharingCommand, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass2) create(sharingCommand, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    Flow<T> flow = this.$upstream;
                    SharedFlow sharedFlow = this.$shared;
                    this.label = 1;
                    Object objCollect = flow.collect(sharedFlow, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        g.a();
                        return null;
                    }
                    T t = this.$initialValue;
                    Symbol symbol = SharedFlowKt.NO_VALUE;
                    MutableSharedFlow<T> mutableSharedFlow = this.$shared;
                    if (t == symbol) {
                        mutableSharedFlow.resetReplayCache();
                    } else {
                        mutableSharedFlow.tryEmit(t);
                    }
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, T t, kotlin.coroutines.d<? super FlowKt__ShareKt$launchSharing$1> dVar) {
        super(2, dVar);
        this.$started = sharingStarted;
        this.$upstream = flow;
        this.$shared = mutableSharedFlow;
        this.$initialValue = t;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r8.collect(r0, r7) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8.collect(r0, r7) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r0, r7) == r5) goto L28;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1a
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L13
            goto L1e
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L1a:
            kotlin.a.e(r8)
            goto L59
        L1e:
            kotlin.a.e(r8)
            goto L8a
        L22:
            kotlin.a.e(r8)
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r6 = r0.getEagerly()
            if (r8 != r6) goto L3c
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r7.$shared
            r7.label = r4
            java.lang.Object r8 = r8.collect(r0, r7)
            if (r8 != r5) goto L8a
            goto L89
        L3c:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted r0 = r0.getLazily()
            r4 = 0
            if (r8 != r0) goto L66
            kotlinx.coroutines.flow.MutableSharedFlow<T> r8 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r8 = r8.getSubscriptionCount()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r0.<init>(r4)
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0, r7)
            if (r8 != r5) goto L59
            goto L89
        L59:
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r7.$shared
            r7.label = r2
            java.lang.Object r8 = r8.collect(r0, r7)
            if (r8 != r5) goto L8a
            goto L89
        L66:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r0 = r0.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r8 = r8.command(r0)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<T> r2 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r7.$shared
            T r6 = r7.$initialValue
            r0.<init>(r2, r3, r6, r4)
            r7.label = r1
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r0, r7)
            if (r8 != r5) goto L8a
        L89:
            return r5
        L8a:
            kotlin.y r8 = kotlin.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i), dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                kotlin.a.e(obj);
                return Boolean.valueOf(this.I$0 > 0);
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // kotlin.jvm.functions.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (kotlin.coroutines.d<? super Boolean>) obj2);
        }
    }
}
