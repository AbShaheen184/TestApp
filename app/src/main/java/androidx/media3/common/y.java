package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final Uri a;
    public final String b;
    public final List c;
    public final com.google.common.collect.h0 d;
    public final long e;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
        androidx.media3.common.util.j0.K(6);
        androidx.media3.common.util.j0.K(7);
    }

    public y(Uri uri, String str, com.google.common.collect.h0 h0Var) {
        List list = Collections.EMPTY_LIST;
        this.a = uri;
        this.b = i0.p(str);
        this.c = list;
        this.d = h0Var;
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        for (int i = 0; i < h0Var.size(); i++) {
            b0 b0Var = (b0) h0Var.get(i);
            androidx.fragment.app.h hVar = new androidx.fragment.app.h(1);
            hVar.z = b0Var.a;
            hVar.A = b0Var.b;
            hVar.B = b0Var.c;
            hVar.y = b0Var.d;
            hVar.C = b0Var.e;
            d0VarK.b(new a0(hVar));
        }
        d0VarK.g();
        this.e = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && Objects.equals(this.b, yVar.b) && this.c.equals(yVar.c) && this.d.equals(yVar.d) && this.e == yVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (int) ((((long) ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.e);
    }
}
