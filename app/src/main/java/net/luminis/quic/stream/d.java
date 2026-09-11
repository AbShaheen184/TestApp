package net.luminis.quic.stream;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("Stream is not writable");
    }

    @Override // net.luminis.quic.stream.o
    public final void a() {
    }

    @Override // net.luminis.quic.stream.o
    public final void g(long j) {
    }
}
