package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements j1 {
    public static final g0 b = new g0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g0(int i) {
        this.a = i;
    }

    @Override // com.google.protobuf.j1
    public final v1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    try {
                        return (v1) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
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

    @Override // com.google.protobuf.j1
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
