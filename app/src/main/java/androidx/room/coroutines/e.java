package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {
    public kotlin.jvm.internal.z A;
    public kotlin.coroutines.i B;
    public kotlin.jvm.internal.z C;
    public com.google.android.material.shape.g D;
    public /* synthetic */ Object E;
    public final /* synthetic */ g F;
    public int G;
    public boolean e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.F = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.D(false, null, this);
    }
}
