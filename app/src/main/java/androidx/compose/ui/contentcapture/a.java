package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a e;
    public static final a y;
    public static final /* synthetic */ a[] z;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        e = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        y = aVar2;
        z = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) z.clone();
    }
}
