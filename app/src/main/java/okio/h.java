package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends h0, ReadableByteChannel {
    boolean A(long j, i iVar);

    String B(Charset charset);

    long O(g gVar);

    void R(long j);

    InputStream V();

    int W(v vVar);

    f d();

    i k(long j);

    byte[] n();

    long o(i iVar);

    void p(f fVar, long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    String s(long j);

    void skip(long j);
}
