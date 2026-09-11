package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d0, androidx.room.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        switch (this.a) {
            case 0:
                return ((q) this.b).b(str, lVar, cVar);
            default:
                return ((c0) this.b).b(str, lVar, cVar);
        }
    }

    @Override // androidx.room.coroutines.d0
    public final androidx.sqlite.a d() {
        switch (this.a) {
            case 0:
                return ((q) this.b).b;
            default:
                return ((c0) this.b).b;
        }
    }
}
