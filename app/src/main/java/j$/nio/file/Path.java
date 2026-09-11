package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    boolean B(Path path);

    Path K(Path path);

    boolean equals(Object obj);

    Path getFileName();

    h getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Path normalize();

    d0 r(e0 e0Var, b0[] b0VarArr, c0... c0VarArr);

    Path subpath(int i, int i2);

    Path t(Path path);

    Path toAbsolutePath();

    String toString();

    URI toUri();

    Path v(LinkOption... linkOptionArr);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    int compareTo(Path path);

    boolean z(Path path);

    default boolean startsWith(String str) {
        return z(getFileSystem().b(str, new String[0]));
    }

    default boolean endsWith(String str) {
        return B(getFileSystem().b(str, new String[0]));
    }

    default Path resolve(String str) {
        return t(getFileSystem().b(str, new String[0]));
    }

    default Path D(Path path) {
        path.getClass();
        Path parent = getParent();
        return parent == null ? path : parent.t(path);
    }

    default Path resolveSibling(String str) {
        return D(getFileSystem().b(str, new String[0]));
    }

    default File toFile() {
        if (getFileSystem() == j.a) {
            return new File(toString());
        }
        throw new UnsupportedOperationException("Path not associated with default file system.");
    }

    default d0 X(e0 e0Var, b0... b0VarArr) {
        return r(e0Var, b0VarArr, new c0[0]);
    }

    default Iterator iterator() {
        return new n(this);
    }
}
