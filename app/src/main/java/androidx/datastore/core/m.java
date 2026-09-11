package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
