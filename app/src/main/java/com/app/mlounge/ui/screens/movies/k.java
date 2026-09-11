package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.m;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.e0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ e0 z;

    public /* synthetic */ k(List list, e0 e0Var, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = e0Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbCastMember tmdbCastMember = (TmdbCastMember) this.y.get(iIntValue);
                    rVar.b0(1722668403);
                    String strC = tmdbCastMember.c();
                    if (strC == null) {
                        strC = "";
                    }
                    String strA = tmdbCastMember.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strD = tmdbCastMember.d();
                    this.z.b.getClass();
                    String strB = j0.b(strD, "w185");
                    l lVar = this.A;
                    boolean zF = rVar.f(lVar) | rVar.f(tmdbCastMember);
                    Object objQ = rVar.Q();
                    if (zF || objQ == m.a) {
                        objQ = new i(lVar, tmdbCastMember, 0);
                        rVar.l0(objQ);
                    }
                    a.a(strC, strA, strB, (kotlin.jvm.functions.a) objQ, rVar, 0);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbMovie tmdbMovie = (TmdbMovie) this.y.get(iIntValue3);
                    rVar2.b0(439583142);
                    String strE = tmdbMovie.e();
                    if (strE == null) {
                        strE = "";
                    }
                    String strC2 = tmdbMovie.c();
                    this.z.b.getClass();
                    String strB2 = j0.b(strC2, "w500");
                    Double dF = tmdbMovie.f();
                    androidx.compose.ui.r rVarP = w0.p(o.b, 130);
                    l lVar2 = this.A;
                    boolean zF2 = rVar2.f(lVar2) | rVar2.h(tmdbMovie);
                    Object objQ2 = rVar2.Q();
                    if (zF2 || objQ2 == m.a) {
                        objQ2 = new j(lVar2, tmdbMovie, 0);
                        rVar2.l0(objQ2);
                    }
                    b0.h(strE, strB2, (kotlin.jvm.functions.a) objQ2, rVarP, dF, null, null, null, null, 0.0f, false, false, 0.0f, null, rVar2, 3072, 0, 16352);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }
}
