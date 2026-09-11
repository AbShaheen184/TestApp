package com.app.mlounge.ui.theme;

import androidx.compose.foundation.gestures.w1;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final n0 a;

    static {
        long j = b.f;
        long j2 = t.d;
        long j3 = b.g;
        long j4 = b.h;
        long j5 = t.b;
        long jB = t.b(0.3f, j4);
        long j6 = b.i;
        long j7 = b.a;
        long j8 = b.k;
        long j9 = b.b;
        long j10 = b.l;
        long j11 = b.c;
        long j12 = b.m;
        long j13 = b.o;
        long j14 = b.e;
        long jD = a0.d(4280953386L);
        long jD2 = a0.d(4281348144L);
        long jD3 = a0.d(4280821800L);
        long jD4 = a0.d(4279637526L);
        u2 u2Var = o0.a;
        a = new n0(j, j2, j3, j2, androidx.compose.material3.tokens.d.c, j4, j5, jB, j4, j6, j5, androidx.compose.material3.tokens.d.t, androidx.compose.material3.tokens.d.j, j7, j8, j9, j10, j11, j12, j, androidx.compose.material3.tokens.d.d, androidx.compose.material3.tokens.d.b, j13, j2, androidx.compose.material3.tokens.d.a, androidx.compose.material3.tokens.d.e, j14, jD, androidx.compose.material3.tokens.d.o, androidx.compose.material3.tokens.d.r, androidx.compose.material3.tokens.d.s, j9, jD3, jD2, jD4, j7, androidx.compose.material3.tokens.d.m, androidx.compose.material3.tokens.d.n, androidx.compose.material3.tokens.d.f, androidx.compose.material3.tokens.d.g, androidx.compose.material3.tokens.d.p, androidx.compose.material3.tokens.d.q, androidx.compose.material3.tokens.d.h, androidx.compose.material3.tokens.d.i, androidx.compose.material3.tokens.d.u, androidx.compose.material3.tokens.d.v, androidx.compose.material3.tokens.d.k, androidx.compose.material3.tokens.d.l);
    }

    public static final void a(c cVar, a aVar, androidx.compose.runtime.internal.f fVar, r rVar, int i) {
        rVar.c0(-2011003514);
        int i2 = (rVar.d(cVar.ordinal()) ? 4 : 2) | i | (rVar.d(aVar.ordinal()) ? 32 : 16);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            s.a(f.a.a(aVar), k.c(-782960058, new com.app.mlounge.ui.screens.watchlist.a(cVar, fVar, 2), rVar), rVar, 56);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(cVar, aVar, fVar, i, 19);
        }
    }
}
