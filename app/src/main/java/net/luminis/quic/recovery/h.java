package net.luminis.quic.recovery;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final net.luminis.quic.log.a a;
    public volatile int f;
    public volatile int c = Integer.MAX_VALUE;
    public volatile int d = -1;
    public volatile int e = -1;
    public volatile int b = 500;
    public volatile int g = 25;

    public h(net.luminis.quic.log.a aVar) {
        this.a = aVar;
    }

    public final int a() {
        return this.e == -1 ? this.b / 4 : this.e;
    }

    public final int b() {
        return this.d == -1 ? this.b : this.d;
    }
}
