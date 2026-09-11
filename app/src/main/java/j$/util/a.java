package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RuntimeException {
    public static void a(String str, Object obj) {
        throw new a("Unsupported " + str + " :" + obj);
    }
}
