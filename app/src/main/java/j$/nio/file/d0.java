package j$.nio.file;

import java.nio.file.WatchKey;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ d0(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ d0 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new d0(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
