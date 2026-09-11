package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.measurement.internal.w2;
import com.google.firebase.g;
import com.google.firebase.installations.c;
import com.google.firebase.installations.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final a7 a;

    public FirebaseAnalytics(a7 a7Var) {
        x.g(a7Var);
        this.a = a7Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(a7.c(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Keep
    public static w2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        a7 a7VarC = a7.c(context, bundle);
        if (a7VarC == null) {
            return null;
        }
        return new a(a7VarC);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = c.m;
            return (String) kotlin.math.a.g(((c) g.c().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        l6 l6VarD = l6.d(activity);
        a7 a7Var = this.a;
        a7Var.getClass();
        a7Var.a(new o6(a7Var, l6VarD, str, str2));
    }
}
