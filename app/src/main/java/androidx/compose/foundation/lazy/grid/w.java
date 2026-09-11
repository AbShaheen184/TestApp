package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.i1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ x A;
    public int B;
    public i1 e;
    public kotlin.coroutines.jvm.internal.i y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, this);
    }
}
