package com.app.mlounge.ui.screens.person;

import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.m;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.ui.components.b0;
import java.util.ArrayList;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ l z;

    public /* synthetic */ c(ArrayList arrayList, l lVar, int i) {
        this.e = i;
        this.y = arrayList;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbMultiResult tmdbMultiResult = (TmdbMultiResult) this.y.get(iIntValue);
                    rVar.b0(202837986);
                    String strD = tmdbMultiResult.d();
                    if (strD == null && (strD = tmdbMultiResult.f()) == null) {
                        strD = "";
                    }
                    String strE = tmdbMultiResult.e();
                    String strConcat = strE != null ? "https://image.tmdb.org/t/p/w500".concat(strE) : null;
                    Double dG = tmdbMultiResult.g();
                    String strA = tmdbMultiResult.a();
                    l lVar = this.z;
                    boolean zF = rVar.f(lVar) | rVar.h(tmdbMultiResult);
                    Object objQ = rVar.Q();
                    if (zF || objQ == m.a) {
                        objQ = new b(lVar, tmdbMultiResult, 1);
                        rVar.l0(objQ);
                    }
                    b0.h(strD, strConcat, (kotlin.jvm.functions.a) objQ, null, dG, strA, null, null, null, 0.0f, false, false, 0.0f, null, rVar, 0, 0, 16328);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            default:
                j jVar2 = (j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(jVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbMultiResult tmdbMultiResult2 = (TmdbMultiResult) this.y.get(iIntValue3);
                    rVar2.b0(196354458);
                    String strF = tmdbMultiResult2.f();
                    if (strF == null && (strF = tmdbMultiResult2.d()) == null) {
                        strF = "";
                    }
                    String strE2 = tmdbMultiResult2.e();
                    String strConcat2 = strE2 != null ? "https://image.tmdb.org/t/p/w500".concat(strE2) : null;
                    Double dG2 = tmdbMultiResult2.g();
                    String strA2 = tmdbMultiResult2.a();
                    l lVar2 = this.z;
                    boolean zF2 = rVar2.f(lVar2) | rVar2.h(tmdbMultiResult2);
                    Object objQ2 = rVar2.Q();
                    if (zF2 || objQ2 == m.a) {
                        objQ2 = new b(lVar2, tmdbMultiResult2, 0);
                        rVar2.l0(objQ2);
                    }
                    b0.h(strF, strConcat2, (kotlin.jvm.functions.a) objQ2, null, dG2, strA2, null, null, null, 0.0f, false, false, 0.0f, null, rVar2, 0, 0, 16328);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }
}
