package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.y4;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements y, com.google.firebase.crashlytics.internal.analytics.a, com.google.firebase.crashlytics.internal.metadata.d, com.google.firebase.crashlytics.internal.settings.b, net.luminis.quic.log.a, okhttp3.internal.platform.android.l {
    public static c0 G;
    public static volatile c0 H;
    public final /* synthetic */ int e;
    public static final /* synthetic */ c0 y = new c0(0);
    public static final /* synthetic */ c0 z = new c0(1);
    public static final /* synthetic */ c0 A = new c0(2);
    public static final /* synthetic */ c0 B = new c0(3);
    public static final /* synthetic */ c0 C = new c0(4);
    public static final /* synthetic */ c0 D = new c0(5);
    public static final /* synthetic */ c0 E = new c0(6);
    public static final /* synthetic */ c0 F = new c0(7);

    public /* synthetic */ c0(int i) {
        this.e = i;
    }

    public static final void m(okio.c cVar) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = okio.c.h;
        if (okio.c.i == null) {
            okio.c.i = new okio.c();
            com.google.android.gms.dynamite.f fVar = new com.google.android.gms.dynamite.f("Okio Watchdog");
            fVar.setDaemon(true);
            fVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = cVar.c;
        boolean z2 = cVar.a;
        if (j != 0 && z2) {
            cVar.g = Math.min(j, cVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            cVar.g = jNanoTime + j;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            cVar.g = cVar.c();
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar2 = okio.c.h;
        int i = lVar2.y + 1;
        lVar2.y = i;
        okio.c[] cVarArr = (okio.c[]) lVar2.z;
        if (i == cVarArr.length) {
            okio.c[] cVarArr2 = new okio.c[i * 2];
            kotlin.collections.n.H(0, 0, 14, cVarArr, cVarArr2);
            lVar2.z = cVarArr2;
        }
        lVar2.f(i, cVar);
        if (cVar.f == 1) {
            okio.c.k.signal();
        }
    }

    public static final boolean n(okio.x xVar) {
        okio.x xVar2 = okio.internal.g.C;
        return !kotlin.text.r.H(xVar.d(), ".class", true);
    }

    public static okio.c o() throws InterruptedException {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = okio.c.h;
        okio.c cVar = ((okio.c[]) lVar.z)[1];
        if (cVar == null) {
            long jNanoTime = System.nanoTime();
            okio.c.k.await(okio.c.l, TimeUnit.MILLISECONDS);
            if (((okio.c[]) lVar.z)[1] != null || System.nanoTime() - jNanoTime < okio.c.m) {
                return null;
            }
            return okio.c.i;
        }
        long jNanoTime2 = cVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            okio.c.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        lVar.n(cVar);
        cVar.e = 2;
        return cVar;
    }

    @Override // com.google.android.gms.measurement.internal.y
    public Object a() {
        switch (this.e) {
            case 0:
                List list = h0.a;
                return (Boolean) y4.a.get();
            case 1:
                List list2 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.s3.b.get();
            case 2:
                List list3 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.t4.a.get();
            case 3:
                List list4 = h0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 4:
                List list5 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.j4.a.get();
            case 5:
                List list6 = h0.a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.a.get();
            case 6:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.y3.a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.n4.a.get()).booleanValue());
        }
    }

    @Override // okhttp3.internal.platform.android.l
    public boolean b(SSLSocket sSLSocket) {
        return kotlin.text.r.O(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public String e() {
        return null;
    }

    @Override // okhttp3.internal.platform.android.l
    public okhttp3.internal.platform.android.n h(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new okhttp3.internal.platform.android.e(superclass);
    }

    @Override // net.luminis.quic.log.a
    public e0 i() {
        return new e0(15);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.b
    public com.google.firebase.crashlytics.internal.settings.a k(f0 f0Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        androidx.compose.animation.core.t2 t2Var = jSONObject.has("session") ? new androidx.compose.animation.core.t2(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new androidx.compose.animation.core.t2(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        androidx.media3.exoplayer.audio.g gVar = new androidx.media3.exoplayer.audio.g(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new com.google.firebase.crashlytics.internal.settings.a(jCurrentTimeMillis, t2Var, gVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void l(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void c() {
    }

    @Override // net.luminis.quic.log.a
    public void j() {
    }

    @Override // net.luminis.quic.log.a
    public void d(String str) {
    }

    @Override // net.luminis.quic.log.a
    public void f(String str, Throwable th) {
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void g(String str, long j) {
    }
}
