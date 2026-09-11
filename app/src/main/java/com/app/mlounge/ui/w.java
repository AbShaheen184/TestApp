package com.app.mlounge.ui;

import android.content.Context;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbMovie;
import j$.net.URLDecoder;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ t2 C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.d z;

    public /* synthetic */ w(Object obj, kotlin.d dVar, Object obj2, Object obj3, t2 t2Var, int i) {
        this.e = i;
        this.y = obj;
        this.z = dVar;
        this.A = obj2;
        this.B = obj3;
        this.C = t2Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                com.app.mlounge.data.remote.ntv.l lVar = (com.app.mlounge.data.remote.ntv.l) this.A;
                Context context = (Context) this.B;
                y0 y0Var = (y0) this.C;
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                str.getClass();
                str2.getClass();
                if (kotlin.text.r.O(str, "ntv://", false)) {
                    List listP0 = kotlin.text.k.p0(new String[]{"|"}, kotlin.text.k.j0(str, "ntv://"), 6);
                    if (listP0.size() >= 3) {
                        String str3 = (String) listP0.get(0);
                        String str4 = (String) listP0.get(1);
                        CharSequence charSequence = (CharSequence) listP0.get(2);
                        if (kotlin.text.k.d0(charSequence)) {
                            charSequence = "cdnlive";
                        }
                        String str5 = (String) charSequence;
                        String str6 = (String) kotlin.collections.o.N(3, listP0);
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = str6;
                        String str8 = (String) kotlin.collections.o.N(4, listP0);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new e0(str3, lVar, context, str4, str5, str7, str8 != null ? URLDecoder.decode(str8, "UTF-8") : null, rVar, y0Var, null), 3, null);
                    }
                } else {
                    rVar.invoke(str, str2, map, null);
                }
                break;
            default:
                com.app.mlounge.ui.viewmodel.e0 e0Var = (com.app.mlounge.ui.viewmodel.e0) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                t2 t2Var = (t2) this.A;
                t2 t2Var2 = (t2) this.B;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= rVar2.d(iIntValue) ? 32 : 16;
                }
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    TmdbMovie tmdbMovie = (TmdbMovie) ((List) t2Var.getValue()).get(iIntValue);
                    String strE = tmdbMovie.e();
                    if (strE == null) {
                        strE = "Unknown";
                    }
                    String strC = tmdbMovie.c();
                    e0Var.b.getClass();
                    String strB = com.app.mlounge.data.repository.j0.b(strC, "w500");
                    Double dF = tmdbMovie.f();
                    String strD = tmdbMovie.d();
                    String strY0 = strD != null ? kotlin.text.k.y0(4, strD) : null;
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar2);
                    Float f = (Float) ((Map) t2Var2.getValue()).get("movie:" + tmdbMovie.a());
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    boolean zContains = ((Set) this.C.getValue()).contains("movie:" + tmdbMovie.a());
                    boolean zF = rVar2.f(lVar2) | rVar2.h(tmdbMovie);
                    Object objQ = rVar2.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new com.app.mlounge.ui.screens.movies.g(1, lVar2, tmdbMovie);
                        rVar2.l0(objQ);
                    }
                    com.app.mlounge.ui.components.b0.h(strE, strB, (kotlin.jvm.functions.a) objQ, null, dF, strY0, null, null, bVarQ, fFloatValue, zContains, false, 0.0f, null, rVar2, 134217728, 0, 14536);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
