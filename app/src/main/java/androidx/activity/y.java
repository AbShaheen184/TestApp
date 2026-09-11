package androidx.activity;

import android.app.Application;
import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.y0;
import androidx.core.view.s0;
import androidx.media3.common.f0;
import androidx.media3.common.k0;
import androidx.media3.common.o0;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import com.app.mlounge.ChqMessagingService;
import com.app.mlounge.MainActivity;
import com.google.common.collect.a1;
import com.google.common.collect.h0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements androidx.activity.result.b, com.google.common.base.t, androidx.media3.common.util.m, androidx.media3.exoplayer.trackselection.l, androidx.media3.extractor.g, androidx.media3.common.util.i, com.google.android.gms.tasks.f, com.google.android.datatransport.runtime.synchronization.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ y(androidx.media3.exoplayer.analytics.a aVar, androidx.media3.exoplayer.source.n nVar, androidx.media3.exoplayer.source.s sVar, IOException iOException, boolean z) {
        this.e = 15;
        this.y = sVar;
    }

    @Override // androidx.media3.exoplayer.trackselection.l
    public a1 a(int i, w0 w0Var, int[] iArr) {
        androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) this.y;
        com.google.common.collect.d0 d0VarK = h0.k();
        for (int i2 = 0; i2 < w0Var.a; i2++) {
            d0VarK.b(new androidx.media3.exoplayer.trackselection.g(i, w0Var, i2, jVar, iArr[i2]));
        }
        return d0VarK.g();
    }

    @Override // androidx.media3.common.util.i
    public void accept(Object obj) {
        switch (this.e) {
            case 21:
                androidx.media3.extractor.text.h hVar = (androidx.media3.extractor.text.h) this.y;
                androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) obj;
                androidx.media3.extractor.text.g gVar = new androidx.media3.extractor.text.g(aVar.b, com.google.firebase.heartbeatinfo.e.l(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j = hVar.j;
                if (j == -9223372036854775807L || aVar.d >= j) {
                    hVar.f(gVar);
                }
                break;
            default:
                ((com.google.common.collect.d0) this.y).b((androidx.media3.extractor.text.a) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        androidx.room.z zVar = (androidx.room.z) this.y;
        int i = ChqMessagingService.E;
        zVar.invoke(obj);
    }

    @Override // androidx.activity.result.b
    public void c(Object obj) {
        int i = this.e;
        Object obj2 = this.y;
        switch (i) {
            case 1:
                ((kotlin.jvm.functions.l) ((y0) obj2).getValue()).invoke(obj);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                Map map = (Map) obj;
                int i2 = MainActivity.G;
                map.getClass();
                Object obj3 = map.get("android.permission.ACCESS_FINE_LOCATION");
                Boolean bool = Boolean.TRUE;
                boolean zA = kotlin.jvm.internal.l.a(obj3, bool);
                boolean zA2 = kotlin.jvm.internal.l.a(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool);
                if ((zA || zA2) && Build.VERSION.SDK_INT >= 29 && org.jsoup.helper.n.e(mainActivity, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    mainActivity.E.a("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                if (!mainActivity.C) {
                    mainActivity.C = true;
                    boolean z = com.app.mlounge.util.c.a;
                    Application application = mainActivity.getApplication();
                    application.getClass();
                    com.app.mlounge.util.c.e(application);
                    break;
                }
                break;
        }
    }

    public androidx.media3.exoplayer.image.f d(c2 c2Var) throws IOException {
        com.google.android.datatransport.cct.b bVar = (com.google.android.datatransport.cct.b) this.y;
        URL url = (URL) c2Var.y;
        String strY = org.jsoup.helper.n.y("CctTransportBackend");
        if (Log.isLoggable(strY, 4)) {
            Log.i(strY, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c2Var.A;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    com.google.android.material.internal.b bVar2 = bVar.a;
                    com.google.android.datatransport.cct.internal.m mVar = (com.google.android.datatransport.cct.internal.m) c2Var.z;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    com.google.firebase.encoders.json.d dVar = (com.google.firebase.encoders.json.d) bVar2.e;
                    com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strY2 = org.jsoup.helper.n.y("CctTransportBackend");
                    if (Log.isLoggable(strY2, 4)) {
                        Log.i(strY2, String.format("Status Code: %d", numValueOf));
                    }
                    org.jsoup.helper.n.k("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    org.jsoup.helper.n.k("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new androidx.media3.exoplayer.image.f(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new androidx.media3.exoplayer.image.f(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            androidx.media3.exoplayer.image.f fVar = new androidx.media3.exoplayer.image.f(responseCode, null, com.google.android.datatransport.cct.internal.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return fVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (com.google.firebase.encoders.b e) {
            e = e;
            org.jsoup.helper.n.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new androidx.media3.exoplayer.image.f(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            org.jsoup.helper.n.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new androidx.media3.exoplayer.image.f(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            org.jsoup.helper.n.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new androidx.media3.exoplayer.image.f(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            org.jsoup.helper.n.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new androidx.media3.exoplayer.image.f(400, null, 0L);
        }
    }

    public void e(long j, androidx.media3.common.util.w wVar) {
        switch (this.e) {
            case 20:
                androidx.media3.extractor.b.c(j, wVar, ((androidx.media3.extractor.mp4.i) this.y).K);
                break;
            case 24:
                androidx.media3.extractor.b.c(j, wVar, ((androidx.media3.extractor.ts.b0) this.y).c);
                break;
            default:
                androidx.media3.extractor.b.d(j, wVar, ((androidx.media3.extractor.ts.b0) this.y).c);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void f() {
        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            androidx.compose.runtime.snapshots.n.h = kotlin.collections.o.V(androidx.compose.runtime.snapshots.n.h, pVar);
        }
    }

    @Override // androidx.media3.extractor.g
    public long g(long j) {
        androidx.media3.extractor.t tVar = (androidx.media3.extractor.t) this.y;
        return j0.k((j * ((long) tVar.e)) / 1000000, 0L, tVar.j - 1);
    }

    @Override // com.google.common.base.t
    public Object get() {
        switch (this.e) {
            case 4:
                return (androidx.media3.exoplayer.g) this.y;
            default:
                return (coil3.memory.c) this.y;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object h() {
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) ((com.appsalt.internal.j0) this.y).i;
        SQLiteDatabase sQLiteDatabaseA = gVar.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar.y.h()).execute();
            sQLiteDatabaseA.setTransactionSuccessful();
            return null;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public boolean i(com.google.firebase.platforminfo.c cVar, int i, Bundle bundle) {
        androidx.core.view.c iVar;
        androidx.appcompat.widget.u uVar = (androidx.appcompat.widget.u) this.y;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((androidx.core.view.inputmethod.g) cVar.e).h();
                Parcelable parcelable = (Parcelable) ((androidx.core.view.inputmethod.g) cVar.e).m();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        androidx.core.view.inputmethod.g gVar = (androidx.core.view.inputmethod.g) cVar.e;
        ClipData clipData = new ClipData(gVar.a(), new ClipData.Item(gVar.g()));
        if (i2 >= 31) {
            iVar = new androidx.compose.ui.scrollcapture.i(clipData, 2);
        } else {
            androidx.core.view.d dVar = new androidx.core.view.d();
            dVar.b = clipData;
            dVar.c = 2;
            iVar = dVar;
        }
        iVar.a(gVar.i());
        iVar.setExtras(bundle);
        return s0.i(uVar, iVar.build()) == null;
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        switch (this.e) {
            case 6:
                ((o0) obj).o((f0) this.y);
                break;
            case 7:
                ((o0) obj).p((androidx.media3.common.a1) this.y);
                break;
            case 8:
                ((o0) obj).r((androidx.media3.common.text.c) this.y);
                break;
            case 9:
                ((o0) obj).o(((androidx.media3.exoplayer.x) this.y).e.S);
                break;
            case 10:
                ((o0) obj).s((androidx.media3.common.h0) this.y);
                break;
            case 11:
                ((o0) obj).w((List) this.y);
                break;
            case 12:
            default:
                androidx.media3.exoplayer.source.s sVar = (androidx.media3.exoplayer.source.s) this.y;
                androidx.media3.exoplayer.analytics.j jVar = (androidx.media3.exoplayer.analytics.j) ((androidx.media3.exoplayer.analytics.b) obj);
                jVar.getClass();
                jVar.w = sVar.a;
                break;
            case 13:
                ((androidx.media3.exoplayer.analytics.j) ((androidx.media3.exoplayer.analytics.b) obj)).o = (k0) this.y;
                break;
            case 14:
                androidx.media3.exoplayer.c cVar = (androidx.media3.exoplayer.c) this.y;
                androidx.media3.exoplayer.analytics.j jVar2 = (androidx.media3.exoplayer.analytics.j) ((androidx.media3.exoplayer.analytics.b) obj);
                jVar2.y += cVar.g;
                jVar2.z += cVar.e;
                break;
        }
    }

    public /* synthetic */ y(androidx.media3.exoplayer.analytics.a aVar, Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public /* synthetic */ y(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
