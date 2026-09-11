package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements n {
    public final /* synthetic */ FileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.n
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
