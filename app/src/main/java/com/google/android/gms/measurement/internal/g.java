package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.compose.animation.core.j2 {
    public f A;
    public Boolean B;
    public Boolean y;
    public String z;

    public final int A(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(E(str, h0.g0), 500), 100) : 500, LibretroCore.SCREEN_WIDTH);
    }

    public final void B() {
        ((s1) this.e).getClass();
    }

    public final String C(String str, g0 g0Var) {
        return TextUtils.isEmpty(str) ? (String) g0Var.a(null) : (String) g0Var.a(this.A.d(str, g0Var.a));
    }

    public final long D(String str, g0 g0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) g0Var.a(null)).longValue();
        }
        String strD = this.A.d(str, g0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Long) g0Var.a(null)).longValue();
        }
        try {
            return ((Long) g0Var.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) g0Var.a(null)).longValue();
        }
    }

    public final int E(String str, g0 g0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) g0Var.a(null)).intValue();
        }
        String strD = this.A.d(str, g0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) g0Var.a(null)).intValue();
        }
        try {
            return ((Integer) g0Var.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) g0Var.a(null)).intValue();
        }
    }

    public final double F(String str, g0 g0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) g0Var.a(null)).doubleValue();
        }
        String strD = this.A.d(str, g0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Double) g0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) g0Var.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) g0Var.a(null)).doubleValue();
        }
    }

    public final boolean G(String str, g0 g0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) g0Var.a(null)).booleanValue();
        }
        String strD = this.A.d(str, g0Var.a);
        return TextUtils.isEmpty(strD) ? ((Boolean) g0Var.a(null)).booleanValue() : ((Boolean) g0Var.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    public final Bundle H() {
        s1 s1Var = (s1) this.e;
        try {
            Context context = s1Var.e;
            Context context2 = s1Var.e;
            x0 x0Var = s1Var.C;
            if (context.getPackageManager() == null) {
                s1.m(x0Var);
                x0Var.C.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = com.google.android.gms.common.wrappers.b.a(context2).b(128, context2.getPackageName());
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            s1.m(x0Var);
            x0Var.C.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean I(String str) {
        com.google.android.gms.common.internal.x.d(str);
        Bundle bundleH = H();
        if (bundleH != null) {
            if (bundleH.containsKey(str)) {
                return Boolean.valueOf(bundleH.getBoolean(str));
            }
            return null;
        }
        x0 x0Var = ((s1) this.e).C;
        s1.m(x0Var);
        x0Var.C.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean J() {
        ((s1) this.e).getClass();
        Boolean boolI = I("firebase_analytics_collection_deactivated");
        return boolI != null && boolI.booleanValue();
    }

    public final boolean K() {
        Boolean boolI = I("google_analytics_automatic_screen_reporting_enabled");
        return boolI == null || boolI.booleanValue();
    }

    public final c2 L(String str, boolean z) {
        Object obj;
        com.google.android.gms.common.internal.x.d(str);
        s1 s1Var = (s1) this.e;
        Bundle bundleH = H();
        if (bundleH == null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleH.get(str);
        }
        c2 c2Var = c2.UNINITIALIZED;
        if (obj == null) {
            return c2Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return c2.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return c2.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return c2.POLICY;
        }
        x0 x0Var2 = s1Var.C;
        s1.m(x0Var2);
        x0Var2.F.b(str, "Invalid manifest metadata for");
        return c2Var;
    }

    public final boolean w(String str) {
        s1.k(((s1) this.e).F);
        if (r4.Y((String) h0.g1.a(null), str) || r4.Y((String) h0.h1.a(null), str) || r4.Y((String) h0.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.A.d(str, "gaia_collection_enabled"));
    }

    public final boolean x(String str) {
        return "1".equals(this.A.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean y() {
        if (this.y == null) {
            Boolean boolI = I("app_measurement_lite");
            this.y = boolI;
            if (boolI == null) {
                this.y = Boolean.FALSE;
            }
        }
        return this.y.booleanValue() || !((s1) this.e).y;
    }

    public final String z(String str) {
        s1 s1Var = (s1) this.e;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.x.g(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.C.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.C.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            x0 x0Var3 = s1Var.C;
            s1.m(x0Var3);
            x0Var3.C.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            x0 x0Var4 = s1Var.C;
            s1.m(x0Var4);
            x0Var4.C.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }
}
