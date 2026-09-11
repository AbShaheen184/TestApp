package net.luminis.quic.crypto;

import androidx.media3.exoplayer.dash.manifest.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    @Override // net.luminis.quic.crypto.a
    public final t f() {
        return new t(new androidx.media3.container.a("HmacSHA384", false), 13);
    }

    @Override // net.luminis.quic.crypto.a
    public final short g() {
        return (short) 48;
    }

    @Override // net.luminis.quic.crypto.a
    public final short h() {
        return (short) 32;
    }
}
