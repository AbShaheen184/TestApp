package kotlin.time;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public static final g b = new g(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // kotlin.time.h
    public f a() {
        return new f(e.b());
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = e.b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }
}
