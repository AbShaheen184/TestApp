package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ q A;
    public int B;
    public String e;
    public kotlin.jvm.functions.l y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, this);
    }
}
