package androidx.compose.ui.text.font;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l y;
    public static final l z;
    public final int e;

    static {
        l lVar = new l(100);
        l lVar2 = new l(Context.VERSION_ES6);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        y = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        z = lVar4;
        A = lVar5;
        B = lVar6;
        C = lVar7;
        com.google.common.base.c.q(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i) {
        this.e = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e, ((l) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.e == ((l) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(new StringBuilder("FontWeight(weight="), this.e, ')');
    }
}
