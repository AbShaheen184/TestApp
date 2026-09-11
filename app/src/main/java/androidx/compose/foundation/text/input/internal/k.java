package androidx.compose.foundation.text.input.internal;

import android.content.Context;
import android.util.Base64;
import androidx.compose.runtime.y0;
import androidx.datastore.core.g1;
import androidx.lifecycle.l0;
import androidx.media3.exoplayer.c0;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.player.z0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.r1;
import com.appsalt.internal.c3;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                k kVar = new k((l) this.z, dVar, 0);
                kVar.y = obj;
                return kVar;
            case 1:
                k kVar2 = new k((g1) this.z, dVar, 1);
                kVar2.y = obj;
                return kVar2;
            case 2:
                k kVar3 = new k((Set) this.z, dVar, 2);
                kVar3.y = obj;
                return kVar3;
            case 3:
                k kVar4 = new k((androidx.lifecycle.q) this.z, dVar, 3);
                kVar4.y = obj;
                return kVar4;
            case 4:
                k kVar5 = new k((androidx.privacysandbox.ads.adservices.measurement.c) this.z, dVar, 4);
                kVar5.y = obj;
                return kVar5;
            case 5:
                k kVar6 = new k((ArrayList) this.z, dVar, 5);
                kVar6.y = obj;
                return kVar6;
            case 6:
                return new k((com.app.mlounge.data.remote.ntv.l) this.y, (String) this.z, dVar, 6);
            case 7:
                return new k((com.app.mlounge.ui.viewmodel.c) this.y, (String) this.z, dVar, 7);
            case 8:
                return new k((com.app.mlounge.ui.viewmodel.g) this.y, (String) this.z, dVar, 8);
            case 9:
                return new k((File) this.y, (String) this.z, dVar, 9);
            case 10:
                return new k((z0) this.y, (androidx.media3.exoplayer.source.a) this.z, dVar, 10);
            case 11:
                return new k((String) this.y, (Map) this.z, dVar, 11);
            case 12:
                return new k((y0) this.y, (y0) this.z, dVar, 12);
            case 13:
                return new k((Context) this.y, (y0) this.z, dVar, 13);
            case 14:
                return new k((a0) this.y, (Set) this.z, dVar, 14);
            case 15:
                return new k((ChqStream) this.y, (r1) this.z, dVar, 15);
            case 16:
                return new k((c3) this.y, (z) this.z, dVar, 16);
            default:
                return new k((com.i4studio.subslib.subdl.a) this.y, (com.i4studio.subslib.model.a) this.z, dVar, 17);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.e) {
            case 0:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 1:
                return ((k) create((g1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 2:
                return ((k) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 3:
                k kVar = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                kVar.invokeSuspend(yVar);
                return yVar;
            case 4:
                ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
                throw null;
            case 5:
                k kVar2 = (k) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                y yVar2 = y.a;
                kVar2.invokeSuspend(yVar2);
                return yVar2;
            case 6:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 7:
                k kVar3 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar3 = y.a;
                kVar3.invokeSuspend(yVar3);
                return yVar3;
            case 8:
                k kVar4 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar4 = y.a;
                kVar4.invokeSuspend(yVar4);
                return yVar4;
            case 9:
                k kVar5 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar5 = y.a;
                kVar5.invokeSuspend(yVar5);
                return yVar5;
            case 10:
                k kVar6 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar6 = y.a;
                kVar6.invokeSuspend(yVar6);
                return yVar6;
            case 11:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 12:
                k kVar7 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar7 = y.a;
                kVar7.invokeSuspend(yVar7);
                return yVar7;
            case 13:
                k kVar8 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar8 = y.a;
                kVar8.invokeSuspend(yVar8);
                return yVar8;
            case 14:
                k kVar9 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar9 = y.a;
                kVar9.invokeSuspend(yVar9);
                return yVar9;
            case 15:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 16:
                k kVar10 = new k((c3) this.y, (z) this.z, (kotlin.coroutines.d) obj2, 16);
                y yVar10 = y.a;
                kVar10.invokeSuspend(yVar10);
                return yVar10;
            default:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        boolean z;
        boolean z2;
        String lowerCase;
        b0 b0Var;
        String strD;
        org.jsoup.nodes.g gVarA;
        org.jsoup.nodes.g gVarA2;
        Integer numQ;
        int i = this.e;
        int i2 = 10;
        String strD2 = null;
        byte b = 0;
        y yVar = y.a;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                l lVar = (l) obj2;
                Job job = (Job) lVar.b.getAndSet(null);
                AtomicReference atomicReference = lVar.b;
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(job, lVar, null, i2), 3, null);
                while (!atomicReference.compareAndSet(null, jobLaunch$default)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 1:
                kotlin.a.e(obj);
                g1 g1Var = (g1) this.y;
                return Boolean.valueOf((g1Var instanceof androidx.datastore.core.c) && ((androidx.datastore.core.c) g1Var).a <= ((androidx.datastore.core.c) ((g1) obj2)).a);
            case 2:
                kotlin.a.e(obj);
                Set setKeySet = ((androidx.datastore.preferences.core.a) this.y).a().keySet();
                ArrayList arrayList = new ArrayList(kotlin.collections.p.y(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.datastore.preferences.core.d) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set == androidx.datastore.preferences.j.a) {
                    z2 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!arrayList.contains((String) it2.next())) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 3:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.y;
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) obj2;
                androidx.lifecycle.p pVar = qVar.e;
                if (((androidx.lifecycle.x) pVar).d.compareTo(androidx.lifecycle.o.y) >= 0) {
                    pVar.a(qVar);
                } else {
                    JobKt__JobKt.cancel$default(coroutineScope2.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return yVar;
            case 4:
                kotlin.a.e(obj);
                throw null;
            case 5:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.Z0, kotlin.collections.o.R((ArrayList) obj2, ",", null, null, null, 62));
                return yVar;
            case 6:
                com.app.mlounge.data.remote.ntv.l lVar2 = (com.app.mlounge.data.remote.ntv.l) this.y;
                String str = (String) obj2;
                kotlin.a.e(obj);
                try {
                    okhttp3.y yVar2 = lVar2.a;
                    okhttp3.a0 a0Var = new okhttp3.a0();
                    a0Var.d("https://dlhd.st/stream/stream-" + str + ".php");
                    a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                    a0Var.b("Referer", "https://ntv.cx/");
                    a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                    b0 b0Var2 = new b0(a0Var);
                    yVar2.getClass();
                    g0 g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                    try {
                        j0 j0Var = g0VarE.D;
                        String strZ = j0Var != null ? j0Var.z() : null;
                        g0VarE.close();
                        if (strZ == null) {
                            kotlin.o oVar = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("NtvStreamExtractor", "DLHD failed to load stream page for " + str);
                        } else {
                            Pattern patternCompile = Pattern.compile("<iframe[^>]*src=[\"'](https?://[^\"']*daddy[^\"']*\\.php[^\"']*)[\"']", 66);
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(strZ);
                            matcher.getClass();
                            kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strZ);
                            String str2 = gVarC != null ? (String) kotlin.collections.o.N(1, gVarC.a()) : null;
                            if (str2 == null) {
                                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.f("NtvStreamExtractor", "DLHD no daddy iframe found in stream page for " + str);
                            } else {
                                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                URL url = new URL(str2);
                                String str3 = url.getProtocol() + "://" + url.getHost();
                                okhttp3.y yVar3 = lVar2.a;
                                okhttp3.a0 a0Var2 = new okhttp3.a0();
                                a0Var2.d(str2);
                                a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                                a0Var2.b("Referer", "https://dlhd.st/");
                                a0Var2.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                                b0 b0Var3 = new b0(a0Var2);
                                yVar3.getClass();
                                g0 g0VarE2 = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                try {
                                    j0 j0Var2 = g0VarE2.D;
                                    String strZ2 = j0Var2 != null ? j0Var2.z() : null;
                                    g0VarE2.close();
                                    if (strZ2 == null) {
                                        com.app.mlounge.util.a.a("NtvStreamExtractor", "DLHD failed to load daddy iframe");
                                    } else {
                                        Pattern patternCompile2 = Pattern.compile("window\\.atob\\(['\"]([A-Za-z0-9+/=]+)['\"]\\)");
                                        patternCompile2.getClass();
                                        Matcher matcher2 = patternCompile2.matcher(strZ2);
                                        matcher2.getClass();
                                        kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strZ2);
                                        String str4 = gVarC2 != null ? (String) kotlin.collections.o.N(1, gVarC2.a()) : null;
                                        if (str4 == null) {
                                            com.app.mlounge.util.a.f("NtvStreamExtractor", "DLHD no window.atob() found in daddy iframe");
                                        } else {
                                            byte[] bArrDecode = Base64.decode(str4, 0);
                                            bArrDecode.getClass();
                                            String string = kotlin.text.k.A0(new String(bArrDecode, kotlin.text.a.a)).toString();
                                            if (kotlin.text.k.T(string, ".m3u8", false)) {
                                                return new com.app.mlounge.data.remote.ntv.m(string, kotlin.collections.a0.v(new kotlin.k("Origin", str3), new kotlin.k("Referer", str3.concat("/")), new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36")));
                                            }
                                            com.app.mlounge.util.a.f("NtvStreamExtractor", "DLHD atob result is not an m3u8: ".concat(string));
                                        }
                                    }
                                    break;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        com.google.common.base.b.d(g0VarE2, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            com.google.common.base.b.d(g0VarE, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e) {
                    kotlin.o oVar4 = com.app.mlounge.util.a.a;
                    coil3.compose.internal.f.i("DLHD resolution error: ", e.getMessage(), "NtvStreamExtractor");
                }
                return null;
            case 7:
                kotlin.a.e(obj);
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                String str5 = (String) obj2;
                BuildersKt__Builders_commonKt.launch$default(l0.g(cVar), null, null, new androidx.compose.animation.core.f(cVar, okhttp3.internal.platform.android.g.f(str5), str5, (kotlin.coroutines.d) null, 16), 3, null);
                return yVar;
            case 8:
                kotlin.a.e(obj);
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) this.y;
                String str6 = (String) obj2;
                str6.getClass();
                BuildersKt__Builders_commonKt.launch$default(l0.g(gVar), null, null, new androidx.room.coroutines.f(gVar, str6, b == true ? 1 : 0, 21), 3, null);
                return yVar;
            case 9:
                kotlin.a.e(obj);
                kotlin.io.j.B((File) this.y, (String) obj2);
                return yVar;
            case 10:
                kotlin.a.e(obj);
                z0 z0Var = (z0) this.y;
                c0 c0Var = z0Var.g;
                if (c0Var != null) {
                    c0Var.K((androidx.media3.exoplayer.source.a) obj2);
                }
                c0 c0Var2 = z0Var.g;
                if (c0Var2 != null) {
                    c0Var2.C();
                }
                c0 c0Var3 = z0Var.g;
                if (c0Var3 != null) {
                    c0Var3.M(true);
                }
                return yVar;
            case 11:
                kotlin.a.e(obj);
                String str7 = (String) this.y;
                Map map = (Map) obj2;
                byte b2 = kotlin.text.k.T(str7, "googleusercontent.com", false) || kotlin.text.k.T(str7, ".workers.dev", false) || kotlin.text.k.T(str7, "comet.elfhosted.com", false) || kotlin.text.k.T(str7, "pluto.tv", false) || kotlin.text.k.T(str7, "freehandyflix.online", false) || kotlin.text.k.T(str7, "fsharetv.cc", false) || kotlin.text.k.T(str7, "r2.cloudflarestorage.com", false) || kotlin.text.k.T(str7, ".amazonaws.com", false) || kotlin.text.k.T(str7, "X-Amz-Signature=", false) || kotlin.text.k.T(str7, ".m3u8", false);
                String str8 = "ok";
                if (kotlin.text.r.O(str7, "http", false) && b2 == false) {
                    try {
                        okhttp3.x xVar = new okhttp3.x();
                        xVar.b(com.google.common.base.c.p(okhttp3.z.HTTP_1_1));
                        xVar.a(15L);
                        xVar.c(15L);
                        xVar.i = true;
                        okhttp3.y yVar4 = new okhttp3.y(xVar);
                        okhttp3.a0 a0Var3 = new okhttp3.a0();
                        a0Var3.d(str7);
                        a0Var3.c("HEAD", null);
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                a0Var3.a((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        g0 g0VarE3 = new okhttp3.internal.connection.m(yVar4, new b0(a0Var3), false).e();
                        try {
                            int i3 = g0VarE3.A;
                            String strG = g0.g("Content-Type", g0VarE3);
                            String lowerCase2 = "";
                            if (strG != null) {
                                lowerCase = strG.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = "";
                            }
                            String strG2 = g0.g("Content-Disposition", g0VarE3);
                            if (strG2 != null) {
                                lowerCase2 = strG2.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            }
                            if (200 <= i3 && i3 < 400) {
                                List listQ = com.google.common.base.c.q("application/zip", "application/x-rar", "application/x-7z", "text/html");
                                if (!listQ.isEmpty()) {
                                    Iterator it3 = listQ.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (kotlin.text.k.T(lowerCase, (String) it3.next(), false)) {
                                            }
                                        }
                                        str8 = "unsupported";
                                    }
                                }
                                if (kotlin.text.k.T(lowerCase2, ".zip", false) || kotlin.text.k.T(lowerCase2, ".rar", false)) {
                                    str8 = "unsupported";
                                }
                            } else if (i3 != 405 || !kotlin.text.k.T(str7, "comet.elfhosted.com", false)) {
                                str8 = "offline";
                            }
                            g0VarE3.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                com.google.common.base.b.d(g0VarE3, th5);
                                throw th6;
                            }
                        }
                    } catch (Exception unused) {
                        return "offline";
                    }
                }
                return str8;
            case 12:
                Object objF0 = kotlin.collections.u.e;
                kotlin.a.e(obj);
                y0 y0Var = (y0) obj2;
                try {
                    y0 y0Var2 = (y0) this.y;
                    List list = e0.a;
                    File[] fileArrListFiles = ((File) y0Var2.getValue()).listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (file.isDirectory() && !file.isHidden()) {
                                arrayList2.add(file);
                            }
                        }
                        objF0 = kotlin.collections.o.f0(arrayList2, new androidx.constraintlayout.core.e(16));
                    }
                    break;
                } catch (Exception unused2) {
                }
                List list2 = e0.a;
                y0Var.setValue(objF0);
                return yVar;
            case 13:
                kotlin.a.e(obj);
                ((y0) obj2).setValue(e0.u((Context) this.y));
                return yVar;
            case 14:
                kotlin.a.e(obj);
                a0 a0Var4 = (a0) this.y;
                a0Var4.D.setValue(a0Var4.g.m((Set) obj2));
                return yVar;
            case 15:
                kotlin.a.e(obj);
                ChqStream chqStream = (ChqStream) this.y;
                if (kotlin.text.k.T(chqStream.m(), "r2.cloudflarestorage.com", false) || kotlin.text.k.T(chqStream.m(), ".amazonaws.com", false) || kotlin.text.k.T(chqStream.m(), "X-Amz-Signature=", false)) {
                    okhttp3.a0 a0Var5 = new okhttp3.a0();
                    a0Var5.d(chqStream.m());
                    a0Var5.b("Range", "bytes=0-0");
                    Map mapE = chqStream.e();
                    if (mapE != null) {
                        for (Map.Entry entry2 : mapE.entrySet()) {
                            a0Var5.a((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    b0Var = new b0(a0Var5);
                } else {
                    okhttp3.a0 a0Var6 = new okhttp3.a0();
                    a0Var6.d(chqStream.m());
                    a0Var6.c("HEAD", null);
                    Map mapE2 = chqStream.e();
                    if (mapE2 != null) {
                        for (Map.Entry entry3 : mapE2.entrySet()) {
                            a0Var6.a((String) entry3.getKey(), (String) entry3.getValue());
                        }
                    }
                    b0Var = new b0(a0Var6);
                }
                okhttp3.y yVar5 = (okhttp3.y) ((r1) obj2).C.getValue();
                yVar5.getClass();
                g0 g0VarE4 = new okhttp3.internal.connection.m(yVar5, b0Var, false).e();
                try {
                    int i4 = g0VarE4.A;
                    boolean z3 = (200 <= i4 && i4 < 400) || i4 == 405;
                    kotlin.o oVar5 = com.app.mlounge.util.a.a;
                    kotlin.text.k.z0(chqStream.m());
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    g0VarE4.close();
                    return boolValueOf;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        com.google.common.base.b.d(g0VarE4, th7);
                        throw th8;
                    }
                }
            case 16:
                kotlin.a.e(obj);
                ((net.luminis.quic.stream.e) ((c3) this.y).a.y).f.write((byte[]) ((z) obj2).e);
                return yVar;
            default:
                kotlin.a.e(obj);
                ArrayList arrayList3 = new ArrayList();
                com.i4studio.subslib.subdl.a aVar2 = (com.i4studio.subslib.subdl.a) this.y;
                com.i4studio.subslib.model.a aVar3 = (com.i4studio.subslib.model.a) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append(aVar3.c);
                Integer num = aVar3.d;
                if (num != null) {
                    sb.append("%20" + num.intValue());
                }
                org.jsoup.nodes.g gVarA3 = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com/search/".concat(sb.toString()));
                if (gVarA3 != null) {
                    org.jsoup.select.e eVarB0 = gVarA3.b0("a[href^=/subtitle/]");
                    eVarB0.getClass();
                    Iterator<E> it4 = eVarB0.iterator();
                    it4.getClass();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) next;
                            String strD3 = jVar.b0("h3").d();
                            strD3.getClass();
                            String string2 = kotlin.text.k.A0(strD3).toString();
                            String string3 = kotlin.text.k.A0(kotlin.text.k.v0(string2, "(")).toString();
                            String string4 = kotlin.text.k.A0(kotlin.text.k.v0(kotlin.text.k.q0(string2, "(", string2), ")")).toString();
                            boolean zI = kotlin.text.r.I(string3, aVar3.c, true);
                            byte b3 = num == null || kotlin.jvm.internal.l.a(string4, String.valueOf(num.intValue()));
                            if (zI && b3 != false) {
                                strD = jVar.d("href");
                            }
                        } else {
                            strD = null;
                        }
                    }
                    if (strD != null && (gVarA = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com".concat(strD))) != null) {
                        int iOrdinal = aVar3.a.ordinal();
                        if (iOrdinal == 0) {
                            arrayList3.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA));
                        } else {
                            if (iOrdinal != 1) {
                                coil3.g.a();
                                return null;
                            }
                            Integer num2 = aVar3.f;
                            org.jsoup.select.e eVarB1 = gVarA.b0("a[href^=/subtitle/]");
                            eVarB1.getClass();
                            Iterator<E> it5 = eVarB1.iterator();
                            it5.getClass();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                next2.getClass();
                                org.jsoup.nodes.j jVar2 = (org.jsoup.nodes.j) next2;
                                org.jsoup.nodes.j jVarC0 = jVar2.c0("h3.text-xl.font-bold");
                                if (jVarC0 != null) {
                                    String strD0 = jVarC0.d0();
                                    strD0.getClass();
                                    String string5 = kotlin.text.k.A0(strD0).toString();
                                    if (kotlin.text.r.O(string5, "Season", true) && (numQ = kotlin.text.r.Q(kotlin.text.k.A0(kotlin.text.k.j0(string5, "Season")).toString())) != null) {
                                        int iIntValue = numQ.intValue();
                                        if (num2 != null && iIntValue == num2.intValue()) {
                                            strD2 = jVar2.d("href");
                                        } else if (string5.equalsIgnoreCase("Specials")) {
                                            continue;
                                        }
                                        if (strD2 != null) {
                                            arrayList3.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                                        }
                                    } else if (string5.equalsIgnoreCase("Specials") && num2 != null && num2.intValue() == 0) {
                                        strD2 = jVar2.d("href");
                                        if (strD2 != null && (gVarA2 = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com".concat(strD2))) != null) {
                                            arrayList3.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                                        }
                                    }
                                }
                            }
                            if (strD2 != null) {
                                arrayList3.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                            }
                        }
                    }
                }
                return arrayList3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
    }
}
