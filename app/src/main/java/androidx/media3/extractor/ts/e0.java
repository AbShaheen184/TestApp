package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public e0(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("generateNewId() must be called before retrieving ids.");
    }

    public e0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
