package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u A;
    public static final u B;
    public static final /* synthetic */ u[] C;
    public static final u e;
    public static final u y;
    public static final u z;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("CornerExtraExtraLarge", 0);
        u uVar2 = new u("CornerExtraLarge", 1);
        e = uVar2;
        u uVar3 = new u("CornerExtraLargeIncreased", 2);
        u uVar4 = new u("CornerExtraLargeTop", 3);
        u uVar5 = new u("CornerExtraSmall", 4);
        y = uVar5;
        u uVar6 = new u("CornerExtraSmallTop", 5);
        u uVar7 = new u("CornerFull", 6);
        z = uVar7;
        u uVar8 = new u("CornerLarge", 7);
        u uVar9 = new u("CornerLargeEnd", 8);
        u uVar10 = new u("CornerLargeIncreased", 9);
        u uVar11 = new u("CornerLargeStart", 10);
        u uVar12 = new u("CornerLargeTop", 11);
        u uVar13 = new u("CornerMedium", 12);
        A = uVar13;
        u uVar14 = new u("CornerNone", 13);
        u uVar15 = new u("CornerSmall", 14);
        B = uVar15;
        C = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) C.clone();
    }
}
