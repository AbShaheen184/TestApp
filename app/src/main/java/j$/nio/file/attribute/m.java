package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements FileAttributeView {
    public final /* synthetic */ n a;

    public final /* synthetic */ boolean equals(Object obj) {
        n nVar = this.a;
        if (obj instanceof m) {
            obj = ((m) obj).a;
        }
        return nVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
