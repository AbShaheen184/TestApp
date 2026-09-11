package androidx.compose.animation;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public static final y0 b;
    public static final y0 c;
    public final h1 a;

    static {
        LinkedHashMap linkedHashMap = null;
        z0 z0Var = null;
        k0 k0Var = null;
        g0 g0Var = null;
        b = new y0(new h1(z0Var, k0Var, g0Var, linkedHashMap, 127));
        c = new y0(new h1(z0Var, k0Var, g0Var, linkedHashMap, 95));
    }

    public y0(h1 h1Var) {
        this.a = h1Var;
    }

    public final y0 a(y0 y0Var) {
        h1 h1Var = y0Var.a;
        z0 z0Var = h1Var.a;
        h1 h1Var2 = this.a;
        if (z0Var == null) {
            z0Var = h1Var2.a;
        }
        k0 k0Var = h1Var.b;
        if (k0Var == null) {
            k0Var = h1Var2.b;
        }
        return new y0(new h1(z0Var, k0Var, (g0) null, h1Var.c || h1Var2.c, kotlin.collections.a0.z(h1Var2.d, h1Var.d)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        h1 h1Var = this.a;
        z0 z0Var = h1Var.a;
        sb.append(z0Var != null ? z0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        k0 k0Var = h1Var.b;
        sb.append(k0Var != null ? k0Var.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(h1Var.c);
        return sb.toString();
    }
}
