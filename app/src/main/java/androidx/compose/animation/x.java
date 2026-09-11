package androidx.compose.animation;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.compose.ui.layout.q0 {
    public final i0 a;
    public boolean b;

    public x(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.c1 c1VarF = ((androidx.compose.ui.layout.p0) list.get(i)).F(j);
            iMax = Math.max(iMax, c1VarF.e);
            iMax2 = Math.max(iMax2, c1VarF.y);
            arrayList.add(c1VarF);
        }
        boolean zU = s0Var.U();
        i0 i0Var = this.a;
        if (zU) {
            this.b = true;
            i0Var.a.setValue(new androidx.compose.ui.unit.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.b) {
            i0Var.a.setValue(new androidx.compose.ui.unit.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return s0Var.q(iMax, iMax2, kotlin.collections.v.e, new w(0, arrayList));
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((androidx.compose.ui.layout.p0) list.get(0)).B(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB2 = ((androidx.compose.ui.layout.p0) list.get(i2)).B(i);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((androidx.compose.ui.layout.p0) list.get(0)).Z(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iZ2 = ((androidx.compose.ui.layout.p0) list.get(i2)).Z(i);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iZ;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((androidx.compose.ui.layout.p0) list.get(0)).v(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iV2 = ((androidx.compose.ui.layout.p0) list.get(i2)).v(i);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iV;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((androidx.compose.ui.layout.p0) list.get(0)).b(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB2 = ((androidx.compose.ui.layout.p0) list.get(i2)).b(i);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB;
    }
}
