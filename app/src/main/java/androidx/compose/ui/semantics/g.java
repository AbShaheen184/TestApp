package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g c = new g(0.0f, new kotlin.ranges.a(0.0f));
    public final float a;
    public final kotlin.ranges.a b;

    public g(float f, kotlin.ranges.a aVar) {
        this.a = f;
        this.b = aVar;
        if (Float.isNaN(f)) {
            net.luminis.tls.engine.impl.c.o("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
