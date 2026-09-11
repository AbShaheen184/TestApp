package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.g0;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.h0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final void a(CursorAnchorInfo.Builder builder, j0 j0Var, androidx.compose.ui.geometry.c cVar) {
        if (cVar.f()) {
            return;
        }
        androidx.compose.ui.text.n nVar = j0Var.b;
        int i = nVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iC = com.google.android.material.resources.c.c(nVar.e(cVar.b), 0, i);
        int iC2 = com.google.android.material.resources.c.c(nVar.e(cVar.d), 0, i);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(j0Var.d(iC), nVar.f(iC), j0Var.e(iC), nVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static int b(HandwritingGesture handwritingGesture, androidx.activity.compose.g gVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        gVar.invoke(new androidx.compose.ui.text.input.a(fallbackText, 1));
        return 5;
    }

    public static void c(long j, androidx.compose.ui.text.g gVar, boolean z, androidx.activity.compose.g gVar2) {
        if (z) {
            int i = l0.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(gVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < gVar.y.length() ? Character.codePointAt(gVar, iCharCount2) : 10;
            if (r.k(iCodePointBefore) && (r.j(iCodePointAt) || r.i(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(gVar, iCharCount);
                    }
                } while (r.k(iCodePointBefore));
                j = d0.b(iCharCount, iCharCount2);
            } else if (r.k(iCodePointAt) && (r.j(iCodePointBefore) || r.i(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == gVar.y.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(gVar, iCharCount2);
                    }
                } while (r.k(iCodePointAt));
                j = d0.b(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        gVar2.invoke(new n(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.w(i2, i2), new androidx.compose.ui.text.input.e(l0.d(j), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0263  */
    public static int d(r0 r0Var, HandwritingGesture handwritingGesture, c1 c1Var, p2 p2Var, androidx.activity.compose.g gVar) {
        long jH;
        int i;
        k1 k1VarD;
        k1 k1VarD2;
        i0 i0Var;
        androidx.compose.ui.text.g gVar2 = r0Var.j;
        if (gVar2 == null) {
            return 3;
        }
        k1 k1VarD3 = r0Var.d();
        if (!gVar2.equals((k1VarD3 == null || (i0Var = k1VarD3.a.a) == null) ? null : i0Var.a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jH2 = r.h(r0Var, a0.A(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (l0.c(jH2)) {
                return b(selectGesture, gVar);
            }
            gVar.invoke(new androidx.compose.ui.text.input.w((int) (jH2 >> 32), (int) (jH2 & 4294967295L)));
            if (c1Var != null) {
                c1Var.h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jH3 = r.h(r0Var, a0.A(deleteGesture.getDeletionArea()), i2);
                if (l0.c(jH3)) {
                    return b(deleteGesture, gVar);
                }
                c(jH3, gVar2, i2 == 1, gVar);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jB = r.b(r0Var, a0.A(deleteRangeGesture.getDeletionStartArea()), a0.A(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (l0.c(jB)) {
                        return b(deleteRangeGesture, gVar);
                    }
                    c(jB, gVar2, i3 == 1, gVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (p2Var == null) {
                        return b(joinOrSplitGesture, gVar);
                    }
                    int iA = r.a(r0Var, r.e(joinOrSplitGesture.getJoinOrSplitPoint()), p2Var);
                    if (iA == -1 || ((k1VarD2 = r0Var.d()) != null && r.c(k1VarD2.a, iA))) {
                        return b(joinOrSplitGesture, gVar);
                    }
                    int iCharCount = iA;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(gVar2, iCharCount);
                        if (!r.j(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iA < gVar2.y.length()) {
                        int iCodePointAt = Character.codePointAt(gVar2, iA);
                        if (!r.j(iCodePointAt)) {
                            break;
                        }
                        iA += Character.charCount(iCodePointAt);
                    }
                    long jB2 = d0.b(iCharCount, iA);
                    if (!l0.c(jB2)) {
                        c(jB2, gVar2, false, gVar);
                        return 1;
                    }
                    int i4 = (int) (jB2 >> 32);
                    gVar.invoke(new n(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.w(i4, i4), new androidx.compose.ui.text.input.a(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (p2Var == null) {
                        return b(insertGesture, gVar);
                    }
                    int iA2 = r.a(r0Var, r.e(insertGesture.getInsertionPoint()), p2Var);
                    if (iA2 == -1 || ((k1VarD = r0Var.d()) != null && r.c(k1VarD.a, iA2))) {
                        return b(insertGesture, gVar);
                    }
                    gVar.invoke(new n(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.w(iA2, iA2), new androidx.compose.ui.text.input.a(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                k1 k1VarD4 = r0Var.d();
                j0 j0Var = k1VarD4 != null ? k1VarD4.a : null;
                long jE = r.e(removeSpaceGesture.getStartPoint());
                long jE2 = r.e(removeSpaceGesture.getEndPoint());
                androidx.compose.ui.layout.x xVarC = r0Var.c();
                if (j0Var != null) {
                    androidx.compose.ui.text.n nVar = j0Var.b;
                    if (xVarC == null) {
                        jH = l0.b;
                    } else {
                        long jS = xVarC.S(jE);
                        long jS2 = xVarC.S(jE2);
                        int iG = r.g(nVar, jS, p2Var);
                        int iG2 = r.g(nVar, jS2, p2Var);
                        if (iG != -1) {
                            if (iG2 != -1) {
                                iG = Math.min(iG, iG2);
                            }
                            iG2 = iG;
                        } else if (iG2 == -1) {
                            jH = l0.b;
                        }
                        float fB = (nVar.b(iG2) + nVar.f(iG2)) / 2;
                        int i5 = (int) (jS >> 32);
                        int i6 = (int) (jS2 >> 32);
                        jH = nVar.h(new androidx.compose.ui.geometry.c(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB + 0.1f), 0, h0.a);
                    }
                } else {
                    jH = l0.b;
                }
                if (l0.c(jH)) {
                    return b(removeSpaceGesture, gVar);
                }
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                xVar.e = -1;
                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                xVar2.e = -1;
                String strF = new kotlin.text.i("\\s+").f(gVar2.subSequence(l0.f(jH), l0.e(jH)).y, new androidx.activity.compose.h(22, xVar, xVar2));
                int i7 = xVar.e;
                if (i7 == -1 || (i = xVar2.e) == -1) {
                    return b(removeSpaceGesture, gVar);
                }
                int i8 = (int) (jH >> 32);
                gVar.invoke(new n(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.w(i8 + i7, i8 + i), new androidx.compose.ui.text.input.a(strF.substring(i7, strF.length() - (l0.d(jH) - xVar2.e)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jB3 = r.b(r0Var, a0.A(selectRangeGesture.getSelectionStartArea()), a0.A(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (l0.c(jB3)) {
                return b(selectRangeGesture, gVar);
            }
            gVar.invoke(new androidx.compose.ui.text.input.w((int) (jB3 >> 32), (int) (jB3 & 4294967295L)));
            if (c1Var != null) {
                c1Var.h(true);
            }
        }
        return 1;
    }

    public static boolean e(r0 r0Var, PreviewableHandwritingGesture previewableHandwritingGesture, c1 c1Var, CancellationSignal cancellationSignal) {
        i0 i0Var;
        androidx.compose.ui.text.g gVar = r0Var.j;
        if (gVar != null) {
            k1 k1VarD = r0Var.d();
            if (gVar.equals((k1VarD == null || (i0Var = k1VarD.a.a) == null) ? null : i0Var.a)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                g0 g0Var = g0.e;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (c1Var != null) {
                        long jH = r.h(r0Var, a0.A(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        r0 r0Var2 = c1Var.d;
                        if (r0Var2 != null) {
                            r0Var2.f(jH);
                        }
                        r0 r0Var3 = c1Var.d;
                        if (r0Var3 != null) {
                            r0Var3.e(l0.b);
                        }
                        if (!l0.c(jH)) {
                            c1Var.t(false);
                            c1Var.q(g0Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (c1Var != null) {
                        long jH2 = r.h(r0Var, a0.A(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        r0 r0Var4 = c1Var.d;
                        if (r0Var4 != null) {
                            r0Var4.e(jH2);
                        }
                        r0 r0Var5 = c1Var.d;
                        if (r0Var5 != null) {
                            r0Var5.f(l0.b);
                        }
                        if (!l0.c(jH2)) {
                            c1Var.t(false);
                            c1Var.q(g0Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (c1Var != null) {
                        long jB = r.b(r0Var, a0.A(selectRangeGesture.getSelectionStartArea()), a0.A(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r0 r0Var6 = c1Var.d;
                        if (r0Var6 != null) {
                            r0Var6.f(jB);
                        }
                        r0 r0Var7 = c1Var.d;
                        if (r0Var7 != null) {
                            r0Var7.e(l0.b);
                        }
                        if (!l0.c(jB)) {
                            c1Var.t(false);
                            c1Var.q(g0Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (c1Var != null) {
                        long jB2 = r.b(r0Var, a0.A(deleteRangeGesture.getDeletionStartArea()), a0.A(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        r0 r0Var8 = c1Var.d;
                        if (r0Var8 != null) {
                            r0Var8.e(jB2);
                        }
                        r0 r0Var9 = c1Var.d;
                        if (r0Var9 != null) {
                            r0Var9.f(l0.b);
                        }
                        if (!l0.c(jB2)) {
                            c1Var.t(false);
                            c1Var.q(g0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new m(c1Var, 0));
                }
                return true;
            }
        }
        return false;
    }

    public static void f(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(com.google.common.base.c.q(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(kotlin.collections.n.W(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}
