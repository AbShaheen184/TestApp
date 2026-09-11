package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Throwable {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.e;
        synchronized (this) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
            return this;
        }
    }
}
