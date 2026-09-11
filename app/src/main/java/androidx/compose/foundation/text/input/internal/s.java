package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.f0;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final b a;
    public final o b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public androidx.compose.ui.text.input.x j;
    public j0 k;
    public androidx.compose.ui.text.input.q l;
    public androidx.compose.ui.geometry.c m;
    public androidx.compose.ui.geometry.c n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = f0.a();
    public final Matrix q = new Matrix();

    public s(b bVar, o oVar) {
        this.a = bVar;
        this.b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    public final void a() {
        o oVar = this.b;
        InputMethodManager inputMethodManagerL = oVar.l();
        View view = (View) oVar.y;
        if (!inputMethodManagerL.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        f0.d(fArr);
        androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.a.e.O.getValue();
        if (xVar != null) {
            if (!xVar.l()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.m(fArr);
            }
        }
        androidx.compose.ui.geometry.c cVar = this.n;
        cVar.getClass();
        float f = -cVar.a;
        androidx.compose.ui.geometry.c cVar2 = this.n;
        cVar2.getClass();
        f0.f(fArr, f, -cVar2.b);
        Matrix matrix = this.q;
        a0.t(matrix, fArr);
        androidx.compose.ui.text.input.x xVar2 = this.j;
        xVar2.getClass();
        long j = xVar2.b;
        androidx.compose.ui.text.input.q qVar = this.l;
        qVar.getClass();
        j0 j0Var = this.k;
        j0Var.getClass();
        androidx.compose.ui.geometry.c cVar3 = this.m;
        cVar3.getClass();
        androidx.compose.ui.geometry.c cVar4 = this.n;
        cVar4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        l0 l0Var = xVar2.c;
        int iF = l0.f(j);
        builder.setSelectionRange(iF, l0.e(j));
        androidx.compose.ui.text.style.j jVar = androidx.compose.ui.text.style.j.y;
        if (z && iF >= 0) {
            int iV = qVar.v(iF);
            androidx.compose.ui.geometry.c cVarC = j0Var.c(iV);
            float fB = com.google.android.material.resources.c.b(cVarC.a, 0.0f, (int) (j0Var.c >> 32));
            boolean zF = r.f(cVar3, fB, cVarC.b);
            boolean zF2 = r.f(cVar3, fB, cVarC.d);
            boolean z5 = j0Var.a(iV) == jVar;
            int i = (zF || zF2) ? 1 : 0;
            if (!zF || !zF2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f2 = cVarC.b;
            float f3 = cVarC.d;
            builder.setInsertionMarkerLocation(fB, f2, f3, f3, i);
        }
        if (z2) {
            int iF2 = l0Var != null ? l0.f(l0Var.a) : -1;
            int iE = l0Var != null ? l0.e(l0Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder.setComposingText(iF2, xVar2.a.y.subSequence(iF2, iE));
                int iV2 = qVar.v(iF2);
                int iV3 = qVar.v(iE);
                float[] fArr2 = new float[(iV3 - iV2) * 4];
                j0Var.b.a(d0.b(iV2, iV3), fArr2);
                while (iF2 < iE) {
                    int iV4 = qVar.v(iF2);
                    int i2 = (iV4 - iV2) * 4;
                    float f4 = fArr2[i2];
                    float f5 = fArr2[i2 + 1];
                    int i3 = iE;
                    float f6 = fArr2[i2 + 2];
                    float f7 = fArr2[i2 + 3];
                    int i4 = iV2;
                    int i5 = (cVar3.a < f6 ? 1 : 0) & (f4 < cVar3.c ? 1 : 0) & (cVar3.b < f7 ? 1 : 0) & (f5 < cVar3.d ? 1 : 0);
                    if (!r.f(cVar3, f4, f5) || !r.f(cVar3, f6, f7)) {
                        i5 |= 2;
                    }
                    if (j0Var.a(iV4) == jVar) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                    iF2 = i6 + 1;
                    iE = i3;
                    iV2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            e.a(builder, cVar4);
        }
        if (i7 >= 34 && z4) {
            j.a(builder, j0Var, cVar3);
        }
        oVar.l().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
