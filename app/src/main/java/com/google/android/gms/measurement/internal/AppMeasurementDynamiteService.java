package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.d6;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.y5;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends y5 {
    public s1 d;
    public final androidx.collection.f e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.e = new androidx.collection.f(0);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void beginAdUnitExposure(String str, long j) {
        g();
        b0 b0Var = this.d.K;
        s1.j(b0Var);
        b0Var.w(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.J(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void clearMeasurementEnabled(long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.w();
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new com.google.common.util.concurrent.l0(14, v2Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void endAdUnitExposure(String str, long j) {
        g();
        b0 b0Var = this.d.K;
        s1.j(b0Var);
        b0Var.x(str, j);
    }

    public final void g() {
        if (this.d != null) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void generateEventId(b6 b6Var) {
        g();
        r4 r4Var = this.d.F;
        s1.k(r4Var);
        long jU0 = r4Var.u0();
        g();
        r4 r4Var2 = this.d.F;
        s1.k(r4Var2);
        r4Var2.k0(b6Var, jU0);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getAppInstanceId(b6 b6Var) {
        g();
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        p1Var.E(new q1(this, b6Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCachedAppInstanceId(b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        h((String) v2Var.D.get(), b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getConditionalUserProperties(String str, String str2, b6 b6Var) {
        g();
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        p1Var.E(new androidx.appcompat.view.menu.e(this, b6Var, str, str2, 6));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCurrentScreenClass(b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        f3 f3Var = ((s1) v2Var.e).I;
        s1.l(f3Var);
        c3 c3Var = f3Var.z;
        h(c3Var != null ? c3Var.b : null, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCurrentScreenName(b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        f3 f3Var = ((s1) v2Var.e).I;
        s1.l(f3Var);
        c3 c3Var = f3Var.z;
        h(c3Var != null ? c3Var.a : null, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getGmpAppId(b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        h(v2Var.K(), b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getMaxUserProperties(String str, b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        com.google.android.gms.common.internal.x.d(str);
        ((s1) v2Var.e).getClass();
        g();
        r4 r4Var = this.d.F;
        s1.k(r4Var);
        r4Var.l0(b6Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getSessionId(b6 b6Var) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new com.google.common.util.concurrent.l0(v2Var, b6Var));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getTestFlag(b6 b6Var, int i) {
        g();
        if (i == 0) {
            r4 r4Var = this.d.F;
            s1.k(r4Var);
            v2 v2Var = this.d.J;
            s1.l(v2Var);
            AtomicReference atomicReference = new AtomicReference();
            p1 p1Var = ((s1) v2Var.e).D;
            s1.m(p1Var);
            r4Var.j0((String) p1Var.F(atomicReference, 15000L, "String test flag value", new o2(v2Var, atomicReference, 1)), b6Var);
            return;
        }
        if (i == 1) {
            r4 r4Var2 = this.d.F;
            s1.k(r4Var2);
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            p1 p1Var2 = ((s1) v2Var2.e).D;
            s1.m(p1Var2);
            r4Var2.k0(b6Var, ((Long) p1Var2.F(atomicReference2, 15000L, "long test flag value", new o2(v2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            r4 r4Var3 = this.d.F;
            s1.k(r4Var3);
            v2 v2Var3 = this.d.J;
            s1.l(v2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            p1 p1Var3 = ((s1) v2Var3.e).D;
            s1.m(p1Var3);
            double dDoubleValue = ((Double) p1Var3.F(atomicReference3, 15000L, "double test flag value", new o2(v2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                b6Var.w(bundle);
                return;
            } catch (RemoteException e) {
                x0 x0Var = ((s1) r4Var3.e).C;
                s1.m(x0Var);
                x0Var.F.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            r4 r4Var4 = this.d.F;
            s1.k(r4Var4);
            v2 v2Var4 = this.d.J;
            s1.l(v2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            p1 p1Var4 = ((s1) v2Var4.e).D;
            s1.m(p1Var4);
            r4Var4.l0(b6Var, ((Integer) p1Var4.F(atomicReference4, 15000L, "int test flag value", new o2(v2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        r4 r4Var5 = this.d.F;
        s1.k(r4Var5);
        v2 v2Var5 = this.d.J;
        s1.l(v2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        p1 p1Var5 = ((s1) v2Var5.e).D;
        s1.m(p1Var5);
        r4Var5.n0(b6Var, ((Boolean) p1Var5.F(atomicReference5, 15000L, "boolean test flag value", new o2(v2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getUserProperties(String str, String str2, boolean z, b6 b6Var) {
        g();
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        p1Var.E(new l2(this, b6Var, str, str2, z));
    }

    public final void h(String str, b6 b6Var) {
        g();
        r4 r4Var = this.d.F;
        s1.k(r4Var);
        r4Var.j0(str, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initForTests(Map map) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initialize(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j) {
        s1 s1Var = this.d;
        if (s1Var == null) {
            Context context = (Context) com.google.android.gms.dynamic.b.I(aVar);
            com.google.android.gms.common.internal.x.g(context);
            this.d = s1.s(context, j6Var, Long.valueOf(j), null);
        } else {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initializeWithElapsedTime(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j, long j2) {
        s1 s1Var = this.d;
        if (s1Var == null) {
            Context context = (Context) com.google.android.gms.dynamic.b.I(aVar);
            com.google.android.gms.common.internal.x.g(context);
            this.d = s1.s(context, j6Var, Long.valueOf(j), Long.valueOf(j2));
        } else {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void isDataCollectionEnabled(b6 b6Var) {
        g();
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        p1Var.E(new q1(this, b6Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.A(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEventAndBundle(String str, String str2, Bundle bundle, b6 b6Var, long j) {
        g();
        com.google.android.gms.common.internal.x.d(str2);
        String str3 = true != this.d.A.G(null, h0.f1) ? "app" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        u uVar = new u(str2, new t(bundle), str3, j, 0L);
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        p1Var.E(new androidx.appcompat.view.menu.e(this, b6Var, uVar, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.A(str, str2, bundle, z, z2, j, j2);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logHealthData(int i, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        g();
        Object objI = aVar == null ? null : com.google.android.gms.dynamic.b.I(aVar);
        Object objI2 = aVar2 == null ? null : com.google.android.gms.dynamic.b.I(aVar2);
        Object objI3 = aVar3 != null ? com.google.android.gms.dynamic.b.I(aVar3) : null;
        x0 x0Var = this.d.C;
        s1.m(x0Var);
        x0Var.E(i, true, false, str, objI, objI2, objI3);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityCreatedByScionActivityInfo(l6.d(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        r2 r2Var = v2Var.z;
        if (r2Var != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
            r2Var.j(l6Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityDestroyedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        r2 r2Var = v2Var.z;
        if (r2Var != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
            r2Var.k(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityPausedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityPausedByScionActivityInfo(l6 l6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        r2 r2Var = v2Var.z;
        if (r2Var != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
            r2Var.l(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityResumedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityResumedByScionActivityInfo(l6 l6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        r2 r2Var = v2Var.z;
        if (r2Var != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
            r2Var.m(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, b6 b6Var, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(l6.d(activity), b6Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, b6 b6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        r2 r2Var = v2Var.z;
        Bundle bundle = new Bundle();
        if (r2Var != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
            r2Var.n(l6Var, bundle);
        }
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            x0 x0Var = this.d.C;
            s1.m(x0Var);
            x0Var.F.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityStartedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStartedByScionActivityInfo(l6 l6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        if (v2Var.z != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityStoppedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStoppedByScionActivityInfo(l6 l6Var, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        if (v2Var.z != null) {
            v2 v2Var2 = this.d.J;
            s1.l(v2Var2);
            v2Var2.O();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void performAction(Bundle bundle, b6 b6Var, long j) {
        g();
        b6Var.w(null);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void registerOnMeasurementEventListener(f6 f6Var) {
        Object s4Var;
        g();
        androidx.collection.f fVar = this.e;
        synchronized (fVar) {
            try {
                s4Var = (h2) fVar.get(Integer.valueOf(f6Var.b()));
                if (s4Var == null) {
                    s4Var = new s4(this, f6Var);
                    fVar.put(Integer.valueOf(f6Var.b()), s4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.w();
        if (v2Var.B.add(s4Var)) {
            return;
        }
        x0 x0Var = ((s1) v2Var.e).C;
        s1.m(x0Var);
        x0Var.F.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    @Deprecated
    public void resetAnalyticsData(long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.D.set(null);
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new m2(v2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.D.set(null);
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new m2(v2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void retrieveAndUploadBatches(d6 d6Var) {
        a3 a3Var;
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.w();
        s1 s1Var = (s1) v2Var.e;
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        if (p1Var.B()) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        p1 p1Var2 = s1Var.D;
        s1.m(p1Var2);
        if (Thread.currentThread() == p1Var2.A) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zQ = com.google.android.material.shape.g.q();
        x0 x0Var3 = s1Var.C;
        if (zQ) {
            s1.m(x0Var3);
            x0Var3.C.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        s1.m(x0Var3);
        x0Var3.K.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            x0 x0Var4 = s1Var.C;
            s1.m(x0Var4);
            x0Var4.K.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            p1 p1Var3 = s1Var.D;
            s1.m(p1Var3);
            p1Var3.F(atomicReference, 10000L, "[sgtm] Getting upload batches", new o2(v2Var, atomicReference, 6, false));
            f4 f4Var = (f4) atomicReference.get();
            if (f4Var == null) {
                break;
            }
            List list = f4Var.e;
            if (list.isEmpty()) {
                break;
            }
            x0 x0Var5 = s1Var.C;
            s1.m(x0Var5);
            x0Var5.K.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                d4 d4Var = (d4) it.next();
                try {
                    URL url = new URI(d4Var.z).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    p0 p0VarR = ((s1) v2Var.e).r();
                    p0VarR.w();
                    com.google.android.gms.common.internal.x.g(p0VarR.D);
                    String str = p0VarR.D;
                    s1 s1Var2 = (s1) v2Var.e;
                    x0 x0Var6 = s1Var2.C;
                    s1.m(x0Var6);
                    v0 v0Var = x0Var6.K;
                    Long lValueOf = Long.valueOf(d4Var.e);
                    v0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, d4Var.z, Integer.valueOf(d4Var.y.length));
                    if (!TextUtils.isEmpty(d4Var.D)) {
                        x0 x0Var7 = s1Var2.C;
                        s1.m(x0Var7);
                        x0Var7.K.c(lValueOf, d4Var.D, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = d4Var.A;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    y2 y2Var = s1Var2.L;
                    s1.m(y2Var);
                    byte[] bArr = d4Var.y;
                    com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(10, v2Var, atomicReference2, d4Var);
                    y2Var.x();
                    com.google.android.gms.common.internal.x.g(url);
                    com.google.android.gms.common.internal.x.g(bArr);
                    p1 p1Var4 = ((s1) y2Var.e).D;
                    s1.m(p1Var4);
                    p1Var4.H(new a1(y2Var, str, url, bArr, map, cVar));
                    try {
                        r4 r4Var = s1Var2.F;
                        s1.k(r4Var);
                        s1 s1Var3 = (s1) r4Var.e;
                        s1Var3.H.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    s1Var3.H.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        x0 x0Var8 = ((s1) v2Var.e).C;
                        s1.m(x0Var8);
                        x0Var8.F.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    a3Var = atomicReference2.get() == null ? a3.UNKNOWN : (a3) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    x0 x0Var9 = ((s1) v2Var.e).C;
                    s1.m(x0Var9);
                    x0Var9.C.d("[sgtm] Bad upload url for row_id", d4Var.z, Long.valueOf(d4Var.e), e);
                    a3Var = a3.FAILURE;
                }
                if (a3Var != a3.SUCCESS) {
                    if (a3Var == a3.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        x0 x0Var10 = s1Var.C;
        s1.m(x0Var10);
        x0Var10.K.c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            d6Var.c();
        } catch (RemoteException e2) {
            s1 s1Var4 = this.d;
            com.google.android.gms.common.internal.x.g(s1Var4);
            x0 x0Var11 = s1Var4.C;
            s1.m(x0Var11);
            x0Var11.F.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConditionalUserProperty(Bundle bundle, long j) {
        g();
        s1 s1Var = this.d;
        if (bundle == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Conditional user property must not be null");
        } else {
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.I(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConsentThirdParty(Bundle bundle, long j) throws Throwable {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.P(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j) {
        g();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.I(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        setCurrentScreenByScionActivityInfo(l6.d(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r3 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6 r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setDataCollectionEnabled(boolean z) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.w();
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new androidx.media3.ui.b(v2Var, z));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new p2(v2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setEventInterceptor(f6 f6Var) {
        g();
        coil3.memory.c cVar = new coil3.memory.c(26, this, f6Var, false);
        p1 p1Var = this.d.D;
        s1.m(p1Var);
        boolean zB = p1Var.B();
        s1 s1Var = this.d;
        if (!zB) {
            p1 p1Var2 = s1Var.D;
            s1.m(p1Var2);
            p1Var2.E(new com.google.common.util.concurrent.l0(16, this, cVar, false));
            return;
        }
        v2 v2Var = s1Var.J;
        s1.l(v2Var);
        v2Var.v();
        v2Var.w();
        coil3.memory.c cVar2 = v2Var.A;
        if (cVar != cVar2) {
            com.google.android.gms.common.internal.x.i("EventInterceptor already set.", cVar2 == null);
        }
        v2Var.A = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setInstanceIdProvider(i6 i6Var) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setMeasurementEnabled(boolean z, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        v2Var.w();
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new com.google.common.util.concurrent.l0(14, v2Var, boolValueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setMinimumSessionDuration(long j) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setSessionTimeoutDuration(long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        p1 p1Var = ((s1) v2Var.e).D;
        s1.m(p1Var);
        p1Var.E(new m2(v2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setSgtmDebugInfo(Intent intent) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        s1 s1Var = (s1) v2Var.e;
        Uri data = intent.getData();
        if (data == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.I.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.I.a("[sgtm] Preview Mode was not enabled.");
            s1Var.A.z = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        x0 x0Var3 = s1Var.C;
        s1.m(x0Var3);
        x0Var3.I.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        s1Var.A.z = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setUserId(String str, long j) {
        g();
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        s1 s1Var = (s1) v2Var.e;
        if (str != null && TextUtils.isEmpty(str)) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.a("User ID must be non-empty or null");
        } else {
            p1 p1Var = s1Var.D;
            s1.m(p1Var);
            p1Var.E(new com.google.common.util.concurrent.l0(17, v2Var, str));
            v2Var.F(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j) {
        g();
        Object objI = com.google.android.gms.dynamic.b.I(aVar);
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.F(str, str2, objI, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void unregisterOnMeasurementEventListener(f6 f6Var) {
        Object s4Var;
        g();
        androidx.collection.f fVar = this.e;
        synchronized (fVar) {
            s4Var = (h2) fVar.remove(Integer.valueOf(f6Var.b()));
        }
        if (s4Var == null) {
            s4Var = new s4(this, f6Var);
        }
        v2 v2Var = this.d.J;
        s1.l(v2Var);
        v2Var.w();
        if (v2Var.B.remove(s4Var)) {
            return;
        }
        x0 x0Var = ((s1) v2Var.e).C;
        s1.m(x0Var);
        x0Var.F.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConsent(Bundle bundle, long j) {
    }
}
