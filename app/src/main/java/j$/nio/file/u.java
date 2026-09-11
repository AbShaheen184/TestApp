package j$.nio.file;

import java.nio.file.PathMatcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements w {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ u(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.w
    public final /* synthetic */ boolean a(Path path) {
        return this.a.matches(p.u(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
