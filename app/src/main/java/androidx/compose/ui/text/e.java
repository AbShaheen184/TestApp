package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public e(int i, String str, Object obj, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && kotlin.jvm.internal.l.a(this.d, eVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.d, ')');
    }

    public e(Object obj, int i, int i2) {
        this(i, "", obj, i2);
    }
}
