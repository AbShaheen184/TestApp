package androidx.media3.exoplayer.hls.playlist;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final androidx.media3.common.r a;
    public final String b;
    public final String c;

    public w(androidx.media3.common.r rVar, String str, String str2) {
        androidx.media3.common.q qVarA = rVar.a();
        qVarA.a = null;
        qVarA.k = null;
        this.a = new androidx.media3.common.r(qVarA);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b) && Objects.equals(this.c, wVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
