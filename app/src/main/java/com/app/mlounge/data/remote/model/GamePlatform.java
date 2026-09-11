package com.app.mlounge.data.remote.model;

import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.app.mlounge.data.remote.model.GamePlatform[], still in use, count: 1, list:
  (r0v1 com.app.mlounge.data.remote.model.GamePlatform[]) from 0x003e: CONSTRUCTOR (r0v1 com.app.mlounge.data.remote.model.GamePlatform[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:63) call: kotlin.enums.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GamePlatform {
    SNES("snes", "SNES", ".sfc", "libsnes9x_libretro_android.so"),
    SEGA_GENESIS("sega-genesis", "Sega Genesis", ".md", "libgenesis_plus_gx_libretro_android.so"),
    NES("nes", "NES", ".nes", "libfceumm_libretro_android.so");

    private static final /* synthetic */ a $ENTRIES;
    public static final Companion Companion = new Companion();
    private final String apiPath;
    private final String coreName;
    private final String displayName;
    private final String romExtension;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    static {
        $ENTRIES = new b(new GamePlatform[]{r0, r1, r2});
    }

    public GamePlatform(String str, String str2, String str3, String str4) {
        super(str, i);
        this.apiPath = str;
        this.displayName = str2;
        this.romExtension = str3;
        this.coreName = str4;
    }

    public static a f() {
        return $ENTRIES;
    }

    public static GamePlatform valueOf(String str) {
        return (GamePlatform) Enum.valueOf(GamePlatform.class, str);
    }

    public static GamePlatform[] values() {
        return (GamePlatform[]) $VALUES.clone();
    }

    public final String a() {
        return this.apiPath;
    }

    public final String d() {
        return this.coreName;
    }

    public final String e() {
        return this.displayName;
    }

    public final String g() {
        return this.romExtension;
    }
}
