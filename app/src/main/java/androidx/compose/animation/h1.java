package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public final z0 a;
    public final k0 b;
    public final boolean c;
    public final Map d;

    public /* synthetic */ h1(z0 z0Var, k0 k0Var, g0 g0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : z0Var, (i & 4) != 0 ? null : k0Var, (i & 8) != 0 ? null : g0Var, (i & 32) == 0, (i & 64) != 0 ? kotlin.collections.v.e : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.l.a(this.a, h1Var.a) && kotlin.jvm.internal.l.a(this.b, h1Var.b) && kotlin.jvm.internal.l.a(null, null) && this.c == h1Var.c && kotlin.jvm.internal.l.a(this.d, h1Var.d);
    }

    public final int hashCode() {
        z0 z0Var = this.a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 961;
        k0 k0Var = this.b;
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f((((iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31) + 0) * 961, 31, this.c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=" + this.b + ", scale=" + ((Object) null) + ", veil=null, hold=" + this.c + ", effectsMap=" + this.d + ')';
    }

    public h1(z0 z0Var, k0 k0Var, g0 g0Var, boolean z, Map map) {
        this.a = z0Var;
        this.b = k0Var;
        this.c = z;
        this.d = map;
    }
}
