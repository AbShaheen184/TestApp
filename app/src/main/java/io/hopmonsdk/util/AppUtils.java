package io.hopmonsdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.gson.b;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class AppUtils {
    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            b.t(e, "Could not get package name: ");
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("context.getPackageName()", 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            b.t(e, "Could not get package name: ");
            return null;
        }
    }
}
