package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, Integer num, Integer num2, e0 e0Var, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = e0Var;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d0(this.$mediaType, this.$season, this.$episode, this.this$0, this.$tmdbId, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0210  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        com.google.gson.h hVarL;
        String str;
        int i;
        int i2;
        boolean z;
        boolean z2;
        String strZ;
        com.google.gson.h hVarL2;
        String strH;
        String str2 = "/";
        int i3 = this.label;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        try {
            if (i3 == 0) {
                kotlin.a.e(obj);
                if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || this.$season == null || this.$episode == null) {
                    return uVar;
                }
                l1 l1Var = this.this$0.tmdbHelper;
                String str3 = this.$tmdbId;
                this.label = 1;
                objD = l1Var.d(str3, "tv", this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objD = obj;
            }
            String str4 = (String) objD;
            if (str4 == null) {
                return uVar;
            }
            String str5 = "https://id-mapping-api-malid.hf.space/api/resolve?id=" + str4 + "&s=" + this.$season + "&e=" + this.$episode;
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str5);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            boolean z3 = false;
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (!g0VarE.N) {
                return uVar;
            }
            com.google.gson.f fVar = this.this$0.gson;
            okhttp3.j0 j0Var = g0VarE.D;
            com.google.gson.k kVar = (com.google.gson.k) fVar.d(com.google.gson.k.class, j0Var != null ? j0Var.z() : null);
            if (kVar == null || (hVarL = kVar.l("mal_id")) == null) {
                return uVar;
            }
            int iC = hVarL.c();
            com.google.gson.h hVarL3 = kVar.l("mal_episode");
            int iC2 = hVarL3 != null ? hVarL3.c() : this.$episode.intValue();
            ArrayList arrayList = new ArrayList();
            for (String str6 : com.google.common.base.c.q("sub", "dub")) {
                try {
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append("https://megaplay.buzz/stream/mal/");
                        sb.append(iC);
                        sb.append(str2);
                        sb.append(iC2);
                        sb.append(str2);
                        sb.append(str6);
                        String string = sb.toString();
                        okhttp3.a0 a0Var2 = new okhttp3.a0();
                        a0Var2.d(string);
                        a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                        a0Var2.b("Referer", string);
                        str = str2;
                        try {
                            okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                            okhttp3.y yVar2 = this.this$0.client;
                            yVar2.getClass();
                            i = iC2;
                            try {
                                i2 = iC;
                                boolean z4 = false;
                                try {
                                    try {
                                        okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                        if (g0VarE2.N) {
                                            okhttp3.j0 j0Var2 = g0VarE2.D;
                                            if (j0Var2 == null || (strZ = j0Var2.z()) == null) {
                                                z = false;
                                                z2 = true;
                                                z3 = z;
                                                str2 = str;
                                                iC2 = i;
                                                iC = i2;
                                            } else {
                                                Pattern patternCompile = Pattern.compile("data-id=\"([^\"]+)\"");
                                                patternCompile.getClass();
                                                Matcher matcher = patternCompile.matcher(strZ);
                                                matcher.getClass();
                                                z4 = false;
                                                kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strZ);
                                                if (gVarC != null) {
                                                    try {
                                                        try {
                                                            String str7 = (String) ((kotlin.collections.b0) gVarC.a()).get(1);
                                                            if (str7 != null) {
                                                                okhttp3.a0 a0Var3 = new okhttp3.a0();
                                                                a0Var3.d("https://megaplay.buzz/stream/getSources?id=" + str7 + "&id=" + str7);
                                                                a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                                                a0Var3.b("X-Requested-With", "XMLHttpRequest");
                                                                a0Var3.b("Referer", string);
                                                                a0Var3.b("Origin", "https://megaplay.buzz");
                                                                okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                                                okhttp3.y yVar3 = this.this$0.client;
                                                                yVar3.getClass();
                                                                z = false;
                                                                try {
                                                                    okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                                                    if (g0VarE3.N) {
                                                                        com.google.gson.f fVar2 = this.this$0.gson;
                                                                        okhttp3.j0 j0Var3 = g0VarE3.D;
                                                                        com.google.gson.k kVar2 = (com.google.gson.k) fVar2.d(com.google.gson.k.class, j0Var3 != null ? j0Var3.z() : null);
                                                                        if (kVar2 != null) {
                                                                            com.google.gson.h hVarL4 = kVar2.l("sources");
                                                                            if (hVarL4 == null || !(hVarL4 instanceof com.google.gson.k)) {
                                                                                if (hVarL4 != null) {
                                                                                    z2 = true;
                                                                                    if ((hVarL4 instanceof com.google.gson.g) && hVarL4.d().e.size() > 0 && (hVarL2 = hVarL4.d().i().e().l("file")) != null) {
                                                                                        strH = hVarL2.h();
                                                                                    }
                                                                                } else {
                                                                                    z2 = true;
                                                                                }
                                                                                strH = null;
                                                                            } else {
                                                                                com.google.gson.h hVarL5 = hVarL4.e().l("file");
                                                                                if (hVarL5 != null) {
                                                                                    strH = hVarL5.h();
                                                                                    z2 = true;
                                                                                } else {
                                                                                    z2 = true;
                                                                                    strH = null;
                                                                                }
                                                                            }
                                                                            if (strH != null) {
                                                                                try {
                                                                                    arrayList.add(new ChqStream("HiAnime [MegaPlay] (" + str6 + ")", strH, "Multi", "hls", "hls", null, kotlin.collections.a0.v(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", "https://megaplay.buzz/"), new kotlin.k("Origin", "https://megaplay.buzz")), null, null, null, null, null, null, 8064));
                                                                                } catch (Exception unused) {
                                                                                }
                                                                            }
                                                                            z3 = z;
                                                                            str2 = str;
                                                                            iC2 = i;
                                                                            iC = i2;
                                                                        }
                                                                    }
                                                                    z3 = false;
                                                                    str2 = str;
                                                                    iC2 = i;
                                                                    iC = i2;
                                                                } catch (Exception unused2) {
                                                                    z2 = true;
                                                                }
                                                            }
                                                        } catch (Exception unused3) {
                                                            z2 = true;
                                                            z = false;
                                                        }
                                                    } catch (Exception unused4) {
                                                        z2 = true;
                                                    }
                                                }
                                                z = false;
                                                z2 = true;
                                                z3 = z;
                                                str2 = str;
                                                iC2 = i;
                                                iC = i2;
                                            }
                                        } else {
                                            str2 = str;
                                            iC2 = i;
                                            iC = i2;
                                            z3 = false;
                                        }
                                    } catch (Exception unused5) {
                                        z = false;
                                    }
                                } catch (Exception unused6) {
                                    z = z4;
                                }
                            } catch (Exception unused7) {
                                i2 = iC;
                                z = false;
                                z2 = true;
                                z3 = z;
                                str2 = str;
                                iC2 = i;
                                iC = i2;
                            }
                        } catch (Exception unused8) {
                            i = iC2;
                            i2 = iC;
                            z = false;
                            z2 = true;
                            z3 = z;
                            str2 = str;
                            iC2 = i;
                            iC = i2;
                        }
                    } catch (Exception unused9) {
                        str = str2;
                    }
                } catch (Exception unused10) {
                    str = str2;
                    i = iC2;
                    i2 = iC;
                    z = z3;
                }
            }
            return arrayList;
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "HiAnime");
            return uVar;
        }
    }
}
