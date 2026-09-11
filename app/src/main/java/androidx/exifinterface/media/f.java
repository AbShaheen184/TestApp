package androidx.exifinterface.media;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.e.mark(Integer.MAX_VALUE);
        } else {
            net.luminis.tls.engine.impl.c.o("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void g(long j) throws IOException {
        int i = this.y;
        if (i > j) {
            this.y = 0;
            this.e.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.e.mark(Integer.MAX_VALUE);
    }
}
