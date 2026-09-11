package androidx.media3.exoplayer.audio;

import android.os.Build;
import com.google.common.collect.p1;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final com.google.common.collect.k0 c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            com.google.common.collect.j0 j0Var = new com.google.common.collect.j0(4);
            for (int i = 1; i <= 10; i++) {
                j0Var.b(Integer.valueOf(androidx.media3.common.util.j0.t(i)));
            }
            aVar = new a(2, j0Var.g());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public a(int i, Set set) {
        this.a = i;
        com.google.common.collect.k0 k0VarL = com.google.common.collect.k0.l(set);
        this.c = k0VarL;
        p1 it = k0VarL.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Objects.equals(this.c, aVar.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        com.google.common.collect.k0 k0Var = this.c;
        return i + (k0Var == null ? 0 : k0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
