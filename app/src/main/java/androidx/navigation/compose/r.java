package androidx.navigation.compose;

import androidx.collection.e0;
import androidx.compose.animation.f1;
import androidx.compose.animation.l0;
import androidx.compose.animation.x0;
import androidx.compose.foundation.text.c0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.ui.components.d0;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.ArrayList;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ t2 y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ r(e0 e0Var, i iVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, t2 t2Var, y0 y0Var) {
        this.B = e0Var;
        this.C = iVar;
        this.z = lVar;
        this.A = lVar2;
        this.D = lVar3;
        this.E = t2Var;
        this.y = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.jvm.functions.l lVar = this.z;
        y yVar = y.a;
        t2 t2Var = this.y;
        Object obj2 = this.D;
        Object obj3 = this.A;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.E;
        int i2 = 1;
        switch (i) {
            case 0:
                e0 e0Var = (e0) obj5;
                i iVar = (i) obj4;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj3;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj2;
                y0 y0Var = (y0) t2Var;
                androidx.compose.animation.v vVar = (androidx.compose.animation.v) obj;
                boolean zContains = ((List) ((t2) obj6).getValue()).contains(vVar.b());
                float f = 0.0f;
                if (!zContains) {
                    x0 x0Var = x0.b;
                    androidx.compose.animation.y0 y0Var2 = androidx.compose.animation.y0.b;
                    int i3 = androidx.compose.animation.m.b;
                    return new l0(x0Var, y0Var2, 0.0f, new f1(androidx.compose.animation.l.z));
                }
                String str = ((androidx.navigation.i) vVar.b()).C;
                int iB = e0Var.b(str);
                if (iB >= 0) {
                    f = e0Var.c[iB];
                } else {
                    e0Var.d(str, 0.0f);
                }
                if (!kotlin.jvm.internal.l.a(((androidx.navigation.i) vVar.c()).C, ((androidx.navigation.i) vVar.b()).C)) {
                    f = (((Boolean) iVar.c.getValue()).booleanValue() || ((Boolean) y0Var.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                e0Var.d(((androidx.navigation.i) vVar.c()).C, f);
                return new l0((x0) lVar.invoke(vVar), (androidx.compose.animation.y0) lVar2.invoke(vVar), f, (f1) lVar3.invoke(vVar));
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(1160055476, true, new d0(i2, (TmdbPersonDetail) obj2, (kotlin.jvm.functions.a) obj6, (y0) t2Var)), new com.app.mlounge.ui.q(25));
                hVar.q(arrayList.size(), new c0(15, new com.app.mlounge.ui.q(26), arrayList), new com.app.mlounge.ui.screens.anime.l(1, arrayList), new androidx.compose.runtime.internal.f(-1117249557, true, new com.app.mlounge.ui.screens.person.c(arrayList, lVar, i2)));
                hVar.q(arrayList2.size(), new c0(16, new com.app.mlounge.ui.q(27), arrayList2), new com.app.mlounge.ui.screens.anime.l(2, arrayList2), new androidx.compose.runtime.internal.f(-1117249557, true, new com.app.mlounge.ui.screens.person.c(arrayList2, (kotlin.jvm.functions.l) obj3, 0)));
                return yVar;
            default:
                t2 t2Var2 = (t2) obj6;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                hVar2.q(((List) t2Var2.getValue()).size(), new androidx.compose.material3.internal.u(t2Var2, 4), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(1665863341, true, new com.app.mlounge.ui.o((x1) obj5, this.z, t2Var2, (t2) obj4, (t2) obj3, (t2) obj2)));
                if (((Boolean) t2Var.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar2, com.app.mlounge.ui.screens.tvshows.a.c, null);
                }
                return yVar;
        }
    }

    public /* synthetic */ r(y0 y0Var, x1 x1Var, kotlin.jvm.functions.l lVar, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5) {
        this.E = y0Var;
        this.B = x1Var;
        this.z = lVar;
        this.C = y0Var2;
        this.A = y0Var3;
        this.D = y0Var4;
        this.y = y0Var5;
    }

    public /* synthetic */ r(ArrayList arrayList, ArrayList arrayList2, TmdbPersonDetail tmdbPersonDetail, kotlin.jvm.functions.a aVar, y0 y0Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        this.B = arrayList;
        this.C = arrayList2;
        this.D = tmdbPersonDetail;
        this.E = aVar;
        this.y = y0Var;
        this.z = lVar;
        this.A = lVar2;
    }
}
