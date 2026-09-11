package com.app.mlounge.ui.screens.anime;

import androidx.compose.runtime.q2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.v;
import com.app.mlounge.ui.viewmodel.z;
import j$.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.A = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        String str;
        switch (this.e) {
            case 0:
                Integer numB = ((HiAnimeEpisode) this.A).b();
                if (numB != null) {
                    ((Map) this.y).put(Integer.valueOf(numB.intValue()), (y) this.z);
                }
                break;
            case 1:
                ((Map) this.y).put(((com.app.mlounge.data.local.entity.c) this.A).a, (y) this.z);
                break;
            case 2:
                r rVar = (r) this.z;
                a0 a0Var = (a0) this.A;
                IptvChannel iptvChannel = (IptvChannel) this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var), null, null, new v(a0Var, iptvChannel, null, 0), 3, null);
                if (kotlin.text.r.O(iptvChannel.f(), "ntv://", false)) {
                    String strF = iptvChannel.f();
                    com.app.mlounge.ui.screens.livetv.h hVar = new com.app.mlounge.ui.screens.livetv.h(1, rVar);
                    strF.getClass();
                    List listP0 = kotlin.text.k.p0(new String[]{"|"}, kotlin.text.k.j0(strF, "ntv://"), 6);
                    if (listP0.size() >= 3) {
                        String str2 = (String) listP0.get(0);
                        String str3 = (String) listP0.get(1);
                        CharSequence charSequence = (CharSequence) listP0.get(2);
                        if (kotlin.text.k.d0(charSequence)) {
                            charSequence = "cdnlive";
                        }
                        String str4 = (String) charSequence;
                        String str5 = (String) kotlin.collections.o.N(3, listP0);
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = str5;
                        String str7 = (String) kotlin.collections.o.N(4, listP0);
                        BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var), null, null, new q2(a0Var, str2, str3, str4, str6, str7 != null ? URLDecoder.decode(str7, "UTF-8") : null, hVar, null, 4), 3, null);
                    }
                } else if (kotlin.jvm.internal.l.a(iptvChannel.d(), "earthcam")) {
                    BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var), null, null, new z(a0Var, iptvChannel, new com.app.mlounge.ui.screens.livetv.h(2, rVar), null), 3, null);
                } else {
                    rVar.invoke(iptvChannel.f(), iptvChannel.c(), null, null);
                }
                break;
            case 3:
                int iIntValue = ((Number) ((y0) this.z).getValue()).intValue();
                if (iIntValue == 0) {
                    str = "snes";
                } else if (iIntValue != 1) {
                    str = iIntValue != 2 ? "psp" : "nes";
                } else {
                    str = "sega-genesis";
                }
                ((p) this.A).invoke(str, ((Game) this.y).c());
                break;
            case 4:
                ((Map) this.y).put(Integer.valueOf(((TmdbEpisode) this.A).a()), (y) this.z);
                break;
            default:
                ((Map) this.y).put(((com.app.mlounge.data.local.entity.f) this.A).a, (y) this.z);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ g(Map map, Object obj, y yVar, int i) {
        this.e = i;
        this.y = map;
        this.A = obj;
        this.z = yVar;
    }
}
