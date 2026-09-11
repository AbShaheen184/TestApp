package okhttp3.internal.http;

import kotlin.text.i;
import okhttp3.j0;
import okhttp3.u;
import okio.b0;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {
    public final long A;
    public final b0 B;
    public final String z;

    public g(String str, long j, b0 b0Var) {
        this.z = str;
        this.A = j;
        this.B = b0Var;
    }

    @Override // okhttp3.j0
    public final h P() {
        return this.B;
    }

    @Override // okhttp3.j0
    public final long m() {
        return this.A;
    }

    @Override // okhttp3.j0
    public final u w() {
        String str = this.z;
        if (str == null) {
            return null;
        }
        i iVar = u.e;
        try {
            return com.google.android.material.resources.c.h(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
