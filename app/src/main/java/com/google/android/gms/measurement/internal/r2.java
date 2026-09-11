package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int e;
    public final Object y;

    public r2() {
        this.e = 1;
        this.y = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.y;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.g.c().b(com.google.firebase.analytics.connector.a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        com.google.firebase.analytics.connector.b bVar = (com.google.firebase.analytics.connector.b) aVar;
                        if (!com.google.firebase.analytics.connector.internal.a.c.contains("fcm")) {
                            a7 a7Var = bVar.a.a;
                            a7Var.a(new m6(a7Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        bVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            com.google.firebase.messaging.v.g("_no", bundle);
        }
    }

    public void j(l6 l6Var, Bundle bundle) {
        f3 f3Var;
        s1 s1Var;
        Uri uri;
        v2 v2Var = (v2) this.y;
        try {
            try {
                s1 s1Var2 = (s1) v2Var.e;
                x0 x0Var = s1Var2.C;
                s1.m(x0Var);
                x0Var.K.a("onActivityCreated");
                Intent intent = l6Var.z;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        s1.k(s1Var2.F);
                        String str = r4.y0(intent) ? "gs" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        p1 p1Var = s1Var2.D;
                        s1.m(p1Var);
                        p1Var.E(new l2(this, z, uri, str, queryParameter));
                        s1Var = (s1) v2Var.e;
                    }
                    f3Var = s1Var.I;
                }
                s1Var = (s1) v2Var.e;
            } catch (RuntimeException e) {
                x0 x0Var2 = ((s1) v2Var.e).C;
                s1.m(x0Var2);
                x0Var2.C.b(e, "Throwable caught in onActivityCreated");
            }
            f3Var = s1Var.I;
        } finally {
            f3Var = ((s1) v2Var.e).I;
            s1.l(f3Var);
            f3Var.C(l6Var, bundle);
        }
    }

    public void k(l6 l6Var) {
        f3 f3Var = ((s1) ((v2) this.y).e).I;
        s1.l(f3Var);
        synchronized (f3Var.I) {
            try {
                if (Objects.equals(f3Var.D, l6Var)) {
                    f3Var.D = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((s1) f3Var.e).A.K()) {
            f3Var.C.remove(Integer.valueOf(l6Var.e));
        }
    }

    public void l(l6 l6Var) {
        s1 s1Var = (s1) ((v2) this.y).e;
        f3 f3Var = s1Var.I;
        s1.l(f3Var);
        synchronized (f3Var.I) {
            f3Var.H = false;
            f3Var.E = true;
        }
        s1 s1Var2 = (s1) f3Var.e;
        s1Var2.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s1Var2.A.K()) {
            c3 c3VarF = f3Var.F(l6Var);
            f3Var.A = f3Var.z;
            f3Var.z = null;
            p1 p1Var = s1Var2.D;
            s1.m(p1Var);
            p1Var.E(new ad(f3Var, c3VarF, jElapsedRealtime));
        } else {
            f3Var.z = null;
            p1 p1Var2 = s1Var2.D;
            s1.m(p1Var2);
            p1Var2.E(new a0(f3Var, jElapsedRealtime));
        }
        w3 w3Var = s1Var.E;
        s1.l(w3Var);
        s1 s1Var3 = (s1) w3Var.e;
        s1Var3.H.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p1 p1Var3 = s1Var3.D;
        s1.m(p1Var3);
        p1Var3.E(new t3(w3Var, jElapsedRealtime2, 1));
    }

    public void m(l6 l6Var) {
        s1 s1Var = (s1) ((v2) this.y).e;
        w3 w3Var = s1Var.E;
        s1.l(w3Var);
        s1 s1Var2 = (s1) w3Var.e;
        s1Var2.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p1 p1Var = s1Var2.D;
        s1.m(p1Var);
        p1Var.E(new t3(w3Var, jElapsedRealtime, 0));
        f3 f3Var = s1Var.I;
        s1.l(f3Var);
        Object obj = f3Var.I;
        synchronized (obj) {
            try {
                f3Var.H = true;
                if (!Objects.equals(l6Var, f3Var.D)) {
                    synchronized (obj) {
                        f3Var.D = l6Var;
                        f3Var.E = false;
                        s1 s1Var3 = (s1) f3Var.e;
                        if (s1Var3.A.K()) {
                            f3Var.F = null;
                            p1 p1Var2 = s1Var3.D;
                            s1.m(p1Var2);
                            p1Var2.E(new e3(f3Var, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s1 s1Var4 = (s1) f3Var.e;
        if (!s1Var4.A.K()) {
            f3Var.z = f3Var.F;
            p1 p1Var3 = s1Var4.D;
            s1.m(p1Var3);
            p1Var3.E(new e3(f3Var, 0));
            return;
        }
        f3Var.D(l6Var.y, f3Var.F(l6Var), false);
        b0 b0Var = ((s1) f3Var.e).K;
        s1.j(b0Var);
        s1 s1Var5 = (s1) b0Var.e;
        s1Var5.H.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p1 p1Var4 = s1Var5.D;
        s1.m(p1Var4);
        p1Var4.E(new a0(b0Var, jElapsedRealtime2));
    }

    public void n(l6 l6Var, Bundle bundle) {
        c3 c3Var;
        f3 f3Var = ((s1) ((v2) this.y).e).I;
        s1.l(f3Var);
        if (!((s1) f3Var.e).A.K() || bundle == null || (c3Var = (c3) f3Var.C.get(Integer.valueOf(l6Var.e))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c3Var.c);
        bundle2.putString("name", c3Var.a);
        bundle2.putString("referrer_name", c3Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.e) {
            case 0:
                j(l6.d(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new androidx.media3.ui.c0(12, this, intent));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.e) {
            case 0:
                k(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.e) {
            case 0:
                l(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.e) {
            case 0:
                m(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.e) {
            case 0:
                n(l6.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.e;
    }

    public r2(v2 v2Var) {
        this.e = 0;
        this.y = v2Var;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
