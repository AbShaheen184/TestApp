package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f extends h {
    public final /* synthetic */ FileSystem a;

    public static /* synthetic */ h k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof g ? ((g) fileSystem).a : new f(fileSystem);
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ Iterable a() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return o.u(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ w c(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof v ? ((v) pathMatcher).a : new u(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ String e() {
        return this.a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ j$.nio.file.attribute.a0 f() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.a0(userPrincipalLookupService);
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ boolean g() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ e0 h() {
        return e0.a(this.a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ j$.nio.file.spi.c i() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.h
    public final /* synthetic */ Set j() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // j$.nio.file.h
    public final Iterable d() {
        return new s(this.a.getRootDirectories());
    }

    public f(FileSystem fileSystem) {
        this.a = fileSystem;
    }
}
