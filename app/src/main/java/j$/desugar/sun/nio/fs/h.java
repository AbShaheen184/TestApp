package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.w;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements w, DirectoryStream.Filter, FileAttribute {
    public final Object a;

    public /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public Object value() {
        return Collections.unmodifiableSet(g.l((Set) ((java.nio.file.attribute.FileAttribute) this.a).value()));
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public boolean accept(Object obj) {
        return ((DirectoryStream.Filter) this.a).accept(g.f(obj));
    }

    @Override // j$.nio.file.w
    public boolean a(Path path) {
        return ((Pattern) this.a).matcher(path.toString()).matches();
    }
}
