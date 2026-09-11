package j$.nio.file;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements java.nio.file.CopyOption {
    public final /* synthetic */ CopyOption a;

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
