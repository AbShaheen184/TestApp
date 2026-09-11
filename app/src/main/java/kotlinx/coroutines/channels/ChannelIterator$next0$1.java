package kotlinx.coroutines.channels;

import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", l = {1092}, m = ES6Iterator.NEXT_METHOD)
public final class ChannelIterator$next0$1<E> extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ChannelIterator$next0$1(kotlin.coroutines.d<? super ChannelIterator$next0$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.next(null, this);
    }
}
