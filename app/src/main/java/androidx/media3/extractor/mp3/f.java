package androidx.media3.extractor.mp3;

import androidx.media3.common.g0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g0 {
    public final float a;
    public final e b;
    public final e c;

    public f(float f, e eVar, e eVar2) {
        this.a = f;
        this.b = eVar;
        this.c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.a, fVar.a) == 0 && Objects.equals(this.b, fVar.b) && Objects.equals(this.c, fVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        e eVar = this.b;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
