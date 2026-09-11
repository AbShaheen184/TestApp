package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ g(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public h a() {
        if (this.a || !(this.b || this.c)) {
            return new h(this);
        }
        net.luminis.tls.engine.impl.c.r("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
