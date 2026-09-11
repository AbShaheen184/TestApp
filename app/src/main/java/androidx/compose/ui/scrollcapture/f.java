package androidx.compose.ui.scrollcapture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public final /* synthetic */ g y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.y = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(0.0f, this);
    }
}
