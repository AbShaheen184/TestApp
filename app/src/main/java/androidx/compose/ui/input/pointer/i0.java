package androidx.compose.ui.input.pointer;

import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Job e;
    public /* synthetic */ Object y;
    public final /* synthetic */ k0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.g(0L, null, this);
    }
}
