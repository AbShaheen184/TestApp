package com.app.mlounge.ui.screens.history;

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
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.g;
import com.app.mlounge.ui.viewmodel.t;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.text.k;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ r B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ List E;
    public final /* synthetic */ kotlin.jvm.functions.a F;
    public final /* synthetic */ t G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ t2 I;
    public final /* synthetic */ y0 J;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public f(List list, Map map, l lVar, l lVar2, r rVar, l lVar3, l lVar4, List list2, kotlin.jvm.functions.a aVar, t tVar, Context context, t2 t2Var, y0 y0Var) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = rVar;
        this.C = lVar3;
        this.D = lVar4;
        this.E = list2;
        this.F = aVar;
        this.G = tVar;
        this.H = context;
        this.I = t2Var;
        this.J = y0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:105:0x020c  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:113:0x0244  */
    /* JADX WARN: Code duplicated, block: B:116:0x024e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0258  */
    /* JADX WARN: Code duplicated, block: B:121:0x0264  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:150:0x030f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[PHI: r16
  0x018f: PHI (r16v4 java.lang.String) = (r16v3 java.lang.String), (r16v7 java.lang.String) binds: [B:79:0x018c, B:76:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x01af. Please report as an issue. */
    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        String str;
        String strY0;
        int iHashCode;
        t2 t2Var;
        float fFloatValue;
        String str2;
        String str3;
        Float f;
        androidx.compose.ui.graphics.painter.b bVarQ;
        boolean z;
        androidx.compose.ui.graphics.painter.b bVar;
        boolean z2;
        androidx.compose.ui.graphics.painter.b bVarQ2;
        String strConcat;
        String str4;
        Double d;
        h hVar;
        int i;
        boolean zF;
        Object objQ;
        int i2;
        com.app.mlounge.data.local.entity.c cVar;
        int i3;
        int i4;
        List list;
        t tVar;
        boolean zH;
        Object objQ2;
        Double d2;
        Integer numQ;
        int iIntValue;
        int iIntValue2;
        Float f2;
        Integer numQ2;
        Float f3;
        j jVar = (j) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        int i5 = (iIntValue4 & 6) == 0 ? (rVar.f(jVar) ? 4 : 2) | iIntValue4 : iIntValue4;
        if ((iIntValue4 & 48) == 0) {
            i5 |= rVar.d(iIntValue3) ? 32 : 16;
        }
        if (rVar.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            com.app.mlounge.data.local.entity.c cVar2 = (com.app.mlounge.data.local.entity.c) this.e.get(iIntValue3);
            rVar.b0(858894835);
            String str5 = cVar2.a;
            Integer num = cVar2.n;
            Integer num2 = cVar2.m;
            String str6 = cVar2.b;
            boolean zF2 = rVar.f(str5);
            Object objQ3 = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (zF2 || objQ3 == fVar) {
                objQ3 = new y();
                rVar.l0(objQ3);
            }
            y yVar = (y) objQ3;
            Map map = this.y;
            boolean zH2 = rVar.h(map) | rVar.f(cVar2) | rVar.f(yVar);
            Object objQ4 = rVar.Q();
            if (zH2 || objQ4 == fVar) {
                objQ4 = new g(map, cVar2, yVar, 1);
                rVar.l0(objQ4);
            }
            j0.e((kotlin.jvm.functions.a) objQ4, rVar);
            if (num2 != null) {
                strY0 = "S" + num2 + "E" + (num != null ? num.intValue() : 0);
            } else {
                String str7 = cVar2.g;
                if (str7 != null) {
                    strY0 = k.y0(4, str7);
                } else {
                    str = null;
                }
                iHashCode = str6.hashCode();
                int i6 = i5;
                t2Var = this.I;
                fFloatValue = 0.0f;
                if (iHashCode != -795103699) {
                    str2 = str;
                    if (str6.equals("anime_tv")) {
                        str3 = cVar2.l;
                        if (str3 != null) {
                            fFloatValue = f.floatValue();
                        }
                    }
                } else if (iHashCode != -196215899) {
                    if (iHashCode != 3714) {
                        if (iHashCode == 104087344 && str6.equals("movie") && (numQ2 = kotlin.text.r.Q(k.j0(str5, "movie_"))) != null) {
                            f3 = (Float) ((Map) t2Var.getValue()).get("movie:" + numQ2.intValue());
                            if (f3 != null) {
                                fFloatValue = f3.floatValue();
                            }
                        }
                    } else if (str6.equals("tv") && (numQ = kotlin.text.r.Q(k.j0(str5, "tv_"))) != null) {
                        int iIntValue5 = numQ.intValue();
                        Map map2 = (Map) t2Var.getValue();
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        str2 = str;
                        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", iIntValue5, ":", iIntValue);
                        sbW.append(iIntValue2);
                        f2 = (Float) map2.get(sbW.toString());
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        }
                    }
                    str2 = str;
                } else {
                    str2 = str;
                    if (str6.equals("anime_movie")) {
                        str3 = cVar2.l;
                        if (str3 != null && (f = (Float) ((Map) t2Var.getValue()).get("anime:".concat(str3))) != null) {
                            fFloatValue = f.floatValue();
                        }
                    }
                }
                switch (str6.hashCode()) {
                    case -795103699:
                        if (str6.equals("anime_tv")) {
                            z = false;
                            rVar.b0(-942090666);
                            bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                            rVar.p(false);
                        } else {
                            rVar.b0(-942083235);
                            bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                            z = false;
                            rVar.p(false);
                        }
                        bVar = bVarQ;
                        break;
                    case -196215899:
                        if (str6.equals("anime_movie")) {
                            z = false;
                            rVar.b0(-942090666);
                            bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                            rVar.p(false);
                        } else {
                            rVar.b0(-942083235);
                            bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                            z = false;
                            rVar.p(false);
                        }
                        bVar = bVarQ;
                        break;
                    case 3714:
                        z2 = false;
                        if (str6.equals("tv")) {
                            rVar.b0(-942093830);
                            bVarQ2 = androidx.room.r.q(R.drawable.ic_tv_placeholder, rVar);
                            rVar.p(false);
                            bVar = bVarQ2;
                            z = z2;
                        }
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                        bVar = bVarQ;
                        break;
                    case 92676538:
                        z2 = false;
                        if (str6.equals("adult")) {
                            rVar.b0(-942088198);
                            bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_adult_xxx, rVar);
                            rVar.p(false);
                            bVar = bVarQ2;
                            z = z2;
                        }
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                        bVar = bVarQ;
                        break;
                    case 98120385:
                        if (str6.equals("games")) {
                            rVar.b0(-942085610);
                            bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_games, rVar);
                            z2 = false;
                            rVar.p(false);
                            bVar = bVarQ2;
                            z = z2;
                        }
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                        bVar = bVarQ;
                        break;
                    default:
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                        bVar = bVarQ;
                        break;
                }
                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(o.b, yVar);
                String str8 = cVar2.c;
                strConcat = cVar2.d;
                if (strConcat != null) {
                    if (!kotlin.text.r.O(strConcat, "http", z)) {
                        strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                    }
                    str4 = strConcat;
                } else {
                    str4 = null;
                }
                d = cVar2.f;
                if (str6.equals("live_tv")) {
                    hVar = i.b;
                } else {
                    hVar = i.a;
                }
                h hVar2 = hVar;
                boolean zF3 = rVar.f(cVar2);
                i = (i6 & Token.ASSIGN_MOD) ^ 48;
                zF = zF3 | (((i > 32 || !rVar.d(iIntValue3)) && (i6 & 48) != 32) ? z : true) | rVar.f(this.z) | rVar.f(this.A) | rVar.f(this.B) | rVar.f(this.C) | rVar.f(this.D);
                objQ = rVar.Q();
                if (!zF || objQ == fVar) {
                    i2 = iIntValue3;
                    cVar = cVar2;
                    i3 = i;
                    d dVar = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                    rVar.l0(dVar);
                    objQ = dVar;
                } else {
                    i3 = i;
                    i2 = iIntValue3;
                    cVar = cVar2;
                }
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                boolean z3 = (i3 <= 32 && rVar.d(i2)) || (i6 & 48) == 32;
                i4 = i2;
                list = this.E;
                boolean zH3 = rVar.h(list) | z3 | rVar.f(this.F);
                tVar = this.G;
                zH = zH3 | rVar.h(tVar) | rVar.f(cVar) | rVar.h(this.H);
                objQ2 = rVar.Q();
                if (!zH || objQ2 == fVar) {
                    d2 = d;
                    e eVar = new e(i4, list, this.F, tVar, cVar, this.H, this.J, 0);
                    rVar.l0(eVar);
                    objQ2 = eVar;
                } else {
                    d2 = d;
                }
                b0.h(str8, str4, aVar, rVarK, d2, str2, (kotlin.jvm.functions.a) objQ2, hVar2, bVar, fFloatValue, false, false, 0.0f, "HistoryCard", rVar, 134217728, 3072, 7168);
                rVar.p(false);
            }
            str = strY0;
            iHashCode = str6.hashCode();
            int i7 = i5;
            t2Var = this.I;
            fFloatValue = 0.0f;
            if (iHashCode != -795103699) {
                str2 = str;
                if (str6.equals("anime_tv")) {
                    str3 = cVar2.l;
                    if (str3 != null) {
                        fFloatValue = f.floatValue();
                    }
                }
            } else if (iHashCode != -196215899) {
                if (iHashCode != 3714) {
                    if (iHashCode == 104087344) {
                        f3 = (Float) ((Map) t2Var.getValue()).get("movie:" + numQ2.intValue());
                        if (f3 != null) {
                            fFloatValue = f3.floatValue();
                        }
                    }
                } else if (str6.equals("tv")) {
                    int iIntValue6 = numQ.intValue();
                    Map map3 = (Map) t2Var.getValue();
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    str2 = str;
                    StringBuilder sbW2 = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", iIntValue6, ":", iIntValue);
                    sbW2.append(iIntValue2);
                    f2 = (Float) map3.get(sbW2.toString());
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
                str2 = str;
            } else {
                str2 = str;
                if (str6.equals("anime_movie")) {
                    str3 = cVar2.l;
                    if (str3 != null) {
                        fFloatValue = f.floatValue();
                    }
                }
            }
            switch (str6.hashCode()) {
                case -795103699:
                    if (str6.equals("anime_tv")) {
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                    } else {
                        z = false;
                        rVar.b0(-942090666);
                        bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                        rVar.p(false);
                    }
                    bVar = bVarQ;
                    break;
                case -196215899:
                    if (str6.equals("anime_movie")) {
                        rVar.b0(-942083235);
                        bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                        z = false;
                        rVar.p(false);
                    } else {
                        z = false;
                        rVar.b0(-942090666);
                        bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                        rVar.p(false);
                    }
                    bVar = bVarQ;
                    break;
                case 3714:
                    z2 = false;
                    if (str6.equals("tv")) {
                        rVar.b0(-942093830);
                        bVarQ2 = androidx.room.r.q(R.drawable.ic_tv_placeholder, rVar);
                        rVar.p(false);
                        bVar = bVarQ2;
                        z = z2;
                    }
                    rVar.b0(-942083235);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    z = false;
                    rVar.p(false);
                    bVar = bVarQ;
                    break;
                case 92676538:
                    z2 = false;
                    if (str6.equals("adult")) {
                        rVar.b0(-942088198);
                        bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_adult_xxx, rVar);
                        rVar.p(false);
                        bVar = bVarQ2;
                        z = z2;
                    }
                    rVar.b0(-942083235);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    z = false;
                    rVar.p(false);
                    bVar = bVarQ;
                    break;
                case 98120385:
                    if (str6.equals("games")) {
                        rVar.b0(-942085610);
                        bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_games, rVar);
                        z2 = false;
                        rVar.p(false);
                        bVar = bVarQ2;
                        z = z2;
                    }
                    rVar.b0(-942083235);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    z = false;
                    rVar.p(false);
                    bVar = bVarQ;
                    break;
                default:
                    rVar.b0(-942083235);
                    bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    z = false;
                    rVar.p(false);
                    bVar = bVarQ;
                    break;
            }
            androidx.compose.ui.r rVarK2 = androidx.compose.ui.focus.d.k(o.b, yVar);
            String str9 = cVar2.c;
            strConcat = cVar2.d;
            if (strConcat != null) {
                if (!kotlin.text.r.O(strConcat, "http", z)) {
                    strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                }
                str4 = strConcat;
            } else {
                str4 = null;
            }
            d = cVar2.f;
            if (str6.equals("live_tv")) {
                hVar = i.b;
            } else {
                hVar = i.a;
            }
            h hVar3 = hVar;
            boolean zF4 = rVar.f(cVar2);
            i = (i7 & Token.ASSIGN_MOD) ^ 48;
            zF = zF4 | (((i > 32 || !rVar.d(iIntValue3)) && (i7 & 48) != 32) ? z : true) | rVar.f(this.z) | rVar.f(this.A) | rVar.f(this.B) | rVar.f(this.C) | rVar.f(this.D);
            objQ = rVar.Q();
            if (zF) {
                i2 = iIntValue3;
                cVar = cVar2;
                i3 = i;
                d dVar2 = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                rVar.l0(dVar2);
                objQ = dVar2;
            } else {
                i2 = iIntValue3;
                cVar = cVar2;
                i3 = i;
                d dVar3 = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                rVar.l0(dVar3);
                objQ = dVar3;
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ;
            if (i3 <= 32) {
            }
            i4 = i2;
            list = this.E;
            boolean zH4 = rVar.h(list) | z3 | rVar.f(this.F);
            tVar = this.G;
            zH = zH4 | rVar.h(tVar) | rVar.f(cVar) | rVar.h(this.H);
            objQ2 = rVar.Q();
            if (zH) {
                d2 = d;
                e eVar2 = new e(i4, list, this.F, tVar, cVar, this.H, this.J, 0);
                rVar.l0(eVar2);
                objQ2 = eVar2;
            } else {
                d2 = d;
                e eVar3 = new e(i4, list, this.F, tVar, cVar, this.H, this.J, 0);
                rVar.l0(eVar3);
                objQ2 = eVar3;
            }
            b0.h(str9, str4, aVar2, rVarK2, d2, str2, (kotlin.jvm.functions.a) objQ2, hVar3, bVar, fFloatValue, false, false, 0.0f, "HistoryCard", rVar, 134217728, 3072, 7168);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
