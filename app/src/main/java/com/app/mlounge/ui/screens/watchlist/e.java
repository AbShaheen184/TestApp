package com.app.mlounge.ui.screens.watchlist;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.o;
import com.app.mlounge.R;
import com.app.mlounge.data.local.entity.f;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.g;
import com.app.mlounge.ui.viewmodel.z1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.k;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ q B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ l E;
    public final /* synthetic */ l F;
    public final /* synthetic */ List G;
    public final /* synthetic */ kotlin.jvm.functions.a H;
    public final /* synthetic */ z1 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ t2 K;
    public final /* synthetic */ t2 L;
    public final /* synthetic */ t2 M;
    public final /* synthetic */ t2 N;
    public final /* synthetic */ y0 O;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public e(List list, Map map, l lVar, l lVar2, q qVar, l lVar3, l lVar4, l lVar5, l lVar6, List list2, kotlin.jvm.functions.a aVar, z1 z1Var, Context context, t2 t2Var, t2 t2Var2, t2 t2Var3, t2 t2Var4, y0 y0Var) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = qVar;
        this.C = lVar3;
        this.D = lVar4;
        this.E = lVar5;
        this.F = lVar6;
        this.G = list2;
        this.H = aVar;
        this.I = z1Var;
        this.J = context;
        this.K = t2Var;
        this.L = t2Var2;
        this.M = t2Var3;
        this.N = t2Var4;
        this.O = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x024e A[PHI: r5
  0x024e: PHI (r5v21 boolean) = (r5v12 boolean), (r5v23 boolean), (r5v25 boolean), (r5v28 boolean) binds: [B:102:0x024c, B:98:0x0233, B:94:0x0218, B:87:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        Integer numQ;
        k kVar;
        int iIntValue;
        boolean z;
        androidx.compose.ui.graphics.painter.b bVarQ;
        String str;
        String str2;
        Double d;
        boolean z2;
        boolean zContains;
        j jVar = (j) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
        int iIntValue3 = ((Number) obj4).intValue();
        if ((iIntValue3 & 6) == 0) {
            i = (rVar.f(jVar) ? 4 : 2) | iIntValue3;
        } else {
            i = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            i |= rVar.d(iIntValue2) ? 32 : 16;
        }
        if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            f fVar = (f) this.e.get(iIntValue2);
            rVar.b0(520132119);
            String str3 = fVar.a;
            String str4 = fVar.b;
            boolean zF = rVar.f(str3);
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar2 = m.a;
            if (zF || objQ == fVar2) {
                objQ = new y();
                rVar.l0(objQ);
            }
            y yVar = (y) objQ;
            Map map = this.y;
            boolean zH = rVar.h(map) | rVar.f(fVar) | rVar.f(yVar);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar2) {
                objQ2 = new g(map, fVar, yVar, 5);
                rVar.l0(objQ2);
            }
            j0.e((kotlin.jvm.functions.a) objQ2, rVar);
            boolean zA = kotlin.jvm.internal.l.a(str4, "movie");
            t2 t2Var = this.K;
            float fFloatValue = 0.0f;
            if (zA) {
                Integer numQ2 = kotlin.text.r.Q(kotlin.text.k.j0(str3, "movie_"));
                if (numQ2 != null) {
                    int iIntValue4 = numQ2.intValue();
                    i2 = i;
                    Float f = (Float) ((Map) t2Var.getValue()).get("movie:" + iIntValue4);
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    }
                } else {
                    i2 = i;
                }
            } else {
                i2 = i;
                if (kotlin.jvm.internal.l.a(str4, "tv") && (numQ = kotlin.text.r.Q(kotlin.text.k.j0(str3, "tv_"))) != null) {
                    int iIntValue5 = numQ.intValue();
                    Float f2 = (Float) ((Map) t2Var.getValue()).get("movie:" + iIntValue5);
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
            }
            float f3 = fFloatValue;
            if (kotlin.jvm.internal.l.a(str4, "movie")) {
                Integer numQ3 = kotlin.text.r.Q(kotlin.text.k.j0(str3, "movie_"));
                if (numQ3 != null) {
                    int iIntValue6 = numQ3.intValue();
                    zContains = ((Set) this.L.getValue()).contains("movie:" + iIntValue6);
                } else {
                    zContains = false;
                }
                kVar = new k(Boolean.valueOf(zContains), Boolean.FALSE);
            } else if (kotlin.jvm.internal.l.a(str4, "tv")) {
                Integer numQ4 = kotlin.text.r.Q(kotlin.text.k.j0(str3, "tv_"));
                if (numQ4 != null) {
                    Integer num = (Integer) ((Map) this.M.getValue()).get(Integer.valueOf(numQ4.intValue()));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                Integer num2 = numQ4 != null ? (Integer) ((Map) this.N.getValue()).get(Integer.valueOf(numQ4.intValue())) : null;
                boolean z3 = num2 != null && num2.intValue() > 0 && iIntValue >= num2.intValue();
                kVar = new k(Boolean.valueOf(z3), Boolean.valueOf(iIntValue > 0 && !z3));
            } else {
                Boolean bool = Boolean.FALSE;
                kVar = new k(bool, bool);
            }
            boolean zBooleanValue = ((Boolean) kVar.e).booleanValue();
            boolean zBooleanValue2 = ((Boolean) kVar.y).booleanValue();
            int iHashCode = str4.hashCode();
            if (iHashCode == 3714) {
                z = false;
                if (str4.equals("tv")) {
                    rVar.b0(709563062);
                    bVarQ = androidx.room.r.q(R.drawable.ic_tv_placeholder, rVar);
                    rVar.p(false);
                } else {
                    rVar.b0(709573081);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    rVar.p(z);
                }
            } else if (iHashCode == 92676538) {
                z = false;
                if (str4.equals("adult")) {
                    rVar.b0(709568118);
                    bVarQ = androidx.room.r.q(R.drawable.ic_menu_adult_xxx, rVar);
                    rVar.p(false);
                } else {
                    rVar.b0(709573081);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    rVar.p(z);
                }
            } else if (iHashCode == 92962932) {
                z = false;
                if (str4.equals("anime")) {
                    rVar.b0(709565650);
                    bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                    rVar.p(false);
                } else {
                    rVar.b0(709573081);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    rVar.p(z);
                }
            } else if (iHashCode == 98120385 && str4.equals("games")) {
                rVar.b0(709570706);
                bVarQ = androidx.room.r.q(R.drawable.ic_menu_games, rVar);
                z = false;
                rVar.p(false);
            } else {
                z = false;
                rVar.b0(709573081);
                bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                rVar.p(z);
            }
            androidx.compose.ui.graphics.painter.b bVar = bVarQ;
            androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(o.b, yVar);
            String str5 = fVar.c;
            String strConcat = fVar.d;
            if (strConcat != null) {
                if (!kotlin.text.r.O(strConcat, "http", z)) {
                    strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                }
                str = strConcat;
            } else {
                str = null;
            }
            Double d2 = fVar.f;
            String str6 = fVar.g;
            String strY0 = str6 != null ? kotlin.text.k.y0(4, str6) : null;
            h hVar = str4.equals("live_tv") ? i.b : i.a;
            boolean zF2 = rVar.f(fVar) | rVar.f(this.z) | rVar.f(this.A) | rVar.f(this.B) | rVar.f(this.C) | rVar.f(this.D) | rVar.f(this.E) | rVar.f(this.F);
            Object objQ3 = rVar.Q();
            if (zF2 || objQ3 == fVar2) {
                d dVar = new d(fVar, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
                rVar.l0(dVar);
                objQ3 = dVar;
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ3;
            boolean z4 = (((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && rVar.d(iIntValue2)) || (i2 & 48) == 32;
            List list = this.G;
            boolean zH2 = rVar.h(list) | z4 | rVar.f(this.H);
            z1 z1Var = this.I;
            boolean zH3 = zH2 | rVar.h(z1Var) | rVar.f(fVar) | rVar.h(this.J);
            Object objQ4 = rVar.Q();
            if (zH3 || objQ4 == fVar2) {
                str2 = str5;
                d = d2;
                z2 = false;
                com.app.mlounge.ui.screens.history.e eVar = new com.app.mlounge.ui.screens.history.e(iIntValue2, list, this.H, z1Var, fVar, this.J, this.O, 1);
                rVar.l0(eVar);
                objQ4 = eVar;
            } else {
                str2 = str5;
                d = d2;
                z2 = false;
            }
            b0.h(str2, str, aVar, rVarK, d, strY0, (kotlin.jvm.functions.a) objQ4, hVar, bVar, f3, zBooleanValue, zBooleanValue2, 0.0f, null, rVar, 134217728, 0, 12288);
            rVar.p(z2);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
