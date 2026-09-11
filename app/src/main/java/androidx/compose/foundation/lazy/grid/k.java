package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.j2;
import androidx.compose.foundation.lazy.layout.d0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j2 {
    public final int A;
    public final /* synthetic */ d0 B;
    public final /* synthetic */ x C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final i y;
    public final d0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, d0 d0Var, int i, x xVar, int i2, int i3, long j) {
        super(1);
        this.B = d0Var;
        this.C = xVar;
        this.D = i2;
        this.E = i3;
        this.F = j;
        this.y = iVar;
        this.z = d0Var;
        this.A = i;
    }

    public final o w(int i, long j, int i2, int i3, int i4) {
        int i5;
        i iVar = this.y;
        Object objB = iVar.b(i);
        Object objJ = iVar.b.j(i);
        List listO = o(this.z, i, j);
        if (androidx.compose.ui.unit.a.f(j)) {
            i5 = androidx.compose.ui.unit.a.j(j);
        } else {
            if (!androidx.compose.ui.unit.a.e(j)) {
                androidx.compose.foundation.internal.b.a("does not have fixed height");
            }
            i5 = androidx.compose.ui.unit.a.i(j);
        }
        int i6 = i5;
        androidx.compose.ui.unit.m layoutDirection = this.B.y.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.v vVar = this.C.m;
        return new o(i, objB, i6, i4, layoutDirection, this.D, this.E, listO, this.F, objJ, vVar, j, i2, i3);
    }
}
