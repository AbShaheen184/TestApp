package j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements DirectoryStream {
    public final DirectoryStream a;

    public r(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this.a.iterator());
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.a.forEach(new q(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
