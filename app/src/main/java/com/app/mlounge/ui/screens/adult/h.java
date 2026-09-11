package com.app.mlounge.ui.screens.adult;

import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.m;
import androidx.compose.runtime.s;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.player.i0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.text.k;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ l z;

    public /* synthetic */ h(List list, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String strA;
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
                    EpornerVideo epornerVideo = (EpornerVideo) this.y.get(iIntValue);
                    rVar.b0(-254035874);
                    String strD = epornerVideo.d();
                    if (strD == null) {
                        strD = "";
                    }
                    EpornerThumb epornerThumbA = epornerVideo.a();
                    String strH = null;
                    String strA2 = epornerThumbA != null ? epornerThumbA.a() : null;
                    String strC = epornerVideo.c();
                    if (strC != null && !k.d0(strC)) {
                        strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Duration: ", epornerVideo.c());
                    }
                    String str = strH;
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_menu_adult_xxx, rVar);
                    l lVar = this.z;
                    boolean zF = rVar.f(lVar) | rVar.h(epornerVideo);
                    Object objQ = rVar.Q();
                    if (zF || objQ == m.a) {
                        objQ = new f(lVar, epornerVideo, 0);
                        rVar.l0(objQ);
                    }
                    b0.h(strD, strA2, (kotlin.jvm.functions.a) objQ, null, null, str, null, null, bVarQ, 0.0f, false, false, 1.7777778f, null, rVar, 134217728, 384, 11992);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(dVar) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem = (HiAnimeItem) this.y.get(iIntValue3);
                    rVar2.b0(834834607);
                    String strA3 = hiAnimeItem.a();
                    String strC2 = hiAnimeItem.c();
                    boolean zF2 = rVar2.f(hiAnimeItem);
                    l lVar2 = this.z;
                    boolean zF3 = zF2 | rVar2.f(lVar2);
                    Object objQ2 = rVar2.Q();
                    if (zF3 || objQ2 == m.a) {
                        objQ2 = new com.app.mlounge.ui.screens.anime.j(hiAnimeItem, lVar2, 0);
                        rVar2.l0(objQ2);
                    }
                    b0.h(strA3, strC2, (kotlin.jvm.functions.a) objQ2, w0.p(o.b, 130), null, null, null, null, null, 0.0f, false, false, 0.0f, null, rVar2, 3072, 0, 16368);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
            case 2:
                j jVar2 = (j) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (rVar3.f(jVar2) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= rVar3.d(iIntValue5) ? 32 : 16;
                }
                if (rVar3.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    MusicAlbum musicAlbum = (MusicAlbum) this.y.get(iIntValue5);
                    rVar3.b0(208439932);
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(o.b, 8, 0.0f, 2);
                    q0 q0VarD = p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarQ);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar);
                    } else {
                        rVar3.o0();
                    }
                    s.x(rVar3, q0VarD, androidx.compose.ui.node.f.e);
                    s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar3, androidx.compose.ui.node.f.g);
                    s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                    String strC3 = musicAlbum.c();
                    String strB = musicAlbum.b();
                    String strE = musicAlbum.e();
                    if (strE == null) {
                        strE = "Album";
                    }
                    l lVar3 = this.z;
                    boolean zF4 = rVar3.f(lVar3) | rVar3.f(musicAlbum);
                    Object objQ3 = rVar3.Q();
                    if (zF4 || objQ3 == m.a) {
                        objQ3 = new com.app.mlounge.ui.screens.music.h(lVar3, musicAlbum, 0);
                        rVar3.l0(objQ3);
                    }
                    b0.h(strC3, strB, (kotlin.jvm.functions.a) objQ3, null, null, strE, null, androidx.compose.ui.layout.i.e, null, 0.0f, false, false, 0.0f, null, rVar3, 12582912, 0, 16216);
                    rVar3.p(true);
                    rVar3.p(false);
                } else {
                    rVar3.W();
                }
                break;
            case 3:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = (rVar4.f(dVar2) ? 4 : 2) | iIntValue8;
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= rVar4.d(iIntValue7) ? 32 : 16;
                }
                if (rVar4.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    com.app.mlounge.ui.screens.player.a aVar = (com.app.mlounge.ui.screens.player.a) this.y.get(iIntValue7);
                    rVar4.b0(811853802);
                    String str2 = aVar.a;
                    androidx.compose.ui.graphics.vector.f fVarO = com.google.firebase.b.o();
                    boolean z = aVar.d;
                    l lVar4 = this.z;
                    boolean zF5 = rVar4.f(lVar4) | rVar4.f(aVar);
                    Object objQ4 = rVar4.Q();
                    if (zF5 || objQ4 == m.a) {
                        objQ4 = new com.app.mlounge.ui.screens.downloads.e(2, lVar4, aVar);
                        rVar4.l0(objQ4);
                    }
                    i0.i(str2, fVarO, z, null, (kotlin.jvm.functions.a) objQ4, rVar4, 0, 8);
                    rVar4.p(false);
                } else {
                    rVar4.W();
                }
                break;
            case 4:
                j jVar3 = (j) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = (rVar5.f(jVar3) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= rVar5.d(iIntValue9) ? 32 : 16;
                }
                if (rVar5.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem2 = (HiAnimeItem) this.y.get(iIntValue9);
                    rVar5.b0(-347088184);
                    String strA4 = hiAnimeItem2.a();
                    String strC4 = hiAnimeItem2.c();
                    if (strC4 == null) {
                        strC4 = "";
                    }
                    androidx.compose.ui.graphics.painter.b bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_anime, rVar5);
                    boolean zF6 = rVar5.f(hiAnimeItem2);
                    l lVar5 = this.z;
                    boolean zF7 = zF6 | rVar5.f(lVar5);
                    Object objQ5 = rVar5.Q();
                    if (zF7 || objQ5 == m.a) {
                        objQ5 = new com.app.mlounge.ui.screens.anime.j(hiAnimeItem2, lVar5, 2);
                        rVar5.l0(objQ5);
                    }
                    b0.h(strA4, strC4, (kotlin.jvm.functions.a) objQ5, null, null, "ANIME", null, null, bVarQ2, 0.0f, false, false, 0.0f, null, rVar5, 134414336, 0, 16088);
                    rVar5.p(false);
                } else {
                    rVar5.W();
                }
                break;
            default:
                j jVar4 = (j) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = (rVar6.f(jVar4) ? 4 : 2) | iIntValue12;
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= rVar6.d(iIntValue11) ? 32 : 16;
                }
                if (rVar6.T(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    EpornerVideo epornerVideo2 = (EpornerVideo) this.y.get(iIntValue11);
                    rVar6.b0(987775040);
                    String strD2 = epornerVideo2.d();
                    String str3 = "";
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    EpornerThumb epornerThumbA2 = epornerVideo2.a();
                    if (epornerThumbA2 != null && (strA = epornerThumbA2.a()) != null) {
                        str3 = strA;
                    }
                    String strC5 = epornerVideo2.c();
                    String strConcat = strC5 != null ? strC5.concat(" min") : "ADULT";
                    androidx.compose.ui.graphics.painter.b bVarQ3 = androidx.room.r.q(R.drawable.ic_menu_adult_xxx, rVar6);
                    l lVar6 = this.z;
                    boolean zF8 = rVar6.f(lVar6) | rVar6.h(epornerVideo2);
                    Object objQ6 = rVar6.Q();
                    if (zF8 || objQ6 == m.a) {
                        objQ6 = new f(lVar6, epornerVideo2, 1);
                        rVar6.l0(objQ6);
                    }
                    b0.h(strD2, str3, (kotlin.jvm.functions.a) objQ6, null, null, strConcat, null, null, bVarQ3, 0.0f, false, false, 0.0f, null, rVar6, 134217728, 0, 16088);
                    rVar6.p(false);
                } else {
                    rVar6.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
