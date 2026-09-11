package com.app.mlounge.ui.theme;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.app.mlounge.ui.theme.c[], still in use, count: 1, list:
  (r0v1 com.app.mlounge.ui.theme.c[]) from 0x0030: CONSTRUCTOR (r0v1 com.app.mlounge.ui.theme.c[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: kotlin.enums.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class c {
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("Small", 0.85f),
    MEDIUM("Medium", 1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE("Large", 1.15f);

    public static final /* synthetic */ kotlin.enums.b B;
    public final String e;
    public final float y;

    static {
        B = new kotlin.enums.b(cVarArr);
    }

    public c(String str, float f) {
        super(str, i);
        this.e = str;
        this.y = f;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) A.clone();
    }
}
