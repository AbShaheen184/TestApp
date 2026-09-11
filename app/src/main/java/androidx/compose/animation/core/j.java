package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j e;
    public static final j y;
    public static final /* synthetic */ j[] z;

    static {
        j jVar = new j("BoundReached", 0);
        e = jVar;
        j jVar2 = new j("Finished", 1);
        y = jVar2;
        z = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) z.clone();
    }
}
