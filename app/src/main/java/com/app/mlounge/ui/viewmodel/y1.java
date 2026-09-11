package com.app.mlounge.ui.viewmodel;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.app.mlounge.ui.viewmodel.y1[], still in use, count: 1, list:
  (r0v1 com.app.mlounge.ui.viewmodel.y1[]) from 0x005a: CONSTRUCTOR (r0v1 com.app.mlounge.ui.viewmodel.y1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: kotlin.enums.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y1 {
    ADDED_DESC("Recent First"),
    /* JADX INFO: Fake field, exist only in values array */
    ADDED_ASC("Oldest First"),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_ASC("Title A-Z"),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_DESC("Title Z-A"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING_DESC("Highest Rated"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING_ASC("Lowest Rated"),
    /* JADX INFO: Fake field, exist only in values array */
    RELEASE_DESC("Newest Release"),
    /* JADX INFO: Fake field, exist only in values array */
    RELEASE_ASC("Oldest Release");

    public static final /* synthetic */ kotlin.enums.b A;
    public final String e;

    static {
        A = new kotlin.enums.b(y1VarArr);
    }

    public y1(String str) {
        super(str, i);
        this.e = str;
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) z.clone();
    }
}
