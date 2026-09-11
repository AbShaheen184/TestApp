package androidx.compose.animation;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public static final x0 b = new x0(new h1((z0) null, (k0) null, (g0) null, (LinkedHashMap) null, 127));
    public final h1 a;

    public x0(h1 h1Var) {
        this.a = h1Var;
    }

    public final x0 a(x0 x0Var) {
        h1 h1Var = x0Var.a;
        z0 z0Var = h1Var.a;
        h1 h1Var2 = this.a;
        if (z0Var == null) {
            z0Var = h1Var2.a;
        }
        k0 k0Var = h1Var.b;
        if (k0Var == null) {
            k0Var = h1Var2.b;
        }
        return new x0(new h1(z0Var, k0Var, (g0) null, kotlin.collections.a0.z(h1Var2.d, h1Var.d), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        h1 h1Var = this.a;
        z0 z0Var = h1Var.a;
        sb.append(z0Var != null ? z0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        k0 k0Var = h1Var.b;
        sb.append(k0Var != null ? k0Var.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
