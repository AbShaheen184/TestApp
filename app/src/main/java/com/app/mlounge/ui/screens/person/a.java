package com.app.mlounge.ui.screens.person;

import androidx.compose.animation.core.c1;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.m0;
import androidx.compose.material3.d;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.i0;
import com.google.android.gms.dynamite.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(626004942, false, new n(27));

    public static final void a(int i, kotlin.jvm.functions.a aVar, l lVar, l lVar2, i0 i0Var, r rVar, int i2) {
        i0 i0Var2;
        int i3;
        i0 i0Var3;
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        rVar.c0(208632801);
        int i4 = i2 | (rVar.d(i) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 8192;
        if (rVar.T(i4 & 1, (i4 & 9363) != 9362)) {
            rVar.Y();
            if ((i2 & 1) == 0 || rVar.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i0 i0Var4 = (i0) h1.B(a0.a(i0.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                    i3 = i4 & (-57345);
                    i0Var3 = i0Var4;
                }
            } else {
                rVar.W();
                i3 = i4 & (-57345);
                i0Var3 = i0Var;
            }
            rVar.q();
            y0 y0VarG = s.g(i0Var3.d, rVar);
            y0 y0VarG2 = s.g(i0Var3.f, rVar);
            y0 y0VarG3 = s.g(i0Var3.h, rVar);
            y0 y0VarG4 = s.g(i0Var3.j, rVar);
            Integer numValueOf = Integer.valueOf(i);
            int i5 = i3 & 14;
            boolean zH = rVar.h(i0Var3) | (i5 == 4);
            Object objQ = rVar.Q();
            Object obj = m.a;
            if (zH || objQ == obj) {
                objQ = new c1(i0Var3, i, null, 18);
                rVar.l0(objQ);
            }
            j0.c(rVar, numValueOf, (p) objQ);
            if (((Boolean) y0VarG3.getValue()).booleanValue()) {
                rVar.b0(-1367325357);
                b0.n(null, rVar, 0);
                rVar.p(false);
            } else if (((String) y0VarG4.getValue()) != null) {
                rVar.b0(-1367323890);
                String str = (String) y0VarG4.getValue();
                str.getClass();
                boolean zH2 = rVar.h(i0Var3) | (i5 == 4);
                Object objQ2 = rVar.Q();
                if (zH2 || objQ2 == obj) {
                    objQ2 = new androidx.compose.foundation.text.selection.b0(i0Var3, i, 2);
                    rVar.l0(objQ2);
                }
                b0.i(str, null, (kotlin.jvm.functions.a) objQ2, rVar, 0);
                rVar.p(false);
            } else {
                if (((TmdbPersonDetail) y0VarG.getValue()) == null) {
                    rVar.b0(-1367320621);
                    b0.n(null, rVar, 0);
                    rVar.p(false);
                } else {
                    rVar.b0(562907466);
                    TmdbPersonDetail tmdbPersonDetail = (TmdbPersonDetail) y0VarG.getValue();
                    tmdbPersonDetail.getClass();
                    List list = (List) y0VarG2.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (kotlin.jvm.internal.l.a(((TmdbMultiResult) obj2).c(), "movie")) {
                            arrayList.add(obj2);
                        }
                    }
                    List list2 = (List) y0VarG2.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (kotlin.jvm.internal.l.a(((TmdbMultiResult) obj3).c(), "tv")) {
                            arrayList2.add(obj3);
                        }
                    }
                    androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f = 12;
                    m0 m0Var = new m0(f, f, f, f);
                    float f2 = 8;
                    androidx.compose.foundation.layout.f fVarG = h.g(f2);
                    androidx.compose.foundation.layout.f fVarG2 = h.g(f2);
                    boolean zF = ((i3 & 896) == 256) | ((i3 & Token.ASSIGN_MOD) == 32) | rVar.f(tmdbPersonDetail) | rVar.f(y0VarG2) | rVar.h(arrayList) | rVar.h(arrayList2) | ((i3 & 7168) == 2048);
                    Object objQ3 = rVar.Q();
                    if (zF || objQ3 == obj) {
                        objQ3 = new androidx.navigation.compose.r(arrayList, arrayList2, tmdbPersonDetail, aVar, y0VarG2, lVar, lVar2);
                        rVar.l0(objQ3);
                    }
                    g.a(aVar2, null, null, m0Var, fVarG2, fVarG, null, false, null, (l) objQ3, rVar, 1772544, 918);
                    rVar.p(false);
                }
                i0Var2 = i0Var3;
            }
            i0Var2 = i0Var3;
        } else {
            rVar.W();
            i0Var2 = i0Var;
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new d(i, aVar, lVar, lVar2, i0Var2, i2);
        }
    }
}
