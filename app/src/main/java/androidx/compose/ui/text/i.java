package androidx.compose.ui.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;
    public static final /* synthetic */ i[] E;
    public static final i e;
    public static final i y;
    public static final i z;

    static {
        i iVar = new i("Paragraph", 0);
        e = iVar;
        i iVar2 = new i("Span", 1);
        y = iVar2;
        i iVar3 = new i("VerbatimTts", 2);
        z = iVar3;
        i iVar4 = new i("Url", 3);
        A = iVar4;
        i iVar5 = new i("Link", 4);
        B = iVar5;
        i iVar6 = new i("Clickable", 5);
        C = iVar6;
        i iVar7 = new i("String", 6);
        D = iVar7;
        E = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) E.clone();
    }
}
