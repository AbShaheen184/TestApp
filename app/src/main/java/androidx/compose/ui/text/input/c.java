package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final androidx.compose.ui.platform.u a;
    public final c2 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public x j;
    public j0 k;
    public q l;
    public androidx.compose.ui.geometry.c n;
    public androidx.compose.ui.geometry.c o;
    public final Object c = new Object();
    public kotlin.jvm.functions.l m = b.A;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = androidx.compose.ui.graphics.f0.a();
    public final Matrix r = new Matrix();

    public c(androidx.compose.ui.platform.u uVar, c2 c2Var) {
        this.a = uVar;
        this.b = c2Var;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.h] */
    public final void a() {
        c2 c2Var = this.b;
        ?? r2 = c2Var.z;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view = (View) c2Var.y;
        if (inputMethodManager.isActive(view)) {
            kotlin.jvm.functions.l lVar = this.m;
            float[] fArr = this.q;
            lVar.invoke(new androidx.compose.ui.graphics.f0(fArr));
            this.a.s(fArr);
            Matrix matrix = this.r;
            androidx.compose.ui.graphics.a0.t(matrix, fArr);
            x xVar = this.j;
            xVar.getClass();
            long j = xVar.b;
            q qVar = this.l;
            qVar.getClass();
            j0 j0Var = this.k;
            j0Var.getClass();
            androidx.compose.ui.geometry.c cVar = this.n;
            cVar.getClass();
            androidx.compose.ui.geometry.c cVar2 = this.o;
            cVar2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            l0 l0Var = xVar.c;
            int iF = l0.f(j);
            builder.setSelectionRange(iF, l0.e(j));
            androidx.compose.ui.text.style.j jVar = androidx.compose.ui.text.style.j.y;
            if (z && iF >= 0) {
                int iV = qVar.v(iF);
                androidx.compose.ui.geometry.c cVarC = j0Var.c(iV);
                float fB = com.google.android.material.resources.c.b(cVarC.a, 0.0f, (int) (j0Var.c >> 32));
                boolean zH = androidx.room.r.h(cVar, fB, cVarC.b);
                boolean zH2 = androidx.room.r.h(cVar, fB, cVarC.d);
                boolean z5 = j0Var.a(iV) == jVar;
                int i = (zH || zH2) ? 1 : 0;
                if (!zH || !zH2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f = cVarC.b;
                float f2 = cVarC.d;
                builder.setInsertionMarkerLocation(fB, f, f2, f2, i);
            }
            if (z2) {
                int iF2 = l0Var != null ? l0.f(l0Var.a) : -1;
                int iE = l0Var != null ? l0.e(l0Var.a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder.setComposingText(iF2, xVar.a.y.subSequence(iF2, iE));
                    int iV2 = qVar.v(iF2);
                    int iV3 = qVar.v(iE);
                    float[] fArr2 = new float[(iV3 - iV2) * 4];
                    j0Var.b.a(androidx.compose.ui.text.d0.b(iV2, iV3), fArr2);
                    while (iF2 < iE) {
                        int iV4 = qVar.v(iF2);
                        int i2 = (iV4 - iV2) * 4;
                        float f3 = fArr2[i2];
                        float f4 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f5 = fArr2[i2 + 2];
                        float f6 = fArr2[i2 + 3];
                        int i4 = iV2;
                        int i5 = (cVar.a < f5 ? 1 : 0) & (f3 < cVar.c ? 1 : 0) & (cVar.b < f6 ? 1 : 0) & (f4 < cVar.d ? 1 : 0);
                        if (!androidx.room.r.h(cVar, f3, f4) || !androidx.room.r.h(cVar, f5, f6)) {
                            i5 |= 2;
                        }
                        if (j0Var.a(iV4) == jVar) {
                            i5 |= 4;
                        }
                        int i6 = iF2;
                        builder.addCharacterBounds(i6, f3, f4, f5, f6, i5);
                        iF2 = i6 + 1;
                        iE = i3;
                        iV2 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z3) {
                androidx.compose.ui.text.android.d.n(builder, cVar2);
            }
            if (i7 >= 34 && z4) {
                androidx.compose.ui.text.android.b.a(builder, j0Var, cVar);
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
