package j$.nio.file.attribute;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements java.nio.file.attribute.FileAttribute {
    public final /* synthetic */ FileAttribute a;

    public k(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.desugar.sun.nio.fs.g.l((Set) this.a.value()));
    }
}
