package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ kotlin.jvm.functions.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, kotlin.jvm.functions.a aVar) {
        super(str, true);
        this.f = aVar;
    }

    @Override // okhttp3.internal.concurrent.a
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.invoke();
                return -1L;
            default:
                return ((Number) this.f.invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z, kotlin.jvm.functions.a aVar) {
        super(str, z);
        this.f = aVar;
    }
}
