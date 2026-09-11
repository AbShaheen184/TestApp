package io.hopmonsdk.util;

import android.util.Log;
import io.hopmonsdk.Hopmn;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class LogUtils {
    private LogUtils() {
    }

    public static void d(String str, String str2, Throwable th, Object... objArr) {
        if (isLoggable(str, 3)) {
            Log.d(str, String.format(str2, objArr), th);
        }
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        if (isLoggable(str, 6)) {
            Log.e(str, String.format(str2, objArr), th);
        }
    }

    public static void i(String str, String str2, Throwable th, Object... objArr) {
        if (isLoggable(str, 4)) {
            Log.i(str, String.format(str2, objArr), th);
        }
    }

    public static boolean isDebug(String str) {
        return isLoggable(str, 3);
    }

    public static boolean isInfo(String str) {
        return isLoggable(str, 4);
    }

    public static boolean isLoggable(String str, int i) {
        try {
            Hopmn hopmn = Hopmn.getInstance(true);
            if (hopmn == null || !hopmn.isLoggable()) {
                if (!Log.isLoggable(str, i)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.e(str, "Failed to getInstance on MoneytiserService onCreate: ", e);
            return false;
        }
    }

    public static void v(String str, String str2) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        if (isLoggable(str, 5)) {
            Log.w(str, String.format(str2, objArr), th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            Log.d(str, String.format(str2, objArr));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, String.format(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (isLoggable(str, 4)) {
            Log.i(str, String.format(str2, objArr));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (isLoggable(str, 5)) {
            Log.w(str, String.format(str2, objArr));
        }
    }
}
