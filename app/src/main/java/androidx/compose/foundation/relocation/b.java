package androidx.compose.foundation.relocation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ c C;
    public int D;
    public androidx.compose.ui.geometry.c e;
    public Object[] y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
