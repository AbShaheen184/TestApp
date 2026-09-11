package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends c0 {
    public final float c;

    public u(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.c, ((u) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
    }
}
