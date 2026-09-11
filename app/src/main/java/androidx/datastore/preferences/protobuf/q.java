package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j0 {
    public static final q b = new q(0);
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final t0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (t.class.isAssignableFrom(cls)) {
                    try {
                        return (t0) t.d(cls.asSubclass(t.class)).c(3);
                    } catch (Exception e) {
                        androidx.media3.exoplayer.hls.playlist.a.j("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    net.luminis.tls.engine.impl.c.o("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return t.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
