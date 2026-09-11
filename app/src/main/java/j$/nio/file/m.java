package j$.nio.file;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements java.nio.file.OpenOption {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ m(OpenOption openOption) {
        this.a = openOption;
    }

    public static /* synthetic */ java.nio.file.OpenOption a(OpenOption openOption) {
        if (openOption == null) {
            return null;
        }
        if (openOption instanceof l) {
            return ((l) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof StandardOpenOption ? j$.desugar.sun.nio.fs.g.d((StandardOpenOption) openOption) : new m(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof m) {
            obj = ((m) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
