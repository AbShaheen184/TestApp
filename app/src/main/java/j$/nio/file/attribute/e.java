package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements BasicFileAttributes {
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes a;

    public /* synthetic */ e(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ BasicFileAttributes a(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof f) {
            return ((f) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new h((DosFileAttributes) basicFileAttributes);
        }
        return basicFileAttributes instanceof PosixFileAttributes ? new u((PosixFileAttributes) basicFileAttributes) : new e(basicFileAttributes);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return j$.desugar.sun.nio.fs.g.c(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.c(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.c(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
