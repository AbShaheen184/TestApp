package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.x;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.tasks.q;
import com.google.common.util.concurrent.g0;
import com.google.firebase.components.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final com.google.firebase.g a;
    public final com.google.firebase.installations.remote.c b;
    public final g0 c;
    public final j d;
    public final n e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final com.google.firebase.concurrent.i i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(com.google.firebase.g gVar, com.google.firebase.inject.b bVar, ExecutorService executorService, com.google.firebase.concurrent.i iVar) {
        gVar.a();
        com.google.firebase.installations.remote.c cVar = new com.google.firebase.installations.remote.c(gVar.a, bVar);
        g0 g0Var = new g0(gVar);
        if (c0.G == null) {
            c0.G = new c0(12);
        }
        c0 c0Var = c0.G;
        if (j.c == null) {
            j.c = new j(c0Var);
        }
        j jVar = j.c;
        n nVar = new n(new com.google.firebase.components.d(gVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = g0Var;
        this.d = jVar;
        this.e = nVar;
        this.f = hVar;
        this.h = executorService;
        this.i = iVar;
    }

    public final void a() {
        com.google.firebase.installations.local.b bVarY;
        synchronized (m) {
            try {
                com.google.firebase.g gVar = this.a;
                gVar.a();
                g0 g0VarI = g0.i(gVar.a);
                try {
                    bVarY = this.c.y();
                    int i = bVarY.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(bVarY);
                        g0 g0Var = this.c;
                        com.google.firebase.installations.local.a aVarA = bVarY.a();
                        aVarA.a = strF;
                        aVarA.b = 3;
                        bVarY = aVarA.a();
                        g0Var.t(bVarY);
                    }
                    if (g0VarI != null) {
                        g0VarI.A();
                    }
                } catch (Throwable th) {
                    if (g0VarI != null) {
                        g0VarI.A();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(bVarY);
        this.i.execute(new b(this, 2));
    }

    public final com.google.firebase.installations.local.b b(com.google.firebase.installations.local.b bVar) throws e {
        HttpURLConnection httpURLConnectionC;
        com.google.firebase.installations.remote.b bVarF;
        com.google.firebase.installations.remote.c cVar = this.b;
        com.google.firebase.g gVar = this.a;
        gVar.a();
        String str = gVar.c.a;
        String str2 = bVar.a;
        com.google.firebase.g gVar2 = this.a;
        gVar2.a();
        String str3 = gVar2.c.g;
        String str4 = bVar.d;
        androidx.media3.exoplayer.image.f fVar = cVar.c;
        if (!fVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = com.google.firebase.installations.remote.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    com.google.firebase.installations.remote.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    fVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = com.google.firebase.installations.remote.c.f(httpURLConnectionC);
                        break;
                    }
                    com.google.firebase.installations.remote.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        x xVarA = com.google.firebase.installations.remote.b.a();
                        xVarA.y = 3;
                        bVarF = xVarA.f();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        x xVarA2 = com.google.firebase.installations.remote.b.a();
                        xVarA2.y = 2;
                        bVarF = xVarA2.f();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iE = androidx.constraintlayout.core.g.e(bVarF.c);
        if (iE == 0) {
            String str5 = bVarF.a;
            long j = bVarF.b;
            this.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            com.google.firebase.installations.local.a aVarA = bVar.a();
            aVarA.c = str5;
            aVarA.e = Long.valueOf(j);
            aVarA.f = Long.valueOf(jCurrentTimeMillis);
            return aVarA.a();
        }
        if (iE == 1) {
            com.google.firebase.installations.local.a aVarA2 = bVar.a();
            aVarA2.g = "BAD CONFIG";
            aVarA2.b = 5;
            return aVarA2.a();
        }
        if (iE != 2) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.j = null;
        }
        com.google.firebase.installations.local.a aVarA3 = bVar.a();
        aVarA3.b = 2;
        return aVarA3.a();
    }

    public final q c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return kotlin.math.a.t(str);
        }
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        g gVar = new g(jVar);
        synchronized (this.g) {
            this.l.add(gVar);
        }
        q qVar = jVar.a;
        this.h.execute(new b(this, 0));
        return qVar;
    }

    public final q d() {
        e();
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        f fVar = new f(this.d, jVar);
        synchronized (this.g) {
            this.l.add(fVar);
        }
        q qVar = jVar.a;
        this.h.execute(new b(this, 1));
        return qVar;
    }

    public final void e() {
        com.google.firebase.g gVar = this.a;
        gVar.a();
        com.google.android.gms.common.internal.x.e(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        com.google.android.gms.common.internal.x.e(gVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        com.google.android.gms.common.internal.x.e(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = j.b;
        com.google.android.gms.common.internal.x.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        com.google.android.gms.common.internal.x.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.b.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(com.google.firebase.installations.local.b bVar) {
        com.google.firebase.installations.local.c cVar;
        String string;
        com.google.firebase.g gVar = this.a;
        gVar.a();
        if (!gVar.b.equals("CHIME_ANDROID_SDK")) {
            com.google.firebase.g gVar2 = this.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (bVar.b == 1) {
                    cVar = (com.google.firebase.installations.local.c) this.e.get();
                    synchronized (cVar.a) {
                        try {
                            synchronized (cVar.a) {
                                string = cVar.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = cVar.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return h.a();
                }
            }
        } else if (bVar.b == 1) {
            cVar = (com.google.firebase.installations.local.c) this.e.get();
            synchronized (cVar.a) {
                synchronized (cVar.a) {
                    string = cVar.a.getString("|S|id", null);
                    if (string != null) {
                        string = cVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return h.a();
                }
            }
        }
        this.f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.installations.remote.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.firebase.installations.remote.a] */
    public final com.google.firebase.installations.local.b g(com.google.firebase.installations.local.b bVar) throws e {
        String str = bVar.a;
        String string = null;
        if (str != null && str.length() == 11) {
            com.google.firebase.installations.local.c cVar = (com.google.firebase.installations.local.c) this.e.get();
            synchronized (cVar.a) {
                try {
                    String[] strArr = com.google.firebase.installations.local.c.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = cVar.a.getString("|T|" + cVar.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.firebase.installations.remote.c cVar2 = this.b;
        com.google.firebase.g gVar = this.a;
        gVar.a();
        String str3 = gVar.c.a;
        String str4 = bVar.a;
        com.google.firebase.g gVar2 = this.a;
        gVar2.a();
        String str5 = gVar2.c.g;
        com.google.firebase.g gVar3 = this.a;
        gVar3.a();
        String str6 = gVar3.c.b;
        androidx.media3.exoplayer.image.f fVar = cVar2.c;
        if (!fVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = com.google.firebase.installations.remote.c.a("projects/" + str5 + "/installations");
        int i2 = 0;
        com.google.firebase.installations.remote.a aVar = cVar2;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    com.google.firebase.installations.remote.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    fVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        com.google.firebase.installations.remote.a aVarE = com.google.firebase.installations.remote.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            com.google.firebase.installations.remote.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                com.google.firebase.installations.remote.a aVar2 = new com.google.firebase.installations.remote.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    int iE = androidx.constraintlayout.core.g.e(aVar.e);
                    if (iE != 0) {
                        if (iE != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        com.google.firebase.installations.local.a aVarA = bVar.a();
                        aVarA.g = "BAD CONFIG";
                        aVarA.b = 5;
                        return aVarA.a();
                    }
                    String str7 = aVar.b;
                    String str8 = aVar.c;
                    this.d.a.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    com.google.firebase.installations.remote.b bVar2 = aVar.d;
                    String str9 = bVar2.a;
                    long j = bVar2.b;
                    com.google.firebase.installations.local.a aVarA2 = bVar.a();
                    aVarA2.a = str7;
                    aVarA2.b = 4;
                    aVarA2.c = str9;
                    aVarA2.d = str8;
                    aVarA2.e = Long.valueOf(j);
                    aVarA2.f = Long.valueOf(jCurrentTimeMillis);
                    return aVarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(com.google.firebase.installations.local.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
