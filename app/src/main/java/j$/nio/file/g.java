package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g extends FileSystem {
    public final /* synthetic */ h a;

    public /* synthetic */ g(h hVar) {
        this.a = hVar;
    }

    public static /* synthetic */ FileSystem a(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof f ? ((f) hVar).a : new g(hVar);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        h hVar = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return hVar.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return p.u(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        w wVarC = this.a.c(str);
        if (wVarC == null) {
            return null;
        }
        return wVarC instanceof u ? ((u) wVarC).a : new v(wVarC);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.a0 a0VarF = this.a.f();
        int i = j$.nio.file.attribute.b0.a;
        if (a0VarF == null) {
            return null;
        }
        return a0VarF.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        e0 e0VarH = this.a.h();
        if (e0VarH == null) {
            return null;
        }
        return e0VarH.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarI = this.a.i();
        int i = j$.nio.file.spi.b.b;
        if (cVarI == null) {
            return null;
        }
        return cVarI instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarI).b : new j$.nio.file.spi.b(cVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.j();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new s(this.a.d());
    }
}
