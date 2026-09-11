package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final String a;
    public final boolean b;
    public c c;
    public long d;

    public a(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
