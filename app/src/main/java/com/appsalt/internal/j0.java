package com.appsalt.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.appsalt.internal.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void d(JSONObject jSONObject, String str) {
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
        sbN.append(jSONObject.toString());
        String string = sbN.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a a(int i) {
        com.google.firebase.crashlytics.internal.settings.a aVar = null;
        try {
            if (!androidx.constraintlayout.core.g.b(2, i)) {
                JSONObject jSONObjectJ = ((com.google.android.material.shape.c0) this.e).j();
                if (jSONObjectJ != null) {
                    com.google.firebase.crashlytics.internal.settings.a aVarI = ((com.google.android.material.shape.c0) this.c).i(jSONObjectJ);
                    d(jSONObjectJ, "Loaded cached settings: ");
                    ((com.google.android.gms.measurement.internal.f0) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (androidx.constraintlayout.core.g.b(3, i) || aVarI.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarI;
                        } catch (Exception e) {
                            e = e;
                            aVar = aVarI;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a b() {
        return (com.google.firebase.crashlytics.internal.settings.a) ((AtomicReference) this.h).get();
    }

    public void c(com.google.android.datatransport.runtime.i iVar, int i) {
        byte[] bArr;
        long j;
        com.google.android.datatransport.runtime.backends.a aVar;
        String str;
        com.google.android.datatransport.runtime.backends.a aVar2;
        int i2;
        androidx.media3.exoplayer.image.f fVarD;
        String str2;
        Integer numValueOf;
        j0 j0Var;
        final j0 j0Var2 = this;
        final com.google.android.datatransport.runtime.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var2.f;
        com.google.android.datatransport.runtime.backends.h hVarA = ((com.google.android.datatransport.runtime.backends.f) j0Var2.b).a(iVar2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) gVar.L(new com.google.android.datatransport.runtime.synchronization.b(j0Var2) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                public final /* synthetic */ j0 y;

                {
                    this.y = j0Var2;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.b
                public final Object h() {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            com.google.android.datatransport.runtime.i iVar3 = iVar2;
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            SQLiteDatabase sQLiteDatabaseA = gVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lG = com.google.android.datatransport.runtime.scheduling.persistence.g.g(sQLiteDatabaseA, iVar3);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            gVar3.getClass();
                            return (Iterable) gVar3.m(new androidx.media3.exoplayer.analytics.c(7, gVar3, iVar2));
                    }
                }
            })).booleanValue()) {
                gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.i(jMax, j0Var2, iVar2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) gVar.L(new com.google.android.datatransport.runtime.synchronization.b(j0Var2) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                public final /* synthetic */ j0 y;

                {
                    this.y = j0Var2;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.b
                public final Object h() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            com.google.android.datatransport.runtime.i iVar3 = iVar2;
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            SQLiteDatabase sQLiteDatabaseA = gVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lG = com.google.android.datatransport.runtime.scheduling.persistence.g.g(sQLiteDatabaseA, iVar3);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            gVar3.getClass();
                            return (Iterable) gVar3.m(new androidx.media3.exoplayer.analytics.c(7, gVar3, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (hVarA == null) {
                org.jsoup.helper.n.k("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar2 = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<com.google.android.datatransport.runtime.h> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.b) it.next()).c);
                }
                if (bArr2 != null) {
                    com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var2.i;
                    Objects.requireNonNull(gVar2);
                    com.google.android.datatransport.runtime.firebase.transport.a aVar3 = (com.google.android.datatransport.runtime.firebase.transport.a) gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.f(gVar2, i3));
                    androidx.compose.ui.node.a1 a1Var = new androidx.compose.ui.node.a1();
                    a1Var.g = new HashMap();
                    a1Var.e = Long.valueOf(((com.google.android.datatransport.runtime.time.a) j0Var2.g).h());
                    a1Var.f = Long.valueOf(((com.google.android.datatransport.runtime.time.a) j0Var2.h).h());
                    a1Var.b = "GDT_CLIENT_METRICS";
                    com.google.android.datatransport.c cVar = new com.google.android.datatransport.c("proto");
                    aVar3.getClass();
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = com.google.android.datatransport.runtime.n.a;
                    cVar2.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar2.o(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    a1Var.d = new com.google.android.datatransport.runtime.k(cVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((com.google.android.datatransport.cct.b) hVarA).a(a1Var.c()));
                }
                com.google.android.datatransport.cct.b bVar = (com.google.android.datatransport.cct.b) hVarA;
                HashMap map = new HashMap();
                for (com.google.android.datatransport.runtime.h hVar : arrayList) {
                    String str3 = hVar.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    com.google.android.datatransport.runtime.h hVar2 = (com.google.android.datatransport.runtime.h) ((List) entry.getValue()).get(0);
                    com.google.android.datatransport.cct.internal.j0 j0Var3 = com.google.android.datatransport.cct.internal.j0.e;
                    long jH = bVar.f.h();
                    long jH2 = bVar.e.h();
                    com.google.android.datatransport.cct.internal.n nVar = new com.google.android.datatransport.cct.internal.n(new com.google.android.datatransport.cct.internal.l(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (com.google.android.datatransport.runtime.h hVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        com.google.android.datatransport.runtime.k kVar = hVar3.c;
                        byte[] bArr4 = hVar3.j;
                        com.google.android.datatransport.c cVar3 = kVar.a;
                        byte[] bArr5 = kVar.b;
                        long j2 = jMax;
                        if (cVar3.equals(new com.google.android.datatransport.c("proto"))) {
                            j0Var = new j0();
                            j0Var.e = bArr5;
                        } else {
                            if (cVar3.equals(new com.google.android.datatransport.c("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                j0 j0Var4 = new j0();
                                j0Var4.f = str4;
                                j0Var = j0Var4;
                            } else {
                                String strY = org.jsoup.helper.n.y("CctTransportBackend");
                                if (Log.isLoggable(strY, 5)) {
                                    Log.w(strY, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        j0Var.a = Long.valueOf(hVar3.d);
                        j0Var.d = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        j0Var.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        j0Var.h = new com.google.android.datatransport.cct.internal.v((com.google.android.datatransport.cct.internal.h0) com.google.android.datatransport.cct.internal.h0.e.get(hVar3.b("net-type")), (com.google.android.datatransport.cct.internal.g0) com.google.android.datatransport.cct.internal.g0.e.get(hVar3.b("mobile-subtype")));
                        Integer num = hVar3.b;
                        if (num != null) {
                            j0Var.b = num;
                        }
                        Integer num2 = hVar3.g;
                        if (num2 != null) {
                            com.google.android.datatransport.cct.internal.r rVar = new com.google.android.datatransport.cct.internal.r(new com.google.android.datatransport.cct.internal.q(num2));
                            com.google.android.datatransport.cct.internal.z zVar = com.google.android.datatransport.cct.internal.z.e;
                            j0Var.c = new com.google.android.datatransport.cct.internal.o(rVar);
                        }
                        byte[] bArr6 = hVar3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            j0Var.i = new com.google.android.datatransport.cct.internal.p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat = ((Long) j0Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) j0Var.d) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) j0Var.g) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            net.luminis.tls.engine.impl.c.r("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new com.google.android.datatransport.cct.internal.s(((Long) j0Var.a).longValue(), (Integer) j0Var.b, (com.google.android.datatransport.cct.internal.o) j0Var.c, ((Long) j0Var.d).longValue(), (byte[]) j0Var.e, (String) j0Var.f, ((Long) j0Var.g).longValue(), (com.google.android.datatransport.cct.internal.v) j0Var.h, (com.google.android.datatransport.cct.internal.p) j0Var.i));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new com.google.android.datatransport.cct.internal.t(jH, jH2, nVar, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                com.google.android.datatransport.cct.internal.m mVar = new com.google.android.datatransport.cct.internal.m(arrayList3);
                URL urlB = bVar.d;
                if (bArr != null) {
                    try {
                        com.google.android.datatransport.cct.a aVarA = com.google.android.datatransport.cct.a.a(bArr);
                        str = aVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.a;
                        if (str6 != null) {
                            urlB = com.google.android.datatransport.cct.b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i5 = 27;
                    androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(i5, urlB, mVar, str);
                    androidx.activity.y yVar = new androidx.activity.y(bVar, 28);
                    int i6 = 5;
                    do {
                        fVarD = yVar.d(c2Var);
                        URL url = (URL) fVarD.d;
                        if (url != null) {
                            org.jsoup.helper.n.k("CctTransportBackend", "Following redirect to: %s", url);
                            c2Var = new androidx.appcompat.widget.c2(i5, url, (com.google.android.datatransport.cct.internal.m) c2Var.z, (String) c2Var.A);
                        } else {
                            c2Var = null;
                        }
                        if (c2Var == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = fVarD.b;
                    if (i7 == 200) {
                        aVar2 = new com.google.android.datatransport.runtime.backends.a(1, fVarD.c);
                    } else {
                        if (i7 >= 500 || i7 == 404) {
                            aVar = new com.google.android.datatransport.runtime.backends.a(2, -1L);
                        } else if (i7 == 400) {
                            try {
                                aVar = new com.google.android.datatransport.runtime.backends.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                org.jsoup.helper.n.l("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                aVar2 = new com.google.android.datatransport.runtime.backends.a(2, -1L);
                            }
                        } else {
                            aVar = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i8 = aVar2.a;
            if (i8 == i2) {
                gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(this, iterable, iVar, j));
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.c) this.d).t(iVar, i + 1, true);
                return;
            }
            j0Var2 = this;
            iVar2 = iVar;
            long j3 = j;
            gVar.L(new androidx.media3.exoplayer.analytics.c(5, j0Var2, iterable));
            if (i8 == 1) {
                jMax = Math.max(j3, aVar2.b);
                if (bArr != null) {
                    gVar.L(new androidx.activity.y(j0Var2, 29));
                }
            } else {
                if (i8 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((com.google.android.datatransport.runtime.scheduling.persistence.b) it2.next()).c.a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    gVar.L(new androidx.media3.exoplayer.analytics.c(6, j0Var2, map2));
                }
                jMax = j3;
            }
            bArr2 = bArr;
        }
    }
}
