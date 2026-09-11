package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h {
    public static final v e = new v();

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return null;
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
    }
}
