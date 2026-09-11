package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final p a = new p();

    public final void a() {
        try {
            ((q) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(p.class).newInstance(this.a)).a();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
