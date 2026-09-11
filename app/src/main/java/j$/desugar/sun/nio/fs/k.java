package j$.desugar.sun.nio.fs;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements DirectoryStream {
    public l a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return this.a;
    }
}
