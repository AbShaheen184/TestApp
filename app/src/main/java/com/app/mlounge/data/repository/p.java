package com.app.mlounge.data.repository;

import com.app.mlounge.data.providers.e1;
import com.app.mlounge.data.remote.api.ChqApi;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int B;
    public Object C;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i, a aVar, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = aVar;
        this.z = rVar;
        this.A = str;
        this.B = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new p(this.B, (a) this.C, (r) this.z, (String) this.A, dVar);
            case 1:
                return new p(this.B, (r) this.z, (String) this.A, (String) this.C, dVar);
            default:
                return new p((x1) this.z, this.B, (TmdbSeason) this.A, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((p) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:221:0x0548  */
    /* JADX WARN: Code duplicated, block: B:222:0x0551  */
    /* JADX WARN: Code duplicated, block: B:230:0x05a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        kotlin.text.g gVarQ;
        String str2;
        String string;
        ?? r10;
        String strConcat;
        String str3;
        Integer numQ;
        List<String> listP;
        String string2;
        String strConcat2;
        String str4;
        String str5;
        EpornerThumb epornerThumb;
        Object next;
        String strConcat3;
        Object next2;
        String string3;
        String str6;
        String str7;
        kotlin.text.g gVarQ2;
        String str8;
        String string4;
        String strConcat4;
        String str9;
        String string5;
        Integer numValueOf;
        Object objG;
        MutableStateFlow mutableStateFlow;
        Object tvSeason;
        int i2 = this.e;
        int i3 = this.B;
        Object obj2 = this.A;
        Object obj3 = this.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i4 = 1;
        switch (i2) {
            case 0:
                String str10 = (String) obj2;
                r rVar = (r) obj3;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objG = obj;
                    return (EpornerSearchDetails) objG;
                }
                kotlin.a.e(obj);
                int iOrdinal = ((a) this.C).ordinal();
                if (iOrdinal == 0) {
                    com.app.mlounge.data.providers.s sVar = rVar.b;
                    sVar.getClass();
                    str10.getClass();
                    String lowerCase = str10.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int i6 = 0;
                    int i7 = i3 - 1;
                    String str11 = "https://www.xvideos.com/?k=" + kotlin.text.r.M(lowerCase, " ", "+", false) + "&p=" + i7;
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    String strB = sVar.b(str11);
                    if (strB != null) {
                        ArrayList arrayList = new ArrayList();
                        kotlin.text.g gVarQ3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("setDataSearch\\s*\\(\\s*(\\[[\\s\\S]+?])\\s*\\)", 0, strB, strB);
                        if (gVarQ3 != null) {
                            androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("\\{[^{}]+\\}"), (String) ((kotlin.collections.b0) gVarQ3.a()).get(1)));
                            while (m0Var.hasNext()) {
                                String strGroup = ((kotlin.text.g) m0Var.next()).a.group();
                                strGroup.getClass();
                                Pattern patternCompile = Pattern.compile("\"u\"\\s*:\\s*\"(/video[^\"]+)\"");
                                patternCompile.getClass();
                                Matcher matcher = patternCompile.matcher(strGroup);
                                matcher.getClass();
                                kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, i6, strGroup);
                                if (gVarC == null || (str = (String) ((kotlin.collections.b0) gVarC.a()).get(i4)) == null || (gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"t\"\\s*:\\s*\"([^\"]{1,200})\"", i6, strGroup, strGroup)) == null || (str2 = (String) ((kotlin.collections.b0) gVarQ.a()).get(1)) == null || (string = kotlin.text.k.A0(str2).toString()) == null) {
                                    i = i3;
                                } else {
                                    kotlin.text.g gVarQ4 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"tf2\"\\s*:\\s*\"([^\"]+)\"", 0, strGroup, strGroup);
                                    if (gVarQ4 == null || (strConcat = (String) ((kotlin.collections.b0) gVarQ4.a()).get(1)) == null) {
                                        r10 = 0;
                                        kotlin.text.g gVarQ5 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"tf\"\\s*:\\s*\"([^\"]+)\"", 0, strGroup, strGroup);
                                        if (gVarQ5 != null) {
                                            strConcat = (String) ((kotlin.collections.b0) gVarQ5.a()).get(1);
                                            r10 = 0;
                                        } else {
                                            strConcat = "";
                                        }
                                    } else {
                                        r10 = 0;
                                    }
                                    if (kotlin.text.r.O(strConcat, "//", r10)) {
                                        strConcat = "https:".concat(strConcat);
                                        i = i3;
                                    } else {
                                        i = i3;
                                        if (kotlin.text.r.O(strConcat, "/", r10)) {
                                            strConcat = "https://www.xvideos.com".concat(strConcat);
                                        }
                                    }
                                    kotlin.text.g gVarQ6 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\"d\"\\s*:\\s*(\\d+)", r10, strGroup, strGroup);
                                    int iIntValue = (gVarQ6 == null || (str3 = (String) ((kotlin.collections.b0) gVarQ6.a()).get(1)) == null || (numQ = kotlin.text.r.Q(str3)) == null) ? 0 : numQ.intValue();
                                    arrayList.add(new EpornerVideo("xvideos_".concat(str), string, null, null, null, null, iIntValue > 0 ? (iIntValue / 60) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue % 60)}, 1)) : "", strConcat.length() > 0 ? new EpornerThumb(strConcat, null, null) : null, null, "https://www.xvideos.com".concat(str)));
                                }
                                i3 = i;
                                i4 = 1;
                                i6 = 0;
                            }
                        }
                        int i8 = i3;
                        if (arrayList.isEmpty()) {
                            kotlin.o oVar2 = com.app.mlounge.util.a.a;
                            arrayList = new ArrayList();
                            Pattern patternCompile2 = Pattern.compile("(?=<div\\s[^>]*id=[\"']video[_-][a-zA-Z0-9]+[\"'])");
                            patternCompile2.getClass();
                            kotlin.text.k.m0(0);
                            Matcher matcher2 = patternCompile2.matcher(strB);
                            if (matcher2.find()) {
                                ArrayList arrayList2 = new ArrayList(10);
                                int iEnd = 0;
                                do {
                                    arrayList2.add(strB.subSequence(iEnd, matcher2.start()).toString());
                                    iEnd = matcher2.end();
                                } while (matcher2.find());
                                arrayList2.add(strB.subSequence(iEnd, strB.length()).toString());
                                listP = arrayList2;
                            } else {
                                listP = com.google.common.base.c.p(strB.toString());
                            }
                            for (String str12 : listP) {
                                Pattern patternCompile3 = Pattern.compile("id=[\"']video[_-][a-zA-Z0-9]+[\"']");
                                patternCompile3.getClass();
                                str12.getClass();
                                if (patternCompile3.matcher(str12).find() && ((gVarQ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("href=\"(/video[.\\-a-zA-Z0-9]*/[^\"?#\\s]+)", 0, str12, str12)) != null || (gVarQ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("href=\"(/video\\d+/[^\"?#\\s]+)", 0, str12, str12)) != null)) {
                                    String str13 = (String) ((kotlin.collections.b0) gVarQ2.a()).get(1);
                                    kotlin.text.g gVarQ7 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("title=\"([^\"]{2,200})\"", 0, str12, str12);
                                    if (gVarQ7 != null && (str8 = (String) ((kotlin.collections.b0) gVarQ7.a()).get(1)) != null && (string4 = kotlin.text.k.A0(str8).toString()) != null) {
                                        kotlin.text.g gVarQ8 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("data-src=\"((?:https?:)?//[^\"]+)", 0, str12, str12);
                                        if (gVarQ8 == null) {
                                            gVarQ8 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<img\\s[^>]*src=\"((?:https?:)?//[^\"]+cdn[^\"]+)", 0, str12, str12);
                                        }
                                        if (gVarQ8 == null || (strConcat4 = (String) ((kotlin.collections.b0) gVarQ8.a()).get(1)) == null) {
                                            strConcat4 = "";
                                        }
                                        if (kotlin.text.r.O(strConcat4, "//", false)) {
                                            strConcat4 = "https:".concat(strConcat4);
                                        }
                                        kotlin.text.g gVarQ9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("<span\\s+class=[\"']duration[\"'][^>]*>([^<]+)</span>", 0, str12, str12);
                                        arrayList.add(new EpornerVideo(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("xvideos_", str13), string4, null, null, null, null, (gVarQ9 == null || (str9 = (String) ((kotlin.collections.b0) gVarQ9.a()).get(1)) == null || (string5 = kotlin.text.k.A0(str9).toString()) == null) ? "" : string5, strConcat4.length() > 0 ? new EpornerThumb(strConcat4, null, null) : null, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.xvideos.com", str13)));
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                kotlin.text.i iVar = new kotlin.text.i("href=\"(/video[^\"]+)\"[^>]*?title=\"([^\"]{2,200})\"");
                                kotlin.text.i iVar2 = new kotlin.text.i("data-src=\"((?:https?:)?//[^\"]+?)\"");
                                kotlin.text.i iVar3 = new kotlin.text.i("<span\\s+class=[\"']duration[\"'][^>]*>([^<]+)</span>");
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                androidx.collection.m0 m0Var2 = new androidx.collection.m0(kotlin.text.i.b(iVar, strB));
                                while (m0Var2.hasNext()) {
                                    kotlin.text.g gVar = (kotlin.text.g) m0Var2.next();
                                    String str14 = (String) ((kotlin.collections.b0) gVar.a()).get(1);
                                    String string6 = kotlin.text.k.A0((String) ((kotlin.collections.b0) gVar.a()).get(2)).toString();
                                    if (!linkedHashSet.contains(str14)) {
                                        linkedHashSet.add(str14);
                                        LinkedHashSet linkedHashSet2 = linkedHashSet;
                                        int iB0 = kotlin.text.k.b0(strB, "href=\"" + str14 + "\"", 0, false, 6);
                                        if (iB0 >= 0) {
                                            String strSubstring = strB.substring(iB0, Math.min(strB.length(), iB0 + 600));
                                            kotlin.text.g gVarA = iVar2.a(strSubstring);
                                            if (gVarA == null || (strConcat2 = (String) ((kotlin.collections.b0) gVarA.a()).get(1)) == null) {
                                                strConcat2 = "";
                                            }
                                            if (kotlin.text.r.O(strConcat2, "//", false)) {
                                                strConcat2 = "https:".concat(strConcat2);
                                            }
                                            kotlin.text.g gVarA2 = iVar3.a(strSubstring);
                                            if (gVarA2 == null || (str7 = (String) ((kotlin.collections.b0) gVarA2.a()).get(1)) == null || (string2 = kotlin.text.k.A0(str7).toString()) == null) {
                                                string2 = "";
                                            }
                                        } else {
                                            string2 = "";
                                            strConcat2 = string2;
                                        }
                                        if (strConcat2.length() == 0) {
                                            String strSubstring2 = strB.substring(Math.max(0, gVar.b().e - 700), gVar.b().e);
                                            str4 = string2;
                                            androidx.collection.m0 m0Var3 = new androidx.collection.m0(kotlin.text.i.b(iVar2, strSubstring2));
                                            if (m0Var3.hasNext()) {
                                                next = m0Var3.next();
                                                while (m0Var3.hasNext()) {
                                                    next = m0Var3.next();
                                                }
                                            } else {
                                                next = null;
                                            }
                                            kotlin.text.g gVar2 = (kotlin.text.g) next;
                                            if (gVar2 == null || (strConcat3 = (String) ((kotlin.collections.b0) gVar2.a()).get(1)) == null) {
                                                strConcat3 = "";
                                            }
                                            if (kotlin.text.r.O(strConcat3, "//", false)) {
                                                strConcat3 = "https:".concat(strConcat3);
                                            }
                                            if (str4.length() == 0) {
                                                androidx.collection.m0 m0Var4 = new androidx.collection.m0(kotlin.text.i.b(iVar3, strSubstring2));
                                                if (m0Var4.hasNext()) {
                                                    next2 = m0Var4.next();
                                                    while (m0Var4.hasNext()) {
                                                        next2 = m0Var4.next();
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                                kotlin.text.g gVar3 = (kotlin.text.g) next2;
                                                if (gVar3 == null || (str6 = (String) ((kotlin.collections.b0) gVar3.a()).get(1)) == null || (string3 = kotlin.text.k.A0(str6).toString()) == null) {
                                                    string3 = "";
                                                }
                                                str5 = string3;
                                                strConcat2 = strConcat3;
                                            } else {
                                                strConcat2 = strConcat3;
                                            }
                                            String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("xvideos_", str14);
                                            if (strConcat2.length() > 0) {
                                                epornerThumb = new EpornerThumb(strConcat2, null, null);
                                            } else {
                                                epornerThumb = null;
                                            }
                                            arrayList.add(new EpornerVideo(strH, string6, null, null, null, null, str5, epornerThumb, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.xvideos.com", str14)));
                                            linkedHashSet = linkedHashSet2;
                                        } else {
                                            str4 = string2;
                                        }
                                        str5 = str4;
                                        String strH2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("xvideos_", str14);
                                        if (strConcat2.length() > 0) {
                                            epornerThumb = new EpornerThumb(strConcat2, null, null);
                                        } else {
                                            epornerThumb = null;
                                        }
                                        arrayList.add(new EpornerVideo(strH2, string6, null, null, null, null, str5, epornerThumb, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://www.xvideos.com", str14)));
                                        linkedHashSet = linkedHashSet2;
                                    }
                                }
                            }
                        } else {
                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                            arrayList.size();
                        }
                        ArrayList arrayList3 = arrayList;
                        if (arrayList3.isEmpty()) {
                            kotlin.o oVar4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.f("EpornerScraper", "searchVideos — no items parsed for query=".concat(str10));
                        }
                        Set setS = kotlin.sequences.k.s(kotlin.sequences.k.q(kotlin.text.i.b(new kotlin.text.i("[?&](?:amp;)?p=(\\d+)[^>]*>"), strB), new androidx.room.z(17)));
                        if (setS.isEmpty()) {
                            numValueOf = null;
                        } else {
                            Iterator it = setS.iterator();
                            if (!it.hasNext()) {
                                org.mozilla.javascript.typedarrays.c.a();
                                return null;
                            }
                            Comparable comparable = (Comparable) it.next();
                            while (it.hasNext()) {
                                Comparable comparable2 = (Comparable) it.next();
                                if (comparable.compareTo(comparable2) < 0) {
                                    comparable = comparable2;
                                }
                            }
                            int iIntValue2 = ((Number) comparable).intValue();
                            if (iIntValue2 > i7) {
                                numValueOf = Integer.valueOf(iIntValue2 + 1);
                            } else {
                                numValueOf = null;
                            }
                        }
                        kotlin.o oVar5 = com.app.mlounge.util.a.a;
                        arrayList3.size();
                        return new EpornerSearchDetails(null, numValueOf, Integer.valueOf(i8), 30, arrayList3);
                    }
                } else {
                    if (iOrdinal == 1) {
                        return rVar.c.e(i3, str10);
                    }
                    if (iOrdinal == 2) {
                        e1 e1Var = rVar.d;
                        this.y = 1;
                        objG = e1Var.g(i3, str10, this);
                        if (objG == aVar) {
                            return aVar;
                        }
                        return (EpornerSearchDetails) objG;
                    }
                    coil3.g.a();
                }
                return null;
            case 1:
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                ChqApi chqApi = ((r) obj3).a;
                String str15 = (String) obj2;
                String str16 = (String) this.C;
                this.y = 1;
                Object objSearchGames = chqApi.searchGames(str15, str16, this.B, 20, this);
                return objSearchGames == aVar ? aVar : objSearchGames;
            default:
                int i10 = this.y;
                try {
                    if (i10 == 0) {
                        kotlin.a.e(obj);
                        x1 x1Var = (x1) obj3;
                        mutableStateFlow = x1Var.N;
                        j0 j0Var = x1Var.b;
                        int iE = ((TmdbSeason) obj2).e();
                        this.C = mutableStateFlow;
                        this.y = 1;
                        tvSeason = j0Var.a.getTvSeason(i3, iE, this);
                        if (tvSeason == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = (MutableStateFlow) this.C;
                        kotlin.a.e(obj);
                        tvSeason = obj;
                    }
                    mutableStateFlow.setValue(tvSeason);
                    break;
                } catch (Exception unused) {
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i, r rVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = rVar;
        this.A = str;
        this.C = str2;
        this.B = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x1 x1Var, int i, TmdbSeason tmdbSeason, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = x1Var;
        this.B = i;
        this.A = tmdbSeason;
    }
}
