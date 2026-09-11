package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public String b;
    public boolean c = false;
    public d d = null;

    public g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.a, gVar.a) && l.a(this.b, gVar.b) && this.c == gVar.c && l.a(this.d, gVar.d);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        d dVar = this.d;
        return iF + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
