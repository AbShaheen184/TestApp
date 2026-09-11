package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements WatchEvent.Kind {
    public final /* synthetic */ b0 a;

    public final /* synthetic */ boolean equals(Object obj) {
        b0 b0Var = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return b0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
