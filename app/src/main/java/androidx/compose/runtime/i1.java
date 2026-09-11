package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public kotlin.jvm.functions.l e;
    public /* synthetic */ Object y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(e eVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this, null);
    }
}
