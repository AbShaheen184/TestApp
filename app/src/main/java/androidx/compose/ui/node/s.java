package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final s A;
    public static final /* synthetic */ s[] B;
    public static final s e;
    public static final s y;
    public static final s z;

    static {
        s sVar = new s("LookaheadMeasurement", 0);
        e = sVar;
        s sVar2 = new s("LookaheadPlacement", 1);
        y = sVar2;
        s sVar3 = new s("Measurement", 2);
        z = sVar3;
        s sVar4 = new s("Placement", 3);
        A = sVar4;
        B = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) B.clone();
    }
}
