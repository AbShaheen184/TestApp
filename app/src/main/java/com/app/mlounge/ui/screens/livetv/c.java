package com.app.mlounge.ui.screens.livetv;

import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.foundation.lazy.grid.q;
import androidx.compose.foundation.lazy.k;
import androidx.compose.foundation.text.c0;
import androidx.compose.material3.internal.u;
import androidx.compose.runtime.m;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.i0;
import com.app.mlounge.ui.screens.anime.n;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ l A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ l z;

    public /* synthetic */ c(y0 y0Var, long j, l lVar, l lVar2, y0 y0Var2) {
        this.B = y0Var;
        this.y = j;
        this.z = lVar;
        this.A = lVar2;
        this.C = y0Var2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                List list = (List) this.B;
                Map map = (Map) this.C;
                k kVar = (k) obj;
                kVar.getClass();
                kVar.q(list.size(), new c0(10, new n(19), list), new com.app.mlounge.ui.screens.adult.g(5, list), new androidx.compose.runtime.internal.f(2039820996, true, new f(list, map, this.z, this.A, this.y)));
                break;
            default:
                final t2 t2Var = (t2) this.B;
                t2 t2Var2 = (t2) this.C;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                int size = ((List) t2Var.getValue()).size();
                u uVar = new u(t2Var, 3);
                final long j = this.y;
                final l lVar = this.z;
                final l lVar2 = this.A;
                hVar.q(size, uVar, q.e, new androidx.compose.runtime.internal.f(1716231643, true, new r() { // from class: com.app.mlounge.ui.screens.music.i
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj3).intValue();
                        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((j) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= rVar.d(iIntValue) ? 32 : 16;
                        }
                        if (rVar.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                            Object obj6 = ((List) t2Var.getValue()).get(iIntValue);
                            boolean z = obj6 instanceof MusicAlbum;
                            long j2 = j;
                            androidx.compose.runtime.f fVar = m.a;
                            androidx.compose.ui.layout.h hVar2 = androidx.compose.ui.layout.i.e;
                            if (z) {
                                rVar.b0(966391987);
                                MusicAlbum musicAlbum = (MusicAlbum) obj6;
                                String strC = musicAlbum.c();
                                String strB = musicAlbum.b();
                                String strA = musicAlbum.a();
                                i0 i0VarT = b0.t(_COROUTINE.b.s(), j2, rVar, 0);
                                l lVar3 = lVar;
                                boolean zH = rVar.h(obj6) | rVar.f(lVar3);
                                Object objQ = rVar.Q();
                                if (zH || objQ == fVar) {
                                    objQ = new com.app.mlounge.ui.screens.movies.g(5, lVar3, musicAlbum);
                                    rVar.l0(objQ);
                                }
                                b0.h(strC, strB, (kotlin.jvm.functions.a) objQ, null, null, strA, null, hVar2, i0VarT, 0.0f, false, false, 0.0f, null, rVar, 146800640, 0, 15960);
                                rVar.p(false);
                            } else if (obj6 instanceof MusicArtist) {
                                rVar.b0(966987993);
                                MusicArtist musicArtist = (MusicArtist) obj6;
                                String strB2 = musicArtist.b();
                                String strA2 = musicArtist.a();
                                i0 i0VarT2 = b0.t(t1.q(), j2, rVar, 0);
                                l lVar4 = lVar2;
                                boolean zH2 = rVar.h(obj6) | rVar.f(lVar4);
                                Object objQ2 = rVar.Q();
                                if (zH2 || objQ2 == fVar) {
                                    objQ2 = new com.app.mlounge.ui.screens.movies.g(6, lVar4, musicArtist);
                                    rVar.l0(objQ2);
                                }
                                b0.h(strB2, strA2, (kotlin.jvm.functions.a) objQ2, null, null, "Artist", null, hVar2, i0VarT2, 0.0f, false, false, 0.0f, null, rVar, 146997248, 0, 15960);
                                rVar.p(false);
                            } else {
                                rVar.b0(967479591);
                                rVar.p(false);
                            }
                        } else {
                            rVar.W();
                        }
                        return y.a;
                    }
                }));
                if (((Boolean) t2Var2.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar, com.app.mlounge.ui.screens.music.a.f, new com.app.mlounge.ui.q(24));
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ c(List list, Map map, l lVar, l lVar2, long j) {
        this.B = list;
        this.C = map;
        this.z = lVar;
        this.A = lVar2;
        this.y = j;
    }
}
