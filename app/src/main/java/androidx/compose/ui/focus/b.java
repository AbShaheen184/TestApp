package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ b[] A;
    public static final b e;
    public static final b y;
    public static final b z;

    static {
        b bVar = new b("None", 0);
        e = bVar;
        b bVar2 = new b("Cancelled", 1);
        y = bVar2;
        b bVar3 = new b("Redirected", 2);
        z = bVar3;
        A = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }
}
