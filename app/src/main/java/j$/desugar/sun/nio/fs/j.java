package j$.desugar.sun.nio.fs;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.nio.file.a.values().length];
        a = iArr;
        try {
            iArr[j$.nio.file.a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[j$.nio.file.a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[j$.nio.file.a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
