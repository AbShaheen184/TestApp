package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q D;
    public static final q E;
    public static final q F;
    public static final q G;
    public static final /* synthetic */ q[] H;
    public static final q e;
    public static final q y;
    public static final q z;

    static {
        q qVar = new q("none", 0);
        e = qVar;
        q qVar2 = new q("xMinYMin", 1);
        y = qVar2;
        q qVar3 = new q("xMidYMin", 2);
        z = qVar3;
        q qVar4 = new q("xMaxYMin", 3);
        A = qVar4;
        q qVar5 = new q("xMinYMid", 4);
        B = qVar5;
        q qVar6 = new q("xMidYMid", 5);
        C = qVar6;
        q qVar7 = new q("xMaxYMid", 6);
        D = qVar7;
        q qVar8 = new q("xMinYMax", 7);
        E = qVar8;
        q qVar9 = new q("xMidYMax", 8);
        F = qVar9;
        q qVar10 = new q("xMaxYMax", 9);
        G = qVar10;
        H = new q[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) H.clone();
    }
}
