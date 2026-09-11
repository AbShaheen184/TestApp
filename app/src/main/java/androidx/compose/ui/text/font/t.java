package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final s a;
    public final l b;
    public final int c;
    public final int d;
    public final Object e;

    public t(s sVar, l lVar, int i, int i2, Object obj) {
        this.a = sVar;
        this.b = lVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.l.a(this.a, tVar.a) && kotlin.jvm.internal.l.a(this.b, tVar.b) && this.c == tVar.c && this.d == tVar.d && kotlin.jvm.internal.l.a(this.e, tVar.e);
    }

    public final int hashCode() {
        s sVar = this.a;
        int iB = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, (((sVar == null ? 0 : sVar.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
