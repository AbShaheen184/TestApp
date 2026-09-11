package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.l;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", l = {Token.INSTANCEOF}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Object $element;
        final /* synthetic */ SendChannel $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendChannel sendChannel, Object obj, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_sendBlocking = sendChannel;
            this.$element = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$this_sendBlocking, this.$element, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                SendChannel sendChannel = this.$this_sendBlocking;
                Object obj2 = this.$element;
                this.label = 1;
                Object objSend = sendChannel.send(obj2, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSend == aVar) {
                    return aVar;
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

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {Token.GETELEM}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ E $element;
        final /* synthetic */ SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SendChannel<? super E> sendChannel, E e, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_trySendBlocking = sendChannel;
            this.$element = e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_trySendBlocking, this.$element, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super ChannelResult<y>> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.a);
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
            Object lVar;
            int i = this.label;
            y yVar = y.a;
            try {
                if (i == 0) {
                    kotlin.a.e(obj);
                    SendChannel<E> sendChannel = this.$this_trySendBlocking;
                    E e = this.$element;
                    this.label = 1;
                    Object objSend = sendChannel.send(e, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objSend == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                lVar = yVar;
            } catch (Throwable th) {
                lVar = new l(th);
            }
            return ChannelResult.m42boximpl(!(lVar instanceof l) ? ChannelResult.Companion.m57successJP2dKIU(yVar) : ChannelResult.Companion.m55closedJP2dKIU(m.a(lVar)));
        }
    }

    @kotlin.c
    public static final /* synthetic */ void sendBlocking(SendChannel sendChannel, Object obj) {
        if (ChannelResult.m52isSuccessimpl(sendChannel.mo28trySendJP2dKIU(obj))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(sendChannel, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        Object objMo28trySendJP2dKIU = sendChannel.mo28trySendJP2dKIU(e);
        if (objMo28trySendJP2dKIU instanceof ChannelResult.Failed) {
            return ((ChannelResult) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass2(sendChannel, e, null), 1, null)).m54unboximpl();
        }
        return ChannelResult.Companion.m57successJP2dKIU(y.a);
    }
}
