package androidx.compose.runtime.changelist;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.i2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {
    public static final u c = new u(1, 0, 2);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int[] iArr;
        androidx.compose.runtime.a aVar;
        int iC;
        int iD = wVar.d(0);
        if (i2Var.n != 0) {
            androidx.compose.runtime.t.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            androidx.compose.runtime.t.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = i2Var.t;
        int i2 = i2Var.v;
        int i3 = i2Var.u;
        int i4 = i;
        while (true) {
            iArr = i2Var.b;
            if (iD <= 0) {
                break;
            }
            i4 += iArr[(i2Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                androidx.compose.runtime.t.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = iArr[(i2Var.r(i4) * 5) + 3];
        int iG = i2Var.g(i2Var.r(i2Var.t), i2Var.b);
        int iG2 = i2Var.g(i2Var.r(i4), i2Var.b);
        int i6 = i4 + i5;
        int iG3 = i2Var.g(i2Var.r(i6), i2Var.b);
        int i7 = iG3 - iG2;
        i2Var.x(i7, Math.max(i2Var.t - 1, 0));
        i2Var.w(i5);
        int[] iArr2 = i2Var.b;
        int iR = i2Var.r(i6) * 5;
        kotlin.collections.n.C(i2Var.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = i2Var.c;
            int iH = i2Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, i2Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = i2Var.k;
        int i11 = i2Var.l;
        int length = i2Var.c.length;
        int i12 = i2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = i2Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = i2.i(i2.i(i2Var.g(iR2, iArr2) - i15, i12 < iR2 ? 0 : i10, i11, length), i2Var.k, i2Var.l, i2Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = i2Var.p();
        int iA = h2.a(i2Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < i2Var.d.size() && (iC = i2Var.c((aVar = (androidx.compose.runtime.a) i2Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(aVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) arrayList.get(i18);
            int iC2 = i2Var.c(aVar2) + i17;
            if (iC2 >= i2Var.g) {
                aVar2.a = -(iP - iC2);
            } else {
                aVar2.a = iC2;
            }
            i2Var.d.add(h2.a(i2Var.d, iC2, iP), aVar2);
        }
        if (i2Var.I(i6, i5)) {
            androidx.compose.runtime.t.a("Unexpectedly removed anchors");
        }
        i2Var.m(i2, i2Var.u, i);
        if (i7 > 0) {
            i2Var.J(i8, i7, i6 - 1);
        }
    }
}
