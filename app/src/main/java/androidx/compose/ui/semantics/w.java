package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final String a;
    public final kotlin.jvm.functions.p b;
    public final boolean c;

    public w(String str, kotlin.jvm.functions.p pVar) {
        this.a = str;
        this.b = pVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ w(String str) {
        this(str, j.S);
    }

    public w(String str, int i) {
        this(str);
        this.c = true;
    }

    public w(String str, boolean z, kotlin.jvm.functions.p pVar) {
        this(str, pVar);
        this.c = z;
    }
}
