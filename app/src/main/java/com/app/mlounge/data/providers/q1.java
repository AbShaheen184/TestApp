package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ r1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = r1Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new q1(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x021c A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:14:0x0046, B:17:0x0052, B:19:0x0056, B:21:0x005a, B:25:0x0088, B:28:0x00b5, B:30:0x00b9, B:33:0x00c1, B:36:0x00d3, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x0100, B:47:0x010e, B:50:0x0118, B:53:0x011f, B:55:0x0127, B:59:0x012f, B:61:0x0137, B:63:0x013d, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x0169, B:73:0x0178, B:75:0x017e, B:128:0x02a6, B:81:0x0191, B:85:0x019e, B:87:0x01b8, B:90:0x01c2, B:92:0x01c8, B:95:0x01d1, B:97:0x01d7, B:100:0x01e0, B:102:0x01e6, B:111:0x0203, B:113:0x021c, B:116:0x0231, B:120:0x0246, B:126:0x025f, B:130:0x02b4, B:24:0x0079), top: B:135:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x022c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0231 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:14:0x0046, B:17:0x0052, B:19:0x0056, B:21:0x005a, B:25:0x0088, B:28:0x00b5, B:30:0x00b9, B:33:0x00c1, B:36:0x00d3, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x0100, B:47:0x010e, B:50:0x0118, B:53:0x011f, B:55:0x0127, B:59:0x012f, B:61:0x0137, B:63:0x013d, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x0169, B:73:0x0178, B:75:0x017e, B:128:0x02a6, B:81:0x0191, B:85:0x019e, B:87:0x01b8, B:90:0x01c2, B:92:0x01c8, B:95:0x01d1, B:97:0x01d7, B:100:0x01e0, B:102:0x01e6, B:111:0x0203, B:113:0x021c, B:116:0x0231, B:120:0x0246, B:126:0x025f, B:130:0x02b4, B:24:0x0079), top: B:135:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0244  */
    /* JADX WARN: Code duplicated, block: B:119:0x0245  */
    /* JADX WARN: Code duplicated, block: B:122:0x0258  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:125:0x025d  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a6 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:14:0x0046, B:17:0x0052, B:19:0x0056, B:21:0x005a, B:25:0x0088, B:28:0x00b5, B:30:0x00b9, B:33:0x00c1, B:36:0x00d3, B:39:0x00dd, B:40:0x00e8, B:42:0x00ee, B:44:0x0100, B:47:0x010e, B:50:0x0118, B:53:0x011f, B:55:0x0127, B:59:0x012f, B:61:0x0137, B:63:0x013d, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x0169, B:73:0x0178, B:75:0x017e, B:128:0x02a6, B:81:0x0191, B:85:0x019e, B:87:0x01b8, B:90:0x01c2, B:92:0x01c8, B:95:0x01d1, B:97:0x01d7, B:100:0x01e0, B:102:0x01e6, B:111:0x0203, B:113:0x021c, B:116:0x0231, B:120:0x0246, B:126:0x025f, B:130:0x02b4, B:24:0x0079), top: B:135:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02a9 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        String str;
        okhttp3.j0 j0Var;
        String strZ;
        com.google.gson.k kVar;
        com.google.gson.g gVarN;
        int i;
        boolean z;
        ChqStream chqStream;
        String strH;
        String strH2;
        String str2;
        kotlin.text.g gVarC;
        String str3;
        String string;
        String string2;
        String str4;
        Integer numQ;
        com.google.gson.h hVarL;
        String strH3;
        Integer num;
        Integer num2;
        String str5 = "2160p";
        int i2 = this.label;
        boolean z2 = true;
        if (i2 == 0) {
            kotlin.a.e(obj);
            l1 l1Var = this.this$0.tmdbHelper;
            String str6 = this.$tmdbId;
            String str7 = this.$mediaType;
            this.label = 1;
            objD = l1Var.d(str6, str7, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objD = obj;
        }
        String str8 = (String) objD;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (str8 != null) {
            try {
                if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
                    str = "https://torrentio.strem.fun/sort=seeders/stream/movie/" + str8 + ".json";
                } else {
                    str = "https://torrentio.strem.fun/sort=seeders/stream/series/" + str8 + ":" + num + ":" + num2 + ".json";
                }
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                int i3 = 0;
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null && (kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ)) != null && (gVarN = kVar.n("streams")) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVarN.e.iterator();
                    while (it.hasNext()) {
                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                        com.google.gson.h hVarL2 = kVarE.l("infoHash");
                        if (hVarL2 == null || (strH = hVarL2.h()) == null) {
                            i = i3;
                            z = z2;
                        } else {
                            com.google.gson.h hVarL3 = kVarE.l("title");
                            String str9 = "";
                            if (hVarL3 == null || (strH2 = hVarL3.h()) == null) {
                                strH2 = "";
                            }
                            com.google.gson.h hVarL4 = kVarE.l("name");
                            if (hVarL4 != null && (strH3 = hVarL4.h()) != null) {
                                str9 = strH3;
                            }
                            com.google.gson.h hVarL5 = kVarE.l("fileIdx");
                            int iC = hVarL5 != null ? hVarL5.c() : i3;
                            com.google.gson.k kVarO = kVarE.o("behaviorHints");
                            String strH4 = (kVarO == null || (hVarL = kVarO.l("filename")) == null) ? null : hVarL.h();
                            Pattern patternCompile = Pattern.compile("[\\uD83D\\uDC64]\\s*(\\d+)");
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(strH2);
                            matcher.getClass();
                            kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher, i3, strH2);
                            int iIntValue = (gVarC2 == null || (str4 = (String) ((kotlin.collections.b0) gVarC2.a()).get(1)) == null || (numQ = kotlin.text.r.Q(str4)) == null) ? 0 : numQ.intValue();
                            if (iIntValue <= 1) {
                                z = true;
                                i = 0;
                            } else {
                                if (kotlin.text.k.T(str9, str5, false)) {
                                    str5 = str5;
                                    it = it;
                                } else {
                                    str5 = str5;
                                    it = it;
                                    if (!"4k".equalsIgnoreCase(kotlin.text.k.v0(kotlin.text.k.A0(kotlin.text.k.q0(str9, "\n", str9)).toString(), " ")) && !kotlin.text.k.T(str9, "2160", false)) {
                                        if (kotlin.text.k.T(str9, "1080p", false) || kotlin.text.k.T(str9, "1080", false)) {
                                            str2 = "1080p";
                                        } else if (kotlin.text.k.T(str9, "720p", false) || kotlin.text.k.T(str9, "720", false)) {
                                            str2 = "720p";
                                        } else {
                                            str2 = (kotlin.text.k.T(str9, "480p", false) || kotlin.text.k.T(str9, "480", false)) ? "480p" : "Unknown";
                                        }
                                    }
                                    Pattern patternCompile2 = Pattern.compile("[\\uD83D\\uDCBE]\\s*([\\d.]+\\s*[KMGT]B)", 66);
                                    patternCompile2.getClass();
                                    Matcher matcher2 = patternCompile2.matcher(strH2);
                                    matcher2.getClass();
                                    gVarC = com.google.android.material.shape.k.C(matcher2, 0, strH2);
                                    if (gVarC != null) {
                                        z = true;
                                        str3 = (String) ((kotlin.collections.b0) gVarC.a()).get(1);
                                    } else {
                                        z = true;
                                        str3 = null;
                                    }
                                    if (strH4 != null) {
                                        String strX0 = kotlin.text.k.x0(strH4, ".");
                                        i = 0;
                                        string = kotlin.text.k.A0(kotlin.text.r.M(strX0, ".", " ", false)).toString();
                                        if (string == null) {
                                        }
                                        chqStream = new ChqStream("Torrentio - " + string, "magnet:?xt=urn:btih:" + strH, str2, null, "torrent", str3, null, new Integer(iIntValue), strH, new Integer(iC), Boolean.TRUE, null, null, 6144);
                                    } else {
                                        i = 0;
                                    }
                                    string2 = kotlin.text.k.A0(kotlin.text.k.v0(strH2, "\n")).toString();
                                    if (kotlin.text.k.d0(string2)) {
                                        string = null;
                                    } else {
                                        string = string2;
                                    }
                                    if (string == null) {
                                        string = str2;
                                    }
                                    chqStream = new ChqStream("Torrentio - " + string, "magnet:?xt=urn:btih:" + strH, str2, null, "torrent", str3, null, new Integer(iIntValue), strH, new Integer(iC), Boolean.TRUE, null, null, 6144);
                                }
                                str2 = str5;
                                Pattern patternCompile3 = Pattern.compile("[\\uD83D\\uDCBE]\\s*([\\d.]+\\s*[KMGT]B)", 66);
                                patternCompile3.getClass();
                                Matcher matcher3 = patternCompile3.matcher(strH2);
                                matcher3.getClass();
                                gVarC = com.google.android.material.shape.k.C(matcher3, 0, strH2);
                                if (gVarC != null) {
                                    z = true;
                                    str3 = (String) ((kotlin.collections.b0) gVarC.a()).get(1);
                                } else {
                                    z = true;
                                    str3 = null;
                                }
                                if (strH4 != null) {
                                    String strX1 = kotlin.text.k.x0(strH4, ".");
                                    i = 0;
                                    string = kotlin.text.k.A0(kotlin.text.r.M(strX1, ".", " ", false)).toString();
                                    if (string == null) {
                                    }
                                    chqStream = new ChqStream("Torrentio - " + string, "magnet:?xt=urn:btih:" + strH, str2, null, "torrent", str3, null, new Integer(iIntValue), strH, new Integer(iC), Boolean.TRUE, null, null, 6144);
                                } else {
                                    i = 0;
                                }
                                string2 = kotlin.text.k.A0(kotlin.text.k.v0(strH2, "\n")).toString();
                                if (kotlin.text.k.d0(string2)) {
                                    string = string2;
                                } else {
                                    string = null;
                                }
                                if (string == null) {
                                    string = str2;
                                }
                                chqStream = new ChqStream("Torrentio - " + string, "magnet:?xt=urn:btih:" + strH, str2, null, "torrent", str3, null, new Integer(iIntValue), strH, new Integer(iC), Boolean.TRUE, null, null, 6144);
                            }
                            if (chqStream != null) {
                                arrayList.add(chqStream);
                            }
                            z2 = z;
                            i3 = i;
                            str5 = str5;
                            it = it;
                        }
                        chqStream = null;
                        if (chqStream != null) {
                            arrayList.add(chqStream);
                        }
                        z2 = z;
                        i3 = i;
                        str5 = str5;
                        it = it;
                    }
                    return kotlin.collections.o.g0(5, kotlin.collections.o.f0(arrayList, new androidx.constraintlayout.core.e(14)));
                }
            } catch (Exception e) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error: ", e.getMessage(), "Torrentio");
                return uVar;
            }
        }
        return uVar;
    }
}
