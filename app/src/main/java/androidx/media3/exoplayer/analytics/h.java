package androidx.media3.exoplayer.analytics;

import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.source.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public int b;
    public long c;
    public final v d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ i g;

    public h(i iVar, String str, int i, v vVar) {
        this.g = iVar;
        this.a = str;
        this.b = i;
        this.c = vVar == null ? -1L : vVar.d;
        if (vVar == null || !vVar.b()) {
            return;
        }
        this.d = vVar;
    }

    public final boolean a(a aVar) {
        v vVar = aVar.d;
        v0 v0Var = aVar.b;
        if (vVar == null) {
            return this.b != aVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (vVar.d > j) {
            return true;
        }
        v vVar2 = this.d;
        if (vVar2 == null) {
            return false;
        }
        int i = vVar2.b;
        int iB = v0Var.b(vVar.a);
        int iB2 = v0Var.b(vVar2.a);
        if (vVar.d < vVar2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!vVar.b()) {
            int i2 = vVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = vVar.b;
        int i4 = vVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > vVar2.c;
        }
        return true;
    }

    public final boolean b(v0 v0Var, v0 v0Var2) {
        v vVar;
        int i = this.b;
        if (i < v0Var.o()) {
            i iVar = this.g;
            u0 u0Var = iVar.a;
            v0Var.n(i, u0Var);
            int i2 = u0Var.n;
            while (true) {
                if (i2 > u0Var.o) {
                    i = -1;
                    break;
                }
                int iB = v0Var2.b(v0Var.l(i2));
                if (iB != -1) {
                    i = v0Var2.f(iB, iVar.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= v0Var2.o()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((vVar = this.d) == null || v0Var2.b(vVar.a) != -1);
    }
}
