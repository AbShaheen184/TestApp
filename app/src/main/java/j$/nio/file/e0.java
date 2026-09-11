package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Closeable {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ e0(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ e0 a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new e0(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof e0) {
            obj = ((e0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
