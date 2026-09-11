package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.autofill.r;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean b(Context context, int i) {
        if (e(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h hVarA = h.a(context);
                hVarA.getClass();
                if (packageInfo != null) {
                    if (!h.c(packageInfo, false)) {
                        if (h.c(packageInfo, true)) {
                            if (!g.a(hVarA.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        c.booleanValue();
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (d.booleanValue()) {
            return !a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static List d(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean e(int i, Context context, String str) {
        r rVarA = com.google.android.gms.common.wrappers.b.a(context);
        rVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) rVarA.a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
