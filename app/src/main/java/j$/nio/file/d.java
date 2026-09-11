package j$.nio.file;

import java.nio.file.FileStore;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d {
    public final /* synthetic */ FileStore a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof d) {
            obj = ((d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public d(FileStore fileStore) {
        this.a = fileStore;
    }
}
