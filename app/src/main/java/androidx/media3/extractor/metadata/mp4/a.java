package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.util.j0;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j, long j2, int i) {
        com.google.android.material.motion.a.f(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = j0.a;
        Locale locale = Locale.US;
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbM.append(this.b);
        sbM.append(", speedDivisor=");
        sbM.append(this.c);
        return sbM.toString();
    }
}
