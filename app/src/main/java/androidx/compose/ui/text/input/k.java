package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k g = new k(false, 0, true, 1, 1, androidx.compose.ui.text.intl.b.z);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final androidx.compose.ui.text.intl.b f;

    public k(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.intl.b bVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && kotlin.jvm.internal.l.a(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.c);
        sb.append(", keyboardType=");
        sb.append((Object) l.a(this.d));
        sb.append(", imeAction=");
        sb.append((Object) j.a(this.e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
