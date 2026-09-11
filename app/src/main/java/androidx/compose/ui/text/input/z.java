package androidx.compose.ui.text.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z A;
    public static final /* synthetic */ z[] B;
    public static final z e;
    public static final z y;
    public static final z z;

    static {
        z zVar = new z("StartInput", 0);
        e = zVar;
        z zVar2 = new z("StopInput", 1);
        y = zVar2;
        z zVar3 = new z("ShowKeyboard", 2);
        z = zVar3;
        z zVar4 = new z("HideKeyboard", 3);
        A = zVar4;
        B = new z[]{zVar, zVar2, zVar3, zVar4};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) B.clone();
    }
}
