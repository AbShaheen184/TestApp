package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.a0;
import androidx.core.view.f1;
import androidx.core.view.w0;
import androidx.core.view.z1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ViewGroup B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        super(1);
        this.A = i;
        this.B = viewGroup;
    }

    @Override // androidx.core.view.w0
    public final z1 p(z1 z1Var, List list) {
        switch (this.A) {
            case 0:
                return ((v) this.B).m(z1Var);
            default:
                androidx.compose.ui.window.v vVar = (androidx.compose.ui.window.v) this.B;
                if (vVar.I) {
                    return z1Var;
                }
                View childAt = vVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, vVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, vVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? z1Var : z1Var.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.core.view.w0
    public final androidx.compose.foundation.text.input.internal.o q(f1 f1Var, androidx.compose.foundation.text.input.internal.o oVar) {
        switch (this.A) {
            case 0:
                androidx.compose.ui.node.r rVar = (androidx.compose.ui.node.r) ((v) this.B).W.d0.d;
                if (!rVar.o0.K) {
                    return oVar;
                }
                long jI = android.support.v4.media.session.b.I(rVar.W(0L));
                int i = (int) (jI >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jI & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jU = a0.g(rVar).u();
                int i3 = (int) (jU >> 32);
                int i4 = (int) (jU & 4294967295L);
                long j = rVar.z;
                long jI2 = android.support.v4.media.session.b.I(rVar.W((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jI2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jI2));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? oVar : new androidx.compose.foundation.text.input.internal.o(25, h.l((androidx.core.graphics.c) oVar.y, i, i2, i5, i7), h.l((androidx.core.graphics.c) oVar.z, i, i2, i5, i7));
            default:
                androidx.compose.ui.window.v vVar = (androidx.compose.ui.window.v) this.B;
                if (vVar.I) {
                    return oVar;
                }
                View childAt = vVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, vVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, vVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return oVar;
                }
                androidx.core.graphics.c cVarB = androidx.core.graphics.c.b(iMax, iMax2, iMax3, iMax4);
                int i8 = cVarB.a;
                androidx.core.graphics.c cVar = (androidx.core.graphics.c) oVar.y;
                int i9 = cVarB.b;
                int i10 = cVarB.c;
                int i11 = cVarB.d;
                return new androidx.compose.foundation.text.input.internal.o(25, z1.b(cVar, i8, i9, i10, i11), z1.b((androidx.core.graphics.c) oVar.z, i8, i9, i10, i11));
        }
    }
}
