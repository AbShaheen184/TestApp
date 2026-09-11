package com.app.mlounge.ui.screens.anime;

import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.player.b1;
import com.app.mlounge.ui.screens.player.i0;
import com.app.mlounge.ui.viewmodel.a0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ Object z;

    public m(List list, b1 b1Var, kotlin.jvm.functions.l lVar) {
        this.e = 2;
        this.y = list;
        this.A = b1Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String str;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem = (HiAnimeItem) ((ArrayList) this.y).get(iIntValue);
                    rVar.b0(1662225337);
                    String strA = hiAnimeItem.a();
                    String strC = hiAnimeItem.c();
                    String strD = hiAnimeItem.d();
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_menu_anime, rVar);
                    Map map = (Map) ((t2) this.A).getValue();
                    String strB = hiAnimeItem.b();
                    if (strB == null) {
                        strB = "";
                    }
                    Float f = (Float) map.get("anime:".concat(strB));
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    boolean zF = rVar.f(hiAnimeItem) | rVar.f(lVar);
                    Object objQ = rVar.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new j(hiAnimeItem, lVar, 1);
                        rVar.l0(objQ);
                    }
                    b0.h(strA, strC, (kotlin.jvm.functions.a) objQ, null, null, strD, null, null, bVarQ, fFloatValue, false, false, 0.0f, null, rVar, 134217728, 0, 15576);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.grid.j jVar2 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                r rVar3 = (r) this.A;
                a0 a0Var = (a0) this.z;
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(jVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    IptvChannel iptvChannel = (IptvChannel) this.y.get(iIntValue3);
                    rVar2.b0(-407213643);
                    String strC2 = iptvChannel.c();
                    String strB2 = iptvChannel.b();
                    String strA2 = iptvChannel.a();
                    String strD2 = iptvChannel.d();
                    boolean zH = rVar2.h(a0Var) | rVar2.f(iptvChannel) | rVar2.f(rVar3);
                    Object objQ2 = rVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zH || objQ2 == fVar) {
                        objQ2 = new g(2, a0Var, iptvChannel, rVar3);
                        rVar2.l0(objQ2);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ2;
                    boolean zH2 = rVar2.h(a0Var) | rVar2.f(iptvChannel);
                    Object objQ3 = rVar2.Q();
                    if (zH2 || objQ3 == fVar) {
                        objQ3 = new com.app.mlounge.ui.screens.downloads.e(1, a0Var, iptvChannel);
                        rVar2.l0(objQ3);
                    }
                    b0.f(strC2, strB2, aVar, null, strA2, strD2, (kotlin.jvm.functions.a) objQ3, rVar2, 0, 8);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
            case 2:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                if ((iIntValue6 & 6) == 0) {
                    i3 = (rVar4.f(dVar) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= rVar4.d(iIntValue5) ? 32 : 16;
                }
                if (rVar4.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    b1 b1Var = (b1) this.y.get(iIntValue5);
                    rVar4.b0(-927539213);
                    String str2 = b1Var.a;
                    androidx.compose.ui.graphics.vector.f fVarN = b1Var.d ? t1.n() : _COROUTINE.b.u();
                    boolean zA = kotlin.jvm.internal.l.a((b1) this.A, b1Var);
                    String str3 = b1Var.i;
                    boolean zF2 = rVar4.f(lVar2) | rVar4.f(b1Var);
                    Object objQ4 = rVar4.Q();
                    if (zF2 || objQ4 == androidx.compose.runtime.m.a) {
                        objQ4 = new com.app.mlounge.ui.screens.downloads.e(3, lVar2, b1Var);
                        rVar4.l0(objQ4);
                    }
                    i0.i(str2, fVarN, zA, str3, (kotlin.jvm.functions.a) objQ4, rVar4, 0, 0);
                    rVar4.p(false);
                } else {
                    rVar4.W();
                }
                break;
            case 3:
                androidx.compose.foundation.lazy.grid.j jVar3 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                p pVar = (p) this.A;
                y0 y0Var = (y0) this.z;
                if ((iIntValue8 & 6) == 0) {
                    i4 = (rVar5.f(jVar3) ? 4 : 2) | iIntValue8;
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= rVar5.d(iIntValue7) ? 32 : 16;
                }
                if (rVar5.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    Game game = (Game) this.y.get(iIntValue7);
                    rVar5.b0(-1262212793);
                    String strA3 = game.a();
                    if (strA3 == null) {
                        strA3 = "Unknown";
                    }
                    String strB3 = game.b();
                    if (strB3 == null) {
                        strB3 = "";
                    }
                    String strD3 = game.d();
                    String strY0 = strD3 != null ? kotlin.text.k.y0(4, strD3) : "";
                    androidx.compose.ui.graphics.painter.b bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_games, rVar5);
                    boolean zF3 = rVar5.f(y0Var) | rVar5.f(pVar) | rVar5.f(game);
                    Object objQ5 = rVar5.Q();
                    if (zF3 || objQ5 == androidx.compose.runtime.m.a) {
                        objQ5 = new g(3, pVar, game, y0Var);
                        rVar5.l0(objQ5);
                    }
                    b0.h(strA3, strB3, (kotlin.jvm.functions.a) objQ5, null, null, strY0, null, null, bVarQ2, 0.0f, false, false, 0.0f, null, rVar5, 134217728, 0, 16088);
                    rVar5.p(false);
                } else {
                    rVar5.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.grid.j jVar4 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.A;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.z;
                if ((iIntValue10 & 6) == 0) {
                    i5 = (rVar6.f(jVar4) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= rVar6.d(iIntValue9) ? 32 : 16;
                }
                if (rVar6.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    Object obj5 = this.y.get(iIntValue9);
                    rVar6.b0(2057642708);
                    long j = com.app.mlounge.ui.theme.b.n;
                    boolean z2 = obj5 instanceof MusicAlbum;
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                    androidx.compose.ui.layout.h hVar = androidx.compose.ui.layout.i.e;
                    if (z2) {
                        rVar6.b0(2057767420);
                        MusicAlbum musicAlbum = (MusicAlbum) obj5;
                        String strC3 = musicAlbum.c();
                        String strB4 = musicAlbum.b();
                        str = strB4 != null ? strB4 : "";
                        String strA4 = musicAlbum.a();
                        com.app.mlounge.ui.components.i0 i0VarT = b0.t(_COROUTINE.b.s(), j, rVar6, 48);
                        boolean zH3 = rVar6.h(obj5) | rVar6.f(lVar4);
                        Object objQ6 = rVar6.Q();
                        if (zH3 || objQ6 == fVar2) {
                            objQ6 = new com.app.mlounge.ui.screens.music.h(lVar4, musicAlbum, 1);
                            rVar6.l0(objQ6);
                        }
                        z = false;
                        b0.h(strC3, str, (kotlin.jvm.functions.a) objQ6, null, null, strA4, null, hVar, i0VarT, 0.0f, false, false, 0.0f, null, rVar6, 146800640, 0, 15960);
                        rVar6 = rVar6;
                        rVar6.p(false);
                    } else {
                        z = false;
                        if (obj5 instanceof MusicArtist) {
                            rVar6.b0(2058374338);
                            MusicArtist musicArtist = (MusicArtist) obj5;
                            String strB5 = musicArtist.b();
                            String strA5 = musicArtist.a();
                            str = strA5 != null ? strA5 : "";
                            com.app.mlounge.ui.components.i0 i0VarT2 = b0.t(t1.q(), j, rVar6, 48);
                            boolean zH4 = rVar6.h(obj5) | rVar6.f(lVar3);
                            Object objQ7 = rVar6.Q();
                            if (zH4 || objQ7 == fVar2) {
                                objQ7 = new com.app.mlounge.ui.screens.downloads.e(5, lVar3, musicArtist);
                                rVar6.l0(objQ7);
                            }
                            b0.h(strB5, str, (kotlin.jvm.functions.a) objQ7, null, null, "Artist", null, hVar, i0VarT2, 0.0f, false, false, 0.0f, null, rVar6, 146997248, 0, 15960);
                            rVar6 = rVar6;
                            rVar6.p(false);
                        } else if (obj5 instanceof MusicTrack) {
                            rVar6.b0(2058981814);
                            MusicTrack musicTrack = (MusicTrack) obj5;
                            String strG = musicTrack.g();
                            String strE = musicTrack.e();
                            str = strE != null ? strE : "";
                            String strB6 = musicTrack.b();
                            com.app.mlounge.ui.components.i0 i0VarT3 = b0.t(_COROUTINE.b.s(), j, rVar6, 48);
                            boolean zH5 = rVar6.h(obj5) | rVar6.f(lVar4);
                            Object objQ8 = rVar6.Q();
                            if (zH5 || objQ8 == fVar2) {
                                objQ8 = new com.app.mlounge.ui.screens.downloads.e(6, musicTrack, lVar4);
                                rVar6.l0(objQ8);
                            }
                            b0.h(strG, str, (kotlin.jvm.functions.a) objQ8, null, null, strB6, null, hVar, i0VarT3, 0.0f, false, false, 0.0f, null, rVar6, 146800640, 0, 15960);
                            rVar6 = rVar6;
                            rVar6.p(false);
                        } else {
                            rVar6.b0(2059710779);
                            rVar6.p(false);
                        }
                    }
                    rVar6.p(z);
                } else {
                    rVar6.W();
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ m(List list, Object obj, Object obj2, int i) {
        this.e = i;
        this.y = list;
        this.z = obj;
        this.A = obj2;
    }
}
