package androidx.compose.ui.text.platform;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.p;
import androidx.compose.runtime.m;
import androidx.compose.ui.text.font.s;
import androidx.compose.ui.text.font.u;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.w;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ c(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                d dVar = (d) this.y;
                u uVarB = ((androidx.compose.ui.text.font.f) dVar.B).b((s) obj, (androidx.compose.ui.text.font.l) obj2, ((androidx.compose.ui.text.font.j) obj3).a, ((androidx.compose.ui.text.font.k) obj4).a);
                if (uVarB instanceof u) {
                    Object obj5 = uVarB.e;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                c2 c2Var = new c2(uVarB, dVar.G);
                dVar.G = c2Var;
                Object obj6 = c2Var.A;
                obj6.getClass();
                return (Typeface) obj6;
            case 1:
                androidx.media3.exoplayer.hls.c cVar = (androidx.media3.exoplayer.hls.c) this.y;
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                androidx.sqlite.db.framework.h hVar = new androidx.sqlite.db.framework.h(sQLiteQuery);
                androidx.sqlite.driver.e eVar = (androidx.sqlite.driver.e) cVar.e;
                int length = eVar.A.length;
                for (int i = 1; i < length; i++) {
                    int i2 = eVar.A[i];
                    if (i2 == 1) {
                        hVar.f(i, eVar.B[i]);
                    } else if (i2 == 2) {
                        hVar.G(eVar.C[i], i);
                    } else if (i2 == 3) {
                        String str2 = eVar.D[i];
                        str2.getClass();
                        hVar.l(i, str2);
                    } else if (i2 == 4) {
                        byte[] bArr = eVar.E[i];
                        bArr.getClass();
                        hVar.C(bArr, i);
                    } else if (i2 == 5) {
                        hVar.i(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                final w wVar = (w) this.y;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zF = rVar.f(wVar);
                Object objQ = rVar.Q();
                if (zF || objQ == m.a) {
                    objQ = new kotlin.jvm.functions.s() { // from class: com.app.mlounge.ui.b0
                        @Override // kotlin.jvm.functions.s
                        public final Object c(Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                            String str3 = (String) obj7;
                            String str4 = (String) obj8;
                            Integer num = (Integer) obj9;
                            num.getClass();
                            Integer num2 = (Integer) obj10;
                            int iIntValue = num2.intValue();
                            Integer num3 = (Integer) obj11;
                            str3.getClass();
                            str4.getClass();
                            wVar.b(str3, str4, null, iIntValue > 0 ? "tv" : "movie", "mp4", num, num2, num3, "");
                            return kotlin.y.a;
                        }
                    };
                    rVar.l0(objQ);
                }
                com.app.mlounge.ui.screens.downloads.a.b((kotlin.jvm.functions.s) objQ, null, rVar, 0);
                return y.a;
        }
    }
}
