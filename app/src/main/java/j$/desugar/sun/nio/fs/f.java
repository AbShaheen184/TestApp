package j$.desugar.sun.nio.fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends FileLock {
    public final FileLock a;

    public f(FileLock fileLock, e eVar) {
        super(eVar, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.a.release();
    }
}
