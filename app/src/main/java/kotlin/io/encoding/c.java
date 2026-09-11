package kotlin.io.encoding;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final a c = new a(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new c(-1, true, false);
        new c(76, false, true);
        new c(64, false, true);
    }

    public c(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            throw null;
        }
    }
}
