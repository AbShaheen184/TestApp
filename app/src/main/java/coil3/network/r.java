package coil3.network;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements AutoCloseable {
    public final okio.h e;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.e.equals(((r) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.e + ")";
    }
}
