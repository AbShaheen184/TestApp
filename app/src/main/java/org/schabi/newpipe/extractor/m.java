package org.schabi.newpipe.extractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m A;
    public static final /* synthetic */ m[] B;
    public static final m e;
    public static final m y;
    public static final m z;

    static {
        m mVar = new m("AUDIO", 0);
        e = mVar;
        m mVar2 = new m("VIDEO", 1);
        y = mVar2;
        m mVar3 = new m("LIVE", 2);
        z = mVar3;
        m mVar4 = new m("COMMENTS", 3);
        A = mVar4;
        B = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) B.clone();
    }
}
