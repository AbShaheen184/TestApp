package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.t2;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.MusicGenre;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j0(Context context, androidx.activity.compose.t tVar, androidx.activity.compose.t tVar2, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, e1 e1Var) {
        this.y = context;
        this.B = tVar;
        this.A = tVar2;
        this.C = y0Var;
        this.D = y0Var2;
        this.E = e1Var;
        this.z = y0Var3;
        this.F = y0Var4;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.o((String) this.y, (kotlin.jvm.functions.l) this.A, (MusicGenre) this.E, (kotlin.jvm.functions.l) this.C, (String) this.B, (List) this.z, (kotlin.jvm.functions.l) this.D, (androidx.compose.ui.r) this.F, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 1:
                String str = (String) this.y;
                List list = (List) this.z;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.B;
                y0 y0Var = (y0) this.C;
                y0 y0Var2 = (y0) this.D;
                y0 y0Var3 = (y0) this.E;
                y0 y0Var4 = (y0) this.F;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t2.c(w0.c(w0.d(androidx.compose.ui.o.b, 0.9f), 0.75f), androidx.compose.foundation.shape.e.a(16), t2.i(com.app.mlounge.ui.theme.b.b, rVar, 0), null, androidx.compose.runtime.internal.k.c(485764076, new com.app.mlounge.ui.screens.settings.h(str, list, aVar, y0Var, y0Var2, y0Var3, y0Var4, lVar, 0), rVar), rVar, 196614, 24);
                } else {
                    rVar.W();
                }
                break;
            default:
                final Context context = (Context) this.y;
                final androidx.activity.compose.t tVar = (androidx.activity.compose.t) this.B;
                final androidx.activity.compose.t tVar2 = (androidx.activity.compose.t) this.A;
                final y0 y0Var5 = (y0) this.C;
                final y0 y0Var6 = (y0) this.D;
                final e1 e1Var = (e1) this.E;
                final y0 y0Var7 = (y0) this.z;
                final y0 y0Var8 = (y0) this.F;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH = rVar2.h(context) | rVar2.h(tVar) | rVar2.h(tVar2);
                    Object objQ = rVar2.Q();
                    if (zH || objQ == androidx.compose.runtime.m.a) {
                        kotlin.jvm.functions.a aVar2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.g
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() throws Exception {
                                e0.b(context, tVar, tVar2, y0Var5, y0Var6, y0Var7, y0Var8, e1Var);
                                return kotlin.y.a;
                            }
                        };
                        rVar2.l0(aVar2);
                        objQ = aVar2;
                    }
                    t2.h((kotlin.jvm.functions.a) objQ, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.w, rVar2, 805306368, 510);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j0(String str, List list, kotlin.jvm.functions.a aVar, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, kotlin.jvm.functions.l lVar) {
        this.y = str;
        this.z = list;
        this.B = aVar;
        this.C = y0Var;
        this.D = y0Var2;
        this.E = y0Var3;
        this.F = y0Var4;
        this.A = lVar;
    }

    public /* synthetic */ j0(String str, kotlin.jvm.functions.l lVar, MusicGenre musicGenre, kotlin.jvm.functions.l lVar2, String str2, List list, kotlin.jvm.functions.l lVar3, androidx.compose.ui.r rVar, int i) {
        this.y = str;
        this.A = lVar;
        this.E = musicGenre;
        this.C = lVar2;
        this.B = str2;
        this.z = list;
        this.D = lVar3;
        this.F = rVar;
    }
}
