package androidx.media3.common;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public final y b;
    public final x c;
    public final f0 d;
    public final v e;
    public final z f;

    static {
        d1 d1Var = new d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        w wVar = new w();
        z zVar = z.a;
        d1Var.a();
        wVar.a();
        f0 f0Var = f0.B;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
    }

    public c0(String str, v vVar, y yVar, x xVar, f0 f0Var, z zVar) {
        this.a = str;
        this.b = yVar;
        this.c = xVar;
        this.d = f0Var;
        this.e = vVar;
        this.f = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Objects.equals(this.a, c0Var.a) && this.e.equals(c0Var.e) && Objects.equals(this.b, c0Var.b) && this.c.equals(c0Var.c) && Objects.equals(this.d, c0Var.d) && Objects.equals(this.f, c0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        y yVar = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (yVar != null ? yVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
