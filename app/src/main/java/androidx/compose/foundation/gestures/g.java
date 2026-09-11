package androidx.compose.foundation.gestures;

import android.content.Context;
import android.widget.Toast;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(androidx.compose.runtime.r rVar, androidx.compose.runtime.changelist.a aVar, androidx.compose.runtime.e2 e2Var, androidx.compose.runtime.x0 x0Var) {
        this.e = 3;
        this.y = rVar;
        this.z = aVar;
        this.A = e2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        kotlin.y yVar;
        int i;
        switch (this.e) {
            case 0:
                j jVar = (j) this.y;
                b3 b3Var = (b3) this.z;
                c cVar = (c) this.A;
                com.app.mlounge.data.music.e eVar = jVar.P;
                while (true) {
                    androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) eVar.y;
                    int i2 = bVar.z;
                    yVar = kotlin.y.a;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            androidx.transition.k.m("MutableVector is empty.");
                            return null;
                        }
                        androidx.compose.ui.geometry.c cVar2 = (androidx.compose.ui.geometry.c) ((f) bVar.e[i2 - 1]).a.invoke();
                        if (cVar2 == null ? true : j.M0(jVar, cVar2, 0L, 0L, 3)) {
                            androidx.compose.runtime.collection.b bVar2 = (androidx.compose.runtime.collection.b) eVar.y;
                            ((f) bVar2.k(bVar2.z - 1)).b.resumeWith(yVar);
                        }
                    }
                }
                if (jVar.Q) {
                    androidx.compose.ui.geometry.c cVar3 = (androidx.compose.ui.geometry.c) jVar.O.invoke();
                    if (cVar3 != null && j.M0(jVar, cVar3, 0L, 0L, 3)) {
                        jVar.Q = false;
                    }
                }
                b3Var.e = j.L0(jVar, cVar, 0L);
                return yVar;
            case 1:
                androidx.compose.runtime.e0 e0Var = (androidx.compose.runtime.e0) this.y;
                androidx.compose.foundation.lazy.z zVar = (androidx.compose.foundation.lazy.z) this.z;
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) this.A;
                androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) e0Var.getValue();
                return new androidx.compose.foundation.lazy.m(zVar, kVar, dVar, new androidx.appcompat.widget.x((kotlin.ranges.d) zVar.e.f.getValue(), kVar));
            case 2:
                androidx.compose.foundation.relocation.h hVar = (androidx.compose.foundation.relocation.h) this.y;
                androidx.compose.ui.geometry.c cVarL0 = androidx.compose.foundation.relocation.h.L0(hVar, (androidx.compose.ui.node.d1) this.z, (androidx.compose.ui.draw.b) this.A);
                if (cVarL0 == null) {
                    return null;
                }
                j jVar2 = hVar.L;
                if (androidx.compose.ui.unit.l.a(jVar2.R, 0L)) {
                    androidx.compose.foundation.internal.b.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarL0.i(jVar2.O0(cVarL0, jVar2.R, 0L) ^ (-9223372034707292160L));
            case 3:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) this.y;
                androidx.compose.runtime.changelist.a aVar = (androidx.compose.runtime.changelist.a) this.z;
                androidx.compose.runtime.e2 e2Var = (androidx.compose.runtime.e2) this.A;
                androidx.compose.runtime.changelist.b bVar3 = rVar.M;
                androidx.compose.runtime.changelist.a aVar2 = bVar3.b;
                try {
                    bVar3.b = aVar;
                    androidx.compose.runtime.e2 e2Var2 = rVar.G;
                    int[] iArr = rVar.o;
                    androidx.collection.z zVar2 = rVar.v;
                    rVar.o = null;
                    rVar.v = null;
                    try {
                        rVar.G = e2Var;
                        boolean z = bVar3.e;
                        try {
                            bVar3.e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar3.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        rVar.G = e2Var2;
                        rVar.o = iArr;
                        rVar.v = zVar2;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar3.b = aVar2;
                    throw th3;
                }
            case 4:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) this.y;
                androidx.compose.runtime.i2 i2Var = (androidx.compose.runtime.i2) this.z;
                androidx.compose.runtime.changelist.k0 k0Var = (androidx.compose.runtime.changelist.k0) this.A;
                if (aVar3 != null) {
                    i2Var.a(i2Var.c(aVar3) - i2Var.t);
                }
                List listK = kotlin.math.a.k(i2Var, null, i2Var.t, null);
                androidx.compose.runtime.tooling.b bVar4 = (androidx.compose.runtime.tooling.b) kotlin.collections.o.T(listK);
                Integer num = bVar4 != null ? bVar4.b : null;
                List listH = k0Var.h(num);
                if (num != null && !listH.isEmpty()) {
                    listH = kotlin.collections.o.X(com.google.common.base.c.p(new androidx.compose.runtime.tooling.b(((androidx.compose.runtime.tooling.b) kotlin.collections.o.K(listH)).a, null, num)), kotlin.collections.o.H(listH));
                }
                return new androidx.compose.runtime.tooling.a(kotlin.collections.o.X(listK, listH));
            case 5:
                androidx.compose.runtime.internal.b bVar5 = (androidx.compose.runtime.internal.b) this.y;
                androidx.compose.runtime.internal.c cVar4 = (androidx.compose.runtime.internal.c) this.z;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                bVar5.a();
                androidx.compose.runtime.internal.a aVar4 = (androidx.compose.runtime.internal.a) cVar4.z;
                int i3 = xVar.e;
                do {
                    i = aVar4.get();
                } while (!aVar4.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return kotlin.y.a;
            case 6:
                androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) this.y;
                androidx.compose.runtime.t2 t2Var2 = (androidx.compose.runtime.t2) this.z;
                androidx.compose.runtime.t2 t2Var3 = (androidx.compose.runtime.t2) this.A;
                List list = com.app.mlounge.ui.navigation.w.f;
                ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.app.mlounge.ui.navigation.w) it.next()).a);
                }
                if (!((List) t2Var.getValue()).isEmpty()) {
                    Set setO0 = kotlin.collections.o.o0((List) t2Var.getValue());
                    List list2 = (List) t2Var.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!setO0.contains((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = kotlin.collections.o.X(list2, arrayList2);
                }
                List list3 = com.app.mlounge.ui.navigation.w.f;
                int iU = kotlin.collections.a0.u(kotlin.collections.p.y(list3, 10));
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (Object obj2 : list3) {
                    linkedHashMap.put(((com.app.mlounge.ui.navigation.w) obj2).a, obj2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) linkedHashMap.get((String) it2.next());
                    if (wVar != null) {
                        arrayList3.add(wVar);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    com.app.mlounge.ui.navigation.w wVar2 = (com.app.mlounge.ui.navigation.w) obj3;
                    boolean z2 = wVar2.e && !((Boolean) t2Var2.getValue()).booleanValue();
                    boolean zContains = ((Set) t2Var3.getValue()).contains(wVar2.b);
                    if (!z2 && !zContains) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 7:
                kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) this.y;
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.z;
                androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) this.A;
                if (!((Boolean) y0Var.getValue()).booleanValue()) {
                    y0Var2.setValue(Boolean.FALSE);
                    if (aVar5 != null) {
                        aVar5.invoke();
                    }
                }
                return kotlin.y.a;
            case 8:
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
                androidx.compose.runtime.y0 y0Var3 = (androidx.compose.runtime.y0) this.A;
                lVar.invoke(this.z);
                y0Var3.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 9:
                com.app.mlounge.ui.viewmodel.s sVar = (com.app.mlounge.ui.viewmodel.s) this.y;
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.z;
                String strA = ((GamePlatform) ((androidx.compose.runtime.y0) this.A).getValue()).a();
                strA.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(sVar), null, null, new com.app.mlounge.ui.screens.adult.e(gameDetailResponse, sVar, strA, null, 10), 3, null);
                return kotlin.y.a;
            case 10:
                ((kotlin.jvm.functions.p) this.y).invoke(((GamePlatform) ((androidx.compose.runtime.y0) this.A).getValue()).a(), ((Game) this.z).c());
                return kotlin.y.a;
            case 11:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.y;
                String str = (String) this.z;
                androidx.compose.runtime.y0 y0Var4 = (androidx.compose.runtime.y0) this.A;
                lVar2.invoke(str);
                y0Var4.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 12:
                com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(h0Var), null, null, new com.app.mlounge.ui.screens.adult.e(h0Var, (String) this.A, (MusicAlbumDetail) this.z, null, 14), 3, null);
                return kotlin.y.a;
            case 13:
                com.app.mlounge.ui.viewmodel.h0 h0Var2 = (com.app.mlounge.ui.viewmodel.h0) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(h0Var2), null, null, new com.app.mlounge.ui.screens.adult.e(h0Var2, (String) this.A, (MusicArtistDetail) this.z, null, 15), 3, null);
                return kotlin.y.a;
            case 14:
                String str2 = (String) this.y;
                androidx.compose.runtime.y0 y0Var5 = (androidx.compose.runtime.y0) this.z;
                androidx.compose.runtime.y0 y0Var6 = (androidx.compose.runtime.y0) this.A;
                y0Var5.setValue(str2);
                y0Var6.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 15:
                com.app.mlounge.ui.screens.player.z0 z0Var = (com.app.mlounge.ui.screens.player.z0) this.y;
                androidx.activity.compose.t tVar = (androidx.activity.compose.t) this.z;
                Context context = (Context) this.A;
                androidx.media3.exoplayer.c0 c0Var = z0Var.g;
                if (c0Var != null) {
                    c0Var.M(false);
                }
                try {
                    tVar.a(new String[]{"application/x-subrip", "text/vtt", "application/ttml+xml", "text/x-ssa", "*/*"});
                    break;
                } catch (Exception unused) {
                    Toast.makeText(context, "File picker not available", 0).show();
                }
                return kotlin.y.a;
            case 16:
                ((kotlin.jvm.functions.p) this.y).invoke(kotlin.text.k.A0((String) ((androidx.compose.runtime.y0) this.z).getValue()).toString(), kotlin.text.k.A0((String) ((androidx.compose.runtime.y0) this.A).getValue()).toString());
                return kotlin.y.a;
            case 17:
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                String str3 = (String) this.z;
                String str4 = (String) this.A;
                str3.getClass();
                pVar.invoke(str3, str4);
                return kotlin.y.a;
            case 18:
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.y;
                com.app.mlounge.ui.viewmodel.y1 y1Var = (com.app.mlounge.ui.viewmodel.y1) this.z;
                androidx.compose.runtime.y0 y0Var7 = (androidx.compose.runtime.y0) this.A;
                lVar3.invoke(y1Var);
                y0Var7.setValue(Boolean.FALSE);
                return kotlin.y.a;
            default:
                okhttp3.i iVar = (okhttp3.i) this.y;
                okhttp3.q qVar = (okhttp3.q) this.z;
                okhttp3.a aVar6 = (okhttp3.a) this.A;
                com.google.android.material.resources.b bVar6 = iVar.b;
                bVar6.getClass();
                return bVar6.f(aVar6.h.d, qVar.a());
        }
    }

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
