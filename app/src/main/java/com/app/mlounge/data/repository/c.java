package com.app.mlounge.data.repository;

import com.app.mlounge.data.providers.e1;
import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ r A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, a aVar, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.z = aVar;
        this.A = rVar;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c(0, this.z, this.A, this.B, dVar);
            default:
                return new c(1, this.z, this.A, this.B, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((c) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x024a  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        String str6;
        String str7;
        Object objE;
        String str8;
        Object objF;
        int i = this.e;
        a aVar = this.z;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        r rVar = this.A;
        String str9 = this.B;
        switch (i) {
            case 0:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objE = obj;
                    return (EpornerVideoDetail) objE;
                }
                kotlin.a.e(obj);
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    com.app.mlounge.data.providers.s sVar = rVar.b;
                    sVar.getClass();
                    kotlin.k kVarC = com.app.mlounge.data.providers.s.c(str9);
                    String str10 = (String) kVarC.e;
                    String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.xvideos.com", str10);
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    String strB = sVar.b(strH);
                    if (strB != null) {
                        kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<meta\\s+property=\"og:title\"\\s+content=\"([^\"]+)\"", 0, strB, strB);
                        if (gVarQ == null || (string = (String) ((kotlin.collections.b0) gVarQ.a()).get(1)) == null) {
                            kotlin.text.g gVarQ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<title>([^<]+)", 0, strB, strB);
                            if (gVarQ2 == null || (str2 = (String) ((kotlin.collections.b0) gVarQ2.a()).get(1)) == null) {
                                str = "";
                            } else {
                                String string2 = kotlin.text.k.A0(kotlin.text.r.M(str2, " - XVIDEOS.COM", "", false)).toString();
                                str = string2;
                            }
                        } else {
                            str = string2;
                        }
                        kotlin.text.g gVarQ3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<meta\\s+property=\"og:image\"\\s+content=\"([^\"]+)\"", 0, strB, strB);
                        if (gVarQ3 == null || (str3 = (String) ((kotlin.collections.b0) gVarQ3.a()).get(1)) == null) {
                            str3 = "";
                        }
                        kotlin.text.g gVarQ4 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<meta\\s+property=\"og:duration\"\\s+content=\"(\\d+)\"", 0, strB, strB);
                        if (gVarQ4 == null || (str6 = (String) ((kotlin.collections.b0) gVarQ4.a()).get(1)) == null) {
                            str4 = "";
                        } else {
                            Integer numQ = kotlin.text.r.Q(str6);
                            if (numQ != null) {
                                int iIntValue = numQ.intValue();
                                str7 = (iIntValue / 60) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue % 60)}, 1));
                            } else {
                                str7 = null;
                            }
                            if (str7 != null) {
                                str4 = str7;
                            } else {
                                str4 = "";
                            }
                        }
                        kotlin.text.g gVarQ5 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"views\"\\s*:\\s*\"([^\"]+)\"", 0, strB, strB);
                        if (gVarQ5 == null || (string = (String) ((kotlin.collections.b0) gVarQ5.a()).get(1)) == null) {
                            kotlin.text.g gVarQ6 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<div\\s+class=[\"']video-views[\"'][^>]*>([^<]+)", 0, strB, strB);
                            string = (gVarQ6 == null || (str5 = (String) ((kotlin.collections.b0) gVarQ6.a()).get(1)) == null) ? "" : kotlin.text.k.A0(str5).toString();
                        }
                        ArrayList arrayList = new ArrayList();
                        androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("<a\\s+href=\"[^\"]*tags[^\"]*\"[^>]*>([^<]+)</a>"), strB));
                        while (m0Var.hasNext()) {
                            arrayList.add(kotlin.text.k.A0((String) ((kotlin.collections.b0) ((kotlin.text.g) m0Var.next()).a()).get(1)).toString());
                        }
                        if (arrayList.isEmpty()) {
                            kotlin.text.g gVarQ7 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"keywords\"\\s*:\\s*\"([^\"]+)\"", 0, strB, strB);
                            String str11 = gVarQ7 != null ? (String) ((kotlin.collections.b0) gVarQ7.a()).get(1) : null;
                            if (str11 != null) {
                                List listP0 = kotlin.text.k.p0(new String[]{","}, str11, 6);
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(listP0, 10));
                                Iterator it = listP0.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(kotlin.text.k.A0((String) it.next()).toString());
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        return new EpornerVideoDetail(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("xvideos_", str10), str, kotlin.collections.o.R(arrayList, ", ", null, null, null, 62), kotlin.text.r.R(kotlin.text.r.M(string, ",", "", false)), null, null, str4, str3.length() > 0 ? new EpornerThumb(str3, null, null) : null, null);
                    }
                } else {
                    if (iOrdinal == 1) {
                        return rVar.c.c(str9);
                    }
                    if (iOrdinal == 2) {
                        e1 e1Var = rVar.d;
                        this.y = 1;
                        objE = e1Var.e(str9, this);
                        if (objE == aVar2) {
                            return aVar2;
                        }
                        return (EpornerVideoDetail) objE;
                    }
                    coil3.g.a();
                }
                return null;
            default:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objF = obj;
                    return (EpornerResolveResponse) objF;
                }
                kotlin.a.e(obj);
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    com.app.mlounge.data.providers.s sVar2 = rVar.b;
                    sVar2.getClass();
                    str9.getClass();
                    String strH2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.xvideos.com", (String) com.app.mlounge.data.providers.s.c(str9).e);
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    String strB2 = sVar2.b(strH2);
                    if (strB2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        kotlin.text.g gVarQ8 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"contentUrl\"\\s*:\\s*\"([^\"]+)\"", 0, strB2, strB2);
                        String strM = (gVarQ8 == null || (str8 = (String) ((kotlin.collections.b0) gVarQ8.a()).get(1)) == null) ? null : kotlin.text.r.M(str8, "\\/", "/", false);
                        if (strM != null) {
                            linkedHashMap.put("MP4", new EpornerSourceDetail("MP4", strM, "mp4", Boolean.TRUE));
                        }
                        kotlin.text.g gVarQ9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("html5player\\.setVideoHLS\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str12 = gVarQ9 != null ? (String) ((kotlin.collections.b0) gVarQ9.a()).get(1) : null;
                        if (str12 != null) {
                            linkedHashMap.put("HLS", new EpornerSourceDetail("HLS", str12, "hls", Boolean.valueOf(linkedHashMap.isEmpty())));
                        }
                        kotlin.text.g gVarQ10 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("html5player\\.setVideoUrlHigh\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str13 = gVarQ10 != null ? (String) ((kotlin.collections.b0) gVarQ10.a()).get(1) : null;
                        if (str13 != null && !linkedHashMap.containsKey("MP4")) {
                            linkedHashMap.put("High", new EpornerSourceDetail("High", str13, "mp4", Boolean.valueOf(linkedHashMap.isEmpty())));
                        }
                        kotlin.text.g gVarQ11 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("html5player\\.setVideoUrlLow\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str14 = gVarQ11 != null ? (String) ((kotlin.collections.b0) gVarQ11.a()).get(1) : null;
                        if (str14 != null && linkedHashMap.isEmpty()) {
                            linkedHashMap.put("Low", new EpornerSourceDetail("Low", str14, "mp4", Boolean.TRUE));
                        }
                        if (!linkedHashMap.isEmpty()) {
                            Map mapSingletonMap = Collections.singletonMap("mp4", linkedHashMap);
                            mapSingletonMap.getClass();
                            return new EpornerResolveResponse(mapSingletonMap);
                        }
                        com.app.mlounge.util.a.f("EpornerScraper", "extractVideoSources — no sources found in HTML");
                    }
                } else {
                    if (iOrdinal2 == 1) {
                        return rVar.c.d(str9);
                    }
                    if (iOrdinal2 == 2) {
                        e1 e1Var2 = rVar.d;
                        this.y = 1;
                        objF = e1Var2.f(str9, this);
                        if (objF == aVar2) {
                            return aVar2;
                        }
                        return (EpornerResolveResponse) objF;
                    }
                    coil3.g.a();
                }
                return null;
        }
    }
}
