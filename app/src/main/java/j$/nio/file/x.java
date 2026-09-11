package j$.nio.file;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements b0 {
    public final String a;
    public final Class b;

    public x(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    @Override // j$.nio.file.b0
    public final String name() {
        return this.a;
    }

    @Override // j$.nio.file.b0
    public final Class type() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
