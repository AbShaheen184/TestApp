package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends c0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public t(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.c, tVar.c) == 0 && Float.compare(this.d, tVar.d) == 0 && Float.compare(this.e, tVar.e) == 0 && Float.compare(this.f, tVar.f) == 0 && Float.compare(this.g, tVar.g) == 0 && Float.compare(this.h, tVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(sb, this.h, ')');
    }
}
