package androidx.room.coroutines;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.q2;
import androidx.collection.b1;
import androidx.compose.runtime.d1;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.data.anime.AnikotoScraper;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.screens.player.j0;
import com.app.mlounge.ui.viewmodel.y0;
import com.caverock.androidsvg.i2;
import com.caverock.androidsvg.s0;
import com.google.android.gms.measurement.internal.f0;
import com.google.firebase.sessions.k1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.internal.m0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ d(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:151:0x030a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0332  */
    /* JADX WARN: Code duplicated, block: B:156:0x034b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0350  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Throwable {
        int largeMemoryClass;
        Throwable th;
        coil3.memory.c cVarA;
        float f;
        float f2;
        s0 s0Var;
        s0 s0Var2;
        String str;
        coil3.k gVar;
        float fMax;
        int iF0;
        kotlin.k kVar;
        kotlin.k kVar2;
        int i = this.e;
        int i2 = 0;
        kotlin.y yVar = kotlin.y.a;
        Object obj = this.y;
        switch (i) {
            case 0:
                return ((androidx.media3.common.util.b) obj).t(":memory:");
            case 1:
                s sVar = (s) obj;
                return sVar.e.t(sVar.y);
            case 2:
                androidx.savedstate.g gVar2 = (androidx.savedstate.g) obj;
                gVar2.getLifecycle().a(new androidx.savedstate.b(gVar2, i2));
                return yVar;
            case 3:
                androidx.sqlite.db.framework.g gVar3 = (androidx.sqlite.db.framework.g) obj;
                Context context = gVar3.e;
                String str2 = gVar3.y;
                androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c();
                cVar.e = null;
                androidx.sqlite.db.framework.f fVar = new androidx.sqlite.db.framework.f(context, str2, cVar, gVar3.z);
                fVar.setWriteAheadLoggingEnabled(gVar3.B);
                return fVar;
            case 4:
                return com.google.common.base.c.p((kotlin.k) obj);
            case 5:
                Context context2 = (Context) ((q2) obj).a;
                double d = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    net.luminis.tls.engine.impl.c.o("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(7, (byte) 0);
                try {
                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = LibretroCore.SCREEN_WIDTH;
                }
                return new coil3.memory.d(new androidx.compose.ui.input.pointer.util.b((long) (d * ((long) largeMemoryClass) * 1048576), lVar), lVar);
            case 6:
                return coil3.decode.e.b((coil3.decode.e) obj);
            case 7:
                return (coil3.disk.g) ((coil3.q) obj).a.e.getValue();
            case 8:
                return new coil3.network.okhttp.internal.b((okhttp3.y) ((d) obj).invoke());
            case 9:
                coil3.svg.f fVar2 = (coil3.svg.f) obj;
                coil3.decode.q qVar = fVar2.a;
                boolean z = fVar2.f;
                coil3.request.n nVar = fVar2.b;
                okio.h hVarP = qVar.P();
                try {
                    cVarA = fVar2.c.a(hVarP);
                    try {
                        hVarP.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        hVarP.close();
                    } catch (Throwable th4) {
                        kotlin.a.a(th3, th4);
                    }
                    th = th3;
                    cVarA = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                c2 c2Var = (c2) cVarA.y;
                s0 s0Var3 = (s0) c2Var.y;
                if (s0Var3 != null) {
                    androidx.compose.ui.geometry.a aVar = s0Var3.o;
                    RectF rectF = aVar == null ? null : new RectF(aVar.b, aVar.c, aVar.c(), aVar.d());
                    coil3.svg.d dVar = rectF != null ? new coil3.svg.d(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (fVar2.e && dVar != null) {
                        f = dVar.c - dVar.a;
                        f2 = dVar.d - dVar.b;
                    } else if (((s0) c2Var.y) != null) {
                        f = c2Var.C().d;
                        if (((s0) c2Var.y) != null) {
                            f2 = c2Var.C().e;
                        } else {
                            net.luminis.tls.engine.impl.c.o("SVG document is empty");
                        }
                    } else {
                        net.luminis.tls.engine.impl.c.o("SVG document is empty");
                    }
                    coil3.size.h hVar = nVar.b;
                    coil3.size.g gVar4 = nVar.c;
                    if (kotlin.jvm.internal.l.a(hVar, coil3.size.h.c)) {
                        float fFloatValue = ((Number) fVar2.d.invoke(nVar.a)).floatValue();
                        if (f > 0.0f) {
                            f *= fFloatValue;
                        }
                        if (f2 > 0.0f) {
                            f2 *= fFloatValue;
                        }
                    }
                    int iF = f > 0.0f ? kotlin.math.a.F(f) : 512;
                    int iF2 = f2 > 0.0f ? kotlin.math.a.F(f2) : 512;
                    coil3.size.h hVar2 = nVar.b;
                    coil3.i iVar = coil3.request.h.b;
                    long j = okhttp3.internal.platform.android.g.j(iF, iF2, hVar2, gVar4, (coil3.size.h) coil3.m.e(nVar, iVar));
                    int i3 = (int) (j >> 32);
                    int i4 = (int) (j & 4294967295L);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        s0Var = (s0) c2Var.y;
                        if (s0Var != null) {
                            s0Var.r = i2.s("100%");
                            s0Var2 = (s0) c2Var.y;
                            if (s0Var2 != null) {
                                s0Var2.s = i2.s("100%");
                                str = (String) coil3.m.e(nVar, coil3.svg.b.a);
                                if (str != null) {
                                    coil3.memory.c cVar2 = new coil3.memory.c(12);
                                    androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(2);
                                    com.caverock.androidsvg.c cVar3 = new com.caverock.androidsvg.c(str);
                                    cVar3.R();
                                    cVar2.y = eVar.e(cVar3);
                                    cVarA.z = cVar2;
                                }
                                gVar = new coil3.svg.g(c2Var, (coil3.memory.c) cVarA.z, i3, i4);
                                if (z) {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    gVar.d(new Canvas(bitmapCreateBitmap));
                                    gVar = new coil3.a(bitmapCreateBitmap);
                                }
                                return new coil3.decode.i(gVar, z);
                            }
                            net.luminis.tls.engine.impl.c.o("SVG document is empty");
                        } else {
                            net.luminis.tls.engine.impl.c.o("SVG document is empty");
                        }
                    } else {
                        coil3.size.h hVar3 = (coil3.size.h) coil3.m.e(nVar, iVar);
                        float f3 = i3 / f;
                        float f4 = i4 / f2;
                        int iOrdinal = gVar4.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f3, f4);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f3, f4);
                        } else {
                            coil3.g.a();
                        }
                        coil3.size.c cVar4 = hVar3.a;
                        if (cVar4 instanceof coil3.size.a) {
                            float f5 = ((coil3.size.a) cVar4).a / f;
                            if (fMax > f5) {
                                fMax = f5;
                            }
                        }
                        coil3.size.c cVar5 = hVar3.b;
                        if (cVar5 instanceof coil3.size.a) {
                            float f6 = ((coil3.size.a) cVar5).a / f2;
                            if (fMax > f6) {
                                fMax = f6;
                            }
                        }
                        int i5 = (int) (fMax * f);
                        int i6 = (int) (fMax * f2);
                        if (dVar == null) {
                            float f7 = f - 0.0f;
                            float f8 = f2 - 0.0f;
                            s0 s0Var4 = (s0) c2Var.y;
                            if (s0Var4 != null) {
                                s0Var4.o = new androidx.compose.ui.geometry.a(0.0f, 0.0f, f7, f8);
                            } else {
                                net.luminis.tls.engine.impl.c.o("SVG document is empty");
                            }
                        }
                        i4 = i6;
                        i3 = i5;
                        s0Var = (s0) c2Var.y;
                        if (s0Var != null) {
                            s0Var.r = i2.s("100%");
                            s0Var2 = (s0) c2Var.y;
                            if (s0Var2 != null) {
                                s0Var2.s = i2.s("100%");
                                str = (String) coil3.m.e(nVar, coil3.svg.b.a);
                                if (str != null) {
                                    coil3.memory.c cVar6 = new coil3.memory.c(12);
                                    androidx.media3.common.audio.e eVar2 = new androidx.media3.common.audio.e(2);
                                    com.caverock.androidsvg.c cVar7 = new com.caverock.androidsvg.c(str);
                                    cVar7.R();
                                    cVar6.y = eVar2.e(cVar7);
                                    cVarA.z = cVar6;
                                }
                                gVar = new coil3.svg.g(c2Var, (coil3.memory.c) cVarA.z, i3, i4);
                                if (z) {
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    gVar.d(new Canvas(bitmapCreateBitmap2));
                                    gVar = new coil3.a(bitmapCreateBitmap2);
                                }
                                return new coil3.decode.i(gVar, z);
                            }
                            net.luminis.tls.engine.impl.c.o("SVG document is empty");
                        } else {
                            net.luminis.tls.engine.impl.c.o("SVG document is empty");
                        }
                    }
                } else {
                    net.luminis.tls.engine.impl.c.o("SVG document is empty");
                }
                return null;
            case 10:
                okhttp3.y yVar2 = ((CinemaHQApp) obj).B;
                if (yVar2 != null) {
                    return yVar2;
                }
                kotlin.jvm.internal.l.f("imageHttpClient");
                throw null;
            case 11:
                return AnikotoScraper.watchClient_delegate$lambda$0((AnikotoScraper) obj);
            case 12:
                return ((y1) obj).a.getSharedPreferences("emu_prefs", 0);
            case 13:
                return Float.valueOf(((d1) obj).g());
            case 14:
                ((com.app.mlounge.ui.viewmodel.c) obj).e();
                return yVar;
            case 15:
                return Float.valueOf(((com.app.mlounge.data.local.entity.a) obj).k / 100.0f);
            case 16:
                MutableStateFlow mutableStateFlow = ((com.app.mlounge.ui.viewmodel.s) obj).G;
                mutableStateFlow.setValue(Boolean.valueOf(true ^ ((Boolean) mutableStateFlow.getValue()).booleanValue()));
                return yVar;
            case 17:
                ((y0) obj).n("");
                return yVar;
            case 18:
                return new com.google.accompanist.drawablepainter.a((com.google.accompanist.drawablepainter.b) obj);
            case 19:
                ((k1) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 20:
                return new b1((Object[]) obj);
            case 21:
                return obj;
            case 22:
                kotlinx.serialization.descriptors.f fVar3 = (kotlinx.serialization.descriptors.f) obj;
                return Integer.valueOf(m0.d(fVar3, fVar3.j));
            case 23:
                return (List) obj;
            case 24:
                okhttp3.internal.http2.o oVar = (okhttp3.internal.http2.o) obj;
                oVar.getClass();
                try {
                    oVar.U.L(2, 0, false);
                    break;
                } catch (IOException e) {
                    okhttp3.internal.http2.b bVar = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                    oVar.a(bVar, bVar, e);
                }
                return yVar;
            case 25:
                okhttp3.internal.e.b((okhttp3.internal.ws.h) obj);
                return yVar;
            case 26:
                okhttp3.internal.e.b((Closeable) ((kotlin.jvm.internal.z) obj).e);
                return yVar;
            case 27:
                okhttp3.internal.connection.m mVar = ((okhttp3.internal.ws.e) obj).h;
                mVar.getClass();
                mVar.cancel();
                return yVar;
            default:
                okio.internal.g gVar5 = (okio.internal.g) obj;
                ClassLoader classLoader = gVar5.z;
                okio.k kVar3 = gVar5.A;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (kotlin.jvm.internal.l.a(url.getProtocol(), "file")) {
                        String str3 = okio.x.y;
                        kVar2 = new kotlin.k(kVar3, f0.j(new File(url.toURI())));
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        arrayList.add(kVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (kotlin.text.r.O(string2, "jar:file:", false) && (iF0 = kotlin.text.k.f0(string2, 6, "!")) != -1) {
                        String str4 = okio.x.y;
                        kVar = new kotlin.k(okio.internal.b.e(f0.j(new File(URI.create(string2.substring(4, iF0)))), kVar3, new j0(29)), okio.internal.g.C);
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        arrayList2.add(kVar);
                    }
                }
                return kotlin.collections.o.X(arrayList, arrayList2);
        }
    }
}
