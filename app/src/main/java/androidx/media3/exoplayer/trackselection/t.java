package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.c1;
import androidx.media3.exoplayer.h1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final h1[] b;
    public final q[] c;
    public final c1 d;
    public final Object e;

    public t(h1[] h1VarArr, q[] qVarArr, c1 c1Var, Object obj) {
        com.google.android.material.motion.a.f(h1VarArr.length == qVarArr.length);
        this.b = h1VarArr;
        this.c = (q[]) qVarArr.clone();
        this.d = c1Var;
        this.e = obj;
        this.a = h1VarArr.length;
    }

    public final boolean a(t tVar, int i) {
        return tVar != null && Objects.equals(this.b[i], tVar.b[i]) && Objects.equals(this.c[i], tVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
