package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements d {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ b(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.e(fileTime), j$.desugar.sun.nio.fs.g.e(fileTime2), j$.desugar.sun.nio.fs.g.e(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.n
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.a.readAttributes());
    }
}
