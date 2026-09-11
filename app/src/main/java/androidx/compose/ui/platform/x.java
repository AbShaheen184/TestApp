package androidx.compose.ui.platform;

import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ a0 A;
    public int B;
    public androidx.collection.a0 e;
    public ChannelIterator y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.l(this);
    }
}
