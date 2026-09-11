package androidx.media3.container;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final /* synthetic */ int e;
    public int y;

    public /* synthetic */ f(int i, int i2) {
        this.e = i2;
        this.y = i;
    }

    public static String d(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(int i) {
        this.y = i | this.y;
    }

    public boolean g(int i) {
        return (this.y & i) == i;
    }

    public abstract int h();

    public abstract int i();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public String toString() {
        switch (this.e) {
            case 0:
                return d(this.y);
            default:
                return super.toString();
        }
    }
}
