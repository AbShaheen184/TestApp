package androidx.media3.common;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
        androidx.media3.common.util.j0.K(6);
    }

    public b0(androidx.fragment.app.h hVar) {
        this.a = (Uri) hVar.z;
        this.b = (String) hVar.A;
        this.c = (String) hVar.B;
        this.d = hVar.y;
        this.e = (String) hVar.C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a.equals(b0Var.a) && Objects.equals(this.b, b0Var.b) && Objects.equals(this.c, b0Var.c) && this.d == b0Var.d && Objects.equals(this.e, b0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 961;
        String str3 = this.e;
        return (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }
}
