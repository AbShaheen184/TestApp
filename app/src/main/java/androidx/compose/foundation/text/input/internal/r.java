package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.h0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int a(r0 r0Var, long j, p2 p2Var) {
        long jS;
        int iG;
        k1 k1VarD = r0Var.d();
        if (k1VarD != null) {
            androidx.compose.ui.text.n nVar = k1VarD.a.b;
            androidx.compose.ui.layout.x xVarC = r0Var.c();
            if (xVarC != null && (iG = g(nVar, (jS = xVarC.S(j)), p2Var)) != -1) {
                return nVar.g(androidx.compose.ui.geometry.b.a(jS, (nVar.b(iG) + nVar.f(iG)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long b(r0 r0Var, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2, int i) {
        long jH = h(r0Var, cVar, i);
        if (l0.c(jH)) {
            return l0.b;
        }
        long jH2 = h(r0Var, cVar2, i);
        if (l0.c(jH2)) {
            return l0.b;
        }
        int i2 = (int) (jH >> 32);
        int i3 = (int) (jH2 & 4294967295L);
        return d0.b(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean c(j0 j0Var, int i) {
        androidx.compose.ui.text.n nVar = j0Var.b;
        int iD = nVar.d(i);
        return i == j0Var.f(iD) || i == nVar.c(iD, false) ? j0Var.g(i) != j0Var.a(i) : j0Var.a(i) != j0Var.a(i - 1);
    }

    public static final ExtractedText d(androidx.compose.ui.text.input.x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.a.y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = xVar.b;
        extractedText.selectionStart = l0.f(j);
        extractedText.selectionEnd = l0.e(j);
        extractedText.flags = !kotlin.text.k.U(xVar.a.y, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long e(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean f(androidx.compose.ui.geometry.c cVar, float f, float f2) {
        float f3 = cVar.a;
        if (f > cVar.c || f3 > f) {
            return false;
        }
        return f2 <= cVar.d && cVar.b <= f2;
    }

    public static final int g(androidx.compose.ui.text.n nVar, long j, p2 p2Var) {
        float fG = p2Var != null ? p2Var.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = nVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < nVar.f(iE) - fG || Float.intBitsToFloat(i) > nVar.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > nVar.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long h(r0 r0Var, androidx.compose.ui.geometry.c cVar, int i) {
        k1 k1VarD = r0Var.d();
        androidx.compose.ui.text.n nVar = k1VarD != null ? k1VarD.a.b : null;
        androidx.compose.ui.layout.x xVarC = r0Var.c();
        return (nVar == null || xVarC == null) ? l0.b : nVar.h(cVar.i(xVarC.S(0L)), i, h0.b);
    }

    public static final boolean i(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean j(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean k(int i) {
        int type;
        return (!j(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final androidx.compose.ui.r l(androidx.compose.ui.r rVar, t tVar, r0 r0Var, c1 c1Var) {
        return rVar.d(new p(tVar, r0Var, c1Var));
    }
}
