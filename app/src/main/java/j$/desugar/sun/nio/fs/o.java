package j$.desugar.sun.nio.fs;

import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.b0;
import j$.nio.file.c0;
import j$.nio.file.d0;
import j$.nio.file.e0;
import j$.util.stream.DesugarCollectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Path {
    public static final Pattern h = Pattern.compile("/+");
    public final j$.nio.file.h a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public o(j$.nio.file.h hVar, String str, String str2, String str3) {
        this(hVar, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) Arrays.stream(h.split(str)).filter(new n()).collect(DesugarCollectors.toUnmodifiableList()), str2, str3);
    }

    public o(j$.nio.file.h hVar, boolean z, List list, String str, String str2) {
        this.a = hVar;
        this.d = z;
        this.c = list;
        this.b = (z ? "/" : "").concat(g.n(list));
        this.e = str;
        this.f = str2;
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.h getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final Path v(LinkOption[] linkOptionArr) {
        this.a.i().a(this, j$.nio.file.a.READ);
        if (Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new o(this.a, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        j$.nio.file.h hVar = this.a;
        String str = this.e;
        return new o(hVar, str, str, this.f).t(this);
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        j$.nio.file.h hVar = this.a;
        String str = this.f;
        return new o(hVar, str, this.e, str);
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        if (this.c.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        j$.nio.file.h hVar = this.a;
        List list = this.c;
        return new o(hVar, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        int size = this.c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d) {
            sb.append("/");
        }
        sb.append(g.n(this.c.subList(0, size - 1)));
        return new o(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o getName(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new o(this.a, (String) this.c.get(i), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new o(this.a, g.n(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return z(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean z(Path path) {
        int nameCount;
        Objects.requireNonNull(path);
        if (!(path instanceof o) || this.d != path.isAbsolute() || this.c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return B(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean B(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        if (this.c.size() < nameCount) {
            return false;
        }
        int size = this.c.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    /* JADX INFO: renamed from: x */
    public final int compareTo(Path path) {
        return this.b.compareTo(((o) path).b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new o(this.a, (this.d ? "/" : "").concat(g.n(arrayDeque)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final o t(Path path) {
        if (path instanceof o) {
            if (((o) path).d) {
                return (o) path;
            }
            return new o(this.a, this.b + "/" + path, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final o D(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.t(path);
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return D(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path K(Path path) {
        if (path instanceof o) {
            if (this.d != ((o) path).d) {
                j$.nio.file.k.a("'other' is different type of Path in absolute property.");
                return null;
            }
            List list = ((o) path).c;
            int size = this.c.size();
            int size2 = list.size();
            int i = 0;
            while (i < size && i < size2 && ((String) this.c.get(i)).equals(list.get(i))) {
                i++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = i; i2 < size; i2++) {
                arrayList.add("..");
            }
            while (i < size2) {
                arrayList.add((String) list.get(i));
                i++;
            }
            return new o(this.a, false, arrayList, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(q.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = p.a;
            long j2 = p.b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = p.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final d0 r(e0 e0Var, b0[] b0VarArr, c0... c0VarArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.n(this);
    }
}
