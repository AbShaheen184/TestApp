package androidx.compose.foundation.text.contextmenu.modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final /* synthetic */ k[] A;
    public static final k e;
    public static final k y;
    public static final k z;

    static {
        k kVar = new k("Uninitialized", 0);
        e = kVar;
        k kVar2 = new k("Detached", 1);
        y = kVar2;
        k kVar3 = new k("Attached", 2);
        z = kVar3;
        A = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) A.clone();
    }
}
