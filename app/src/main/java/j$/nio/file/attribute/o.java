package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements q {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ void b(z zVar) throws IOException {
        this.a.setOwner(y.a(zVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ z getOwner() {
        return x.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.n
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
