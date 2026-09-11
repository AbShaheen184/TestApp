package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.na;
import com.google.android.gms.internal.measurement.oa;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.ta;
import com.google.android.gms.internal.measurement.z9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements b2 {
    public static volatile s1 c0;
    public final g A;
    public final g1 B;
    public final x0 C;
    public final p1 D;
    public final w3 E;
    public final r4 F;
    public final s0 G;
    public final com.google.android.gms.common.util.a H;
    public final f3 I;
    public final v2 J;
    public final b0 K;
    public final y2 L;
    public final String M;
    public r0 N;
    public o3 O;
    public p P;
    public p0 Q;
    public z2 R;
    public Boolean T;
    public long U;
    public volatile Boolean V;
    public volatile boolean W;
    public int X;
    public int Y;
    public final long a0;
    public final long b0;
    public final Context e;
    public final boolean y;
    public final com.google.android.material.shape.g z;
    public boolean S = false;
    public final AtomicInteger Z = new AtomicInteger(0);

    public s1(i2 i2Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = i2Var.a;
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        this.z = gVar;
        g2.n = gVar;
        this.e = context;
        this.y = i2Var.e;
        this.V = i2Var.b;
        this.M = i2Var.h;
        this.W = true;
        if (ra.b == null && context != null) {
            Object obj = ra.a;
            synchronized (obj) {
                try {
                    if (ra.b == null) {
                        synchronized (obj) {
                            try {
                                ha haVar = ra.b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (haVar == null || haVar.a != applicationContext2) {
                                    if (haVar != null) {
                                        Iterator it = ia.a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        ta.a();
                                    }
                                    ra.b = new ha(applicationContext2, com.google.android.material.resources.c.n(new oa(applicationContext2, 2)));
                                    ra.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.H = com.google.android.gms.common.util.a.a;
        z9 z9Var = new z9(context, com.google.android.gms.internal.measurement.e1.a, com.google.android.gms.common.api.b.a, com.google.android.gms.common.api.e.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
        q0VarC.z = new j5(2, strConcat, new String[0]);
        z9Var.b(0, q0VarC.b());
        AtomicReference atomicReference = na.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                na.b();
                com.google.android.gms.internal.measurement.h.h(Level.WARNING, (Executor) na.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = i2Var.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.H.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.a0 = jCurrentTimeMillis;
        Long l2 = i2Var.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.H.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.b0 = jElapsedRealtime;
        g gVar2 = new g(this);
        gVar2.A = com.google.firebase.heartbeatinfo.e.y;
        this.A = gVar2;
        g1 g1Var = new g1(this);
        g1Var.y();
        this.B = g1Var;
        x0 x0Var = new x0(this);
        x0Var.y();
        this.C = x0Var;
        r4 r4Var = new r4(this);
        r4Var.y();
        this.F = r4Var;
        this.G = new s0(new i1(i2Var, this));
        this.K = new b0(this);
        f3 f3Var = new f3(this);
        f3Var.x();
        this.I = f3Var;
        v2 v2Var = new v2(this);
        v2Var.x();
        this.J = v2Var;
        w3 w3Var = new w3(this);
        w3Var.x();
        this.E = w3Var;
        y2 y2Var = new y2(this);
        y2Var.y();
        this.L = y2Var;
        p1 p1Var = new p1(this);
        p1Var.y();
        this.D = p1Var;
        j6 j6Var = i2Var.d;
        boolean z = j6Var == null || j6Var.y == 0;
        if (this.e.getApplicationContext() instanceof Application) {
            l(v2Var);
            if (((s1) v2Var.e).e.getApplicationContext() instanceof Application) {
                Application application = (Application) ((s1) v2Var.e).e.getApplicationContext();
                if (v2Var.z == null) {
                    v2Var.z = new r2(v2Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(v2Var.z);
                    application.registerActivityLifecycleCallbacks(v2Var.z);
                    x0 x0Var2 = ((s1) v2Var.e).C;
                    m(x0Var2);
                    x0Var2.K.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(x0Var);
            x0Var.F.a("Application context is not an Application");
        }
        p1Var.E(new com.google.common.util.concurrent.l0(11, this, i2Var, false));
    }

    public static final void j(d0 d0Var) {
        if (d0Var != null) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Component not created");
    }

    public static final void k(androidx.compose.animation.core.j2 j2Var) {
        if (j2Var != null) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Component not created");
    }

    public static final void l(j0 j0Var) {
        if (j0Var == null) {
            net.luminis.tls.engine.impl.c.r("Component not created");
        } else {
            if (j0Var.y) {
                return;
            }
            net.luminis.tls.engine.impl.c.r("Component not initialized: ".concat(String.valueOf(j0Var.getClass())));
        }
    }

    public static final void m(a2 a2Var) {
        if (a2Var == null) {
            net.luminis.tls.engine.impl.c.r("Component not created");
        } else {
            if (a2Var.y) {
                return;
            }
            net.luminis.tls.engine.impl.c.r("Component not initialized: ".concat(String.valueOf(a2Var.getClass())));
        }
    }

    public static s1 s(Context context, j6 j6Var, Long l, Long l2) {
        Bundle bundle;
        if (j6Var != null) {
            Bundle bundle2 = j6Var.A;
            j6Var = new j6(j6Var.e, j6Var.y, j6Var.z, bundle2, null);
        }
        com.google.android.gms.common.internal.x.g(context);
        com.google.android.gms.common.internal.x.g(context.getApplicationContext());
        if (c0 == null) {
            synchronized (s1.class) {
                try {
                    if (c0 == null) {
                        c0 = new s1(new i2(context, j6Var, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (j6Var != null && (bundle = j6Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.x.g(c0);
            c0.V = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.x.g(c0);
        return c0;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public final com.google.android.material.shape.g a() {
        return this.z;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public final x0 b() {
        x0 x0Var = this.C;
        m(x0Var);
        return x0Var;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public final com.google.android.gms.common.util.a c() {
        return this.H;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public final p1 e() {
        p1 p1Var = this.D;
        m(p1Var);
        return p1Var;
    }

    @Override // com.google.android.gms.measurement.internal.b2
    public final Context f() {
        return this.e;
    }

    public final int g() {
        p1 p1Var = this.D;
        m(p1Var);
        p1Var.v();
        g gVar = this.A;
        if (gVar.J()) {
            return 1;
        }
        m(p1Var);
        p1Var.v();
        if (!this.W) {
            return 8;
        }
        g1 g1Var = this.B;
        k(g1Var);
        g1Var.v();
        Boolean boolValueOf = g1Var.z().contains("measurement_enabled") ? Boolean.valueOf(g1Var.z().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        com.google.android.material.shape.g gVar2 = ((s1) gVar.e).z;
        Boolean boolI = gVar.I("firebase_analytics_collection_enabled");
        if (boolI != null) {
            return boolI.booleanValue() ? 0 : 4;
        }
        return (this.V == null || this.V.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        r4 r4Var;
        boolean z;
        Context context;
        if (!this.S) {
            net.luminis.tls.engine.impl.c.r("AppMeasurement is not initialized");
            return false;
        }
        p1 p1Var = this.D;
        m(p1Var);
        p1Var.v();
        Boolean bool = this.T;
        com.google.android.gms.common.util.a aVar = this.H;
        if (bool == null || this.U == 0) {
            aVar.getClass();
            this.U = SystemClock.elapsedRealtime();
            r4Var = this.F;
            k(r4Var);
            z = false;
            if (r4Var.Z("android.permission.INTERNET") && r4Var.Z("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.e;
                if (com.google.android.gms.common.wrappers.b.a(context).d() || this.A.y() || (r4.r0(context) && r4.Q(context))) {
                    z = true;
                }
            }
            this.T = Boolean.valueOf(z);
            if (z) {
                this.T = Boolean.valueOf(r4Var.B(r().C()));
            }
        } else if (!bool.booleanValue()) {
            aVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.U) > 1000) {
                aVar.getClass();
                this.U = SystemClock.elapsedRealtime();
                r4Var = this.F;
                k(r4Var);
                z = false;
                if (r4Var.Z("android.permission.INTERNET")) {
                    context = this.e;
                    if (com.google.android.gms.common.wrappers.b.a(context).d()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.T = Boolean.valueOf(z);
                if (z) {
                    this.T = Boolean.valueOf(r4Var.B(r().C()));
                }
            }
        }
        return this.T.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i, Throwable th, byte[] bArr) {
        x0 x0Var;
        x0 x0Var2;
        int i2 = i;
        x0 x0Var3 = this.C;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                g1 g1Var = this.B;
                k(g1Var);
                g1Var.Q.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(x0Var3);
                    x0Var3.J.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        m(x0Var3);
                        x0Var3.J.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    r4 r4Var = this.F;
                    k(r4Var);
                    s1 s1Var = (s1) r4Var.e;
                    if (TextUtils.isEmpty(strOptString)) {
                        x0Var2 = x0Var3;
                    } else {
                        Context context = s1Var.e;
                        x0Var2 = x0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.J.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = s1Var.e;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    x0 x0Var4 = ((s1) r4Var.e).C;
                                    m(x0Var4);
                                    x0Var4.C.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            x0Var = x0Var2;
                            m(x0Var);
                            x0Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    m(x0Var2);
                    x0Var = x0Var2;
                    try {
                        x0Var.F.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        m(x0Var);
                        x0Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    x0Var = x0Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                g1 g1Var2 = this.B;
                k(g1Var2);
                g1Var2.Q.b(true);
                if (bArr != null) {
                }
                m(x0Var3);
                x0Var3.J.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(x0Var3);
        x0Var3.F.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final s0 n() {
        return this.G;
    }

    public final r0 o() {
        l(this.N);
        return this.N;
    }

    public final o3 p() {
        l(this.O);
        return this.O;
    }

    public final p q() {
        m(this.P);
        return this.P;
    }

    public final p0 r() {
        l(this.Q);
        return this.Q;
    }
}
