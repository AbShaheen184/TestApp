package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements b0 {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.b0
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.b0
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
