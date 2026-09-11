package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    public interface Filter<T> {
        boolean accept(T t);
    }

    Iterator<T> iterator();
}
