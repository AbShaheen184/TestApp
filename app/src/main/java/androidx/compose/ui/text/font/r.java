package androidx.compose.ui.text.font;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements q {
    public static Typeface a(String str, l lVar, int i) {
        if (i == 0 && kotlin.jvm.internal.l.a(lVar, l.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.e, i == 1);
    }

    @Override // androidx.compose.ui.text.font.q
    public final Typeface b(n nVar, l lVar, int i) {
        nVar.getClass();
        return a("sans-serif", lVar, i);
    }

    @Override // androidx.compose.ui.text.font.q
    public final Typeface c(l lVar, int i) {
        return a(null, lVar, i);
    }
}
