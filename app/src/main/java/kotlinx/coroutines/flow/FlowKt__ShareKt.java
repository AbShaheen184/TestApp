package kotlinx.coroutines.flow;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ShareKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", l = {326}, m = "stateIn")
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.stateIn(null, null, this);
        }
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    private static final <T> SharingConfig<T> configureSharing$FlowKt__ShareKt(Flow<? extends T> flow, int i) {
        ChannelFlow channelFlow;
        Flow<T> flowDropChannelOperators;
        int cHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core = Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core();
        if (i >= cHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core) {
            cHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core = i;
        }
        int i2 = cHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core - i;
        if (!(flow instanceof ChannelFlow) || (flowDropChannelOperators = (channelFlow = (ChannelFlow) flow).dropChannelOperators()) == null) {
            return new SharingConfig<>(flow, i2, BufferOverflow.SUSPEND, j.e);
        }
        int i3 = channelFlow.capacity;
        if (i3 != -3 && i3 != -2 && i3 != 0) {
            i2 = i3;
        } else if (channelFlow.onBufferOverflow == BufferOverflow.SUSPEND) {
            if (i3 == 0) {
                i2 = 0;
            }
        } else if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new SharingConfig<>(flowDropChannelOperators, i2, channelFlow.onBufferOverflow, channelFlow.context);
    }

    private static final <T> Job launchSharing$FlowKt__ShareKt(CoroutineScope coroutineScope, i iVar, Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, SharingStarted sharingStarted, T t) {
        return BuildersKt.launch(coroutineScope, iVar, l.a(sharingStarted, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, t, null));
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(CoroutineScope coroutineScope, i iVar, Flow<? extends T> flow, CompletableDeferred<m> completableDeferred) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, iVar, null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, p pVar) {
        return new SubscribedSharedFlow(sharedFlow, pVar);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i, sharingConfigConfigureSharing$FlowKt__ShareKt.extraBufferCapacity, sharingConfigConfigureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    public static /* synthetic */ SharedFlow shareIn$default(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, kotlin.coroutines.d<? super StateFlow<? extends T>> dVar) {
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
        Object objAwait = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(objAwait);
            SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
            CompletableDeferred CompletableDeferred = CompletableDeferredKt.CompletableDeferred((Job) coroutineScope.getCoroutineContext().get(Job.Key));
            launchSharingDeferred$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, CompletableDeferred);
            anonymousClass1.label = 1;
            objAwait = CompletableDeferred.await(anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objAwait);
        }
        Object obj = ((m) objAwait).e;
        kotlin.a.e(obj);
        return obj;
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(t);
        return new ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, t));
    }
}
