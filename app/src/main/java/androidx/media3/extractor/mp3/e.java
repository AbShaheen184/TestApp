package androidx.media3.extractor.mp3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final float c;

    public e(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static e a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new e(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && Float.compare(this.c, eVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.a);
        sb.append(", originator=");
        sb.append(this.b);
        sb.append(", gain=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(sb, this.c, '}');
    }
}
