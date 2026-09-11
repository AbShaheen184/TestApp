package com.app.mlounge.ui.screens.search;

import androidx.compose.runtime.m;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.settings.e0;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(List list, Object obj, int i) {
        this.e = i;
        this.y = list;
        this.z = obj;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        y yVar = y.a;
        Object obj5 = this.z;
        androidx.compose.runtime.f fVar = m.a;
        List list = this.y;
        int i2 = 4;
        switch (i) {
            case 0:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                q qVar = (q) obj5;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (rVar.f(jVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (!rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    rVar.W();
                } else {
                    IptvChannel iptvChannel = (IptvChannel) list.get(iIntValue);
                    rVar.b0(1121889313);
                    String strC = iptvChannel.c();
                    String strB = iptvChannel.b();
                    if (strB == null) {
                        strB = "";
                    }
                    String str = strB;
                    String strA = iptvChannel.a();
                    String strD = iptvChannel.d();
                    boolean zF = rVar.f(qVar) | rVar.f(iptvChannel);
                    Object objQ = rVar.Q();
                    if (zF || objQ == fVar) {
                        objQ = new com.app.mlounge.ui.screens.downloads.e(i2, qVar, iptvChannel);
                        rVar.l0(objQ);
                    }
                    b0.f(strC, str, (kotlin.jvm.functions.a) objQ, null, strA, strD, null, rVar, 0, 72);
                    rVar.p(false);
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (rVar2.f(dVar) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (!rVar2.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    rVar2.W();
                } else {
                    File file = (File) list.get(iIntValue3);
                    rVar2.b0(949174630);
                    String name = file.getName();
                    name.getClass();
                    androidx.compose.ui.graphics.vector.f fVarB = kotlin.math.a.c;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(10.0f, 4.0f);
                        gVar.k(4.0f);
                        gVar.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar.m(2.0f, 18.0f);
                        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.l(16.0f);
                        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar.r(8.0f);
                        gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar.l(-8.0f);
                        gVar.n(-2.0f, -2.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
                        fVarB = eVar.b();
                        kotlin.math.a.c = fVarB;
                    }
                    boolean zH = rVar2.h(file);
                    Object objQ2 = rVar2.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new com.app.mlounge.ui.screens.downloads.e(7, file, (y0) obj5);
                        rVar2.l0(objQ2);
                    }
                    e0.j(name, fVarB, (kotlin.jvm.functions.a) objQ2, rVar2, 0);
                    rVar2.p(false);
                }
                break;
        }
        return yVar;
    }
}
