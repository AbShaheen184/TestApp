package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof c0) {
            obj = ((c0) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
