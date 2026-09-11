package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements FileOwnerAttributeView {
    public final /* synthetic */ q a;

    public final /* synthetic */ boolean equals(Object obj) {
        q qVar = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return qVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return y.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(x.a(userPrincipal));
    }
}
